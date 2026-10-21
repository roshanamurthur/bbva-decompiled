package bk;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface m<K, V> extends Map<K, V>, KMappedMarker {
    @NotNull
    Map<K, V> getMap();

    V getOrImplicitDefault(K k10);
}
