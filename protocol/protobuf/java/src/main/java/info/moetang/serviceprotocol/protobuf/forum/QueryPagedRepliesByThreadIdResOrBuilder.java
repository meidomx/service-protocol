// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface QueryPagedRepliesByThreadIdResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.QueryPagedRepliesByThreadIdRes)
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
   * <code>repeated .forum.Reply replies = 2;</code>
   */
  java.util.List<info.moetang.serviceprotocol.protobuf.forum.Reply> 
      getRepliesList();
  /**
   * <code>repeated .forum.Reply replies = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.Reply getReplies(int index);
  /**
   * <code>repeated .forum.Reply replies = 2;</code>
   */
  int getRepliesCount();
  /**
   * <code>repeated .forum.Reply replies = 2;</code>
   */
  java.util.List<? extends info.moetang.serviceprotocol.protobuf.forum.ReplyOrBuilder> 
      getRepliesOrBuilderList();
  /**
   * <code>repeated .forum.Reply replies = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.ReplyOrBuilder getRepliesOrBuilder(
      int index);
}
