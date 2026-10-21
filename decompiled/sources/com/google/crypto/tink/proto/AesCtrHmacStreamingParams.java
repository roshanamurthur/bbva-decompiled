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
public final class AesCtrHmacStreamingParams extends GeneratedMessageLite<AesCtrHmacStreamingParams, Builder> implements AesCtrHmacStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final AesCtrHmacStreamingParams DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile Parser<AesCtrHmacStreamingParams> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private HmacParams hmacParams_;

    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacStreamingParams, Builder> implements AesCtrHmacStreamingParamsOrBuilder {
        public Builder() {
            super(AesCtrHmacStreamingParams.DEFAULT_INSTANCE);
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

        public Builder clearCiphertextSegmentSize() {
            copyOnWrite();
            AesCtrHmacStreamingParams.s((AesCtrHmacStreamingParams) this.instance);
            return this;
        }

        public Builder clearDerivedKeySize() {
            copyOnWrite();
            AesCtrHmacStreamingParams.u((AesCtrHmacStreamingParams) this.instance);
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            AesCtrHmacStreamingParams.x((AesCtrHmacStreamingParams) this.instance);
            return this;
        }

        public Builder clearHmacParams() {
            copyOnWrite();
            AesCtrHmacStreamingParams.r((AesCtrHmacStreamingParams) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public int getCiphertextSegmentSize() {
            return ((AesCtrHmacStreamingParams) this.instance).getCiphertextSegmentSize();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public int getDerivedKeySize() {
            return ((AesCtrHmacStreamingParams) this.instance).getDerivedKeySize();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public HashType getHkdfHashType() {
            return ((AesCtrHmacStreamingParams) this.instance).getHkdfHashType();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public int getHkdfHashTypeValue() {
            return ((AesCtrHmacStreamingParams) this.instance).getHkdfHashTypeValue();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public HmacParams getHmacParams() {
            return ((AesCtrHmacStreamingParams) this.instance).getHmacParams();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public boolean hasHmacParams() {
            return ((AesCtrHmacStreamingParams) this.instance).hasHmacParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeHmacParams(HmacParams hmacParams) {
            copyOnWrite();
            AesCtrHmacStreamingParams.z((AesCtrHmacStreamingParams) this.instance, hmacParams);
            return this;
        }

        public Builder setCiphertextSegmentSize(int i10) {
            copyOnWrite();
            AesCtrHmacStreamingParams.q((AesCtrHmacStreamingParams) this.instance, i10);
            return this;
        }

        public Builder setDerivedKeySize(int i10) {
            copyOnWrite();
            AesCtrHmacStreamingParams.t((AesCtrHmacStreamingParams) this.instance, i10);
            return this;
        }

        public Builder setHkdfHashType(HashType hashType) {
            copyOnWrite();
            AesCtrHmacStreamingParams.w((AesCtrHmacStreamingParams) this.instance, hashType);
            return this;
        }

        public Builder setHkdfHashTypeValue(int i10) {
            copyOnWrite();
            AesCtrHmacStreamingParams.v((AesCtrHmacStreamingParams) this.instance, i10);
            return this;
        }

        public Builder setHmacParams(HmacParams hmacParams) {
            copyOnWrite();
            AesCtrHmacStreamingParams.y((AesCtrHmacStreamingParams) this.instance, hmacParams);
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

        public Builder setHmacParams(HmacParams.Builder builder) {
            copyOnWrite();
            AesCtrHmacStreamingParams.y((AesCtrHmacStreamingParams) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46862a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46862a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46862a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46862a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46862a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46862a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46862a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46862a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams = new AesCtrHmacStreamingParams();
        DEFAULT_INSTANCE = aesCtrHmacStreamingParams;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacStreamingParams.class, aesCtrHmacStreamingParams);
    }

    public static AesCtrHmacStreamingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCtrHmacStreamingParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesCtrHmacStreamingParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(AesCtrHmacStreamingParams aesCtrHmacStreamingParams, int i10) {
        aesCtrHmacStreamingParams.ciphertextSegmentSize_ = i10;
    }

    public static void r(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingParams.hmacParams_ = null;
    }

    public static void s(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingParams.ciphertextSegmentSize_ = 0;
    }

    public static void t(AesCtrHmacStreamingParams aesCtrHmacStreamingParams, int i10) {
        aesCtrHmacStreamingParams.derivedKeySize_ = i10;
    }

    public static void u(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingParams.derivedKeySize_ = 0;
    }

    public static void v(AesCtrHmacStreamingParams aesCtrHmacStreamingParams, int i10) {
        aesCtrHmacStreamingParams.hkdfHashType_ = i10;
    }

    public static void w(AesCtrHmacStreamingParams aesCtrHmacStreamingParams, HashType hashType) {
        aesCtrHmacStreamingParams.getClass();
        aesCtrHmacStreamingParams.hkdfHashType_ = hashType.getNumber();
    }

    public static void x(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingParams.hkdfHashType_ = 0;
    }

    public static void y(AesCtrHmacStreamingParams aesCtrHmacStreamingParams, HmacParams hmacParams) {
        aesCtrHmacStreamingParams.getClass();
        hmacParams.getClass();
        aesCtrHmacStreamingParams.hmacParams_ = hmacParams;
    }

    public static void z(AesCtrHmacStreamingParams aesCtrHmacStreamingParams, HmacParams hmacParams) {
        aesCtrHmacStreamingParams.getClass();
        hmacParams.getClass();
        HmacParams hmacParams2 = aesCtrHmacStreamingParams.hmacParams_;
        if (hmacParams2 == null || hmacParams2 == HmacParams.getDefaultInstance()) {
            aesCtrHmacStreamingParams.hmacParams_ = hmacParams;
        } else {
            aesCtrHmacStreamingParams.hmacParams_ = HmacParams.newBuilder(aesCtrHmacStreamingParams.hmacParams_).mergeFrom(hmacParams).buildPartial();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46862a[methodToInvoke.ordinal()]) {
            case 1:
                return new AesCtrHmacStreamingParams();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacStreamingParams> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AesCtrHmacStreamingParams.class) {
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public int getDerivedKeySize() {
        return this.derivedKeySize_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public HashType getHkdfHashType() {
        HashType hashTypeForNumber = HashType.forNumber(this.hkdfHashType_);
        return hashTypeForNumber == null ? HashType.UNRECOGNIZED : hashTypeForNumber;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public HmacParams getHmacParams() {
        HmacParams hmacParams = this.hmacParams_;
        return hmacParams == null ? HmacParams.getDefaultInstance() : hmacParams;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public boolean hasHmacParams() {
        return this.hmacParams_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrHmacStreamingParams);
    }

    public static AesCtrHmacStreamingParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrHmacStreamingParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingParams parseFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesCtrHmacStreamingParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
