package kotlinx.serialization.json;

import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.j;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0012\u001a\u0012\u0010\u0003\u001a\u00020\u00142\b\u0010\u0001\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0012H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0002\u001a\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0001\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0015\u0010#\u001a\u00020\u0002*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010'\u001a\u00020$*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010+\u001a\u00020(*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0015\u0010.\u001a\u00020\u0014*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0015\u00102\u001a\u00020/*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0017\u00105\u001a\u0004\u0018\u00010/*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0015\u00109\u001a\u000206*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0017\u0010<\u001a\u0004\u0018\u000106*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0015\u0010@\u001a\u00020=*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b>\u0010?\"\u0017\u0010C\u001a\u0004\u0018\u00010=*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0015\u0010G\u001a\u00020D*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u0017\u0010J\u001a\u0004\u0018\u00010D*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010I\"\u0015\u0010M\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0017\u0010P\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bN\u0010O\"\u0017\u0010S\u001a\u0004\u0018\u00010\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006T"}, d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "JsonPrimitive", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlin/UByte;", "JsonPrimitive-7apg3OU", "(B)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UShort;", "JsonPrimitive-xj2QHRw", "(S)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UInt;", "JsonPrimitive-WZ4Q5Ns", "(I)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/ULong;", "JsonPrimitive-VKZWuLQ", "(J)Lkotlinx/serialization/json/JsonPrimitive;", "", "", "Lkotlinx/serialization/json/JsonNull;", "JsonUnquotedLiteral", "Lkotlinx/serialization/json/JsonElement;", "element", "error", "key", "expected", "unexpectedJson", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonUnquotedLiteralDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "Lkotlinx/serialization/json/JsonArray;", "getJsonArray", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonArray", "getJsonNull", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonNull;", "jsonNull", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "", "getLong", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "getLongOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "getDoubleOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", TypedValues.Custom.S_FLOAT, "getFloatOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Float;", "floatOrNull", "getBoolean", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", TypedValues.Custom.S_BOOLEAN, "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,347:1\n337#1,4:348\n329#1,4:352\n337#1,4:356\n329#1,4:360\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n258#1:348,4\n268#1:352,4\n277#1:356,4\n284#1:360,4\n*E\n"})
public final class JsonElementKt {

    @NotNull
    private static final SerialDescriptor jsonUnquotedLiteralDescriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new JsonLiteral(bool, false, null, 4, null);
    }

    @ExperimentalSerializationApi
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final JsonPrimitive m6057JsonPrimitive7apg3OU(byte b10) {
        return m6058JsonPrimitiveVKZWuLQ(ULong.m5595constructorimpl(((long) b10) & 255));
    }

    @ExperimentalSerializationApi
    @SuppressAnimalSniffer
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final JsonPrimitive m6058JsonPrimitiveVKZWuLQ(long j10) {
        String str;
        if (j10 == 0) {
            str = "0";
        } else if (j10 > 0) {
            str = Long.toString(j10, 10);
        } else {
            char[] cArr = new char[64];
            long j11 = (j10 >>> 1) / ((long) 5);
            long j12 = 10;
            int i10 = 63;
            cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
            while (j11 > 0) {
                i10--;
                cArr[i10] = Character.forDigit((int) (j11 % j12), 10);
                j11 /= j12;
            }
            str = new String(cArr, i10, 64 - i10);
        }
        return JsonUnquotedLiteral(str);
    }

    @ExperimentalSerializationApi
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final JsonPrimitive m6059JsonPrimitiveWZ4Q5Ns(int i10) {
        return m6058JsonPrimitiveVKZWuLQ(ULong.m5595constructorimpl(((long) i10) & 4294967295L));
    }

    @ExperimentalSerializationApi
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final JsonPrimitive m6060JsonPrimitivexj2QHRw(short s4) {
        return m6058JsonPrimitiveVKZWuLQ(ULong.m5595constructorimpl(((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonPrimitive JsonUnquotedLiteral(@Nullable String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        if (Intrinsics.areEqual(str, JsonNull.INSTANCE.getContent())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new JsonLiteral(str, false, jsonUnquotedLiteralDescriptor);
    }

    private static final Void error(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final boolean getBoolean(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        Boolean booleanStrictOrNull = StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    @Nullable
    public static final String getContentOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final double getDouble(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return j.toDoubleOrNull(jsonPrimitive.getContent());
    }

    public static final float getFloat(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return j.toFloatOrNull(jsonPrimitive.getContent());
    }

    public static final int getInt(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            long jConsumeNumericLiteral = new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral();
            if (-2147483648L <= jConsumeNumericLiteral && jConsumeNumericLiteral <= 2147483647L) {
                return (int) jConsumeNumericLiteral;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (JsonDecodingException e5) {
            throw new NumberFormatException(e5.getMessage());
        }
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral());
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    @NotNull
    public static final JsonArray getJsonArray(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        error(jsonElement, "JsonArray");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonNull getJsonNull(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonNull jsonNull = jsonElement instanceof JsonNull ? (JsonNull) jsonElement : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        error(jsonElement, "JsonNull");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonObject getJsonObject(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        error(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonPrimitive getJsonPrimitive(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    public static final long getLong(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral();
        } catch (JsonDecodingException e5) {
            throw new NumberFormatException(e5.getMessage());
        }
    }

    @Nullable
    public static final Long getLongOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral());
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    @PublishedApi
    @NotNull
    public static final Void unexpectedJson(@NotNull String key, @NotNull String expected) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expected, "expected");
        throw new IllegalArgumentException(c.a("Element ", key, " is not a ", expected));
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(number, false, null, 4, null);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(str, true, null, 4, null);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonNull JsonPrimitive(@Nullable Void r1) {
        return JsonNull.INSTANCE;
    }
}
