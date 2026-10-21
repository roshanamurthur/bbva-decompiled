package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, Builder> implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile Parser<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20967a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20967a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20967a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20967a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20967a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20967a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20967a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20967a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, listValue);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void l(ListValue listValue, int i10, Value value) {
        listValue.getClass();
        value.getClass();
        listValue.u();
        listValue.values_.set(i10, value);
    }

    public static void m(ListValue listValue, int i10, Value.Builder builder) {
        listValue.u();
        listValue.values_.set(i10, builder.build());
    }

    public static void n(ListValue listValue, Value value) {
        listValue.getClass();
        value.getClass();
        listValue.u();
        listValue.values_.add(value);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(ListValue listValue, int i10, Value value) {
        listValue.getClass();
        value.getClass();
        listValue.u();
        listValue.values_.add(i10, value);
    }

    public static void p(ListValue listValue, Value.Builder builder) {
        listValue.u();
        listValue.values_.add(builder.build());
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(ListValue listValue, int i10, Value.Builder builder) {
        listValue.u();
        listValue.values_.add(i10, builder.build());
    }

    public static void r(ListValue listValue, Iterable iterable) {
        listValue.u();
        AbstractMessageLite.addAll(iterable, (List) listValue.values_);
    }

    public static void s(ListValue listValue) {
        listValue.getClass();
        listValue.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void t(ListValue listValue, int i10) {
        listValue.u();
        listValue.values_.remove(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f20967a[methodToInvoke.ordinal()]) {
            case 1:
                return new ListValue();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ListValue.class) {
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

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public Value getValues(int i10) {
        return this.values_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public List<Value> getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int i10) {
        return this.values_.get(i10);
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public final void u() {
        if (this.values_.isModifiable()) {
            return;
        }
        this.values_ = GeneratedMessageLite.mutableCopy(this.values_);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListValue, Builder> implements ListValueOrBuilder {
        public Builder() {
            super(ListValue.DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            copyOnWrite();
            ListValue.r((ListValue) this.instance, iterable);
            return this;
        }

        public Builder addValues(Value value) {
            copyOnWrite();
            ListValue.n((ListValue) this.instance, value);
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ListValue.s((ListValue) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public Value getValues(int i10) {
            return ((ListValue) this.instance).getValues(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((ListValue) this.instance).getValuesCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((ListValue) this.instance).getValuesList());
        }

        public Builder removeValues(int i10) {
            copyOnWrite();
            ListValue.t((ListValue) this.instance, i10);
            return this;
        }

        public Builder setValues(int i10, Value value) {
            copyOnWrite();
            ListValue.l((ListValue) this.instance, i10, value);
            return this;
        }

        public Builder addValues(int i10, Value value) {
            copyOnWrite();
            ListValue.o((ListValue) this.instance, i10, value);
            return this;
        }

        public Builder setValues(int i10, Value.Builder builder) {
            copyOnWrite();
            ListValue.m((ListValue) this.instance, i10, builder);
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            copyOnWrite();
            ListValue.p((ListValue) this.instance, builder);
            return this;
        }

        public Builder addValues(int i10, Value.Builder builder) {
            copyOnWrite();
            ListValue.q((ListValue) this.instance, i10, builder);
            return this;
        }
    }

    public static Builder newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ListValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
