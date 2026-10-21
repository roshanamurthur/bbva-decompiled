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
public final class JwtRsaSsaPkcs1PrivateKey extends GeneratedMessageLite<JwtRsaSsaPkcs1PrivateKey, Builder> implements JwtRsaSsaPkcs1PrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final JwtRsaSsaPkcs1PrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile Parser<JwtRsaSsaPkcs1PrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString crt_;
    private ByteString d_;
    private ByteString dp_;
    private ByteString dq_;
    private ByteString p_;
    private JwtRsaSsaPkcs1PublicKey publicKey_;
    private ByteString q_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<JwtRsaSsaPkcs1PrivateKey, Builder> implements JwtRsaSsaPkcs1PrivateKeyOrBuilder {
        public Builder() {
            super(JwtRsaSsaPkcs1PrivateKey.DEFAULT_INSTANCE);
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
            JwtRsaSsaPkcs1PrivateKey.y((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.E((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.u((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.w((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.G((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.C((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.s((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.z((JwtRsaSsaPkcs1PrivateKey) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getCrt() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getCrt();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getD() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getD();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDp() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getDp();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDq() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getDq();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getP() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getP();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public JwtRsaSsaPkcs1PublicKey getPublicKey() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getPublicKey();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getQ() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getQ();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public int getVersion() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((JwtRsaSsaPkcs1PrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergePublicKey(JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.B((JwtRsaSsaPkcs1PrivateKey) this.instance, jwtRsaSsaPkcs1PublicKey);
            return this;
        }

        public Builder setCrt(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.x((JwtRsaSsaPkcs1PrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setD(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.D((JwtRsaSsaPkcs1PrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setDp(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.t((JwtRsaSsaPkcs1PrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setDq(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.v((JwtRsaSsaPkcs1PrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setP(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.F((JwtRsaSsaPkcs1PrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setPublicKey(JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.A((JwtRsaSsaPkcs1PrivateKey) this.instance, jwtRsaSsaPkcs1PublicKey);
            return this;
        }

        public Builder setQ(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.r((JwtRsaSsaPkcs1PrivateKey) this.instance, byteString);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.q((JwtRsaSsaPkcs1PrivateKey) this.instance, i10);
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

        public Builder setPublicKey(JwtRsaSsaPkcs1PublicKey.Builder builder) {
            copyOnWrite();
            JwtRsaSsaPkcs1PrivateKey.A((JwtRsaSsaPkcs1PrivateKey) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46923a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46923a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46923a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46923a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46923a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46923a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46923a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46923a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey = new JwtRsaSsaPkcs1PrivateKey();
        DEFAULT_INSTANCE = jwtRsaSsaPkcs1PrivateKey;
        GeneratedMessageLite.registerDefaultInstance(JwtRsaSsaPkcs1PrivateKey.class, jwtRsaSsaPkcs1PrivateKey);
    }

    public JwtRsaSsaPkcs1PrivateKey() {
        ByteString byteString = ByteString.EMPTY;
        this.d_ = byteString;
        this.p_ = byteString;
        this.q_ = byteString;
        this.dp_ = byteString;
        this.dq_ = byteString;
        this.crt_ = byteString;
    }

    public static void A(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PublicKey.getClass();
        jwtRsaSsaPkcs1PrivateKey.publicKey_ = jwtRsaSsaPkcs1PublicKey;
    }

    public static void B(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PublicKey.getClass();
        JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey2 = jwtRsaSsaPkcs1PrivateKey.publicKey_;
        if (jwtRsaSsaPkcs1PublicKey2 == null || jwtRsaSsaPkcs1PublicKey2 == JwtRsaSsaPkcs1PublicKey.getDefaultInstance()) {
            jwtRsaSsaPkcs1PrivateKey.publicKey_ = jwtRsaSsaPkcs1PublicKey;
        } else {
            jwtRsaSsaPkcs1PrivateKey.publicKey_ = JwtRsaSsaPkcs1PublicKey.newBuilder(jwtRsaSsaPkcs1PrivateKey.publicKey_).mergeFrom(jwtRsaSsaPkcs1PublicKey).buildPartial();
        }
    }

    public static void C(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.publicKey_ = null;
    }

    public static void D(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, ByteString byteString) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPkcs1PrivateKey.d_ = byteString;
    }

    public static void E(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PrivateKey.d_ = getDefaultInstance().getD();
    }

    public static void F(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, ByteString byteString) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPkcs1PrivateKey.p_ = byteString;
    }

    public static void G(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PrivateKey.p_ = getDefaultInstance().getP();
    }

    public static JwtRsaSsaPkcs1PrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtRsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<JwtRsaSsaPkcs1PrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, int i10) {
        jwtRsaSsaPkcs1PrivateKey.version_ = i10;
    }

    public static void r(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, ByteString byteString) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPkcs1PrivateKey.q_ = byteString;
    }

    public static void s(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PrivateKey.q_ = getDefaultInstance().getQ();
    }

    public static void t(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, ByteString byteString) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPkcs1PrivateKey.dp_ = byteString;
    }

    public static void u(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PrivateKey.dp_ = getDefaultInstance().getDp();
    }

    public static void v(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, ByteString byteString) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPkcs1PrivateKey.dq_ = byteString;
    }

    public static void w(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PrivateKey.dq_ = getDefaultInstance().getDq();
    }

    public static void x(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, ByteString byteString) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        byteString.getClass();
        jwtRsaSsaPkcs1PrivateKey.crt_ = byteString;
    }

    public static void y(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.getClass();
        jwtRsaSsaPkcs1PrivateKey.crt_ = getDefaultInstance().getCrt();
    }

    public static void z(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        jwtRsaSsaPkcs1PrivateKey.version_ = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46923a[methodToInvoke.ordinal()]) {
            case 1:
                return new JwtRsaSsaPkcs1PrivateKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JwtRsaSsaPkcs1PrivateKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (JwtRsaSsaPkcs1PrivateKey.class) {
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getCrt() {
        return this.crt_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getD() {
        return this.d_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getDp() {
        return this.dp_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getDq() {
        return this.dq_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getP() {
        return this.p_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public JwtRsaSsaPkcs1PublicKey getPublicKey() {
        JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey = this.publicKey_;
        return jwtRsaSsaPkcs1PublicKey == null ? JwtRsaSsaPkcs1PublicKey.getDefaultInstance() : jwtRsaSsaPkcs1PublicKey;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getQ() {
        return this.q_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKeyOrBuilder
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

    public static Builder newBuilder(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(jwtRsaSsaPkcs1PrivateKey);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static JwtRsaSsaPkcs1PrivateKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
