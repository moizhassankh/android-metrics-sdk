// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/common.proto

package ai.promoted.proto.common;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_EntityPath_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_EntityPath_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_ClientInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_ClientInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Locale_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Locale_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Size_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Size_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Screen_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Screen_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_ClientHints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_ClientHints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_ClientHintBrand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_ClientHintBrand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Browser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Browser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Timing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Timing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Properties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Properties_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\031proto/common/common.proto\022\006common\032\034goo" +
      "gle/protobuf/struct.proto\"\211\001\n\nEntityPath" +
      "\022\023\n\013platform_id\030\001 \001(\004\022\023\n\013customer_id\030\002 \001" +
      "(\004\022\022\n\naccount_id\030\004 \001(\004\022\023\n\013campaign_id\030\005 " +
      "\001(\004\022\024\n\014promotion_id\030\006 \001(\004\022\022\n\ncontent_id\030" +
      "\003 \001(\004\"J\n\010UserInfo\022\017\n\007user_id\030\001 \001(\t\022\023\n\013lo" +
      "g_user_id\030\002 \001(\t\022\030\n\020is_internal_user\030\003 \001(" +
      "\010\"\255\002\n\nClientInfo\0222\n\013client_type\030\001 \001(\0162\035." +
      "common.ClientInfo.ClientType\0224\n\014traffic_" +
      "type\030\002 \001(\0162\036.common.ClientInfo.TrafficTy" +
      "pe\"X\n\nClientType\022\032\n\026UNKNOWN_REQUEST_CLIE" +
      "NT\020\000\022\023\n\017PLATFORM_SERVER\020\001\022\023\n\017PLATFORM_CL" +
      "IENT\020\002\"\004\010\003\020\004\"[\n\013TrafficType\022\030\n\024UNKNOWN_T" +
      "RAFFIC_TYPE\020\000\022\016\n\nPRODUCTION\020\001\022\n\n\006REPLAY\020" +
      "\002\022\n\n\006SHADOW\020\004\"\004\010\003\020\003\"\004\010\005\020\005\"4\n\006Locale\022\025\n\rl" +
      "anguage_code\030\001 \001(\t\022\023\n\013region_code\030\002 \001(\t\"" +
      "%\n\004Size\022\r\n\005width\030\001 \001(\r\022\016\n\006height\030\002 \001(\r\"3" +
      "\n\006Screen\022\032\n\004size\030\001 \001(\0132\014.common.Size\022\r\n\005" +
      "scale\030\002 \001(\002\"\234\002\n\006Device\022\'\n\013device_type\030\001 " +
      "\001(\0162\022.common.DeviceType\022\r\n\005brand\030\002 \001(\t\022\024" +
      "\n\014manufacturer\030\003 \001(\t\022\022\n\nidentifier\030\004 \001(\t" +
      "\022\022\n\nos_version\030\005 \001(\t\022\"\n\006locale\030\006 \001(\0132\016.c" +
      "ommon.LocaleB\002\030\001\022\036\n\006screen\030\007 \001(\0132\016.commo" +
      "n.Screen\022\022\n\nip_address\030\010 \001(\t\022\"\n\010location" +
      "\030\t \001(\0132\020.common.Location\022 \n\007browser\030\n \001(" +
      "\0132\017.common.Browser\"\262\001\n\013ClientHints\022\021\n\tis" +
      "_mobile\030\001 \001(\010\022&\n\005brand\030\002 \003(\0132\027.common.Cl" +
      "ientHintBrand\022\024\n\014architecture\030\003 \001(\t\022\r\n\005m" +
      "odel\030\004 \001(\t\022\020\n\010platform\030\005 \001(\t\022\030\n\020platform" +
      "_version\030\006 \001(\t\022\027\n\017ua_full_version\030\007 \001(\t\"" +
      "1\n\017ClientHintBrand\022\r\n\005brand\030\001 \001(\t\022\017\n\007ver" +
      "sion\030\002 \001(\t\"m\n\007Browser\022\022\n\nuser_agent\030\001 \001(" +
      "\t\022#\n\rviewport_size\030\002 \001(\0132\014.common.Size\022)" +
      "\n\014client_hints\030\003 \001(\0132\023.common.ClientHint" +
      "s\"K\n\010Location\022\020\n\010latitude\030\001 \001(\001\022\021\n\tlongi" +
      "tude\030\002 \001(\001\022\032\n\022accuracy_in_meters\030\003 \001(\001\"2" +
      "\n\006Timing\022\034\n\024client_log_timestamp\030\001 \001(\004J\004" +
      "\010\002\020\003J\004\010\003\020\004\"e\n\nProperties\022\026\n\014struct_bytes" +
      "\030\001 \001(\014H\000\022)\n\006struct\030\002 \001(\0132\027.google.protob" +
      "uf.StructH\000B\016\n\014struct_fieldJ\004\010\003\020\004*\335\001\n\014Cu" +
      "rrencyCode\022\031\n\025UNKNOWN_CURRENCY_CODE\020\000\022\007\n" +
      "\003USD\020\001\022\007\n\003EUR\020\002\022\007\n\003JPY\020\003\022\007\n\003GBP\020\004\022\007\n\003AUD" +
      "\020\005\022\007\n\003CAD\020\006\022\007\n\003CHF\020\007\022\007\n\003CNY\020\010\022\007\n\003HKD\020\t\022\007" +
      "\n\003NZD\020\n\022\007\n\003SEK\020\013\022\007\n\003KRW\020\014\022\007\n\003SGD\020\r\022\007\n\003NO" +
      "K\020\016\022\007\n\003MXN\020\017\022\007\n\003INR\020\020\022\007\n\003RUB\020\021\022\007\n\003ZAR\020\022\022" +
      "\007\n\003TRY\020\023\022\007\n\003BRL\020\024*J\n\nDeviceType\022\027\n\023UNKNO" +
      "WN_DEVICE_TYPE\020\000\022\013\n\007DESKTOP\020\001\022\n\n\006MOBILE\020" +
      "\002\022\n\n\006TABLET\020\003B)\n\030ai.promoted.proto.commo" +
      "nB\013CommonProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_common_EntityPath_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_common_EntityPath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_EntityPath_descriptor,
        new String[] { "PlatformId", "CustomerId", "AccountId", "CampaignId", "PromotionId", "ContentId", });
    internal_static_common_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_common_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_UserInfo_descriptor,
        new String[] { "UserId", "LogUserId", "IsInternalUser", });
    internal_static_common_ClientInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_common_ClientInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_ClientInfo_descriptor,
        new String[] { "ClientType", "TrafficType", });
    internal_static_common_Locale_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_common_Locale_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Locale_descriptor,
        new String[] { "LanguageCode", "RegionCode", });
    internal_static_common_Size_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_common_Size_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Size_descriptor,
        new String[] { "Width", "Height", });
    internal_static_common_Screen_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_common_Screen_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Screen_descriptor,
        new String[] { "Size", "Scale", });
    internal_static_common_Device_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_common_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Device_descriptor,
        new String[] { "DeviceType", "Brand", "Manufacturer", "Identifier", "OsVersion", "Locale", "Screen", "IpAddress", "Location", "Browser", });
    internal_static_common_ClientHints_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_common_ClientHints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_ClientHints_descriptor,
        new String[] { "IsMobile", "Brand", "Architecture", "Model", "Platform", "PlatformVersion", "UaFullVersion", });
    internal_static_common_ClientHintBrand_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_common_ClientHintBrand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_ClientHintBrand_descriptor,
        new String[] { "Brand", "Version", });
    internal_static_common_Browser_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_common_Browser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Browser_descriptor,
        new String[] { "UserAgent", "ViewportSize", "ClientHints", });
    internal_static_common_Location_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_common_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Location_descriptor,
        new String[] { "Latitude", "Longitude", "AccuracyInMeters", });
    internal_static_common_Timing_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_common_Timing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Timing_descriptor,
        new String[] { "ClientLogTimestamp", });
    internal_static_common_Properties_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_common_Properties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Properties_descriptor,
        new String[] { "StructBytes", "Struct", "StructField", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
