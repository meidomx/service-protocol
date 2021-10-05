// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: countdown/countdown.proto

package info.moetang.serviceprotocol.protobuf.countdown;

/**
 * Protobuf type {@code countdown.QueryPagedExpringCountdownsByTypeReq}
 */
public final class QueryPagedExpringCountdownsByTypeReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:countdown.QueryPagedExpringCountdownsByTypeReq)
    QueryPagedExpringCountdownsByTypeReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPagedExpringCountdownsByTypeReq.newBuilder() to construct.
  private QueryPagedExpringCountdownsByTypeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPagedExpringCountdownsByTypeReq() {
    countdownType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPagedExpringCountdownsByTypeReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryPagedExpringCountdownsByTypeReq(
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

            countdownType_ = s;
            break;
          }
          case 16: {

            page_ = input.readInt64();
            break;
          }
          case 24: {

            pageSize_ = input.readInt64();
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
    return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.class, info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.Builder.class);
  }

  public static final int COUNTDOWN_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object countdownType_;
  /**
   * <code>string countdown_type = 1;</code>
   * @return The countdownType.
   */
  @java.lang.Override
  public java.lang.String getCountdownType() {
    java.lang.Object ref = countdownType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countdownType_ = s;
      return s;
    }
  }
  /**
   * <code>string countdown_type = 1;</code>
   * @return The bytes for countdownType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountdownTypeBytes() {
    java.lang.Object ref = countdownType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countdownType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_FIELD_NUMBER = 2;
  private long page_;
  /**
   * <code>int64 page = 2;</code>
   * @return The page.
   */
  @java.lang.Override
  public long getPage() {
    return page_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private long pageSize_;
  /**
   * <code>int64 page_size = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
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
    if (!getCountdownTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, countdownType_);
    }
    if (page_ != 0L) {
      output.writeInt64(2, page_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(3, pageSize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCountdownTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, countdownType_);
    }
    if (page_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, page_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, pageSize_);
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
    if (!(obj instanceof info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq)) {
      return super.equals(obj);
    }
    info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq other = (info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq) obj;

    if (!getCountdownType()
        .equals(other.getCountdownType())) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
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
    hash = (37 * hash) + COUNTDOWN_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCountdownType().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPage());
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parseFrom(
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
  public static Builder newBuilder(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq prototype) {
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
   * Protobuf type {@code countdown.QueryPagedExpringCountdownsByTypeReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:countdown.QueryPagedExpringCountdownsByTypeReq)
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.class, info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.Builder.class);
    }

    // Construct using info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.newBuilder()
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
      countdownType_ = "";

      page_ = 0L;

      pageSize_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_QueryPagedExpringCountdownsByTypeReq_descriptor;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq getDefaultInstanceForType() {
      return info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.getDefaultInstance();
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq build() {
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq buildPartial() {
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq result = new info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq(this);
      result.countdownType_ = countdownType_;
      result.page_ = page_;
      result.pageSize_ = pageSize_;
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
      if (other instanceof info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq) {
        return mergeFrom((info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq other) {
      if (other == info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq.getDefaultInstance()) return this;
      if (!other.getCountdownType().isEmpty()) {
        countdownType_ = other.countdownType_;
        onChanged();
      }
      if (other.getPage() != 0L) {
        setPage(other.getPage());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
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
      info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object countdownType_ = "";
    /**
     * <code>string countdown_type = 1;</code>
     * @return The countdownType.
     */
    public java.lang.String getCountdownType() {
      java.lang.Object ref = countdownType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countdownType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string countdown_type = 1;</code>
     * @return The bytes for countdownType.
     */
    public com.google.protobuf.ByteString
        getCountdownTypeBytes() {
      java.lang.Object ref = countdownType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countdownType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string countdown_type = 1;</code>
     * @param value The countdownType to set.
     * @return This builder for chaining.
     */
    public Builder setCountdownType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      countdownType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string countdown_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountdownType() {
      
      countdownType_ = getDefaultInstance().getCountdownType();
      onChanged();
      return this;
    }
    /**
     * <code>string countdown_type = 1;</code>
     * @param value The bytes for countdownType to set.
     * @return This builder for chaining.
     */
    public Builder setCountdownTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      countdownType_ = value;
      onChanged();
      return this;
    }

    private long page_ ;
    /**
     * <code>int64 page = 2;</code>
     * @return The page.
     */
    @java.lang.Override
    public long getPage() {
      return page_;
    }
    /**
     * <code>int64 page = 2;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(long value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <code>int64 page_size = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int64 page_size = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:countdown.QueryPagedExpringCountdownsByTypeReq)
  }

  // @@protoc_insertion_point(class_scope:countdown.QueryPagedExpringCountdownsByTypeReq)
  private static final info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq();
  }

  public static info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPagedExpringCountdownsByTypeReq>
      PARSER = new com.google.protobuf.AbstractParser<QueryPagedExpringCountdownsByTypeReq>() {
    @java.lang.Override
    public QueryPagedExpringCountdownsByTypeReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryPagedExpringCountdownsByTypeReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryPagedExpringCountdownsByTypeReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPagedExpringCountdownsByTypeReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.countdown.QueryPagedExpringCountdownsByTypeReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
