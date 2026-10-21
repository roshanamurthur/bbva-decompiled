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
public final class AesGcmHkdfStreamingKey extends GeneratedMessageLite<AesGcmHkdfStreamingKey, Builder> implements AesGcmHkdfStreamingKeyOrBuilder {
    private static final AesGcmHkdfStreamingKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<AesGcmHkdfStreamingKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private AesGcmHkdfStreamingParams params_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<AesGcmHkdfStreamingKey, Builder> implements AesGcmHkdfStreamingKeyOrBuilder {
        public Builder() {
            super(AesGcmHkdfStreamingKey.DEFAULT_INSTANCE);
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

        public Builder clearKeyValue() {
            copyOnWrite();
            AesGcmHkdfStreamingKey.w((AesGcmHkdfStreamingKey) this.instance);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            AesGcmHkdfStreamingKey.u((AesGcmHkdfStreamingKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            AesGcmHkdfStreamingKey.r((AesGcmHkdfStreamingKey) this.instance);
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

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public ByteString getKeyValue() {
            return ((AesGcmHkdfStreamingKey) this.instance).getKeyValue();
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public AesGcmHkdfStreamingParams getParams() {
            return ((AesGcmHkdfStreamingKey) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public int getVersion() {
            return ((AesGcmHkdfStreamingKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public boolean hasParams() {
            return ((AesGcmHkdfStreamingKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeParams(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
            copyOnWrite();
            AesGcmHkdfStreamingKey.t((AesGcmHkdfStreamingKey) this.instance, aesGcmHkdfStreamingParams);
            return this;
        }

        public Builder setKeyValue(ByteString byteString) {
            copyOnWrite();
            AesGcmHkdfStreamingKey.v((AesGcmHkdfStreamingKey) this.instance, byteString);
            return this;
        }

        public Builder setParams(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
            copyOnWrite();
            AesGcmHkdfStreamingKey.s((AesGcmHkdfStreamingKey) this.instance, aesGcmHkdfStreamingParams);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            AesGcmHkdfStreamingKey.q((AesGcmHkdfStreamingKey) this.instance, i10);
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

        public Builder setParams(AesGcmHkdfStreamingParams.Builder builder) {
            copyOnWrite();
            AesGcmHkdfStreamingKey.s((AesGcmHkdfStreamingKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46869a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46869a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46869a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46869a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46869a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46869a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46869a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46869a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = new AesGcmHkdfStreamingKey();
        DEFAULT_INSTANCE = aesGcmHkdfStreamingKey;
        GeneratedMessageLite.registerDefaultInstance(AesGcmHkdfStreamingKey.class, aesGcmHkdfStreamingKey);
    }

    public static AesGcmHkdfStreamingKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesGcmHkdfStreamingKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesGcmHkdfStreamingKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey, int i10) {
        aesGcmHkdfStreamingKey.version_ = i10;
    }

    public static void r(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) {
        aesGcmHkdfStreamingKey.version_ = 0;
    }

    public static void s(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey, AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
        aesGcmHkdfStreamingKey.getClass();
        aesGcmHkdfStreamingParams.getClass();
        aesGcmHkdfStreamingKey.params_ = aesGcmHkdfStreamingParams;
    }

    public static void t(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey, AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
        aesGcmHkdfStreamingKey.getClass();
        aesGcmHkdfStreamingParams.getClass();
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams2 = aesGcmHkdfStreamingKey.params_;
        if (aesGcmHkdfStreamingParams2 == null || aesGcmHkdfStreamingParams2 == AesGcmHkdfStreamingParams.getDefaultInstance()) {
            aesGcmHkdfStreamingKey.params_ = aesGcmHkdfStreamingParams;
        } else {
            aesGcmHkdfStreamingKey.params_ = AesGcmHkdfStreamingParams.newBuilder(aesGcmHkdfStreamingKey.params_).mergeFrom(aesGcmHkdfStreamingParams).buildPartial();
        }
    }

    public static void u(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) {
        aesGcmHkdfStreamingKey.params_ = null;
    }

    public static void v(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey, ByteString byteString) {
        aesGcmHkdfStreamingKey.getClass();
        byteString.getClass();
        aesGcmHkdfStreamingKey.keyValue_ = byteString;
    }

    public static void w(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) {
        aesGcmHkdfStreamingKey.getClass();
        aesGcmHkdfStreamingKey.keyValue_ = getDefaultInstance().getKeyValue();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46869a[methodToInvoke.ordinal()]) {
            case 1:
                return new AesGcmHkdfStreamingKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesGcmHkdfStreamingKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AesGcmHkdfStreamingKey.class) {
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

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
    public AesGcmHkdfStreamingParams getParams() {
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams = this.params_;
        return aesGcmHkdfStreamingParams == null ? AesGcmHkdfStreamingParams.getDefaultInstance() : aesGcmHkdfStreamingParams;
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
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

    public static Builder newBuilder(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) {
        return DEFAULT_INSTANCE.createBuilder(aesGcmHkdfStreamingKey);
    }

    public static AesGcmHkdfStreamingKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesGcmHkdfStreamingKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(InputStream inputStream) throws IOException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesGcmHkdfStreamingKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
