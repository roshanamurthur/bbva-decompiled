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
public final class RsaSsaPssPrivateKey extends GeneratedMessageLite<RsaSsaPssPrivateKey, Builder> implements RsaSsaPssPrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final RsaSsaPssPrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile Parser<RsaSsaPssPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString crt_;
    private ByteString d_;
    private ByteString dp_;
    private ByteString dq_;
    private ByteString p_;
    private RsaSsaPssPublicKey publicKey_;
    private ByteString q_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPssPrivateKey, Builder> implements RsaSsaPssPrivateKeyOrBuilder {
        public Builder() {
            super(RsaSsaPssPrivateKey.DEFAULT_INSTANCE);
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

        public Builder clearCrt() {
            copyOnWrite();
            RsaSsaPssPrivateKey.y((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            RsaSsaPssPrivateKey.E((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            RsaSsaPssPrivateKey.u((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            RsaSsaPssPrivateKey.w((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            RsaSsaPssPrivateKey.G((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            RsaSsaPssPrivateKey.C((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            RsaSsaPssPrivateKey.s((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            RsaSsaPssPrivateKey.z((RsaSsaPssPrivateKey) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public ByteString getCrt() {
            return ((RsaSsaPssPrivateKey) this.instance).getCrt();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public ByteString getD() {
            return ((RsaSsaPssPrivateKey) this.instance).getD();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public ByteString getDp() {
            return ((RsaSsaPssPrivateKey) this.instance).getDp();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public ByteString getDq() {
            return ((RsaSsaPssPrivateKey) this.instance).getDq();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public ByteString getP() {
            return ((RsaSsaPssPrivateKey) this.instance).getP();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public RsaSsaPssPublicKey getPublicKey() {
            return ((RsaSsaPssPrivateKey) this.instance).getPublicKey();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public ByteString getQ() {
            return ((RsaSsaPssPrivateKey) this.instance).getQ();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public int getVersion() {
            return ((RsaSsaPssPrivateKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((RsaSsaPssPrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergePublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
            copyOnWrite();
            RsaSsaPssPrivateKey.B((RsaSsaPssPrivateKey) this.instance, rsaSsaPssPublicKey);
            return this;
        }

        public Builder setCrt(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPrivateKey.x((RsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setD(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPrivateKey.D((RsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setDp(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPrivateKey.t((RsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setDq(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPrivateKey.v((RsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setP(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPrivateKey.F((RsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setPublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
            copyOnWrite();
            RsaSsaPssPrivateKey.A((RsaSsaPssPrivateKey) this.instance, rsaSsaPssPublicKey);
            return this;
        }

        public Builder setQ(ByteString byteString) {
            copyOnWrite();
            RsaSsaPssPrivateKey.r((RsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            RsaSsaPssPrivateKey.q((RsaSsaPssPrivateKey) this.instance, i10);
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

        public Builder setPublicKey(RsaSsaPssPublicKey.Builder builder) {
            copyOnWrite();
            RsaSsaPssPrivateKey.A((RsaSsaPssPrivateKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46948a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46948a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46948a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46948a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46948a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46948a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46948a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46948a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        RsaSsaPssPrivateKey rsaSsaPssPrivateKey = new RsaSsaPssPrivateKey();
        DEFAULT_INSTANCE = rsaSsaPssPrivateKey;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPssPrivateKey.class, rsaSsaPssPrivateKey);
    }

    public RsaSsaPssPrivateKey() {
        ByteString byteString = ByteString.EMPTY;
        this.d_ = byteString;
        this.p_ = byteString;
        this.q_ = byteString;
        this.dp_ = byteString;
        this.dq_ = byteString;
        this.crt_ = byteString;
    }

    public static void A(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPublicKey.getClass();
        rsaSsaPssPrivateKey.publicKey_ = rsaSsaPssPublicKey;
    }

    public static void B(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPublicKey.getClass();
        RsaSsaPssPublicKey rsaSsaPssPublicKey2 = rsaSsaPssPrivateKey.publicKey_;
        if (rsaSsaPssPublicKey2 == null || rsaSsaPssPublicKey2 == RsaSsaPssPublicKey.getDefaultInstance()) {
            rsaSsaPssPrivateKey.publicKey_ = rsaSsaPssPublicKey;
        } else {
            rsaSsaPssPrivateKey.publicKey_ = RsaSsaPssPublicKey.newBuilder(rsaSsaPssPrivateKey.publicKey_).mergeFrom(rsaSsaPssPublicKey).buildPartial();
        }
    }

    public static void C(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.publicKey_ = null;
    }

    public static void D(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, ByteString byteString) {
        rsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        rsaSsaPssPrivateKey.d_ = byteString;
    }

    public static void E(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPrivateKey.d_ = getDefaultInstance().getD();
    }

    public static void F(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, ByteString byteString) {
        rsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        rsaSsaPssPrivateKey.p_ = byteString;
    }

    public static void G(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPrivateKey.p_ = getDefaultInstance().getP();
    }

    public static RsaSsaPssPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RsaSsaPssPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, int i10) {
        rsaSsaPssPrivateKey.version_ = i10;
    }

    public static void r(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, ByteString byteString) {
        rsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        rsaSsaPssPrivateKey.q_ = byteString;
    }

    public static void s(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPrivateKey.q_ = getDefaultInstance().getQ();
    }

    public static void t(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, ByteString byteString) {
        rsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        rsaSsaPssPrivateKey.dp_ = byteString;
    }

    public static void u(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPrivateKey.dp_ = getDefaultInstance().getDp();
    }

    public static void v(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, ByteString byteString) {
        rsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        rsaSsaPssPrivateKey.dq_ = byteString;
    }

    public static void w(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPrivateKey.dq_ = getDefaultInstance().getDq();
    }

    public static void x(RsaSsaPssPrivateKey rsaSsaPssPrivateKey, ByteString byteString) {
        rsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        rsaSsaPssPrivateKey.crt_ = byteString;
    }

    public static void y(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.getClass();
        rsaSsaPssPrivateKey.crt_ = getDefaultInstance().getCrt();
    }

    public static void z(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        rsaSsaPssPrivateKey.version_ = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46948a[methodToInvoke.ordinal()]) {
            case 1:
                return new RsaSsaPssPrivateKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPssPrivateKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RsaSsaPssPrivateKey.class) {
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

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public ByteString getCrt() {
        return this.crt_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public ByteString getD() {
        return this.d_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public ByteString getDp() {
        return this.dp_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public ByteString getDq() {
        return this.dq_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public ByteString getP() {
        return this.p_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public RsaSsaPssPublicKey getPublicKey() {
        RsaSsaPssPublicKey rsaSsaPssPublicKey = this.publicKey_;
        return rsaSsaPssPublicKey == null ? RsaSsaPssPublicKey.getDefaultInstance() : rsaSsaPssPublicKey;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public ByteString getQ() {
        return this.q_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssPrivateKeyOrBuilder
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

    public static Builder newBuilder(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPssPrivateKey);
    }

    public static RsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPssPrivateKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPrivateKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPssPrivateKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
