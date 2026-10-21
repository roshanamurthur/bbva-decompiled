package bk;

import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface t<K, V> extends Map<K, V>, m<K, V>, KMutableMap {
    @Override // bk.m
    @NotNull
    Map<K, V> getMap();
}
