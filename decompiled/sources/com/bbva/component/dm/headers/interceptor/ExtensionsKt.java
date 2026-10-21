package com.bbva.component.dm.headers.interceptor;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"getIgnoreCase", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "key", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "component-ic-token_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/bbva/component/dm/headers/interceptor/ExtensionsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,5:1\n478#2,7:6\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/bbva/component/dm/headers/interceptor/ExtensionsKt\n*L\n4#1:6,7\n*E\n"})
public final class ExtensionsKt {
    @Nullable
    public static final <V> V getIgnoreCase(@NotNull Map<String, ? extends V> map, @NotNull String key) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends V> entry : map.entrySet()) {
            if (l.equals(key, entry.getKey(), true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (V) CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap.values());
    }
}
