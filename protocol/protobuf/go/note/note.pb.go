// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.26.0
// 	protoc        v3.17.3
// source: note/note.proto

package note

import (
	shared "github.com/meidomx/service-protocol/protocol/protobuf/go/shared"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type Note struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NoteId      string `protobuf:"bytes,1,opt,name=note_id,json=noteId,proto3" json:"note_id,omitempty"`
	UserId      string `protobuf:"bytes,2,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	Title       string `protobuf:"bytes,11,opt,name=title,proto3" json:"title,omitempty"`
	Content     string `protobuf:"bytes,12,opt,name=content,proto3" json:"content,omitempty"`
	TimeCreated int64  `protobuf:"varint,21,opt,name=time_created,json=timeCreated,proto3" json:"time_created,omitempty"`
	TimeUpdated int64  `protobuf:"varint,22,opt,name=time_updated,json=timeUpdated,proto3" json:"time_updated,omitempty"`
}

func (x *Note) Reset() {
	*x = Note{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Note) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Note) ProtoMessage() {}

func (x *Note) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Note.ProtoReflect.Descriptor instead.
func (*Note) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{0}
}

func (x *Note) GetNoteId() string {
	if x != nil {
		return x.NoteId
	}
	return ""
}

func (x *Note) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *Note) GetTitle() string {
	if x != nil {
		return x.Title
	}
	return ""
}

func (x *Note) GetContent() string {
	if x != nil {
		return x.Content
	}
	return ""
}

func (x *Note) GetTimeCreated() int64 {
	if x != nil {
		return x.TimeCreated
	}
	return 0
}

func (x *Note) GetTimeUpdated() int64 {
	if x != nil {
		return x.TimeUpdated
	}
	return 0
}

type CreateNoteReq struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId  string `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	Title   string `protobuf:"bytes,2,opt,name=title,proto3" json:"title,omitempty"`
	Content string `protobuf:"bytes,3,opt,name=content,proto3" json:"content,omitempty"`
}

func (x *CreateNoteReq) Reset() {
	*x = CreateNoteReq{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateNoteReq) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateNoteReq) ProtoMessage() {}

func (x *CreateNoteReq) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateNoteReq.ProtoReflect.Descriptor instead.
func (*CreateNoteReq) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{1}
}

func (x *CreateNoteReq) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *CreateNoteReq) GetTitle() string {
	if x != nil {
		return x.Title
	}
	return ""
}

func (x *CreateNoteReq) GetContent() string {
	if x != nil {
		return x.Content
	}
	return ""
}

type CreateNoteRes struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result *shared.Result `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
	Note   *Note          `protobuf:"bytes,2,opt,name=note,proto3" json:"note,omitempty"`
}

func (x *CreateNoteRes) Reset() {
	*x = CreateNoteRes{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateNoteRes) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateNoteRes) ProtoMessage() {}

func (x *CreateNoteRes) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateNoteRes.ProtoReflect.Descriptor instead.
func (*CreateNoteRes) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{2}
}

func (x *CreateNoteRes) GetResult() *shared.Result {
	if x != nil {
		return x.Result
	}
	return nil
}

func (x *CreateNoteRes) GetNote() *Note {
	if x != nil {
		return x.Note
	}
	return nil
}

type QueryNoteByNoteIdReq struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NoteId string `protobuf:"bytes,1,opt,name=note_id,json=noteId,proto3" json:"note_id,omitempty"`
}

func (x *QueryNoteByNoteIdReq) Reset() {
	*x = QueryNoteByNoteIdReq{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QueryNoteByNoteIdReq) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QueryNoteByNoteIdReq) ProtoMessage() {}

func (x *QueryNoteByNoteIdReq) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QueryNoteByNoteIdReq.ProtoReflect.Descriptor instead.
func (*QueryNoteByNoteIdReq) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{3}
}

func (x *QueryNoteByNoteIdReq) GetNoteId() string {
	if x != nil {
		return x.NoteId
	}
	return ""
}

type QueryNoteByNoteIdRes struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result *shared.Result `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
	Note   *Note          `protobuf:"bytes,2,opt,name=note,proto3" json:"note,omitempty"`
}

func (x *QueryNoteByNoteIdRes) Reset() {
	*x = QueryNoteByNoteIdRes{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QueryNoteByNoteIdRes) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QueryNoteByNoteIdRes) ProtoMessage() {}

