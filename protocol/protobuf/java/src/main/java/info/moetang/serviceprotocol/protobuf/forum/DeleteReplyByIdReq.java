// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

/**
 * Protobuf type {@code forum.DeleteReplyByIdReq}
 */
public final class DeleteReplyByIdReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:forum.DeleteReplyByIdReq)
    DeleteReplyByIdReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteReplyByIdReq.newBuilder() to construct.
  private DeleteReplyByIdReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteReplyByIdReq() {
    replyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteReplyByIdReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteReplyByIdReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            replyId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_DeleteReplyByIdReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_DeleteReplyByIdReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.class, info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.Builder.class);
  }

  public static final int REPLY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object replyId_;
  /**
   * <code>string reply_id = 1;</code>
   * @return The replyId.
   */
  @java.lang.Override
  public java.lang.String getReplyId() {
    java.lang.Object ref = replyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      replyId_ = s;
      return s;
    }
  }
  /**
   * <code>string reply_id = 1;</code>
   * @return The bytes for replyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReplyIdBytes() {
    java.lang.Object ref = replyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      replyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(replyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, replyId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(replyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, replyId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq)) {
      return super.equals(obj);
    }
    info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq other = (info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq) obj;

    if (!getReplyId()
        .equals(other.getReplyId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPLY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReplyId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code forum.DeleteReplyByIdReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:forum.DeleteReplyByIdReq)
      info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_DeleteReplyByIdReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_DeleteReplyByIdReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.class, info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.Builder.class);
    }

    // Construct using info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      replyId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_DeleteReplyByIdReq_descriptor;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq getDefaultInstanceForType() {
      return info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.getDefaultInstance();
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq build() {
      info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq buildPartial() {
      info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq result = new info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq(this);
      result.replyId_ = replyId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq) {
        return mergeFrom((info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq other) {
      if (other == info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq.getDefaultInstance()) return this;
      if (!other.getReplyId().isEmpty()) {
        replyId_ = other.replyId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object replyId_ = "";
    /**
     * <code>string reply_id = 1;</code>
     * @return The replyId.
     */
    public java.lang.String getReplyId() {
      java.lang.Object ref = replyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        replyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reply_id = 1;</code>
     * @return The bytes for replyId.
     */
    public com.google.protobuf.ByteString
        getReplyIdBytes() {
      java.lang.Object ref = replyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        replyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reply_id = 1;</code>
     * @param value The replyId to set.
     * @return This builder for chaining.
     */
    public Builder setReplyId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      replyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reply_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReplyId() {
      
      replyId_ = getDefaultInstance().getReplyId();
      onChanged();
      return this;
    }
    /**
     * <code>string reply_id = 1;</code>
     * @param value The bytes for replyId to set.
     * @return This builder for chaining.
     */
    public Builder setReplyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      replyId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:forum.DeleteReplyByIdReq)
  }

  // @@protoc_insertion_point(class_scope:forum.DeleteReplyByIdReq)
  private static final info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq();
  }

  public static info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteReplyByIdReq>
      PARSER = new com.google.protobuf.AbstractParser<DeleteReplyByIdReq>() {
    @java.lang.Override
    public DeleteReplyByIdReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteReplyByIdReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteReplyByIdReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteReplyByIdReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.forum.DeleteReplyByIdReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

