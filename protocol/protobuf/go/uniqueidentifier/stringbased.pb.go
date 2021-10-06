// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.17.3
// source: uniqueidentifier/stringbased.proto

package uniqueidentifier

import (
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

type GenerateStringReq struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *GenerateStringReq) Reset() {
	*x = GenerateStringReq{}
	if protoimpl.UnsafeEnabled {
		mi := &file_uniqueidentifier_stringbased_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateStringReq) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateStringReq) ProtoMessage() {}

func (x *GenerateStringReq) ProtoReflect() protoreflect.Message {
	mi := &file_uniqueidentifier_stringbased_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateStringReq.ProtoReflect.Descriptor instead.
func (*GenerateStringReq) Descriptor() ([]byte, []int) {
	return file_uniqueidentifier_stringbased_proto_rawDescGZIP(), []int{0}
}

type GenerateStringRes struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Success          bool   `protobuf:"varint,1,opt,name=success,proto3" json:"success,omitempty"`
	ErrorMessage     string `protobuf:"bytes,2,opt,name=error_message,json=errorMessage,proto3" json:"error_message,omitempty"`
	UniqueIdentifier string `protobuf:"bytes,11,opt,name=unique_identifier,json=uniqueIdentifier,proto3" json:"unique_identifier,omitempty"`
}

func (x *GenerateStringRes) Reset() {
	*x = GenerateStringRes{}
	if protoimpl.UnsafeEnabled {
		mi := &file_uniqueidentifier_stringbased_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateStringRes) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateStringRes) ProtoMessage() {}

func (x *GenerateStringRes) ProtoReflect() protoreflect.Message {
	mi := &file_uniqueidentifier_stringbased_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateStringRes.ProtoReflect.Descriptor instead.
func (*GenerateStringRes) Descriptor() ([]byte, []int) {
	return file_uniqueidentifier_stringbased_proto_rawDescGZIP(), []int{1}
}

func (x *GenerateStringRes) GetSuccess() bool {
	if x != nil {
		return x.Success
	}
	return false
}

func (x *GenerateStringRes) GetErrorMessage() string {
	if x != nil {
		return x.ErrorMessage
	}
	return ""
}

func (x *GenerateStringRes) GetUniqueIdentifier() string {
	if x != nil {
		return x.UniqueIdentifier
	}
	return ""
}

var File_uniqueidentifier_stringbased_proto protoreflect.FileDescriptor

var file_uniqueidentifier_stringbased_proto_rawDesc = []byte{
	0x0a, 0x22, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x66, 0x69,
	0x65, 0x72, 0x2f, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x62, 0x61, 0x73, 0x65, 0x64, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x69, 0x64, 0x65, 0x6e,
	0x74, 0x69, 0x66, 0x69, 0x65, 0x72, 0x22, 0x13, 0x0a, 0x11, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61,
	0x74, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x71, 0x22, 0x7f, 0x0a, 0x11, 0x47,
	0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x73,
	0x12, 0x18, 0x0a, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x12, 0x23, 0x0a, 0x0d, 0x65, 0x72,
	0x72, 0x6f, 0x72, 0x5f, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0c, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12,
	0x2b, 0x0a, 0x11, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x5f, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x69,
	0x66, 0x69, 0x65, 0x72, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x75, 0x6e, 0x69, 0x71,
	0x75, 0x65, 0x49, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x66, 0x69, 0x65, 0x72, 0x32, 0x7a, 0x0a, 0x22,
	0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x42, 0x61, 0x73, 0x65, 0x64, 0x55, 0x6e, 0x69, 0x71, 0x75,
	0x65, 0x49, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x66, 0x69, 0x65, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x12, 0x54, 0x0a, 0x08, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x12, 0x23,
	0x2e, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x66, 0x69, 0x65,
	0x72, 0x2e, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67,
	0x52, 0x65, 0x71, 0x1a, 0x23, 0x2e, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x69, 0x64, 0x65, 0x6e,
	0x74, 0x69, 0x66, 0x69, 0x65, 0x72, 0x2e, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x53,
	0x74, 0x72, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x73, 0x42, 0xa7, 0x01, 0x0a, 0x36, 0x69, 0x6e, 0x66,
	0x6f, 0x2e, 0x6d, 0x6f, 0x65, 0x74, 0x61, 0x6e, 0x67, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x66,
	0x69, 0x65, 0x72, 0x42, 0x20, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x42, 0x61, 0x73, 0x65, 0x64,
	0x55, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x49, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x66, 0x69, 0x65, 0x72,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x49, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x65, 0x69, 0x64, 0x6f, 0x6d, 0x78, 0x2f, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2f, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67,
	0x6f, 0x2f, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x66, 0x69,
	0x65, 0x72, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_uniqueidentifier_stringbased_proto_rawDescOnce sync.Once
	file_uniqueidentifier_stringbased_proto_rawDescData = file_uniqueidentifier_stringbased_proto_rawDesc
)

func file_uniqueidentifier_stringbased_proto_rawDescGZIP() []byte {
	file_uniqueidentifier_stringbased_proto_rawDescOnce.Do(func() {
		file_uniqueidentifier_stringbased_proto_rawDescData = protoimpl.X.CompressGZIP(file_uniqueidentifier_stringbased_proto_rawDescData)
	})
	return file_uniqueidentifier_stringbased_proto_rawDescData
}

var file_uniqueidentifier_stringbased_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_uniqueidentifier_stringbased_proto_goTypes = []interface{}{
	(*GenerateStringReq)(nil), // 0: uniqueidentifier.GenerateStringReq
	(*GenerateStringRes)(nil), // 1: uniqueidentifier.GenerateStringRes
}
var file_uniqueidentifier_stringbased_proto_depIdxs = []int32{
	0, // 0: uniqueidentifier.StringBasedUniqueIdentifierService.Generate:input_type -> uniqueidentifier.GenerateStringReq
	1, // 1: uniqueidentifier.StringBasedUniqueIdentifierService.Generate:output_type -> uniqueidentifier.GenerateStringRes
	1, // [1:2] is the sub-list for method output_type
	0, // [0:1] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_uniqueidentifier_stringbased_proto_init() }
func file_uniqueidentifier_stringbased_proto_init() {
	if File_uniqueidentifier_stringbased_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_uniqueidentifier_stringbased_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateStringReq); i {
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
		file_uniqueidentifier_stringbased_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateStringRes); i {
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
			RawDescriptor: file_uniqueidentifier_stringbased_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_uniqueidentifier_stringbased_proto_goTypes,
		DependencyIndexes: file_uniqueidentifier_stringbased_proto_depIdxs,
		MessageInfos:      file_uniqueidentifier_stringbased_proto_msgTypes,
	}.Build()
	File_uniqueidentifier_stringbased_proto = out.File
	file_uniqueidentifier_stringbased_proto_rawDesc = nil
	file_uniqueidentifier_stringbased_proto_goTypes = nil
	file_uniqueidentifier_stringbased_proto_depIdxs = nil
}
