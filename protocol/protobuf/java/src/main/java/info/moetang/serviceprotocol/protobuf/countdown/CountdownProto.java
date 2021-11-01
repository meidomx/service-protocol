// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: countdown/countdown.proto

package info.moetang.serviceprotocol.protobuf.countdown;

public final class CountdownProto {
  private CountdownProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_Countdown_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_Countdown_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_CreateCountdownReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_CreateCountdownReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_CreateCountdownRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_CreateCountdownRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_QueryCountdownByIdReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_QueryCountdownByIdReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_QueryCountdownByIdRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_QueryCountdownByIdRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_NextCountdownIntervalByIdReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_NextCountdownIntervalByIdReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_NextCountdownIntervalByIdRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_NextCountdownIntervalByIdRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_QueryPagedExpringCountdownsByTypeRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_QueryPagedExpringCountdownsByTypeRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_QueryPagedCountdownsByTypeReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_QueryPagedCountdownsByTypeReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_countdown_QueryPagedCountdownsByTypeRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_countdown_QueryPagedCountdownsByTypeRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031countdown/countdown.proto\022\tcountdown\032\023" +
      "shared/result.proto\"\306\001\n\tCountdown\022\024\n\014cou" +
      "ntdown_id\030\001 \001(\t\022\017\n\007user_id\030\002 \001(\t\022\026\n\016coun" +
      "tdown_type\030\003 \001(\t\022\r\n\005title\030\013 \001(\t\022\017\n\007conte" +
      "nt\030\014 \001(\t\022\024\n\014time_expired\030\025 \001(\003\022\030\n\020time_l" +
      "ast_handle\030\026 \001(\003\022\024\n\014time_created\030\027 \001(\003\022\024" +
      "\n\014time_updated\030\030 \001(\003\"s\n\022CreateCountdownR" +
      "eq\022\017\n\007user_id\030\001 \001(\t\022\026\n\016countdown_type\030\002 " +
      "\001(\t\022\r\n\005title\030\013 \001(\t\022\017\n\007content\030\014 \001(\t\022\024\n\014t" +
      "ime_expired\030\025 \001(\003\"]\n\022CreateCountdownRes\022" +
      "\036\n\006result\030\001 \001(\0132\016.shared.Result\022\'\n\tcount" +
      "down\030\002 \001(\0132\024.countdown.Countdown\"-\n\025Quer" +
      "yCountdownByIdReq\022\024\n\014countdown_id\030\001 \001(\t\"" +
      "`\n\025QueryCountdownByIdRes\022\036\n\006result\030\001 \001(\013" +
      "2\016.shared.Result\022\'\n\tcountdown\030\002 \001(\0132\024.co" +
      "untdown.Countdown\"J\n\034NextCountdownInterv" +
      "alByIdReq\022\024\n\014countdown_id\030\001 \001(\t\022\024\n\014time_" +
      "expired\030\002 \001(\003\"g\n\034NextCountdownIntervalBy" +
      "IdRes\022\036\n\006result\030\001 \001(\0132\016.shared.Result\022\'\n" +
      "\tcountdown\030\002 \001(\0132\024.countdown.Countdown\"_" +
      "\n$QueryPagedExpringCountdownsByTypeReq\022\026" +
      "\n\016countdown_type\030\001 \001(\t\022\014\n\004page\030\002 \001(\003\022\021\n\t" +
      "page_size\030\003 \001(\003\"p\n$QueryPagedExpringCoun" +
      "tdownsByTypeRes\022\036\n\006result\030\001 \001(\0132\016.shared" +
      ".Result\022(\n\ncountdowns\030\002 \003(\0132\024.countdown." +
      "Countdown\"\221\001\n\035QueryPagedCountdownsByType" +
      "Req\022\026\n\016countdown_type\030\001 \001(\t\022\014\n\004page\030\002 \001(" +
      "\003\022\021\n\tpage_size\030\003 \001(\003\0227\n\rexpire_status\030\004 " +
      "\001(\0162 .countdown.CountdownExpireStatus\"i\n" +
      "\035QueryPagedCountdownsByTypeRes\022\036\n\006result" +
      "\030\001 \001(\0132\016.shared.Result\022(\n\ncountdowns\030\002 \003" +
      "(\0132\024.countdown.Countdown*c\n\025CountdownExp" +
      "ireStatus\022\013\n\007UNKNOWN\020\000\022\014\n\010EXPIRING\020\001\022\013\n\007" +
      "EXPIRED\020\002\022\013\n\007DELETED\020\003\022\014\n\010FINISHED\020\004\022\007\n\003" +
      "ALL\020\177*`\n\027CountdownNoticeTimeType\022\010\n\004NONE" +
      "\020\000\022\n\n\006DAY_30\020\001\022\n\n\006DAY_60\020\002\022\n\n\006DAY_90\020\003\022\013" +
      "\n\007MONTH_6\020\004\022\n\n\006CUSTOM\020\1772\260\004\n\020CountdownSer" +
      "vice\022Q\n\017CreateCountdown\022\035.countdown.Crea" +
      "teCountdownReq\032\035.countdown.CreateCountdo" +
      "wnRes\"\000\022o\n\031NextCountdownIntervalById\022\'.c" +
      "ountdown.NextCountdownIntervalByIdReq\032\'." +
      "countdown.NextCountdownIntervalByIdRes\"\000" +
      "\022Z\n\022QueryCountdownById\022 .countdown.Query" +
      "CountdownByIdReq\032 .countdown.QueryCountd" +
      "ownByIdRes\"\000\022\207\001\n!QueryPagedExpringCountd" +
      "ownsByType\022/.countdown.QueryPagedExpring" +
      "CountdownsByTypeReq\032/.countdown.QueryPag" +
      "edExpringCountdownsByTypeRes\"\000\022r\n\032QueryP" +
      "agedCountdownsByType\022(.countdown.QueryPa" +
      "gedCountdownsByTypeReq\032(.countdown.Query" +
      "PagedCountdownsByTypeRes\"\000B\232\001\n/info.moet" +
      "ang.serviceprotocol.protobuf.countdownB\016" +
      "CountdownProtoP\001ZBgithub.com/meidomx/ser" +
      "vice-protocol/protocol/protobuf/go/count" +
      "down\252\002\020ServiceGrpcProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          info.moetang.serviceprotocol.protobuf.shared.SharedProto.getDescriptor(),
        });
    internal_static_countdown_Countdown_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_countdown_Countdown_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_Countdown_descriptor,
        new java.lang.String[] { "CountdownId", "UserId", "CountdownType", "Title", "Content", "TimeExpired", "TimeLastHandle", "TimeCreated", "TimeUpdated", });
    internal_static_countdown_CreateCountdownReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_countdown_CreateCountdownReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_CreateCountdownReq_descriptor,
        new java.lang.String[] { "UserId", "CountdownType", "Title", "Content", "TimeExpired", });
    internal_static_countdown_CreateCountdownRes_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_countdown_CreateCountdownRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_CreateCountdownRes_descriptor,
        new java.lang.String[] { "Result", "Countdown", });
    internal_static_countdown_QueryCountdownByIdReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_countdown_QueryCountdownByIdReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_QueryCountdownByIdReq_descriptor,
        new java.lang.String[] { "CountdownId", });
    internal_static_countdown_QueryCountdownByIdRes_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_countdown_QueryCountdownByIdRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_QueryCountdownByIdRes_descriptor,
        new java.lang.String[] { "Result", "Countdown", });
    internal_static_countdown_NextCountdownIntervalByIdReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_countdown_NextCountdownIntervalByIdReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_NextCountdownIntervalByIdReq_descriptor,
        new java.lang.String[] { "CountdownId", "TimeExpired", });
    internal_static_countdown_NextCountdownIntervalByIdRes_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_countdown_NextCountdownIntervalByIdRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_NextCountdownIntervalByIdRes_descriptor,
        new java.lang.String[] { "Result", "Countdown", });
    internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_descriptor,
        new java.lang.String[] { "CountdownType", "Page", "PageSize", });
    internal_static_countdown_QueryPagedExpringCountdownsByTypeRes_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_countdown_QueryPagedExpringCountdownsByTypeRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_QueryPagedExpringCountdownsByTypeRes_descriptor,
        new java.lang.String[] { "Result", "Countdowns", });
    internal_static_countdown_QueryPagedCountdownsByTypeReq_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_countdown_QueryPagedCountdownsByTypeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_QueryPagedCountdownsByTypeReq_descriptor,
        new java.lang.String[] { "CountdownType", "Page", "PageSize", "ExpireStatus", });
    internal_static_countdown_QueryPagedCountdownsByTypeRes_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_countdown_QueryPagedCountdownsByTypeRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_countdown_QueryPagedCountdownsByTypeRes_descriptor,
        new java.lang.String[] { "Result", "Countdowns", });
    info.moetang.serviceprotocol.protobuf.shared.SharedProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
