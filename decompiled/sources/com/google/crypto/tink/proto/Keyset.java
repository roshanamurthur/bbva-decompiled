package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Keyset extends GeneratedMessageLite<Keyset, Builder> implements KeysetOrBuilder {
    private static final Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Parser<Keyset> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Key> key_ = GeneratedMessageLite.emptyProtobufList();
    private int primaryKeyId_;

    public static final class Builder extends GeneratedMessageLite.Builder<Keyset, Builder> implements KeysetOrBuilder {
        public Builder() {
            super(Keyset.DEFAULT_INSTANCE);
        }

        public Builder addAllKey(Iterable<? extends Key> iterable) {
            copyOnWrite();
            Keyset.v((Keyset) this.instance, iterable);
            return this;
        }

        public Builder addKey(Key key) {
            copyOnWrite();
            Keyset.t((Keyset) this.instance, key);
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

        public Builder clearKey() {
            copyOnWrite();
            Keyset.w((Keyset) this.instance);
            return this;
        }

        public Builder clearPrimaryKeyId() {
            copyOnWrite();
            Keyset.r((Keyset) this.instance);
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

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public Key getKey(int i10) {
            return ((Keyset) this.instance).getKey(i10);
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public int getKeyCount() {
            return ((Keyset) this.instance).getKeyCount();
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public List<Key> getKeyList() {
            return Collections.unmodifiableList(((Keyset) this.instance).getKeyList());
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public int getPrimaryKeyId() {
            return ((Keyset) this.instance).getPrimaryKeyId();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder removeKey(int i10) {
            copyOnWrite();
            Keyset.x((Keyset) this.instance, i10);
            return this;
        }

        public Builder setKey(int i10, Key key) {
            copyOnWrite();
            Keyset.s((Keyset) this.instance, i10, key);
            return this;
        }

        public Builder setPrimaryKeyId(int i10) {
            copyOnWrite();
            Keyset.q((Keyset) this.instance, i10);
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

        public Builder addKey(int i10, Key key) {
            copyOnWrite();
            Keyset.u((Keyset) this.instance, i10, key);
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

        public Builder setKey(int i10, Key.Builder builder) {
            copyOnWrite();
            Keyset.s((Keyset) this.instance, i10, builder.build());
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return super.mergeFrom(byteString);
        }

        public Builder addKey(Key.Builder builder) {
            copyOnWrite();
            Keyset.t((Keyset) this.instance, builder.build());
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

        public Builder addKey(int i10, Key.Builder builder) {
            copyOnWrite();
            Keyset.u((Keyset) this.instance, i10, builder.build());
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

    public static final class Key extends GeneratedMessageLite<Key, Builder> implements KeyOrBuilder {
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser<Key> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class Builder extends GeneratedMessageLite.Builder<Key, Builder> implements KeyOrBuilder {
            public Builder() {
                super(Key.DEFAULT_INSTANCE);
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

            public Builder clearKeyData() {
                copyOnWrite();
                Key.u((Key) this.instance);
                return this;
            }

            public Builder clearKeyId() {
                copyOnWrite();
                Key.z((Key) this.instance);
                return this;
            }

            public Builder clearOutputPrefixType() {
                copyOnWrite();
                Key.s((Key) this.instance);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                Key.x((Key) this.instance);
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

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public KeyData getKeyData() {
                return ((Key) this.instance).getKeyData();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getKeyId() {
                return ((Key) this.instance).getKeyId();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public OutputPrefixType getOutputPrefixType() {
                return ((Key) this.instance).getOutputPrefixType();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getOutputPrefixTypeValue() {
                return ((Key) this.instance).getOutputPrefixTypeValue();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public KeyStatusType getStatus() {
                return ((Key) this.instance).getStatus();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getStatusValue() {
                return ((Key) this.instance).getStatusValue();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public boolean hasKeyData() {
                return ((Key) this.instance).hasKeyData();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
                return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
            public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return super.mergeFrom(codedInputStream, extensionRegistryLite);
            }

            public Builder mergeKeyData(KeyData keyData) {
                copyOnWrite();
                Key.t((Key) this.instance, keyData);
                return this;
            }

            public Builder setKeyData(KeyData keyData) {
                copyOnWrite();
                Key.q((Key) this.instance, keyData);
                return this;
            }

            public Builder setKeyId(int i10) {
                copyOnWrite();
                Key.y(i10, (Key) this.instance);
                return this;
            }

            public Builder setOutputPrefixType(OutputPrefixType outputPrefixType) {
                copyOnWrite();
                Key.r((Key) this.instance, outputPrefixType);
                return this;
            }

            public Builder setOutputPrefixTypeValue(int i10) {
                copyOnWrite();
                Key.A(i10, (Key) this.instance);
                return this;
            }

            public Builder setStatus(KeyStatusType keyStatusType) {
                copyOnWrite();
                Key.w((Key) this.instance, keyStatusType);
                return this;
            }

            public Builder setStatusValue(int i10) {
                copyOnWrite();
                Key.v(i10, (Key) this.instance);
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

            public Builder setKeyData(KeyData.Builder builder) {
                copyOnWrite();
                Key.q((Key) this.instance, builder.build());
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

        static {
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            GeneratedMessageLite.registerDefaultInstance(Key.class, key);
        }

        public static void A(int i10, Key key) {
            key.outputPrefixType_ = i10;
        }

        public static Key getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Key parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Key> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static void q(Key key, KeyData keyData) {
            key.getClass();
            keyData.getClass();
            key.keyData_ = keyData;
        }

        public static void r(Key key, OutputPrefixType outputPrefixType) {
            key.getClass();
            key.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public static void s(Key key) {
            key.outputPrefixType_ = 0;
        }

        public static void t(Key key, KeyData keyData) {
            key.getClass();
            keyData.getClass();
            KeyData keyData2 = key.keyData_;
            if (keyData2 == null || keyData2 == KeyData.getDefaultInstance()) {
                key.keyData_ = keyData;
            } else {
                key.keyData_ = KeyData.newBuilder(key.keyData_).mergeFrom(keyData).buildPartial();
            }
        }

        public static void u(Key key) {
            key.keyData_ = null;
        }

        public static void v(int i10, Key key) {
            key.status_ = i10;
        }

        public static void w(Key key, KeyStatusType keyStatusType) {
            key.getClass();
            key.status_ = keyStatusType.getNumber();
        }

        public static void x(Key key) {
            key.status_ = 0;
        }

        public static void y(int i10, Key key) {
            key.keyId_ = i10;
        }

        public static void z(Key key) {
            key.keyId_ = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f46934a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Key();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Key> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Key.class) {
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

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public KeyData getKeyData() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.getDefaultInstance() : keyData;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getKeyId() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public OutputPrefixType getOutputPrefixType() {
            OutputPrefixType outputPrefixTypeForNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            return outputPrefixTypeForNumber == null ? OutputPrefixType.UNRECOGNIZED : outputPrefixTypeForNumber;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public KeyStatusType getStatus() {
            KeyStatusType keyStatusTypeForNumber = KeyStatusType.forNumber(this.status_);
            return keyStatusTypeForNumber == null ? KeyStatusType.UNRECOGNIZED : keyStatusTypeForNumber;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public boolean hasKeyData() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        public static Builder newBuilder(Key key) {
            return DEFAULT_INSTANCE.createBuilder(key);
        }

        public static Key parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Key parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Key parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Key parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Key parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Key parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Key parseFrom(InputStream inputStream) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Key parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Key parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface KeyOrBuilder extends MessageLiteOrBuilder {
        KeyData getKeyData();

        int getKeyId();

        OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        KeyStatusType getStatus();

        int getStatusValue();

        boolean hasKeyData();
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46934a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46934a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46934a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46934a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46934a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46934a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46934a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46934a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Keyset keyset = new Keyset();
        DEFAULT_INSTANCE = keyset;
        GeneratedMessageLite.registerDefaultInstance(Keyset.class, keyset);
    }

    public static Keyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Keyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Keyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Keyset keyset, int i10) {
        keyset.primaryKeyId_ = i10;
    }

    public static void r(Keyset keyset) {
        keyset.primaryKeyId_ = 0;
    }

    public static void s(Keyset keyset, int i10, Key key) {
        keyset.getClass();
        key.getClass();
        keyset.y();
        keyset.key_.set(i10, key);
    }

    public static void t(Keyset keyset, Key key) {
        keyset.getClass();
        key.getClass();
        keyset.y();
        keyset.key_.add(key);
    }

    public static void u(Keyset keyset, int i10, Key key) {
        keyset.getClass();
        key.getClass();
        keyset.y();
        keyset.key_.add(i10, key);
    }

    public static void v(Keyset keyset, Iterable iterable) {
        keyset.y();
        AbstractMessageLite.addAll(iterable, (List) keyset.key_);
    }

    public static void w(Keyset keyset) {
        keyset.getClass();
        keyset.key_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void x(Keyset keyset, int i10) {
        keyset.y();
        keyset.key_.remove(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46934a[methodToInvoke.ordinal()]) {
            case 1:
                return new Keyset();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", Key.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Keyset> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Keyset.class) {
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

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public Key getKey(int i10) {
        return this.key_.get(i10);
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public int getKeyCount() {
        return this.key_.size();
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public List<Key> getKeyList() {
        return this.key_;
    }

    public KeyOrBuilder getKeyOrBuilder(int i10) {
        return this.key_.get(i10);
    }

    public List<? extends KeyOrBuilder> getKeyOrBuilderList() {
        return this.key_;
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public final void y() {
        Internal.ProtobufList<Key> protobufList = this.key_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.key_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Builder newBuilder(Keyset keyset) {
        return DEFAULT_INSTANCE.createBuilder(keyset);
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Keyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Keyset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Keyset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Keyset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Keyset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Keyset parseFrom(InputStream inputStream) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Keyset parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Keyset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
