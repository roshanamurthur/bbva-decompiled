package dk;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes12.dex */
public class e {
    @NotNull
    public static <T> Comparator<T> compareBy(@NotNull final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: dk.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Function1[] selectors2 = selectors;
                    Intrinsics.checkNotNullParameter(selectors2, "$selectors");
                    for (Function1 function1 : selectors2) {
                        int iCompareValues = e.compareValues((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                        if (iCompareValues != 0) {
                            return iCompareValues;
                        }
                    }
                    return 0;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static <T extends Comparable<?>> int compareValues(@Nullable T t10, @Nullable T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    public static <T> int compareValuesBy(T t10, T t11, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (Function1<? super T, ? extends Comparable<?>> function1 : selectors) {
            int iCompareValues = compareValues(function1.invoke(t10), function1.invoke(t11));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        h hVar = h.f68192p0;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return hVar;
    }

    @NotNull
    public static final <T> Comparator<T> nullsFirst(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: dk.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Comparator comparator2 = comparator;
                Intrinsics.checkNotNullParameter(comparator2, "$comparator");
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return -1;
                }
                if (obj2 == null) {
                    return 1;
                }
                return comparator2.compare(obj, obj2);
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> nullsLast(@NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new androidx.camera.core.internal.compat.workaround.a(comparator, 1);
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        i iVar = i.f68193p0;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return iVar;
    }

    @NotNull
    public static final <T> Comparator<T> reversed(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof j) {
            return ((j) comparator).getComparator();
        }
        Comparator<T> jVar = h.f68192p0;
        if (Intrinsics.areEqual(comparator, jVar)) {
            i iVar = i.f68193p0;
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return iVar;
        }
        if (Intrinsics.areEqual(comparator, i.f68193p0)) {
            Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            jVar = new j<>(comparator);
        }
        return jVar;
    }

    @NotNull
    public static final <T> Comparator<T> then(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: dk.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Comparator this_then = comparator;
                Intrinsics.checkNotNullParameter(this_then, "$this_then");
                Comparator comparator3 = comparator2;
                Intrinsics.checkNotNullParameter(comparator3, "$comparator");
                int iCompare = this_then.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator3.compare(obj, obj2);
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> thenDescending(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: dk.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Comparator this_thenDescending = comparator;
                Intrinsics.checkNotNullParameter(this_thenDescending, "$this_thenDescending");
                Comparator comparator3 = comparator2;
                Intrinsics.checkNotNullParameter(comparator3, "$comparator");
                int iCompare = this_thenDescending.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator3.compare(obj2, obj);
            }
        };
    }
}