func (x *QueryNoteByNoteIdRes) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QueryNoteByNoteIdRes.ProtoReflect.Descriptor instead.
func (*QueryNoteByNoteIdRes) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{4}
}

func (x *QueryNoteByNoteIdRes) GetResult() *shared.Result {
	if x != nil {
		return x.Result
	}
	return nil
}

func (x *QueryNoteByNoteIdRes) GetNote() *Note {
	if x != nil {
		return x.Note
	}
	return nil
}

type QueryPagedNotesReq struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Page     int64 `protobuf:"varint,1,opt,name=page,proto3" json:"page,omitempty"`
	PageSize int64 `protobuf:"varint,2,opt,name=page_size,json=pageSize,proto3" json:"page_size,omitempty"`
}

func (x *QueryPagedNotesReq) Reset() {
	*x = QueryPagedNotesReq{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QueryPagedNotesReq) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QueryPagedNotesReq) ProtoMessage() {}

func (x *QueryPagedNotesReq) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QueryPagedNotesReq.ProtoReflect.Descriptor instead.
func (*QueryPagedNotesReq) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{5}
}

func (x *QueryPagedNotesReq) GetPage() int64 {
	if x != nil {
		return x.Page
	}
	return 0
}

func (x *QueryPagedNotesReq) GetPageSize() int64 {
	if x != nil {
		return x.PageSize
	}
	return 0
}

type QueryPagedNotesRes struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result *shared.Result `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
	Notes  []*Note        `protobuf:"bytes,2,rep,name=notes,proto3" json:"notes,omitempty"`
}

func (x *QueryPagedNotesRes) Reset() {
	*x = QueryPagedNotesRes{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QueryPagedNotesRes) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QueryPagedNotesRes) ProtoMessage() {}

func (x *QueryPagedNotesRes) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QueryPagedNotesRes.ProtoReflect.Descriptor instead.
func (*QueryPagedNotesRes) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{6}
}

func (x *QueryPagedNotesRes) GetResult() *shared.Result {
	if x != nil {
		return x.Result
	}
	return nil
}

func (x *QueryPagedNotesRes) GetNotes() []*Note {
	if x != nil {
		return x.Notes
	}
	return nil
}

type UpdateNoteByIdReq struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NoteId  string `protobuf:"bytes,1,opt,name=note_id,json=noteId,proto3" json:"note_id,omitempty"`
	Title   string `protobuf:"bytes,11,opt,name=title,proto3" json:"title,omitempty"`
	Content string `protobuf:"bytes,12,opt,name=content,proto3" json:"content,omitempty"`
}

func (x *UpdateNoteByIdReq) Reset() {
	*x = UpdateNoteByIdReq{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateNoteByIdReq) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateNoteByIdReq) ProtoMessage() {}

func (x *UpdateNoteByIdReq) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateNoteByIdReq.ProtoReflect.Descriptor instead.
func (*UpdateNoteByIdReq) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{7}
}

func (x *UpdateNoteByIdReq) GetNoteId() string {
	if x != nil {
		return x.NoteId
	}
	return ""
}

func (x *UpdateNoteByIdReq) GetTitle() string {
	if x != nil {
		return x.Title
	}
	return ""
}

func (x *UpdateNoteByIdReq) GetContent() string {
	if x != nil {
		return x.Content
	}
	return ""
}

type UpdateNoteByIdRes struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result *shared.Result `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
	Note   *Note          `protobuf:"bytes,2,opt,name=note,proto3" json:"note,omitempty"`
}

func (x *UpdateNoteByIdRes) Reset() {
	*x = UpdateNoteByIdRes{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateNoteByIdRes) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateNoteByIdRes) ProtoMessage() {}

func (x *UpdateNoteByIdRes) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateNoteByIdRes.ProtoReflect.Descriptor instead.
func (*UpdateNoteByIdRes) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{8}
}

func (x *UpdateNoteByIdRes) GetResult() *shared.Result {
	if x != nil {
		return x.Result
	}
	return nil
}

func (x *UpdateNoteByIdRes) GetNote() *Note {
	if x != nil {
		return x.Note
	}
	return nil
}

type DeleteNoteByIdReq struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NoteId string `protobuf:"bytes,1,opt,name=note_id,json=noteId,proto3" json:"note_id,omitempty"`
}

func (x *DeleteNoteByIdReq) Reset() {
	*x = DeleteNoteByIdReq{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteNoteByIdReq) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteNoteByIdReq) ProtoMessage() {}

