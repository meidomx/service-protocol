// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: note/note.proto

package info.moetang.serviceprotocol.protobuf.note;

public interface NoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:note.Note)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string note_id = 1;</code>
   * @return The noteId.
   */
  java.lang.String getNoteId();
  /**
   * <code>string note_id = 1;</code>
   * @return The bytes for noteId.
   */
  com.google.protobuf.ByteString
      getNoteIdBytes();

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
