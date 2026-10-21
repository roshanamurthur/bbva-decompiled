package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class RegistryConfig extends GeneratedMessageLite<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final RegistryConfig DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile Parser<RegistryConfig> PARSER;
    private String configName_ = "";
    private Internal.ProtobufList<KeyTypeEntry> entry_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
        public Builder() {
            super(RegistryConfig.DEFAULT_INSTANCE);
        }

        public Builder addAllEntry(Iterable<? extends KeyTypeEntry> iterable) {
            copyOnWrite();
            RegistryConfig.w((RegistryConfig) this.instance, iterable);
            return this;
        }

        public Builder addEntry(KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            RegistryConfig.u((RegistryConfig) this.instance, keyTypeEntry);
            return this;
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

        public Builder clearConfigName() {
            copyOnWrite();
            RegistryConfig.r((RegistryConfig) this.instance);
            return this;
        }

        public Builder clearEntry() {
            copyOnWrite();
            RegistryConfig.x((RegistryConfig) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public String getConfigName() {
            return ((RegistryConfig) this.instance).getConfigName();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public ByteString getConfigNameBytes() {
            return ((RegistryConfig) this.instance).getConfigNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public KeyTypeEntry getEntry(int i10) {
            return ((RegistryConfig) this.instance).getEntry(i10);
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public int getEntryCount() {
            return ((RegistryConfig) this.instance).getEntryCount();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public List<KeyTypeEntry> getEntryList() {
            return Collections.unmodifiableList(((RegistryConfig) this.instance).getEntryList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder removeEntry(int i10) {
            copyOnWrite();
            RegistryConfig.y((RegistryConfig) this.instance, i10);
            return this;
        }

        public Builder setConfigName(String str) {
            copyOnWrite();
            RegistryConfig.q((RegistryConfig) this.instance, str);
            return this;
        }

        public Builder setConfigNameBytes(ByteString byteString) {
            copyOnWrite();
            RegistryConfig.s((RegistryConfig) this.instance, byteString);
            return this;
        }

        public Builder setEntry(int i10, KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            RegistryConfig.t((RegistryConfig) this.instance, i10, keyTypeEntry);
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

        public Builder addEntry(int i10, KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            RegistryConfig.v((RegistryConfig) this.instance, i10, keyTypeEntry);
            return this;
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

        public Builder setEntry(int i10, KeyTypeEntry.Builder builder) {
            copyOnWrite();
            RegistryConfig.t((RegistryConfig) this.instance, i10, builder.build());
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return super.mergeFrom(byteString);
        }

        public Builder addEntry(KeyTypeEntry.Builder builder) {
            copyOnWrite();
            RegistryConfig.u((RegistryConfig) this.instance, builder.build());
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return super.mergeFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream) throws IOException {
            return super.mergeFrom(codedInputStream);
        }

        public Builder addEntry(int i10, KeyTypeEntry.Builder builder) {
            copyOnWrite();
            RegistryConfig.v((RegistryConfig) this.instance, i10, builder.build());
            return this;
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
        public static final /* synthetic */ int[] f46941a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46941a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46941a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46941a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46941a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46941a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46941a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46941a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        RegistryConfig registryConfig = new RegistryConfig();
        DEFAULT_INSTANCE = registryConfig;
        GeneratedMessageLite.registerDefaultInstance(RegistryConfig.class, registryConfig);
    }

    public static RegistryConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RegistryConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RegistryConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RegistryConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(RegistryConfig registryConfig, String str) {
        registryConfig.getClass();
        str.getClass();
        registryConfig.configName_ = str;
    }

    public static void r(RegistryConfig registryConfig) {
        registryConfig.getClass();
        registryConfig.configName_ = getDefaultInstance().getConfigName();
    }

    public static void s(RegistryConfig registryConfig, ByteString byteString) {
        registryConfig.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        registryConfig.configName_ = byteString.toStringUtf8();
    }

    public static void t(RegistryConfig registryConfig, int i10, KeyTypeEntry keyTypeEntry) {
        registryConfig.getClass();
        keyTypeEntry.getClass();
        registryConfig.z();
        registryConfig.entry_.set(i10, keyTypeEntry);
    }

    public static void u(RegistryConfig registryConfig, KeyTypeEntry keyTypeEntry) {
        registryConfig.getClass();
        keyTypeEntry.getClass();
        registryConfig.z();
        registryConfig.entry_.add(keyTypeEntry);
    }

    public static void v(RegistryConfig registryConfig, int i10, KeyTypeEntry keyTypeEntry) {
        registryConfig.getClass();
        keyTypeEntry.getClass();
        registryConfig.z();
        registryConfig.entry_.add(i10, keyTypeEntry);
    }

    public static void w(RegistryConfig registryConfig, Iterable iterable) {
        registryConfig.z();
        AbstractMessageLite.addAll(iterable, (List) registryConfig.entry_);
    }

    public static void x(RegistryConfig registryConfig) {
        registryConfig.getClass();
        registryConfig.entry_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void y(RegistryConfig registryConfig, int i10) {
        registryConfig.z();
        registryConfig.entry_.remove(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46941a[methodToInvoke.ordinal()]) {
            case 1:
                return new RegistryConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", KeyTypeEntry.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RegistryConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RegistryConfig.class) {
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

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public String getConfigName() {
        return this.configName_;
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public ByteString getConfigNameBytes() {
        return ByteString.copyFromUtf8(this.configName_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public KeyTypeEntry getEntry(int i10) {
        return this.entry_.get(i10);
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public int getEntryCount() {
        return this.entry_.size();
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public List<KeyTypeEntry> getEntryList() {
        return this.entry_;
    }

    public KeyTypeEntryOrBuilder getEntryOrBuilder(int i10) {
        return this.entry_.get(i10);
    }

    public List<? extends KeyTypeEntryOrBuilder> getEntryOrBuilderList() {
        return this.entry_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public final void z() {
        Internal.ProtobufList<KeyTypeEntry> protobufList = this.entry_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.entry_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Builder newBuilder(RegistryConfig registryConfig) {
        return DEFAULT_INSTANCE.createBuilder(registryConfig);
    }

    public static RegistryConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RegistryConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RegistryConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(InputStream inputStream) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RegistryConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RegistryConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
