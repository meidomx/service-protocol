// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keeptrack2/keeptrack2.proto

package info.moetang.serviceprotocol.protobuf.keeptrack2;

public interface UpdateItemResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:keeptrack2.UpdateItemRes)
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
   * <code>.keeptrack2.Item item = 2;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <code>.keeptrack2.Item item = 2;</code>
   * @return The item.
   */
  info.moetang.serviceprotocol.protobuf.keeptrack2.Item getItem();
  /**
   * <code>.keeptrack2.Item item = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.keeptrack2.ItemOrBuilder getItemOrBuilder();
}
