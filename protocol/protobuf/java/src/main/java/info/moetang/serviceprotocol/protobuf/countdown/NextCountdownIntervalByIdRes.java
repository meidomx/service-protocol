// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: countdown/countdown.proto

package info.moetang.serviceprotocol.protobuf.countdown;

/**
 * Protobuf type {@code countdown.NextCountdownIntervalByIdRes}
 */
public final class NextCountdownIntervalByIdRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:countdown.NextCountdownIntervalByIdRes)
    NextCountdownIntervalByIdResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NextCountdownIntervalByIdRes.newBuilder() to construct.
  private NextCountdownIntervalByIdRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NextCountdownIntervalByIdRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NextCountdownIntervalByIdRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NextCountdownIntervalByIdRes(
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
            info.moetang.serviceprotocol.protobuf.countdown.Countdown.Builder subBuilder = null;
            if (countdown_ != null) {
              subBuilder = countdown_.toBuilder();
            }
            countdown_ = input.readMessage(info.moetang.serviceprotocol.protobuf.countdown.Countdown.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(countdown_);
              countdown_ = subBuilder.buildPartial();
            }

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
    return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_NextCountdownIntervalByIdRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_NextCountdownIntervalByIdRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.class, info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.Builder.class);
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

  public static final int COUNTDOWN_FIELD_NUMBER = 2;
  private info.moetang.serviceprotocol.protobuf.countdown.Countdown countdown_;
  /**
   * <code>.countdown.Countdown countdown = 2;</code>
   * @return Whether the countdown field is set.
   */
  @java.lang.Override
  public boolean hasCountdown() {
    return countdown_ != null;
  }
  /**
   * <code>.countdown.Countdown countdown = 2;</code>
   * @return The countdown.
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.countdown.Countdown getCountdown() {
    return countdown_ == null ? info.moetang.serviceprotocol.protobuf.countdown.Countdown.getDefaultInstance() : countdown_;
  }
  /**
   * <code>.countdown.Countdown countdown = 2;</code>
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.countdown.CountdownOrBuilder getCountdownOrBuilder() {
    return getCountdown();
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
    if (countdown_ != null) {
      output.writeMessage(2, getCountdown());
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
    if (countdown_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCountdown());
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
    if (!(obj instanceof info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes)) {
      return super.equals(obj);
    }
    info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes other = (info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (hasCountdown() != other.hasCountdown()) return false;
    if (hasCountdown()) {
      if (!getCountdown()
          .equals(other.getCountdown())) return false;
    }
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
    if (hasCountdown()) {
      hash = (37 * hash) + COUNTDOWN_FIELD_NUMBER;
      hash = (53 * hash) + getCountdown().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parseFrom(
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
  public static Builder newBuilder(info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes prototype) {
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
   * Protobuf type {@code countdown.NextCountdownIntervalByIdRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:countdown.NextCountdownIntervalByIdRes)
      info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_NextCountdownIntervalByIdRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_NextCountdownIntervalByIdRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.class, info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.Builder.class);
    }

    // Construct using info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.newBuilder()
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
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      if (countdownBuilder_ == null) {
        countdown_ = null;
      } else {
        countdown_ = null;
        countdownBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.moetang.serviceprotocol.protobuf.countdown.CountdownProto.internal_static_countdown_NextCountdownIntervalByIdRes_descriptor;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes getDefaultInstanceForType() {
      return info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.getDefaultInstance();
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes build() {
      info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes buildPartial() {
      info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes result = new info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (countdownBuilder_ == null) {
        result.countdown_ = countdown_;
      } else {
        result.countdown_ = countdownBuilder_.build();
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
      if (other instanceof info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes) {
        return mergeFrom((info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes other) {
      if (other == info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.hasCountdown()) {
        mergeCountdown(other.getCountdown());
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
      info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private info.moetang.serviceprotocol.protobuf.countdown.Countdown countdown_;
    private com.google.protobuf.SingleFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.countdown.Countdown, info.moetang.serviceprotocol.protobuf.countdown.Countdown.Builder, info.moetang.serviceprotocol.protobuf.countdown.CountdownOrBuilder> countdownBuilder_;
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     * @return Whether the countdown field is set.
     */
    public boolean hasCountdown() {
      return countdownBuilder_ != null || countdown_ != null;
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     * @return The countdown.
     */
    public info.moetang.serviceprotocol.protobuf.countdown.Countdown getCountdown() {
      if (countdownBuilder_ == null) {
        return countdown_ == null ? info.moetang.serviceprotocol.protobuf.countdown.Countdown.getDefaultInstance() : countdown_;
      } else {
        return countdownBuilder_.getMessage();
      }
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     */
    public Builder setCountdown(info.moetang.serviceprotocol.protobuf.countdown.Countdown value) {
      if (countdownBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        countdown_ = value;
        onChanged();
      } else {
        countdownBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     */
    public Builder setCountdown(
        info.moetang.serviceprotocol.protobuf.countdown.Countdown.Builder builderForValue) {
      if (countdownBuilder_ == null) {
        countdown_ = builderForValue.build();
        onChanged();
      } else {
        countdownBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     */
    public Builder mergeCountdown(info.moetang.serviceprotocol.protobuf.countdown.Countdown value) {
      if (countdownBuilder_ == null) {
        if (countdown_ != null) {
          countdown_ =
            info.moetang.serviceprotocol.protobuf.countdown.Countdown.newBuilder(countdown_).mergeFrom(value).buildPartial();
        } else {
          countdown_ = value;
        }
        onChanged();
      } else {
        countdownBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     */
    public Builder clearCountdown() {
      if (countdownBuilder_ == null) {
        countdown_ = null;
        onChanged();
      } else {
        countdown_ = null;
        countdownBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.countdown.Countdown.Builder getCountdownBuilder() {
      
      onChanged();
      return getCountdownFieldBuilder().getBuilder();
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.countdown.CountdownOrBuilder getCountdownOrBuilder() {
      if (countdownBuilder_ != null) {
        return countdownBuilder_.getMessageOrBuilder();
      } else {
        return countdown_ == null ?
            info.moetang.serviceprotocol.protobuf.countdown.Countdown.getDefaultInstance() : countdown_;
      }
    }
    /**
     * <code>.countdown.Countdown countdown = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.countdown.Countdown, info.moetang.serviceprotocol.protobuf.countdown.Countdown.Builder, info.moetang.serviceprotocol.protobuf.countdown.CountdownOrBuilder> 
        getCountdownFieldBuilder() {
      if (countdownBuilder_ == null) {
        countdownBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            info.moetang.serviceprotocol.protobuf.countdown.Countdown, info.moetang.serviceprotocol.protobuf.countdown.Countdown.Builder, info.moetang.serviceprotocol.protobuf.countdown.CountdownOrBuilder>(
                getCountdown(),
                getParentForChildren(),
                isClean());
        countdown_ = null;
      }
      return countdownBuilder_;
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


    // @@protoc_insertion_point(builder_scope:countdown.NextCountdownIntervalByIdRes)
  }

  // @@protoc_insertion_point(class_scope:countdown.NextCountdownIntervalByIdRes)
  private static final info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes();
  }

  public static info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NextCountdownIntervalByIdRes>
      PARSER = new com.google.protobuf.AbstractParser<NextCountdownIntervalByIdRes>() {
    @java.lang.Override
    public NextCountdownIntervalByIdRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NextCountdownIntervalByIdRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NextCountdownIntervalByIdRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NextCountdownIntervalByIdRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.countdown.NextCountdownIntervalByIdRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

