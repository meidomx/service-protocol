// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface QueryPagedThreadsByForumIdResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.QueryPagedThreadsByForumIdRes)
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
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  java.util.List<info.moetang.serviceprotocol.protobuf.forum.ThreadLite> 
      getThreadsList();
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.ThreadLite getThreads(int index);
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  int getThreadsCount();
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  java.util.List<? extends info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder> 
      getThreadsOrBuilderList();
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder getThreadsOrBuilder(
      int index);
}
