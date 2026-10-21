package bk;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetsJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
public class v {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> Set<E> build(@NotNull Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((SetBuilder) builder).build();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    @NotNull
    public static <T> Set<T> setOf(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    @NotNull
    public static <T> TreeSet<T> sortedSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.toCollection(elements, new TreeSet());
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> Set<E> createSetBuilder(int i10) {
        return new SetBuilder(i10);
    }

    @NotNull
    public static final <T> TreeSet<T> sortedSetOf(@NotNull Comparator<? super T> comparator, @NotNull T... elements) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.toCollection(elements, new TreeSet(comparator));
    }
}
