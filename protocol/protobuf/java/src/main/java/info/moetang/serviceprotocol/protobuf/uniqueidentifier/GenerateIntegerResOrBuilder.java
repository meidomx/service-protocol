// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: uniqueidentifier/integerbased.proto

package info.moetang.serviceprotocol.protobuf.uniqueidentifier;

public interface GenerateIntegerResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uniqueidentifier.GenerateIntegerRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>string error_message = 2;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <code>string error_message = 2;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <code>int64 unique_identifier = 11;</code>
   * @return The uniqueIdentifier.
   */
  long getUniqueIdentifier();
}
