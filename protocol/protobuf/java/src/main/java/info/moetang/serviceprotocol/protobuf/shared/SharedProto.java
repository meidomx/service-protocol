// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shared/result.proto

package info.moetang.serviceprotocol.protobuf.shared;

public final class SharedProto {
  private SharedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shared_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shared_Result_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023shared/result.proto\022\006shared\"P\n\006Result\022" +
      "\021\n\007success\030\260\352\001 \001(\010\022\016\n\004code\030\261\352\001 \001(\t\022\020\n\006re" +
      "sult\030\262\352\001 \001(\t\022\021\n\007message\030\263\352\001 \001(\tB~\n,info." +
      "moetang.serviceprotocol.protobuf.sharedB" +
      "\013SharedProtoP\001Z?github.com/meidomx/servi" +
      "ce-protocol/protocol/protobuf/go/sharedb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_shared_Result_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_shared_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shared_Result_descriptor,
        new java.lang.String[] { "Success", "Code", "Result", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
