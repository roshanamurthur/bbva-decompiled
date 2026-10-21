package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00109\u001a\u000208\u0012\u0010\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010;¢\u0006\u0004\bJ\u0010KB1\b\u0010\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00109\u001a\u000208\u0012\u000e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010;¢\u0006\u0004\bJ\u0010NJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J+\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016JA\u0010\u0019\u001a\u00020\u0005\"\b\b\u0000\u0010\u000e*\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020$H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020*H\u0016J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006O"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "encodeTypeInfo", "Lkotlinx/serialization/json/JsonElement;", "element", "encodeJsonElement", "", FirebaseAnalytics.Param.INDEX, "", "shouldEncodeElementDefault", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginStructure", "endStructure", "encodeElement", "", "encodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encodeInline", "encodeNull", "encodeBoolean", "", "encodeByte", "", "encodeShort", "encodeInt", "", "encodeLong", "", "encodeFloat", "", "encodeDouble", "", "encodeChar", "", "encodeString", "enumDescriptor", "encodeEnum", "Lkotlinx/serialization/json/internal/Composer;", "composer", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "Lkotlinx/serialization/json/internal/WriteMode;", "", "modeReuseCache", "[Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "forceQuoting", "Z", "polymorphicDiscriminator", "Ljava/lang/String;", "<init>", "(Lkotlinx/serialization/json/internal/Composer;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "output", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n170#1,2:251\n170#1,2:253\n21#2,12:225\n35#2,13:238\n1#3:237\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n161#1:251,2\n162#1:253,2\n64#1:225,12\n64#1:238,13\n64#1:237\n*E\n"})
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {

    @NotNull
    private final Composer composer;

    @NotNull
    private final JsonConfiguration configuration;
    private boolean forceQuoting;

    @NotNull
    private final Json json;

    @NotNull
    private final WriteMode mode;

    @Nullable
    private final JsonEncoder[] modeReuseCache;

    @Nullable
    private String polymorphicDiscriminator;

    @NotNull
    private final SerializersModule serializersModule;

    /* JADX INFO: compiled from: StreamingJsonEncoder.kt */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonEncoder(@NotNull Composer composer, @NotNull Json json, @NotNull WriteMode mode, @Nullable JsonEncoder[] jsonEncoderArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = jsonEncoderArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = mode.ordinal();
        if (jsonEncoderArr != null) {
            JsonEncoder jsonEncoder = jsonEncoderArr[iOrdinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[iOrdinal] = this;
        }
    }

    private final void encodeTypeInfo(SerialDescriptor descriptor) {
        this.composer.nextItem();
        String str = this.polymorphicDiscriminator;
        Intrinsics.checkNotNull(str);
        encodeString(str);
        this.composer.print(AbstractJsonLexerKt.COLON);
        this.composer.space();
        encodeString(descriptor.getSerialName());
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
        JsonEncoder jsonEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(getJson(), descriptor);
        char c10 = writeModeSwitchMode.begin;
        if (c10 != 0) {
            this.composer.print(c10);
            this.composer.indent();
        }
        if (this.polymorphicDiscriminator != null) {
            encodeTypeInfo(descriptor);
            this.polymorphicDiscriminator = null;
        }
        if (this.mode == writeModeSwitchMode) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        return (jsonEncoderArr == null || (jsonEncoder = jsonEncoderArr[writeModeSwitchMode.ordinal()]) == null) ? new StreamingJsonEncoder(this.composer, getJson(), writeModeSwitchMode, this.modeReuseCache) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char value) {
        encodeString(String.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i10 != 1) {
            boolean z10 = false;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.print(AbstractJsonLexerKt.COMMA);
                    }
                    this.composer.nextItem();
                    encodeString(JsonNamesMapKt.getJsonElementName(descriptor, getJson(), index));
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                } else {
                    if (index == 0) {
                        this.forceQuoting = true;
                    }
                    if (index == 1) {
                        this.composer.print(AbstractJsonLexerKt.COMMA);
                        this.composer.space();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.nextItem();
            } else {
                if (index % 2 == 0) {
                    this.composer.print(AbstractJsonLexerKt.COMMA);
                    this.composer.nextItem();
                    z10 = true;
                } else {
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                }
                this.forceQuoting = z10;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.print(AbstractJsonLexerKt.COMMA);
            }
            this.composer.nextItem();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(index));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            Composer composerForUnsignedNumbers = this.composer;
            if (!(composerForUnsignedNumbers instanceof ComposerForUnsignedNumbers)) {
                composerForUnsignedNumbers = new ComposerForUnsignedNumbers(composerForUnsignedNumbers.writer, this.forceQuoting);
            }
            return new StreamingJsonEncoder(composerForUnsignedNumbers, getJson(), this.mode, (JsonEncoder[]) null);
        }
        if (!StreamingJsonEncoderKt.isUnquotedLiteral(descriptor)) {
            return super.encodeInline(descriptor);
        }
        Composer composerForUnquotedLiterals = this.composer;
        if (!(composerForUnquotedLiterals instanceof ComposerForUnquotedLiterals)) {
            composerForUnquotedLiterals = new ComposerForUnquotedLiterals(composerForUnquotedLiterals.writer, this.forceQuoting);
        }
        return new StreamingJsonEncoder(composerForUnquotedLiterals, getJson(), this.mode, (JsonEncoder[]) null);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.composer.print(AbstractJsonLexerKt.NULL);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, index, serializer, value);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
        String strClassDiscriminator;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, value);
            return;
        }
        boolean z10 = serializer instanceof AbstractPolymorphicSerializer;
        if (!z10) {
            int i10 = PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                SerialKind kind = serializer.getDescriptor().getKind();
                strClassDiscriminator = (Intrinsics.areEqual(kind, StructureKind.CLASS.INSTANCE) || Intrinsics.areEqual(kind, StructureKind.OBJECT.INSTANCE)) ? PolymorphicKt.classDiscriminator(serializer.getDescriptor(), getJson()) : null;
            }
        } else if (getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
        }
        if (z10) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            if (value == 0) {
                throw new IllegalArgumentException(("Value for serializer " + serializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            SerializationStrategy<? super T> serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, this, value);
            if (strClassDiscriminator != null) {
                PolymorphicKt.validateIfSealed(serializer, serializationStrategyFindPolymorphicSerializer, strClassDiscriminator);
            }
            PolymorphicKt.checkKind(serializationStrategyFindPolymorphicSerializer.getDescriptor().getKind());
            Intrinsics.checkNotNull(serializationStrategyFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = serializationStrategyFindPolymorphicSerializer;
        }
        if (strClassDiscriminator != null) {
            this.polymorphicDiscriminator = strClassDiscriminator;
        }
        serializer.serialize(this, value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.composer.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.unIndent();
            this.composer.nextItemIfNotFirst();
            this.composer.print(this.mode.end);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(@NotNull InternalJsonWriter output, @NotNull Json json, @NotNull WriteMode mode, @NotNull JsonEncoder[] modeReuseCache) {
        this(ComposersKt.Composer(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
