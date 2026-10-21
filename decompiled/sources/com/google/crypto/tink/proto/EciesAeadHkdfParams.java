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
public final class EciesAeadHkdfParams extends GeneratedMessageLite<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
    private static final EciesAeadHkdfParams DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<EciesAeadHkdfParams> PARSER;
    private EciesAeadDemParams demParams_;
    private int ecPointFormat_;
    private EciesHkdfKemParams kemParams_;

    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
        public Builder() {
            super(EciesAeadHkdfParams.DEFAULT_INSTANCE);
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

        public Builder clearDemParams() {
            copyOnWrite();
            EciesAeadHkdfParams.v((EciesAeadHkdfParams) this.instance);
            return this;
        }

        public Builder clearEcPointFormat() {
            copyOnWrite();
            EciesAeadHkdfParams.y((EciesAeadHkdfParams) this.instance);
            return this;
        }

        public Builder clearKemParams() {
            copyOnWrite();
            EciesAeadHkdfParams.s((EciesAeadHkdfParams) this.instance);
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

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EciesAeadDemParams getDemParams() {
            return ((EciesAeadHkdfParams) this.instance).getDemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EcPointFormat getEcPointFormat() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormat();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public int getEcPointFormatValue() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormatValue();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EciesHkdfKemParams getKemParams() {
            return ((EciesAeadHkdfParams) this.instance).getKemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public boolean hasDemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasDemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public boolean hasKemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasKemParams();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        public Builder mergeDemParams(EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            EciesAeadHkdfParams.u((EciesAeadHkdfParams) this.instance, eciesAeadDemParams);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder mergeKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            EciesAeadHkdfParams.r((EciesAeadHkdfParams) this.instance, eciesHkdfKemParams);
            return this;
        }

        public Builder setDemParams(EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            EciesAeadHkdfParams.t((EciesAeadHkdfParams) this.instance, eciesAeadDemParams);
            return this;
        }

        public Builder setEcPointFormat(EcPointFormat ecPointFormat) {
            copyOnWrite();
            EciesAeadHkdfParams.x((EciesAeadHkdfParams) this.instance, ecPointFormat);
            return this;
        }

        public Builder setEcPointFormatValue(int i10) {
            copyOnWrite();
            EciesAeadHkdfParams.w((EciesAeadHkdfParams) this.instance, i10);
            return this;
        }

        public Builder setKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            EciesAeadHkdfParams.q((EciesAeadHkdfParams) this.instance, eciesHkdfKemParams);
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

        public Builder setDemParams(EciesAeadDemParams.Builder builder) {
            copyOnWrite();
            EciesAeadHkdfParams.t((EciesAeadHkdfParams) this.instance, builder.build());
            return this;
        }

        public Builder setKemParams(EciesHkdfKemParams.Builder builder) {
            copyOnWrite();
            EciesAeadHkdfParams.q((EciesAeadHkdfParams) this.instance, builder.build());
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
        public static final /* synthetic */ int[] f46888a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46888a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46888a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46888a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46888a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46888a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46888a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46888a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EciesAeadHkdfParams eciesAeadHkdfParams = new EciesAeadHkdfParams();
        DEFAULT_INSTANCE = eciesAeadHkdfParams;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfParams.class, eciesAeadHkdfParams);
    }

    public static EciesAeadHkdfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EciesAeadHkdfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(EciesAeadHkdfParams eciesAeadHkdfParams, EciesHkdfKemParams eciesHkdfKemParams) {
        eciesAeadHkdfParams.getClass();
        eciesHkdfKemParams.getClass();
        eciesAeadHkdfParams.kemParams_ = eciesHkdfKemParams;
    }

    public static void r(EciesAeadHkdfParams eciesAeadHkdfParams, EciesHkdfKemParams eciesHkdfKemParams) {
        eciesAeadHkdfParams.getClass();
        eciesHkdfKemParams.getClass();
        EciesHkdfKemParams eciesHkdfKemParams2 = eciesAeadHkdfParams.kemParams_;
        if (eciesHkdfKemParams2 == null || eciesHkdfKemParams2 == EciesHkdfKemParams.getDefaultInstance()) {
            eciesAeadHkdfParams.kemParams_ = eciesHkdfKemParams;
        } else {
            eciesAeadHkdfParams.kemParams_ = EciesHkdfKemParams.newBuilder(eciesAeadHkdfParams.kemParams_).mergeFrom(eciesHkdfKemParams).buildPartial();
        }
    }

    public static void s(EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfParams.kemParams_ = null;
    }

    public static void t(EciesAeadHkdfParams eciesAeadHkdfParams, EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadHkdfParams.getClass();
        eciesAeadDemParams.getClass();
        eciesAeadHkdfParams.demParams_ = eciesAeadDemParams;
    }

    public static void u(EciesAeadHkdfParams eciesAeadHkdfParams, EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadHkdfParams.getClass();
        eciesAeadDemParams.getClass();
        EciesAeadDemParams eciesAeadDemParams2 = eciesAeadHkdfParams.demParams_;
        if (eciesAeadDemParams2 == null || eciesAeadDemParams2 == EciesAeadDemParams.getDefaultInstance()) {
            eciesAeadHkdfParams.demParams_ = eciesAeadDemParams;
        } else {
            eciesAeadHkdfParams.demParams_ = EciesAeadDemParams.newBuilder(eciesAeadHkdfParams.demParams_).mergeFrom(eciesAeadDemParams).buildPartial();
        }
    }

    public static void v(EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfParams.demParams_ = null;
    }

    public static void w(EciesAeadHkdfParams eciesAeadHkdfParams, int i10) {
        eciesAeadHkdfParams.ecPointFormat_ = i10;
    }

    public static void x(EciesAeadHkdfParams eciesAeadHkdfParams, EcPointFormat ecPointFormat) {
        eciesAeadHkdfParams.getClass();
        eciesAeadHkdfParams.ecPointFormat_ = ecPointFormat.getNumber();
    }

    public static void y(EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfParams.ecPointFormat_ = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46888a[methodToInvoke.ordinal()]) {
            case 1:
                return new EciesAeadHkdfParams();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"kemParams_", "demParams_", "ecPointFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesAeadHkdfParams> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EciesAeadHkdfParams.class) {
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

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EciesAeadDemParams getDemParams() {
        EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        return eciesAeadDemParams == null ? EciesAeadDemParams.getDefaultInstance() : eciesAeadDemParams;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EcPointFormat getEcPointFormat() {
        EcPointFormat ecPointFormatForNumber = EcPointFormat.forNumber(this.ecPointFormat_);
        return ecPointFormatForNumber == null ? EcPointFormat.UNRECOGNIZED : ecPointFormatForNumber;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public int getEcPointFormatValue() {
        return this.ecPointFormat_;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EciesHkdfKemParams getKemParams() {
        EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        return eciesHkdfKemParams == null ? EciesHkdfKemParams.getDefaultInstance() : eciesHkdfKemParams;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public boolean hasDemParams() {
        return this.demParams_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public boolean hasKemParams() {
        return this.kemParams_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(EciesAeadHkdfParams eciesAeadHkdfParams) {
        return DEFAULT_INSTANCE.createBuilder(eciesAeadHkdfParams);
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
