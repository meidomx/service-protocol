// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface ListAllForumsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.ListAllForumsRes)
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
   * <code>repeated .forum.Forum forums = 2;</code>
   */
  java.util.List<info.moetang.serviceprotocol.protobuf.forum.Forum> 
      getForumsList();
  /**
   * <code>repeated .forum.Forum forums = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.Forum getForums(int index);
  /**
   * <code>repeated .forum.Forum forums = 2;</code>
   */
  int getForumsCount();
  /**
   * <code>repeated .forum.Forum forums = 2;</code>
   */
  java.util.List<? extends info.moetang.serviceprotocol.protobuf.forum.ForumOrBuilder> 
      getForumsOrBuilderList();
  /**
   * <code>repeated .forum.Forum forums = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.ForumOrBuilder getForumsOrBuilder(
      int index);
}
