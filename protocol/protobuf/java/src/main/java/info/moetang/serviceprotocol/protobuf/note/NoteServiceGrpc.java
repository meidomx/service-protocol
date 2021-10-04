package info.moetang.serviceprotocol.protobuf.note;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: note/note.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NoteServiceGrpc {

  private NoteServiceGrpc() {}

  public static final String SERVICE_NAME = "note.NoteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.CreateNoteReq,
      info.moetang.serviceprotocol.protobuf.note.CreateNoteRes> getCreateNoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNote",
      requestType = info.moetang.serviceprotocol.protobuf.note.CreateNoteReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.note.CreateNoteRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.CreateNoteReq,
      info.moetang.serviceprotocol.protobuf.note.CreateNoteRes> getCreateNoteMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.CreateNoteReq, info.moetang.serviceprotocol.protobuf.note.CreateNoteRes> getCreateNoteMethod;
    if ((getCreateNoteMethod = NoteServiceGrpc.getCreateNoteMethod) == null) {
      synchronized (NoteServiceGrpc.class) {
        if ((getCreateNoteMethod = NoteServiceGrpc.getCreateNoteMethod) == null) {
          NoteServiceGrpc.getCreateNoteMethod = getCreateNoteMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.note.CreateNoteReq, info.moetang.serviceprotocol.protobuf.note.CreateNoteRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.CreateNoteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.CreateNoteRes.getDefaultInstance()))
              .setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("CreateNote"))
              .build();
        }
      }
    }
    return getCreateNoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq,
      info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes> getUpdateNoteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNoteById",
      requestType = info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq,
      info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes> getUpdateNoteByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq, info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes> getUpdateNoteByIdMethod;
    if ((getUpdateNoteByIdMethod = NoteServiceGrpc.getUpdateNoteByIdMethod) == null) {
      synchronized (NoteServiceGrpc.class) {
        if ((getUpdateNoteByIdMethod = NoteServiceGrpc.getUpdateNoteByIdMethod) == null) {
          NoteServiceGrpc.getUpdateNoteByIdMethod = getUpdateNoteByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq, info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNoteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("UpdateNoteById"))
              .build();
        }
      }
    }
    return getUpdateNoteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq,
      info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes> getDeleteNoteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNoteById",
      requestType = info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq,
      info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes> getDeleteNoteByIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq, info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes> getDeleteNoteByIdMethod;
    if ((getDeleteNoteByIdMethod = NoteServiceGrpc.getDeleteNoteByIdMethod) == null) {
      synchronized (NoteServiceGrpc.class) {
        if ((getDeleteNoteByIdMethod = NoteServiceGrpc.getDeleteNoteByIdMethod) == null) {
          NoteServiceGrpc.getDeleteNoteByIdMethod = getDeleteNoteByIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq, info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNoteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("DeleteNoteById"))
              .build();
        }
      }
    }
    return getDeleteNoteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq,
      info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes> getQueryNoteByNoteIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryNoteByNoteId",
      requestType = info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq,
      info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes> getQueryNoteByNoteIdMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq, info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes> getQueryNoteByNoteIdMethod;
    if ((getQueryNoteByNoteIdMethod = NoteServiceGrpc.getQueryNoteByNoteIdMethod) == null) {
      synchronized (NoteServiceGrpc.class) {
        if ((getQueryNoteByNoteIdMethod = NoteServiceGrpc.getQueryNoteByNoteIdMethod) == null) {
          NoteServiceGrpc.getQueryNoteByNoteIdMethod = getQueryNoteByNoteIdMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq, info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryNoteByNoteId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("QueryNoteByNoteId"))
              .build();
        }
      }
    }
    return getQueryNoteByNoteIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq,
      info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes> getQueryPagedNotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPagedNotes",
      requestType = info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq.class,
      responseType = info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq,
      info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes> getQueryPagedNotesMethod() {
    io.grpc.MethodDescriptor<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq, info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes> getQueryPagedNotesMethod;
    if ((getQueryPagedNotesMethod = NoteServiceGrpc.getQueryPagedNotesMethod) == null) {
      synchronized (NoteServiceGrpc.class) {
        if ((getQueryPagedNotesMethod = NoteServiceGrpc.getQueryPagedNotesMethod) == null) {
          NoteServiceGrpc.getQueryPagedNotesMethod = getQueryPagedNotesMethod =
              io.grpc.MethodDescriptor.<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq, info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPagedNotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes.getDefaultInstance()))
              .setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("QueryPagedNotes"))
              .build();
        }
      }
    }
    return getQueryPagedNotesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NoteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NoteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NoteServiceStub>() {
        @java.lang.Override
        public NoteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NoteServiceStub(channel, callOptions);
        }
      };
    return NoteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NoteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NoteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NoteServiceBlockingStub>() {
        @java.lang.Override
        public NoteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NoteServiceBlockingStub(channel, callOptions);
        }
      };
    return NoteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NoteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NoteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NoteServiceFutureStub>() {
        @java.lang.Override
        public NoteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NoteServiceFutureStub(channel, callOptions);
        }
      };
    return NoteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NoteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createNote(info.moetang.serviceprotocol.protobuf.note.CreateNoteReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.CreateNoteRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNoteMethod(), responseObserver);
    }

    /**
     */
    public void updateNoteById(info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNoteByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteNoteById(info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNoteByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryNoteByNoteId(info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryNoteByNoteIdMethod(), responseObserver);
    }

    /**
     */
    public void queryPagedNotes(info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPagedNotesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNoteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.note.CreateNoteReq,
                info.moetang.serviceprotocol.protobuf.note.CreateNoteRes>(
                  this, METHODID_CREATE_NOTE)))
          .addMethod(
            getUpdateNoteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq,
                info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes>(
                  this, METHODID_UPDATE_NOTE_BY_ID)))
          .addMethod(
            getDeleteNoteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq,
                info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes>(
                  this, METHODID_DELETE_NOTE_BY_ID)))
          .addMethod(
            getQueryNoteByNoteIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq,
                info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes>(
                  this, METHODID_QUERY_NOTE_BY_NOTE_ID)))
          .addMethod(
            getQueryPagedNotesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq,
                info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes>(
                  this, METHODID_QUERY_PAGED_NOTES)))
          .build();
    }
  }

  /**
   */
  public static final class NoteServiceStub extends io.grpc.stub.AbstractAsyncStub<NoteServiceStub> {
    private NoteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NoteServiceStub(channel, callOptions);
    }

    /**
     */
    public void createNote(info.moetang.serviceprotocol.protobuf.note.CreateNoteReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.CreateNoteRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNoteById(info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNoteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNoteById(info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNoteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryNoteByNoteId(info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryNoteByNoteIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPagedNotes(info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq request,
        io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPagedNotesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NoteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NoteServiceBlockingStub> {
    private NoteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NoteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.note.CreateNoteRes createNote(info.moetang.serviceprotocol.protobuf.note.CreateNoteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNoteMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes updateNoteById(info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNoteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes deleteNoteById(info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNoteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes queryNoteByNoteId(info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryNoteByNoteIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes queryPagedNotes(info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPagedNotesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NoteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NoteServiceFutureStub> {
    private NoteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NoteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.note.CreateNoteRes> createNote(
        info.moetang.serviceprotocol.protobuf.note.CreateNoteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNoteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes> updateNoteById(
        info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNoteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes> deleteNoteById(
        info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNoteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes> queryNoteByNoteId(
        info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryNoteByNoteIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes> queryPagedNotes(
        info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPagedNotesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NOTE = 0;
  private static final int METHODID_UPDATE_NOTE_BY_ID = 1;
  private static final int METHODID_DELETE_NOTE_BY_ID = 2;
  private static final int METHODID_QUERY_NOTE_BY_NOTE_ID = 3;
  private static final int METHODID_QUERY_PAGED_NOTES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NoteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NoteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NOTE:
          serviceImpl.createNote((info.moetang.serviceprotocol.protobuf.note.CreateNoteReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.CreateNoteRes>) responseObserver);
          break;
        case METHODID_UPDATE_NOTE_BY_ID:
          serviceImpl.updateNoteById((info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.UpdateNoteByIdRes>) responseObserver);
          break;
        case METHODID_DELETE_NOTE_BY_ID:
          serviceImpl.deleteNoteById((info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.DeleteNoteByIdRes>) responseObserver);
          break;
        case METHODID_QUERY_NOTE_BY_NOTE_ID:
          serviceImpl.queryNoteByNoteId((info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.QueryNoteByNoteIdRes>) responseObserver);
          break;
        case METHODID_QUERY_PAGED_NOTES:
          serviceImpl.queryPagedNotes((info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesReq) request,
              (io.grpc.stub.StreamObserver<info.moetang.serviceprotocol.protobuf.note.QueryPagedNotesRes>) responseObserver);
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

  private static abstract class NoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NoteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return info.moetang.serviceprotocol.protobuf.note.NoteProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NoteService");
    }
  }

  private static final class NoteServiceFileDescriptorSupplier
      extends NoteServiceBaseDescriptorSupplier {
    NoteServiceFileDescriptorSupplier() {}
  }

  private static final class NoteServiceMethodDescriptorSupplier
      extends NoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NoteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NoteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NoteServiceFileDescriptorSupplier())
              .addMethod(getCreateNoteMethod())
              .addMethod(getUpdateNoteByIdMethod())
              .addMethod(getDeleteNoteByIdMethod())
              .addMethod(getQueryNoteByNoteIdMethod())
              .addMethod(getQueryPagedNotesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
