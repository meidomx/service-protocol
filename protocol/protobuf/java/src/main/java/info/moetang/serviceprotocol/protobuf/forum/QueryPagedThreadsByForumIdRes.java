// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

/**
 * Protobuf type {@code forum.QueryPagedThreadsByForumIdRes}
 */
public final class QueryPagedThreadsByForumIdRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:forum.QueryPagedThreadsByForumIdRes)
    QueryPagedThreadsByForumIdResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPagedThreadsByForumIdRes.newBuilder() to construct.
  private QueryPagedThreadsByForumIdRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPagedThreadsByForumIdRes() {
    threads_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPagedThreadsByForumIdRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryPagedThreadsByForumIdRes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            info.moetang.serviceprotocol.protobuf.shared.Result.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(info.moetang.serviceprotocol.protobuf.shared.Result.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              threads_ = new java.util.ArrayList<info.moetang.serviceprotocol.protobuf.forum.ThreadLite>();
              mutable_bitField0_ |= 0x00000001;
            }
            threads_.add(
                input.readMessage(info.moetang.serviceprotocol.protobuf.forum.ThreadLite.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        threads_ = java.util.Collections.unmodifiableList(threads_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_QueryPagedThreadsByForumIdRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_QueryPagedThreadsByForumIdRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.class, info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private info.moetang.serviceprotocol.protobuf.shared.Result result_;
  /**
   * <code>.shared.Result result = 1;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.shared.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.shared.Result getResult() {
    return result_ == null ? info.moetang.serviceprotocol.protobuf.shared.Result.getDefaultInstance() : result_;
  }
  /**
   * <code>.shared.Result result = 1;</code>
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.shared.ResultOrBuilder getResultOrBuilder() {
    return getResult();
  }

  public static final int THREADS_FIELD_NUMBER = 2;
  private java.util.List<info.moetang.serviceprotocol.protobuf.forum.ThreadLite> threads_;
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  @java.lang.Override
  public java.util.List<info.moetang.serviceprotocol.protobuf.forum.ThreadLite> getThreadsList() {
    return threads_;
  }
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder> 
      getThreadsOrBuilderList() {
    return threads_;
  }
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  @java.lang.Override
  public int getThreadsCount() {
    return threads_.size();
  }
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.forum.ThreadLite getThreads(int index) {
    return threads_.get(index);
  }
  /**
   * <code>repeated .forum.ThreadLite threads = 2;</code>
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder getThreadsOrBuilder(
      int index) {
    return threads_.get(index);
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
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    for (int i = 0; i < threads_.size(); i++) {
      output.writeMessage(2, threads_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
    }
    for (int i = 0; i < threads_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, threads_.get(i));
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
    if (!(obj instanceof info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes)) {
      return super.equals(obj);
    }
    info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes other = (info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (!getThreadsList()
        .equals(other.getThreadsList())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    if (getThreadsCount() > 0) {
      hash = (37 * hash) + THREADS_FIELD_NUMBER;
      hash = (53 * hash) + getThreadsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parseFrom(
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
  public static Builder newBuilder(info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes prototype) {
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
   * Protobuf type {@code forum.QueryPagedThreadsByForumIdRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:forum.QueryPagedThreadsByForumIdRes)
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_QueryPagedThreadsByForumIdRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_QueryPagedThreadsByForumIdRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.class, info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.Builder.class);
    }

    // Construct using info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.newBuilder()
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
        getThreadsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      if (threadsBuilder_ == null) {
        threads_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        threadsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_QueryPagedThreadsByForumIdRes_descriptor;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes getDefaultInstanceForType() {
      return info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.getDefaultInstance();
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes build() {
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes buildPartial() {
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes result = new info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes(this);
      int from_bitField0_ = bitField0_;
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (threadsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          threads_ = java.util.Collections.unmodifiableList(threads_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.threads_ = threads_;
      } else {
        result.threads_ = threadsBuilder_.build();
      }
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
      if (other instanceof info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes) {
        return mergeFrom((info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes other) {
      if (other == info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (threadsBuilder_ == null) {
        if (!other.threads_.isEmpty()) {
          if (threads_.isEmpty()) {
            threads_ = other.threads_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureThreadsIsMutable();
            threads_.addAll(other.threads_);
          }
          onChanged();
        }
      } else {
        if (!other.threads_.isEmpty()) {
          if (threadsBuilder_.isEmpty()) {
            threadsBuilder_.dispose();
            threadsBuilder_ = null;
            threads_ = other.threads_;
            bitField0_ = (bitField0_ & ~0x00000001);
            threadsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getThreadsFieldBuilder() : null;
          } else {
            threadsBuilder_.addAllMessages(other.threads_);
          }
        }
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
      info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private info.moetang.serviceprotocol.protobuf.shared.Result result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.shared.Result, info.moetang.serviceprotocol.protobuf.shared.Result.Builder, info.moetang.serviceprotocol.protobuf.shared.ResultOrBuilder> resultBuilder_;
    /**
     * <code>.shared.Result result = 1;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <code>.shared.Result result = 1;</code>
     * @return The result.
     */
    public info.moetang.serviceprotocol.protobuf.shared.Result getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? info.moetang.serviceprotocol.protobuf.shared.Result.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.shared.Result result = 1;</code>
     */
    public Builder setResult(info.moetang.serviceprotocol.protobuf.shared.Result value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.shared.Result result = 1;</code>
     */
    public Builder setResult(
        info.moetang.serviceprotocol.protobuf.shared.Result.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.shared.Result result = 1;</code>
     */
    public Builder mergeResult(info.moetang.serviceprotocol.protobuf.shared.Result value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            info.moetang.serviceprotocol.protobuf.shared.Result.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.shared.Result result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.shared.Result result = 1;</code>
     */
    public info.moetang.serviceprotocol.protobuf.shared.Result.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.shared.Result result = 1;</code>
     */
    public info.moetang.serviceprotocol.protobuf.shared.ResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            info.moetang.serviceprotocol.protobuf.shared.Result.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.shared.Result result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.shared.Result, info.moetang.serviceprotocol.protobuf.shared.Result.Builder, info.moetang.serviceprotocol.protobuf.shared.ResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            info.moetang.serviceprotocol.protobuf.shared.Result, info.moetang.serviceprotocol.protobuf.shared.Result.Builder, info.moetang.serviceprotocol.protobuf.shared.ResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private java.util.List<info.moetang.serviceprotocol.protobuf.forum.ThreadLite> threads_ =
      java.util.Collections.emptyList();
    private void ensureThreadsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        threads_ = new java.util.ArrayList<info.moetang.serviceprotocol.protobuf.forum.ThreadLite>(threads_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.forum.ThreadLite, info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder, info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder> threadsBuilder_;

    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public java.util.List<info.moetang.serviceprotocol.protobuf.forum.ThreadLite> getThreadsList() {
      if (threadsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(threads_);
      } else {
        return threadsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public int getThreadsCount() {
      if (threadsBuilder_ == null) {
        return threads_.size();
      } else {
        return threadsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.forum.ThreadLite getThreads(int index) {
      if (threadsBuilder_ == null) {
        return threads_.get(index);
      } else {
        return threadsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder setThreads(
        int index, info.moetang.serviceprotocol.protobuf.forum.ThreadLite value) {
      if (threadsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThreadsIsMutable();
        threads_.set(index, value);
        onChanged();
      } else {
        threadsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder setThreads(
        int index, info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder builderForValue) {
      if (threadsBuilder_ == null) {
        ensureThreadsIsMutable();
        threads_.set(index, builderForValue.build());
        onChanged();
      } else {
        threadsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder addThreads(info.moetang.serviceprotocol.protobuf.forum.ThreadLite value) {
      if (threadsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThreadsIsMutable();
        threads_.add(value);
        onChanged();
      } else {
        threadsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder addThreads(
        int index, info.moetang.serviceprotocol.protobuf.forum.ThreadLite value) {
      if (threadsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThreadsIsMutable();
        threads_.add(index, value);
        onChanged();
      } else {
        threadsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder addThreads(
        info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder builderForValue) {
      if (threadsBuilder_ == null) {
        ensureThreadsIsMutable();
        threads_.add(builderForValue.build());
        onChanged();
      } else {
        threadsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder addThreads(
        int index, info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder builderForValue) {
      if (threadsBuilder_ == null) {
        ensureThreadsIsMutable();
        threads_.add(index, builderForValue.build());
        onChanged();
      } else {
        threadsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder addAllThreads(
        java.lang.Iterable<? extends info.moetang.serviceprotocol.protobuf.forum.ThreadLite> values) {
      if (threadsBuilder_ == null) {
        ensureThreadsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, threads_);
        onChanged();
      } else {
        threadsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder clearThreads() {
      if (threadsBuilder_ == null) {
        threads_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        threadsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public Builder removeThreads(int index) {
      if (threadsBuilder_ == null) {
        ensureThreadsIsMutable();
        threads_.remove(index);
        onChanged();
      } else {
        threadsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder getThreadsBuilder(
        int index) {
      return getThreadsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder getThreadsOrBuilder(
        int index) {
      if (threadsBuilder_ == null) {
        return threads_.get(index);  } else {
        return threadsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public java.util.List<? extends info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder> 
         getThreadsOrBuilderList() {
      if (threadsBuilder_ != null) {
        return threadsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(threads_);
      }
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder addThreadsBuilder() {
      return getThreadsFieldBuilder().addBuilder(
          info.moetang.serviceprotocol.protobuf.forum.ThreadLite.getDefaultInstance());
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder addThreadsBuilder(
        int index) {
      return getThreadsFieldBuilder().addBuilder(
          index, info.moetang.serviceprotocol.protobuf.forum.ThreadLite.getDefaultInstance());
    }
    /**
     * <code>repeated .forum.ThreadLite threads = 2;</code>
     */
    public java.util.List<info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder> 
         getThreadsBuilderList() {
      return getThreadsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.forum.ThreadLite, info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder, info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder> 
        getThreadsFieldBuilder() {
      if (threadsBuilder_ == null) {
        threadsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            info.moetang.serviceprotocol.protobuf.forum.ThreadLite, info.moetang.serviceprotocol.protobuf.forum.ThreadLite.Builder, info.moetang.serviceprotocol.protobuf.forum.ThreadLiteOrBuilder>(
                threads_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        threads_ = null;
      }
      return threadsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:forum.QueryPagedThreadsByForumIdRes)
  }

  // @@protoc_insertion_point(class_scope:forum.QueryPagedThreadsByForumIdRes)
  private static final info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes();
  }

  public static info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPagedThreadsByForumIdRes>
      PARSER = new com.google.protobuf.AbstractParser<QueryPagedThreadsByForumIdRes>() {
    @java.lang.Override
    public QueryPagedThreadsByForumIdRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryPagedThreadsByForumIdRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryPagedThreadsByForumIdRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPagedThreadsByForumIdRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.forum.QueryPagedThreadsByForumIdRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

