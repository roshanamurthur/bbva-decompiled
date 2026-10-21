package com.bbva.component.dm.settings;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"hasKey", "", "Lcom/google/gson/JsonObject;", "key", "", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/bbva/component/dm/settings/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,8:1\n1747#2,3:9\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/bbva/component/dm/settings/ExtensionsKt\n*L\n6#1:9,3\n*E\n"})
public final class ExtensionsKt {
    public static final boolean hasKey(@NotNull JsonObject jsonObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jsonObject.has(key)) {
            Set<String> setKeySet = jsonObject.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    boolean zIsJsonObject = jsonObject.get(str).isJsonObject();
                    Intrinsics.checkNotNull(str);
                    if (hasKey(jsonObject, str) & zIsJsonObject) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
