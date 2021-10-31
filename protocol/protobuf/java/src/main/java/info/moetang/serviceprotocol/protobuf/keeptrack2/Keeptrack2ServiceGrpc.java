package info.moetang.serviceprotocol.protobuf.keeptrack2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: keeptrack2/keeptrack2.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Keeptrack2ServiceGrpc {

  private Keeptrack2ServiceGrpc() {}

  public static final String SERVICE_NAME = "keeptrack2.Keeptrack2Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq, info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes> getCreateProjectMethod;
    if ((getCreateProjectMethod = Keeptrack2ServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getCreateProjectMethod = Keeptrack2ServiceGrpc.getCreateProjectMethod) == null) {
          Keeptrack2ServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq, info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes> getDeleteProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProjectById",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes> getDeleteProjectByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq, info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes> getDeleteProjectByIdMethod;
    if ((getDeleteProjectByIdMethod = Keeptrack2ServiceGrpc.getDeleteProjectByIdMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getDeleteProjectByIdMethod = Keeptrack2ServiceGrpc.getDeleteProjectByIdMethod) == null) {
          Keeptrack2ServiceGrpc.getDeleteProjectByIdMethod = getDeleteProjectByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq, info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("DeleteProjectById"))
              .build();
        }
      }
    }
    return getDeleteProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes> getUpdateProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectById",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes> getUpdateProjectByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq, info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes> getUpdateProjectByIdMethod;
    if ((getUpdateProjectByIdMethod = Keeptrack2ServiceGrpc.getUpdateProjectByIdMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getUpdateProjectByIdMethod = Keeptrack2ServiceGrpc.getUpdateProjectByIdMethod) == null) {
          Keeptrack2ServiceGrpc.getUpdateProjectByIdMethod = getUpdateProjectByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq, info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("UpdateProjectById"))
              .build();
        }
      }
    }
    return getUpdateProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes> getQueryProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryProjectById",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes> getQueryProjectByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes> getQueryProjectByIdMethod;
    if ((getQueryProjectByIdMethod = Keeptrack2ServiceGrpc.getQueryProjectByIdMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getQueryProjectByIdMethod = Keeptrack2ServiceGrpc.getQueryProjectByIdMethod) == null) {
          Keeptrack2ServiceGrpc.getQueryProjectByIdMethod = getQueryProjectByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("QueryProjectById"))
              .build();
        }
      }
    }
    return getQueryProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes> getQueryAllProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllProjects",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes> getQueryAllProjectsMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes> getQueryAllProjectsMethod;
    if ((getQueryAllProjectsMethod = Keeptrack2ServiceGrpc.getQueryAllProjectsMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getQueryAllProjectsMethod = Keeptrack2ServiceGrpc.getQueryAllProjectsMethod) == null) {
          Keeptrack2ServiceGrpc.getQueryAllProjectsMethod = getQueryAllProjectsMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("QueryAllProjects"))
              .build();
        }
      }
    }
    return getQueryAllProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes> getCreateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateItem",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes> getCreateItemMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq, info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes> getCreateItemMethod;
    if ((getCreateItemMethod = Keeptrack2ServiceGrpc.getCreateItemMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getCreateItemMethod = Keeptrack2ServiceGrpc.getCreateItemMethod) == null) {
          Keeptrack2ServiceGrpc.getCreateItemMethod = getCreateItemMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq, info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("CreateItem"))
              .build();
        }
      }
    }
    return getCreateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes> getDeleteItemByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteItemById",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes> getDeleteItemByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq, info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes> getDeleteItemByIdMethod;
    if ((getDeleteItemByIdMethod = Keeptrack2ServiceGrpc.getDeleteItemByIdMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getDeleteItemByIdMethod = Keeptrack2ServiceGrpc.getDeleteItemByIdMethod) == null) {
          Keeptrack2ServiceGrpc.getDeleteItemByIdMethod = getDeleteItemByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq, info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteItemById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("DeleteItemById"))
              .build();
        }
      }
    }
    return getDeleteItemByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes> getUpdateItemByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItemById",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes> getUpdateItemByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq, info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes> getUpdateItemByIdMethod;
    if ((getUpdateItemByIdMethod = Keeptrack2ServiceGrpc.getUpdateItemByIdMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getUpdateItemByIdMethod = Keeptrack2ServiceGrpc.getUpdateItemByIdMethod) == null) {
          Keeptrack2ServiceGrpc.getUpdateItemByIdMethod = getUpdateItemByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq, info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateItemById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("UpdateItemById"))
              .build();
        }
      }
    }
    return getUpdateItemByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes> getQueryAvailableItemByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAvailableItemById",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes> getQueryAvailableItemByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes> getQueryAvailableItemByIdMethod;
    if ((getQueryAvailableItemByIdMethod = Keeptrack2ServiceGrpc.getQueryAvailableItemByIdMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getQueryAvailableItemByIdMethod = Keeptrack2ServiceGrpc.getQueryAvailableItemByIdMethod) == null) {
          Keeptrack2ServiceGrpc.getQueryAvailableItemByIdMethod = getQueryAvailableItemByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAvailableItemById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("QueryAvailableItemById"))
              .build();
        }
      }
    }
    return getQueryAvailableItemByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes> getQueryPagedAvailableItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPagedAvailableItems",
      requestType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq,
      info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes> getQueryPagedAvailableItemsMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes> getQueryPagedAvailableItemsMethod;
    if ((getQueryPagedAvailableItemsMethod = Keeptrack2ServiceGrpc.getQueryPagedAvailableItemsMethod) == null) {
      synchronized (Keeptrack2ServiceGrpc.class) {
        if ((getQueryPagedAvailableItemsMethod = Keeptrack2ServiceGrpc.getQueryPagedAvailableItemsMethod) == null) {
          Keeptrack2ServiceGrpc.getQueryPagedAvailableItemsMethod = getQueryPagedAvailableItemsMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq, info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPagedAvailableItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes.getDefaultInstance()))
              .setSchemaDescriptor(new Keeptrack2ServiceMethodDescriptorSupplier("QueryPagedAvailableItems"))
              .build();
        }
      }
    }
    return getQueryPagedAvailableItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Keeptrack2ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Keeptrack2ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Keeptrack2ServiceStub>() {
        @java.lang.Override
        public Keeptrack2ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Keeptrack2ServiceStub(channel, callOptions);
        }
      };
    return Keeptrack2ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Keeptrack2ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Keeptrack2ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Keeptrack2ServiceBlockingStub>() {
        @java.lang.Override
        public Keeptrack2ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Keeptrack2ServiceBlockingStub(channel, callOptions);
        }
      };
    return Keeptrack2ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Keeptrack2ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Keeptrack2ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Keeptrack2ServiceFutureStub>() {
        @java.lang.Override
        public Keeptrack2ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Keeptrack2ServiceFutureStub(channel, callOptions);
        }
      };
    return Keeptrack2ServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class Keeptrack2ServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProject(info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    public void deleteProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryProjectByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryAllProjects(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllProjectsMethod(), responseObserver);
    }

    /**
     */
    public void createItem(info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateItemMethod(), responseObserver);
    }

    /**
     */
    public void deleteItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteItemByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateItemByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryAvailableItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAvailableItemByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryPagedAvailableItems(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPagedAvailableItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getDeleteProjectByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes>(
                  this, METHODID_DELETE_PROJECT_BY_ID)))
          .addMethod(
            getUpdateProjectByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes>(
                  this, METHODID_UPDATE_PROJECT_BY_ID)))
          .addMethod(
            getQueryProjectByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes>(
                  this, METHODID_QUERY_PROJECT_BY_ID)))
          .addMethod(
            getQueryAllProjectsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes>(
                  this, METHODID_QUERY_ALL_PROJECTS)))
          .addMethod(
            getCreateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes>(
                  this, METHODID_CREATE_ITEM)))
          .addMethod(
            getDeleteItemByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes>(
                  this, METHODID_DELETE_ITEM_BY_ID)))
          .addMethod(
            getUpdateItemByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes>(
                  this, METHODID_UPDATE_ITEM_BY_ID)))
          .addMethod(
            getQueryAvailableItemByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes>(
                  this, METHODID_QUERY_AVAILABLE_ITEM_BY_ID)))
          .addMethod(
            getQueryPagedAvailableItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq,
                info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes>(
                  this, METHODID_QUERY_PAGED_AVAILABLE_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class Keeptrack2ServiceStub extends io.grpc.stub.AbstractAsyncStub<Keeptrack2ServiceStub> {
    private Keeptrack2ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Keeptrack2ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Keeptrack2ServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProject(info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllProjects(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createItem(info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteItemByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateItemByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAvailableItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAvailableItemByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPagedAvailableItems(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPagedAvailableItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Keeptrack2ServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<Keeptrack2ServiceBlockingStub> {
    private Keeptrack2ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Keeptrack2ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Keeptrack2ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes createProject(info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes deleteProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes updateProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes queryProjectById(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes queryAllProjects(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllProjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes createItem(info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes deleteItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteItemByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes updateItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateItemByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes queryAvailableItemById(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAvailableItemByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes queryPagedAvailableItems(info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPagedAvailableItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Keeptrack2ServiceFutureStub extends io.grpc.stub.AbstractFutureStub<Keeptrack2ServiceFutureStub> {
    private Keeptrack2ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Keeptrack2ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Keeptrack2ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes> createProject(
        info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes> deleteProjectById(
        info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes> updateProjectById(
        info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes> queryProjectById(
        info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes> queryAllProjects(
        info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllProjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes> createItem(
        info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes> deleteItemById(
        info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteItemByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes> updateItemById(
        info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateItemByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes> queryAvailableItemById(
        info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAvailableItemByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes> queryPagedAvailableItems(
        info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPagedAvailableItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_DELETE_PROJECT_BY_ID = 1;
  private static final int METHODID_UPDATE_PROJECT_BY_ID = 2;
  private static final int METHODID_QUERY_PROJECT_BY_ID = 3;
  private static final int METHODID_QUERY_ALL_PROJECTS = 4;
  private static final int METHODID_CREATE_ITEM = 5;
  private static final int METHODID_DELETE_ITEM_BY_ID = 6;
  private static final int METHODID_UPDATE_ITEM_BY_ID = 7;
  private static final int METHODID_QUERY_AVAILABLE_ITEM_BY_ID = 8;
  private static final int METHODID_QUERY_PAGED_AVAILABLE_ITEMS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Keeptrack2ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Keeptrack2ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateProjectRes>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT_BY_ID:
          serviceImpl.deleteProjectById((info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteProjectRes>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_BY_ID:
          serviceImpl.updateProjectById((info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes>) responseObserver);
          break;
        case METHODID_QUERY_PROJECT_BY_ID:
          serviceImpl.queryProjectById((info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryProjectByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_ALL_PROJECTS:
          serviceImpl.queryAllProjects((info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryAllProjectsRes>) responseObserver);
          break;
        case METHODID_CREATE_ITEM:
          serviceImpl.createItem((info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.CreateItemRes>) responseObserver);
          break;
        case METHODID_DELETE_ITEM_BY_ID:
          serviceImpl.deleteItemById((info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.DeleteItemRes>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM_BY_ID:
          serviceImpl.updateItemById((info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateItemRes>) responseObserver);
          break;
        case METHODID_QUERY_AVAILABLE_ITEM_BY_ID:
          serviceImpl.queryAvailableItemById((info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryItemByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_PAGED_AVAILABLE_ITEMS:
          serviceImpl.queryPagedAvailableItems((info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.keeptrack2.QueryPagedAvailableItemsRes>) responseObserver);
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

  private static abstract class Keeptrack2ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Keeptrack2ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Keeptrack2Service");
    }
  }

  private static final class Keeptrack2ServiceFileDescriptorSupplier
      extends Keeptrack2ServiceBaseDescriptorSupplier {
    Keeptrack2ServiceFileDescriptorSupplier() {}
  }

  private static final class Keeptrack2ServiceMethodDescriptorSupplier
      extends Keeptrack2ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Keeptrack2ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (Keeptrack2ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Keeptrack2ServiceFileDescriptorSupplier())
              .addMethod(getCreateProjectMethod())
              .addMethod(getDeleteProjectByIdMethod())
              .addMethod(getUpdateProjectByIdMethod())
              .addMethod(getQueryProjectByIdMethod())
              .addMethod(getQueryAllProjectsMethod())
              .addMethod(getCreateItemMethod())
              .addMethod(getDeleteItemByIdMethod())
              .addMethod(getUpdateItemByIdMethod())
              .addMethod(getQueryAvailableItemByIdMethod())
              .addMethod(getQueryPagedAvailableItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}