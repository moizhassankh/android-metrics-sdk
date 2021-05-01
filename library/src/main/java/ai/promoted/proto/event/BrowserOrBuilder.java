// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

public interface BrowserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.Browser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_agent = 1;</code>
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   * <code>string user_agent = 1;</code>
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString
      getUserAgentBytes();

  /**
   * <code>.event.Size viewport_size = 2;</code>
   * @return Whether the viewportSize field is set.
   */
  boolean hasViewportSize();
  /**
   * <code>.event.Size viewport_size = 2;</code>
   * @return The viewportSize.
   */
  ai.promoted.proto.event.Size getViewportSize();
  /**
   * <code>.event.Size viewport_size = 2;</code>
   */
  ai.promoted.proto.event.SizeOrBuilder getViewportSizeOrBuilder();

  /**
   * <code>.event.ClientHints client_hints = 3;</code>
   * @return Whether the clientHints field is set.
   */
  boolean hasClientHints();
  /**
   * <code>.event.ClientHints client_hints = 3;</code>
   * @return The clientHints.
   */
  ai.promoted.proto.event.ClientHints getClientHints();
  /**
   * <code>.event.ClientHints client_hints = 3;</code>
   */
  ai.promoted.proto.event.ClientHintsOrBuilder getClientHintsOrBuilder();
}
