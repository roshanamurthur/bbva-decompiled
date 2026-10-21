package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i10) {
            this.value = i10;
        }

        public static KindCase forNumber(int i10) {
            switch (i10) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21012a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21012a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21012a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21012a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21012a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21012a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21012a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21012a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    public static void A(Value value) {
        if (value.kindCase_ == 2) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    public static void B(String str, Value value) {
        value.getClass();
        str.getClass();
        value.kindCase_ = 3;
        value.kind_ = str;
    }

    public static void C(Value value) {
        if (value.kindCase_ == 3) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    public static void D(Value value, ByteString byteString) {
        value.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        value.kindCase_ = 3;
        value.kind_ = byteString.toStringUtf8();
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void l(Value value) {
        value.kindCase_ = 0;
        value.kind_ = null;
    }

    public static void m(Value value, boolean z10) {
        value.kindCase_ = 4;
        value.kind_ = Boolean.valueOf(z10);
    }

    public static void n(Value value) {
        if (value.kindCase_ == 4) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(Value value, Struct struct) {
        value.getClass();
        struct.getClass();
        value.kind_ = struct;
        value.kindCase_ = 5;
    }

    public static void p(Value value, Struct.Builder builder) {
        value.getClass();
        value.kind_ = builder.build();
        value.kindCase_ = 5;
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Value value, Struct struct) {
        value.getClass();
        struct.getClass();
        if (value.kindCase_ != 5 || value.kind_ == Struct.getDefaultInstance()) {
            value.kind_ = struct;
        } else {
            value.kind_ = Struct.newBuilder((Struct) value.kind_).mergeFrom(struct).buildPartial();
        }
        value.kindCase_ = 5;
    }

    public static void r(Value value) {
        if (value.kindCase_ == 5) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    public static void s(ListValue listValue, Value value) {
        value.getClass();
        listValue.getClass();
        value.kind_ = listValue;
        value.kindCase_ = 6;
    }

    public static void t(Value value, ListValue.Builder builder) {
        value.getClass();
        value.kind_ = builder.build();
        value.kindCase_ = 6;
    }

    public static void u(ListValue listValue, Value value) {
        value.getClass();
        listValue.getClass();
        if (value.kindCase_ != 6 || value.kind_ == ListValue.getDefaultInstance()) {
            value.kind_ = listValue;
        } else {
            value.kind_ = ListValue.newBuilder((ListValue) value.kind_).mergeFrom(listValue).buildPartial();
        }
        value.kindCase_ = 6;
    }

    public static void v(Value value) {
        if (value.kindCase_ == 6) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    public static void w(int i10, Value value) {
        value.kindCase_ = 1;
        value.kind_ = Integer.valueOf(i10);
    }

    public static void x(Value value, NullValue nullValue) {
        value.getClass();
        nullValue.getClass();
        value.kindCase_ = 1;
        value.kind_ = Integer.valueOf(nullValue.getNumber());
    }

    public static void y(Value value) {
        if (value.kindCase_ == 1) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    public static void z(Value value, double d2) {
        value.kindCase_ = 2;
        value.kind_ = Double.valueOf(d2);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f21012a[methodToInvoke.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Value> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Value.class) {
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

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
        return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ByteString getStringValueBytes() {
        return ByteString.copyFromUtf8(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        public Builder() {
            super(Value.DEFAULT_INSTANCE);
        }

        public Builder clearBoolValue() {
            copyOnWrite();
            Value.n((Value) this.instance);
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            Value.l((Value) this.instance);
            return this;
        }

        public Builder clearListValue() {
            copyOnWrite();
            Value.v((Value) this.instance);
            return this;
        }

        public Builder clearNullValue() {
            copyOnWrite();
            Value.y((Value) this.instance);
            return this;
        }

        public Builder clearNumberValue() {
            copyOnWrite();
            Value.A((Value) this.instance);
            return this;
        }

        public Builder clearStringValue() {
            copyOnWrite();
            Value.C((Value) this.instance);
            return this;
        }

        public Builder clearStructValue() {
            copyOnWrite();
            Value.r((Value) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
            return ((Value) this.instance).getBoolValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public KindCase getKindCase() {
            return ((Value) this.instance).getKindCase();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ListValue getListValue() {
            return ((Value) this.instance).getListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public NullValue getNullValue() {
            return ((Value) this.instance).getNullValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public int getNullValueValue() {
            return ((Value) this.instance).getNullValueValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public double getNumberValue() {
            return ((Value) this.instance).getNumberValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public String getStringValue() {
            return ((Value) this.instance).getStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ByteString getStringValueBytes() {
            return ((Value) this.instance).getStringValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public Struct getStructValue() {
            return ((Value) this.instance).getStructValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasListValue() {
            return ((Value) this.instance).hasListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
            return ((Value) this.instance).hasStructValue();
        }

        public Builder mergeListValue(ListValue listValue) {
            copyOnWrite();
            Value.u(listValue, (Value) this.instance);
            return this;
        }

        public Builder mergeStructValue(Struct struct) {
            copyOnWrite();
            Value.q((Value) this.instance, struct);
            return this;
        }

        public Builder setBoolValue(boolean z10) {
            copyOnWrite();
            Value.m((Value) this.instance, z10);
            return this;
        }

        public Builder setListValue(ListValue listValue) {
            copyOnWrite();
            Value.s(listValue, (Value) this.instance);
            return this;
        }

        public Builder setNullValue(NullValue nullValue) {
            copyOnWrite();
            Value.x((Value) this.instance, nullValue);
            return this;
        }

        public Builder setNullValueValue(int i10) {
            copyOnWrite();
            Value.w(i10, (Value) this.instance);
            return this;
        }

        public Builder setNumberValue(double d2) {
            copyOnWrite();
            Value.z((Value) this.instance, d2);
            return this;
        }

        public Builder setStringValue(String str) {
            copyOnWrite();
            Value.B(str, (Value) this.instance);
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            copyOnWrite();
            Value.D((Value) this.instance, byteString);
            return this;
        }

        public Builder setStructValue(Struct struct) {
            copyOnWrite();
            Value.o((Value) this.instance, struct);
            return this;
        }

        public Builder setListValue(ListValue.Builder builder) {
            copyOnWrite();
            Value.t((Value) this.instance, builder);
            return this;
        }

        public Builder setStructValue(Struct.Builder builder) {
            copyOnWrite();
            Value.p((Value) this.instance, builder);
            return this;
        }
    }

    public static Builder newBuilder(Value value) {
        return DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
