// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface ThreadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.Thread)
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
   * <code>string forum_id = 2;</code>
   * @return The forumId.
   */
  java.lang.String getForumId();
  /**
   * <code>string forum_id = 2;</code>
   * @return The bytes for forumId.
   */
  com.google.protobuf.ByteString
      getForumIdBytes();

  /**
   * <code>string user_id = 3;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 3;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string thread_title = 11;</code>
   * @return The threadTitle.
   */
  java.lang.String getThreadTitle();
  /**
   * <code>string thread_title = 11;</code>
   * @return The bytes for threadTitle.
   */
  com.google.protobuf.ByteString
      getThreadTitleBytes();

  /**
   * <code>string thread_content = 12;</code>
   * @return The threadContent.
   */
  java.lang.String getThreadContent();
  /**
   * <code>string thread_content = 12;</code>
   * @return The bytes for threadContent.
   */
  com.google.protobuf.ByteString
      getThreadContentBytes();

  /**
   * <code>int64 time_created = 21;</code>
   * @return The timeCreated.
   */
  long getTimeCreated();

  /**
   * <code>int64 time_updated = 22;</code>
   * @return The timeUpdated.
   */
  long getTimeUpdated();
}
