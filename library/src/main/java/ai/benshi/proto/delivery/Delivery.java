// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/delivery.proto

package ai.benshi.proto.delivery;

public final class Delivery {
  private Delivery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Paging_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Paging_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_PagingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_PagingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Insertion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Insertion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\035proto/delivery/delivery.proto\022\010deliver" +
      "y\032\034google/protobuf/struct.proto\032\031proto/c" +
      "ommon/common.proto\032\034proto/delivery/blend" +
      "er.proto\"\352\003\n\007Request\022\023\n\013platform_id\030\001 \001(" +
      "\004\022#\n\tuser_info\030\002 \001(\0132\020.common.UserInfo\022\036" +
      "\n\006timing\030\003 \001(\0132\016.common.Timing\022\'\n\013client" +
      "_info\030\004 \001(\0132\022.common.ClientInfo\022\036\n\006devic" +
      "e\030\022 \001(\0132\016.common.Device\022\022\n\nrequest_id\030\006 " +
      "\001(\t\022\017\n\007view_id\030\007 \001(\t\022\022\n\nsession_id\030\010 \001(\t" +
      "\022\031\n\021client_request_id\030\016 \001(\t\022#\n\010use_case\030" +
      "\t \001(\0162\021.delivery.UseCase\022\024\n\014search_query" +
      "\030\n \001(\t\022 \n\006paging\030\021 \001(\0132\020.delivery.Paging" +
      "\022&\n\tinsertion\030\013 \003(\0132\023.delivery.Insertion" +
      "\022/\n\016blender_config\030\014 \001(\0132\027.delivery.Blen" +
      "derConfig\022&\n\nproperties\030\r \001(\0132\022.common.P" +
      "ropertiesJ\004\010\005\020\006J\004\010\017\020\020\"Y\n\006Paging\022\021\n\tpagin" +
      "g_id\030\001 \001(\t\022\014\n\004size\030\002 \001(\005\022\020\n\006cursor\030\003 \001(\t" +
      "H\000\022\020\n\006offset\030\004 \001(\005H\000B\n\n\010starting\"c\n\010Resp" +
      "onse\022&\n\tinsertion\030\002 \003(\0132\023.delivery.Inser" +
      "tion\022)\n\013paging_info\030\003 \001(\0132\024.delivery.Pag" +
      "ingInfoJ\004\010\001\020\002\"/\n\nPagingInfo\022\021\n\tpaging_id" +
      "\030\001 \001(\t\022\016\n\006cursor\030\002 \001(\t\"\311\003\n\tInsertion\022\023\n\013" +
      "platform_id\030\001 \001(\004\022#\n\tuser_info\030\002 \001(\0132\020.c" +
      "ommon.UserInfo\022\036\n\006timing\030\003 \001(\0132\016.common." +
      "Timing\022\'\n\013client_info\030\004 \001(\0132\022.common.Cli" +
      "entInfo\022\024\n\014insertion_id\030\006 \001(\t\022\022\n\nrequest" +
      "_id\030\007 \001(\t\022\017\n\007view_id\030\t \001(\t\022\022\n\nsession_id" +
      "\030\010 \001(\t\022\022\n\ncontent_id\030\n \001(\t\022\025\n\010position\030\014" +
      " \001(\004H\000\210\001\001\022&\n\nproperties\030\r \001(\0132\022.common.P" +
      "roperties\022\033\n\016retrieval_rank\030\023 \001(\004H\001\210\001\001\022\034" +
      "\n\017retrieval_score\030\024 \001(\002H\002\210\001\001B\013\n\t_positio" +
      "nB\021\n\017_retrieval_rankB\022\n\020_retrieval_score" +
      "J\004\010\005\020\006J\004\010\013\020\014J\004\010\016\020\017J\004\010\017\020\020J\004\010\020\020\021J\004\010\021\020\022J\004\010\022" +
      "\020\023*\332\001\n\007UseCase\022\024\n\020UNKNOWN_USE_CASE\020\000\022\n\n\006" +
      "CUSTOM\020\001\022\n\n\006SEARCH\020\002\022\026\n\022SEARCH_SUGGESTIO" +
      "NS\020\003\022\010\n\004FEED\020\004\022\023\n\017RELATED_CONTENT\020\005\022\014\n\010C" +
      "LOSE_UP\020\006\022\024\n\020CATEGORY_CONTENT\020\007\022\016\n\nMY_CO" +
      "NTENT\020\010\022\024\n\020MY_SAVED_CONTENT\020\t\022\022\n\016SELLER_" +
      "CONTENT\020\n\022\014\n\010DISCOVER\020\013B(\n\032ai.promoted.p" +
      "roto.deliveryB\010DeliveryP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          ai.benshi.proto.common.CommonProto.getDescriptor(),
          ai.benshi.proto.delivery.Blender.getDescriptor(),
        });
    internal_static_delivery_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_delivery_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Request_descriptor,
        new String[] { "PlatformId", "UserInfo", "Timing", "ClientInfo", "Device", "RequestId", "ViewId", "SessionId", "ClientRequestId", "UseCase", "SearchQuery", "Paging", "Insertion", "BlenderConfig", "Properties", });
    internal_static_delivery_Paging_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_delivery_Paging_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Paging_descriptor,
        new String[] { "PagingId", "Size", "Cursor", "Offset", "Starting", });
    internal_static_delivery_Response_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_delivery_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Response_descriptor,
        new String[] { "Insertion", "PagingInfo", });
    internal_static_delivery_PagingInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_delivery_PagingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_PagingInfo_descriptor,
        new String[] { "PagingId", "Cursor", });
    internal_static_delivery_Insertion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_delivery_Insertion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Insertion_descriptor,
        new String[] { "PlatformId", "UserInfo", "Timing", "ClientInfo", "InsertionId", "RequestId", "ViewId", "SessionId", "ContentId", "Position", "Properties", "RetrievalRank", "RetrievalScore", "Position", "RetrievalRank", "RetrievalScore", });
    com.google.protobuf.StructProto.getDescriptor();
    ai.benshi.proto.common.CommonProto.getDescriptor();
    ai.benshi.proto.delivery.Blender.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}