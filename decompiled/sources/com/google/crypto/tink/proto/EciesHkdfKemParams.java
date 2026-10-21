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
public final class EciesHkdfKemParams extends GeneratedMessageLite<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final EciesHkdfKemParams DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile Parser<EciesHkdfKemParams> PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private ByteString hkdfSalt_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
        public Builder() {
            super(EciesHkdfKemParams.DEFAULT_INSTANCE);
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

        public Builder clearCurveType() {
            copyOnWrite();
            EciesHkdfKemParams.s((EciesHkdfKemParams) this.instance);
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            EciesHkdfKemParams.v((EciesHkdfKemParams) this.instance);
            return this;
        }

        public Builder clearHkdfSalt() {
            copyOnWrite();
            EciesHkdfKemParams.x((EciesHkdfKemParams) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public EllipticCurveType getCurveType() {
            return ((EciesHkdfKemParams) this.instance).getCurveType();
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getCurveTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getCurveTypeValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public HashType getHkdfHashType() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashType();
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getHkdfHashTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashTypeValue();
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public ByteString getHkdfSalt() {
            return ((EciesHkdfKemParams) this.instance).getHkdfSalt();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder setCurveType(EllipticCurveType ellipticCurveType) {
            copyOnWrite();
            EciesHkdfKemParams.r((EciesHkdfKemParams) this.instance, ellipticCurveType);
            return this;
        }

        public Builder setCurveTypeValue(int i10) {
            copyOnWrite();
            EciesHkdfKemParams.q((EciesHkdfKemParams) this.instance, i10);
            return this;
        }

        public Builder setHkdfHashType(HashType hashType) {
            copyOnWrite();
            EciesHkdfKemParams.u((EciesHkdfKemParams) this.instance, hashType);
            return this;
        }

        public Builder setHkdfHashTypeValue(int i10) {
            copyOnWrite();
            EciesHkdfKemParams.t((EciesHkdfKemParams) this.instance, i10);
            return this;
        }

        public Builder setHkdfSalt(ByteString byteString) {
            copyOnWrite();
            EciesHkdfKemParams.w((EciesHkdfKemParams) this.instance, byteString);
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
        public static final /* synthetic */ int[] f46891a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46891a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46891a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46891a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46891a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46891a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46891a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46891a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EciesHkdfKemParams eciesHkdfKemParams = new EciesHkdfKemParams();
        DEFAULT_INSTANCE = eciesHkdfKemParams;
        GeneratedMessageLite.registerDefaultInstance(EciesHkdfKemParams.class, eciesHkdfKemParams);
    }

    public static EciesHkdfKemParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EciesHkdfKemParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(EciesHkdfKemParams eciesHkdfKemParams, int i10) {
        eciesHkdfKemParams.curveType_ = i10;
    }

    public static void r(EciesHkdfKemParams eciesHkdfKemParams, EllipticCurveType ellipticCurveType) {
        eciesHkdfKemParams.getClass();
        eciesHkdfKemParams.curveType_ = ellipticCurveType.getNumber();
    }

    public static void s(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.curveType_ = 0;
    }

    public static void t(EciesHkdfKemParams eciesHkdfKemParams, int i10) {
        eciesHkdfKemParams.hkdfHashType_ = i10;
    }

    public static void u(EciesHkdfKemParams eciesHkdfKemParams, HashType hashType) {
        eciesHkdfKemParams.getClass();
        eciesHkdfKemParams.hkdfHashType_ = hashType.getNumber();
    }

    public static void v(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.hkdfHashType_ = 0;
    }

    public static void w(EciesHkdfKemParams eciesHkdfKemParams, ByteString byteString) {
        eciesHkdfKemParams.getClass();
        byteString.getClass();
        eciesHkdfKemParams.hkdfSalt_ = byteString;
    }

    public static void x(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.getClass();
        eciesHkdfKemParams.hkdfSalt_ = getDefaultInstance().getHkdfSalt();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46891a[methodToInvoke.ordinal()]) {
            case 1:
                return new EciesHkdfKemParams();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesHkdfKemParams> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EciesHkdfKemParams.class) {
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

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public EllipticCurveType getCurveType() {
        EllipticCurveType ellipticCurveTypeForNumber = EllipticCurveType.forNumber(this.curveType_);
        return ellipticCurveTypeForNumber == null ? EllipticCurveType.UNRECOGNIZED : ellipticCurveTypeForNumber;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getCurveTypeValue() {
        return this.curveType_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public HashType getHkdfHashType() {
        HashType hashTypeForNumber = HashType.forNumber(this.hkdfHashType_);
        return hashTypeForNumber == null ? HashType.UNRECOGNIZED : hashTypeForNumber;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public ByteString getHkdfSalt() {
        return this.hkdfSalt_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(EciesHkdfKemParams eciesHkdfKemParams) {
        return DEFAULT_INSTANCE.createBuilder(eciesHkdfKemParams);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EciesHkdfKemParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesHkdfKemParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(InputStream inputStream) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesHkdfKemParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
