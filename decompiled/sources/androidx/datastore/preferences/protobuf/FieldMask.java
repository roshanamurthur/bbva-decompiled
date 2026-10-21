package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
        public Builder() {
            super(FieldMask.DEFAULT_INSTANCE);
        }

        public Builder addAllPaths(Iterable<String> iterable) {
            copyOnWrite();
            FieldMask.n((FieldMask) this.instance, iterable);
            return this;
        }

        public Builder addPaths(String str) {
            copyOnWrite();
            FieldMask.m((FieldMask) this.instance, str);
            return this;
        }

        public Builder addPathsBytes(ByteString byteString) {
            copyOnWrite();
            FieldMask.p((FieldMask) this.instance, byteString);
            return this;
        }

        public Builder clearPaths() {
            copyOnWrite();
            FieldMask.o((FieldMask) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public String getPaths(int i10) {
            return ((FieldMask) this.instance).getPaths(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public ByteString getPathsBytes(int i10) {
            return ((FieldMask) this.instance).getPathsBytes(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((FieldMask) this.instance).getPathsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public List<String> getPathsList() {
            return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
        }

        public Builder setPaths(int i10, String str) {
            copyOnWrite();
            FieldMask.l((FieldMask) this.instance, i10, str);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20912a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20912a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20912a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20912a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20912a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20912a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20912a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20912a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void l(FieldMask fieldMask, int i10, String str) {
        fieldMask.getClass();
        str.getClass();
        fieldMask.q();
        fieldMask.paths_.set(i10, str);
    }

    public static void m(FieldMask fieldMask, String str) {
        fieldMask.getClass();
        str.getClass();
        fieldMask.q();
        fieldMask.paths_.add(str);
    }

    public static void n(FieldMask fieldMask, Iterable iterable) {
        fieldMask.q();
        AbstractMessageLite.addAll(iterable, (List) fieldMask.paths_);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(FieldMask fieldMask) {
        fieldMask.getClass();
        fieldMask.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void p(FieldMask fieldMask, ByteString byteString) {
        fieldMask.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        fieldMask.q();
        fieldMask.paths_.add(byteString.toStringUtf8());
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f20912a[methodToInvoke.ordinal()]) {
            case 1:
                return new FieldMask();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FieldMask> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FieldMask.class) {
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

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public String getPaths(int i10) {
        return this.paths_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public ByteString getPathsBytes(int i10) {
        return ByteString.copyFromUtf8(this.paths_.get(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public List<String> getPathsList() {
        return this.paths_;
    }

    public final void q() {
        if (this.paths_.isModifiable()) {
            return;
        }
        this.paths_ = GeneratedMessageLite.mutableCopy(this.paths_);
    }

    public static Builder newBuilder(FieldMask fieldMask) {
        return DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FieldMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FieldMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FieldMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
