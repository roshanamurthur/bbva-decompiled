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
public final class EcdsaPublicKey extends GeneratedMessageLite<EcdsaPublicKey, Builder> implements EcdsaPublicKeyOrBuilder {
    private static final EcdsaPublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<EcdsaPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private EcdsaParams params_;
    private int version_;
    private ByteString x_;
    private ByteString y_;

    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaPublicKey, Builder> implements EcdsaPublicKeyOrBuilder {
        public Builder() {
            super(EcdsaPublicKey.DEFAULT_INSTANCE);
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

        public Builder clearParams() {
            copyOnWrite();
            EcdsaPublicKey.u((EcdsaPublicKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            EcdsaPublicKey.r((EcdsaPublicKey) this.instance);
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            EcdsaPublicKey.w((EcdsaPublicKey) this.instance);
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            EcdsaPublicKey.y((EcdsaPublicKey) this.instance);
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

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public EcdsaParams getParams() {
            return ((EcdsaPublicKey) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public int getVersion() {
            return ((EcdsaPublicKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public ByteString getX() {
            return ((EcdsaPublicKey) this.instance).getX();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public ByteString getY() {
            return ((EcdsaPublicKey) this.instance).getY();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public boolean hasParams() {
            return ((EcdsaPublicKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeParams(EcdsaParams ecdsaParams) {
            copyOnWrite();
            EcdsaPublicKey.t((EcdsaPublicKey) this.instance, ecdsaParams);
            return this;
        }

        public Builder setParams(EcdsaParams ecdsaParams) {
            copyOnWrite();
            EcdsaPublicKey.s((EcdsaPublicKey) this.instance, ecdsaParams);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            EcdsaPublicKey.q((EcdsaPublicKey) this.instance, i10);
            return this;
        }

        public Builder setX(ByteString byteString) {
            copyOnWrite();
            EcdsaPublicKey.v((EcdsaPublicKey) this.instance, byteString);
            return this;
        }

        public Builder setY(ByteString byteString) {
            copyOnWrite();
            EcdsaPublicKey.x((EcdsaPublicKey) this.instance, byteString);
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

        public Builder setParams(EcdsaParams.Builder builder) {
            copyOnWrite();
            EcdsaPublicKey.s((EcdsaPublicKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46884a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46884a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46884a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46884a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46884a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46884a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46884a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46884a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EcdsaPublicKey ecdsaPublicKey = new EcdsaPublicKey();
        DEFAULT_INSTANCE = ecdsaPublicKey;
        GeneratedMessageLite.registerDefaultInstance(EcdsaPublicKey.class, ecdsaPublicKey);
    }

    public EcdsaPublicKey() {
        ByteString byteString = ByteString.EMPTY;
        this.x_ = byteString;
        this.y_ = byteString;
    }

    public static EcdsaPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EcdsaPublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaPublicKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EcdsaPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(EcdsaPublicKey ecdsaPublicKey, int i10) {
        ecdsaPublicKey.version_ = i10;
    }

    public static void r(EcdsaPublicKey ecdsaPublicKey) {
        ecdsaPublicKey.version_ = 0;
    }

    public static void s(EcdsaPublicKey ecdsaPublicKey, EcdsaParams ecdsaParams) {
        ecdsaPublicKey.getClass();
        ecdsaParams.getClass();
        ecdsaPublicKey.params_ = ecdsaParams;
    }

    public static void t(EcdsaPublicKey ecdsaPublicKey, EcdsaParams ecdsaParams) {
        ecdsaPublicKey.getClass();
        ecdsaParams.getClass();
        EcdsaParams ecdsaParams2 = ecdsaPublicKey.params_;
        if (ecdsaParams2 == null || ecdsaParams2 == EcdsaParams.getDefaultInstance()) {
            ecdsaPublicKey.params_ = ecdsaParams;
        } else {
            ecdsaPublicKey.params_ = EcdsaParams.newBuilder(ecdsaPublicKey.params_).mergeFrom(ecdsaParams).buildPartial();
        }
    }

    public static void u(EcdsaPublicKey ecdsaPublicKey) {
        ecdsaPublicKey.params_ = null;
    }

    public static void v(EcdsaPublicKey ecdsaPublicKey, ByteString byteString) {
        ecdsaPublicKey.getClass();
        byteString.getClass();
        ecdsaPublicKey.x_ = byteString;
    }

    public static void w(EcdsaPublicKey ecdsaPublicKey) {
        ecdsaPublicKey.getClass();
        ecdsaPublicKey.x_ = getDefaultInstance().getX();
    }

    public static void x(EcdsaPublicKey ecdsaPublicKey, ByteString byteString) {
        ecdsaPublicKey.getClass();
        byteString.getClass();
        ecdsaPublicKey.y_ = byteString;
    }

    public static void y(EcdsaPublicKey ecdsaPublicKey) {
        ecdsaPublicKey.getClass();
        ecdsaPublicKey.y_ = getDefaultInstance().getY();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46884a[methodToInvoke.ordinal()]) {
            case 1:
                return new EcdsaPublicKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EcdsaPublicKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EcdsaPublicKey.class) {
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

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public EcdsaParams getParams() {
        EcdsaParams ecdsaParams = this.params_;
        return ecdsaParams == null ? EcdsaParams.getDefaultInstance() : ecdsaParams;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public ByteString getX() {
        return this.x_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public ByteString getY() {
        return this.y_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
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

    public static Builder newBuilder(EcdsaPublicKey ecdsaPublicKey) {
        return DEFAULT_INSTANCE.createBuilder(ecdsaPublicKey);
    }

    public static EcdsaPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EcdsaPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EcdsaPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(InputStream inputStream) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EcdsaPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
