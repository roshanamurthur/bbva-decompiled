package ok;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.OpenEndRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
public class e {
    public static final void checkStepIsPositive(boolean z10, @NotNull Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    @NotNull
    public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(@NotNull T t10, @NotNull T that) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new kotlin.ranges.b(t10, that);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T extends Comparable<? super T>> OpenEndRange<T> rangeUntil(@NotNull T t10, @NotNull T that) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new kotlin.ranges.a(t10, that);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final ClosedFloatingPointRange<Double> rangeTo(double d2, double d3) {
        return new a(d2, d3);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final OpenEndRange<Double> rangeUntil(double d2, double d3) {
        return new c(d2, d3);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static ClosedFloatingPointRange<Float> rangeTo(float f6, float f10) {
        return new b(f6, f10);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final OpenEndRange<Float> rangeUntil(float f6, float f10) {
        return new d(f6, f10);
    }
}
