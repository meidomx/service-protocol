package info.moetang.serviceprotocol.protobuf.forum;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: forum/forum.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ForumServiceGrpc {

  private ForumServiceGrpc() {}

  public static final String SERVICE_NAME = "forum.ForumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateForumReq,
      info.moetang.serviceprotocol.protobuf.forum.CreateForumRes> getCreateForumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateForum",
      requestType = info.moetang.serviceprotocol.protobuf.forum.CreateForumReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.CreateForumRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateForumReq,
      info.moetang.serviceprotocol.protobuf.forum.CreateForumRes> getCreateForumMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateForumReq, info.moetang.serviceprotocol.protobuf.forum.CreateForumRes> getCreateForumMethod;
    if ((getCreateForumMethod = ForumServiceGrpc.getCreateForumMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getCreateForumMethod = ForumServiceGrpc.getCreateForumMethod) == null) {
          ForumServiceGrpc.getCreateForumMethod = getCreateForumMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.CreateForumReq, info.moetang.serviceprotocol.protobuf.forum.CreateForumRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateForum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.CreateForumReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.CreateForumRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("CreateForum"))
              .build();
        }
      }
    }
    return getCreateForumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes> getUpdateForumByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateForumById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes> getUpdateForumByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq, info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes> getUpdateForumByIdMethod;
    if ((getUpdateForumByIdMethod = ForumServiceGrpc.getUpdateForumByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getUpdateForumByIdMethod = ForumServiceGrpc.getUpdateForumByIdMethod) == null) {
          ForumServiceGrpc.getUpdateForumByIdMethod = getUpdateForumByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq, info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateForumById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("UpdateForumById"))
              .build();
        }
      }
    }
    return getUpdateForumByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes> getDeleteForumByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteForumById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes> getDeleteForumByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq, info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes> getDeleteForumByIdMethod;
    if ((getDeleteForumByIdMethod = ForumServiceGrpc.getDeleteForumByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getDeleteForumByIdMethod = ForumServiceGrpc.getDeleteForumByIdMethod) == null) {
          ForumServiceGrpc.getDeleteForumByIdMethod = getDeleteForumByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq, info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteForumById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("DeleteForumById"))
              .build();
        }
      }
    }
    return getDeleteForumByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq,
      info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes> getListAllForumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllForums",
      requestType = info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq,
      info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes> getListAllForumsMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq, info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes> getListAllForumsMethod;
    if ((getListAllForumsMethod = ForumServiceGrpc.getListAllForumsMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getListAllForumsMethod = ForumServiceGrpc.getListAllForumsMethod) == null) {
          ForumServiceGrpc.getListAllForumsMethod = getListAllForumsMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq, info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllForums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("ListAllForums"))
              .build();
        }
      }
    }
    return getListAllForumsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes> getQueryForumByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryForumById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes> getQueryForumByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes> getQueryForumByIdMethod;
    if ((getQueryForumByIdMethod = ForumServiceGrpc.getQueryForumByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getQueryForumByIdMethod = ForumServiceGrpc.getQueryForumByIdMethod) == null) {
          ForumServiceGrpc.getQueryForumByIdMethod = getQueryForumByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryForumById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("QueryForumById"))
              .build();
        }
      }
    }
    return getQueryForumByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq,
      info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes> getCreateThreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateThread",
      requestType = info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq,
      info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes> getCreateThreadMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq, info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes> getCreateThreadMethod;
    if ((getCreateThreadMethod = ForumServiceGrpc.getCreateThreadMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getCreateThreadMethod = ForumServiceGrpc.getCreateThreadMethod) == null) {
          ForumServiceGrpc.getCreateThreadMethod = getCreateThreadMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq, info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateThread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("CreateThread"))
              .build();
        }
      }
    }
    return getCreateThreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes> getUpdateThreadByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateThreadById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes> getUpdateThreadByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq, info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes> getUpdateThreadByIdMethod;
    if ((getUpdateThreadByIdMethod = ForumServiceGrpc.getUpdateThreadByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getUpdateThreadByIdMethod = ForumServiceGrpc.getUpdateThreadByIdMethod) == null) {
          ForumServiceGrpc.getUpdateThreadByIdMethod = getUpdateThreadByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq, info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateThreadById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("UpdateThreadById"))
              .build();
        }
      }
    }
    return getUpdateThreadByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes> getDeleteThreadByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteThreadById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes> getDeleteThreadByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq, info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes> getDeleteThreadByIdMethod;
    if ((getDeleteThreadByIdMethod = ForumServiceGrpc.getDeleteThreadByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getDeleteThreadByIdMethod = ForumServiceGrpc.getDeleteThreadByIdMethod) == null) {
          ForumServiceGrpc.getDeleteThreadByIdMethod = getDeleteThreadByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq, info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteThreadById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("DeleteThreadById"))
              .build();
        }
      }
    }
    return getDeleteThreadByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes> getQueryThreadByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryThreadById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes> getQueryThreadByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes> getQueryThreadByIdMethod;
    if ((getQueryThreadByIdMethod = ForumServiceGrpc.getQueryThreadByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getQueryThreadByIdMethod = ForumServiceGrpc.getQueryThreadByIdMethod) == null) {
          ForumServiceGrpc.getQueryThreadByIdMethod = getQueryThreadByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryThreadById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("QueryThreadById"))
              .build();
        }
      }
    }
    return getQueryThreadByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes> getQueryPagedThreadTitlesByForumIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPagedThreadTitlesByForumId",
      requestType = info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes> getQueryPagedThreadTitlesByForumIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes> getQueryPagedThreadTitlesByForumIdMethod;
    if ((getQueryPagedThreadTitlesByForumIdMethod = ForumServiceGrpc.getQueryPagedThreadTitlesByForumIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getQueryPagedThreadTitlesByForumIdMethod = ForumServiceGrpc.getQueryPagedThreadTitlesByForumIdMethod) == null) {
          ForumServiceGrpc.getQueryPagedThreadTitlesByForumIdMethod = getQueryPagedThreadTitlesByForumIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPagedThreadTitlesByForumId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("QueryPagedThreadTitlesByForumId"))
              .build();
        }
      }
    }
    return getQueryPagedThreadTitlesByForumIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq,
      info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes> getCreateReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReply",
      requestType = info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq,
      info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes> getCreateReplyMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq, info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes> getCreateReplyMethod;
    if ((getCreateReplyMethod = ForumServiceGrpc.getCreateReplyMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getCreateReplyMethod = ForumServiceGrpc.getCreateReplyMethod) == null) {
          ForumServiceGrpc.getCreateReplyMethod = getCreateReplyMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq, info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("CreateReply"))
              .build();
        }
      }
    }
    return getCreateReplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq,
      info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes> getUpdateReplyByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReplyById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq,
      info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes> getUpdateReplyByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq, info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes> getUpdateReplyByIdMethod;
    if ((getUpdateReplyByIdMethod = ForumServiceGrpc.getUpdateReplyByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getUpdateReplyByIdMethod = ForumServiceGrpc.getUpdateReplyByIdMethod) == null) {
          ForumServiceGrpc.getUpdateReplyByIdMethod = getUpdateReplyByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq, info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReplyById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("UpdateReplyById"))
              .build();
        }
      }
    }
    return getUpdateReplyByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes> getDeleteReplyByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReplyById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes> getDeleteReplyByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq, info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes> getDeleteReplyByIdMethod;
    if ((getDeleteReplyByIdMethod = ForumServiceGrpc.getDeleteReplyByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getDeleteReplyByIdMethod = ForumServiceGrpc.getDeleteReplyByIdMethod) == null) {
          ForumServiceGrpc.getDeleteReplyByIdMethod = getDeleteReplyByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq, info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReplyById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("DeleteReplyById"))
              .build();
        }
      }
    }
    return getDeleteReplyByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes> getQueryReplyByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryReplyById",
      requestType = info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes> getQueryReplyByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes> getQueryReplyByIdMethod;
    if ((getQueryReplyByIdMethod = ForumServiceGrpc.getQueryReplyByIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getQueryReplyByIdMethod = ForumServiceGrpc.getQueryReplyByIdMethod) == null) {
          ForumServiceGrpc.getQueryReplyByIdMethod = getQueryReplyByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryReplyById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("QueryReplyById"))
              .build();
        }
      }
    }
    return getQueryReplyByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes> getQueryPagedRepliesByThreadIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPagedRepliesByThreadId",
      requestType = info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq,
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes> getQueryPagedRepliesByThreadIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes> getQueryPagedRepliesByThreadIdMethod;
    if ((getQueryPagedRepliesByThreadIdMethod = ForumServiceGrpc.getQueryPagedRepliesByThreadIdMethod) == null) {
      synchronized (ForumServiceGrpc.class) {
        if ((getQueryPagedRepliesByThreadIdMethod = ForumServiceGrpc.getQueryPagedRepliesByThreadIdMethod) == null) {
          ForumServiceGrpc.getQueryPagedRepliesByThreadIdMethod = getQueryPagedRepliesByThreadIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq, info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPagedRepliesByThreadId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new ForumServiceMethodDescriptorSupplier("QueryPagedRepliesByThreadId"))
              .build();
        }
      }
    }
    return getQueryPagedRepliesByThreadIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ForumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ForumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ForumServiceStub>() {
        @java.lang.Override
        public ForumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ForumServiceStub(channel, callOptions);
        }
      };
    return ForumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ForumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ForumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ForumServiceBlockingStub>() {
        @java.lang.Override
        public ForumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ForumServiceBlockingStub(channel, callOptions);
        }
      };
    return ForumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ForumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ForumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ForumServiceFutureStub>() {
        @java.lang.Override
        public ForumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ForumServiceFutureStub(channel, callOptions);
        }
      };
    return ForumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ForumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createForum(info.moetang.serviceprotocol.protobuf.forum.CreateForumReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateForumRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateForumMethod(), responseObserver);
    }

    /**
     */
    public void updateForumById(info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateForumByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteForumById(info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteForumByIdMethod(), responseObserver);
    }

    /**
     */
    public void listAllForums(info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllForumsMethod(), responseObserver);
    }

    /**
     */
    public void queryForumById(info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryForumByIdMethod(), responseObserver);
    }

    /**
     */
    public void createThread(info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateThreadMethod(), responseObserver);
    }

    /**
     */
    public void updateThreadById(info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateThreadByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteThreadById(info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteThreadByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryThreadById(info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryThreadByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryPagedThreadTitlesByForumId(info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPagedThreadTitlesByForumIdMethod(), responseObserver);
    }

    /**
     */
    public void createReply(info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReplyMethod(), responseObserver);
    }

    /**
     */
    public void updateReplyById(info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReplyByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteReplyById(info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReplyByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryReplyById(info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryReplyByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryPagedRepliesByThreadId(info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPagedRepliesByThreadIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateForumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.CreateForumReq,
                info.moetang.serviceprotocol.protobuf.forum.CreateForumRes>(
                  this, METHODID_CREATE_FORUM)))
          .addMethod(
            getUpdateForumByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes>(
                  this, METHODID_UPDATE_FORUM_BY_ID)))
          .addMethod(
            getDeleteForumByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes>(
                  this, METHODID_DELETE_FORUM_BY_ID)))
          .addMethod(
            getListAllForumsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq,
                info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes>(
                  this, METHODID_LIST_ALL_FORUMS)))
          .addMethod(
            getQueryForumByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes>(
                  this, METHODID_QUERY_FORUM_BY_ID)))
          .addMethod(
            getCreateThreadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq,
                info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes>(
                  this, METHODID_CREATE_THREAD)))
          .addMethod(
            getUpdateThreadByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes>(
                  this, METHODID_UPDATE_THREAD_BY_ID)))
          .addMethod(
            getDeleteThreadByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes>(
                  this, METHODID_DELETE_THREAD_BY_ID)))
          .addMethod(
            getQueryThreadByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes>(
                  this, METHODID_QUERY_THREAD_BY_ID)))
          .addMethod(
            getQueryPagedThreadTitlesByForumIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq,
                info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes>(
                  this, METHODID_QUERY_PAGED_THREAD_TITLES_BY_FORUM_ID)))
          .addMethod(
            getCreateReplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq,
                info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes>(
                  this, METHODID_CREATE_REPLY)))
          .addMethod(
            getUpdateReplyByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq,
                info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes>(
                  this, METHODID_UPDATE_REPLY_BY_ID)))
          .addMethod(
            getDeleteReplyByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes>(
                  this, METHODID_DELETE_REPLY_BY_ID)))
          .addMethod(
            getQueryReplyByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq,
                info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes>(
                  this, METHODID_QUERY_REPLY_BY_ID)))
          .addMethod(
            getQueryPagedRepliesByThreadIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq,
                info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes>(
                  this, METHODID_QUERY_PAGED_REPLIES_BY_THREAD_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ForumServiceStub extends io.grpc.stub.AbstractAsyncStub<ForumServiceStub> {
    private ForumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ForumServiceStub(channel, callOptions);
    }

    /**
     */
    public void createForum(info.moetang.serviceprotocol.protobuf.forum.CreateForumReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateForumRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateForumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateForumById(info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateForumByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteForumById(info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteForumByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAllForums(info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllForumsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryForumById(info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryForumByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createThread(info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateThreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateThreadById(info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateThreadByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteThreadById(info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteThreadByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryThreadById(info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryThreadByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPagedThreadTitlesByForumId(info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPagedThreadTitlesByForumIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createReply(info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReplyById(info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReplyByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReplyById(info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReplyByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryReplyById(info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryReplyByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPagedRepliesByThreadId(info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPagedRepliesByThreadIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ForumServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ForumServiceBlockingStub> {
    private ForumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ForumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.CreateForumRes createForum(info.moetang.serviceprotocol.protobuf.forum.CreateForumReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateForumMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes updateForumById(info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateForumByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes deleteForumById(info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteForumByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes listAllForums(info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllForumsMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes queryForumById(info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryForumByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes createThread(info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateThreadMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes updateThreadById(info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateThreadByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes deleteThreadById(info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteThreadByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes queryThreadById(info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryThreadByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes queryPagedThreadTitlesByForumId(info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPagedThreadTitlesByForumIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes createReply(info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes updateReplyById(info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReplyByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes deleteReplyById(info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReplyByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes queryReplyById(info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryReplyByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes queryPagedRepliesByThreadId(info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPagedRepliesByThreadIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ForumServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ForumServiceFutureStub> {
    private ForumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ForumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.CreateForumRes> createForum(
        info.moetang.serviceprotocol.protobuf.forum.CreateForumReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateForumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes> updateForumById(
        info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateForumByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes> deleteForumById(
        info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteForumByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes> listAllForums(
        info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllForumsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes> queryForumById(
        info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryForumByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes> createThread(
        info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateThreadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes> updateThreadById(
        info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateThreadByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes> deleteThreadById(
        info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteThreadByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes> queryThreadById(
        info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryThreadByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes> queryPagedThreadTitlesByForumId(
        info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPagedThreadTitlesByForumIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes> createReply(
        info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes> updateReplyById(
        info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReplyByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes> deleteReplyById(
        info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReplyByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes> queryReplyById(
        info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryReplyByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes> queryPagedRepliesByThreadId(
        info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPagedRepliesByThreadIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FORUM = 0;
  private static final int METHODID_UPDATE_FORUM_BY_ID = 1;
  private static final int METHODID_DELETE_FORUM_BY_ID = 2;
  private static final int METHODID_LIST_ALL_FORUMS = 3;
  private static final int METHODID_QUERY_FORUM_BY_ID = 4;
  private static final int METHODID_CREATE_THREAD = 5;
  private static final int METHODID_UPDATE_THREAD_BY_ID = 6;
  private static final int METHODID_DELETE_THREAD_BY_ID = 7;
  private static final int METHODID_QUERY_THREAD_BY_ID = 8;
  private static final int METHODID_QUERY_PAGED_THREAD_TITLES_BY_FORUM_ID = 9;
  private static final int METHODID_CREATE_REPLY = 10;
  private static final int METHODID_UPDATE_REPLY_BY_ID = 11;
  private static final int METHODID_DELETE_REPLY_BY_ID = 12;
  private static final int METHODID_QUERY_REPLY_BY_ID = 13;
  private static final int METHODID_QUERY_PAGED_REPLIES_BY_THREAD_ID = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ForumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ForumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FORUM:
          serviceImpl.createForum((info.moetang.serviceprotocol.protobuf.forum.CreateForumReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateForumRes>) responseObserver);
          break;
        case METHODID_UPDATE_FORUM_BY_ID:
          serviceImpl.updateForumById((info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateForumByIdRes>) responseObserver);
          break;
        case METHODID_DELETE_FORUM_BY_ID:
          serviceImpl.deleteForumById((info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteForumByIdRes>) responseObserver);
          break;
        case METHODID_LIST_ALL_FORUMS:
          serviceImpl.listAllForums((info.moetang.serviceprotocol.protobuf.forum.ListAllForumsReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.ListAllForumsRes>) responseObserver);
          break;
        case METHODID_QUERY_FORUM_BY_ID:
          serviceImpl.queryForumById((info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryForumByIdRes>) responseObserver);
          break;
        case METHODID_CREATE_THREAD:
          serviceImpl.createThread((info.moetang.serviceprotocol.protobuf.forum.CreateThreadReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateThreadRes>) responseObserver);
          break;
        case METHODID_UPDATE_THREAD_BY_ID:
          serviceImpl.updateThreadById((info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateThreadByIdRes>) responseObserver);
          break;
        case METHODID_DELETE_THREAD_BY_ID:
          serviceImpl.deleteThreadById((info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteThreadByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_THREAD_BY_ID:
          serviceImpl.queryThreadById((info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryThreadByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_PAGED_THREAD_TITLES_BY_FORUM_ID:
          serviceImpl.queryPagedThreadTitlesByForumId((info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes>) responseObserver);
          break;
        case METHODID_CREATE_REPLY:
          serviceImpl.createReply((info.moetang.serviceprotocol.protobuf.forum.CreateReplyReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.CreateReplyRes>) responseObserver);
          break;
        case METHODID_UPDATE_REPLY_BY_ID:
          serviceImpl.updateReplyById((info.moetang.serviceprotocol.protobuf.forum.UpdateReplyReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.UpdateReplyRes>) responseObserver);
          break;
        case METHODID_DELETE_REPLY_BY_ID:
          serviceImpl.deleteReplyById((info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_REPLY_BY_ID:
          serviceImpl.queryReplyById((info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryReplyByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_PAGED_REPLIES_BY_THREAD_ID:
          serviceImpl.queryPagedRepliesByThreadId((info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.forum.QueryPagedRepliesByThreadIdRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ForumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ForumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ForumService");
    }
  }

  private static final class ForumServiceFileDescriptorSupplier
      extends ForumServiceBaseDescriptorSupplier {
    ForumServiceFileDescriptorSupplier() {}
  }

  private static final class ForumServiceMethodDescriptorSupplier
      extends ForumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ForumServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ForumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ForumServiceFileDescriptorSupplier())
              .addMethod(getCreateForumMethod())
              .addMethod(getUpdateForumByIdMethod())
              .addMethod(getDeleteForumByIdMethod())
              .addMethod(getListAllForumsMethod())
              .addMethod(getQueryForumByIdMethod())
              .addMethod(getCreateThreadMethod())
              .addMethod(getUpdateThreadByIdMethod())
              .addMethod(getDeleteThreadByIdMethod())
              .addMethod(getQueryThreadByIdMethod())
              .addMethod(getQueryPagedThreadTitlesByForumIdMethod())
              .addMethod(getCreateReplyMethod())
              .addMethod(getUpdateReplyByIdMethod())
              .addMethod(getDeleteReplyByIdMethod())
              .addMethod(getQueryReplyByIdMethod())
              .addMethod(getQueryPagedRepliesByThreadIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
