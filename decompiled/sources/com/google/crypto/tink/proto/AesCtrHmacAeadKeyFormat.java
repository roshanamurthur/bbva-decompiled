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
public final class AesCtrHmacAeadKeyFormat extends GeneratedMessageLite<AesCtrHmacAeadKeyFormat, Builder> implements AesCtrHmacAeadKeyFormatOrBuilder {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final AesCtrHmacAeadKeyFormat DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile Parser<AesCtrHmacAeadKeyFormat> PARSER;
    private AesCtrKeyFormat aesCtrKeyFormat_;
    private HmacKeyFormat hmacKeyFormat_;

    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacAeadKeyFormat, Builder> implements AesCtrHmacAeadKeyFormatOrBuilder {
        public Builder() {
            super(AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE);
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

        public Builder clearAesCtrKeyFormat() {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.s((AesCtrHmacAeadKeyFormat) this.instance);
            return this;
        }

        public Builder clearHmacKeyFormat() {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.v((AesCtrHmacAeadKeyFormat) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public AesCtrKeyFormat getAesCtrKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).getAesCtrKeyFormat();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public HmacKeyFormat getHmacKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).getHmacKeyFormat();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public boolean hasAesCtrKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).hasAesCtrKeyFormat();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public boolean hasHmacKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).hasHmacKeyFormat();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        public Builder mergeAesCtrKeyFormat(AesCtrKeyFormat aesCtrKeyFormat) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.r((AesCtrHmacAeadKeyFormat) this.instance, aesCtrKeyFormat);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeHmacKeyFormat(HmacKeyFormat hmacKeyFormat) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.u((AesCtrHmacAeadKeyFormat) this.instance, hmacKeyFormat);
            return this;
        }

        public Builder setAesCtrKeyFormat(AesCtrKeyFormat aesCtrKeyFormat) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.q((AesCtrHmacAeadKeyFormat) this.instance, aesCtrKeyFormat);
            return this;
        }

        public Builder setHmacKeyFormat(HmacKeyFormat hmacKeyFormat) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.t((AesCtrHmacAeadKeyFormat) this.instance, hmacKeyFormat);
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

        public Builder setAesCtrKeyFormat(AesCtrKeyFormat.Builder builder) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.q((AesCtrHmacAeadKeyFormat) this.instance, builder.build());
            return this;
        }

        public Builder setHmacKeyFormat(HmacKeyFormat.Builder builder) {
            copyOnWrite();
            AesCtrHmacAeadKeyFormat.t((AesCtrHmacAeadKeyFormat) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46859a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46859a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46859a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46859a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46859a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46859a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46859a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46859a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = new AesCtrHmacAeadKeyFormat();
        DEFAULT_INSTANCE = aesCtrHmacAeadKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacAeadKeyFormat.class, aesCtrHmacAeadKeyFormat);
    }

    public static AesCtrHmacAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCtrHmacAeadKeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesCtrHmacAeadKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat, AesCtrKeyFormat aesCtrKeyFormat) {
        aesCtrHmacAeadKeyFormat.getClass();
        aesCtrKeyFormat.getClass();
        aesCtrHmacAeadKeyFormat.aesCtrKeyFormat_ = aesCtrKeyFormat;
    }

    public static void r(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat, AesCtrKeyFormat aesCtrKeyFormat) {
        aesCtrHmacAeadKeyFormat.getClass();
        aesCtrKeyFormat.getClass();
        AesCtrKeyFormat aesCtrKeyFormat2 = aesCtrHmacAeadKeyFormat.aesCtrKeyFormat_;
        if (aesCtrKeyFormat2 == null || aesCtrKeyFormat2 == AesCtrKeyFormat.getDefaultInstance()) {
            aesCtrHmacAeadKeyFormat.aesCtrKeyFormat_ = aesCtrKeyFormat;
        } else {
            aesCtrHmacAeadKeyFormat.aesCtrKeyFormat_ = AesCtrKeyFormat.newBuilder(aesCtrHmacAeadKeyFormat.aesCtrKeyFormat_).mergeFrom(aesCtrKeyFormat).buildPartial();
        }
    }

    public static void s(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat) {
        aesCtrHmacAeadKeyFormat.aesCtrKeyFormat_ = null;
    }

    public static void t(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat, HmacKeyFormat hmacKeyFormat) {
        aesCtrHmacAeadKeyFormat.getClass();
        hmacKeyFormat.getClass();
        aesCtrHmacAeadKeyFormat.hmacKeyFormat_ = hmacKeyFormat;
    }

    public static void u(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat, HmacKeyFormat hmacKeyFormat) {
        aesCtrHmacAeadKeyFormat.getClass();
        hmacKeyFormat.getClass();
        HmacKeyFormat hmacKeyFormat2 = aesCtrHmacAeadKeyFormat.hmacKeyFormat_;
        if (hmacKeyFormat2 == null || hmacKeyFormat2 == HmacKeyFormat.getDefaultInstance()) {
            aesCtrHmacAeadKeyFormat.hmacKeyFormat_ = hmacKeyFormat;
        } else {
            aesCtrHmacAeadKeyFormat.hmacKeyFormat_ = HmacKeyFormat.newBuilder(aesCtrHmacAeadKeyFormat.hmacKeyFormat_).mergeFrom(hmacKeyFormat).buildPartial();
        }
    }

    public static void v(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat) {
        aesCtrHmacAeadKeyFormat.hmacKeyFormat_ = null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46859a[methodToInvoke.ordinal()]) {
            case 1:
                return new AesCtrHmacAeadKeyFormat();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacAeadKeyFormat> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AesCtrHmacAeadKeyFormat.class) {
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public AesCtrKeyFormat getAesCtrKeyFormat() {
        AesCtrKeyFormat aesCtrKeyFormat = this.aesCtrKeyFormat_;
        return aesCtrKeyFormat == null ? AesCtrKeyFormat.getDefaultInstance() : aesCtrKeyFormat;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public HmacKeyFormat getHmacKeyFormat() {
        HmacKeyFormat hmacKeyFormat = this.hmacKeyFormat_;
        return hmacKeyFormat == null ? HmacKeyFormat.getDefaultInstance() : hmacKeyFormat;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public boolean hasAesCtrKeyFormat() {
        return this.aesCtrKeyFormat_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public boolean hasHmacKeyFormat() {
        return this.hmacKeyFormat_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrHmacAeadKeyFormat);
    }

    public static AesCtrHmacAeadKeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
