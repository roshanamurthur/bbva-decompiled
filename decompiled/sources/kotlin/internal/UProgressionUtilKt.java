package kotlin.internal;

import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/UInt;", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "step", "getProgressionLastElement-Nkh28Cs", "(III)I", "getProgressionLastElement", "Lkotlin/ULong;", "", "getProgressionLastElement-7ftBX0g", "(JJJ)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
public final class UProgressionUtilKt {
    public static final int a(int i10, int i11, int i12) {
        long j10 = ((long) i12) & 4294967295L;
        int i13 = (int) ((((long) i10) & 4294967295L) % j10);
        int i14 = (int) ((((long) i11) & 4294967295L) % j10);
        int iCompare = Integer.compare(i13 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i14);
        int iM5570constructorimpl = UInt.m5570constructorimpl(i13 - i14);
        return iCompare >= 0 ? iM5570constructorimpl : UInt.m5570constructorimpl(iM5570constructorimpl + i12);
    }

    public static final long b(long j10, long j11, long j12) {
        if (j12 < 0) {
            if ((j10 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE)) {
                j10 -= j12;
            }
        } else if (j10 >= 0) {
            j10 %= j12;
        } else {
            long j13 = j10 - ((((j10 >>> 1) / j12) << 1) * j12);
            j10 = j13 - ((j13 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE) ? j12 : 0L);
        }
        if (j12 < 0) {
            if ((j11 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE)) {
                j11 -= j12;
            }
        } else if (j11 >= 0) {
            j11 %= j12;
        } else {
            long j14 = j11 - ((((j11 >>> 1) / j12) << 1) * j12);
            j11 = j14 - ((j14 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE) ? j12 : 0L);
        }
        int iCompare = Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        long jM5595constructorimpl = ULong.m5595constructorimpl(j10 - j11);
        return iCompare >= 0 ? jM5595constructorimpl : ULong.m5595constructorimpl(jM5595constructorimpl + j12);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m5713getProgressionLastElement7ftBX0g(long j10, long j11, long j12) {
        if (j12 > 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j11 : ULong.m5595constructorimpl(j11 - b(j11, j10, ULong.m5595constructorimpl(j12)));
        }
        if (j12 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j11 : ULong.m5595constructorimpl(j11 + b(j10, j11, ULong.m5595constructorimpl(-j12)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m5714getProgressionLastElementNkh28Cs(int i10, int i11, int i12) {
        if (i12 > 0) {
            return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) >= 0 ? i11 : UInt.m5570constructorimpl(i11 - a(i11, i10, UInt.m5570constructorimpl(i12)));
        }
        if (i12 < 0) {
            return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) <= 0 ? i11 : UInt.m5570constructorimpl(a(i10, i11, UInt.m5570constructorimpl(-i12)) + i11);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
