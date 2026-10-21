package com.bbva.glomohybrid.base.shortcuts;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B-\u0012$\b\u0002\u0010\u000e\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0018\u00010\u0003j\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/ActionDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "", "Lcom/bbva/glomohybrid/base/shortcuts/Action;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/util/List;", "", "", "", "Lcom/bbva/glomohybrid/base/shortcuts/JsonActions;", "map", "<init>", "(Ljava/util/List;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShortcutModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutModel.kt\ncom/bbva/glomohybrid/base/shortcuts/ActionDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n*S KotlinDebug\n*F\n+ 1 ShortcutModel.kt\ncom/bbva/glomohybrid/base/shortcuts/ActionDelegate\n*L\n49#1:52\n49#1:53,3\n*E\n"})
public final class ActionDelegate<T> implements ReadOnlyProperty<T, List<? extends Action>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<Map<String, Object>> f31547a;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionDelegate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ List<? extends Action> getValue(Object obj, KProperty kProperty) {
        return getValue2(obj, (KProperty<?>) kProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionDelegate(@Nullable List<? extends Map<String, ? extends Object>> list) {
        this.f31547a = list;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @NotNull
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public List<? extends Action> getValue2(T thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        List<Map<String, Object>> list = this.f31547a;
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Map<String, Object>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Action((Map) it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ ActionDelegate(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
