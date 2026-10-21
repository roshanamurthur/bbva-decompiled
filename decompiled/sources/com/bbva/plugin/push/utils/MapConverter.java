package com.bbva.plugin.push.utils;

import androidx.camera.core.processing.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapConverter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/push/utils/MapConverter;", "Lcom/bbva/plugin/push/utils/Converter;", "", "", "", "()V", "convert", "from", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapConverter.kt\ncom/bbva/plugin/push/utils/MapConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,12:1\n1179#2,2:13\n1253#2,4:15\n*S KotlinDebug\n*F\n+ 1 MapConverter.kt\ncom/bbva/plugin/push/utils/MapConverter\n*L\n9#1:13,2\n9#1:15,4\n*E\n"})
public final class MapConverter implements Converter<Map<String, ? extends String>, Map<String, ? extends Object>> {

    @NotNull
    public static final MapConverter INSTANCE = new MapConverter();

    @Override // com.bbva.plugin.push.utils.Converter
    public /* bridge */ /* synthetic */ Map<String, ? extends Object> convert(Map<String, ? extends String> map) {
        return convert2((Map<String, String>) map);
    }

    @NotNull
    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public Map<String, Object> convert2(@NotNull Map<String, String> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Set<Map.Entry<String, String>> setEntrySet = from.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(setEntrySet, 10, 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = TuplesKt.to(entry.getKey(), StringConverter.INSTANCE.convert((String) entry.getValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
