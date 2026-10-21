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
@Deprecated
public final class KeyTypeEntry extends GeneratedMessageLite<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final KeyTypeEntry DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile Parser<KeyTypeEntry> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
        public Builder() {
            super(KeyTypeEntry.DEFAULT_INSTANCE);
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

        public Builder clearCatalogueName() {
            copyOnWrite();
            KeyTypeEntry.t((KeyTypeEntry) this.instance);
            return this;
        }

        public Builder clearKeyManagerVersion() {
            copyOnWrite();
            KeyTypeEntry.B((KeyTypeEntry) this.instance);
            return this;
        }

        public Builder clearNewKeyAllowed() {
            copyOnWrite();
            KeyTypeEntry.r((KeyTypeEntry) this.instance);
            return this;
        }

        public Builder clearPrimitiveName() {
            copyOnWrite();
            KeyTypeEntry.v((KeyTypeEntry) this.instance);
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            KeyTypeEntry.y((KeyTypeEntry) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo5285clone() {
            return super.mo5285clone();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public String getCatalogueName() {
            return ((KeyTypeEntry) this.instance).getCatalogueName();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public ByteString getCatalogueNameBytes() {
            return ((KeyTypeEntry) this.instance).getCatalogueNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public int getKeyManagerVersion() {
            return ((KeyTypeEntry) this.instance).getKeyManagerVersion();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public boolean getNewKeyAllowed() {
            return ((KeyTypeEntry) this.instance).getNewKeyAllowed();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public String getPrimitiveName() {
            return ((KeyTypeEntry) this.instance).getPrimitiveName();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public ByteString getPrimitiveNameBytes() {
            return ((KeyTypeEntry) this.instance).getPrimitiveNameBytes();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public String getTypeUrl() {
            return ((KeyTypeEntry) this.instance).getTypeUrl();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((KeyTypeEntry) this.instance).getTypeUrlBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return super.internalMergeFrom((GeneratedMessageLite) abstractMessageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeFrom(codedInputStream, extensionRegistryLite);
        }

        public Builder setCatalogueName(String str) {
            copyOnWrite();
            KeyTypeEntry.s((KeyTypeEntry) this.instance, str);
            return this;
        }

        public Builder setCatalogueNameBytes(ByteString byteString) {
            copyOnWrite();
            KeyTypeEntry.u((KeyTypeEntry) this.instance, byteString);
            return this;
        }

        public Builder setKeyManagerVersion(int i10) {
            copyOnWrite();
            KeyTypeEntry.A(i10, (KeyTypeEntry) this.instance);
            return this;
        }

        public Builder setNewKeyAllowed(boolean z10) {
            copyOnWrite();
            KeyTypeEntry.C((KeyTypeEntry) this.instance, z10);
            return this;
        }

        public Builder setPrimitiveName(String str) {
            copyOnWrite();
            KeyTypeEntry.q((KeyTypeEntry) this.instance, str);
            return this;
        }

        public Builder setPrimitiveNameBytes(ByteString byteString) {
            copyOnWrite();
            KeyTypeEntry.w((KeyTypeEntry) this.instance, byteString);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            KeyTypeEntry.x((KeyTypeEntry) this.instance, str);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            KeyTypeEntry.z((KeyTypeEntry) this.instance, byteString);
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

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46933a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46933a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46933a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46933a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46933a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46933a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46933a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46933a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        KeyTypeEntry keyTypeEntry = new KeyTypeEntry();
        DEFAULT_INSTANCE = keyTypeEntry;
        GeneratedMessageLite.registerDefaultInstance(KeyTypeEntry.class, keyTypeEntry);
    }

    public static void A(int i10, KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.keyManagerVersion_ = i10;
    }

    public static void B(KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.keyManagerVersion_ = 0;
    }

    public static void C(KeyTypeEntry keyTypeEntry, boolean z10) {
        keyTypeEntry.newKeyAllowed_ = z10;
    }

    public static KeyTypeEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTypeEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KeyTypeEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(KeyTypeEntry keyTypeEntry, String str) {
        keyTypeEntry.getClass();
        str.getClass();
        keyTypeEntry.primitiveName_ = str;
    }

    public static void r(KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.newKeyAllowed_ = false;
    }

    public static void s(KeyTypeEntry keyTypeEntry, String str) {
        keyTypeEntry.getClass();
        str.getClass();
        keyTypeEntry.catalogueName_ = str;
    }

    public static void t(KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        keyTypeEntry.catalogueName_ = getDefaultInstance().getCatalogueName();
    }

    public static void u(KeyTypeEntry keyTypeEntry, ByteString byteString) {
        keyTypeEntry.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        keyTypeEntry.catalogueName_ = byteString.toStringUtf8();
    }

    public static void v(KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        keyTypeEntry.primitiveName_ = getDefaultInstance().getPrimitiveName();
    }

    public static void w(KeyTypeEntry keyTypeEntry, ByteString byteString) {
        keyTypeEntry.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        keyTypeEntry.primitiveName_ = byteString.toStringUtf8();
    }

    public static void x(KeyTypeEntry keyTypeEntry, String str) {
        keyTypeEntry.getClass();
        str.getClass();
        keyTypeEntry.typeUrl_ = str;
    }

    public static void y(KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        keyTypeEntry.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    public static void z(KeyTypeEntry keyTypeEntry, ByteString byteString) {
        keyTypeEntry.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        keyTypeEntry.typeUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46933a[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyTypeEntry();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KeyTypeEntry> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (KeyTypeEntry.class) {
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

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public String getCatalogueName() {
        return this.catalogueName_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public ByteString getCatalogueNameBytes() {
        return ByteString.copyFromUtf8(this.catalogueName_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public int getKeyManagerVersion() {
        return this.keyManagerVersion_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public boolean getNewKeyAllowed() {
        return this.newKeyAllowed_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public String getPrimitiveName() {
        return this.primitiveName_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public ByteString getPrimitiveNameBytes() {
        return ByteString.copyFromUtf8(this.primitiveName_);
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    public static Builder newBuilder(KeyTypeEntry keyTypeEntry) {
        return DEFAULT_INSTANCE.createBuilder(keyTypeEntry);
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KeyTypeEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyTypeEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(InputStream inputStream) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTypeEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KeyTypeEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
