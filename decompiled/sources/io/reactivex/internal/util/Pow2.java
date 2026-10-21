package io.reactivex.internal.util;

/* JADX INFO: loaded from: classes12.dex */
public final class Pow2 {
    public Pow2() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i10) {
        return (i10 & (i10 + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i10) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
    }
}
