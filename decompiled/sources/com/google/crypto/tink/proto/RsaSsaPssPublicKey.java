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
public final class RsaSsaPssPublicKey extends GeneratedMessageLite<RsaSsaPssPublicKey, Builder> implements RsaSsaPssPublicKeyOrBuilder {
    private static final RsaSsaPssPublicKey DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<RsaSsaPssPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString e_;
    private ByteString n_;
    private RsaSsaPssParams params_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPssPublicKey, Builder> implements RsaSsaPssPublicKeyOrBuilder {
        public Builder() {
            super(RsaSsaPssPublicKey.DEFAULT_INSTANCE);
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

        public Builder clearE() {
            copyOnWrite();
            RsaSsaPssPublicKey.y((RsaSsaPssPublicKey) this.instance);
            return this;
        }

        public Builder clearN() {
            copyOnWrite();
            RsaSsaPssPublicKey.w((RsaSsaPssPublicKey) this.instance);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            RsaSsaPssPublicKey.u((RsaSsaPssPublicKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            RsaSsaPssPublicKey.r((RsaSsaPssPublicKey) this.instance);
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

        @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
        public ByteString getE() {
            return ((RsaSsaPssPublicKey) this.instance).getE();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
        public ByteString getN() {
            return ((RsaSsaPssPublicKey) this.instance).getN();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
        public RsaSsaPssParams getParams() {
            return ((RsaSsaPssPublicKey) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
        public int getVersion() {
            return ((RsaSsaPssPublicKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
        public boolean hasParams() {
            return ((RsaSsaPssPublicKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeParams(RsaSsaPssParams rsaSsaPssParams) {
            copyOnWrite();
            RsaSsaPssPublicKey.t((RsaSsaPssPublicKey) this.instance, rsaSsaPssParams);
            return this;
        }

        public Builder setE(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPublicKey.x((RsaSsaPssPublicKey) this.instance, byteString);
            return this;
        }

        public Builder setN(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPublicKey.v((RsaSsaPssPublicKey) this.instance, byteString);
            return this;
        }

        public Builder setParams(RsaSsaPssParams rsaSsaPssParams) {
            copyOnWrite();
            RsaSsaPssPublicKey.s((RsaSsaPssPublicKey) this.instance, rsaSsaPssParams);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            RsaSsaPssPublicKey.q((RsaSsaPssPublicKey) this.instance, i10);
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

        public Builder setParams(RsaSsaPssParams.Builder builder) {
            copyOnWrite();
            RsaSsaPssPublicKey.s((RsaSsaPssPublicKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46949a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46949a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46949a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46949a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46949a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46949a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46949a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46949a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        RsaSsaPssPublicKey rsaSsaPssPublicKey = new RsaSsaPssPublicKey();
        DEFAULT_INSTANCE = rsaSsaPssPublicKey;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPssPublicKey.class, rsaSsaPssPublicKey);
    }

    public RsaSsaPssPublicKey() {
        ByteString byteString = ByteString.EMPTY;
        this.n_ = byteString;
        this.e_ = byteString;
    }

    public static RsaSsaPssPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RsaSsaPssPublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPublicKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RsaSsaPssPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(RsaSsaPssPublicKey rsaSsaPssPublicKey, int i10) {
        rsaSsaPssPublicKey.version_ = i10;
    }

    public static void r(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.version_ = 0;
    }

    public static void s(RsaSsaPssPublicKey rsaSsaPssPublicKey, RsaSsaPssParams rsaSsaPssParams) {
        rsaSsaPssPublicKey.getClass();
        rsaSsaPssParams.getClass();
        rsaSsaPssPublicKey.params_ = rsaSsaPssParams;
    }

    public static void t(RsaSsaPssPublicKey rsaSsaPssPublicKey, RsaSsaPssParams rsaSsaPssParams) {
        rsaSsaPssPublicKey.getClass();
        rsaSsaPssParams.getClass();
        RsaSsaPssParams rsaSsaPssParams2 = rsaSsaPssPublicKey.params_;
        if (rsaSsaPssParams2 == null || rsaSsaPssParams2 == RsaSsaPssParams.getDefaultInstance()) {
            rsaSsaPssPublicKey.params_ = rsaSsaPssParams;
        } else {
            rsaSsaPssPublicKey.params_ = RsaSsaPssParams.newBuilder(rsaSsaPssPublicKey.params_).mergeFrom(rsaSsaPssParams).buildPartial();
        }
    }

    public static void u(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.params_ = null;
    }

    public static void v(RsaSsaPssPublicKey rsaSsaPssPublicKey, ByteString byteString) {
        rsaSsaPssPublicKey.getClass();
        byteString.getClass();
        rsaSsaPssPublicKey.n_ = byteString;
    }

    public static void w(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.getClass();
        rsaSsaPssPublicKey.n_ = getDefaultInstance().getN();
    }

    public static void x(RsaSsaPssPublicKey rsaSsaPssPublicKey, ByteString byteString) {
        rsaSsaPssPublicKey.getClass();
        byteString.getClass();
        rsaSsaPssPublicKey.e_ = byteString;
    }

    public static void y(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.getClass();
        rsaSsaPssPublicKey.e_ = getDefaultInstance().getE();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46949a[methodToInvoke.ordinal()]) {
            case 1:
                return new RsaSsaPssPublicKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "n_", "e_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPssPublicKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RsaSsaPssPublicKey.class) {
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

    @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
    public ByteString getE() {
        return this.e_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
    public ByteString getN() {
        return this.n_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
    public RsaSsaPssParams getParams() {
        RsaSsaPssParams rsaSsaPssParams = this.params_;
        return rsaSsaPssParams == null ? RsaSsaPssParams.getDefaultInstance() : rsaSsaPssParams;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPublicKeyOrBuilder
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

    public static Builder newBuilder(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPssPublicKey);
    }

    public static RsaSsaPssPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssPublicKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPssPublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPssPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPssPublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPssPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RsaSsaPssPublicKey parseFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssPublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPssPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
