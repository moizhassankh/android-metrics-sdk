// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.benshi.proto.event;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional.  If not set, set by API servers.
   * If not set, API server uses LogRequest.platform_id.
   * </pre>
   *
   * <code>uint64 platform_id = 1;</code>
   * @return The platformId.
   */
  long getPlatformId();

  /**
   * <pre>
   * Optional.  Must be set on LogRequest or here.
   * </pre>
   *
   * <code>.common.UserInfo user_info = 2;</code>
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();
  /**
   * <pre>
   * Optional.  Must be set on LogRequest or here.
   * </pre>
   *
   * <code>.common.UserInfo user_info = 2;</code>
   * @return The userInfo.
   */
  ai.benshi.proto.common.UserInfo getUserInfo();
  /**
   * <pre>
   * Optional.  Must be set on LogRequest or here.
   * </pre>
   *
   * <code>.common.UserInfo user_info = 2;</code>
   */
  ai.benshi.proto.common.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   * <pre>
   * Optional.  If not set, set by API servers.
   * If not set, API server uses LogRequest.timing.
   * </pre>
   *
   * <code>.common.Timing timing = 3;</code>
   * @return Whether the timing field is set.
   */
  boolean hasTiming();
  /**
   * <pre>
   * Optional.  If not set, set by API servers.
   * If not set, API server uses LogRequest.timing.
   * </pre>
   *
   * <code>.common.Timing timing = 3;</code>
   * @return The timing.
   */
  ai.benshi.proto.common.Timing getTiming();
  /**
   * <pre>
   * Optional.  If not set, set by API servers.
   * If not set, API server uses LogRequest.timing.
   * </pre>
   *
   * <code>.common.Timing timing = 3;</code>
   */
  ai.benshi.proto.common.TimingOrBuilder getTimingOrBuilder();

  /**
   * <pre>
   * Optional.  If not set, API server uses LogRequest.client_info.
   * </pre>
   *
   * <code>.common.ClientInfo client_info = 4;</code>
   * @return Whether the clientInfo field is set.
   */
  boolean hasClientInfo();
  /**
   * <pre>
   * Optional.  If not set, API server uses LogRequest.client_info.
   * </pre>
   *
   * <code>.common.ClientInfo client_info = 4;</code>
   * @return The clientInfo.
   */
  ai.benshi.proto.common.ClientInfo getClientInfo();
  /**
   * <pre>
   * Optional.  If not set, API server uses LogRequest.client_info.
   * </pre>
   *
   * <code>.common.ClientInfo client_info = 4;</code>
   */
  ai.benshi.proto.common.ClientInfoOrBuilder getClientInfoOrBuilder();

  /**
   * <pre>
   * Optional.  Primary key.
   * SDKs usually handles this automatically. For details, see
   * https://github.com/promotedai/schema#setting-primary-keys
   * </pre>
   *
   * <code>string action_id = 6;</code>
   * @return The actionId.
   */
  String getActionId();
  /**
   * <pre>
   * Optional.  Primary key.
   * SDKs usually handles this automatically. For details, see
   * https://github.com/promotedai/schema#setting-primary-keys
   * </pre>
   *
   * <code>string action_id = 6;</code>
   * @return The bytes for actionId.
   */
  com.google.protobuf.ByteString
      getActionIdBytes();

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string impression_id = 7;</code>
   * @return The impressionId.
   */
  String getImpressionId();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string impression_id = 7;</code>
   * @return The bytes for impressionId.
   */
  com.google.protobuf.ByteString
      getImpressionIdBytes();

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string insertion_id = 8;</code>
   * @return The insertionId.
   */
  String getInsertionId();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string insertion_id = 8;</code>
   * @return The bytes for insertionId.
   */
  com.google.protobuf.ByteString
      getInsertionIdBytes();

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string request_id = 9;</code>
   * @return The requestId.
   */
  String getRequestId();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string request_id = 9;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string view_id = 11;</code>
   * @return The viewId.
   */
  String getViewId();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string view_id = 11;</code>
   * @return The bytes for viewId.
   */
  com.google.protobuf.ByteString
      getViewIdBytes();

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string auto_view_id = 23;</code>
   * @return The autoViewId.
   */
  String getAutoViewId();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string auto_view_id = 23;</code>
   * @return The bytes for autoViewId.
   */
  com.google.protobuf.ByteString
      getAutoViewIdBytes();

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string session_id = 10;</code>
   * @return The sessionId.
   */
  String getSessionId();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string session_id = 10;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <pre>
   * Optional. content_id is used as a hint when impression_id is not set.
   * For more accurate results, set impression_id if available.
   * </pre>
   *
   * <code>string content_id = 21;</code>
   * @return The contentId.
   */
  String getContentId();
  /**
   * <pre>
   * Optional. content_id is used as a hint when impression_id is not set.
   * For more accurate results, set impression_id if available.
   * </pre>
   *
   * <code>string content_id = 21;</code>
   * @return The bytes for contentId.
   */
  com.google.protobuf.ByteString
      getContentIdBytes();

  /**
   * <pre>
   * Optional.  Custom name of the action that the user performed.
   * E.g. "Product clicked".  Do not stick parameters or pii in this name.
   * </pre>
   *
   * <code>string name = 12;</code>
   * @return The name.
   */
  String getName();
  /**
   * <pre>
   * Optional.  Custom name of the action that the user performed.
   * E.g. "Product clicked".  Do not stick parameters or pii in this name.
   * </pre>
   *
   * <code>string name = 12;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional.  The action that the user wants to perform.
   * </pre>
   *
   * <code>.event.ActionType action_type = 14;</code>
   * @return The enum numeric value on the wire for actionType.
   */
  int getActionTypeValue();
  /**
   * <pre>
   * Optional.  The action that the user wants to perform.
   * </pre>
   *
   * <code>.event.ActionType action_type = 14;</code>
   * @return The actionType.
   */
  ActionType getActionType();

  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string custom_action_type = 15;</code>
   * @return The customActionType.
   */
  String getCustomActionType();
  /**
   * <pre>
   * Optional.
   * </pre>
   *
   * <code>string custom_action_type = 15;</code>
   * @return The bytes for customActionType.
   */
  com.google.protobuf.ByteString
      getCustomActionTypeBytes();

  /**
   * <code>string element_id = 17;</code>
   * @return The elementId.
   */
  String getElementId();
  /**
   * <code>string element_id = 17;</code>
   * @return The bytes for elementId.
   */
  com.google.protobuf.ByteString
      getElementIdBytes();

  /**
   * <code>.event.NavigateAction navigate_action = 18;</code>
   * @return Whether the navigateAction field is set.
   */
  boolean hasNavigateAction();
  /**
   * <code>.event.NavigateAction navigate_action = 18;</code>
   * @return The navigateAction.
   */
  NavigateAction getNavigateAction();
  /**
   * <code>.event.NavigateAction navigate_action = 18;</code>
   */
  NavigateActionOrBuilder getNavigateActionOrBuilder();

  /**
   * <pre>
   * Optional. Indicates that this action occurred in a view that may
   * not be topmost in the view hierarchy.
   * </pre>
   *
   * <code>bool has_superimposed_views = 22;</code>
   * @return The hasSuperimposedViews.
   */
  boolean getHasSuperimposedViews();

  /**
   * <pre>
   * Optional.  Custom properties per platform.
   * </pre>
   *
   * <code>.common.Properties properties = 20;</code>
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   * <pre>
   * Optional.  Custom properties per platform.
   * </pre>
   *
   * <code>.common.Properties properties = 20;</code>
   * @return The properties.
   */
  ai.benshi.proto.common.Properties getProperties();
  /**
   * <pre>
   * Optional.  Custom properties per platform.
   * </pre>
   *
   * <code>.common.Properties properties = 20;</code>
   */
  ai.benshi.proto.common.PropertiesOrBuilder getPropertiesOrBuilder();

  public Action.ActionCase getActionCase();
}