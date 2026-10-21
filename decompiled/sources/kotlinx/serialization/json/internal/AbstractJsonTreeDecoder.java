package kotlinx.serialization.json.internal;

import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010>\u001a\u00020\u0003¢\u0006\u0004\bI\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0004J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000bH$J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010(\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0018\u00102\u001a\u0002012\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000fH\u0014J\u0010\u00103\u001a\u0002012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u000bH\u0002J\u0014\u00108\u001a\u000207*\u00020\u00182\u0006\u00106\u001a\u00020\u000bH\u0002R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0001\u0003KLM¨\u0006N"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/JsonElement;", "currentObject", "decodeJsonElement", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "", "parentName", "childName", "composeName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "", "endStructure", "", "decodeNotNullMark", LogKeysKt.TAG, "Lkotlinx/serialization/json/JsonPrimitive;", "getPrimitiveValue", "currentElement", "enumDescriptor", "", "decodeTaggedEnum", "", "decodeTaggedNull", "decodeTaggedNotNullMark", "decodeTaggedBoolean", "", "decodeTaggedByte", "", "decodeTaggedShort", "decodeTaggedInt", "", "decodeTaggedLong", "", "decodeTaggedFloat", "", "decodeTaggedDouble", "", "decodeTaggedChar", "decodeTaggedString", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "decodeTaggedInline", "decodeInline", TreeJsonEncoderKt.PRIMITIVE_TAG, "unparsedPrimitive", "type", "Lkotlinx/serialization/json/JsonLiteral;", "asLiteral", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonElement;", "getValue", "()Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,326:1\n129#1,4:364\n129#1,4:368\n129#1,4:372\n129#1,4:376\n129#1,4:380\n129#1,4:384\n129#1,4:388\n129#1,4:392\n1#2:327\n252#3,7:328\n252#3,7:340\n252#3,7:349\n252#3,7:357\n36#4,5:335\n41#4,2:347\n44#4:356\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n94#1:364,4\n97#1:368,4\n103#1:372,4\n109#1:376,4\n110#1:380,4\n113#1:384,4\n120#1:388,4\n126#1:392,4\n60#1:328,7\n63#1:340,7\n64#1:349,7\n66#1:357,7\n61#1:335,5\n61#1:347,2\n61#1:356\n*E\n"})
abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {

    @JvmField
    @NotNull
    protected final JsonConfiguration configuration;

    @NotNull
    private final Json json;

    @NotNull
    private final JsonElement value;

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement);
    }

    private final JsonLiteral asLiteral(JsonPrimitive jsonPrimitive, String str) {
        JsonLiteral jsonLiteral = jsonPrimitive instanceof JsonLiteral ? (JsonLiteral) jsonPrimitive : null;
        if (jsonLiteral != null) {
            return jsonLiteral;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    private final Void unparsedPrimitive(String primitive) {
        throw JsonExceptionsKt.JsonDecodingException(-1, h0.b("Failed to parse literal as '", primitive, "' value"), currentObject().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementCurrentObject = currentObject();
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) || (kind instanceof PolymorphicKind)) {
            Json json = getJson();
            if (jsonElementCurrentObject instanceof JsonArray) {
                return new JsonTreeListDecoder(json, (JsonArray) jsonElementCurrentObject);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()));
        }
        if (!Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json2 = getJson();
            if (jsonElementCurrentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json2, (JsonObject) jsonElementCurrentObject, null, null, 12, null);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()));
        }
        Json json3 = getJson();
        SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json3.getSerializersModule());
        SerialKind kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof PrimitiveKind) || Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
            Json json4 = getJson();
            if (jsonElementCurrentObject instanceof JsonObject) {
                return new JsonTreeMapDecoder(json4, (JsonObject) jsonElementCurrentObject);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()));
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
        }
        Json json5 = getJson();
        if (jsonElementCurrentObject instanceof JsonArray) {
            return new JsonTreeListDecoder(json5, (JsonArray) jsonElementCurrentObject);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementCurrentObject.getClass()));
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    @NotNull
    public String composeName(@NotNull String parentName, @NotNull String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @NotNull
    public abstract JsonElement currentElement(@NotNull String tag);

    @NotNull
    public final JsonElement currentObject() {
        JsonElement jsonElementCurrentElement;
        String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (jsonElementCurrentElement = currentElement(currentTagOrNull)) == null) ? getValue() : jsonElementCurrentElement;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : new JsonPrimitiveDecoder(getJson(), getValue()).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    @Nullable
    public Void decodeTaggedNull(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    @NotNull
    public final JsonPrimitive getPrimitiveValue(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        JsonPrimitive jsonPrimitive = jsonElementCurrentElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElementCurrentElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected JsonPrimitive at " + tag + ", found " + jsonElementCurrentElement, currentObject().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @NotNull
    public abstract JsonElement getValue();

    private AbstractJsonTreeDecoder(Json json, JsonElement jsonElement) {
        this.json = json;
        this.value = jsonElement;
        this.configuration = getJson().getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedBoolean(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(getPrimitiveValue(tag));
            if (booleanOrNull != null) {
                return booleanOrNull.booleanValue();
            }
            unparsedPrimitive(TypedValues.Custom.S_BOOLEAN);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(TypedValues.Custom.S_BOOLEAN);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public byte decodeTaggedByte(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int i10 = JsonElementKt.getInt(getPrimitiveValue(tag));
            Byte bValueOf = (-128 > i10 || i10 > 127) ? null : Byte.valueOf((byte) i10);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            unparsedPrimitive("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("byte");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public char decodeTaggedChar(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return StringsKt___StringsKt.single(getPrimitiveValue(tag).getContent());
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("char");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public double decodeTaggedDouble(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            double d2 = JsonElementKt.getDouble(getPrimitiveValue(tag));
            if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || !(Double.isInfinite(d2) || Double.isNaN(d2))) {
                return d2;
            }
            throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d2), tag, currentObject().toString());
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, getJson(), getPrimitiveValue(tag).getContent(), null, 4, null);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public float decodeTaggedFloat(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            float f6 = JsonElementKt.getFloat(getPrimitiveValue(tag));
            if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || !(Float.isInfinite(f6) || Float.isNaN(f6))) {
                return f6;
            }
            throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f6), tag, currentObject().toString());
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(TypedValues.Custom.S_FLOAT);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    @NotNull
    public Decoder decodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new JsonDecoderForUnsignedTypes(new StringJsonLexer(getPrimitiveValue(tag).getContent()), getJson()) : super.decodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedInt(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return JsonElementKt.getInt(getPrimitiveValue(tag));
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("int");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public long decodeTaggedLong(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return JsonElementKt.getLong(getPrimitiveValue(tag));
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("long");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedNotNullMark(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return currentElement(tag) != JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public short decodeTaggedShort(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int i10 = JsonElementKt.getInt(getPrimitiveValue(tag));
            Short shValueOf = (-32768 > i10 || i10 > 32767) ? null : Short.valueOf((short) i10);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            unparsedPrimitive("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("short");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    @NotNull
    public String decodeTaggedString(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive primitiveValue = getPrimitiveValue(tag);
        if (!getJson().getConfiguration().getIsLenient() && !asLiteral(primitiveValue, "string").getIsString()) {
            throw JsonExceptionsKt.JsonDecodingException(-1, h0.b("String literal for key '", tag, "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), currentObject().toString());
        }
        if (primitiveValue instanceof JsonNull) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' value instead of string literal", currentObject().toString());
        }
        return primitiveValue.getContent();
    }
}
