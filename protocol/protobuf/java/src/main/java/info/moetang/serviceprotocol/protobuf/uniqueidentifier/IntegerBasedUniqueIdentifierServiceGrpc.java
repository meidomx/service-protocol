package info.moetang.serviceprotocol.protobuf.uniqueidentifier;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: uniqueidentifier/integerbased.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntegerBasedUniqueIdentifierServiceGrpc {

  private IntegerBasedUniqueIdentifierServiceGrpc() {}

  public static final String SERVICE_NAME = "uniqueidentifier.IntegerBasedUniqueIdentifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq,
      info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Generate",
      requestType = info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq,
      info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes> getGenerateMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq, info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes> getGenerateMethod;
    if ((getGenerateMethod = IntegerBasedUniqueIdentifierServiceGrpc.getGenerateMethod) == null) {
      synchronized (IntegerBasedUniqueIdentifierServiceGrpc.class) {
        if ((getGenerateMethod = IntegerBasedUniqueIdentifierServiceGrpc.getGenerateMethod) == null) {
          IntegerBasedUniqueIdentifierServiceGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq, info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegerBasedUniqueIdentifierServiceMethodDescriptorSupplier("Generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegerBasedUniqueIdentifierServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegerBasedUniqueIdentifierServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegerBasedUniqueIdentifierServiceStub>() {
        @java.lang.Override
        public IntegerBasedUniqueIdentifierServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegerBasedUniqueIdentifierServiceStub(channel, callOptions);
        }
      };
    return IntegerBasedUniqueIdentifierServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegerBasedUniqueIdentifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegerBasedUniqueIdentifierServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegerBasedUniqueIdentifierServiceBlockingStub>() {
        @java.lang.Override
        public IntegerBasedUniqueIdentifierServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegerBasedUniqueIdentifierServiceBlockingStub(channel, callOptions);
        }
      };
    return IntegerBasedUniqueIdentifierServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntegerBasedUniqueIdentifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegerBasedUniqueIdentifierServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegerBasedUniqueIdentifierServiceFutureStub>() {
        @java.lang.Override
        public IntegerBasedUniqueIdentifierServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegerBasedUniqueIdentifierServiceFutureStub(channel, callOptions);
        }
      };
    return IntegerBasedUniqueIdentifierServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class IntegerBasedUniqueIdentifierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generate(info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq,
                info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes>(
                  this, METHODID_GENERATE)))
          .build();
    }
  }

  /**
   */
  public static final class IntegerBasedUniqueIdentifierServiceStub extends io.grpc.stub.AbstractAsyncStub<IntegerBasedUniqueIdentifierServiceStub> {
    private IntegerBasedUniqueIdentifierServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegerBasedUniqueIdentifierServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegerBasedUniqueIdentifierServiceStub(channel, callOptions);
    }

    /**
     */
    public void generate(info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntegerBasedUniqueIdentifierServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IntegerBasedUniqueIdentifierServiceBlockingStub> {
    private IntegerBasedUniqueIdentifierServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegerBasedUniqueIdentifierServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegerBasedUniqueIdentifierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes generate(info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntegerBasedUniqueIdentifierServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IntegerBasedUniqueIdentifierServiceFutureStub> {
    private IntegerBasedUniqueIdentifierServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegerBasedUniqueIdentifierServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegerBasedUniqueIdentifierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes> generate(
        info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegerBasedUniqueIdentifierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntegerBasedUniqueIdentifierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE:
          serviceImpl.generate((info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.uniqueidentifier.GenerateIntegerRes>) responseObserver);
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

  private static abstract class IntegerBasedUniqueIdentifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntegerBasedUniqueIdentifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.moetang.serviceprotocol.protobuf.uniqueidentifier.IntegerBasedUniqueIdentifierProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntegerBasedUniqueIdentifierService");
    }
  }

  private static final class IntegerBasedUniqueIdentifierServiceFileDescriptorSupplier
      extends IntegerBasedUniqueIdentifierServiceBaseDescriptorSupplier {
    IntegerBasedUniqueIdentifierServiceFileDescriptorSupplier() {}
  }

  private static final class IntegerBasedUniqueIdentifierServiceMethodDescriptorSupplier
      extends IntegerBasedUniqueIdentifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntegerBasedUniqueIdentifierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntegerBasedUniqueIdentifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntegerBasedUniqueIdentifierServiceFileDescriptorSupplier())
              .addMethod(getGenerateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
