package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;
import java.time.Clock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionType;", "Lcom/mypinpad/tsdk/i/setBaseline;", "", "p0", "", "setCompoundDrawableTintBlendMode", "(J)V", "Lcom/mypinpad/tsdk/i/notifyAll;", "setX", "()Lcom/mypinpad/tsdk/i/notifyAll;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class TransactionType implements setBaseline {

    @NotNull
    public static final TransactionType INSTANCE = new TransactionType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f51935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f51936b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51937c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51938d = 1;

    static {
        int i10 = f51938d;
        int i11 = (i10 & 93) + (i10 | 93);
        f51937c = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 32 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f1  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object setonscrolllistener;
        int i13;
        int i14;
        int i15 = (i11 * (-657)) + (i10 * 659);
        int i16 = ~((~i10) | i11);
        int i17 = ~((~i11) | i10);
        int i18 = ~(i10 | i12);
        if (((i18 | i17) * 658) + (i17 * 658) + ((i16 | i17 | i18) * (-658)) + i15 != 1) {
            long jLongValue = ((Number) objArr[1]).longValue();
            int i19 = f51937c;
            int i20 = ((i19 & 31) - (~(i19 | 31))) - 1;
            f51938d = i20 % 128;
            if (i20 % 2 == 0) {
                f51935a = jLongValue;
                f51936b = SystemClock.elapsedRealtime();
                throw null;
            }
            f51935a = jLongValue;
            f51936b = SystemClock.elapsedRealtime();
            int i21 = f51938d + 95;
            f51937c = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        int i23 = f51938d;
        int i24 = (((i23 ^ 103) | (i23 & 103)) << 1) - (((~i23) & 103) | (i23 & (-104)));
        int i25 = i24 % 128;
        f51937c = i25;
        int i26 = i24 % 2;
        if (f51935a != 0) {
            int i27 = (i25 & (-118)) | ((~i25) & 117);
            int i28 = -(-((i25 & 117) << 1));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f51938d = i29 % 128;
            int i30 = i29 % 2;
            if (f51936b == 0) {
                setonscrolllistener = EuropeEndpoint.INSTANCE;
                int i31 = f51937c;
                i13 = ((i31 | 43) << 1) - (i31 ^ 43);
                f51938d = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            } else {
                long jElapsedRealtime = (SystemClock.elapsedRealtime() - f51936b) - (Clock.systemUTC().millis() - f51935a);
                if (Math.abs(jElapsedRealtime) > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                    setonscrolllistener = new setOnScrollListener(jElapsedRealtime);
                    int i32 = f51938d;
                    int i33 = i32 & 103;
                    i14 = (i33 - (~((i32 ^ 103) | i33))) - 1;
                    f51937c = i14 % 128;
                } else {
                    setonscrolllistener = getPinGridBgColor.INSTANCE;
                    int i34 = f51937c;
                    i14 = ((i34 ^ 54) + ((i34 & 54) << 1)) - 1;
                    f51938d = i14 % 128;
                }
                int i35 = i14 % 2;
            }
        } else {
            setonscrolllistener = EuropeEndpoint.INSTANCE;
            int i36 = f51937c;
            i13 = ((i36 | 43) << 1) - (i36 ^ 43);
            f51938d = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
        return setonscrolllistener;
    }

    @Override // com.mypinpad.tsdk.isolation.setBaseline
    public final void setCompoundDrawableTintBlendMode(long p4) {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(p4)}, -1959885264, 1959885264, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setBaseline
    @NotNull
    public final notifyAll setX() {
        return (notifyAll) setOnFocusChangeListener(new Object[]{this}, -1424823254, 1424823255, System.identityHashCode(this));
    }
}
