package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Enum extends GeneratedMessageLite<Enum, Builder> implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList<EnumValue> enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47044a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f47044a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47044a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47044a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47044a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47044a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47044a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47044a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Enum r1 = new Enum();
        DEFAULT_INSTANCE = r1;
        GeneratedMessageLite.registerDefaultInstance(Enum.class, r1);
    }

    public static void A(Enum r1, int i10) {
        r1.syntax_ = i10;
    }

    public static void B(Enum r1) {
        r1.getClass();
        r1.name_ = getDefaultInstance().getName();
    }

    public static void C(Enum r1, Syntax syntax) {
        r1.getClass();
        r1.syntax_ = syntax.getNumber();
    }

    public static void D(Enum r1) {
        r1.syntax_ = 0;
    }

    public static void E(Enum r1, ByteString byteString) {
        r1.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        r1.name_ = byteString.toStringUtf8();
    }

    public static void F(Enum r1, int i10, EnumValue enumValue) {
        r1.getClass();
        enumValue.getClass();
        r1.L();
        r1.enumvalue_.set(i10, enumValue);
    }

    public static void G(Enum r1, EnumValue enumValue) {
        r1.getClass();
        enumValue.getClass();
        r1.L();
        r1.enumvalue_.add(enumValue);
    }

    public static void H(Enum r1, int i10, EnumValue enumValue) {
        r1.getClass();
        enumValue.getClass();
        r1.L();
        r1.enumvalue_.add(i10, enumValue);
    }

    public static void I(Enum r1, Iterable iterable) {
        r1.L();
        AbstractMessageLite.addAll(iterable, (List) r1.enumvalue_);
    }

    public static void J(Enum r1) {
        r1.getClass();
        r1.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void K(Enum r1, int i10) {
        r1.L();
        r1.enumvalue_.remove(i10);
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Enum r1, String str) {
        r1.getClass();
        str.getClass();
        r1.name_ = str;
    }

    public static void r(Enum r1, int i10, Option option) {
        r1.getClass();
        option.getClass();
        r1.M();
        r1.options_.set(i10, option);
    }

    public static void s(Enum r1, Option option) {
        r1.getClass();
        option.getClass();
        r1.M();
        r1.options_.add(option);
    }

    public static void t(Enum r1, int i10, Option option) {
        r1.getClass();
        option.getClass();
        r1.M();
        r1.options_.add(i10, option);
    }

    public static void u(Enum r1, Iterable iterable) {
        r1.M();
        AbstractMessageLite.addAll(iterable, (List) r1.options_);
    }

    public static void v(Enum r1) {
        r1.getClass();
        r1.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void w(Enum r1, int i10) {
        r1.M();
        r1.options_.remove(i10);
    }

    public static void x(Enum r1, SourceContext sourceContext) {
        r1.getClass();
        sourceContext.getClass();
        r1.sourceContext_ = sourceContext;
    }

    public static void y(Enum r3, SourceContext sourceContext) {
        r3.getClass();
        sourceContext.getClass();
        SourceContext sourceContext2 = r3.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            r3.sourceContext_ = sourceContext;
        } else {
            r3.sourceContext_ = SourceContext.newBuilder(r3.sourceContext_).mergeFrom(sourceContext).buildPartial();
        }
    }

    public static void z(Enum r1) {
        r1.sourceContext_ = null;
    }

    public final void L() {
        Internal.ProtobufList<EnumValue> protobufList = this.enumvalue_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.enumvalue_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void M() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f47044a[methodToInvoke.ordinal()]) {
            case 1:
                return new Enum();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Enum> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Enum.class) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int i10) {
        return this.enumvalue_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int i10) {
        return this.enumvalue_.get(i10);
    }

    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Enum, Builder> implements EnumOrBuilder {
        public Builder() {
            super(Enum.DEFAULT_INSTANCE);
        }

        public Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            copyOnWrite();
            Enum.I((Enum) this.instance, iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            Enum.u((Enum) this.instance, iterable);
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue) {
            copyOnWrite();
            Enum.G((Enum) this.instance, enumValue);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Enum.s((Enum) this.instance, option);
            return this;
        }

        public Builder clearEnumvalue() {
            copyOnWrite();
            Enum.J((Enum) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Enum.B((Enum) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Enum.v((Enum) this.instance);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            Enum.z((Enum) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Enum.D((Enum) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int i10) {
            return ((Enum) this.instance).getEnumvalue(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((Enum) this.instance).getEnumvalueCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public List<EnumValue> getEnumvalueList() {
            return Collections.unmodifiableList(((Enum) this.instance).getEnumvalueList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public String getName() {
            return ((Enum) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
            return ((Enum) this.instance).getNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public Option getOptions(int i10) {
            return ((Enum) this.instance).getOptions(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((Enum) this.instance).getOptionsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Enum) this.instance).getOptionsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
            return ((Enum) this.instance).getSourceContext();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
            return ((Enum) this.instance).getSyntax();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((Enum) this.instance).getSyntaxValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((Enum) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Enum.y((Enum) this.instance, sourceContext);
            return this;
        }

        public Builder removeEnumvalue(int i10) {
            copyOnWrite();
            Enum.K((Enum) this.instance, i10);
            return this;
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            Enum.w((Enum) this.instance, i10);
            return this;
        }

        public Builder setEnumvalue(int i10, EnumValue enumValue) {
            copyOnWrite();
            Enum.F((Enum) this.instance, i10, enumValue);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Enum.q((Enum) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Enum.E((Enum) this.instance, byteString);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            Enum.r((Enum) this.instance, i10, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Enum.x((Enum) this.instance, sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Enum.C((Enum) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            Enum.A((Enum) this.instance, i10);
            return this;
        }

        public Builder addEnumvalue(int i10, EnumValue enumValue) {
            copyOnWrite();
            Enum.H((Enum) this.instance, i10, enumValue);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            Enum.t((Enum) this.instance, i10, option);
            return this;
        }

        public Builder setEnumvalue(int i10, EnumValue.Builder builder) {
            copyOnWrite();
            Enum.F((Enum) this.instance, i10, builder.build());
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Enum.r((Enum) this.instance, i10, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            Enum.x((Enum) this.instance, builder.build());
            return this;
        }

        public Builder addEnumvalue(EnumValue.Builder builder) {
            copyOnWrite();
            Enum.G((Enum) this.instance, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Enum.s((Enum) this.instance, builder.build());
            return this;
        }

        public Builder addEnumvalue(int i10, EnumValue.Builder builder) {
            copyOnWrite();
            Enum.H((Enum) this.instance, i10, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Enum.t((Enum) this.instance, i10, builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Enum r1) {
        return DEFAULT_INSTANCE.createBuilder(r1);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
