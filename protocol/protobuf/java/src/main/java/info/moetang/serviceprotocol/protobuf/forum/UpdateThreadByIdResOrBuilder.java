// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface UpdateThreadByIdResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.UpdateThreadByIdRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.shared.Result result = 1;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.shared.Result result = 1;</code>
   * @return The result.
   */
  info.moetang.serviceprotocol.protobuf.shared.Result getResult();
  /**
   * <code>.shared.Result result = 1;</code>
   */
  info.moetang.serviceprotocol.protobuf.shared.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>.forum.Thread thread = 2;</code>
   * @return Whether the thread field is set.
   */
  boolean hasThread();
  /**
   * <code>.forum.Thread thread = 2;</code>
   * @return The thread.
   */
  info.moetang.serviceprotocol.protobuf.forum.Thread getThread();
  /**
   * <code>.forum.Thread thread = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.ThreadOrBuilder getThreadOrBuilder();
}
