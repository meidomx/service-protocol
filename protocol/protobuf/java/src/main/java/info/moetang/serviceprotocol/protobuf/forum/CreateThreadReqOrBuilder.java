// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface CreateThreadReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.CreateThreadReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string forum_id = 1;</code>
   * @return The forumId.
   */
  java.lang.String getForumId();
  /**
   * <code>string forum_id = 1;</code>
   * @return The bytes for forumId.
   */
  com.google.protobuf.ByteString
      getForumIdBytes();

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
}
