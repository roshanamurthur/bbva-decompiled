package com.bbva.plugin.localstorage.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/localstorage/serializer/JsonSerializer;", "Lcom/bbva/plugin/localstorage/serializer/Serializer;", "()V", "serialize", "", "jsonElement", "Lcom/google/gson/JsonElement;", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsonSerializer implements Serializer {
    @Override // com.bbva.plugin.localstorage.serializer.Serializer
    @NotNull
    public String serialize(@Nullable JsonElement jsonElement) {
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.isString()) {
                String asString = jsonPrimitive.getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "{\n            jsonElement.asString\n        }");
                return asString;
            }
        }
        return String.valueOf(jsonElement);
    }
}
