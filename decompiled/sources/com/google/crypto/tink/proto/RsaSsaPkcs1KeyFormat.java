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
public final class RsaSsaPkcs1KeyFormat extends GeneratedMessageLite<RsaSsaPkcs1KeyFormat, Builder> implements RsaSsaPkcs1KeyFormatOrBuilder {
    private static final RsaSsaPkcs1KeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<RsaSsaPkcs1KeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int modulusSizeInBits_;
    private RsaSsaPkcs1Params params_;
    private ByteString publicExponent_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPkcs1KeyFormat, Builder> implements RsaSsaPkcs1KeyFormatOrBuilder {
        public Builder() {
            super(RsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE);
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

        public Builder clearModulusSizeInBits() {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.u((RsaSsaPkcs1KeyFormat) this.instance);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.s((RsaSsaPkcs1KeyFormat) this.instance);
            return this;
        }

        public Builder clearPublicExponent() {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.w((RsaSsaPkcs1KeyFormat) this.instance);
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

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public int getModulusSizeInBits() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getModulusSizeInBits();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public RsaSsaPkcs1Params getParams() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public ByteString getPublicExponent() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getPublicExponent();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public boolean hasParams() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.r((RsaSsaPkcs1KeyFormat) this.instance, rsaSsaPkcs1Params);
            return this;
        }

        public Builder setModulusSizeInBits(int i10) {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.t((RsaSsaPkcs1KeyFormat) this.instance, i10);
            return this;
        }

        public Builder setParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.q((RsaSsaPkcs1KeyFormat) this.instance, rsaSsaPkcs1Params);
            return this;
        }

        public Builder setPublicExponent(ByteString byteString) {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.v((RsaSsaPkcs1KeyFormat) this.instance, byteString);
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

        public Builder setParams(RsaSsaPkcs1Params.Builder builder) {
            copyOnWrite();
            RsaSsaPkcs1KeyFormat.q((RsaSsaPkcs1KeyFormat) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46942a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46942a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46942a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46942a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46942a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46942a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46942a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46942a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = new RsaSsaPkcs1KeyFormat();
        DEFAULT_INSTANCE = rsaSsaPkcs1KeyFormat;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPkcs1KeyFormat.class, rsaSsaPkcs1KeyFormat);
    }

    public static RsaSsaPkcs1KeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RsaSsaPkcs1KeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RsaSsaPkcs1KeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat, RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        rsaSsaPkcs1KeyFormat.getClass();
        rsaSsaPkcs1Params.getClass();
        rsaSsaPkcs1KeyFormat.params_ = rsaSsaPkcs1Params;
    }

    public static void r(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat, RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        rsaSsaPkcs1KeyFormat.getClass();
        rsaSsaPkcs1Params.getClass();
        RsaSsaPkcs1Params rsaSsaPkcs1Params2 = rsaSsaPkcs1KeyFormat.params_;
        if (rsaSsaPkcs1Params2 == null || rsaSsaPkcs1Params2 == RsaSsaPkcs1Params.getDefaultInstance()) {
            rsaSsaPkcs1KeyFormat.params_ = rsaSsaPkcs1Params;
        } else {
            rsaSsaPkcs1KeyFormat.params_ = RsaSsaPkcs1Params.newBuilder(rsaSsaPkcs1KeyFormat.params_).mergeFrom(rsaSsaPkcs1Params).buildPartial();
        }
    }

    public static void s(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat) {
        rsaSsaPkcs1KeyFormat.params_ = null;
    }

    public static void t(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat, int i10) {
        rsaSsaPkcs1KeyFormat.modulusSizeInBits_ = i10;
    }

    public static void u(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat) {
        rsaSsaPkcs1KeyFormat.modulusSizeInBits_ = 0;
    }

    public static void v(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat, ByteString byteString) {
        rsaSsaPkcs1KeyFormat.getClass();
        byteString.getClass();
        rsaSsaPkcs1KeyFormat.publicExponent_ = byteString;
    }

    public static void w(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat) {
        rsaSsaPkcs1KeyFormat.getClass();
        rsaSsaPkcs1KeyFormat.publicExponent_ = getDefaultInstance().getPublicExponent();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46942a[methodToInvoke.ordinal()]) {
            case 1:
                return new RsaSsaPkcs1KeyFormat();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"params_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPkcs1KeyFormat> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RsaSsaPkcs1KeyFormat.class) {
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

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
    public int getModulusSizeInBits() {
        return this.modulusSizeInBits_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
    public RsaSsaPkcs1Params getParams() {
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        return rsaSsaPkcs1Params == null ? RsaSsaPkcs1Params.getDefaultInstance() : rsaSsaPkcs1Params;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
    public ByteString getPublicExponent() {
        return this.publicExponent_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
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

    public static Builder newBuilder(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPkcs1KeyFormat);
    }

    public static RsaSsaPkcs1KeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
