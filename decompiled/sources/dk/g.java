package dk;

import java.util.Comparator;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _Comparisons.kt */
/* JADX INFO: loaded from: classes12.dex */
public class g extends f {
    @SinceKotlin(version = "1.1")
    public static final <T> T maxOf(T t10, T t11, T t12, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) maxOf(t10, maxOf(t11, t12, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T minOf(T t10, T t11, T t12, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) minOf(t10, minOf(t11, t12, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T maxOf(T t10, T t11, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T minOf(T t10, T t11, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> T maxOf(T t10, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> T minOf(T t10, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }
}
