package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
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
        public static final /* synthetic */ int[] f47045a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f47045a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47045a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47045a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47045a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47045a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47045a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47045a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue);
    }

    public static void A(EnumValue enumValue, Iterable iterable) {
        enumValue.B();
        AbstractMessageLite.addAll(iterable, (List) enumValue.options_);
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
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

    public static void q(EnumValue enumValue, String str) {
        enumValue.getClass();
        str.getClass();
        enumValue.name_ = str;
    }

    public static void r(EnumValue enumValue) {
        enumValue.getClass();
        enumValue.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void s(int i10, EnumValue enumValue) {
        enumValue.B();
        enumValue.options_.remove(i10);
    }

    public static void t(EnumValue enumValue) {
        enumValue.getClass();
        enumValue.name_ = getDefaultInstance().getName();
    }

    public static void u(EnumValue enumValue, ByteString byteString) {
        enumValue.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        enumValue.name_ = byteString.toStringUtf8();
    }

    public static void v(int i10, EnumValue enumValue) {
        enumValue.number_ = i10;
    }

    public static void w(EnumValue enumValue) {
        enumValue.number_ = 0;
    }

    public static void x(EnumValue enumValue, int i10, Option option) {
        enumValue.getClass();
        option.getClass();
        enumValue.B();
        enumValue.options_.set(i10, option);
    }

    public static void y(EnumValue enumValue, Option option) {
        enumValue.getClass();
        option.getClass();
        enumValue.B();
        enumValue.options_.add(option);
    }

    public static void z(EnumValue enumValue, int i10, Option option) {
        enumValue.getClass();
        option.getClass();
        enumValue.B();
        enumValue.options_.add(i10, option);
    }

    public final void B() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f47045a[methodToInvoke.ordinal()]) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EnumValue, Builder> implements EnumValueOrBuilder {
        public Builder() {
            super(EnumValue.DEFAULT_INSTANCE);
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            EnumValue.A((EnumValue) this.instance, iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            EnumValue.y((EnumValue) this.instance, option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            EnumValue.t((EnumValue) this.instance);
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            EnumValue.w((EnumValue) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            EnumValue.r((EnumValue) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public String getName() {
            return ((EnumValue) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public ByteString getNameBytes() {
            return ((EnumValue) this.instance).getNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((EnumValue) this.instance).getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public Option getOptions(int i10) {
            return ((EnumValue) this.instance).getOptions(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((EnumValue) this.instance).getOptionsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            EnumValue.s(i10, (EnumValue) this.instance);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            EnumValue.q((EnumValue) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            EnumValue.u((EnumValue) this.instance, byteString);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            EnumValue.v(i10, (EnumValue) this.instance);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            EnumValue.x((EnumValue) this.instance, i10, option);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            EnumValue.z((EnumValue) this.instance, i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            EnumValue.x((EnumValue) this.instance, i10, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            EnumValue.y((EnumValue) this.instance, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            EnumValue.z((EnumValue) this.instance, i10, builder.build());
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
