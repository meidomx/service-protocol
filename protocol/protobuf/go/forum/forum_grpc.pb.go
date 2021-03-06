// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package forum

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

// ForumServiceClient is the client API for ForumService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ForumServiceClient interface {
	CreateForum(ctx context.Context, in *CreateForumReq, opts ...grpc.CallOption) (*CreateForumRes, error)
	UpdateForumById(ctx context.Context, in *UpdateForumByIdReq, opts ...grpc.CallOption) (*UpdateForumByIdRes, error)
	DeleteForumById(ctx context.Context, in *DeleteForumByIdReq, opts ...grpc.CallOption) (*DeleteForumByIdRes, error)
	ListAllForums(ctx context.Context, in *ListAllForumsReq, opts ...grpc.CallOption) (*ListAllForumsRes, error)
	QueryForumById(ctx context.Context, in *QueryForumByIdReq, opts ...grpc.CallOption) (*QueryForumByIdRes, error)
	CreateThread(ctx context.Context, in *CreateThreadReq, opts ...grpc.CallOption) (*CreateThreadRes, error)
	UpdateThreadById(ctx context.Context, in *UpdateThreadByIdReq, opts ...grpc.CallOption) (*UpdateThreadByIdRes, error)
	DeleteThreadById(ctx context.Context, in *DeleteThreadByIdReq, opts ...grpc.CallOption) (*DeleteThreadByIdRes, error)
	QueryThreadById(ctx context.Context, in *QueryThreadByIdReq, opts ...grpc.CallOption) (*QueryThreadByIdRes, error)
	QueryPagedThreadTitlesByForumId(ctx context.Context, in *QueryPagedThreadsByForumIdReq, opts ...grpc.CallOption) (*QueryPagedThreadsByForumIdRes, error)
	CreateReply(ctx context.Context, in *CreateReplyReq, opts ...grpc.CallOption) (*CreateReplyRes, error)
	UpdateReplyById(ctx context.Context, in *UpdateReplyReq, opts ...grpc.CallOption) (*UpdateReplyRes, error)
	DeleteReplyById(ctx context.Context, in *DeleteReplyByIdReq, opts ...grpc.CallOption) (*DeleteReplyByIdRes, error)
	QueryReplyById(ctx context.Context, in *QueryReplyByIdReq, opts ...grpc.CallOption) (*QueryReplyByIdRes, error)
	QueryPagedRepliesByThreadId(ctx context.Context, in *QueryPagedRepliesByThreadIdReq, opts ...grpc.CallOption) (*QueryPagedRepliesByThreadIdRes, error)
}

type forumServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewForumServiceClient(cc grpc.ClientConnInterface) ForumServiceClient {
	return &forumServiceClient{cc}
}

