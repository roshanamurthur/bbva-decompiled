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
public final class EcdsaParams extends GeneratedMessageLite<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final EcdsaParams DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<EcdsaParams> PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
        public Builder() {
            super(EcdsaParams.DEFAULT_INSTANCE);
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

        public Builder clearCurve() {
            copyOnWrite();
            EcdsaParams.v((EcdsaParams) this.instance);
            return this;
        }

        public Builder clearEncoding() {
            copyOnWrite();
            EcdsaParams.y((EcdsaParams) this.instance);
            return this;
        }

        public Builder clearHashType() {
            copyOnWrite();
            EcdsaParams.s((EcdsaParams) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public EllipticCurveType getCurve() {
            return ((EcdsaParams) this.instance).getCurve();
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public int getCurveValue() {
            return ((EcdsaParams) this.instance).getCurveValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public EcdsaSignatureEncoding getEncoding() {
            return ((EcdsaParams) this.instance).getEncoding();
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public int getEncodingValue() {
            return ((EcdsaParams) this.instance).getEncodingValue();
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public HashType getHashType() {
            return ((EcdsaParams) this.instance).getHashType();
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public int getHashTypeValue() {
            return ((EcdsaParams) this.instance).getHashTypeValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder setCurve(EllipticCurveType ellipticCurveType) {
            copyOnWrite();
            EcdsaParams.u((EcdsaParams) this.instance, ellipticCurveType);
            return this;
        }

        public Builder setCurveValue(int i10) {
            copyOnWrite();
            EcdsaParams.t((EcdsaParams) this.instance, i10);
            return this;
        }

        public Builder setEncoding(EcdsaSignatureEncoding ecdsaSignatureEncoding) {
            copyOnWrite();
            EcdsaParams.x((EcdsaParams) this.instance, ecdsaSignatureEncoding);
            return this;
        }

        public Builder setEncodingValue(int i10) {
            copyOnWrite();
            EcdsaParams.w((EcdsaParams) this.instance, i10);
            return this;
        }

        public Builder setHashType(HashType hashType) {
            copyOnWrite();
            EcdsaParams.r((EcdsaParams) this.instance, hashType);
            return this;
        }

        public Builder setHashTypeValue(int i10) {
            copyOnWrite();
            EcdsaParams.q((EcdsaParams) this.instance, i10);
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
        public static final /* synthetic */ int[] f46882a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46882a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46882a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46882a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46882a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46882a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46882a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46882a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EcdsaParams ecdsaParams = new EcdsaParams();
        DEFAULT_INSTANCE = ecdsaParams;
        GeneratedMessageLite.registerDefaultInstance(EcdsaParams.class, ecdsaParams);
    }

    public static EcdsaParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EcdsaParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EcdsaParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(EcdsaParams ecdsaParams, int i10) {
        ecdsaParams.hashType_ = i10;
    }

    public static void r(EcdsaParams ecdsaParams, HashType hashType) {
        ecdsaParams.getClass();
        ecdsaParams.hashType_ = hashType.getNumber();
    }

    public static void s(EcdsaParams ecdsaParams) {
        ecdsaParams.hashType_ = 0;
    }

    public static void t(EcdsaParams ecdsaParams, int i10) {
        ecdsaParams.curve_ = i10;
    }

    public static void u(EcdsaParams ecdsaParams, EllipticCurveType ellipticCurveType) {
        ecdsaParams.getClass();
        ecdsaParams.curve_ = ellipticCurveType.getNumber();
    }

    public static void v(EcdsaParams ecdsaParams) {
        ecdsaParams.curve_ = 0;
    }

    public static void w(EcdsaParams ecdsaParams, int i10) {
        ecdsaParams.encoding_ = i10;
    }

    public static void x(EcdsaParams ecdsaParams, EcdsaSignatureEncoding ecdsaSignatureEncoding) {
        ecdsaParams.getClass();
        ecdsaParams.encoding_ = ecdsaSignatureEncoding.getNumber();
    }

    public static void y(EcdsaParams ecdsaParams) {
        ecdsaParams.encoding_ = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46882a[methodToInvoke.ordinal()]) {
            case 1:
                return new EcdsaParams();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EcdsaParams> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EcdsaParams.class) {
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

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public EllipticCurveType getCurve() {
        EllipticCurveType ellipticCurveTypeForNumber = EllipticCurveType.forNumber(this.curve_);
        return ellipticCurveTypeForNumber == null ? EllipticCurveType.UNRECOGNIZED : ellipticCurveTypeForNumber;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public int getCurveValue() {
        return this.curve_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public EcdsaSignatureEncoding getEncoding() {
        EcdsaSignatureEncoding ecdsaSignatureEncodingForNumber = EcdsaSignatureEncoding.forNumber(this.encoding_);
        return ecdsaSignatureEncodingForNumber == null ? EcdsaSignatureEncoding.UNRECOGNIZED : ecdsaSignatureEncodingForNumber;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public int getEncodingValue() {
        return this.encoding_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public HashType getHashType() {
        HashType hashTypeForNumber = HashType.forNumber(this.hashType_);
        return hashTypeForNumber == null ? HashType.UNRECOGNIZED : hashTypeForNumber;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public int getHashTypeValue() {
        return this.hashType_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(EcdsaParams ecdsaParams) {
        return DEFAULT_INSTANCE.createBuilder(ecdsaParams);
    }

    public static EcdsaParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EcdsaParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EcdsaParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(InputStream inputStream) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EcdsaParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
