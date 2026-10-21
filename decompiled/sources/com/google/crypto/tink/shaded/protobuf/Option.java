package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private Any value_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47145a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f47145a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47145a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47145a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47145a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47145a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47145a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47145a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.registerDefaultInstance(Option.class, option);
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Option option, String str) {
        option.getClass();
        str.getClass();
        option.name_ = str;
    }

    public static void r(Option option) {
        option.getClass();
        option.name_ = getDefaultInstance().getName();
    }

    public static void s(Option option, ByteString byteString) {
        option.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        option.name_ = byteString.toStringUtf8();
    }

    public static void t(Option option, Any any) {
        option.getClass();
        any.getClass();
        option.value_ = any;
    }

    public static void u(Option option, Any any) {
        option.getClass();
        any.getClass();
        Any any2 = option.value_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            option.value_ = any;
        } else {
            option.value_ = Any.newBuilder(option.value_).mergeFrom(any).buildPartial();
        }
    }

    public static void v(Option option) {
        option.value_ = null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f47145a[methodToInvoke.ordinal()]) {
            case 1:
                return new Option();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Option> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Option.class) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
    public boolean hasValue() {
        return this.value_ != null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements OptionOrBuilder {
        public Builder() {
            super(Option.DEFAULT_INSTANCE);
        }

        public Builder clearName() {
            copyOnWrite();
            Option.r((Option) this.instance);
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            Option.v((Option) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public String getName() {
            return ((Option) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public ByteString getNameBytes() {
            return ((Option) this.instance).getNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public Any getValue() {
            return ((Option) this.instance).getValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.OptionOrBuilder
        public boolean hasValue() {
            return ((Option) this.instance).hasValue();
        }

        public Builder mergeValue(Any any) {
            copyOnWrite();
            Option.u((Option) this.instance, any);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Option.q((Option) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Option.s((Option) this.instance, byteString);
            return this;
        }

        public Builder setValue(Any any) {
            copyOnWrite();
            Option.t((Option) this.instance, any);
            return this;
        }

        public Builder setValue(Any.Builder builder) {
            copyOnWrite();
            Option.t((Option) this.instance, builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Option option) {
        return DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Option parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Option parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Option parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Option parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Option parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
