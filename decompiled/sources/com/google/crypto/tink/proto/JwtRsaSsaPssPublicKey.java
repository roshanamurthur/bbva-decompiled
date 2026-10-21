package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class JwtRsaSsaPssPublicKey extends GeneratedMessageLite<JwtRsaSsaPssPublicKey, Builder> implements JwtRsaSsaPssPublicKeyOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 2;
    public static final int CUSTOM_KID_FIELD_NUMBER = 5;
    private static final JwtRsaSsaPssPublicKey DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    private static volatile Parser<JwtRsaSsaPssPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private CustomKid customKid_;
    private ByteString e_;
    private ByteString n_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<JwtRsaSsaPssPublicKey, Builder> implements JwtRsaSsaPssPublicKeyOrBuilder {
        public Builder() {
            super(JwtRsaSsaPssPublicKey.DEFAULT_INSTANCE);
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
            JwtRsaSsaPssPublicKey.p((JwtRsaSsaPssPublicKey) this.instance);
            return this;
        }

        public Builder clearCustomKid() {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.w((JwtRsaSsaPssPublicKey) this.instance);
            return this;
        }

        public Builder clearE() {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.t((JwtRsaSsaPssPublicKey) this.instance);
            return this;
        }

        public Builder clearN() {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.r((JwtRsaSsaPssPublicKey) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.z((JwtRsaSsaPssPublicKey) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
        public JwtRsaSsaPssAlgorithm getAlgorithm() {
            return ((JwtRsaSsaPssPublicKey) this.instance).getAlgorithm();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
        public int getAlgorithmValue() {
            return ((JwtRsaSsaPssPublicKey) this.instance).getAlgorithmValue();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
        public CustomKid getCustomKid() {
            return ((JwtRsaSsaPssPublicKey) this.instance).getCustomKid();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
        public ByteString getE() {
            return ((JwtRsaSsaPssPublicKey) this.instance).getE();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
        public ByteString getN() {
            return ((JwtRsaSsaPssPublicKey) this.instance).getN();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
        public int getVersion() {
            return ((JwtRsaSsaPssPublicKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
        public boolean hasCustomKid() {
            return ((JwtRsaSsaPssPublicKey) this.instance).hasCustomKid();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        public Builder mergeCustomKid(CustomKid customKid) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.v((JwtRsaSsaPssPublicKey) this.instance, customKid);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder setAlgorithm(JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.B((JwtRsaSsaPssPublicKey) this.instance, jwtRsaSsaPssAlgorithm);
            return this;
        }

        public Builder setAlgorithmValue(int i10) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.A((JwtRsaSsaPssPublicKey) this.instance, i10);
            return this;
        }

        public Builder setCustomKid(CustomKid customKid) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.u((JwtRsaSsaPssPublicKey) this.instance, customKid);
            return this;
        }

        public Builder setE(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.s((JwtRsaSsaPssPublicKey) this.instance, byteString);
            return this;
        }

        public Builder setN(ByteString byteString) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.q((JwtRsaSsaPssPublicKey) this.instance, byteString);
            return this;
        }

        public Builder setVersion(int i10) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.y((JwtRsaSsaPssPublicKey) this.instance, i10);
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

        public Builder setCustomKid(CustomKid.Builder builder) {
            copyOnWrite();
            JwtRsaSsaPssPublicKey.u((JwtRsaSsaPssPublicKey) this.instance, builder.build());
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

    public static final class CustomKid extends GeneratedMessageLite<CustomKid, Builder> implements CustomKidOrBuilder {
        private static final CustomKid DEFAULT_INSTANCE;
        private static volatile Parser<CustomKid> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<CustomKid, Builder> implements CustomKidOrBuilder {
            public Builder() {
                super(CustomKid.DEFAULT_INSTANCE);
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

            public Builder clearValue() {
                copyOnWrite();
                CustomKid.r((CustomKid) this.instance);
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

            @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKidOrBuilder
            public String getValue() {
                return ((CustomKid) this.instance).getValue();
            }

            @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKidOrBuilder
            public ByteString getValueBytes() {
                return ((CustomKid) this.instance).getValueBytes();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
                return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return super.mergeFrom(codedInputStream, extensionRegistryLite);
            }

            public Builder setValue(String str) {
                copyOnWrite();
                CustomKid.q((CustomKid) this.instance, str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                CustomKid.s((CustomKid) this.instance, byteString);
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

        static {
            CustomKid customKid = new CustomKid();
            DEFAULT_INSTANCE = customKid;
            GeneratedMessageLite.registerDefaultInstance(CustomKid.class, customKid);
        }

        public static CustomKid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CustomKid parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CustomKid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CustomKid> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static void q(CustomKid customKid, String str) {
            customKid.getClass();
            str.getClass();
            customKid.value_ = str;
        }

        public static void r(CustomKid customKid) {
            customKid.getClass();
            customKid.value_ = getDefaultInstance().getValue();
        }

        public static void s(CustomKid customKid, ByteString byteString) {
            customKid.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            customKid.value_ = byteString.toStringUtf8();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f46928a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CustomKid();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CustomKid> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CustomKid.class) {
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

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKidOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKidOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        public static Builder newBuilder(CustomKid customKid) {
            return DEFAULT_INSTANCE.createBuilder(customKid);
        }

        public static CustomKid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CustomKid parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CustomKid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CustomKid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CustomKid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CustomKid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CustomKid parseFrom(InputStream inputStream) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CustomKid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CustomKid parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CustomKid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CustomKidOrBuilder extends MessageLiteOrBuilder {
        String getValue();

        ByteString getValueBytes();
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46928a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46928a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46928a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46928a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46928a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46928a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46928a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46928a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = new JwtRsaSsaPssPublicKey();
        DEFAULT_INSTANCE = jwtRsaSsaPssPublicKey;
        GeneratedMessageLite.registerDefaultInstance(JwtRsaSsaPssPublicKey.class, jwtRsaSsaPssPublicKey);
    }

    public JwtRsaSsaPssPublicKey() {
        ByteString byteString = ByteString.EMPTY;
        this.n_ = byteString;
        this.e_ = byteString;
    }

    public static void A(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, int i10) {
        jwtRsaSsaPssPublicKey.algorithm_ = i10;
    }

    public static void B(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) {
        jwtRsaSsaPssPublicKey.getClass();
        jwtRsaSsaPssPublicKey.algorithm_ = jwtRsaSsaPssAlgorithm.getNumber();
    }

    public static JwtRsaSsaPssPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void p(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        jwtRsaSsaPssPublicKey.algorithm_ = 0;
    }

    public static JwtRsaSsaPssPublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<JwtRsaSsaPssPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, ByteString byteString) {
        jwtRsaSsaPssPublicKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPublicKey.n_ = byteString;
    }

    public static void r(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        jwtRsaSsaPssPublicKey.getClass();
        jwtRsaSsaPssPublicKey.n_ = getDefaultInstance().getN();
    }

    public static void s(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, ByteString byteString) {
        jwtRsaSsaPssPublicKey.getClass();
        byteString.getClass();
        jwtRsaSsaPssPublicKey.e_ = byteString;
    }

    public static void t(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        jwtRsaSsaPssPublicKey.getClass();
        jwtRsaSsaPssPublicKey.e_ = getDefaultInstance().getE();
    }

    public static void u(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, CustomKid customKid) {
        jwtRsaSsaPssPublicKey.getClass();
        customKid.getClass();
        jwtRsaSsaPssPublicKey.customKid_ = customKid;
    }

    public static void v(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, CustomKid customKid) {
        jwtRsaSsaPssPublicKey.getClass();
        customKid.getClass();
        CustomKid customKid2 = jwtRsaSsaPssPublicKey.customKid_;
        if (customKid2 == null || customKid2 == CustomKid.getDefaultInstance()) {
            jwtRsaSsaPssPublicKey.customKid_ = customKid;
        } else {
            jwtRsaSsaPssPublicKey.customKid_ = CustomKid.newBuilder(jwtRsaSsaPssPublicKey.customKid_).mergeFrom(customKid).buildPartial();
        }
    }

    public static void w(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        jwtRsaSsaPssPublicKey.customKid_ = null;
    }

    public static void y(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, int i10) {
        jwtRsaSsaPssPublicKey.version_ = i10;
    }

    public static void z(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        jwtRsaSsaPssPublicKey.version_ = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46928a[methodToInvoke.ordinal()]) {
            case 1:
                return new JwtRsaSsaPssPublicKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n\u0005\t", new Object[]{"version_", "algorithm_", "n_", "e_", "customKid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JwtRsaSsaPssPublicKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (JwtRsaSsaPssPublicKey.class) {
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
    public JwtRsaSsaPssAlgorithm getAlgorithm() {
        JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithmForNumber = JwtRsaSsaPssAlgorithm.forNumber(this.algorithm_);
        return jwtRsaSsaPssAlgorithmForNumber == null ? JwtRsaSsaPssAlgorithm.UNRECOGNIZED : jwtRsaSsaPssAlgorithmForNumber;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
    public int getAlgorithmValue() {
        return this.algorithm_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
    public CustomKid getCustomKid() {
        CustomKid customKid = this.customKid_;
        return customKid == null ? CustomKid.getDefaultInstance() : customKid;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
    public ByteString getE() {
        return this.e_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
    public ByteString getN() {
        return this.n_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPublicKeyOrBuilder
    public boolean hasCustomKid() {
        return this.customKid_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
        return DEFAULT_INSTANCE.createBuilder(jwtRsaSsaPssPublicKey);
    }

    public static JwtRsaSsaPssPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(InputStream inputStream) throws IOException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static JwtRsaSsaPssPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtRsaSsaPssPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
