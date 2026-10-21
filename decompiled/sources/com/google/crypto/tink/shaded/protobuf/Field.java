package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Field extends GeneratedMessageLite<Field, Builder> implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    public enum Cardinality implements Internal.EnumLite {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Cardinality> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<Cardinality> {
            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i10) {
                return Cardinality.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47053a = new b();

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return Cardinality.forNumber(i10) != null;
            }
        }

        Cardinality(int i10) {
            this.value = i10;
        }

        public static Cardinality forNumber(int i10) {
            if (i10 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i10 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i10 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i10 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static Internal.EnumLiteMap<Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f47053a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Cardinality valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public enum Kind implements Internal.EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Kind> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<Kind> {
            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i10) {
                return Kind.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47054a = new b();

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return Kind.forNumber(i10) != null;
            }
        }

        Kind(int i10) {
            this.value = i10;
        }

        public static Kind forNumber(int i10) {
            switch (i10) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f47054a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Kind valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47055a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f47055a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47055a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47055a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47055a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47055a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47055a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47055a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.registerDefaultInstance(Field.class, field);
    }

    public static void A(Field field, int i10, Option option) {
        field.getClass();
        option.getClass();
        field.U();
        field.options_.set(i10, option);
    }

    public static void B(Field field, Kind kind) {
        field.getClass();
        field.kind_ = kind.getNumber();
    }

    public static void C(Field field, Option option) {
        field.getClass();
        option.getClass();
        field.U();
        field.options_.add(option);
    }

    public static void D(Field field, int i10, Option option) {
        field.getClass();
        option.getClass();
        field.U();
        field.options_.add(i10, option);
    }

    public static void E(Field field, Iterable iterable) {
        field.U();
        AbstractMessageLite.addAll(iterable, (List) field.options_);
    }

    public static void F(Field field) {
        field.getClass();
        field.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static void G(int i10, Field field) {
        field.U();
        field.options_.remove(i10);
    }

    public static void H(Field field, String str) {
        field.getClass();
        str.getClass();
        field.jsonName_ = str;
    }

    public static void I(Field field) {
        field.getClass();
        field.jsonName_ = getDefaultInstance().getJsonName();
    }

    public static void J(Field field, ByteString byteString) {
        field.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        field.jsonName_ = byteString.toStringUtf8();
    }

    public static void K(Field field, String str) {
        field.getClass();
        str.getClass();
        field.defaultValue_ = str;
    }

    public static void L(Field field) {
        field.getClass();
        field.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    public static void M(Field field) {
        field.kind_ = 0;
    }

    public static void N(Field field, ByteString byteString) {
        field.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        field.defaultValue_ = byteString.toStringUtf8();
    }

    public static void O(int i10, Field field) {
        field.cardinality_ = i10;
    }

    public static void P(Field field, Cardinality cardinality) {
        field.getClass();
        field.cardinality_ = cardinality.getNumber();
    }

    public static void Q(Field field) {
        field.cardinality_ = 0;
    }

    public static void R(int i10, Field field) {
        field.number_ = i10;
    }

    public static void S(Field field) {
        field.number_ = 0;
    }

    public static void T(Field field, String str) {
        field.getClass();
        str.getClass();
        field.name_ = str;
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(int i10, Field field) {
        field.kind_ = i10;
    }

    public static void r(Field field) {
        field.getClass();
        field.name_ = getDefaultInstance().getName();
    }

    public static void s(Field field, ByteString byteString) {
        field.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        field.name_ = byteString.toStringUtf8();
    }

    public static void t(Field field, String str) {
        field.getClass();
        str.getClass();
        field.typeUrl_ = str;
    }

    public static void u(Field field) {
        field.getClass();
        field.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    public static void v(Field field, ByteString byteString) {
        field.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        field.typeUrl_ = byteString.toStringUtf8();
    }

    public static void w(int i10, Field field) {
        field.oneofIndex_ = i10;
    }

    public static void x(Field field) {
        field.oneofIndex_ = 0;
    }

    public static void y(Field field, boolean z10) {
        field.packed_ = z10;
    }

    public static void z(Field field) {
        field.packed_ = false;
    }

    public final void U() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f47055a[methodToInvoke.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Field> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Field.class) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public Cardinality getCardinality() {
        Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public ByteString getDefaultValueBytes() {
        return ByteString.copyFromUtf8(this.defaultValue_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public ByteString getJsonNameBytes() {
        return ByteString.copyFromUtf8(this.jsonName_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public Kind getKind() {
        Kind kindForNumber = Kind.forNumber(this.kind_);
        return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Field, Builder> implements FieldOrBuilder {
        public Builder() {
            super(Field.DEFAULT_INSTANCE);
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            Field.E((Field) this.instance, iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Field.C((Field) this.instance, option);
            return this;
        }

        public Builder clearCardinality() {
            copyOnWrite();
            Field.Q((Field) this.instance);
            return this;
        }

        public Builder clearDefaultValue() {
            copyOnWrite();
            Field.L((Field) this.instance);
            return this;
        }

        public Builder clearJsonName() {
            copyOnWrite();
            Field.I((Field) this.instance);
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            Field.M((Field) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Field.r((Field) this.instance);
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            Field.S((Field) this.instance);
            return this;
        }

        public Builder clearOneofIndex() {
            copyOnWrite();
            Field.x((Field) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Field.F((Field) this.instance);
            return this;
        }

        public Builder clearPacked() {
            copyOnWrite();
            Field.z((Field) this.instance);
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            Field.u((Field) this.instance);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public Cardinality getCardinality() {
            return ((Field) this.instance).getCardinality();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
            return ((Field) this.instance).getCardinalityValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public String getDefaultValue() {
            return ((Field) this.instance).getDefaultValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public ByteString getDefaultValueBytes() {
            return ((Field) this.instance).getDefaultValueBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public String getJsonName() {
            return ((Field) this.instance).getJsonName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public ByteString getJsonNameBytes() {
            return ((Field) this.instance).getJsonNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public Kind getKind() {
            return ((Field) this.instance).getKind();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getKindValue() {
            return ((Field) this.instance).getKindValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public String getName() {
            return ((Field) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public ByteString getNameBytes() {
            return ((Field) this.instance).getNameBytes();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getNumber() {
            return ((Field) this.instance).getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getOneofIndex() {
            return ((Field) this.instance).getOneofIndex();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public Option getOptions(int i10) {
            return ((Field) this.instance).getOptions(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getOptionsCount() {
            return ((Field) this.instance).getOptionsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Field) this.instance).getOptionsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public boolean getPacked() {
            return ((Field) this.instance).getPacked();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public String getTypeUrl() {
            return ((Field) this.instance).getTypeUrl();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((Field) this.instance).getTypeUrlBytes();
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            Field.G(i10, (Field) this.instance);
            return this;
        }

        public Builder setCardinality(Cardinality cardinality) {
            copyOnWrite();
            Field.P((Field) this.instance, cardinality);
            return this;
        }

        public Builder setCardinalityValue(int i10) {
            copyOnWrite();
            Field.O(i10, (Field) this.instance);
            return this;
        }

        public Builder setDefaultValue(String str) {
            copyOnWrite();
            Field.K((Field) this.instance, str);
            return this;
        }

        public Builder setDefaultValueBytes(ByteString byteString) {
            copyOnWrite();
            Field.N((Field) this.instance, byteString);
            return this;
        }

        public Builder setJsonName(String str) {
            copyOnWrite();
            Field.H((Field) this.instance, str);
            return this;
        }

        public Builder setJsonNameBytes(ByteString byteString) {
            copyOnWrite();
            Field.J((Field) this.instance, byteString);
            return this;
        }

        public Builder setKind(Kind kind) {
            copyOnWrite();
            Field.B((Field) this.instance, kind);
            return this;
        }

        public Builder setKindValue(int i10) {
            copyOnWrite();
            Field.q(i10, (Field) this.instance);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Field.T((Field) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Field.s((Field) this.instance, byteString);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            Field.R(i10, (Field) this.instance);
            return this;
        }

        public Builder setOneofIndex(int i10) {
            copyOnWrite();
            Field.w(i10, (Field) this.instance);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            Field.A((Field) this.instance, i10, option);
            return this;
        }

        public Builder setPacked(boolean z10) {
            copyOnWrite();
            Field.y((Field) this.instance, z10);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            Field.t((Field) this.instance, str);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            Field.v((Field) this.instance, byteString);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            Field.D((Field) this.instance, i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Field.A((Field) this.instance, i10, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Field.C((Field) this.instance, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            Field.D((Field) this.instance, i10, builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Field field) {
        return DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Field parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Field parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Field parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Field parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Field parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
