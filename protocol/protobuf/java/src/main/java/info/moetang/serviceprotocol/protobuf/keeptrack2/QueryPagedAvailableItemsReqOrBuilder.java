// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keeptrack2/keeptrack2.proto

package info.moetang.serviceprotocol.protobuf.keeptrack2;

public interface QueryPagedAvailableItemsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:keeptrack2.QueryPagedAvailableItemsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>int64 page = 2;</code>
   * @return The page.
   */
  long getPage();

  /**
   * <code>int64 page_size = 3;</code>
   * @return The pageSize.
   */
  long getPageSize();
}
