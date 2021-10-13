// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

public interface WebPageViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.WebPageView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional.  This is the url for the page.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  String getUrl();
  /**
   * <pre>
   * Optional.  This is the url for the page.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Optional.  Can be a full referrer string.  Could be just the UTM.
   * </pre>
   *
   * <code>string referrer = 3;</code>
   * @return The referrer.
   */
  String getReferrer();
  /**
   * <pre>
   * Optional.  Can be a full referrer string.  Could be just the UTM.
   * </pre>
   *
   * <code>string referrer = 3;</code>
   * @return The bytes for referrer.
   */
  com.google.protobuf.ByteString
      getReferrerBytes();

  /**
   * <code>.common.Size document_size = 4;</code>
   * @return Whether the documentSize field is set.
   */
  boolean hasDocumentSize();
  /**
   * <code>.common.Size document_size = 4;</code>
   * @return The documentSize.
   */
  ai.promoted.proto.common.Size getDocumentSize();
  /**
   * <code>.common.Size document_size = 4;</code>
   */
  ai.promoted.proto.common.SizeOrBuilder getDocumentSizeOrBuilder();
}
