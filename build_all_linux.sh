#!/bin/sh

mkdir -p protocol/protobuf/go
mkdir -p protocol/protobuf/java/src/main/java
mkdir -p protocol/protobuf/csharp

cd protobuf
protoc --go_out=../protocol/protobuf/go/. \
 --go_opt=paths=source_relative \
 --go-grpc_out=../protocol/protobuf/go/. \
 --go-grpc_opt=paths=source_relative \
 --plugin=protoc-gen-grpc-java \
 --java_out=../protocol/protobuf/java/src/main/java/. \
 --grpc-java_out=../protocol/protobuf/java/src/main/java/. \
 --csharp_out=../protocol/protobuf/csharp/ \
 $(find . -iname "*.proto")

protoc \
 --plugin=protoc-gen-grpc-csharp \
 --csharp_out=../protocol/protobuf/csharp/ \
 --grpc-csharp_out=../protocol/protobuf/csharp/ \
 $(find . -iname "*.proto")
