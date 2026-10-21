package com.bbva.plugin.localstorage.serializer;

import com.google.gson.JsonElement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/localstorage/serializer/Serializer;", "", "serialize", "", "jsonElement", "Lcom/google/gson/JsonElement;", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Serializer {

    /* JADX INFO: compiled from: Serializer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String serialize(@NotNull Serializer serializer, @Nullable JsonElement jsonElement) {
            return String.valueOf(jsonElement);
        }
    }

    @NotNull
    String serialize(@Nullable JsonElement jsonElement);
}
