// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keeptrack2/keeptrack2.proto

package info.moetang.serviceprotocol.protobuf.keeptrack2;

/**
 * Protobuf type {@code keeptrack2.DeletePartReq}
 */
public final class DeletePartReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:keeptrack2.DeletePartReq)
    DeletePartReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeletePartReq.newBuilder() to construct.
  private DeletePartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeletePartReq() {
    partId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeletePartReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeletePartReq(
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

            partId_ = s;
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
    return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_DeletePartReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_DeletePartReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq.class, info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq.Builder.class);
  }

  public static final int PART_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object partId_;
  /**
   * <code>string part_id = 1;</code>
   * @return The partId.
   */
  @java.lang.Override
  public java.lang.String getPartId() {
    java.lang.Object ref = partId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partId_ = s;
      return s;
    }
  }
  /**
   * <code>string part_id = 1;</code>
   * @return The bytes for partId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPartIdBytes() {
    java.lang.Object ref = partId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partId_ = b;
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
    if (!getPartIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, partId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPartIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, partId_);
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
    if (!(obj instanceof info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq)) {
      return super.equals(obj);
    }
    info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq other = (info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq) obj;

    if (!getPartId()
        .equals(other.getPartId())) return false;
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
    hash = (37 * hash) + PART_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPartId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parseFrom(
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
  public static Builder newBuilder(info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq prototype) {
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
   * Protobuf type {@code keeptrack2.DeletePartReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:keeptrack2.DeletePartReq)
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_DeletePartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_DeletePartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq.class, info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq.Builder.class);
    }

    // Construct using info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq.newBuilder()
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
      partId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_DeletePartReq_descriptor;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq getDefaultInstanceForType() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq.getDefaultInstance();
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq build() {
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq buildPartial() {
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq result = new info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq(this);
      result.partId_ = partId_;
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
      if (other instanceof info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq) {
        return mergeFrom((info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq other) {
      if (other == info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq.getDefaultInstance()) return this;
      if (!other.getPartId().isEmpty()) {
        partId_ = other.partId_;
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
      info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object partId_ = "";
    /**
     * <code>string part_id = 1;</code>
     * @return The partId.
     */
    public java.lang.String getPartId() {
      java.lang.Object ref = partId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string part_id = 1;</code>
     * @return The bytes for partId.
     */
    public com.google.protobuf.ByteString
        getPartIdBytes() {
      java.lang.Object ref = partId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string part_id = 1;</code>
     * @param value The partId to set.
     * @return This builder for chaining.
     */
    public Builder setPartId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      partId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string part_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartId() {
      
      partId_ = getDefaultInstance().getPartId();
      onChanged();
      return this;
    }
    /**
     * <code>string part_id = 1;</code>
     * @param value The bytes for partId to set.
     * @return This builder for chaining.
     */
    public Builder setPartIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      partId_ = value;
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


    // @@protoc_insertion_point(builder_scope:keeptrack2.DeletePartReq)
  }

  // @@protoc_insertion_point(class_scope:keeptrack2.DeletePartReq)
  private static final info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq();
  }

  public static info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeletePartReq>
      PARSER = new com.google.protobuf.AbstractParser<DeletePartReq>() {
    @java.lang.Override
    public DeletePartReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeletePartReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeletePartReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeletePartReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.keeptrack2.DeletePartReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