func (c *forumServiceClient) CreateForum(ctx context.Context, in *CreateForumReq, opts ...grpc.CallOption) (*CreateForumRes, error) {
	out := new(CreateForumRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/CreateForum", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) UpdateForumById(ctx context.Context, in *UpdateForumByIdReq, opts ...grpc.CallOption) (*UpdateForumByIdRes, error) {
	out := new(UpdateForumByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/UpdateForumById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) DeleteForumById(ctx context.Context, in *DeleteForumByIdReq, opts ...grpc.CallOption) (*DeleteForumByIdRes, error) {
	out := new(DeleteForumByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/DeleteForumById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) ListAllForums(ctx context.Context, in *ListAllForumsReq, opts ...grpc.CallOption) (*ListAllForumsRes, error) {
	out := new(ListAllForumsRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/ListAllForums", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) QueryForumById(ctx context.Context, in *QueryForumByIdReq, opts ...grpc.CallOption) (*QueryForumByIdRes, error) {
	out := new(QueryForumByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/QueryForumById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) CreateThread(ctx context.Context, in *CreateThreadReq, opts ...grpc.CallOption) (*CreateThreadRes, error) {
	out := new(CreateThreadRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/CreateThread", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) UpdateThreadById(ctx context.Context, in *UpdateThreadByIdReq, opts ...grpc.CallOption) (*UpdateThreadByIdRes, error) {
	out := new(UpdateThreadByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/UpdateThreadById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) DeleteThreadById(ctx context.Context, in *DeleteThreadByIdReq, opts ...grpc.CallOption) (*DeleteThreadByIdRes, error) {
	out := new(DeleteThreadByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/DeleteThreadById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) QueryThreadById(ctx context.Context, in *QueryThreadByIdReq, opts ...grpc.CallOption) (*QueryThreadByIdRes, error) {
	out := new(QueryThreadByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/QueryThreadById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) QueryPagedThreadTitlesByForumId(ctx context.Context, in *QueryPagedThreadsByForumIdReq, opts ...grpc.CallOption) (*QueryPagedThreadsByForumIdRes, error) {
	out := new(QueryPagedThreadsByForumIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/QueryPagedThreadTitlesByForumId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) CreateReply(ctx context.Context, in *CreateReplyReq, opts ...grpc.CallOption) (*CreateReplyRes, error) {
	out := new(CreateReplyRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/CreateReply", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) UpdateReplyById(ctx context.Context, in *UpdateReplyReq, opts ...grpc.CallOption) (*UpdateReplyRes, error) {
	out := new(UpdateReplyRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/UpdateReplyById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) DeleteReplyById(ctx context.Context, in *DeleteReplyByIdReq, opts ...grpc.CallOption) (*DeleteReplyByIdRes, error) {
	out := new(DeleteReplyByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/DeleteReplyById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) QueryReplyById(ctx context.Context, in *QueryReplyByIdReq, opts ...grpc.CallOption) (*QueryReplyByIdRes, error) {
	out := new(QueryReplyByIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/QueryReplyById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *forumServiceClient) QueryPagedRepliesByThreadId(ctx context.Context, in *QueryPagedRepliesByThreadIdReq, opts ...grpc.CallOption) (*QueryPagedRepliesByThreadIdRes, error) {
	out := new(QueryPagedRepliesByThreadIdRes)
	err := c.cc.Invoke(ctx, "/forum.ForumService/QueryPagedRepliesByThreadId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ForumServiceServer is the server API for ForumService service.
// All implementations must embed UnimplementedForumServiceServer
// for forward compatibility
type ForumServiceServer interface {
	CreateForum(context.Context, *CreateForumReq) (*CreateForumRes, error)
	UpdateForumById(context.Context, *UpdateForumByIdReq) (*UpdateForumByIdRes, error)
	DeleteForumById(context.Context, *DeleteForumByIdReq) (*DeleteForumByIdRes, error)
	ListAllForums(context.Context, *ListAllForumsReq) (*ListAllForumsRes, error)
	QueryForumById(context.Context, *QueryForumByIdReq) (*QueryForumByIdRes, error)
	CreateThread(context.Context, *CreateThreadReq) (*CreateThreadRes, error)
	UpdateThreadById(context.Context, *UpdateThreadByIdReq) (*UpdateThreadByIdRes, error)
	DeleteThreadById(context.Context, *DeleteThreadByIdReq) (*DeleteThreadByIdRes, error)
	QueryThreadById(context.Context, *QueryThreadByIdReq) (*QueryThreadByIdRes, error)
	QueryPagedThreadTitlesByForumId(context.Context, *QueryPagedThreadsByForumIdReq) (*QueryPagedThreadsByForumIdRes, error)
	CreateReply(context.Context, *CreateReplyReq) (*CreateReplyRes, error)
	UpdateReplyById(context.Context, *UpdateReplyReq) (*UpdateReplyRes, error)
	DeleteReplyById(context.Context, *DeleteReplyByIdReq) (*DeleteReplyByIdRes, error)
	QueryReplyById(context.Context, *QueryReplyByIdReq) (*QueryReplyByIdRes, error)
	QueryPagedRepliesByThreadId(context.Context, *QueryPagedRepliesByThreadIdReq) (*QueryPagedRepliesByThreadIdRes, error)
	mustEmbedUnimplementedForumServiceServer()
}

// UnimplementedForumServiceServer must be embedded to have forward compatible implementations.
type UnimplementedForumServiceServer struct {
}

func (UnimplementedForumServiceServer) CreateForum(context.Context, *CreateForumReq) (*CreateForumRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateForum not implemented")
}
func (UnimplementedForumServiceServer) UpdateForumById(context.Context, *UpdateForumByIdReq) (*UpdateForumByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateForumById not implemented")
}
func (UnimplementedForumServiceServer) DeleteForumById(context.Context, *DeleteForumByIdReq) (*DeleteForumByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteForumById not implemented")
}
func (UnimplementedForumServiceServer) ListAllForums(context.Context, *ListAllForumsReq) (*ListAllForumsRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListAllForums not implemented")
}
func (UnimplementedForumServiceServer) QueryForumById(context.Context, *QueryForumByIdReq) (*QueryForumByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryForumById not implemented")
}
func (UnimplementedForumServiceServer) CreateThread(context.Context, *CreateThreadReq) (*CreateThreadRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateThread not implemented")
}
func (UnimplementedForumServiceServer) UpdateThreadById(context.Context, *UpdateThreadByIdReq) (*UpdateThreadByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateThreadById not implemented")
}
func (UnimplementedForumServiceServer) DeleteThreadById(context.Context, *DeleteThreadByIdReq) (*DeleteThreadByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteThreadById not implemented")
}
func (UnimplementedForumServiceServer) QueryThreadById(context.Context, *QueryThreadByIdReq) (*QueryThreadByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryThreadById not implemented")
}
func (UnimplementedForumServiceServer) QueryPagedThreadTitlesByForumId(context.Context, *QueryPagedThreadsByForumIdReq) (*QueryPagedThreadsByForumIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryPagedThreadTitlesByForumId not implemented")
}
func (UnimplementedForumServiceServer) CreateReply(context.Context, *CreateReplyReq) (*CreateReplyRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateReply not implemented")
}
func (UnimplementedForumServiceServer) UpdateReplyById(context.Context, *UpdateReplyReq) (*UpdateReplyRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateReplyById not implemented")
}
func (UnimplementedForumServiceServer) DeleteReplyById(context.Context, *DeleteReplyByIdReq) (*DeleteReplyByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteReplyById not implemented")
}
func (UnimplementedForumServiceServer) QueryReplyById(context.Context, *QueryReplyByIdReq) (*QueryReplyByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryReplyById not implemented")
}
func (UnimplementedForumServiceServer) QueryPagedRepliesByThreadId(context.Context, *QueryPagedRepliesByThreadIdReq) (*QueryPagedRepliesByThreadIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryPagedRepliesByThreadId not implemented")
}
func (UnimplementedForumServiceServer) mustEmbedUnimplementedForumServiceServer() {}

// UnsafeForumServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ForumServiceServer will
// result in compilation errors.
type UnsafeForumServiceServer interface {
	mustEmbedUnimplementedForumServiceServer()
}

func RegisterForumServiceServer(s grpc.ServiceRegistrar, srv ForumServiceServer) {
	s.RegisterService(&ForumService_ServiceDesc, srv)
}

func _ForumService_CreateForum_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateForumReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).CreateForum(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/CreateForum",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).CreateForum(ctx, req.(*CreateForumReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_UpdateForumById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateForumByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).UpdateForumById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/UpdateForumById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).UpdateForumById(ctx, req.(*UpdateForumByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_DeleteForumById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteForumByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).DeleteForumById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/DeleteForumById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).DeleteForumById(ctx, req.(*DeleteForumByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_ListAllForums_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListAllForumsReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).ListAllForums(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/ListAllForums",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).ListAllForums(ctx, req.(*ListAllForumsReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_QueryForumById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryForumByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).QueryForumById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/QueryForumById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).QueryForumById(ctx, req.(*QueryForumByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_CreateThread_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateThreadReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).CreateThread(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/CreateThread",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).CreateThread(ctx, req.(*CreateThreadReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_UpdateThreadById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateThreadByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).UpdateThreadById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/UpdateThreadById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).UpdateThreadById(ctx, req.(*UpdateThreadByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_DeleteThreadById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteThreadByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).DeleteThreadById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/DeleteThreadById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).DeleteThreadById(ctx, req.(*DeleteThreadByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_QueryThreadById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryThreadByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).QueryThreadById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/QueryThreadById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).QueryThreadById(ctx, req.(*QueryThreadByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_QueryPagedThreadTitlesByForumId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryPagedThreadsByForumIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).QueryPagedThreadTitlesByForumId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/QueryPagedThreadTitlesByForumId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).QueryPagedThreadTitlesByForumId(ctx, req.(*QueryPagedThreadsByForumIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_CreateReply_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateReplyReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).CreateReply(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/CreateReply",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).CreateReply(ctx, req.(*CreateReplyReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_UpdateReplyById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateReplyReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).UpdateReplyById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/UpdateReplyById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).UpdateReplyById(ctx, req.(*UpdateReplyReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_DeleteReplyById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteReplyByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).DeleteReplyById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/DeleteReplyById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).DeleteReplyById(ctx, req.(*DeleteReplyByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_QueryReplyById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryReplyByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).QueryReplyById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/QueryReplyById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).QueryReplyById(ctx, req.(*QueryReplyByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _ForumService_QueryPagedRepliesByThreadId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryPagedRepliesByThreadIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ForumServiceServer).QueryPagedRepliesByThreadId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/forum.ForumService/QueryPagedRepliesByThreadId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ForumServiceServer).QueryPagedRepliesByThreadId(ctx, req.(*QueryPagedRepliesByThreadIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

// ForumService_ServiceDesc is the grpc.ServiceDesc for ForumService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var ForumService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "forum.ForumService",
	HandlerType: (*ForumServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateForum",
			Handler:    _ForumService_CreateForum_Handler,
		},
		{
			MethodName: "UpdateForumById",
			Handler:    _ForumService_UpdateForumById_Handler,
		},
		{
			MethodName: "DeleteForumById",
			Handler:    _ForumService_DeleteForumById_Handler,
		},
		{
			MethodName: "ListAllForums",
			Handler:    _ForumService_ListAllForums_Handler,
		},
		{
			MethodName: "QueryForumById",
			Handler:    _ForumService_QueryForumById_Handler,
		},
		{
			MethodName: "CreateThread",
			Handler:    _ForumService_CreateThread_Handler,
		},
		{
			MethodName: "UpdateThreadById",
			Handler:    _ForumService_UpdateThreadById_Handler,
		},
		{
			MethodName: "DeleteThreadById",
			Handler:    _ForumService_DeleteThreadById_Handler,
		},
		{
			MethodName: "QueryThreadById",
			Handler:    _ForumService_QueryThreadById_Handler,
		},
		{
			MethodName: "QueryPagedThreadTitlesByForumId",
			Handler:    _ForumService_QueryPagedThreadTitlesByForumId_Handler,
		},
		{
			MethodName: "CreateReply",
			Handler:    _ForumService_CreateReply_Handler,
		},
		{
			MethodName: "UpdateReplyById",
			Handler:    _ForumService_UpdateReplyById_Handler,
		},
		{
			MethodName: "DeleteReplyById",
			Handler:    _ForumService_DeleteReplyById_Handler,
		},
		{
			MethodName: "QueryReplyById",
			Handler:    _ForumService_QueryReplyById_Handler,
		},
		{
			MethodName: "QueryPagedRepliesByThreadId",
			Handler:    _ForumService_QueryPagedRepliesByThreadId_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "forum/forum.proto",
}
