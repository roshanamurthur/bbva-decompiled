package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "source", "Lkotlinx/serialization/json/JsonElement;", "decodeStringToJsonTree", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0})
public final class StreamingJsonDecoderKt {
    @JsonFriendModuleApi
    @NotNull
    public static final <T> JsonElement decodeStringToJsonTree(@NotNull Json json, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(source, "source");
        StringJsonLexer stringJsonLexer = new StringJsonLexer(source);
        JsonElement jsonElementDecodeJsonElement = new StreamingJsonDecoder(json, WriteMode.OBJ, stringJsonLexer, deserializer.getDescriptor(), null).decodeJsonElement();
        stringJsonLexer.expectEof();
        return jsonElementDecodeJsonElement;
    }
}
