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
public final class JwtRsaSsaPssPrivateKey extends GeneratedMessageLite<JwtRsaSsaPssPrivateKey, Builder> implements JwtRsaSsaPssPrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final JwtRsaSsaPssPrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile Parser<JwtRsaSsaPssPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString crt_;
    private ByteString d_;
    private ByteString dp_;
    private ByteString dq_;
    private ByteString p_;
    private JwtRsaSsaPssPublicKey publicKey_;
    private ByteString q_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<JwtRsaSsaPssPrivateKey, Builder> implements JwtRsaSsaPssPrivateKeyOrBuilder {
        public Builder() {
            super(JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE);
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
            JwtRsaSsaPssPrivateKey.y((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.E((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.u((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.w((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.G((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.C((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.s((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.z((JwtRsaSsaPssPrivateKey) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getCrt() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getCrt();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getD() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getD();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getDp() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getDp();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getDq() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getDq();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getP() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getP();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public JwtRsaSsaPssPublicKey getPublicKey() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getPublicKey();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getQ() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getQ();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public int getVersion() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergePublicKey(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.B((JwtRsaSsaPssPrivateKey) this.instance, jwtRsaSsaPssPublicKey);
            return this;
        }

        public Builder setCrt(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.x((JwtRsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setD(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.D((JwtRsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setDp(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.t((JwtRsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setDq(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.v((JwtRsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setP(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.F((JwtRsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setPublicKey(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.A((JwtRsaSsaPssPrivateKey) this.instance, jwtRsaSsaPssPublicKey);
            return this;
        }

        public Builder setQ(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.r((JwtRsaSsaPssPrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.q((JwtRsaSsaPssPrivateKey) this.instance, i10);
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

        public Builder setPublicKey(JwtRsaSsaPssPublicKey.Builder builder) {
            copyOnWrite();
            JwtRsaSsaPssPrivateKey.A((JwtRsaSsaPssPrivateKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46927a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46927a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46927a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46927a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46927a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46927a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46927a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46927a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey = new JwtRsaSsaPssPrivateKey();
        DEFAULT_INSTANCE = jwtRsaSsaPssPrivateKey;
        GeneratedMessageLite.registerDefaultInstance(JwtRsaSsaPssPrivateKey.class, jwtRsaSsaPssPrivateKey);
    }

    public JwtRsaSsaPssPrivateKey() {
        ByteString byteString = ByteString.EMPTY;
        this.d_ = byteString;
        this.p_ = byteString;
        this.q_ = byteString;
        this.dp_ = byteString;
        this.dq_ = byteString;
        this.crt_ = byteString;
    }

    public static void A(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPublicKey.getClass();
        jwtRsaSsaPssPrivateKey.publicKey_ = jwtRsaSsaPssPublicKey;
    }

    public static void B(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPublicKey.getClass();
        JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey2 = jwtRsaSsaPssPrivateKey.publicKey_;
        if (jwtRsaSsaPssPublicKey2 == null || jwtRsaSsaPssPublicKey2 == JwtRsaSsaPssPublicKey.getDefaultInstance()) {
            jwtRsaSsaPssPrivateKey.publicKey_ = jwtRsaSsaPssPublicKey;
        } else {
            jwtRsaSsaPssPrivateKey.publicKey_ = JwtRsaSsaPssPublicKey.newBuilder(jwtRsaSsaPssPrivateKey.publicKey_).mergeFrom(jwtRsaSsaPssPublicKey).buildPartial();
        }
    }

    public static void C(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.publicKey_ = null;
    }

    public static void D(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, ByteString byteString) {
        jwtRsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPrivateKey.d_ = byteString;
    }

    public static void E(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPrivateKey.d_ = getDefaultInstance().getD();
    }

    public static void F(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, ByteString byteString) {
        jwtRsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPrivateKey.p_ = byteString;
    }

    public static void G(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPrivateKey.p_ = getDefaultInstance().getP();
    }

    public static JwtRsaSsaPssPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtRsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<JwtRsaSsaPssPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, int i10) {
        jwtRsaSsaPssPrivateKey.version_ = i10;
    }

    public static void r(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, ByteString byteString) {
        jwtRsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPrivateKey.q_ = byteString;
    }

    public static void s(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPrivateKey.q_ = getDefaultInstance().getQ();
    }

    public static void t(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, ByteString byteString) {
        jwtRsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPrivateKey.dp_ = byteString;
    }

    public static void u(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPrivateKey.dp_ = getDefaultInstance().getDp();
    }

    public static void v(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, ByteString byteString) {
        jwtRsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPrivateKey.dq_ = byteString;
    }

    public static void w(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPrivateKey.dq_ = getDefaultInstance().getDq();
    }

    public static void x(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, ByteString byteString) {
        jwtRsaSsaPssPrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPrivateKey.crt_ = byteString;
    }

    public static void y(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.getClass();
        jwtRsaSsaPssPrivateKey.crt_ = getDefaultInstance().getCrt();
    }

    public static void z(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        jwtRsaSsaPssPrivateKey.version_ = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46927a[methodToInvoke.ordinal()]) {
            case 1:
                return new JwtRsaSsaPssPrivateKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JwtRsaSsaPssPrivateKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (JwtRsaSsaPssPrivateKey.class) {
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getCrt() {
        return this.crt_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getD() {
        return this.d_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getDp() {
        return this.dp_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getDq() {
        return this.dq_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getP() {
        return this.p_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public JwtRsaSsaPssPublicKey getPublicKey() {
        JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = this.publicKey_;
        return jwtRsaSsaPssPublicKey == null ? JwtRsaSsaPssPublicKey.getDefaultInstance() : jwtRsaSsaPssPublicKey;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getQ() {
        return this.q_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
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

    public static Builder newBuilder(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(jwtRsaSsaPssPrivateKey);
    }

    public static JwtRsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
