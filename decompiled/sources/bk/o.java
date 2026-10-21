package bk;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
public class o {
    @PublishedApi
    @JvmName(name = "getOrImplicitDefaultNullable")
    public static <K, V> V getOrImplicitDefaultNullable(@NotNull Map<K, ? extends V> map, K k10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof m) {
            return (V) ((m) map).getOrImplicitDefault(k10);
        }
        V v3 = map.get(k10);
        if (v3 != null || map.containsKey(k10)) {
            return v3;
        }
        throw new NoSuchElementException(androidx.collection.j.b("Key ", k10, " is missing in the map."));
    }

    @NotNull
    public static <K, V> Map<K, V> withDefault(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof m ? withDefault(((m) map).getMap(), defaultValue) : new n(map, defaultValue);
    }

    @JvmName(name = "withDefaultMutable")
    @NotNull
    public static final <K, V> Map<K, V> withDefaultMutable(@NotNull Map<K, V> map, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof t ? withDefaultMutable(((t) map).getMap(), defaultValue) : new u(map, defaultValue);
    }
}
