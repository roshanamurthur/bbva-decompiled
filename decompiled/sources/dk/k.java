package dk;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _UComparisons.kt */
/* JADX INFO: loaded from: classes12.dex */
public class k {
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m5514maxOf5PvTz6A(short s4, short s7) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s7) >= 0 ? s4 : s7;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static final int m5515maxOfJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) >= 0 ? i10 : i11;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m5516maxOfKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) >= 0 ? b10 : b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m5517maxOfMd2H83M(int i10, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5584getSizeimpl = UIntArray.m5584getSizeimpl(other);
        for (int i11 = 0; i11 < iM5584getSizeimpl; i11++) {
            i10 = m5515maxOfJ1ME1BU(i10, UIntArray.m5583getpVg5ArA(other, i11));
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m5518maxOfR03FKyM(long j10, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5609getSizeimpl = ULongArray.m5609getSizeimpl(other);
        for (int i10 = 0; i10 < iM5609getSizeimpl; i10++) {
            j10 = m5520maxOfeb3DHEI(j10, ULongArray.m5608getsVKNKU(other, i10));
        }
        return j10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m5519maxOfWr6uiD8(byte b10, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5559getSizeimpl = UByteArray.m5559getSizeimpl(other);
        for (int i10 = 0; i10 < iM5559getSizeimpl; i10++) {
            b10 = m5516maxOfKr8caGY(b10, UByteArray.m5558getw2LRezQ(other, i10));
        }
        return b10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static final long m5520maxOfeb3DHEI(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) >= 0 ? j10 : j11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m5521maxOft1qELG4(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5634getSizeimpl = UShortArray.m5634getSizeimpl(other);
        for (int i10 = 0; i10 < iM5634getSizeimpl; i10++) {
            s4 = m5514maxOf5PvTz6A(s4, UShortArray.m5633getMh2AYeg(other, i10));
        }
        return s4;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m5522minOf5PvTz6A(short s4, short s7) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s7) <= 0 ? s4 : s7;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static final int m5523minOfJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) <= 0 ? i10 : i11;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m5524minOfKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) <= 0 ? b10 : b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m5525minOfMd2H83M(int i10, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5584getSizeimpl = UIntArray.m5584getSizeimpl(other);
        for (int i11 = 0; i11 < iM5584getSizeimpl; i11++) {
            i10 = m5523minOfJ1ME1BU(i10, UIntArray.m5583getpVg5ArA(other, i11));
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m5526minOfR03FKyM(long j10, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5609getSizeimpl = ULongArray.m5609getSizeimpl(other);
        for (int i10 = 0; i10 < iM5609getSizeimpl; i10++) {
            j10 = m5528minOfeb3DHEI(j10, ULongArray.m5608getsVKNKU(other, i10));
        }
        return j10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m5527minOfWr6uiD8(byte b10, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5559getSizeimpl = UByteArray.m5559getSizeimpl(other);
        for (int i10 = 0; i10 < iM5559getSizeimpl; i10++) {
            b10 = m5524minOfKr8caGY(b10, UByteArray.m5558getw2LRezQ(other, i10));
        }
        return b10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static final long m5528minOfeb3DHEI(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) <= 0 ? j10 : j11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m5529minOft1qELG4(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM5634getSizeimpl = UShortArray.m5634getSizeimpl(other);
        for (int i10 = 0; i10 < iM5634getSizeimpl; i10++) {
            s4 = m5522minOf5PvTz6A(s4, UShortArray.m5633getMh2AYeg(other, i10));
        }
        return s4;
    }
}
