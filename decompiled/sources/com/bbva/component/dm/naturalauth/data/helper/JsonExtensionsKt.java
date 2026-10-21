package com.bbva.component.dm.naturalauth.data.helper;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a+\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\t0\u000bH\u0000¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"byId", "", "Lcom/google/gson/JsonElement;", "id", "", "getValueForKeyOrEmpty", "Lcom/google/gson/JsonObject;", "key", "map", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "(Lcom/google/gson/JsonElement;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "component-dm-naturalauth_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class JsonExtensionsKt {
    public static final boolean byId(@NotNull JsonElement jsonElement, @NotNull String id) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        JsonElement jsonElement2 = jsonElement.getAsJsonObject().get(Constants.idAuthenticationData);
        return Intrinsics.areEqual(jsonElement2 != null ? jsonElement2.getAsString() : null, id);
    }

    @NotNull
    public static final String getValueForKeyOrEmpty(@NotNull JsonObject jsonObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jsonObject.has(key)) {
            return "";
        }
        String asString = jsonObject.get(key).getAsString();
        Intrinsics.checkNotNull(asString);
        return asString;
    }

    public static final <T> T map(@NotNull JsonElement jsonElement, @NotNull Function1<? super JsonElement, ? extends T> block) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(jsonElement);
    }
}
