// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forum/forum.proto

package info.moetang.serviceprotocol.protobuf.forum;

/**
 * Protobuf type {@code forum.Forum}
 */
public final class Forum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:forum.Forum)
    ForumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Forum.newBuilder() to construct.
  private Forum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Forum() {
    forumId_ = "";
    userId_ = "";
    forumName_ = "";
    forumDescription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Forum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Forum(
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

            forumId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 90: {
            java.lang.String s = input.readStringRequireUtf8();

            forumName_ = s;
            break;
          }
          case 98: {
            java.lang.String s = input.readStringRequireUtf8();

            forumDescription_ = s;
            break;
          }
          case 168: {

            timeCreated_ = input.readInt64();
            break;
          }
          case 176: {

            timeUpdated_ = input.readInt64();
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
    return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_Forum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_Forum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.moetang.serviceprotocol.protobuf.forum.Forum.class, info.moetang.serviceprotocol.protobuf.forum.Forum.Builder.class);
  }

  public static final int FORUM_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object forumId_;
  /**
   * <code>string forum_id = 1;</code>
   * @return The forumId.
   */
  @java.lang.Override
  public java.lang.String getForumId() {
    java.lang.Object ref = forumId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      forumId_ = s;
      return s;
    }
  }
  /**
   * <code>string forum_id = 1;</code>
   * @return The bytes for forumId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getForumIdBytes() {
    java.lang.Object ref = forumId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      forumId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 2;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 2;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORUM_NAME_FIELD_NUMBER = 11;
  private volatile java.lang.Object forumName_;
  /**
   * <code>string forum_name = 11;</code>
   * @return The forumName.
   */
  @java.lang.Override
  public java.lang.String getForumName() {
    java.lang.Object ref = forumName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      forumName_ = s;
      return s;
    }
  }
  /**
   * <code>string forum_name = 11;</code>
   * @return The bytes for forumName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getForumNameBytes() {
    java.lang.Object ref = forumName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      forumName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORUM_DESCRIPTION_FIELD_NUMBER = 12;
  private volatile java.lang.Object forumDescription_;
  /**
   * <code>string forum_description = 12;</code>
   * @return The forumDescription.
   */
  @java.lang.Override
  public java.lang.String getForumDescription() {
    java.lang.Object ref = forumDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      forumDescription_ = s;
      return s;
    }
  }
  /**
   * <code>string forum_description = 12;</code>
   * @return The bytes for forumDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getForumDescriptionBytes() {
    java.lang.Object ref = forumDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      forumDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_CREATED_FIELD_NUMBER = 21;
  private long timeCreated_;
  /**
   * <code>int64 time_created = 21;</code>
   * @return The timeCreated.
   */
  @java.lang.Override
  public long getTimeCreated() {
    return timeCreated_;
  }

  public static final int TIME_UPDATED_FIELD_NUMBER = 22;
  private long timeUpdated_;
  /**
   * <code>int64 time_updated = 22;</code>
   * @return The timeUpdated.
   */
  @java.lang.Override
  public long getTimeUpdated() {
    return timeUpdated_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forumId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, forumId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forumName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, forumName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forumDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, forumDescription_);
    }
    if (timeCreated_ != 0L) {
      output.writeInt64(21, timeCreated_);
    }
    if (timeUpdated_ != 0L) {
      output.writeInt64(22, timeUpdated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forumId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, forumId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forumName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, forumName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(forumDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, forumDescription_);
    }
    if (timeCreated_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(21, timeCreated_);
    }
    if (timeUpdated_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(22, timeUpdated_);
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
    if (!(obj instanceof info.moetang.serviceprotocol.protobuf.forum.Forum)) {
      return super.equals(obj);
    }
    info.moetang.serviceprotocol.protobuf.forum.Forum other = (info.moetang.serviceprotocol.protobuf.forum.Forum) obj;

    if (!getForumId()
        .equals(other.getForumId())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getForumName()
        .equals(other.getForumName())) return false;
    if (!getForumDescription()
        .equals(other.getForumDescription())) return false;
    if (getTimeCreated()
        != other.getTimeCreated()) return false;
    if (getTimeUpdated()
        != other.getTimeUpdated()) return false;
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
    hash = (37 * hash) + FORUM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getForumId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + FORUM_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getForumName().hashCode();
    hash = (37 * hash) + FORUM_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getForumDescription().hashCode();
    hash = (37 * hash) + TIME_CREATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeCreated());
    hash = (37 * hash) + TIME_UPDATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeUpdated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.forum.Forum parseFrom(
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
  public static Builder newBuilder(info.moetang.serviceprotocol.protobuf.forum.Forum prototype) {
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
   * Protobuf type {@code forum.Forum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:forum.Forum)
      info.moetang.serviceprotocol.protobuf.forum.ForumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_Forum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_Forum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.moetang.serviceprotocol.protobuf.forum.Forum.class, info.moetang.serviceprotocol.protobuf.forum.Forum.Builder.class);
    }

    // Construct using info.moetang.serviceprotocol.protobuf.forum.Forum.newBuilder()
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
      forumId_ = "";

      userId_ = "";

      forumName_ = "";

      forumDescription_ = "";

      timeCreated_ = 0L;

      timeUpdated_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.moetang.serviceprotocol.protobuf.forum.ForumProto.internal_static_forum_Forum_descriptor;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.Forum getDefaultInstanceForType() {
      return info.moetang.serviceprotocol.protobuf.forum.Forum.getDefaultInstance();
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.Forum build() {
      info.moetang.serviceprotocol.protobuf.forum.Forum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.forum.Forum buildPartial() {
      info.moetang.serviceprotocol.protobuf.forum.Forum result = new info.moetang.serviceprotocol.protobuf.forum.Forum(this);
      result.forumId_ = forumId_;
      result.userId_ = userId_;
      result.forumName_ = forumName_;
      result.forumDescription_ = forumDescription_;
      result.timeCreated_ = timeCreated_;
      result.timeUpdated_ = timeUpdated_;
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
      if (other instanceof info.moetang.serviceprotocol.protobuf.forum.Forum) {
        return mergeFrom((info.moetang.serviceprotocol.protobuf.forum.Forum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.moetang.serviceprotocol.protobuf.forum.Forum other) {
      if (other == info.moetang.serviceprotocol.protobuf.forum.Forum.getDefaultInstance()) return this;
      if (!other.getForumId().isEmpty()) {
        forumId_ = other.forumId_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getForumName().isEmpty()) {
        forumName_ = other.forumName_;
        onChanged();
      }
      if (!other.getForumDescription().isEmpty()) {
        forumDescription_ = other.forumDescription_;
        onChanged();
      }
      if (other.getTimeCreated() != 0L) {
        setTimeCreated(other.getTimeCreated());
      }
      if (other.getTimeUpdated() != 0L) {
        setTimeUpdated(other.getTimeUpdated());
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
      info.moetang.serviceprotocol.protobuf.forum.Forum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.moetang.serviceprotocol.protobuf.forum.Forum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object forumId_ = "";
    /**
     * <code>string forum_id = 1;</code>
     * @return The forumId.
     */
    public java.lang.String getForumId() {
      java.lang.Object ref = forumId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        forumId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string forum_id = 1;</code>
     * @return The bytes for forumId.
     */
    public com.google.protobuf.ByteString
        getForumIdBytes() {
      java.lang.Object ref = forumId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        forumId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string forum_id = 1;</code>
     * @param value The forumId to set.
     * @return This builder for chaining.
     */
    public Builder setForumId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      forumId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string forum_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearForumId() {
      
      forumId_ = getDefaultInstance().getForumId();
      onChanged();
      return this;
    }
    /**
     * <code>string forum_id = 1;</code>
     * @param value The bytes for forumId to set.
     * @return This builder for chaining.
     */
    public Builder setForumIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      forumId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 2;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 2;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 2;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object forumName_ = "";
    /**
     * <code>string forum_name = 11;</code>
     * @return The forumName.
     */
    public java.lang.String getForumName() {
      java.lang.Object ref = forumName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        forumName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string forum_name = 11;</code>
     * @return The bytes for forumName.
     */
    public com.google.protobuf.ByteString
        getForumNameBytes() {
      java.lang.Object ref = forumName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        forumName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string forum_name = 11;</code>
     * @param value The forumName to set.
     * @return This builder for chaining.
     */
    public Builder setForumName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      forumName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string forum_name = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearForumName() {
      
      forumName_ = getDefaultInstance().getForumName();
      onChanged();
      return this;
    }
    /**
     * <code>string forum_name = 11;</code>
     * @param value The bytes for forumName to set.
     * @return This builder for chaining.
     */
    public Builder setForumNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      forumName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object forumDescription_ = "";
    /**
     * <code>string forum_description = 12;</code>
     * @return The forumDescription.
     */
    public java.lang.String getForumDescription() {
      java.lang.Object ref = forumDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        forumDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string forum_description = 12;</code>
     * @return The bytes for forumDescription.
     */
    public com.google.protobuf.ByteString
        getForumDescriptionBytes() {
      java.lang.Object ref = forumDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        forumDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string forum_description = 12;</code>
     * @param value The forumDescription to set.
     * @return This builder for chaining.
     */
    public Builder setForumDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      forumDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string forum_description = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearForumDescription() {
      
      forumDescription_ = getDefaultInstance().getForumDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string forum_description = 12;</code>
     * @param value The bytes for forumDescription to set.
     * @return This builder for chaining.
     */
    public Builder setForumDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      forumDescription_ = value;
      onChanged();
      return this;
    }

    private long timeCreated_ ;
    /**
     * <code>int64 time_created = 21;</code>
     * @return The timeCreated.
     */
    @java.lang.Override
    public long getTimeCreated() {
      return timeCreated_;
    }
    /**
     * <code>int64 time_created = 21;</code>
     * @param value The timeCreated to set.
     * @return This builder for chaining.
     */
    public Builder setTimeCreated(long value) {
      
      timeCreated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time_created = 21;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeCreated() {
      
      timeCreated_ = 0L;
      onChanged();
      return this;
    }

    private long timeUpdated_ ;
    /**
     * <code>int64 time_updated = 22;</code>
     * @return The timeUpdated.
     */
    @java.lang.Override
    public long getTimeUpdated() {
      return timeUpdated_;
    }
    /**
     * <code>int64 time_updated = 22;</code>
     * @param value The timeUpdated to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUpdated(long value) {
      
      timeUpdated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time_updated = 22;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeUpdated() {
      
      timeUpdated_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:forum.Forum)
  }

  // @@protoc_insertion_point(class_scope:forum.Forum)
  private static final info.moetang.serviceprotocol.protobuf.forum.Forum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.moetang.serviceprotocol.protobuf.forum.Forum();
  }

  public static info.moetang.serviceprotocol.protobuf.forum.Forum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Forum>
      PARSER = new com.google.protobuf.AbstractParser<Forum>() {
    @java.lang.Override
    public Forum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Forum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Forum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Forum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.forum.Forum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

