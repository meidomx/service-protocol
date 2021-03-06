// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package countdown

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

// CountdownServiceClient is the client API for CountdownService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type CountdownServiceClient interface {
	CreateCountdown(ctx context.Context, in *CreateCountdownReq, opts ...grpc.CallOption) (*CreateCountdownRes, error)
	NextCountdownIntervalById(ctx context.Context, in *NextCountdownIntervalByIdReq, opts ...grpc.CallOption) (*NextCountdownIntervalByIdRes, error)
	ChangeCountdownStatus(ctx context.Context, in *ChangeCountdownStatusReq, opts ...grpc.CallOption) (*ChangeCountdownStatusRes, error)
	UpdateCountdownById(ctx context.Context, in *UpdateCountdownReq, opts ...grpc.CallOption) (*UpdateCountdownRes, error)
	QueryCountdownById(ctx context.Context, in *QueryCountdownByIdReq, opts ...grpc.CallOption) (*QueryCountdownByIdRes, error)
	QueryPagedExpringCountdownsByType(ctx context.Context, in *QueryPagedExpringCountdownsByTypeReq, opts ...grpc.CallOption) (*QueryPagedExpringCountdownsByTypeRes, error)
	QueryPagedCountdownsByType(ctx context.Context, in *QueryPagedCountdownsByTypeReq, opts ...grpc.CallOption) (*QueryPagedCountdownsByTypeRes, error)
}

type countdownServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewCountdownServiceClient(cc grpc.ClientConnInterface) CountdownServiceClient {
	return &countdownServiceClient{cc}
}

