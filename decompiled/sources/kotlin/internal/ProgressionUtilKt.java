package kotlin.internal;

import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u001a \u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0001\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0001¨\u0006\u0006"}, d2 = {"", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "step", "getProgressionLastElement", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
public final class ProgressionUtilKt {
    @PublishedApi
    public static final int getProgressionLastElement(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 >= i11) {
                return i11;
            }
            int i13 = i11 % i12;
            if (i13 < 0) {
                i13 += i12;
            }
            int i14 = i10 % i12;
            if (i14 < 0) {
                i14 += i12;
            }
            int i15 = (i13 - i14) % i12;
            if (i15 < 0) {
                i15 += i12;
            }
            return i11 - i15;
        }
        if (i12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i10 <= i11) {
            return i11;
        }
        int i16 = -i12;
        int i17 = i10 % i16;
        if (i17 < 0) {
            i17 += i16;
        }
        int i18 = i11 % i16;
        if (i18 < 0) {
            i18 += i16;
        }
        int i19 = (i17 - i18) % i16;
        if (i19 < 0) {
            i19 += i16;
        }
        return i11 + i19;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j10, long j11, long j12) {
        if (j12 > 0) {
            if (j10 >= j11) {
                return j11;
            }
            long j13 = j11 % j12;
            if (j13 < 0) {
                j13 += j12;
            }
            long j14 = j10 % j12;
            if (j14 < 0) {
                j14 += j12;
            }
            long j15 = (j13 - j14) % j12;
            if (j15 < 0) {
                j15 += j12;
            }
            return j11 - j15;
        }
        if (j12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (j10 <= j11) {
            return j11;
        }
        long j16 = -j12;
        long j17 = j10 % j16;
        if (j17 < 0) {
            j17 += j16;
        }
        long j18 = j11 % j16;
        if (j18 < 0) {
            j18 += j16;
        }
        long j19 = (j17 - j18) % j16;
        if (j19 < 0) {
            j19 += j16;
        }
        return j11 + j19;
    }
}
