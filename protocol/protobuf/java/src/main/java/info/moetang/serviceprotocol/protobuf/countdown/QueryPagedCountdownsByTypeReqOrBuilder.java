// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: countdown/countdown.proto

package info.moetang.serviceprotocol.protobuf.countdown;

public interface QueryPagedCountdownsByTypeReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:countdown.QueryPagedCountdownsByTypeReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string countdown_type = 1;</code>
   * @return The countdownType.
   */
  java.lang.String getCountdownType();
  /**
   * <code>string countdown_type = 1;</code>
   * @return The bytes for countdownType.
   */
  com.google.protobuf.ByteString
      getCountdownTypeBytes();

  /**
   * <code>int64 page = 2;</code>
   * @return The page.
   */
  long getPage();

  /**
   * <code>int64 page_size = 3;</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <code>.countdown.CountdownExpireStatus expire_status = 4;</code>
   * @return The enum numeric value on the wire for expireStatus.
   */
  int getExpireStatusValue();
  /**
   * <code>.countdown.CountdownExpireStatus expire_status = 4;</code>
   * @return The expireStatus.
   */
  info.moetang.serviceprotocol.protobuf.countdown.CountdownExpireStatus getExpireStatus();
}
