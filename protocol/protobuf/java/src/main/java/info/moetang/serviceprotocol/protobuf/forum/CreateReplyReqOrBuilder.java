// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface CreateReplyReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.CreateReplyReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string thread_id = 1;</code>
   * @return The threadId.
   */
  java.lang.String getThreadId();
  /**
   * <code>string thread_id = 1;</code>
   * @return The bytes for threadId.
   */
  com.google.protobuf.ByteString
      getThreadIdBytes();

  /**
   * <code>string user_id = 2;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string content = 4;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 4;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();
}
