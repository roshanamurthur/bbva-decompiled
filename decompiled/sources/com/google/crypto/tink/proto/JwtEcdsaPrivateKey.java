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
public final class JwtEcdsaPrivateKey extends GeneratedMessageLite<JwtEcdsaPrivateKey, Builder> implements JwtEcdsaPrivateKeyOrBuilder {
    private static final JwtEcdsaPrivateKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<JwtEcdsaPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private JwtEcdsaPublicKey publicKey_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<JwtEcdsaPrivateKey, Builder> implements JwtEcdsaPrivateKeyOrBuilder {
        public Builder() {
            super(JwtEcdsaPrivateKey.DEFAULT_INSTANCE);
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
            JwtEcdsaPrivateKey.w((JwtEcdsaPrivateKey) this.instance);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            JwtEcdsaPrivateKey.u((JwtEcdsaPrivateKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            JwtEcdsaPrivateKey.r((JwtEcdsaPrivateKey) this.instance);
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

        @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
        public ByteString getKeyValue() {
            return ((JwtEcdsaPrivateKey) this.instance).getKeyValue();
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
        public JwtEcdsaPublicKey getPublicKey() {
            return ((JwtEcdsaPrivateKey) this.instance).getPublicKey();
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
        public int getVersion() {
            return ((JwtEcdsaPrivateKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((JwtEcdsaPrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergePublicKey(JwtEcdsaPublicKey jwtEcdsaPublicKey) {
            copyOnWrite();
            JwtEcdsaPrivateKey.t((JwtEcdsaPrivateKey) this.instance, jwtEcdsaPublicKey);
            return this;
        }

        public Builder setKeyValue(ByteString byteString) {
            copyOnWrite();
            JwtEcdsaPrivateKey.v((JwtEcdsaPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setPublicKey(JwtEcdsaPublicKey jwtEcdsaPublicKey) {
            copyOnWrite();
            JwtEcdsaPrivateKey.s((JwtEcdsaPrivateKey) this.instance, jwtEcdsaPublicKey);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            JwtEcdsaPrivateKey.q((JwtEcdsaPrivateKey) this.instance, i10);
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

        public Builder setPublicKey(JwtEcdsaPublicKey.Builder builder) {
            copyOnWrite();
            JwtEcdsaPrivateKey.s((JwtEcdsaPrivateKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46916a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46916a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46916a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46916a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46916a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46916a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46916a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46916a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        JwtEcdsaPrivateKey jwtEcdsaPrivateKey = new JwtEcdsaPrivateKey();
        DEFAULT_INSTANCE = jwtEcdsaPrivateKey;
        GeneratedMessageLite.registerDefaultInstance(JwtEcdsaPrivateKey.class, jwtEcdsaPrivateKey);
    }

    public static JwtEcdsaPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtEcdsaPrivateKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtEcdsaPrivateKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<JwtEcdsaPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(JwtEcdsaPrivateKey jwtEcdsaPrivateKey, int i10) {
        jwtEcdsaPrivateKey.version_ = i10;
    }

    public static void r(JwtEcdsaPrivateKey jwtEcdsaPrivateKey) {
        jwtEcdsaPrivateKey.version_ = 0;
    }

    public static void s(JwtEcdsaPrivateKey jwtEcdsaPrivateKey, JwtEcdsaPublicKey jwtEcdsaPublicKey) {
        jwtEcdsaPrivateKey.getClass();
        jwtEcdsaPublicKey.getClass();
        jwtEcdsaPrivateKey.publicKey_ = jwtEcdsaPublicKey;
    }

    public static void t(JwtEcdsaPrivateKey jwtEcdsaPrivateKey, JwtEcdsaPublicKey jwtEcdsaPublicKey) {
        jwtEcdsaPrivateKey.getClass();
        jwtEcdsaPublicKey.getClass();
        JwtEcdsaPublicKey jwtEcdsaPublicKey2 = jwtEcdsaPrivateKey.publicKey_;
        if (jwtEcdsaPublicKey2 == null || jwtEcdsaPublicKey2 == JwtEcdsaPublicKey.getDefaultInstance()) {
            jwtEcdsaPrivateKey.publicKey_ = jwtEcdsaPublicKey;
        } else {
            jwtEcdsaPrivateKey.publicKey_ = JwtEcdsaPublicKey.newBuilder(jwtEcdsaPrivateKey.publicKey_).mergeFrom(jwtEcdsaPublicKey).buildPartial();
        }
    }

    public static void u(JwtEcdsaPrivateKey jwtEcdsaPrivateKey) {
        jwtEcdsaPrivateKey.publicKey_ = null;
    }

    public static void v(JwtEcdsaPrivateKey jwtEcdsaPrivateKey, ByteString byteString) {
        jwtEcdsaPrivateKey.getClass();
        byteString.getClass();
        jwtEcdsaPrivateKey.keyValue_ = byteString;
    }

    public static void w(JwtEcdsaPrivateKey jwtEcdsaPrivateKey) {
        jwtEcdsaPrivateKey.getClass();
        jwtEcdsaPrivateKey.keyValue_ = getDefaultInstance().getKeyValue();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46916a[methodToInvoke.ordinal()]) {
            case 1:
                return new JwtEcdsaPrivateKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "publicKey_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JwtEcdsaPrivateKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (JwtEcdsaPrivateKey.class) {
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

    @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
    public JwtEcdsaPublicKey getPublicKey() {
        JwtEcdsaPublicKey jwtEcdsaPublicKey = this.publicKey_;
        return jwtEcdsaPublicKey == null ? JwtEcdsaPublicKey.getDefaultInstance() : jwtEcdsaPublicKey;
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(JwtEcdsaPrivateKey jwtEcdsaPrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(jwtEcdsaPrivateKey);
    }

    public static JwtEcdsaPrivateKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtEcdsaPrivateKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static JwtEcdsaPrivateKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static JwtEcdsaPrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static JwtEcdsaPrivateKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtEcdsaPrivateKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static JwtEcdsaPrivateKey parseFrom(InputStream inputStream) throws IOException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtEcdsaPrivateKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtEcdsaPrivateKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static JwtEcdsaPrivateKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtEcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
