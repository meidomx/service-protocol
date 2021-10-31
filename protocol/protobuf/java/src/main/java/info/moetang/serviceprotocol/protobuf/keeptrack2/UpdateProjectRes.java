// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keeptrack2/keeptrack2.proto

package info.moetang.serviceprotocol.protobuf.keeptrack2;

/**
 * Protobuf type {@code keeptrack2.UpdateProjectRes}
 */
public final class UpdateProjectRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:keeptrack2.UpdateProjectRes)
    UpdateProjectResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateProjectRes.newBuilder() to construct.
  private UpdateProjectRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateProjectRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateProjectRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateProjectRes(
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
            info.moetang.serviceprotocol.protobuf.keeptrack2.Project.Builder subBuilder = null;
            if (project_ != null) {
              subBuilder = project_.toBuilder();
            }
            project_ = input.readMessage(info.moetang.serviceprotocol.protobuf.keeptrack2.Project.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(project_);
              project_ = subBuilder.buildPartial();
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
    return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_UpdateProjectRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_UpdateProjectRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.class, info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.Builder.class);
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

  public static final int PROJECT_FIELD_NUMBER = 2;
  private info.moetang.serviceprotocol.protobuf.keeptrack2.Project project_;
  /**
   * <code>.keeptrack2.Project project = 2;</code>
   * @return Whether the project field is set.
   */
  @java.lang.Override
  public boolean hasProject() {
    return project_ != null;
  }
  /**
   * <code>.keeptrack2.Project project = 2;</code>
   * @return The project.
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.keeptrack2.Project getProject() {
    return project_ == null ? info.moetang.serviceprotocol.protobuf.keeptrack2.Project.getDefaultInstance() : project_;
  }
  /**
   * <code>.keeptrack2.Project project = 2;</code>
   */
  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.keeptrack2.ProjectOrBuilder getProjectOrBuilder() {
    return getProject();
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
    if (project_ != null) {
      output.writeMessage(2, getProject());
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
    if (project_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProject());
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
    if (!(obj instanceof info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes)) {
      return super.equals(obj);
    }
    info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes other = (info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (hasProject() != other.hasProject()) return false;
    if (hasProject()) {
      if (!getProject()
          .equals(other.getProject())) return false;
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
    if (hasProject()) {
      hash = (37 * hash) + PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getProject().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parseFrom(
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
  public static Builder newBuilder(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes prototype) {
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
   * Protobuf type {@code keeptrack2.UpdateProjectRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:keeptrack2.UpdateProjectRes)
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_UpdateProjectRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_UpdateProjectRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.class, info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.Builder.class);
    }

    // Construct using info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.newBuilder()
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
      if (projectBuilder_ == null) {
        project_ = null;
      } else {
        project_ = null;
        projectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.Keeptrack2Proto.internal_static_keeptrack2_UpdateProjectRes_descriptor;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes getDefaultInstanceForType() {
      return info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.getDefaultInstance();
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes build() {
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes buildPartial() {
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes result = new info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (projectBuilder_ == null) {
        result.project_ = project_;
      } else {
        result.project_ = projectBuilder_.build();
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
      if (other instanceof info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes) {
        return mergeFrom((info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes other) {
      if (other == info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.hasProject()) {
        mergeProject(other.getProject());
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
      info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes) e.getUnfinishedMessage();
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

    private info.moetang.serviceprotocol.protobuf.keeptrack2.Project project_;
    private com.google.protobuf.SingleFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.keeptrack2.Project, info.moetang.serviceprotocol.protobuf.keeptrack2.Project.Builder, info.moetang.serviceprotocol.protobuf.keeptrack2.ProjectOrBuilder> projectBuilder_;
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     * @return Whether the project field is set.
     */
    public boolean hasProject() {
      return projectBuilder_ != null || project_ != null;
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     * @return The project.
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.Project getProject() {
      if (projectBuilder_ == null) {
        return project_ == null ? info.moetang.serviceprotocol.protobuf.keeptrack2.Project.getDefaultInstance() : project_;
      } else {
        return projectBuilder_.getMessage();
      }
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     */
    public Builder setProject(info.moetang.serviceprotocol.protobuf.keeptrack2.Project value) {
      if (projectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        project_ = value;
        onChanged();
      } else {
        projectBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     */
    public Builder setProject(
        info.moetang.serviceprotocol.protobuf.keeptrack2.Project.Builder builderForValue) {
      if (projectBuilder_ == null) {
        project_ = builderForValue.build();
        onChanged();
      } else {
        projectBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     */
    public Builder mergeProject(info.moetang.serviceprotocol.protobuf.keeptrack2.Project value) {
      if (projectBuilder_ == null) {
        if (project_ != null) {
          project_ =
            info.moetang.serviceprotocol.protobuf.keeptrack2.Project.newBuilder(project_).mergeFrom(value).buildPartial();
        } else {
          project_ = value;
        }
        onChanged();
      } else {
        projectBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     */
    public Builder clearProject() {
      if (projectBuilder_ == null) {
        project_ = null;
        onChanged();
      } else {
        project_ = null;
        projectBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.Project.Builder getProjectBuilder() {
      
      onChanged();
      return getProjectFieldBuilder().getBuilder();
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     */
    public info.moetang.serviceprotocol.protobuf.keeptrack2.ProjectOrBuilder getProjectOrBuilder() {
      if (projectBuilder_ != null) {
        return projectBuilder_.getMessageOrBuilder();
      } else {
        return project_ == null ?
            info.moetang.serviceprotocol.protobuf.keeptrack2.Project.getDefaultInstance() : project_;
      }
    }
    /**
     * <code>.keeptrack2.Project project = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        info.moetang.serviceprotocol.protobuf.keeptrack2.Project, info.moetang.serviceprotocol.protobuf.keeptrack2.Project.Builder, info.moetang.serviceprotocol.protobuf.keeptrack2.ProjectOrBuilder> 
        getProjectFieldBuilder() {
      if (projectBuilder_ == null) {
        projectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            info.moetang.serviceprotocol.protobuf.keeptrack2.Project, info.moetang.serviceprotocol.protobuf.keeptrack2.Project.Builder, info.moetang.serviceprotocol.protobuf.keeptrack2.ProjectOrBuilder>(
                getProject(),
                getParentForChildren(),
                isClean());
        project_ = null;
      }
      return projectBuilder_;
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


    // @@protoc_insertion_point(builder_scope:keeptrack2.UpdateProjectRes)
  }

  // @@protoc_insertion_point(class_scope:keeptrack2.UpdateProjectRes)
  private static final info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes();
  }

  public static info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProjectRes>
      PARSER = new com.google.protobuf.AbstractParser<UpdateProjectRes>() {
    @java.lang.Override
    public UpdateProjectRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateProjectRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateProjectRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProjectRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.moetang.serviceprotocol.protobuf.keeptrack2.UpdateProjectRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

