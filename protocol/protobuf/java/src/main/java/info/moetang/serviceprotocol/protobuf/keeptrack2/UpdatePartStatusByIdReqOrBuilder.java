// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keeptrack2/keeptrack2.proto

package info.moetang.serviceprotocol.protobuf.keeptrack2;

public interface UpdatePartStatusByIdReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:keeptrack2.UpdatePartStatusByIdReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string part_id = 1;</code>
   * @return The partId.
   */
  java.lang.String getPartId();
  /**
   * <code>string part_id = 1;</code>
   * @return The bytes for partId.
   */
  com.google.protobuf.ByteString
      getPartIdBytes();

  /**
   * <code>.keeptrack2.GeneralStatus old_status = 2;</code>
   * @return The enum numeric value on the wire for oldStatus.
   */
  int getOldStatusValue();
  /**
   * <code>.keeptrack2.GeneralStatus old_status = 2;</code>
   * @return The oldStatus.
   */
  info.moetang.serviceprotocol.protobuf.keeptrack2.GeneralStatus getOldStatus();

  /**
   * <code>.keeptrack2.GeneralStatus new_status = 3;</code>
   * @return The enum numeric value on the wire for newStatus.
   */
  int getNewStatusValue();
  /**
   * <code>.keeptrack2.GeneralStatus new_status = 3;</code>
   * @return The newStatus.
   */
  info.moetang.serviceprotocol.protobuf.keeptrack2.GeneralStatus getNewStatus();
}
