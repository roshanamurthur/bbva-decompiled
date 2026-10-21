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
public final class JwtRsaSsaPssKeyFormat extends GeneratedMessageLite<JwtRsaSsaPssKeyFormat, Builder> implements JwtRsaSsaPssKeyFormatOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 2;
    private static final JwtRsaSsaPssKeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 3;
    private static volatile Parser<JwtRsaSsaPssKeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private int modulusSizeInBits_;
    private ByteString publicExponent_ = ByteString.EMPTY;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<JwtRsaSsaPssKeyFormat, Builder> implements JwtRsaSsaPssKeyFormatOrBuilder {
        public Builder() {
            super(JwtRsaSsaPssKeyFormat.DEFAULT_INSTANCE);
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

        public Builder clearAlgorithm() {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.u((JwtRsaSsaPssKeyFormat) this.instance);
            return this;
        }

        public Builder clearModulusSizeInBits() {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.w((JwtRsaSsaPssKeyFormat) this.instance);
            return this;
        }

        public Builder clearPublicExponent() {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.y((JwtRsaSsaPssKeyFormat) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.r((JwtRsaSsaPssKeyFormat) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
        public JwtRsaSsaPssAlgorithm getAlgorithm() {
            return ((JwtRsaSsaPssKeyFormat) this.instance).getAlgorithm();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
        public int getAlgorithmValue() {
            return ((JwtRsaSsaPssKeyFormat) this.instance).getAlgorithmValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
        public int getModulusSizeInBits() {
            return ((JwtRsaSsaPssKeyFormat) this.instance).getModulusSizeInBits();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
        public ByteString getPublicExponent() {
            return ((JwtRsaSsaPssKeyFormat) this.instance).getPublicExponent();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
        public int getVersion() {
            return ((JwtRsaSsaPssKeyFormat) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder setAlgorithm(JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.t((JwtRsaSsaPssKeyFormat) this.instance, jwtRsaSsaPssAlgorithm);
            return this;
        }

        public Builder setAlgorithmValue(int i10) {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.s((JwtRsaSsaPssKeyFormat) this.instance, i10);
            return this;
        }

        public Builder setModulusSizeInBits(int i10) {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.v((JwtRsaSsaPssKeyFormat) this.instance, i10);
            return this;
        }

        public Builder setPublicExponent(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.x((JwtRsaSsaPssKeyFormat) this.instance, byteString);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            JwtRsaSsaPssKeyFormat.q((JwtRsaSsaPssKeyFormat) this.instance, i10);
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
        public static final /* synthetic */ int[] f46926a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46926a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46926a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46926a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46926a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46926a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46926a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46926a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat = new JwtRsaSsaPssKeyFormat();
        DEFAULT_INSTANCE = jwtRsaSsaPssKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(JwtRsaSsaPssKeyFormat.class, jwtRsaSsaPssKeyFormat);
    }

    public static JwtRsaSsaPssKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtRsaSsaPssKeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<JwtRsaSsaPssKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat, int i10) {
        jwtRsaSsaPssKeyFormat.version_ = i10;
    }

    public static void r(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat) {
        jwtRsaSsaPssKeyFormat.version_ = 0;
    }

    public static void s(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat, int i10) {
        jwtRsaSsaPssKeyFormat.algorithm_ = i10;
    }

    public static void t(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat, JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) {
        jwtRsaSsaPssKeyFormat.getClass();
        jwtRsaSsaPssKeyFormat.algorithm_ = jwtRsaSsaPssAlgorithm.getNumber();
    }

    public static void u(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat) {
        jwtRsaSsaPssKeyFormat.algorithm_ = 0;
    }

    public static void v(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat, int i10) {
        jwtRsaSsaPssKeyFormat.modulusSizeInBits_ = i10;
    }

    public static void w(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat) {
        jwtRsaSsaPssKeyFormat.modulusSizeInBits_ = 0;
    }

    public static void x(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat, ByteString byteString) {
        jwtRsaSsaPssKeyFormat.getClass();
        byteString.getClass();
        jwtRsaSsaPssKeyFormat.publicExponent_ = byteString;
    }

    public static void y(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat) {
        jwtRsaSsaPssKeyFormat.getClass();
        jwtRsaSsaPssKeyFormat.publicExponent_ = getDefaultInstance().getPublicExponent();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46926a[methodToInvoke.ordinal()]) {
            case 1:
                return new JwtRsaSsaPssKeyFormat();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\u000b\u0004\n", new Object[]{"version_", "algorithm_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JwtRsaSsaPssKeyFormat> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (JwtRsaSsaPssKeyFormat.class) {
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
    public JwtRsaSsaPssAlgorithm getAlgorithm() {
        JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithmForNumber = JwtRsaSsaPssAlgorithm.forNumber(this.algorithm_);
        return jwtRsaSsaPssAlgorithmForNumber == null ? JwtRsaSsaPssAlgorithm.UNRECOGNIZED : jwtRsaSsaPssAlgorithmForNumber;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
    public int getAlgorithmValue() {
        return this.algorithm_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
    public int getModulusSizeInBits() {
        return this.modulusSizeInBits_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
    public ByteString getPublicExponent() {
        return this.publicExponent_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormatOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(jwtRsaSsaPssKeyFormat);
    }

    public static JwtRsaSsaPssKeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static JwtRsaSsaPssKeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
