package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<Struct> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.emptyMapField();

    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
        public Builder() {
            super(Struct.DEFAULT_INSTANCE);
        }

        public Builder clearFields() {
            copyOnWrite();
            Struct.l((Struct) this.instance).clear();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public boolean containsFields(String str) {
            str.getClass();
            return ((Struct) this.instance).getFieldsMap().containsKey(str);
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((Struct) this.instance).getFieldsMap().size();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(str) ? fieldsMap.get(str) : value;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return fieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFields(Map<String, Value> map) {
            copyOnWrite();
            Struct.l((Struct) this.instance).putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            copyOnWrite();
            Struct.l((Struct) this.instance).put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            copyOnWrite();
            Struct.l((Struct) this.instance).remove(str);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20984a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20984a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20984a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20984a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20984a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20984a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20984a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20984a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapEntryLite<String, Value> f20985a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct);
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static MapFieldLite l(Struct struct) {
        if (!struct.fields_.isMutable()) {
            struct.fields_ = struct.fields_.mutableCopy();
        }
        return struct.fields_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public boolean containsFields(String str) {
        str.getClass();
        return this.fields_.containsKey(str);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f20984a[methodToInvoke.ordinal()]) {
            case 1:
                return new Struct();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", b.f20985a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Struct> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Struct.class) {
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

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : value;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Struct parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
