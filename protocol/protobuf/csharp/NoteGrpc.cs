// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: note/note.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Note {
  public static partial class NoteService
  {
    static readonly string __ServiceName = "note.NoteService";

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
    static readonly grpc::Marshaller<global::Note.CreateNoteReq> __Marshaller_note_CreateNoteReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.CreateNoteReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.CreateNoteRes> __Marshaller_note_CreateNoteRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.CreateNoteRes.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.UpdateNoteByIdReq> __Marshaller_note_UpdateNoteByIdReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.UpdateNoteByIdReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.UpdateNoteByIdRes> __Marshaller_note_UpdateNoteByIdRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.UpdateNoteByIdRes.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.DeleteNoteByIdReq> __Marshaller_note_DeleteNoteByIdReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.DeleteNoteByIdReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.DeleteNoteByIdRes> __Marshaller_note_DeleteNoteByIdRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.DeleteNoteByIdRes.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.QueryNoteByNoteIdReq> __Marshaller_note_QueryNoteByNoteIdReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.QueryNoteByNoteIdReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.QueryNoteByNoteIdRes> __Marshaller_note_QueryNoteByNoteIdRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.QueryNoteByNoteIdRes.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.QueryPagedNotesReq> __Marshaller_note_QueryPagedNotesReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.QueryPagedNotesReq.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Note.QueryPagedNotesRes> __Marshaller_note_QueryPagedNotesRes = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Note.QueryPagedNotesRes.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Note.CreateNoteReq, global::Note.CreateNoteRes> __Method_CreateNote = new grpc::Method<global::Note.CreateNoteReq, global::Note.CreateNoteRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CreateNote",
        __Marshaller_note_CreateNoteReq,
        __Marshaller_note_CreateNoteRes);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Note.UpdateNoteByIdReq, global::Note.UpdateNoteByIdRes> __Method_UpdateNoteById = new grpc::Method<global::Note.UpdateNoteByIdReq, global::Note.UpdateNoteByIdRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "UpdateNoteById",
        __Marshaller_note_UpdateNoteByIdReq,
        __Marshaller_note_UpdateNoteByIdRes);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Note.DeleteNoteByIdReq, global::Note.DeleteNoteByIdRes> __Method_DeleteNoteById = new grpc::Method<global::Note.DeleteNoteByIdReq, global::Note.DeleteNoteByIdRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "DeleteNoteById",
        __Marshaller_note_DeleteNoteByIdReq,
        __Marshaller_note_DeleteNoteByIdRes);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Note.QueryNoteByNoteIdReq, global::Note.QueryNoteByNoteIdRes> __Method_QueryNoteByNoteId = new grpc::Method<global::Note.QueryNoteByNoteIdReq, global::Note.QueryNoteByNoteIdRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "QueryNoteByNoteId",
        __Marshaller_note_QueryNoteByNoteIdReq,
        __Marshaller_note_QueryNoteByNoteIdRes);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Note.QueryPagedNotesReq, global::Note.QueryPagedNotesRes> __Method_QueryPagedNotes = new grpc::Method<global::Note.QueryPagedNotesReq, global::Note.QueryPagedNotesRes>(
        grpc::MethodType.Unary,
        __ServiceName,
        "QueryPagedNotes",
        __Marshaller_note_QueryPagedNotesReq,
        __Marshaller_note_QueryPagedNotesRes);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Note.NoteReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of NoteService</summary>
    [grpc::BindServiceMethod(typeof(NoteService), "BindService")]
    public abstract partial class NoteServiceBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Note.CreateNoteRes> CreateNote(global::Note.CreateNoteReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Note.UpdateNoteByIdRes> UpdateNoteById(global::Note.UpdateNoteByIdReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Note.DeleteNoteByIdRes> DeleteNoteById(global::Note.DeleteNoteByIdReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Note.QueryNoteByNoteIdRes> QueryNoteByNoteId(global::Note.QueryNoteByNoteIdReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Note.QueryPagedNotesRes> QueryPagedNotes(global::Note.QueryPagedNotesReq request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for NoteService</summary>
    public partial class NoteServiceClient : grpc::ClientBase<NoteServiceClient>
    {
      /// <summary>Creates a new client for NoteService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public NoteServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for NoteService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public NoteServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected NoteServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected NoteServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.CreateNoteRes CreateNote(global::Note.CreateNoteReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateNote(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.CreateNoteRes CreateNote(global::Note.CreateNoteReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_CreateNote, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.CreateNoteRes> CreateNoteAsync(global::Note.CreateNoteReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateNoteAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.CreateNoteRes> CreateNoteAsync(global::Note.CreateNoteReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_CreateNote, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.UpdateNoteByIdRes UpdateNoteById(global::Note.UpdateNoteByIdReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdateNoteById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.UpdateNoteByIdRes UpdateNoteById(global::Note.UpdateNoteByIdReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_UpdateNoteById, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.UpdateNoteByIdRes> UpdateNoteByIdAsync(global::Note.UpdateNoteByIdReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdateNoteByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.UpdateNoteByIdRes> UpdateNoteByIdAsync(global::Note.UpdateNoteByIdReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_UpdateNoteById, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.DeleteNoteByIdRes DeleteNoteById(global::Note.DeleteNoteByIdReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeleteNoteById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.DeleteNoteByIdRes DeleteNoteById(global::Note.DeleteNoteByIdReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_DeleteNoteById, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.DeleteNoteByIdRes> DeleteNoteByIdAsync(global::Note.DeleteNoteByIdReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeleteNoteByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.DeleteNoteByIdRes> DeleteNoteByIdAsync(global::Note.DeleteNoteByIdReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_DeleteNoteById, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.QueryNoteByNoteIdRes QueryNoteByNoteId(global::Note.QueryNoteByNoteIdReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return QueryNoteByNoteId(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.QueryNoteByNoteIdRes QueryNoteByNoteId(global::Note.QueryNoteByNoteIdReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_QueryNoteByNoteId, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.QueryNoteByNoteIdRes> QueryNoteByNoteIdAsync(global::Note.QueryNoteByNoteIdReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return QueryNoteByNoteIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.QueryNoteByNoteIdRes> QueryNoteByNoteIdAsync(global::Note.QueryNoteByNoteIdReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_QueryNoteByNoteId, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.QueryPagedNotesRes QueryPagedNotes(global::Note.QueryPagedNotesReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return QueryPagedNotes(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Note.QueryPagedNotesRes QueryPagedNotes(global::Note.QueryPagedNotesReq request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_QueryPagedNotes, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.QueryPagedNotesRes> QueryPagedNotesAsync(global::Note.QueryPagedNotesReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return QueryPagedNotesAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Note.QueryPagedNotesRes> QueryPagedNotesAsync(global::Note.QueryPagedNotesReq request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_QueryPagedNotes, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override NoteServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new NoteServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(NoteServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_CreateNote, serviceImpl.CreateNote)
          .AddMethod(__Method_UpdateNoteById, serviceImpl.UpdateNoteById)
          .AddMethod(__Method_DeleteNoteById, serviceImpl.DeleteNoteById)
          .AddMethod(__Method_QueryNoteByNoteId, serviceImpl.QueryNoteByNoteId)
          .AddMethod(__Method_QueryPagedNotes, serviceImpl.QueryPagedNotes).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, NoteServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_CreateNote, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Note.CreateNoteReq, global::Note.CreateNoteRes>(serviceImpl.CreateNote));
      serviceBinder.AddMethod(__Method_UpdateNoteById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Note.UpdateNoteByIdReq, global::Note.UpdateNoteByIdRes>(serviceImpl.UpdateNoteById));
      serviceBinder.AddMethod(__Method_DeleteNoteById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Note.DeleteNoteByIdReq, global::Note.DeleteNoteByIdRes>(serviceImpl.DeleteNoteById));
      serviceBinder.AddMethod(__Method_QueryNoteByNoteId, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Note.QueryNoteByNoteIdReq, global::Note.QueryNoteByNoteIdRes>(serviceImpl.QueryNoteByNoteId));
      serviceBinder.AddMethod(__Method_QueryPagedNotes, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Note.QueryPagedNotesReq, global::Note.QueryPagedNotesRes>(serviceImpl.QueryPagedNotes));
    }

  }
}
#endregion