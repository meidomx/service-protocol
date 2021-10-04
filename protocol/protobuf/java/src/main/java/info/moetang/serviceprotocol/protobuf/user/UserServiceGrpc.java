package info.moetang.serviceprotocol.protobuf.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: user/user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.RegisterUserReq,
      info.moetang.serviceprotocol.protobuf.user.RegisterUserRes> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = info.moetang.serviceprotocol.protobuf.user.RegisterUserReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.user.RegisterUserRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.RegisterUserReq,
      info.moetang.serviceprotocol.protobuf.user.RegisterUserRes> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.RegisterUserReq, info.moetang.serviceprotocol.protobuf.user.RegisterUserRes> getRegisterUserMethod;
    if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
          UserServiceGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.user.RegisterUserReq, info.moetang.serviceprotocol.protobuf.user.RegisterUserRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.user.RegisterUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.user.RegisterUserRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq,
      info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes> getVerifyUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyUserPassword",
      requestType = info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq,
      info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes> getVerifyUserPasswordMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq, info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes> getVerifyUserPasswordMethod;
    if ((getVerifyUserPasswordMethod = UserServiceGrpc.getVerifyUserPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerifyUserPasswordMethod = UserServiceGrpc.getVerifyUserPasswordMethod) == null) {
          UserServiceGrpc.getVerifyUserPasswordMethod = getVerifyUserPasswordMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq, info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerifyUserPassword"))
              .build();
        }
      }
    }
    return getVerifyUserPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq,
      info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes> getChangeUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeUserPassword",
      requestType = info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq,
      info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes> getChangeUserPasswordMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq, info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes> getChangeUserPasswordMethod;
    if ((getChangeUserPasswordMethod = UserServiceGrpc.getChangeUserPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getChangeUserPasswordMethod = UserServiceGrpc.getChangeUserPasswordMethod) == null) {
          UserServiceGrpc.getChangeUserPasswordMethod = getChangeUserPasswordMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq, info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ChangeUserPassword"))
              .build();
        }
      }
    }
    return getChangeUserPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerUser(info.moetang.serviceprotocol.protobuf.user.RegisterUserReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.RegisterUserRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    public void verifyUserPassword(info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyUserPasswordMethod(), responseObserver);
    }

    /**
     */
    public void changeUserPassword(info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeUserPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.user.RegisterUserReq,
                info.moetang.serviceprotocol.protobuf.user.RegisterUserRes>(
                  this, METHODID_REGISTER_USER)))
          .addMethod(
            getVerifyUserPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq,
                info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes>(
                  this, METHODID_VERIFY_USER_PASSWORD)))
          .addMethod(
            getChangeUserPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq,
                info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes>(
                  this, METHODID_CHANGE_USER_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerUser(info.moetang.serviceprotocol.protobuf.user.RegisterUserReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.RegisterUserRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyUserPassword(info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeUserPassword(info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.user.RegisterUserRes registerUser(info.moetang.serviceprotocol.protobuf.user.RegisterUserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes verifyUserPassword(info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes changeUserPassword(info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeUserPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.user.RegisterUserRes> registerUser(
        info.moetang.serviceprotocol.protobuf.user.RegisterUserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes> verifyUserPassword(
        info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyUserPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes> changeUserPassword(
        info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeUserPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_VERIFY_USER_PASSWORD = 1;
  private static final int METHODID_CHANGE_USER_PASSWORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((info.moetang.serviceprotocol.protobuf.user.RegisterUserReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.RegisterUserRes>) responseObserver);
          break;
        case METHODID_VERIFY_USER_PASSWORD:
          serviceImpl.verifyUserPassword((info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.VerifyUserPasswordRes>) responseObserver);
          break;
        case METHODID_CHANGE_USER_PASSWORD:
          serviceImpl.changeUserPassword((info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.user.ChangeUserPasswordRes>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.moetang.serviceprotocol.protobuf.user.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegisterUserMethod())
              .addMethod(getVerifyUserPasswordMethod())
              .addMethod(getChangeUserPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
