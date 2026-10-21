package com.bbva.cellscore.web.data;

import androidx.camera.camera2.internal.n1;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import bk.q;
import com.bbva.cellscore.web.data.component.ComponentDefinition;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsPage.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B+\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/bbva/cellscore/web/data/CellsPage;", "", "", "Lcom/bbva/cellscore/web/data/component/ComponentDefinition;", "newComponents", "from", "other", "merge", "", "component1", "component2", "component3", "operation", "route", "components", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "equals", "a", "Ljava/lang/String;", "getOperation", "()Ljava/lang/String;", "b", "getRoute", "c", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CellsPage {

    @JvmField
    @NotNull
    public static final CellsPage EMPTY = new CellsPage(null, null, null, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String operation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ComponentDefinition> components;

    public CellsPage() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CellsPage copy$default(CellsPage cellsPage, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cellsPage.operation;
        }
        if ((i10 & 2) != 0) {
            str2 = cellsPage.route;
        }
        if ((i10 & 4) != 0) {
            list = cellsPage.components;
        }
        return cellsPage.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final List<ComponentDefinition> component3() {
        return this.components;
    }

    @NotNull
    public final CellsPage copy(@NotNull String operation, @NotNull String route, @NotNull List<? extends ComponentDefinition> components) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(components, "components");
        return new CellsPage(operation, route, components);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellsPage)) {
            return false;
        }
        CellsPage cellsPage = (CellsPage) other;
        return Intrinsics.areEqual(this.operation, cellsPage.operation) && Intrinsics.areEqual(this.route, cellsPage.route) && Intrinsics.areEqual(this.components, cellsPage.components);
    }

    @NotNull
    public final CellsPage from(@NotNull List<? extends ComponentDefinition> newComponents) {
        Intrinsics.checkNotNullParameter(newComponents, "newComponents");
        return new CellsPage(this.operation, this.route, newComponents);
    }

    @NotNull
    public final List<ComponentDefinition> getComponents() {
        return this.components;
    }

    @NotNull
    public final String getOperation() {
        return this.operation;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    public int hashCode() {
        return this.components.hashCode() + n1.c(this.route, this.operation.hashCode() * 31, 31);
    }

    @NotNull
    public final CellsPage merge(@NotNull CellsPage other) {
        Intrinsics.checkNotNullParameter(other, "other");
        List<ComponentDefinition> list = this.components;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ComponentDefinition componentDefinition : list) {
            arrayList.add(TuplesKt.to(componentDefinition.tag(), componentDefinition));
        }
        Map mutableMap = q.toMutableMap(q.toMap(arrayList));
        List<ComponentDefinition> list2 = other.components;
        ArrayList<ComponentDefinition> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (ComponentDefinition componentDefinitionFrom : list2) {
            ComponentDefinition componentDefinition2 = (ComponentDefinition) mutableMap.get(componentDefinitionFrom.tag());
            Map<String, Object> newProperties = componentDefinitionFrom.properties();
            if (componentDefinition2 != null) {
                Map<String, Object> mergedProperties = componentDefinition2.properties();
                Intrinsics.checkNotNullExpressionValue(newProperties, "newProperties");
                for (Map.Entry<String, Object> entry : newProperties.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(mergedProperties, "mergedProperties");
                    mergedProperties.put(key, value);
                }
                componentDefinitionFrom = componentDefinition2.from(mergedProperties);
                Intrinsics.checkNotNullExpressionValue(componentDefinitionFrom, "oldDefinition.from(mergedProperties)");
            }
            arrayList2.add(componentDefinitionFrom);
        }
        for (ComponentDefinition componentDefinition3 : arrayList2) {
            mutableMap.put(componentDefinition3.tag(), componentDefinition3);
        }
        ArrayList arrayList3 = new ArrayList(mutableMap.size());
        Iterator it = mutableMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList3.add((ComponentDefinition) ((Map.Entry) it.next()).getValue());
        }
        return from(CollectionsKt___CollectionsKt.toList(arrayList3));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CellsPage(operation=");
        sb2.append(this.operation);
        sb2.append(", route=");
        sb2.append(this.route);
        sb2.append(", components=");
        return a.c(sb2, this.components, RootService.CLOSE_BRACKET);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CellsPage(@NotNull String operation, @NotNull String route, @NotNull List<? extends ComponentDefinition> components) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(components, "components");
        this.operation = operation;
        this.route = route;
        this.components = components;
    }

    public /* synthetic */ CellsPage(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
