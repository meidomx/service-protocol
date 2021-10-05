// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: note/note.proto

package info.moetang.serviceprotocol.protobuf.note;

public final class NoteProto {
  private NoteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_Note_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_Note_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_CreateNoteReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_CreateNoteReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_CreateNoteRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_CreateNoteRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_QueryNoteByNoteIdReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_QueryNoteByNoteIdReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_QueryNoteByNoteIdRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_QueryNoteByNoteIdRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_QueryPagedNotesReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_QueryPagedNotesReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_QueryPagedNotesRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_QueryPagedNotesRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_UpdateNoteByIdReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_UpdateNoteByIdReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_UpdateNoteByIdRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_UpdateNoteByIdRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_DeleteNoteByIdReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_DeleteNoteByIdReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_note_DeleteNoteByIdRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_note_DeleteNoteByIdRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017note/note.proto\022\004note\032\023shared/result.p" +
      "roto\"t\n\004Note\022\017\n\007note_id\030\001 \001(\t\022\017\n\007user_id" +
      "\030\002 \001(\t\022\r\n\005title\030\013 \001(\t\022\017\n\007content\030\014 \001(\t\022\024" +
      "\n\014time_created\030\025 \001(\003\022\024\n\014time_updated\030\026 \001" +
      "(\003\"@\n\rCreateNoteReq\022\017\n\007user_id\030\001 \001(\t\022\r\n\005" +
      "title\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\"I\n\rCreateNo" +
      "teRes\022\036\n\006result\030\001 \001(\0132\016.shared.Result\022\030\n" +
      "\004note\030\002 \001(\0132\n.note.Note\"\'\n\024QueryNoteByNo" +
      "teIdReq\022\017\n\007note_id\030\001 \001(\t\"P\n\024QueryNoteByN" +
      "oteIdRes\022\036\n\006result\030\001 \001(\0132\016.shared.Result" +
      "\022\030\n\004note\030\002 \001(\0132\n.note.Note\"5\n\022QueryPaged" +
      "NotesReq\022\014\n\004page\030\001 \001(\003\022\021\n\tpage_size\030\002 \001(" +
      "\003\"O\n\022QueryPagedNotesRes\022\036\n\006result\030\001 \001(\0132" +
      "\016.shared.Result\022\031\n\005notes\030\002 \003(\0132\n.note.No" +
      "te\"D\n\021UpdateNoteByIdReq\022\017\n\007note_id\030\001 \001(\t" +
      "\022\r\n\005title\030\013 \001(\t\022\017\n\007content\030\014 \001(\t\"M\n\021Upda" +
      "teNoteByIdRes\022\036\n\006result\030\001 \001(\0132\016.shared.R" +
      "esult\022\030\n\004note\030\002 \001(\0132\n.note.Note\"$\n\021Delet" +
      "eNoteByIdReq\022\017\n\007note_id\030\001 \001(\t\"3\n\021DeleteN" +
      "oteByIdRes\022\036\n\006result\030\001 \001(\0132\016.shared.Resu" +
      "lt2\353\002\n\013NoteService\0228\n\nCreateNote\022\023.note." +
      "CreateNoteReq\032\023.note.CreateNoteRes\"\000\022D\n\016" +
      "UpdateNoteById\022\027.note.UpdateNoteByIdReq\032" +
      "\027.note.UpdateNoteByIdRes\"\000\022D\n\016DeleteNote" +
      "ById\022\027.note.DeleteNoteByIdReq\032\027.note.Del" +
      "eteNoteByIdRes\"\000\022M\n\021QueryNoteByNoteId\022\032." +
      "note.QueryNoteByNoteIdReq\032\032.note.QueryNo" +
      "teByNoteIdRes\"\000\022G\n\017QueryPagedNotes\022\030.not" +
      "e.QueryPagedNotesReq\032\030.note.QueryPagedNo" +
      "tesRes\"\000Bx\n*info.moetang.serviceprotocol" +
      ".protobuf.noteB\tNoteProtoP\001Z=github.com/" +
      "meidomx/service-protocol/protocol/protob" +
      "uf/go/noteb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          info.moetang.serviceprotocol.protobuf.shared.SharedProto.getDescriptor(),
        });
    internal_static_note_Note_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_note_Note_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_Note_descriptor,
        new java.lang.String[] { "NoteId", "UserId", "Title", "Content", "TimeCreated", "TimeUpdated", });
    internal_static_note_CreateNoteReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_note_CreateNoteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_CreateNoteReq_descriptor,
        new java.lang.String[] { "UserId", "Title", "Content", });
    internal_static_note_CreateNoteRes_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_note_CreateNoteRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_CreateNoteRes_descriptor,
        new java.lang.String[] { "Result", "Note", });
    internal_static_note_QueryNoteByNoteIdReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_note_QueryNoteByNoteIdReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_QueryNoteByNoteIdReq_descriptor,
        new java.lang.String[] { "NoteId", });
    internal_static_note_QueryNoteByNoteIdRes_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_note_QueryNoteByNoteIdRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_QueryNoteByNoteIdRes_descriptor,
        new java.lang.String[] { "Result", "Note", });
    internal_static_note_QueryPagedNotesReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_note_QueryPagedNotesReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_QueryPagedNotesReq_descriptor,
        new java.lang.String[] { "Page", "PageSize", });
    internal_static_note_QueryPagedNotesRes_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_note_QueryPagedNotesRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_QueryPagedNotesRes_descriptor,
        new java.lang.String[] { "Result", "Notes", });
    internal_static_note_UpdateNoteByIdReq_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_note_UpdateNoteByIdReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_UpdateNoteByIdReq_descriptor,
        new java.lang.String[] { "NoteId", "Title", "Content", });
    internal_static_note_UpdateNoteByIdRes_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_note_UpdateNoteByIdRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_UpdateNoteByIdRes_descriptor,
        new java.lang.String[] { "Result", "Note", });
    internal_static_note_DeleteNoteByIdReq_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_note_DeleteNoteByIdReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_DeleteNoteByIdReq_descriptor,
        new java.lang.String[] { "NoteId", });
    internal_static_note_DeleteNoteByIdRes_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_note_DeleteNoteByIdRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_note_DeleteNoteByIdRes_descriptor,
        new java.lang.String[] { "Result", });
    info.moetang.serviceprotocol.protobuf.shared.SharedProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}