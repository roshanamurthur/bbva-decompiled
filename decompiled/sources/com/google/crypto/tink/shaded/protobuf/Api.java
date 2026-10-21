package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Api extends GeneratedMessageLite<Api, Builder> implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList<Method> methods_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String version_ = "";
    private Internal.ProtobufList<Mixin> mixins_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46955a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f46955a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46955a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46955a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46955a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46955a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46955a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46955a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        GeneratedMessageLite.registerDefaultInstance(Api.class, api);
    }

    public static void A(Api api, SourceContext sourceContext) {
        api.getClass();
        sourceContext.getClass();
        api.sourceContext_ = sourceContext;
    }

    public static void B(Api api) {
        api.getClass();
        api.name_ = getDefaultInstance().getName();
    }

    public static void C(Api api, SourceContext sourceContext) {
        api.getClass();
        sourceContext.getClass();
        SourceContext sourceContext2 = api.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            api.sourceContext_ = sourceContext;
        } else {
            api.sourceContext_ = SourceContext.newBuilder(api.sourceContext_).mergeFrom(sourceContext).buildPartial();
        }
    }

    public static void D(Api api) {
        api.sourceContext_ = null;
    }

    public static void E(Api api, int i10, Mixin mixin) {
        api.getClass();
        mixin.getClass();
        api.V();
        api.mixins_.set(i10, mixin);
    }

    public static void F(Api api, Mixin mixin) {
        api.getClass();
        mixin.getClass();
        api.V();
        api.mixins_.add(mixin);
    }

    public static void G(Api api, int i10, Mixin mixin) {
        api.getClass();
        mixin.getClass();
        api.V();
        api.mixins_.add(i10, mixin);
    }

    public static void H(Api api, Iterable iterable) {
        api.V();
        AbstractMessageLite.addAll(iterable, (List) api.mixins_);
    }

    public static void I(Api api) {
        api.getClass();
        api.mixins_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void J(Api api, int i10) {
        api.V();
        api.mixins_.remove(i10);
    }

    public static void K(Api api, int i10) {
        api.syntax_ = i10;
    }

    public static void L(Api api, Syntax syntax) {
        api.getClass();
        api.syntax_ = syntax.getNumber();
    }

    public static void M(Api api, ByteString byteString) {
        api.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        api.name_ = byteString.toStringUtf8();
    }

    public static void N(Api api) {
        api.syntax_ = 0;
    }

    public static void O(Api api, int i10, Method method) {
        api.getClass();
        method.getClass();
        api.U();
        api.methods_.set(i10, method);
    }

    public static void P(Api api, Method method) {
        api.getClass();
        method.getClass();
        api.U();
        api.methods_.add(method);
    }

    public static void Q(Api api, int i10, Method method) {
        api.getClass();
        method.getClass();
        api.U();
        api.methods_.add(i10, method);
    }

    public static void R(Api api, Iterable iterable) {
        api.U();
        AbstractMessageLite.addAll(iterable, (List) api.methods_);
    }

    public static void S(Api api) {
        api.getClass();
        api.methods_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void T(Api api, int i10) {
        api.U();
        api.methods_.remove(i10);
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Api api, String str) {
        api.getClass();
        str.getClass();
        api.name_ = str;
    }

    public static void r(Api api, int i10, Option option) {
        api.getClass();
        option.getClass();
        api.W();
        api.options_.set(i10, option);
    }

    public static void s(Api api, Option option) {
        api.getClass();
        option.getClass();
        api.W();
        api.options_.add(option);
    }

    public static void t(Api api, int i10, Option option) {
        api.getClass();
        option.getClass();
        api.W();
        api.options_.add(i10, option);
    }

    public static void u(Api api, Iterable iterable) {
        api.W();
        AbstractMessageLite.addAll(iterable, (List) api.options_);
    }

    public static void v(Api api) {
        api.getClass();
        api.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void w(Api api, int i10) {
        api.W();
        api.options_.remove(i10);
    }

    public static void x(Api api, String str) {
        api.getClass();
        str.getClass();
        api.version_ = str;
    }

    public static void y(Api api) {
        api.getClass();
        api.version_ = getDefaultInstance().getVersion();
    }

    public static void z(Api api, ByteString byteString) {
        api.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        api.version_ = byteString.toStringUtf8();
    }

    public final void U() {
        Internal.ProtobufList<Method> protobufList = this.methods_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.methods_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void V() {
        Internal.ProtobufList<Mixin> protobufList = this.mixins_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.mixins_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void W() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f46955a[methodToInvoke.ordinal()]) {
            case 1:
                return new Api();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Api> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Api.class) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public Method getMethods(int i10) {
        return this.methods_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public MethodOrBuilder getMethodsOrBuilder(int i10) {
        return this.methods_.get(i10);
    }

    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public Mixin getMixins(int i10) {
        return this.mixins_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public MixinOrBuilder getMixinsOrBuilder(int i10) {
        return this.mixins_.get(i10);
    }

    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public String getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Api, Builder> implements ApiOrBuilder {
        public Builder() {
            super(Api.DEFAULT_INSTANCE);
        }

        public Builder addAllMethods(Iterable<? extends Method> iterable) {
            copyOnWrite();
            Api.R((Api) this.instance, iterable);
            return this;
        }

        public Builder addAllMixins(Iterable<? extends Mixin> iterable) {
            copyOnWrite();
            Api.H((Api) this.instance, iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            Api.u((Api) this.instance, iterable);
            return this;
        }

        public Builder addMethods(Method method) {
            copyOnWrite();
            Api.P((Api) this.instance, method);
            return this;
        }

        public Builder addMixins(Mixin mixin) {
            copyOnWrite();
            Api.F((Api) this.instance, mixin);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Api.s((Api) this.instance, option);
            return this;
        }

        public Builder clearMethods() {
            copyOnWrite();
            Api.S((Api) this.instance);
            return this;
        }

        public Builder clearMixins() {
            copyOnWrite();
            Api.I((Api) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Api.B((Api) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Api.v((Api) this.instance);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            Api.D((Api) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Api.N((Api) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            Api.y((Api) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public Method getMethods(int i10) {
            return ((Api) this.instance).getMethods(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            return ((Api) this.instance).getMethodsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public List<Method> getMethodsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMethodsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public Mixin getMixins(int i10) {
            return ((Api) this.instance).getMixins(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            return ((Api) this.instance).getMixinsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public List<Mixin> getMixinsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMixinsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public String getName() {
            return ((Api) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
            return ((Api) this.instance).getNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public Option getOptions(int i10) {
            return ((Api) this.instance).getOptions(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            return ((Api) this.instance).getOptionsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Api) this.instance).getOptionsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
            return ((Api) this.instance).getSourceContext();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
            return ((Api) this.instance).getSyntax();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return ((Api) this.instance).getSyntaxValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public String getVersion() {
            return ((Api) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
            return ((Api) this.instance).getVersionBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return ((Api) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Api.C((Api) this.instance, sourceContext);
            return this;
        }

        public Builder removeMethods(int i10) {
            copyOnWrite();
            Api.T((Api) this.instance, i10);
            return this;
        }

        public Builder removeMixins(int i10) {
            copyOnWrite();
            Api.J((Api) this.instance, i10);
            return this;
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            Api.w((Api) this.instance, i10);
            return this;
        }

        public Builder setMethods(int i10, Method method) {
            copyOnWrite();
            Api.O((Api) this.instance, i10, method);
            return this;
        }

        public Builder setMixins(int i10, Mixin mixin) {
            copyOnWrite();
            Api.E((Api) this.instance, i10, mixin);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Api.q((Api) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Api.M((Api) this.instance, byteString);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            Api.r((Api) this.instance, i10, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Api.A((Api) this.instance, sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Api.L((Api) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            Api.K((Api) this.instance, i10);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            Api.x((Api) this.instance, str);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            copyOnWrite();
            Api.z((Api) this.instance, byteString);
            return this;
        }

        public Builder addMethods(int i10, Method method) {
            copyOnWrite();
            Api.Q((Api) this.instance, i10, method);
            return this;
        }

        public Builder addMixins(int i10, Mixin mixin) {
            copyOnWrite();
            Api.G((Api) this.instance, i10, mixin);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            Api.t((Api) this.instance, i10, option);
            return this;
        }

        public Builder setMethods(int i10, Method.Builder builder) {
            copyOnWrite();
            Api.O((Api) this.instance, i10, builder.build());
            return this;
        }

        public Builder setMixins(int i10, Mixin.Builder builder) {
            copyOnWrite();
            Api.E((Api) this.instance, i10, builder.build());
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Api.r((Api) this.instance, i10, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            Api.A((Api) this.instance, builder.build());
            return this;
        }

        public Builder addMethods(Method.Builder builder) {
            copyOnWrite();
            Api.P((Api) this.instance, builder.build());
            return this;
        }

        public Builder addMixins(Mixin.Builder builder) {
            copyOnWrite();
            Api.F((Api) this.instance, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Api.s((Api) this.instance, builder.build());
            return this;
        }

        public Builder addMethods(int i10, Method.Builder builder) {
            copyOnWrite();
            Api.Q((Api) this.instance, i10, builder.build());
            return this;
        }

        public Builder addMixins(int i10, Mixin.Builder builder) {
            copyOnWrite();
            Api.G((Api) this.instance, i10, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Api.t((Api) this.instance, i10, builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Api api) {
        return DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
