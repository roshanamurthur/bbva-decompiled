package kotlin;

import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UnsignedUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", SharedPrefsStorage.VERSION_KEY, "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", ConfigConstantsKt.CUSTOMERS_API_VERSION, "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", "base", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "UnsignedKt")
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d2) {
        if (Double.isNaN(d2) || d2 <= uintToDouble(0)) {
            return 0;
        }
        if (d2 >= uintToDouble(-1)) {
            return -1;
        }
        if (d2 <= 2.147483647E9d) {
            return UInt.m5570constructorimpl((int) d2);
        }
        return UInt.m5570constructorimpl(UInt.m5570constructorimpl(Integer.MAX_VALUE) + UInt.m5570constructorimpl((int) (d2 - ((double) Integer.MAX_VALUE))));
    }

    @PublishedApi
    public static final long doubleToULong(double d2) {
        if (Double.isNaN(d2) || d2 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d2 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d2 < 9.223372036854776E18d ? ULong.m5595constructorimpl((long) d2) : ULong.m5595constructorimpl(ULong.m5595constructorimpl((long) (d2 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    public static final int uintCompare(int i10, int i11) {
        return Intrinsics.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m5644uintDivideJ1ME1BU(int i10, int i11) {
        return UInt.m5570constructorimpl((int) ((((long) i10) & 4294967295L) / (((long) i11) & 4294967295L)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m5645uintRemainderJ1ME1BU(int i10, int i11) {
        return UInt.m5570constructorimpl((int) ((((long) i10) & 4294967295L) % (((long) i11) & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i10) {
        return (((double) ((i10 >>> 31) << 30)) * ((double) 2)) + ((double) (Integer.MAX_VALUE & i10));
    }

    @PublishedApi
    public static final int ulongCompare(long j10, long j11) {
        return Intrinsics.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m5646ulongDivideeb3DHEI(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? ULong.m5595constructorimpl(0L) : ULong.m5595constructorimpl(1L);
        }
        if (j10 >= 0) {
            return ULong.m5595constructorimpl(j10 / j11);
        }
        long j12 = ((j10 >>> 1) / j11) << 1;
        return ULong.m5595constructorimpl(j12 + ((long) (Long.compare(ULong.m5595constructorimpl(j10 - (j12 * j11)) ^ Long.MIN_VALUE, ULong.m5595constructorimpl(j11) ^ Long.MIN_VALUE) < 0 ? 0 : 1)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m5647ulongRemaindereb3DHEI(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j10 : ULong.m5595constructorimpl(j10 - j11);
        }
        if (j10 >= 0) {
            return ULong.m5595constructorimpl(j10 % j11);
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (Long.compare(ULong.m5595constructorimpl(j12) ^ Long.MIN_VALUE, ULong.m5595constructorimpl(j11) ^ Long.MIN_VALUE) < 0) {
            j11 = 0;
        }
        return ULong.m5595constructorimpl(j12 - j11);
    }

    @PublishedApi
    public static final double ulongToDouble(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    @NotNull
    public static final String ulongToString(long j10) {
        return ulongToString(j10, 10);
    }

    @NotNull
    public static final String ulongToString(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, CharsKt.checkRadix(i10));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
