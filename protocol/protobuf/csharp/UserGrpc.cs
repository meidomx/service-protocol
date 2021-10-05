// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: user/user.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace User {
  public static partial class UserService
  {
    static readonly string __ServiceName = "user.UserService";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::User.RegisterUserReq> __Marshaller_user_RegisterUserReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::User.RegisterUserReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::User.RegisterUserRes> __Marshaller_user_RegisterUserRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::User.RegisterUserRes.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::User.VerifyUserPasswordReq> __Marshaller_user_VerifyUserPasswordReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::User.VerifyUserPasswordReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::User.VerifyUserPasswordRes> __Marshaller_user_VerifyUserPasswordRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::User.VerifyUserPasswordRes.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::User.ChangeUserPasswordReq> __Marshaller_user_ChangeUserPasswordReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::User.ChangeUserPasswordReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::User.ChangeUserPasswordRes> __Marshaller_user_ChangeUserPasswordRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::User.ChangeUserPasswordRes.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::User.RegisterUserReq, global::User.RegisterUserRes> __Method_RegisterUser = new grpc::Method<global::User.RegisterUserReq, global::User.RegisterUserRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "RegisterUser",
        __Marshaller_user_RegisterUserReq,
        __Marshaller_user_RegisterUserRes);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::User.VerifyUserPasswordReq, global::User.VerifyUserPasswordRes> __Method_VerifyUserPassword = new grpc::Method<global::User.VerifyUserPasswordReq, global::User.VerifyUserPasswordRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "VerifyUserPassword",
        __Marshaller_user_VerifyUserPasswordReq,
        __Marshaller_user_VerifyUserPasswordRes);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::User.ChangeUserPasswordReq, global::User.ChangeUserPasswordRes> __Method_ChangeUserPassword = new grpc::Method<global::User.ChangeUserPasswordReq, global::User.ChangeUserPasswordRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "ChangeUserPassword",
        __Marshaller_user_ChangeUserPasswordReq,
        __Marshaller_user_ChangeUserPasswordRes);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::User.UserReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of UserService</summary>
    [grpc::BindServiceMethod(typeof(UserService), "BindService")]
    public abstract partial class UserServiceBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::User.RegisterUserRes> RegisterUser(global::User.RegisterUserReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::User.VerifyUserPasswordRes> VerifyUserPassword(global::User.VerifyUserPasswordReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::User.ChangeUserPasswordRes> ChangeUserPassword(global::User.ChangeUserPasswordReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for UserService</summary>
    public partial class UserServiceClient : grpc::ClientBase<UserServiceClient>
    {
      /// <summary>Creates a new client for UserService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public UserServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for UserService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public UserServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected UserServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected UserServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::User.RegisterUserRes RegisterUser(global::User.RegisterUserReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RegisterUser(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::User.RegisterUserRes RegisterUser(global::User.RegisterUserReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_RegisterUser, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::User.RegisterUserRes> RegisterUserAsync(global::User.RegisterUserReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RegisterUserAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::User.RegisterUserRes> RegisterUserAsync(global::User.RegisterUserReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_RegisterUser, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::User.VerifyUserPasswordRes VerifyUserPassword(global::User.VerifyUserPasswordReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return VerifyUserPassword(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::User.VerifyUserPasswordRes VerifyUserPassword(global::User.VerifyUserPasswordReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_VerifyUserPassword, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::User.VerifyUserPasswordRes> VerifyUserPasswordAsync(global::User.VerifyUserPasswordReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return VerifyUserPasswordAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::User.VerifyUserPasswordRes> VerifyUserPasswordAsync(global::User.VerifyUserPasswordReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_VerifyUserPassword, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::User.ChangeUserPasswordRes ChangeUserPassword(global::User.ChangeUserPasswordReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return ChangeUserPassword(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::User.ChangeUserPasswordRes ChangeUserPassword(global::User.ChangeUserPasswordReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_ChangeUserPassword, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::User.ChangeUserPasswordRes> ChangeUserPasswordAsync(global::User.ChangeUserPasswordReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return ChangeUserPasswordAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::User.ChangeUserPasswordRes> ChangeUserPasswordAsync(global::User.ChangeUserPasswordReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_ChangeUserPassword, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override UserServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new UserServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(UserServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_RegisterUser, serviceImpl.RegisterUser)
          .AddMethod(__Method_VerifyUserPassword, serviceImpl.VerifyUserPassword)
          .AddMethod(__Method_ChangeUserPassword, serviceImpl.ChangeUserPassword).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, UserServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_RegisterUser, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::User.RegisterUserReq, global::User.RegisterUserRes>(serviceImpl.RegisterUser));
      serviceBinder.AddMethod(__Method_VerifyUserPassword, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::User.VerifyUserPasswordReq, global::User.VerifyUserPasswordRes>(serviceImpl.VerifyUserPassword));
      serviceBinder.AddMethod(__Method_ChangeUserPassword, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::User.ChangeUserPasswordReq, global::User.ChangeUserPasswordRes>(serviceImpl.ChangeUserPassword));
    }

  }
}
#endregion