func (c *countdownServiceClient) CreateCountdown(ctx context.Context, in *CreateCountdownReq, opts ...grpc.CallOption) (*CreateCountdownRes, error) {
	out := new(CreateCountdownRes)
	err := c.cc.Invoke(ctx, "/countdown.CountdownService/CreateCountdown", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *countdownServiceClient) NextCountdownIntervalById(ctx context.Context, in *NextCountdownIntervalByIdReq, opts ...grpc.CallOption) (*NextCountdownIntervalByIdRes, error) {
	out := new(NextCountdownIntervalByIdRes)
	err := c.cc.Invoke(ctx, "/countdown.CountdownService/NextCountdownIntervalById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *countdownServiceClient) ChangeCountdownStatus(ctx context.Context, in *ChangeCountdownStatusReq, opts ...grpc.CallOption) (*ChangeCountdownStatusRes, error) {
	out := new(ChangeCountdownStatusRes)
	err := c.cc.Invoke(ctx, "/countdown.CountdownService/ChangeCountdownStatus", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *countdownServiceClient) UpdateCountdownById(ctx context.Context, in *UpdateCountdownReq, opts ...grpc.CallOption) (*UpdateCountdownRes, error) {
	out := new(UpdateCountdownRes)
	err := c.cc.Invoke(ctx, "/countdown.CountdownService/UpdateCountdownById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *countdownServiceClient) QueryCountdownById(ctx context.Context, in *QueryCountdownByIdReq, opts ...grpc.CallOption) (*QueryCountdownByIdRes, error) {
	out := new(QueryCountdownByIdRes)
	err := c.cc.Invoke(ctx, "/countdown.CountdownService/QueryCountdownById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *countdownServiceClient) QueryPagedExpringCountdownsByType(ctx context.Context, in *QueryPagedExpringCountdownsByTypeReq, opts ...grpc.CallOption) (*QueryPagedExpringCountdownsByTypeRes, error) {
	out := new(QueryPagedExpringCountdownsByTypeRes)
	err := c.cc.Invoke(ctx, "/countdown.CountdownService/QueryPagedExpringCountdownsByType", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *countdownServiceClient) QueryPagedCountdownsByType(ctx context.Context, in *QueryPagedCountdownsByTypeReq, opts ...grpc.CallOption) (*QueryPagedCountdownsByTypeRes, error) {
	out := new(QueryPagedCountdownsByTypeRes)
	err := c.cc.Invoke(ctx, "/countdown.CountdownService/QueryPagedCountdownsByType", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// CountdownServiceServer is the server API for CountdownService service.
// All implementations must embed UnimplementedCountdownServiceServer
// for forward compatibility
type CountdownServiceServer interface {
	CreateCountdown(context.Context, *CreateCountdownReq) (*CreateCountdownRes, error)
	NextCountdownIntervalById(context.Context, *NextCountdownIntervalByIdReq) (*NextCountdownIntervalByIdRes, error)
	ChangeCountdownStatus(context.Context, *ChangeCountdownStatusReq) (*ChangeCountdownStatusRes, error)
	UpdateCountdownById(context.Context, *UpdateCountdownReq) (*UpdateCountdownRes, error)
	QueryCountdownById(context.Context, *QueryCountdownByIdReq) (*QueryCountdownByIdRes, error)
	QueryPagedExpringCountdownsByType(context.Context, *QueryPagedExpringCountdownsByTypeReq) (*QueryPagedExpringCountdownsByTypeRes, error)
	QueryPagedCountdownsByType(context.Context, *QueryPagedCountdownsByTypeReq) (*QueryPagedCountdownsByTypeRes, error)
	mustEmbedUnimplementedCountdownServiceServer()
}

// UnimplementedCountdownServiceServer must be embedded to have forward compatible implementations.
type UnimplementedCountdownServiceServer struct {
}

func (UnimplementedCountdownServiceServer) CreateCountdown(context.Context, *CreateCountdownReq) (*CreateCountdownRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateCountdown not implemented")
}
func (UnimplementedCountdownServiceServer) NextCountdownIntervalById(context.Context, *NextCountdownIntervalByIdReq) (*NextCountdownIntervalByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method NextCountdownIntervalById not implemented")
}
func (UnimplementedCountdownServiceServer) ChangeCountdownStatus(context.Context, *ChangeCountdownStatusReq) (*ChangeCountdownStatusRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ChangeCountdownStatus not implemented")
}
func (UnimplementedCountdownServiceServer) UpdateCountdownById(context.Context, *UpdateCountdownReq) (*UpdateCountdownRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateCountdownById not implemented")
}
func (UnimplementedCountdownServiceServer) QueryCountdownById(context.Context, *QueryCountdownByIdReq) (*QueryCountdownByIdRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryCountdownById not implemented")
}
func (UnimplementedCountdownServiceServer) QueryPagedExpringCountdownsByType(context.Context, *QueryPagedExpringCountdownsByTypeReq) (*QueryPagedExpringCountdownsByTypeRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryPagedExpringCountdownsByType not implemented")
}
func (UnimplementedCountdownServiceServer) QueryPagedCountdownsByType(context.Context, *QueryPagedCountdownsByTypeReq) (*QueryPagedCountdownsByTypeRes, error) {
	return nil, status.Errorf(codes.Unimplemented, "method QueryPagedCountdownsByType not implemented")
}
func (UnimplementedCountdownServiceServer) mustEmbedUnimplementedCountdownServiceServer() {}

// UnsafeCountdownServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to CountdownServiceServer will
// result in compilation errors.
type UnsafeCountdownServiceServer interface {
	mustEmbedUnimplementedCountdownServiceServer()
}

func RegisterCountdownServiceServer(s grpc.ServiceRegistrar, srv CountdownServiceServer) {
	s.RegisterService(&CountdownService_ServiceDesc, srv)
}

func _CountdownService_CreateCountdown_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateCountdownReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CountdownServiceServer).CreateCountdown(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/countdown.CountdownService/CreateCountdown",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CountdownServiceServer).CreateCountdown(ctx, req.(*CreateCountdownReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _CountdownService_NextCountdownIntervalById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(NextCountdownIntervalByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CountdownServiceServer).NextCountdownIntervalById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/countdown.CountdownService/NextCountdownIntervalById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CountdownServiceServer).NextCountdownIntervalById(ctx, req.(*NextCountdownIntervalByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _CountdownService_ChangeCountdownStatus_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ChangeCountdownStatusReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CountdownServiceServer).ChangeCountdownStatus(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/countdown.CountdownService/ChangeCountdownStatus",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CountdownServiceServer).ChangeCountdownStatus(ctx, req.(*ChangeCountdownStatusReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _CountdownService_UpdateCountdownById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateCountdownReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CountdownServiceServer).UpdateCountdownById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/countdown.CountdownService/UpdateCountdownById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CountdownServiceServer).UpdateCountdownById(ctx, req.(*UpdateCountdownReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _CountdownService_QueryCountdownById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryCountdownByIdReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CountdownServiceServer).QueryCountdownById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/countdown.CountdownService/QueryCountdownById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CountdownServiceServer).QueryCountdownById(ctx, req.(*QueryCountdownByIdReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _CountdownService_QueryPagedExpringCountdownsByType_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryPagedExpringCountdownsByTypeReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CountdownServiceServer).QueryPagedExpringCountdownsByType(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/countdown.CountdownService/QueryPagedExpringCountdownsByType",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CountdownServiceServer).QueryPagedExpringCountdownsByType(ctx, req.(*QueryPagedExpringCountdownsByTypeReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _CountdownService_QueryPagedCountdownsByType_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueryPagedCountdownsByTypeReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CountdownServiceServer).QueryPagedCountdownsByType(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/countdown.CountdownService/QueryPagedCountdownsByType",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CountdownServiceServer).QueryPagedCountdownsByType(ctx, req.(*QueryPagedCountdownsByTypeReq))
	}
	return interceptor(ctx, in, info, handler)
}

// CountdownService_ServiceDesc is the grpc.ServiceDesc for CountdownService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var CountdownService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "countdown.CountdownService",
	HandlerType: (*CountdownServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateCountdown",
			Handler:    _CountdownService_CreateCountdown_Handler,
		},
		{
			MethodName: "NextCountdownIntervalById",
			Handler:    _CountdownService_NextCountdownIntervalById_Handler,
		},
		{
			MethodName: "ChangeCountdownStatus",
			Handler:    _CountdownService_ChangeCountdownStatus_Handler,
		},
		{
			MethodName: "UpdateCountdownById",
			Handler:    _CountdownService_UpdateCountdownById_Handler,
		},
		{
			MethodName: "QueryCountdownById",
			Handler:    _CountdownService_QueryCountdownById_Handler,
		},
		{
			MethodName: "QueryPagedExpringCountdownsByType",
			Handler:    _CountdownService_QueryPagedExpringCountdownsByType_Handler,
		},
		{
			MethodName: "QueryPagedCountdownsByType",
			Handler:    _CountdownService_QueryPagedCountdownsByType_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "countdown/countdown.proto",
}
