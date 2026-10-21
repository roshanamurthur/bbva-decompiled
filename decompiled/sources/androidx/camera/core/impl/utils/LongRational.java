package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j10, long j11) {
        this.mNumerator = j10;
        this.mDenominator = j11;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    @NonNull
    public String toString() {
        return this.mNumerator + "/" + this.mDenominator;
    }

    public LongRational(double d2) {
        this((long) (d2 * 10000.0d), 10000L);
    }
}
