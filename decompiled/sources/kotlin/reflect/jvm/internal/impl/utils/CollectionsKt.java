package kotlin.reflect.jvm.internal.impl.utils;

import bk.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: collections.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\ncollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1208#2,2:111\n1238#2,4:113\n1#3:117\n*S KotlinDebug\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n22#1:111,2\n22#1:113,4\n*E\n"})
public final class CollectionsKt {
    public static final <T> void addIfNotNull(@NotNull Collection<T> collection, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    @NotNull
    public static final <T> List<T> compact(@NotNull ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (size == 1) {
            return d.listOf(CollectionsKt___CollectionsKt.first((List) arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, Integer> mapToIndex(@NotNull Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i10) {
        return new HashMap<>(i10 >= 3 ? (i10 / 3) + i10 + 1 : 3);
    }

    @NotNull
    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i10) {
        return new HashSet<>(i10 >= 3 ? (i10 / 3) + i10 + 1 : 3);
    }

    @NotNull
    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i10) {
        return new LinkedHashSet<>(i10 >= 3 ? (i10 / 3) + i10 + 1 : 3);
    }
}
