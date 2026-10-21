package com.bbva.cellscore.web.data;

import bk.p;
import bk.q;
import com.bbva.cellscore.web.data.component.ComponentDefinition;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlobalDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/cellscore/web/data/GlobalDefinition;", "", "Lcom/bbva/cellscore/web/data/CellsPage;", "page", "", "", "globalConfiguration", "replace", "a", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "values", "<init>", "(Ljava/util/Map;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class GlobalDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> values;

    /* JADX WARN: Multi-variable type inference failed */
    public GlobalDefinition() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Object a(Object obj, Map<String, String> map) {
        if (!(obj instanceof String)) {
            if (obj instanceof Map) {
                if (obj != null) {
                    return b((Map) obj, map);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            }
            if (!(obj instanceof List)) {
                return obj;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next(), map));
            }
            return arrayList;
        }
        String str = (String) obj;
        if (!l.startsWith$default(str, "@global/", false, 2, null)) {
            return obj;
        }
        String str2 = map.get(str);
        if (str2 != null) {
            str = str + JsonPointer.SEPARATOR + ((Object) str2);
        }
        Object obj2 = this.values;
        for (String str3 : StringsKt__StringsKt.split$default((CharSequence) l.replace$default(str, "@global/", "", false, 4, (Object) null), new char[]{JsonPointer.SEPARATOR}, false, 0, 6, (Object) null)) {
            if (obj2 instanceof Map) {
                obj2 = ((Map) obj2).get(str3);
            }
        }
        return obj2;
    }

    public final LinkedHashMap b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), map2));
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> getValues() {
        return this.values;
    }

    @NotNull
    public final CellsPage replace(@NotNull CellsPage page, @NotNull Map<String, String> globalConfiguration) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(globalConfiguration, "globalConfiguration");
        ArrayList arrayList = new ArrayList(page.getComponents().size());
        for (ComponentDefinition componentDefinition : page.getComponents()) {
            Map<String, Object> mapProperties = componentDefinition.properties();
            Intrinsics.checkNotNullExpressionValue(mapProperties, "componentDefinition.properties()");
            arrayList.add(componentDefinition.from(b(mapProperties, globalConfiguration)));
        }
        return page.from(arrayList);
    }

    public GlobalDefinition(@NotNull Map<String, ? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
    }

    public /* synthetic */ GlobalDefinition(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.emptyMap() : map);
    }
}
