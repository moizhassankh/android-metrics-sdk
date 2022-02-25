package ai.benshi

import android.app.Application

class ExampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        BshScroll.initialize(this) {}
    }
}