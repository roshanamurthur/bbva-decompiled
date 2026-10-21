package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumValue extends GeneratedMessageLite<EnumValue, Builder> implements EnumValueOrBuilder {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<EnumValue> PARSER;
    private int number_;
    private String name_ = "";
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20881a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20881a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20881a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20881a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20881a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20881a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20881a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20881a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue);
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void l(EnumValue enumValue, String str) {
        enumValue.getClass();
        str.getClass();
        enumValue.name_ = str;
    }

    public static void m(EnumValue enumValue, Option.Builder builder) {
        enumValue.z();
        enumValue.options_.add(builder.build());
    }

    public static void n(EnumValue enumValue, int i10, Option.Builder builder) {
        enumValue.z();
        enumValue.options_.add(i10, builder.build());
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(EnumValue enumValue, Iterable iterable) {
        enumValue.z();
        AbstractMessageLite.addAll(iterable, (List) enumValue.options_);
    }

    public static void p(EnumValue enumValue) {
        enumValue.getClass();
        enumValue.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EnumValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(int i10, EnumValue enumValue) {
        enumValue.z();
        enumValue.options_.remove(i10);
    }

    public static void r(EnumValue enumValue) {
        enumValue.getClass();
        enumValue.name_ = getDefaultInstance().getName();
    }

    public static void s(EnumValue enumValue, ByteString byteString) {
        enumValue.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        enumValue.name_ = byteString.toStringUtf8();
    }

    public static void t(int i10, EnumValue enumValue) {
        enumValue.number_ = i10;
    }

    public static void u(EnumValue enumValue) {
        enumValue.number_ = 0;
    }

    public static void v(EnumValue enumValue, int i10, Option option) {
        enumValue.getClass();
        option.getClass();
        enumValue.z();
        enumValue.options_.set(i10, option);
    }

    public static void w(EnumValue enumValue, int i10, Option.Builder builder) {
        enumValue.z();
        enumValue.options_.set(i10, builder.build());
    }

    public static void x(EnumValue enumValue, Option option) {
        enumValue.getClass();
        option.getClass();
        enumValue.z();
        enumValue.options_.add(option);
    }

    public static void y(EnumValue enumValue, int i10, Option option) {
        enumValue.getClass();
        option.getClass();
        enumValue.z();
        enumValue.options_.add(i10, option);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f20881a[methodToInvoke.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EnumValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EnumValue.class) {
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

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    public final void z() {
        if (this.options_.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EnumValue, Builder> implements EnumValueOrBuilder {
        public Builder() {
            super(EnumValue.DEFAULT_INSTANCE);
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            EnumValue.o((EnumValue) this.instance, iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            EnumValue.x((EnumValue) this.instance, option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            EnumValue.r((EnumValue) this.instance);
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            EnumValue.u((EnumValue) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            EnumValue.p((EnumValue) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public String getName() {
            return ((EnumValue) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public ByteString getNameBytes() {
            return ((EnumValue) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((EnumValue) this.instance).getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public Option getOptions(int i10) {
            return ((EnumValue) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((EnumValue) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            EnumValue.q(i10, (EnumValue) this.instance);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            EnumValue.l((EnumValue) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            EnumValue.s((EnumValue) this.instance, byteString);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            EnumValue.t(i10, (EnumValue) this.instance);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            EnumValue.v((EnumValue) this.instance, i10, option);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            EnumValue.y((EnumValue) this.instance, i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            EnumValue.w((EnumValue) this.instance, i10, builder);
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            EnumValue.m((EnumValue) this.instance, builder);
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            EnumValue.n((EnumValue) this.instance, i10, builder);
            return this;
        }
    }

    public static Builder newBuilder(EnumValue enumValue) {
        return DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EnumValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EnumValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EnumValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
