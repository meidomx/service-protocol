// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package note

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// NoteServiceClient is the client API for NoteService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type NoteServiceClient interface {
	CreateNote(ctx context.Context, in *CreateNoteReq, opts ...grpc.CallOption) (*CreateNoteRes, error)
	UpdateNoteById(ctx context.Context, in *UpdateNoteByIdReq, opts ...grpc.CallOption) (*UpdateNoteByIdRes, error)
	DeleteNoteById(ctx context.Context, in *DeleteNoteByIdReq, opts ...grpc.CallOption) (*DeleteNoteByIdRes, error)
	QueryNoteByNoteId(ctx context.Context, in *QueryNoteByNoteIdReq, opts ...grpc.CallOption) (*QueryNoteByNoteIdRes, error)
	QueryPagedNotes(ctx context.Context, in *QueryPagedNotesReq, opts ...grpc.CallOption) (*QueryPagedNotesRes, error)
}

type noteServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewNoteServiceClient(cc grpc.ClientConnInterface) NoteServiceClient {
	return &noteServiceClient{cc}
}

func (c *noteServiceClient) CreateNote(ctx context.Context, in *CreateNoteReq, opts ...grpc.CallOption) (*CreateNoteRes, error) {
	out := new(CreateNoteRes)
	err := c.cc.Invoke(ctx, "/note.NoteService/CreateNote", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *noteServiceClient) UpdateNoteById(ctx context.Context, in *UpdateNoteByIdReq, opts ...grpc.CallOption) (*UpdateNoteByIdRes, error) {
	out := new(UpdateNoteByIdRes)
	err := c.cc.Invoke(ctx, "/note.NoteService/UpdateNoteById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *noteServiceClient) DeleteNoteById(ctx context.Context, in *DeleteNoteByIdReq, opts ...grpc.CallOption) (*DeleteNoteByIdRes, error) {
	out := new(DeleteNoteByIdRes)
	err := c.cc.Invoke(ctx, "/note.NoteService/DeleteNoteById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *noteServiceClient) QueryNoteByNoteId(ctx context.Context, in *QueryNoteByNoteIdReq, opts ...grpc.CallOption) (*QueryNoteByNoteIdRes, error) {
	out := new(QueryNoteByNoteIdRes)
	err := c.cc.Invoke(ctx, "/note.NoteService/QueryNoteByNoteId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *noteServiceClient) QueryPagedNotes(ctx context.Context, in *QueryPagedNotesReq, opts ...grpc.CallOption) (*QueryPagedNotesRes, error) {
	out := new(QueryPagedNotesRes)
	err := c.cc.Invoke(ctx, "/note.NoteService/QueryPagedNotes", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// NoteServiceServer is the server API for NoteService service.
// All implementations must embed UnimplementedNoteServiceServer
// for forward compatibility
type NoteServiceServer interface {
	CreateNote(context.Context, *CreateNoteReq) (*CreateNoteRes, error)
	UpdateNoteById(context.Context, *UpdateNoteByIdReq) (*UpdateNoteByIdRes, error)
	DeleteNoteById(context.Context, *DeleteNoteByIdReq) (*DeleteNoteByIdRes, error)
	QueryNoteByNoteId(context.Context, *QueryNoteByNoteIdReq) (*QueryNoteByNoteIdRes, error)
	QueryPagedNotes(context.Context, *QueryPagedNotesReq) (*QueryPagedNotesRes, error)
	mustEmbedUnimplementedNoteServiceServer()
}

// UnimplementedNoteServiceServer must be embedded to have forward compatible implementations.
type UnimplementedNoteServiceServer struct {
}

func (UnimplementedNoteServiceServer) CreateNote(context.Context, *CreateNoteReq) (*CreateNoteRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateNote not implemented")
}
func (UnimplementedNoteServiceServer) UpdateNoteById(context.Context, *UpdateNoteByIdReq) (*UpdateNoteByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateNoteById not implemented")
}
func (UnimplementedNoteServiceServer) DeleteNoteById(context.Context, *DeleteNoteByIdReq) (*DeleteNoteByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteNoteById not implemented")
}
func (UnimplementedNoteServiceServer) QueryNoteByNoteId(context.Context, *QueryNoteByNoteIdReq) (*QueryNoteByNoteIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryNoteByNoteId not implemented")
}
func (UnimplementedNoteServiceServer) QueryPagedNotes(context.Context, *QueryPagedNotesReq) (*QueryPagedNotesRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryPagedNotes not implemented")
}
func (UnimplementedNoteServiceServer) mustEmbedUnimplementedNoteServiceServer() {}

// UnsafeNoteServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to NoteServiceServer will
// result in compilation errors.
type UnsafeNoteServiceServer interface {
	mustEmbedUnimplementedNoteServiceServer()
}

func RegisterNoteServiceServer(s grpc.ServiceRegistrar, srv NoteServiceServer) {
	s.RegisterService(&NoteService_ServiceDesc, srv)
}

func _NoteService_CreateNote_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateNoteReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NoteServiceServer).CreateNote(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/note.NoteService/CreateNote",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NoteServiceServer).CreateNote(ctx, req.(*CreateNoteReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _NoteService_UpdateNoteById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateNoteByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NoteServiceServer).UpdateNoteById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/note.NoteService/UpdateNoteById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NoteServiceServer).UpdateNoteById(ctx, req.(*UpdateNoteByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _NoteService_DeleteNoteById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteNoteByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NoteServiceServer).DeleteNoteById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/note.NoteService/DeleteNoteById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NoteServiceServer).DeleteNoteById(ctx, req.(*DeleteNoteByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _NoteService_QueryNoteByNoteId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryNoteByNoteIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NoteServiceServer).QueryNoteByNoteId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/note.NoteService/QueryNoteByNoteId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NoteServiceServer).QueryNoteByNoteId(ctx, req.(*QueryNoteByNoteIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _NoteService_QueryPagedNotes_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryPagedNotesReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NoteServiceServer).QueryPagedNotes(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/note.NoteService/QueryPagedNotes",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NoteServiceServer).QueryPagedNotes(ctx, req.(*QueryPagedNotesReq))
	}
	return interceptor(ctx, in, info, handler)
}

// NoteService_ServiceDesc is the grpc.ServiceDesc for NoteService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var NoteService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "note.NoteService",
	HandlerType: (*NoteServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateNote",
			Handler:    _NoteService_CreateNote_Handler,
		},
		{
			MethodName: "UpdateNoteById",
			Handler:    _NoteService_UpdateNoteById_Handler,
		},
		{
			MethodName: "DeleteNoteById",
			Handler:    _NoteService_DeleteNoteById_Handler,
		},
		{
			MethodName: "QueryNoteByNoteId",
			Handler:    _NoteService_QueryNoteByNoteId_Handler,
		},
		{
			MethodName: "QueryPagedNotes",
			Handler:    _NoteService_QueryPagedNotes_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "note/note.proto",
}
