// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user.proto

package info.moetang.serviceprotocol.protobuf.user;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RegisterUserReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RegisterUserReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RegisterUserRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RegisterUserRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_VerifyUserPasswordReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_VerifyUserPasswordReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_VerifyUserPasswordRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_VerifyUserPasswordRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ChangeUserPasswordReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ChangeUserPasswordReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ChangeUserPasswordRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ChangeUserPasswordRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017user/user.proto\022\004user\032\023shared/result.p" +
      "roto\"5\n\017RegisterUserReq\022\020\n\010username\030\001 \001(" +
      "\t\022\020\n\010password\030\002 \001(\t\"1\n\017RegisterUserRes\022\036" +
      "\n\006result\030\001 \001(\0132\016.shared.Result\";\n\025Verify" +
      "UserPasswordReq\022\020\n\010username\030\001 \001(\t\022\020\n\010pas" +
      "sword\030\002 \001(\t\"7\n\025VerifyUserPasswordRes\022\036\n\006" +
      "result\030\001 \001(\0132\016.shared.Result\";\n\025ChangeUs" +
      "erPasswordReq\022\020\n\010username\030\001 \001(\t\022\020\n\010passw" +
      "ord\030\002 \001(\t\"7\n\025ChangeUserPasswordRes\022\036\n\006re" +
      "sult\030\001 \001(\0132\016.shared.Result2\361\001\n\013UserServi" +
      "ce\022>\n\014RegisterUser\022\025.user.RegisterUserRe" +
      "q\032\025.user.RegisterUserRes\"\000\022P\n\022VerifyUser" +
      "Password\022\033.user.VerifyUserPasswordReq\032\033." +
      "user.VerifyUserPasswordRes\"\000\022P\n\022ChangeUs" +
      "erPassword\022\033.user.ChangeUserPasswordReq\032" +
      "\033.user.ChangeUserPasswordRes\"\000B\213\001\n*info." +
      "moetang.serviceprotocol.protobuf.userB\tU" +
      "serProtoP\001Z=github.com/meidomx/service-p" +
      "rotocol/protocol/protobuf/go/user\252\002\020Serv" +
      "iceGrpcProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          info.moetang.serviceprotocol.protobuf.shared.SharedProto.getDescriptor(),
        });
    internal_static_user_RegisterUserReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_RegisterUserReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RegisterUserReq_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_user_RegisterUserRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_RegisterUserRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RegisterUserRes_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_user_VerifyUserPasswordReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_VerifyUserPasswordReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_VerifyUserPasswordReq_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_user_VerifyUserPasswordRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_VerifyUserPasswordRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_VerifyUserPasswordRes_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_user_ChangeUserPasswordReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_user_ChangeUserPasswordReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ChangeUserPasswordReq_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_user_ChangeUserPasswordRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_user_ChangeUserPasswordRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ChangeUserPasswordRes_descriptor,
        new java.lang.String[] { "Result", });
    info.moetang.serviceprotocol.protobuf.shared.SharedProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
