package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCmacKeyFormat extends GeneratedMessageLite<AesCmacKeyFormat, Builder> implements AesCmacKeyFormatOrBuilder {
    private static final AesCmacKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<AesCmacKeyFormat> PARSER;
    private int keySize_;
    private AesCmacParams params_;

    public static final class Builder extends GeneratedMessageLite.Builder<AesCmacKeyFormat, Builder> implements AesCmacKeyFormatOrBuilder {
        public Builder() {
            super(AesCmacKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder clear() {
            return super.clear();
        }

        public Builder clearKeySize() {
            copyOnWrite();
            AesCmacKeyFormat.r((AesCmacKeyFormat) this.instance);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            AesCmacKeyFormat.u((AesCmacKeyFormat) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.AesCmacKeyFormatOrBuilder
        public int getKeySize() {
            return ((AesCmacKeyFormat) this.instance).getKeySize();
        }

        @Override // com.google.crypto.tink.proto.AesCmacKeyFormatOrBuilder
        public AesCmacParams getParams() {
            return ((AesCmacKeyFormat) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.AesCmacKeyFormatOrBuilder
        public boolean hasParams() {
            return ((AesCmacKeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeParams(AesCmacParams aesCmacParams) {
            copyOnWrite();
            AesCmacKeyFormat.t((AesCmacKeyFormat) this.instance, aesCmacParams);
            return this;
        }

        public Builder setKeySize(int i10) {
            copyOnWrite();
            AesCmacKeyFormat.q((AesCmacKeyFormat) this.instance, i10);
            return this;
        }

        public Builder setParams(AesCmacParams aesCmacParams) {
            copyOnWrite();
            AesCmacKeyFormat.s((AesCmacKeyFormat) this.instance, aesCmacParams);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ MessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo5285clone() throws CloneNotSupportedException {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i10, i11, extensionRegistryLite);
        }

        public Builder setParams(AesCmacParams.Builder builder) {
            copyOnWrite();
            AesCmacKeyFormat.s((AesCmacKeyFormat) this.instance, builder.build());
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return super.mergeFrom(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return super.mergeFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream) throws IOException {
            return super.mergeFrom(codedInputStream);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(MessageLite messageLite) {
            return super.mergeFrom(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(InputStream inputStream) throws IOException {
            return super.mergeFrom(inputStream);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return super.mergeFrom(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return super.mergeFrom(bArr, i10, i11, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return super.mergeFrom(bArr, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46854a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46854a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46854a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46854a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46854a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46854a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46854a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46854a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AesCmacKeyFormat aesCmacKeyFormat = new AesCmacKeyFormat();
        DEFAULT_INSTANCE = aesCmacKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesCmacKeyFormat.class, aesCmacKeyFormat);
    }

    public static AesCmacKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCmacKeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCmacKeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesCmacKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(AesCmacKeyFormat aesCmacKeyFormat, int i10) {
        aesCmacKeyFormat.keySize_ = i10;
    }

    public static void r(AesCmacKeyFormat aesCmacKeyFormat) {
        aesCmacKeyFormat.keySize_ = 0;
    }

    public static void s(AesCmacKeyFormat aesCmacKeyFormat, AesCmacParams aesCmacParams) {
        aesCmacKeyFormat.getClass();
        aesCmacParams.getClass();
        aesCmacKeyFormat.params_ = aesCmacParams;
    }

    public static void t(AesCmacKeyFormat aesCmacKeyFormat, AesCmacParams aesCmacParams) {
        aesCmacKeyFormat.getClass();
        aesCmacParams.getClass();
        AesCmacParams aesCmacParams2 = aesCmacKeyFormat.params_;
        if (aesCmacParams2 == null || aesCmacParams2 == AesCmacParams.getDefaultInstance()) {
            aesCmacKeyFormat.params_ = aesCmacParams;
        } else {
            aesCmacKeyFormat.params_ = AesCmacParams.newBuilder(aesCmacKeyFormat.params_).mergeFrom(aesCmacParams).buildPartial();
        }
    }

    public static void u(AesCmacKeyFormat aesCmacKeyFormat) {
        aesCmacKeyFormat.params_ = null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46854a[methodToInvoke.ordinal()]) {
            case 1:
                return new AesCmacKeyFormat();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCmacKeyFormat> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AesCmacKeyFormat.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.AesCmacKeyFormatOrBuilder
    public int getKeySize() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.proto.AesCmacKeyFormatOrBuilder
    public AesCmacParams getParams() {
        AesCmacParams aesCmacParams = this.params_;
        return aesCmacParams == null ? AesCmacParams.getDefaultInstance() : aesCmacParams;
    }

    @Override // com.google.crypto.tink.proto.AesCmacKeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(AesCmacKeyFormat aesCmacKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(aesCmacKeyFormat);
    }

    public static AesCmacKeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCmacKeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesCmacKeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesCmacKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesCmacKeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCmacKeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesCmacKeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCmacKeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCmacKeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesCmacKeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCmacKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
