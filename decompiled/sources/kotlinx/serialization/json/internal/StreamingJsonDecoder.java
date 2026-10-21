package kotlinx.serialization.json.internal;

import androidx.camera.core.impl.utils.a;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001TB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u000bH\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u00100\u001a\u00020\u0012H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0012H\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0012H\u0002J\b\u00107\u001a\u00020 H\u0016J\n\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002J;\u0010;\u001a\u0002H<\"\u0004\b\u0000\u0010<2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00122\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H<0>2\b\u0010?\u001a\u0004\u0018\u0001H<H\u0016¢\u0006\u0002\u0010@J!\u0010A\u001a\u0002H<\"\u0004\b\u0000\u0010<2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H<0>H\u0016¢\u0006\u0002\u0010BJ\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020FH\u0016J+\u0010G\u001a\u00020\u001e2!\u0010H\u001a\u001d\u0012\u0013\u0012\u00110F¢\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u001e0IH\u0016J\b\u0010M\u001a\u00020FH\u0002J\u0010\u0010N\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020FH\u0002J\u0010\u0010Q\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010R\u001a\u00020 *\u0004\u0018\u00010\r2\u0006\u0010S\u001a\u00020FH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006U"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/ChunkedDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "json", "Lkotlinx/serialization/json/Json;", "mode", "Lkotlinx/serialization/json/internal/WriteMode;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "discriminatorHolder", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;)V", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "currentIndex", "", "elementMarker", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "getJson", "()Lkotlinx/serialization/json/Json;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "checkLeadingComma", "", "coerceInputValue", "", FirebaseAnalytics.Param.INDEX, "decodeBoolean", "decodeByte", "", "decodeChar", "", "decodeDouble", "", "decodeElementIndex", "decodeEnum", "enumDescriptor", "decodeFloat", "", "decodeInline", "Lkotlinx/serialization/encoding/Decoder;", "decodeInt", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "decodeListIndex", "decodeLong", "", "decodeMapIndex", "decodeNotNullMark", "decodeNull", "", "decodeObjectIndex", "decodeSerializableElement", ExifInterface.GPS_DIRECTION_TRUE, "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "previousValue", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeShort", "", "decodeString", "", "decodeStringChunked", "consumeChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "chunk", "decodeStringKey", "endStructure", "handleUnknown", "key", "skipLeftoverElements", "trySkip", "unknownKey", "DiscriminatorHolder", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 4 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n531#2,3:392\n531#2,3:395\n119#3,17:398\n384#4,5:415\n384#4,5:420\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n202#1:392,3\n203#1:395,3\n215#1:398,17\n308#1:415,5\n315#1:420,5\n*E\n"})
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder, ChunkedDecoder {

    @NotNull
    private final JsonConfiguration configuration;
    private int currentIndex;

    @Nullable
    private DiscriminatorHolder discriminatorHolder;

    @Nullable
    private final JsonElementMarker elementMarker;

    @NotNull
    private final Json json;

    @JvmField
    @NotNull
    public final AbstractJsonLexer lexer;

    @NotNull
    private final WriteMode mode;

    @NotNull
    private final SerializersModule serializersModule;

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "", "discriminatorToSkip", "", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DiscriminatorHolder {

        @JvmField
        @Nullable
        public String discriminatorToSkip;

        public DiscriminatorHolder(@Nullable String str) {
            this.discriminatorToSkip = str;
        }
    }

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonDecoder(@NotNull Json json, @NotNull WriteMode mode, @NotNull AbstractJsonLexer lexer, @NotNull SerialDescriptor descriptor, @Nullable DiscriminatorHolder discriminatorHolder) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean coerceInputValue(SerialDescriptor descriptor, int index) {
        String strPeekString;
        Json json = this.json;
        if (!descriptor.isElementOptional(index)) {
            return false;
        }
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (elementDescriptor.isNullable() || !this.lexer.tryConsumeNull(true)) {
            if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
                return false;
            }
            if ((elementDescriptor.isNullable() && this.lexer.tryConsumeNull(false)) || (strPeekString = this.lexer.peekString(this.configuration.getIsLenient())) == null || JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, strPeekString) != -3) {
                return false;
            }
            this.lexer.consumeString();
        }
        return true;
    }

    private final int decodeListIndex() {
        boolean zTryConsumeComma = this.lexer.tryConsumeComma();
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
            throw new KotlinNothingValueException();
        }
        int i10 = this.currentIndex;
        if (i10 != -1 && !zTryConsumeComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.currentIndex = i11;
        return i11;
    }

    private final int decodeMapIndex() {
        int i10 = this.currentIndex;
        boolean zTryConsumeComma = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
        } else if (i10 != -1) {
            zTryConsumeComma = this.lexer.tryConsumeComma();
        }
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.currentIndex == -1) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                boolean z11 = !zTryConsumeComma;
                int i11 = abstractJsonLexer.currentPosition;
                if (!z11) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected leading comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                int i12 = abstractJsonLexer2.currentPosition;
                if (!zTryConsumeComma) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.currentIndex + 1;
        this.currentIndex = i13;
        return i13;
    }

    private final int decodeObjectIndex(SerialDescriptor descriptor) {
        boolean zTryConsumeComma;
        boolean zTryConsumeComma2 = this.lexer.tryConsumeComma();
        while (true) {
            boolean z10 = true;
            if (!this.lexer.canConsumeValue()) {
                if (zTryConsumeComma2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.nextUnmarkedIndex$kotlinx_serialization_json();
                }
                return -1;
            }
            String strDecodeStringKey = decodeStringKey();
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(descriptor, this.json, strDecodeStringKey);
            if (jsonNameIndex == -3) {
                zTryConsumeComma = false;
            } else {
                if (!this.configuration.getCoerceInputValues() || !coerceInputValue(descriptor, jsonNameIndex)) {
                    JsonElementMarker jsonElementMarker2 = this.elementMarker;
                    if (jsonElementMarker2 != null) {
                        jsonElementMarker2.mark$kotlinx_serialization_json(jsonNameIndex);
                    }
                    return jsonNameIndex;
                }
                zTryConsumeComma = this.lexer.tryConsumeComma();
                z10 = false;
            }
            zTryConsumeComma2 = z10 ? handleUnknown(strDecodeStringKey) : zTryConsumeComma;
        }
    }

    private final String decodeStringKey() {
        return this.configuration.getIsLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeKeyString();
    }

    private final boolean handleUnknown(String key) {
        if (this.configuration.getIgnoreUnknownKeys() || trySkip(this.discriminatorHolder, key)) {
            this.lexer.skipElement(this.configuration.getIsLenient());
        } else {
            this.lexer.failOnUnknownKey(key);
        }
        return this.lexer.tryConsumeComma();
    }

    private final void skipLeftoverElements(SerialDescriptor descriptor) {
        while (decodeElementIndex(descriptor) != -1) {
        }
    }

    private final boolean trySkip(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !Intrinsics.areEqual(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(writeModeSwitchMode.begin);
        checkLeadingComma();
        int i10 = WhenMappings.$EnumSwitchMapping$0[writeModeSwitchMode.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == writeModeSwitchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.lexer.consumeBooleanLenient();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b10 = (byte) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == b10) {
            return b10;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String strConsumeStringLenient = this.lexer.consumeStringLenient();
        if (strConsumeStringLenient.length() == 1) {
            return strConsumeStringLenient.charAt(0);
        }
        AbstractJsonLexer.fail$default(this.lexer, a.a("Expected single char, but got '", strConsumeStringLenient, '\''), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double d2 = Double.parseDouble(strConsumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || !(Double.isInfinite(d2) || Double.isNaN(d2))) {
                return d2;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(d2));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, a.a("Failed to parse type 'double' for input '", strConsumeStringLenient, '\''), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        int iDecodeMapIndex;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i10 != 2) {
            iDecodeMapIndex = i10 != 4 ? decodeListIndex() : decodeObjectIndex(descriptor);
        } else {
            iDecodeMapIndex = decodeMapIndex();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(iDecodeMapIndex);
        }
        return iDecodeMapIndex;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float f6 = Float.parseFloat(strConsumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || !(Float.isInfinite(f6) || Float.isNaN(f6))) {
                return f6;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(f6));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, a.a("Failed to parse type 'float' for input '", strConsumeStringLenient, '\''), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i10 = (int) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == i10) {
            return i10;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return (jsonElementMarker == null || !jsonElementMarker.getIsUnmarkedNull()) && !AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z10 = this.mode == WriteMode.MAP && (index & 1) == 0;
        if (z10) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t10 = (T) super.decodeSerializableElement(descriptor, index, deserializer, previousValue);
        if (z10) {
            this.lexer.path.updateCurrentMapKey(t10);
        }
        return t10;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractPolymorphicSerializer) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
                String strClassDiscriminator = PolymorphicKt.classDiscriminator(deserializer.getDescriptor(), this.json);
                String strPeekLeadingMatchingValue = this.lexer.peekLeadingMatchingValue(strClassDiscriminator, this.configuration.getIsLenient());
                if (strPeekLeadingMatchingValue == null) {
                    return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
                }
                try {
                    DeserializationStrategy deserializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, strPeekLeadingMatchingValue);
                    Intrinsics.checkNotNull(deserializationStrategyFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.discriminatorHolder = new DiscriminatorHolder(strClassDiscriminator);
                    return (T) deserializationStrategyFindPolymorphicSerializer.deserialize(this);
                } catch (SerializationException e5) {
                    String message = e5.getMessage();
                    Intrinsics.checkNotNull(message);
                    String strRemoveSuffix = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.substringBefore$default(message, '\n', (String) null, 2, (Object) null), (CharSequence) Constant.DOT_STRING);
                    String message2 = e5.getMessage();
                    Intrinsics.checkNotNull(message2);
                    AbstractJsonLexer.fail$default(this.lexer, strRemoveSuffix, 0, StringsKt__StringsKt.substringAfter(message2, '\n', ""), 2, null);
                    throw new KotlinNothingValueException();
                }
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e7) {
            String message3 = e7.getMessage();
            Intrinsics.checkNotNull(message3);
            if (StringsKt__StringsKt.contains$default((CharSequence) message3, (CharSequence) "at path", false, 2, (Object) null)) {
                throw e7;
            }
            throw new MissingFieldException(e7.getMissingFields(), e7.getMessage() + " at path: " + this.lexer.path.getPath(), e7);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s4 = (short) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == s4) {
            return s4;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        return this.configuration.getIsLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.ChunkedDecoder
    public void decodeStringChunked(@NotNull Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        this.lexer.consumeStringChunked(this.configuration.getIsLenient(), consumeChunk);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            skipLeftoverElements(descriptor);
        }
        if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            throw new KotlinNothingValueException();
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
