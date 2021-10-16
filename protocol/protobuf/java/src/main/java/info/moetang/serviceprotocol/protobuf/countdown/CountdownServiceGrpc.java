package info.moetang.serviceprotocol.protobuf.countdown;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: countdown/countdown.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CountdownServiceGrpc {

  private CountdownServiceGrpc() {}

  public static final String SERVICE_NAME = "countdown.CountdownService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq,
      info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes> getCreateCountdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCountdown",
      requestType = info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq,
      info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes> getCreateCountdownMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq, info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes> getCreateCountdownMethod;
    if ((getCreateCountdownMethod = CountdownServiceGrpc.getCreateCountdownMethod) == null) {
      synchronized (CountdownServiceGrpc.class) {
        if ((getCreateCountdownMethod = CountdownServiceGrpc.getCreateCountdownMethod) == null) {
          CountdownServiceGrpc.getCreateCountdownMethod = getCreateCountdownMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq, info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCountdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes.getDefaultInstance()))
              .setSchemaDescriptor(new CountdownServiceMethodDescriptorSupplier("CreateCountdown"))
              .build();
        }
      }
    }
    return getCreateCountdownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq,
      info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes> getNextCountdownIntervalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextCountdownIntervalById",
      requestType = info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq,
      info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes> getNextCountdownIntervalByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq, info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes> getNextCountdownIntervalByIdMethod;
    if ((getNextCountdownIntervalByIdMethod = CountdownServiceGrpc.getNextCountdownIntervalByIdMethod) == null) {
      synchronized (CountdownServiceGrpc.class) {
        if ((getNextCountdownIntervalByIdMethod = CountdownServiceGrpc.getNextCountdownIntervalByIdMethod) == null) {
          CountdownServiceGrpc.getNextCountdownIntervalByIdMethod = getNextCountdownIntervalByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq, info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextCountdownIntervalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new CountdownServiceMethodDescriptorSupplier("NextCountdownIntervalById"))
              .build();
        }
      }
    }
    return getNextCountdownIntervalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq,
      info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes> getQueryCountdownByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCountdownById",
      requestType = info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq,
      info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes> getQueryCountdownByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq, info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes> getQueryCountdownByIdMethod;
    if ((getQueryCountdownByIdMethod = CountdownServiceGrpc.getQueryCountdownByIdMethod) == null) {
      synchronized (CountdownServiceGrpc.class) {
        if ((getQueryCountdownByIdMethod = CountdownServiceGrpc.getQueryCountdownByIdMethod) == null) {
          CountdownServiceGrpc.getQueryCountdownByIdMethod = getQueryCountdownByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq, info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCountdownById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new CountdownServiceMethodDescriptorSupplier("QueryCountdownById"))
              .build();
        }
      }
    }
    return getQueryCountdownByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq,
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes> getQueryPagedExpringCountdownsByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPagedExpringCountdownsByType",
      requestType = info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq,
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes> getQueryPagedExpringCountdownsByTypeMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq, info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes> getQueryPagedExpringCountdownsByTypeMethod;
    if ((getQueryPagedExpringCountdownsByTypeMethod = CountdownServiceGrpc.getQueryPagedExpringCountdownsByTypeMethod) == null) {
      synchronized (CountdownServiceGrpc.class) {
        if ((getQueryPagedExpringCountdownsByTypeMethod = CountdownServiceGrpc.getQueryPagedExpringCountdownsByTypeMethod) == null) {
          CountdownServiceGrpc.getQueryPagedExpringCountdownsByTypeMethod = getQueryPagedExpringCountdownsByTypeMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq, info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPagedExpringCountdownsByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes.getDefaultInstance()))
              .setSchemaDescriptor(new CountdownServiceMethodDescriptorSupplier("QueryPagedExpringCountdownsByType"))
              .build();
        }
      }
    }
    return getQueryPagedExpringCountdownsByTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq,
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes> getQueryPagedCountdownsByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPagedCountdownsByType",
      requestType = info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq,
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes> getQueryPagedCountdownsByTypeMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq, info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes> getQueryPagedCountdownsByTypeMethod;
    if ((getQueryPagedCountdownsByTypeMethod = CountdownServiceGrpc.getQueryPagedCountdownsByTypeMethod) == null) {
      synchronized (CountdownServiceGrpc.class) {
        if ((getQueryPagedCountdownsByTypeMethod = CountdownServiceGrpc.getQueryPagedCountdownsByTypeMethod) == null) {
          CountdownServiceGrpc.getQueryPagedCountdownsByTypeMethod = getQueryPagedCountdownsByTypeMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq, info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPagedCountdownsByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes.getDefaultInstance()))
              .setSchemaDescriptor(new CountdownServiceMethodDescriptorSupplier("QueryPagedCountdownsByType"))
              .build();
        }
      }
    }
    return getQueryPagedCountdownsByTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CountdownServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountdownServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountdownServiceStub>() {
        @java.lang.Override
        public CountdownServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountdownServiceStub(channel, callOptions);
        }
      };
    return CountdownServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CountdownServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountdownServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountdownServiceBlockingStub>() {
        @java.lang.Override
        public CountdownServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountdownServiceBlockingStub(channel, callOptions);
        }
      };
    return CountdownServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CountdownServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountdownServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountdownServiceFutureStub>() {
        @java.lang.Override
        public CountdownServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountdownServiceFutureStub(channel, callOptions);
        }
      };
    return CountdownServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CountdownServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCountdown(info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCountdownMethod(), responseObserver);
    }

    /**
     */
    public void nextCountdownIntervalById(info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextCountdownIntervalByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryCountdownById(info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCountdownByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryPagedExpringCountdownsByType(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPagedExpringCountdownsByTypeMethod(), responseObserver);
    }

    /**
     */
    public void queryPagedCountdownsByType(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPagedCountdownsByTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCountdownMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq,
                info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes>(
                  this, METHODID_CREATE_COUNTDOWN)))
          .addMethod(
            getNextCountdownIntervalByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq,
                info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes>(
                  this, METHODID_NEXT_COUNTDOWN_INTERVAL_BY_ID)))
          .addMethod(
            getQueryCountdownByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq,
                info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes>(
                  this, METHODID_QUERY_COUNTDOWN_BY_ID)))
          .addMethod(
            getQueryPagedExpringCountdownsByTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq,
                info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes>(
                  this, METHODID_QUERY_PAGED_EXPRING_COUNTDOWNS_BY_TYPE)))
          .addMethod(
            getQueryPagedCountdownsByTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq,
                info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes>(
                  this, METHODID_QUERY_PAGED_COUNTDOWNS_BY_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class CountdownServiceStub extends io.grpc.stub.AbstractAsyncStub<CountdownServiceStub> {
    private CountdownServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountdownServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountdownServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCountdown(info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCountdownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nextCountdownIntervalById(info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextCountdownIntervalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryCountdownById(info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCountdownByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPagedExpringCountdownsByType(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPagedExpringCountdownsByTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPagedCountdownsByType(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPagedCountdownsByTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CountdownServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CountdownServiceBlockingStub> {
    private CountdownServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountdownServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountdownServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes createCountdown(info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCountdownMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes nextCountdownIntervalById(info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextCountdownIntervalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes queryCountdownById(info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCountdownByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes queryPagedExpringCountdownsByType(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPagedExpringCountdownsByTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes queryPagedCountdownsByType(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPagedCountdownsByTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CountdownServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CountdownServiceFutureStub> {
    private CountdownServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountdownServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountdownServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes> createCountdown(
        info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCountdownMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes> nextCountdownIntervalById(
        info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextCountdownIntervalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes> queryCountdownById(
        info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCountdownByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes> queryPagedExpringCountdownsByType(
        info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPagedExpringCountdownsByTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes> queryPagedCountdownsByType(
        info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPagedCountdownsByTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COUNTDOWN = 0;
  private static final int METHODID_NEXT_COUNTDOWN_INTERVAL_BY_ID = 1;
  private static final int METHODID_QUERY_COUNTDOWN_BY_ID = 2;
  private static final int METHODID_QUERY_PAGED_EXPRING_COUNTDOWNS_BY_TYPE = 3;
  private static final int METHODID_QUERY_PAGED_COUNTDOWNS_BY_TYPE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CountdownServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CountdownServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COUNTDOWN:
          serviceImpl.createCountdown((info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.CreateCountdownRes>) responseObserver);
          break;
        case METHODID_NEXT_COUNTDOWN_INTERVAL_BY_ID:
          serviceImpl.nextCountdownIntervalById((info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_COUNTDOWN_BY_ID:
          serviceImpl.queryCountdownById((info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryCountdownByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_PAGED_EXPRING_COUNTDOWNS_BY_TYPE:
          serviceImpl.queryPagedExpringCountdownsByType((info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeRes>) responseObserver);
          break;
        case METHODID_QUERY_PAGED_COUNTDOWNS_BY_TYPE:
          serviceImpl.queryPagedCountdownsByType((info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.countdown.QueryPagedCountdownsByTypeRes>) responseObserver);
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

  private static abstract class CountdownServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CountdownServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CountdownService");
    }
  }

  private static final class CountdownServiceFileDescriptorSupplier
      extends CountdownServiceBaseDescriptorSupplier {
    CountdownServiceFileDescriptorSupplier() {}
  }

  private static final class CountdownServiceMethodDescriptorSupplier
      extends CountdownServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CountdownServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CountdownServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CountdownServiceFileDescriptorSupplier())
              .addMethod(getCreateCountdownMethod())
              .addMethod(getNextCountdownIntervalByIdMethod())
              .addMethod(getQueryCountdownByIdMethod())
              .addMethod(getQueryPagedExpringCountdownsByTypeMethod())
              .addMethod(getQueryPagedCountdownsByTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
