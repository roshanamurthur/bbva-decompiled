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
public final class AesCtrHmacStreamingKey extends GeneratedMessageLite<AesCtrHmacStreamingKey, Builder> implements AesCtrHmacStreamingKeyOrBuilder {
    private static final AesCtrHmacStreamingKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<AesCtrHmacStreamingKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private AesCtrHmacStreamingParams params_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacStreamingKey, Builder> implements AesCtrHmacStreamingKeyOrBuilder {
        public Builder() {
            super(AesCtrHmacStreamingKey.DEFAULT_INSTANCE);
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
            AesCtrHmacStreamingKey.w((AesCtrHmacStreamingKey) this.instance);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            AesCtrHmacStreamingKey.u((AesCtrHmacStreamingKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            AesCtrHmacStreamingKey.r((AesCtrHmacStreamingKey) this.instance);
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

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
        public ByteString getKeyValue() {
            return ((AesCtrHmacStreamingKey) this.instance).getKeyValue();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
        public AesCtrHmacStreamingParams getParams() {
            return ((AesCtrHmacStreamingKey) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
        public int getVersion() {
            return ((AesCtrHmacStreamingKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
        public boolean hasParams() {
            return ((AesCtrHmacStreamingKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeParams(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
            copyOnWrite();
            AesCtrHmacStreamingKey.t((AesCtrHmacStreamingKey) this.instance, aesCtrHmacStreamingParams);
            return this;
        }

        public Builder setKeyValue(ByteString byteString) {
            copyOnWrite();
            AesCtrHmacStreamingKey.v((AesCtrHmacStreamingKey) this.instance, byteString);
            return this;
        }

        public Builder setParams(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
            copyOnWrite();
            AesCtrHmacStreamingKey.s((AesCtrHmacStreamingKey) this.instance, aesCtrHmacStreamingParams);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            AesCtrHmacStreamingKey.q((AesCtrHmacStreamingKey) this.instance, i10);
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

        public Builder setParams(AesCtrHmacStreamingParams.Builder builder) {
            copyOnWrite();
            AesCtrHmacStreamingKey.s((AesCtrHmacStreamingKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46860a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46860a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46860a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46860a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46860a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46860a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46860a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46860a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AesCtrHmacStreamingKey aesCtrHmacStreamingKey = new AesCtrHmacStreamingKey();
        DEFAULT_INSTANCE = aesCtrHmacStreamingKey;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacStreamingKey.class, aesCtrHmacStreamingKey);
    }

    public static AesCtrHmacStreamingKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCtrHmacStreamingKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesCtrHmacStreamingKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(AesCtrHmacStreamingKey aesCtrHmacStreamingKey, int i10) {
        aesCtrHmacStreamingKey.version_ = i10;
    }

    public static void r(AesCtrHmacStreamingKey aesCtrHmacStreamingKey) {
        aesCtrHmacStreamingKey.version_ = 0;
    }

    public static void s(AesCtrHmacStreamingKey aesCtrHmacStreamingKey, AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingKey.getClass();
        aesCtrHmacStreamingParams.getClass();
        aesCtrHmacStreamingKey.params_ = aesCtrHmacStreamingParams;
    }

    public static void t(AesCtrHmacStreamingKey aesCtrHmacStreamingKey, AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingKey.getClass();
        aesCtrHmacStreamingParams.getClass();
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams2 = aesCtrHmacStreamingKey.params_;
        if (aesCtrHmacStreamingParams2 == null || aesCtrHmacStreamingParams2 == AesCtrHmacStreamingParams.getDefaultInstance()) {
            aesCtrHmacStreamingKey.params_ = aesCtrHmacStreamingParams;
        } else {
            aesCtrHmacStreamingKey.params_ = AesCtrHmacStreamingParams.newBuilder(aesCtrHmacStreamingKey.params_).mergeFrom(aesCtrHmacStreamingParams).buildPartial();
        }
    }

    public static void u(AesCtrHmacStreamingKey aesCtrHmacStreamingKey) {
        aesCtrHmacStreamingKey.params_ = null;
    }

    public static void v(AesCtrHmacStreamingKey aesCtrHmacStreamingKey, ByteString byteString) {
        aesCtrHmacStreamingKey.getClass();
        byteString.getClass();
        aesCtrHmacStreamingKey.keyValue_ = byteString;
    }

    public static void w(AesCtrHmacStreamingKey aesCtrHmacStreamingKey) {
        aesCtrHmacStreamingKey.getClass();
        aesCtrHmacStreamingKey.keyValue_ = getDefaultInstance().getKeyValue();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46860a[methodToInvoke.ordinal()]) {
            case 1:
                return new AesCtrHmacStreamingKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacStreamingKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AesCtrHmacStreamingKey.class) {
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
    public AesCtrHmacStreamingParams getParams() {
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams = this.params_;
        return aesCtrHmacStreamingParams == null ? AesCtrHmacStreamingParams.getDefaultInstance() : aesCtrHmacStreamingParams;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyOrBuilder
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

    public static Builder newBuilder(AesCtrHmacStreamingKey aesCtrHmacStreamingKey) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrHmacStreamingKey);
    }

    public static AesCtrHmacStreamingKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesCtrHmacStreamingKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrHmacStreamingKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKey parseFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesCtrHmacStreamingKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
