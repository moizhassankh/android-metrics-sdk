package ai.benshi.metrics

import ai.benshi.NetworkConnection
import ai.benshi.PromotedApiRequest
import com.google.protobuf.Message
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Allows you to log [Message]s in a batch fashion, making use of the provided flush interval to
 * determine when to flush the batch of logs.
 *
 * Logs will be sent using [PromotedApiRequest] + [NetworkConnection], and that request will be
 * executed using Kotlin coroutines, on the IO dispatcher.
 *
 * This class should be retained as a singleton to ensure all log messages are being placed onto
 * a single batch.
 */
internal class MetricsLogger(
    flushIntervalMillis: Long,
) {
    private val networkConnectionScope = CoroutineScope(context = Dispatchers.IO)

    private var logMessages = mutableListOf<Message>()

    /**
     * Enqueue this message. If there is not a current batch scheduled to be sent, this will start
     * a new one. Otherwise, it will be added to the batch and be sent when the flush interval is
     * reached.
     */
    fun enqueueMessage(message: Message) {
        logMessages.add(message)
    }

    /**
     * Cancel the batch that is scheduled to be sent and discard the log messages from that batch.
     */
    fun cancelAndDiscardPendingQueue() {
        logMessages.clear()
    }

    /**
     * Cancel the scheduled send operation and instead send the batch right now.
     */
    fun cancelAndSendPendingQueue() {
        sendCurrentMessages()
    }

    private fun sendCurrentMessages() {
        val logMessagesCopy = logMessages
        logMessages = mutableListOf()


        trySend(logMessagesCopy, null)
    }

    @Suppress("TooGenericExceptionCaught")
    private fun trySend(
        // For telemetry
        originalMessages: List<Message>,
        request: PromotedApiRequest?
    ) {
        networkConnectionScope.launch {
            try {
//                xray.monitoredSuspend { networkConnection.send(request) }
//                telemetry.onMetricsSent(originalMessages.size, request?.bodyData?.size)
            } catch (error: Throwable) {
                // Swallow the exception because Xray will have reported it via Telemetry
                // if Telemetry is being used
                error.printStackTrace()
            }
        }
    }
}