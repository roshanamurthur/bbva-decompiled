package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Method extends GeneratedMessageLite<Method, Builder> implements MethodOrBuilder {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile Parser<Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20978a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20978a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20978a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20978a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20978a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20978a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20978a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20978a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        GeneratedMessageLite.registerDefaultInstance(Method.class, method);
    }

    public static void A(int i10, Method method) {
        method.syntax_ = i10;
    }

    public static void B(Method method, Syntax syntax) {
        method.getClass();
        syntax.getClass();
        method.syntax_ = syntax.getNumber();
    }

    public static void C(Method method) {
        method.syntax_ = 0;
    }

    public static void D(Method method, ByteString byteString) {
        method.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        method.name_ = byteString.toStringUtf8();
    }

    public static void E(Method method, String str) {
        method.getClass();
        str.getClass();
        method.requestTypeUrl_ = str;
    }

    public static void F(Method method) {
        method.getClass();
        method.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    public static void G(Method method, ByteString byteString) {
        method.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        method.requestTypeUrl_ = byteString.toStringUtf8();
    }

    public static void H(Method method, boolean z10) {
        method.requestStreaming_ = z10;
    }

    public static void I(Method method) {
        method.requestStreaming_ = false;
    }

    public static void J(Method method, String str) {
        method.getClass();
        str.getClass();
        method.responseTypeUrl_ = str;
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void l(Method method, String str) {
        method.getClass();
        str.getClass();
        method.name_ = str;
    }

    public static void m(Method method) {
        method.getClass();
        method.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    public static void n(Method method, ByteString byteString) {
        method.getClass();
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        method.responseTypeUrl_ = byteString.toStringUtf8();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void o(Method method, boolean z10) {
        method.responseStreaming_ = z10;
    }

    public static void p(Method method) {
        method.responseStreaming_ = false;
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Method method, int i10, Option option) {
        method.getClass();
        option.getClass();
        method.K();
        method.options_.set(i10, option);
    }

    public static void r(Method method, int i10, Option.Builder builder) {
        method.K();
        method.options_.set(i10, builder.build());
    }

    public static void s(Method method, Option option) {
        method.getClass();
        option.getClass();
        method.K();
        method.options_.add(option);
    }

    public static void t(Method method, int i10, Option option) {
        method.getClass();
        option.getClass();
        method.K();
        method.options_.add(i10, option);
    }

    public static void u(Method method, Option.Builder builder) {
        method.K();
        method.options_.add(builder.build());
    }

    public static void v(Method method, int i10, Option.Builder builder) {
        method.K();
        method.options_.add(i10, builder.build());
    }

    public static void w(Method method) {
        method.getClass();
        method.name_ = getDefaultInstance().getName();
    }

    public static void x(Method method, Iterable iterable) {
        method.K();
        AbstractMessageLite.addAll(iterable, (List) method.options_);
    }

    public static void y(Method method) {
        method.getClass();
        method.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void z(int i10, Method method) {
        method.K();
        method.options_.remove(i10);
    }

    public final void K() {
        if (this.options_.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f20978a[methodToInvoke.ordinal()]) {
            case 1:
                return new Method();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Method> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Method.class) {
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

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getRequestTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getResponseTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Method, Builder> implements MethodOrBuilder {
        public Builder() {
            super(Method.DEFAULT_INSTANCE);
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            Method.x((Method) this.instance, iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Method.s((Method) this.instance, option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Method.w((Method) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Method.y((Method) this.instance);
            return this;
        }

        public Builder clearRequestStreaming() {
            copyOnWrite();
            Method.I((Method) this.instance);
            return this;
        }

        public Builder clearRequestTypeUrl() {
            copyOnWrite();
            Method.F((Method) this.instance);
            return this;
        }

        public Builder clearResponseStreaming() {
            copyOnWrite();
            Method.p((Method) this.instance);
            return this;
        }

        public Builder clearResponseTypeUrl() {
            copyOnWrite();
            Method.m((Method) this.instance);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Method.C((Method) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getName() {
            return ((Method) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getNameBytes() {
            return ((Method) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Option getOptions(int i10) {
            return ((Method) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getOptionsCount() {
            return ((Method) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Method) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
            return ((Method) this.instance).getRequestStreaming();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getRequestTypeUrl() {
            return ((Method) this.instance).getRequestTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getRequestTypeUrlBytes() {
            return ((Method) this.instance).getRequestTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
            return ((Method) this.instance).getResponseStreaming();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getResponseTypeUrl() {
            return ((Method) this.instance).getResponseTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getResponseTypeUrlBytes() {
            return ((Method) this.instance).getResponseTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Syntax getSyntax() {
            return ((Method) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
            return ((Method) this.instance).getSyntaxValue();
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            Method.z(i10, (Method) this.instance);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Method.l((Method) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Method.D((Method) this.instance, byteString);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            Method.q((Method) this.instance, i10, option);
            return this;
        }

        public Builder setRequestStreaming(boolean z10) {
            copyOnWrite();
            Method.H((Method) this.instance, z10);
            return this;
        }

        public Builder setRequestTypeUrl(String str) {
            copyOnWrite();
            Method.E((Method) this.instance, str);
            return this;
        }

        public Builder setRequestTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            Method.G((Method) this.instance, byteString);
            return this;
        }

        public Builder setResponseStreaming(boolean z10) {
            copyOnWrite();
            Method.o((Method) this.instance, z10);
            return this;
        }

        public Builder setResponseTypeUrl(String str) {
            copyOnWrite();
            Method.J((Method) this.instance, str);
            return this;
        }

        public Builder setResponseTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            Method.n((Method) this.instance, byteString);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            Method.B((Method) this.instance, syntax);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            Method.A(i10, (Method) this.instance);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            Method.t((Method) this.instance, i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Method.r((Method) this.instance, i10, builder);
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Method.u((Method) this.instance, builder);
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Method.v((Method) this.instance, i10, builder);
            return this;
        }
    }

    public static Builder newBuilder(Method method) {
        return DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Method parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Method parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Method parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Method parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Method parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
