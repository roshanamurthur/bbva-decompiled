package bk;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Sets.kt */
/* JADX INFO: loaded from: classes12.dex */
public class w extends v {
    @NotNull
    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    @NotNull
    public static <T> HashSet<T> hashSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) ArraysKt___ArraysKt.toCollection(elements, new HashSet(p.mapCapacity(elements.length)));
    }

    @NotNull
    public static <T> LinkedHashSet<T> linkedSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(p.mapCapacity(elements.length)));
    }

    @NotNull
    public static <T> Set<T> mutableSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(p.mapCapacity(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> optimizeReadOnlySet(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : v.setOf(set.iterator().next());
        }
        return emptySet();
    }

    @NotNull
    public static <T> Set<T> setOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt___ArraysKt.toSet(elements) : emptySet();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@Nullable T t10) {
        return t10 != null ? v.setOf(t10) : emptySet();
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
