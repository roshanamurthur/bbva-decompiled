package dk;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
public class f extends e {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T maxOf(@NotNull T a10, @NotNull T b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a10, @NotNull T b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return a10.compareTo(b10) <= 0 ? a10 : b10;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a10, @NotNull T b10, @NotNull T c10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(c10, "c");
        return (T) maxOf(a10, maxOf(b10, c10));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a10, @NotNull T b10, @NotNull T c10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(c10, "c");
        return (T) minOf(a10, minOf(b10, c10));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a10, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t10 : other) {
            a10 = (T) maxOf(a10, t10);
        }
        return a10;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a10, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t10 : other) {
            a10 = (T) minOf(a10, t10);
        }
        return a10;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b10, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.max((int) b10, (int) b11);
        }
        return b10;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b10, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.min((int) b10, (int) b11);
        }
        return b10;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s7 : other) {
            s4 = (short) Math.max((int) s4, (int) s7);
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s7 : other) {
            s4 = (short) Math.min((int) s4, (int) s7);
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    public static int maxOf(int i10, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i10, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i11 : other) {
            i10 = Math.min(i10, i11);
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j10, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j11 : other) {
            j10 = Math.max(j10, j11);
        }
        return j10;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j10, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j11 : other) {
            j10 = Math.min(j10, j11);
        }
        return j10;
    }

    @SinceKotlin(version = "1.4")
    public static float maxOf(float f6, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f10 : other) {
            f6 = Math.max(f6, f10);
        }
        return f6;
    }

    @SinceKotlin(version = "1.4")
    public static float minOf(float f6, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f10 : other) {
            f6 = Math.min(f6, f10);
        }
        return f6;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d2, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d3 : other) {
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d2, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d3 : other) {
            d2 = Math.min(d2, d3);
        }
        return d2;
    }
}
