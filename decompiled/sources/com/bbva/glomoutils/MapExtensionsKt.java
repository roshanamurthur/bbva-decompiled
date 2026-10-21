package com.bbva.glomoutils;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.a;
import bk.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MapExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a*\u0010\u0006\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0016\u0010\b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002\u001a2\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\r\u001a8\u0010\n\u001a\u0002H\u000b\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u0002H\u000bH\u0086\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"get", "", "", "key", "ignoreCase", "", "getOrDefault", "default", "mapToBundle", "Landroid/os/Bundle;", "withCastedValue", ExifInterface.GPS_DIRECTION_TRUE, "", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,41:1\n468#2:42\n414#2:43\n1238#3,4:44\n1#4:48\n215#5,2:49\n*S KotlinDebug\n*F\n+ 1 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n26#1:42\n26#1:43\n26#1:44,4\n38#1:49,2\n*E\n"})
public final class MapExtensionsKt {
    @Nullable
    public static final String get(@NotNull Map<String, String> map, @NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!z10) {
            return map.get(key);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Locale locale = Locale.ROOT;
            linkedHashMap.put(a.d(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)"), entry.getValue());
        }
        return (String) linkedHashMap.get(key);
    }

    public static /* synthetic */ String get$default(Map map, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return get(map, str, z10);
    }

    @NotNull
    public static final String getOrDefault(@Nullable Map<String, String> map, @NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        if (map == null) {
            return str;
        }
        String str2 = map.get(key);
        if (str2 == null) {
            str2 = str;
        }
        String str3 = str2;
        return str3 == null ? str : str3;
    }

    @NotNull
    public static final Bundle mapToBundle(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static final /* synthetic */ <T> T withCastedValue(Map<String, ? extends Object> map, String key, T t10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        T t11 = (T) map.get(key);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t11 == null ? t10 : t11;
    }

    public static final /* synthetic */ <T> T withCastedValue(Map<String, ? extends Object> map, String key) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) map.get(key);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t10;
    }
}
