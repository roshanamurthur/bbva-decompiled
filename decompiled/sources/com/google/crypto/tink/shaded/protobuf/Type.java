package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList<Field> fields_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47163a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f47163a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47163a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47163a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47163a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47163a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47163a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47163a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    public static void A(Type type) {
        type.getClass();
        type.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void B(Type type) {
        type.getClass();
        type.name_ = getDefaultInstance().getName();
    }

    public static void C(Type type, int i10) {
        type.S();
        type.options_.remove(i10);
    }

    public static void D(Type type, SourceContext sourceContext) {
        type.getClass();
        sourceContext.getClass();
        type.sourceContext_ = sourceContext;
    }

    public static void E(Type type, SourceContext sourceContext) {
        type.getClass();
        sourceContext.getClass();
        SourceContext sourceContext2 = type.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            type.sourceContext_ = sourceContext;
        } else {
            type.sourceContext_ = SourceContext.newBuilder(type.sourceContext_).mergeFrom(sourceContext).buildPartial();
        }
    }

    public static void F(Type type) {
        type.sourceContext_ = null;
    }

    public static void G(Type type, int i10) {
        type.syntax_ = i10;
    }

    public static void H(Type type, Syntax syntax) {
        type.getClass();
        type.syntax_ = syntax.getNumber();
    }

    public static void I(Type type) {
        type.syntax_ = 0;
    }

    public static void J(Type type, ByteString byteString) {
        type.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        type.name_ = byteString.toStringUtf8();
    }

    public static void K(Type type, int i10, Field field) {
        type.getClass();
        field.getClass();
        type.Q();
        type.fields_.set(i10, field);
    }

    public static void L(Type type, Field field) {
        type.getClass();
        field.getClass();
        type.Q();
        type.fields_.add(field);
    }

    public static void M(Type type, int i10, Field field) {
        type.getClass();
        field.getClass();
        type.Q();
        type.fields_.add(i10, field);
    }

    public static void N(Type type, Iterable iterable) {
        type.Q();
        AbstractMessageLite.addAll(iterable, (List) type.fields_);
    }

    public static void O(Type type) {
        type.getClass();
        type.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void P(Type type, int i10) {
        type.Q();
        type.fields_.remove(i10);
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Type type, String str) {
        type.getClass();
        str.getClass();
        type.name_ = str;
    }

    public static void r(Type type, int i10, String str) {
        type.getClass();
        str.getClass();
        type.R();
        type.oneofs_.set(i10, str);
    }

    public static void s(Type type, String str) {
        type.getClass();
        str.getClass();
        type.R();
        type.oneofs_.add(str);
    }

    public static void t(Type type, Iterable iterable) {
        type.R();
        AbstractMessageLite.addAll(iterable, (List) type.oneofs_);
    }

    public static void u(Type type) {
        type.getClass();
        type.oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void v(Type type, ByteString byteString) {
        type.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        type.R();
        type.oneofs_.add(byteString.toStringUtf8());
    }

    public static void w(Type type, int i10, Option option) {
        type.getClass();
        option.getClass();
        type.S();
        type.options_.set(i10, option);
    }

    public static void x(Type type, Option option) {
        type.getClass();
        option.getClass();
        type.S();
        type.options_.add(option);
    }

    public static void y(Type type, int i10, Option option) {
        type.getClass();
        option.getClass();
        type.S();
        type.options_.add(i10, option);
    }

    public static void z(Type type, Iterable iterable) {
        type.S();
        AbstractMessageLite.addAll(iterable, (List) type.options_);
    }

    public final void Q() {
        Internal.ProtobufList<Field> protobufList = this.fields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void R() {
        Internal.ProtobufList<String> protobufList = this.oneofs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.oneofs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void S() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f47163a[methodToInvoke.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Type> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Type.class) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public Field getFields(int i10) {
        return this.fields_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public FieldOrBuilder getFieldsOrBuilder(int i10) {
        return this.fields_.get(i10);
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public String getOneofs(int i10) {
        return this.oneofs_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int i10) {
        return ByteString.copyFromUtf8(this.oneofs_.get(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        public Builder() {
            super(Type.DEFAULT_INSTANCE);
        }

        public Builder addAllFields(Iterable<? extends Field> iterable) {
            copyOnWrite();
            Type.N((Type) this.instance, iterable);
            return this;
        }

        public Builder addAllOneofs(Iterable<String> iterable) {
            copyOnWrite();
            Type.t((Type) this.instance, iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            Type.z((Type) this.instance, iterable);
            return this;
        }

        public Builder addFields(Field field) {
            copyOnWrite();
            Type.L((Type) this.instance, field);
            return this;
        }

        public Builder addOneofs(String str) {
            copyOnWrite();
            Type.s((Type) this.instance, str);
            return this;
        }

        public Builder addOneofsBytes(ByteString byteString) {
            copyOnWrite();
            Type.v((Type) this.instance, byteString);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Type.x((Type) this.instance, option);
            return this;
        }

        public Builder clearFields() {
            copyOnWrite();
            Type.O((Type) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Type.B((Type) this.instance);
            return this;
        }

        public Builder clearOneofs() {
            copyOnWrite();
            Type.u((Type) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Type.A((Type) this.instance);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            Type.F((Type) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Type.I((Type) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public Field getFields(int i10) {
            return ((Type) this.instance).getFields(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((Type) this.instance).getFieldsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public List<Field> getFieldsList() {
            return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public String getName() {
            return ((Type) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
            return ((Type) this.instance).getNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public String getOneofs(int i10) {
            return ((Type) this.instance).getOneofs(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int i10) {
            return ((Type) this.instance).getOneofsBytes(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((Type) this.instance).getOneofsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public Option getOptions(int i10) {
            return ((Type) this.instance).getOptions(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((Type) this.instance).getOptionsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
            return ((Type) this.instance).getSourceContext();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
            return ((Type) this.instance).getSyntax();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((Type) this.instance).getSyntaxValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((Type) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Type.E((Type) this.instance, sourceContext);
            return this;
        }

        public Builder removeFields(int i10) {
            copyOnWrite();
            Type.P((Type) this.instance, i10);
            return this;
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            Type.C((Type) this.instance, i10);
            return this;
        }

        public Builder setFields(int i10, Field field) {
            copyOnWrite();
            Type.K((Type) this.instance, i10, field);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Type.q((Type) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Type.J((Type) this.instance, byteString);
            return this;
        }

        public Builder setOneofs(int i10, String str) {
            copyOnWrite();
            Type.r((Type) this.instance, i10, str);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            Type.w((Type) this.instance, i10, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Type.D((Type) this.instance, sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Type.H((Type) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            Type.G((Type) this.instance, i10);
            return this;
        }

        public Builder addFields(int i10, Field field) {
            copyOnWrite();
            Type.M((Type) this.instance, i10, field);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            Type.y((Type) this.instance, i10, option);
            return this;
        }

        public Builder setFields(int i10, Field.Builder builder) {
            copyOnWrite();
            Type.K((Type) this.instance, i10, builder.build());
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Type.w((Type) this.instance, i10, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            Type.D((Type) this.instance, builder.build());
            return this;
        }

        public Builder addFields(Field.Builder builder) {
            copyOnWrite();
            Type.L((Type) this.instance, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Type.x((Type) this.instance, builder.build());
            return this;
        }

        public Builder addFields(int i10, Field.Builder builder) {
            copyOnWrite();
            Type.M((Type) this.instance, i10, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Type.y((Type) this.instance, i10, builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Type type) {
        return DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
