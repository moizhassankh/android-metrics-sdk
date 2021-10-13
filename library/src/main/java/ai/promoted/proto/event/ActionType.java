// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

/**
 * <pre>
 * The action that user wants to perform.
 * Next ID = 16.
 * </pre>
 *
 * Protobuf enum {@code event.ActionType}
 */
public enum ActionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_ACTION_TYPE = 0;</code>
   */
  UNKNOWN_ACTION_TYPE(0),
  /**
   * <pre>
   * Action that doesn't correspond to any of the below.
   * </pre>
   *
   * <code>CUSTOM_ACTION_TYPE = 1;</code>
   */
  CUSTOM_ACTION_TYPE(1),
  /**
   * <pre>
   * Navigating to details about content.
   * </pre>
   *
   * <code>NAVIGATE = 2;</code>
   */
  NAVIGATE(2),
  /**
   * <pre>
   * Adding an item to shopping cart.
   * </pre>
   *
   * <code>ADD_TO_CART = 4;</code>
   */
  ADD_TO_CART(4),
  /**
   * <pre>
   * Remove an item from shopping cart.
   * </pre>
   *
   * <code>REMOVE_FROM_CART = 10;</code>
   */
  REMOVE_FROM_CART(10),
  /**
   * <pre>
   * Going to checkout.
   * </pre>
   *
   * <code>CHECKOUT = 8;</code>
   */
  CHECKOUT(8),
  /**
   * <pre>
   * Purchasing an item.
   * </pre>
   *
   * <code>PURCHASE = 3;</code>
   */
  PURCHASE(3),
  /**
   * <pre>
   * Sharing content.
   * </pre>
   *
   * <code>SHARE = 5;</code>
   */
  SHARE(5),
  /**
   * <pre>
   * Liking content.
   * </pre>
   *
   * <code>LIKE = 6;</code>
   */
  LIKE(6),
  /**
   * <pre>
   * Un-liking content.
   * </pre>
   *
   * <code>UNLIKE = 9;</code>
   */
  UNLIKE(9),
  /**
   * <pre>
   * Commenting on content.
   * </pre>
   *
   * <code>COMMENT = 7;</code>
   */
  COMMENT(7),
  /**
   * <pre>
   * Making an offer on content.
   * </pre>
   *
   * <code>MAKE_OFFER = 11;</code>
   */
  MAKE_OFFER(11),
  /**
   * <pre>
   * Asking a question about content.
   * </pre>
   *
   * <code>ASK_QUESTION = 12;</code>
   */
  ASK_QUESTION(12),
  /**
   * <pre>
   * Answering a question about content.
   * </pre>
   *
   * <code>ANSWER_QUESTION = 13;</code>
   */
  ANSWER_QUESTION(13),
  /**
   * <pre>
   * Complete sign-in.
   * No content_id needed.  If set, set it to the Content's ID (not User).
   * </pre>
   *
   * <code>COMPLETE_SIGN_IN = 14;</code>
   */
  COMPLETE_SIGN_IN(14),
  /**
   * <pre>
   * Complete sign-up.
   * No content_id needed.  If set, set it to the Content's ID (not User).
   * </pre>
   *
   * <code>COMPLETE_SIGN_UP = 15;</code>
   */
  COMPLETE_SIGN_UP(15),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_ACTION_TYPE = 0;</code>
   */
  public static final int UNKNOWN_ACTION_TYPE_VALUE = 0;
  /**
   * <pre>
   * Action that doesn't correspond to any of the below.
   * </pre>
   *
   * <code>CUSTOM_ACTION_TYPE = 1;</code>
   */
  public static final int CUSTOM_ACTION_TYPE_VALUE = 1;
  /**
   * <pre>
   * Navigating to details about content.
   * </pre>
   *
   * <code>NAVIGATE = 2;</code>
   */
  public static final int NAVIGATE_VALUE = 2;
  /**
   * <pre>
   * Adding an item to shopping cart.
   * </pre>
   *
   * <code>ADD_TO_CART = 4;</code>
   */
  public static final int ADD_TO_CART_VALUE = 4;
  /**
   * <pre>
   * Remove an item from shopping cart.
   * </pre>
   *
   * <code>REMOVE_FROM_CART = 10;</code>
   */
  public static final int REMOVE_FROM_CART_VALUE = 10;
  /**
   * <pre>
   * Going to checkout.
   * </pre>
   *
   * <code>CHECKOUT = 8;</code>
   */
  public static final int CHECKOUT_VALUE = 8;
  /**
   * <pre>
   * Purchasing an item.
   * </pre>
   *
   * <code>PURCHASE = 3;</code>
   */
  public static final int PURCHASE_VALUE = 3;
  /**
   * <pre>
   * Sharing content.
   * </pre>
   *
   * <code>SHARE = 5;</code>
   */
  public static final int SHARE_VALUE = 5;
  /**
   * <pre>
   * Liking content.
   * </pre>
   *
   * <code>LIKE = 6;</code>
   */
  public static final int LIKE_VALUE = 6;
  /**
   * <pre>
   * Un-liking content.
   * </pre>
   *
   * <code>UNLIKE = 9;</code>
   */
  public static final int UNLIKE_VALUE = 9;
  /**
   * <pre>
   * Commenting on content.
   * </pre>
   *
   * <code>COMMENT = 7;</code>
   */
  public static final int COMMENT_VALUE = 7;
  /**
   * <pre>
   * Making an offer on content.
   * </pre>
   *
   * <code>MAKE_OFFER = 11;</code>
   */
  public static final int MAKE_OFFER_VALUE = 11;
  /**
   * <pre>
   * Asking a question about content.
   * </pre>
   *
   * <code>ASK_QUESTION = 12;</code>
   */
  public static final int ASK_QUESTION_VALUE = 12;
  /**
   * <pre>
   * Answering a question about content.
   * </pre>
   *
   * <code>ANSWER_QUESTION = 13;</code>
   */
  public static final int ANSWER_QUESTION_VALUE = 13;
  /**
   * <pre>
   * Complete sign-in.
   * No content_id needed.  If set, set it to the Content's ID (not User).
   * </pre>
   *
   * <code>COMPLETE_SIGN_IN = 14;</code>
   */
  public static final int COMPLETE_SIGN_IN_VALUE = 14;
  /**
   * <pre>
   * Complete sign-up.
   * No content_id needed.  If set, set it to the Content's ID (not User).
   * </pre>
   *
   * <code>COMPLETE_SIGN_UP = 15;</code>
   */
  public static final int COMPLETE_SIGN_UP_VALUE = 15;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static ActionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ActionType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_ACTION_TYPE;
      case 1: return CUSTOM_ACTION_TYPE;
      case 2: return NAVIGATE;
      case 4: return ADD_TO_CART;
      case 10: return REMOVE_FROM_CART;
      case 8: return CHECKOUT;
      case 3: return PURCHASE;
      case 5: return SHARE;
      case 6: return LIKE;
      case 9: return UNLIKE;
      case 7: return COMMENT;
      case 11: return MAKE_OFFER;
      case 12: return ASK_QUESTION;
      case 13: return ANSWER_QUESTION;
      case 14: return COMPLETE_SIGN_IN;
      case 15: return COMPLETE_SIGN_UP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ActionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ActionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ActionType>() {
          public ActionType findValueByNumber(int number) {
            return ActionType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return Event.getDescriptor().getEnumTypes().get(3);
  }

  private static final ActionType[] VALUES = values();

  public static ActionType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ActionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:event.ActionType)
}

