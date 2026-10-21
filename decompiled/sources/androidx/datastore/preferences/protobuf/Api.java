package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
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
        public static final /* synthetic */ int[] f20791a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20791a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20791a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20791a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20791a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20791a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20791a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20791a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        GeneratedMessageLite.registerDefaultInstance(Api.class, api);
    }

    public static void A(Api api) {
        api.getClass();
        api.version_ = getDefaultInstance().getVersion();
    }

    public static void B(Api api, ByteString byteString) {
        api.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        api.version_ = byteString.toStringUtf8();
    }

    public static void C(Api api, SourceContext sourceContext) {
        api.getClass();
        sourceContext.getClass();
        api.sourceContext_ = sourceContext;
    }

    public static void D(Api api, SourceContext.Builder builder) {
        api.getClass();
        api.sourceContext_ = builder.build();
    }

    public static void E(Api api, SourceContext sourceContext) {
        api.getClass();
        sourceContext.getClass();
        SourceContext sourceContext2 = api.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            api.sourceContext_ = sourceContext;
        } else {
            api.sourceContext_ = SourceContext.newBuilder(api.sourceContext_).mergeFrom(sourceContext).buildPartial();
        }
    }

    public static void F(Api api) {
        api.sourceContext_ = null;
    }

    public static void G(Api api, int i10, Mixin mixin) {
        api.getClass();
        mixin.getClass();
        api.a0();
        api.mixins_.set(i10, mixin);
    }

    public static void H(Api api, ByteString byteString) {
        api.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        api.name_ = byteString.toStringUtf8();
    }

    public static void I(Api api, int i10, Mixin.Builder builder) {
        api.a0();
        api.mixins_.set(i10, builder.build());
    }

    public static void J(Api api, Mixin mixin) {
        api.getClass();
        mixin.getClass();
        api.a0();
        api.mixins_.add(mixin);
    }

    public static void K(Api api, int i10, Mixin mixin) {
        api.getClass();
        mixin.getClass();
        api.a0();
        api.mixins_.add(i10, mixin);
    }

    public static void L(Api api, Mixin.Builder builder) {
        api.a0();
        api.mixins_.add(builder.build());
    }

    public static void M(Api api, int i10, Mixin.Builder builder) {
        api.a0();
        api.mixins_.add(i10, builder.build());
    }

    public static void N(Api api, Iterable iterable) {
        api.a0();
        AbstractMessageLite.addAll(iterable, (List) api.mixins_);
    }

    public static void O(Api api) {
        api.getClass();
        api.mixins_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void P(Api api, int i10) {
        api.a0();
        api.mixins_.remove(i10);
    }

    public static void Q(Api api, int i10) {
        api.syntax_ = i10;
    }

    public static void R(Api api, Syntax syntax) {
        api.getClass();
        syntax.getClass();
        api.syntax_ = syntax.getNumber();
    }

    public static void S(Api api, int i10, Method method) {
        api.getClass();
        method.getClass();
        api.Z();
        api.methods_.set(i10, method);
    }

    public static void T(Api api) {
        api.syntax_ = 0;
    }

    public static void U(Api api, int i10, Method.Builder builder) {
        api.Z();
        api.methods_.set(i10, builder.build());
    }

    public static void V(Api api, Method method) {
        api.getClass();
        method.getClass();
        api.Z();
        api.methods_.add(method);
    }

    public static void W(Api api, int i10, Method method) {
        api.getClass();
        method.getClass();
        api.Z();
        api.methods_.add(i10, method);
    }

    public static void X(Api api, Method.Builder builder) {
        api.Z();
        api.methods_.add(builder.build());
    }

    public static void Y(Api api, int i10, Method.Builder builder) {
        api.Z();
        api.methods_.add(i10, builder.build());
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void l(Api api, String str) {
        api.getClass();
        str.getClass();
        api.name_ = str;
    }

    public static void m(Api api, Iterable iterable) {
        api.Z();
        AbstractMessageLite.addAll(iterable, (List) api.methods_);
    }

    public static void n(Api api) {
        api.getClass();
        api.methods_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(Api api, int i10) {
        api.Z();
        api.methods_.remove(i10);
    }

    public static void p(Api api, int i10, Option option) {
        api.getClass();
        option.getClass();
        api.b0();
        api.options_.set(i10, option);
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

    public static void q(Api api, int i10, Option.Builder builder) {
        api.b0();
        api.options_.set(i10, builder.build());
    }

    public static void r(Api api, Option option) {
        api.getClass();
        option.getClass();
        api.b0();
        api.options_.add(option);
    }

    public static void s(Api api, int i10, Option option) {
        api.getClass();
        option.getClass();
        api.b0();
        api.options_.add(i10, option);
    }

    public static void t(Api api, Option.Builder builder) {
        api.b0();
        api.options_.add(builder.build());
    }

    public static void u(Api api, int i10, Option.Builder builder) {
        api.b0();
        api.options_.add(i10, builder.build());
    }

    public static void v(Api api, Iterable iterable) {
        api.b0();
        AbstractMessageLite.addAll(iterable, (List) api.options_);
    }

    public static void w(Api api) {
        api.getClass();
        api.name_ = getDefaultInstance().getName();
    }

    public static void x(Api api) {
        api.getClass();
        api.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void y(Api api, int i10) {
        api.b0();
        api.options_.remove(i10);
    }

    public static void z(Api api, String str) {
        api.getClass();
        str.getClass();
        api.version_ = str;
    }

    public final void Z() {
        if (this.methods_.isModifiable()) {
            return;
        }
        this.methods_ = GeneratedMessageLite.mutableCopy(this.methods_);
    }

    public final void a0() {
        if (this.mixins_.isModifiable()) {
            return;
        }
        this.mixins_ = GeneratedMessageLite.mutableCopy(this.mixins_);
    }

    public final void b0() {
        if (this.options_.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f20791a[methodToInvoke.ordinal()]) {
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

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Method getMethods(int i10) {
        return this.methods_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public MethodOrBuilder getMethodsOrBuilder(int i10) {
        return this.methods_.get(i10);
    }

    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Mixin getMixins(int i10) {
        return this.mixins_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public MixinOrBuilder getMixinsOrBuilder(int i10) {
        return this.mixins_.get(i10);
    }

    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getVersion() {
        return this.version_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Api, Builder> implements ApiOrBuilder {
        public Builder() {
            super(Api.DEFAULT_INSTANCE);
        }

        public Builder addAllMethods(Iterable<? extends Method> iterable) {
            copyOnWrite();
            Api.m((Api) this.instance, iterable);
            return this;
        }

        public Builder addAllMixins(Iterable<? extends Mixin> iterable) {
            copyOnWrite();
            Api.N((Api) this.instance, iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            Api.v((Api) this.instance, iterable);
            return this;
        }

        public Builder addMethods(Method method) {
            copyOnWrite();
            Api.V((Api) this.instance, method);
            return this;
        }

        public Builder addMixins(Mixin mixin) {
            copyOnWrite();
            Api.J((Api) this.instance, mixin);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Api.r((Api) this.instance, option);
            return this;
        }

        public Builder clearMethods() {
            copyOnWrite();
            Api.n((Api) this.instance);
            return this;
        }

        public Builder clearMixins() {
            copyOnWrite();
            Api.O((Api) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Api.w((Api) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Api.x((Api) this.instance);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            Api.F((Api) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Api.T((Api) this.instance);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            Api.A((Api) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Method getMethods(int i10) {
            return ((Api) this.instance).getMethods(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            return ((Api) this.instance).getMethodsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Method> getMethodsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMethodsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Mixin getMixins(int i10) {
            return ((Api) this.instance).getMixins(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            return ((Api) this.instance).getMixinsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Mixin> getMixinsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMixinsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getName() {
            return ((Api) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
            return ((Api) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Option getOptions(int i10) {
            return ((Api) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            return ((Api) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Api) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
            return ((Api) this.instance).getSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
            return ((Api) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return ((Api) this.instance).getSyntaxValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getVersion() {
            return ((Api) this.instance).getVersion();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
            return ((Api) this.instance).getVersionBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return ((Api) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Api.E((Api) this.instance, sourceContext);
            return this;
        }

        public Builder removeMethods(int i10) {
            copyOnWrite();
            Api.o((Api) this.instance, i10);
            return this;
        }

        public Builder removeMixins(int i10) {
            copyOnWrite();
            Api.P((Api) this.instance, i10);
            return this;
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            Api.y((Api) this.instance, i10);
            return this;
        }

        public Builder setMethods(int i10, Method method) {
            copyOnWrite();
            Api.S((Api) this.instance, i10, method);
            return this;
        }

        public Builder setMixins(int i10, Mixin mixin) {
            copyOnWrite();
            Api.G((Api) this.instance, i10, mixin);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Api.l((Api) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Api.H((Api) this.instance, byteString);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            Api.p((Api) this.instance, i10, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            Api.C((Api) this.instance, sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Api.R((Api) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            Api.Q((Api) this.instance, i10);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            Api.z((Api) this.instance, str);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            copyOnWrite();
            Api.B((Api) this.instance, byteString);
            return this;
        }

        public Builder addMethods(int i10, Method method) {
            copyOnWrite();
            Api.W((Api) this.instance, i10, method);
            return this;
        }

        public Builder addMixins(int i10, Mixin mixin) {
            copyOnWrite();
            Api.K((Api) this.instance, i10, mixin);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            Api.s((Api) this.instance, i10, option);
            return this;
        }

        public Builder setMethods(int i10, Method.Builder builder) {
            copyOnWrite();
            Api.U((Api) this.instance, i10, builder);
            return this;
        }

        public Builder setMixins(int i10, Mixin.Builder builder) {
            copyOnWrite();
            Api.I((Api) this.instance, i10, builder);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Api.q((Api) this.instance, i10, builder);
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            Api.D((Api) this.instance, builder);
            return this;
        }

        public Builder addMethods(Method.Builder builder) {
            copyOnWrite();
            Api.X((Api) this.instance, builder);
            return this;
        }

        public Builder addMixins(Mixin.Builder builder) {
            copyOnWrite();
            Api.L((Api) this.instance, builder);
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Api.t((Api) this.instance, builder);
            return this;
        }

        public Builder addMethods(int i10, Method.Builder builder) {
            copyOnWrite();
            Api.Y((Api) this.instance, i10, builder);
            return this;
        }

        public Builder addMixins(int i10, Mixin.Builder builder) {
            copyOnWrite();
            Api.M((Api) this.instance, i10, builder);
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Api.u((Api) this.instance, i10, builder);
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
