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
public final class AesCtrHmacAeadKey extends GeneratedMessageLite<AesCtrHmacAeadKey, Builder> implements AesCtrHmacAeadKeyOrBuilder {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final AesCtrHmacAeadKey DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile Parser<AesCtrHmacAeadKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AesCtrKey aesCtrKey_;
    private HmacKey hmacKey_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacAeadKey, Builder> implements AesCtrHmacAeadKeyOrBuilder {
        public Builder() {
            super(AesCtrHmacAeadKey.DEFAULT_INSTANCE);
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

        public Builder clearAesCtrKey() {
            copyOnWrite();
            AesCtrHmacAeadKey.u((AesCtrHmacAeadKey) this.instance);
            return this;
        }

        public Builder clearHmacKey() {
            copyOnWrite();
            AesCtrHmacAeadKey.x((AesCtrHmacAeadKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            AesCtrHmacAeadKey.r((AesCtrHmacAeadKey) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public AesCtrKey getAesCtrKey() {
            return ((AesCtrHmacAeadKey) this.instance).getAesCtrKey();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public HmacKey getHmacKey() {
            return ((AesCtrHmacAeadKey) this.instance).getHmacKey();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public int getVersion() {
            return ((AesCtrHmacAeadKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public boolean hasAesCtrKey() {
            return ((AesCtrHmacAeadKey) this.instance).hasAesCtrKey();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public boolean hasHmacKey() {
            return ((AesCtrHmacAeadKey) this.instance).hasHmacKey();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        public Builder mergeAesCtrKey(AesCtrKey aesCtrKey) {
            copyOnWrite();
            AesCtrHmacAeadKey.t((AesCtrHmacAeadKey) this.instance, aesCtrKey);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeHmacKey(HmacKey hmacKey) {
            copyOnWrite();
            AesCtrHmacAeadKey.w((AesCtrHmacAeadKey) this.instance, hmacKey);
            return this;
        }

        public Builder setAesCtrKey(AesCtrKey aesCtrKey) {
            copyOnWrite();
            AesCtrHmacAeadKey.s((AesCtrHmacAeadKey) this.instance, aesCtrKey);
            return this;
        }

        public Builder setHmacKey(HmacKey hmacKey) {
            copyOnWrite();
            AesCtrHmacAeadKey.v((AesCtrHmacAeadKey) this.instance, hmacKey);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            AesCtrHmacAeadKey.q((AesCtrHmacAeadKey) this.instance, i10);
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

        public Builder setAesCtrKey(AesCtrKey.Builder builder) {
            copyOnWrite();
            AesCtrHmacAeadKey.s((AesCtrHmacAeadKey) this.instance, builder.build());
            return this;
        }

        public Builder setHmacKey(HmacKey.Builder builder) {
            copyOnWrite();
            AesCtrHmacAeadKey.v((AesCtrHmacAeadKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46858a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46858a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46858a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46858a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46858a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46858a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46858a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46858a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AesCtrHmacAeadKey aesCtrHmacAeadKey = new AesCtrHmacAeadKey();
        DEFAULT_INSTANCE = aesCtrHmacAeadKey;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacAeadKey.class, aesCtrHmacAeadKey);
    }

    public static AesCtrHmacAeadKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesCtrHmacAeadKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesCtrHmacAeadKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(AesCtrHmacAeadKey aesCtrHmacAeadKey, int i10) {
        aesCtrHmacAeadKey.version_ = i10;
    }

    public static void r(AesCtrHmacAeadKey aesCtrHmacAeadKey) {
        aesCtrHmacAeadKey.version_ = 0;
    }

    public static void s(AesCtrHmacAeadKey aesCtrHmacAeadKey, AesCtrKey aesCtrKey) {
        aesCtrHmacAeadKey.getClass();
        aesCtrKey.getClass();
        aesCtrHmacAeadKey.aesCtrKey_ = aesCtrKey;
    }

    public static void t(AesCtrHmacAeadKey aesCtrHmacAeadKey, AesCtrKey aesCtrKey) {
        aesCtrHmacAeadKey.getClass();
        aesCtrKey.getClass();
        AesCtrKey aesCtrKey2 = aesCtrHmacAeadKey.aesCtrKey_;
        if (aesCtrKey2 == null || aesCtrKey2 == AesCtrKey.getDefaultInstance()) {
            aesCtrHmacAeadKey.aesCtrKey_ = aesCtrKey;
        } else {
            aesCtrHmacAeadKey.aesCtrKey_ = AesCtrKey.newBuilder(aesCtrHmacAeadKey.aesCtrKey_).mergeFrom(aesCtrKey).buildPartial();
        }
    }

    public static void u(AesCtrHmacAeadKey aesCtrHmacAeadKey) {
        aesCtrHmacAeadKey.aesCtrKey_ = null;
    }

    public static void v(AesCtrHmacAeadKey aesCtrHmacAeadKey, HmacKey hmacKey) {
        aesCtrHmacAeadKey.getClass();
        hmacKey.getClass();
        aesCtrHmacAeadKey.hmacKey_ = hmacKey;
    }

    public static void w(AesCtrHmacAeadKey aesCtrHmacAeadKey, HmacKey hmacKey) {
        aesCtrHmacAeadKey.getClass();
        hmacKey.getClass();
        HmacKey hmacKey2 = aesCtrHmacAeadKey.hmacKey_;
        if (hmacKey2 == null || hmacKey2 == HmacKey.getDefaultInstance()) {
            aesCtrHmacAeadKey.hmacKey_ = hmacKey;
        } else {
            aesCtrHmacAeadKey.hmacKey_ = HmacKey.newBuilder(aesCtrHmacAeadKey.hmacKey_).mergeFrom(hmacKey).buildPartial();
        }
    }

    public static void x(AesCtrHmacAeadKey aesCtrHmacAeadKey) {
        aesCtrHmacAeadKey.hmacKey_ = null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46858a[methodToInvoke.ordinal()]) {
            case 1:
                return new AesCtrHmacAeadKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacAeadKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AesCtrHmacAeadKey.class) {
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public AesCtrKey getAesCtrKey() {
        AesCtrKey aesCtrKey = this.aesCtrKey_;
        return aesCtrKey == null ? AesCtrKey.getDefaultInstance() : aesCtrKey;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public HmacKey getHmacKey() {
        HmacKey hmacKey = this.hmacKey_;
        return hmacKey == null ? HmacKey.getDefaultInstance() : hmacKey;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public boolean hasAesCtrKey() {
        return this.aesCtrKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public boolean hasHmacKey() {
        return this.hmacKey_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(AesCtrHmacAeadKey aesCtrHmacAeadKey) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrHmacAeadKey);
    }

    public static AesCtrHmacAeadKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrHmacAeadKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKey parseFrom(InputStream inputStream) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacAeadKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacAeadKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesCtrHmacAeadKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
