// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: countdown/countdown.proto

package info.moetang.serviceprotocol.protobuf.countdown;

public interface CreateCountdownReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:countdown.CreateCountdownReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string countdown_type = 2;</code>
   * @return The countdownType.
   */
  java.lang.String getCountdownType();
  /**
   * <code>string countdown_type = 2;</code>
   * @return The bytes for countdownType.
   */
  com.google.protobuf.ByteString
      getCountdownTypeBytes();

  /**
   * <code>string title = 11;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 11;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string content = 12;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 12;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>int64 time_expired = 21;</code>
   * @return The timeExpired.
   */
  long getTimeExpired();
}