func (x *DeleteNoteByIdReq) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteNoteByIdReq.ProtoReflect.Descriptor instead.
func (*DeleteNoteByIdReq) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{9}
}

func (x *DeleteNoteByIdReq) GetNoteId() string {
	if x != nil {
		return x.NoteId
	}
	return ""
}

type DeleteNoteByIdRes struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result *shared.Result `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
}

func (x *DeleteNoteByIdRes) Reset() {
	*x = DeleteNoteByIdRes{}
	if protoimpl.UnsafeEnabled {
		mi := &file_note_note_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteNoteByIdRes) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteNoteByIdRes) ProtoMessage() {}

func (x *DeleteNoteByIdRes) ProtoReflect() protoreflect.Message {
	mi := &file_note_note_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteNoteByIdRes.ProtoReflect.Descriptor instead.
func (*DeleteNoteByIdRes) Descriptor() ([]byte, []int) {
	return file_note_note_proto_rawDescGZIP(), []int{10}
}

func (x *DeleteNoteByIdRes) GetResult() *shared.Result {
	if x != nil {
		return x.Result
	}
	return nil
}

var File_note_note_proto protoreflect.FileDescriptor

var file_note_note_proto_rawDesc = []byte{
	0x0a, 0x0f, 0x6e, 0x6f, 0x74, 0x65, 0x2f, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x1a, 0x13, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2f,
	0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xae, 0x01, 0x0a,
	0x04, 0x4e, 0x6f, 0x74, 0x65, 0x12, 0x17, 0x0a, 0x07, 0x6e, 0x6f, 0x74, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x6e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x12, 0x17,
	0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x69, 0x74, 0x6c, 0x65,
	0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x18, 0x0a,
	0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07,
	0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x74, 0x69, 0x6d, 0x65, 0x5f,
	0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x15, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0b, 0x74,
	0x69, 0x6d, 0x65, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x74, 0x69,
	0x6d, 0x65, 0x5f, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x18, 0x16, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x0b, 0x74, 0x69, 0x6d, 0x65, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x22, 0x58, 0x0a,
	0x0d, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x65, 0x71, 0x12, 0x17,
	0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x69, 0x74, 0x6c, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x18, 0x0a,
	0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07,
	0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x22, 0x57, 0x0a, 0x0d, 0x43, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x65, 0x73, 0x12, 0x26, 0x0a, 0x06, 0x72, 0x65, 0x73, 0x75,
	0x6c, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65,
	0x64, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74,
	0x12, 0x1e, 0x0a, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0a,
	0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x04, 0x6e, 0x6f, 0x74, 0x65,
	0x22, 0x2f, 0x0a, 0x14, 0x51, 0x75, 0x65, 0x72, 0x79, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x4e,
	0x6f, 0x74, 0x65, 0x49, 0x64, 0x52, 0x65, 0x71, 0x12, 0x17, 0x0a, 0x07, 0x6e, 0x6f, 0x74, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x6e, 0x6f, 0x74, 0x65, 0x49,
	0x64, 0x22, 0x5e, 0x0a, 0x14, 0x51, 0x75, 0x65, 0x72, 0x79, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79,
	0x4e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x52, 0x65, 0x73, 0x12, 0x26, 0x0a, 0x06, 0x72, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x73, 0x68, 0x61, 0x72,
	0x65, 0x64, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x12, 0x1e, 0x0a, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x0a, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x04, 0x6e, 0x6f, 0x74,
	0x65, 0x22, 0x45, 0x0a, 0x12, 0x51, 0x75, 0x65, 0x72, 0x79, 0x50, 0x61, 0x67, 0x65, 0x64, 0x4e,
	0x6f, 0x74, 0x65, 0x73, 0x52, 0x65, 0x71, 0x12, 0x12, 0x0a, 0x04, 0x70, 0x61, 0x67, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x04, 0x70, 0x61, 0x67, 0x65, 0x12, 0x1b, 0x0a, 0x09, 0x70,
	0x61, 0x67, 0x65, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08,
	0x70, 0x61, 0x67, 0x65, 0x53, 0x69, 0x7a, 0x65, 0x22, 0x5e, 0x0a, 0x12, 0x51, 0x75, 0x65, 0x72,
	0x79, 0x50, 0x61, 0x67, 0x65, 0x64, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x52, 0x65, 0x73, 0x12, 0x26,
	0x0a, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e,
	0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06,
	0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x20, 0x0a, 0x05, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x18,
	0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x4e, 0x6f, 0x74,
	0x65, 0x52, 0x05, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x22, 0x5c, 0x0a, 0x11, 0x55, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x71, 0x12, 0x17, 0x0a,
	0x07, 0x6e, 0x6f, 0x74, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06,
	0x6e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x18,
	0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x18, 0x0a, 0x07,
	0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x63,
	0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x22, 0x5b, 0x0a, 0x11, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x73, 0x12, 0x26, 0x0a, 0x06, 0x72,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x73, 0x68,
	0x61, 0x72, 0x65, 0x64, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06, 0x72, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x12, 0x1e, 0x0a, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x0a, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x04, 0x6e,
	0x6f, 0x74, 0x65, 0x22, 0x2c, 0x0a, 0x11, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4e, 0x6f, 0x74,
	0x65, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x71, 0x12, 0x17, 0x0a, 0x07, 0x6e, 0x6f, 0x74, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x6e, 0x6f, 0x74, 0x65, 0x49,
	0x64, 0x22, 0x3b, 0x0a, 0x11, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x42,
	0x79, 0x49, 0x64, 0x52, 0x65, 0x73, 0x12, 0x26, 0x0a, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e,
	0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x32, 0xeb,
	0x02, 0x0a, 0x0b, 0x4e, 0x6f, 0x74, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x38,
	0x0a, 0x0a, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x12, 0x13, 0x2e, 0x6e,
	0x6f, 0x74, 0x65, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x65,
	0x71, 0x1a, 0x13, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e,
	0x6f, 0x74, 0x65, 0x52, 0x65, 0x73, 0x22, 0x00, 0x12, 0x44, 0x0a, 0x0e, 0x55, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x49, 0x64, 0x12, 0x17, 0x2e, 0x6e, 0x6f, 0x74,
	0x65, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x49, 0x64,
	0x52, 0x65, 0x71, 0x1a, 0x17, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x73, 0x22, 0x00, 0x12, 0x44,
	0x0a, 0x0e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x49, 0x64,
	0x12, 0x17, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4e, 0x6f,
	0x74, 0x65, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x71, 0x1a, 0x17, 0x2e, 0x6e, 0x6f, 0x74, 0x65,
	0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x49, 0x64, 0x52,
	0x65, 0x73, 0x22, 0x00, 0x12, 0x4d, 0x0a, 0x11, 0x51, 0x75, 0x65, 0x72, 0x79, 0x4e, 0x6f, 0x74,
	0x65, 0x42, 0x79, 0x4e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x12, 0x1a, 0x2e, 0x6e, 0x6f, 0x74, 0x65,
	0x2e, 0x51, 0x75, 0x65, 0x72, 0x79, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x4e, 0x6f, 0x74, 0x65,
	0x49, 0x64, 0x52, 0x65, 0x71, 0x1a, 0x1a, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x51, 0x75, 0x65,
	0x72, 0x79, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x4e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x52, 0x65,
	0x73, 0x22, 0x00, 0x12, 0x47, 0x0a, 0x0f, 0x51, 0x75, 0x65, 0x72, 0x79, 0x50, 0x61, 0x67, 0x65,
	0x64, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x12, 0x18, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x51, 0x75,
	0x65, 0x72, 0x79, 0x50, 0x61, 0x67, 0x65, 0x64, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x52, 0x65, 0x71,
	0x1a, 0x18, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x2e, 0x51, 0x75, 0x65, 0x72, 0x79, 0x50, 0x61, 0x67,
	0x65, 0x64, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x52, 0x65, 0x73, 0x22, 0x00, 0x42, 0x8b, 0x01, 0x0a,
	0x2a, 0x69, 0x6e, 0x66, 0x6f, 0x2e, 0x6d, 0x6f, 0x65, 0x74, 0x61, 0x6e, 0x67, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x42, 0x09, 0x4e, 0x6f, 0x74,
	0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x3d, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x65, 0x69, 0x64, 0x6f, 0x6d, 0x78, 0x2f, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f,
	0x67, 0x6f, 0x2f, 0x6e, 0x6f, 0x74, 0x65, 0xaa, 0x02, 0x10, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x47, 0x72, 0x70, 0x63, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_note_note_proto_rawDescOnce sync.Once
	file_note_note_proto_rawDescData = file_note_note_proto_rawDesc
)

func file_note_note_proto_rawDescGZIP() []byte {
	file_note_note_proto_rawDescOnce.Do(func() {
		file_note_note_proto_rawDescData = protoimpl.X.CompressGZIP(file_note_note_proto_rawDescData)
	})
	return file_note_note_proto_rawDescData
}

var file_note_note_proto_msgTypes = make([]protoimpl.MessageInfo, 11)
var file_note_note_proto_goTypes = []interface{}{
	(*Note)(nil),                 // 0: note.Note
	(*CreateNoteReq)(nil),        // 1: note.CreateNoteReq
	(*CreateNoteRes)(nil),        // 2: note.CreateNoteRes
	(*QueryNoteByNoteIdReq)(nil), // 3: note.QueryNoteByNoteIdReq
	(*QueryNoteByNoteIdRes)(nil), // 4: note.QueryNoteByNoteIdRes
	(*QueryPagedNotesReq)(nil),   // 5: note.QueryPagedNotesReq
	(*QueryPagedNotesRes)(nil),   // 6: note.QueryPagedNotesRes
	(*UpdateNoteByIdReq)(nil),    // 7: note.UpdateNoteByIdReq
	(*UpdateNoteByIdRes)(nil),    // 8: note.UpdateNoteByIdRes
	(*DeleteNoteByIdReq)(nil),    // 9: note.DeleteNoteByIdReq
	(*DeleteNoteByIdRes)(nil),    // 10: note.DeleteNoteByIdRes
	(*shared.Result)(nil),        // 11: shared.Result
}
var file_note_note_proto_depIdxs = []int32{
	11, // 0: note.CreateNoteRes.result:type_name -> shared.Result
	0,  // 1: note.CreateNoteRes.note:type_name -> note.Note
	11, // 2: note.QueryNoteByNoteIdRes.result:type_name -> shared.Result
	0,  // 3: note.QueryNoteByNoteIdRes.note:type_name -> note.Note
	11, // 4: note.QueryPagedNotesRes.result:type_name -> shared.Result
	0,  // 5: note.QueryPagedNotesRes.notes:type_name -> note.Note
	11, // 6: note.UpdateNoteByIdRes.result:type_name -> shared.Result
	0,  // 7: note.UpdateNoteByIdRes.note:type_name -> note.Note
	11, // 8: note.DeleteNoteByIdRes.result:type_name -> shared.Result
	1,  // 9: note.NoteService.CreateNote:input_type -> note.CreateNoteReq
	7,  // 10: note.NoteService.UpdateNoteById:input_type -> note.UpdateNoteByIdReq
	9,  // 11: note.NoteService.DeleteNoteById:input_type -> note.DeleteNoteByIdReq
	3,  // 12: note.NoteService.QueryNoteByNoteId:input_type -> note.QueryNoteByNoteIdReq
	5,  // 13: note.NoteService.QueryPagedNotes:input_type -> note.QueryPagedNotesReq
	2,  // 14: note.NoteService.CreateNote:output_type -> note.CreateNoteRes
	8,  // 15: note.NoteService.UpdateNoteById:output_type -> note.UpdateNoteByIdRes
	10, // 16: note.NoteService.DeleteNoteById:output_type -> note.DeleteNoteByIdRes
	4,  // 17: note.NoteService.QueryNoteByNoteId:output_type -> note.QueryNoteByNoteIdRes
	6,  // 18: note.NoteService.QueryPagedNotes:output_type -> note.QueryPagedNotesRes
	14, // [14:19] is the sub-list for method output_type
	9,  // [9:14] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_note_note_proto_init() }
func file_note_note_proto_init() {
	if File_note_note_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_note_note_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Note); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateNoteReq); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateNoteRes); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QueryNoteByNoteIdReq); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QueryNoteByNoteIdRes); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QueryPagedNotesReq); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QueryPagedNotesRes); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateNoteByIdReq); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateNoteByIdRes); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteNoteByIdReq); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_note_note_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteNoteByIdRes); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_note_note_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   11,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_note_note_proto_goTypes,
		DependencyIndexes: file_note_note_proto_depIdxs,
		MessageInfos:      file_note_note_proto_msgTypes,
	}.Build()
	File_note_note_proto = out.File
	file_note_note_proto_rawDesc = nil
	file_note_note_proto_goTypes = nil
	file_note_note_proto_depIdxs = nil
}
