// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

public interface UpdateForumByIdResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:forum.UpdateForumByIdRes)
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
   * <code>.forum.Forum forum = 2;</code>
   * @return Whether the forum field is set.
   */
  boolean hasForum();
  /**
   * <code>.forum.Forum forum = 2;</code>
   * @return The forum.
   */
  info.moetang.serviceprotocol.protobuf.forum.Forum getForum();
  /**
   * <code>.forum.Forum forum = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.forum.ForumOrBuilder getForumOrBuilder();
}
