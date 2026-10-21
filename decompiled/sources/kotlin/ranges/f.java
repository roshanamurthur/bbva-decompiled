package kotlin.ranges;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: classes12.dex */
public class f {
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m5742coerceAtLeast5PvTz6A(short s4, short s7) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s7) < 0 ? s7 : s4;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m5743coerceAtLeastJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) < 0 ? i11 : i10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m5744coerceAtLeastKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) < 0 ? b11 : b10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m5745coerceAtLeasteb3DHEI(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) < 0 ? j11 : j10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m5746coerceAtMost5PvTz6A(short s4, short s7) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s7) > 0 ? s7 : s4;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m5747coerceAtMostJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) > 0 ? i11 : i10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m5748coerceAtMostKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) > 0 ? b11 : b10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m5749coerceAtMosteb3DHEI(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) > 0 ? j11 : j10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m5750coerceInJPwROB0(long j10, @NotNull ClosedRange<ULong> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) c.coerceIn(ULong.m5594boximpl(j10), (ClosedFloatingPointRange<ULong>) range)).getF79403p0();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        long j11 = j10 ^ Long.MIN_VALUE;
        if (Long.compare(j11, ((ULong) range.getStart()).getF79403p0() ^ Long.MIN_VALUE) < 0) {
            return ((ULong) range.getStart()).getF79403p0();
        }
        return Long.compare(j11, ((ULong) range.getEndInclusive()).getF79403p0() ^ Long.MIN_VALUE) > 0 ? ((ULong) range.getEndInclusive()).getF79403p0() : j10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m5751coerceInVKSA0NQ(short s4, short s7, short s9) {
        int i10 = s7 & UShort.MAX_VALUE;
        int i11 = s9 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = 65535 & s4;
            if (Intrinsics.compare(i12, i10) < 0) {
                return s7;
            }
            return Intrinsics.compare(i12, i11) > 0 ? s9 : s4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m5624toStringimpl(s9)) + " is less than minimum " + ((Object) UShort.m5624toStringimpl(s7)) + '.');
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m5752coerceInWZ9TVnA(int i10, int i11, int i12) {
        int i13 = i11 ^ Integer.MIN_VALUE;
        int i14 = i12 ^ Integer.MIN_VALUE;
        if (Integer.compare(i13, i14) <= 0) {
            int i15 = Integer.MIN_VALUE ^ i10;
            if (Integer.compare(i15, i13) < 0) {
                return i11;
            }
            return Integer.compare(i15, i14) > 0 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m5574toStringimpl(i12)) + " is less than minimum " + ((Object) UInt.m5574toStringimpl(i11)) + '.');
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m5753coerceInb33U2AM(byte b10, byte b11, byte b12) {
        int i10 = b11 & 255;
        int i11 = b12 & 255;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = b10 & 255;
            if (Intrinsics.compare(i12, i10) < 0) {
                return b11;
            }
            return Intrinsics.compare(i12, i11) > 0 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m5549toStringimpl(b12)) + " is less than minimum " + ((Object) UByte.m5549toStringimpl(b11)) + '.');
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m5754coerceInsambcqE(long j10, long j11, long j12) {
        long j13 = j11 ^ Long.MIN_VALUE;
        long j14 = j12 ^ Long.MIN_VALUE;
        if (Long.compare(j13, j14) <= 0) {
            long j15 = Long.MIN_VALUE ^ j10;
            if (Long.compare(j15, j13) < 0) {
                return j11;
            }
            return Long.compare(j15, j14) > 0 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m5599toStringimpl(j12)) + " is less than minimum " + ((Object) ULong.m5599toStringimpl(j11)) + '.');
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m5755coerceInwuiCnnA(int i10, @NotNull ClosedRange<UInt> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) c.coerceIn(UInt.m5569boximpl(i10), (ClosedFloatingPointRange<UInt>) range)).getF79399p0();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        int i11 = i10 ^ Integer.MIN_VALUE;
        if (Integer.compare(i11, ((UInt) range.getStart()).getF79399p0() ^ Integer.MIN_VALUE) < 0) {
            return ((UInt) range.getStart()).getF79399p0();
        }
        return Integer.compare(i11, ((UInt) range.getEndInclusive()).getF79399p0() ^ Integer.MIN_VALUE) > 0 ? ((UInt) range.getEndInclusive()).getF79399p0() : i10;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m5756contains68kG9v0(@NotNull UIntRange contains, byte b10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m5728containsWZ4Q5Ns(UInt.m5570constructorimpl(b10 & 255));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m5757containsGab390E(@NotNull ULongRange contains, int i10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m5736containsVKZWuLQ(ULong.m5595constructorimpl(((long) i10) & 4294967295L));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m5758containsULbyJY(@NotNull ULongRange contains, byte b10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m5736containsVKZWuLQ(ULong.m5595constructorimpl(((long) b10) & 255));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m5759containsZsK3CEQ(@NotNull UIntRange contains, short s4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m5728containsWZ4Q5Ns(UInt.m5570constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m5760containsfz5IDCE(@NotNull UIntRange contains, long j10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m5595constructorimpl(j10 >>> 32) == 0 && contains.m5728containsWZ4Q5Ns(UInt.m5570constructorimpl((int) j10));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m5761containsuhHAxoY(@NotNull ULongRange contains, short s4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m5736containsVKZWuLQ(ULong.m5595constructorimpl(((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m5762downTo5PvTz6A(short s4, short s7) {
        return UIntProgression.INSTANCE.m5726fromClosedRangeNkh28Cs(UInt.m5570constructorimpl(s4 & UShort.MAX_VALUE), UInt.m5570constructorimpl(s7 & UShort.MAX_VALUE), -1);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m5763downToJ1ME1BU(int i10, int i11) {
        return UIntProgression.INSTANCE.m5726fromClosedRangeNkh28Cs(i10, i11, -1);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m5764downToKr8caGY(byte b10, byte b11) {
        return UIntProgression.INSTANCE.m5726fromClosedRangeNkh28Cs(UInt.m5570constructorimpl(b10 & 255), UInt.m5570constructorimpl(b11 & 255), -1);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m5765downToeb3DHEI(long j10, long j11) {
        return ULongProgression.INSTANCE.m5734fromClosedRange7ftBX0g(j10, j11, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt firstOrNull(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m5569boximpl(uIntProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt lastOrNull(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m5569boximpl(uIntProgression.getLast());
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int random(@NotNull UIntRange uIntRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt randomOrNull(@NotNull UIntRange uIntRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m5569boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression reversed(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.INSTANCE.m5726fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression step(@NotNull UIntProgression uIntProgression, int i10) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        ok.e.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        UIntProgression.Companion companion = UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.m5726fromClosedRangeNkh28Cs(first, last, i10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m5766until5PvTz6A(short s4, short s7) {
        int i10 = s7 & UShort.MAX_VALUE;
        return Intrinsics.compare(i10, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m5570constructorimpl(s4 & UShort.MAX_VALUE), UInt.m5570constructorimpl(UInt.m5570constructorimpl(i10) - 1), null);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final UIntRange m5767untilJ1ME1BU(int i10, int i11) {
        return Integer.compare(i11 ^ Integer.MIN_VALUE, Integer.MIN_VALUE) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(i10, UInt.m5570constructorimpl(i11 - 1), null);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m5768untilKr8caGY(byte b10, byte b11) {
        int i10 = b11 & 255;
        return Intrinsics.compare(i10, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m5570constructorimpl(b10 & 255), UInt.m5570constructorimpl(UInt.m5570constructorimpl(i10) - 1), null);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final ULongRange m5769untileb3DHEI(long j10, long j11) {
        return Long.compare(j11 ^ Long.MIN_VALUE, Long.MIN_VALUE) <= 0 ? ULongRange.INSTANCE.getEMPTY() : new ULongRange(j10, ULong.m5595constructorimpl(j11 - ULong.m5595constructorimpl(((long) 1) & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong firstOrNull(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m5594boximpl(uLongProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong lastOrNull(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m5594boximpl(uLongProgression.getLast());
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression reversed(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.INSTANCE.m5734fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long random(@NotNull ULongRange uLongRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong randomOrNull(@NotNull ULongRange uLongRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m5594boximpl(URandomKt.nextULong(random, uLongRange));
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression step(@NotNull ULongProgression uLongProgression, long j10) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        ok.e.checkStepIsPositive(j10 > 0, Long.valueOf(j10));
        ULongProgression.Companion companion = ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j10 = -j10;
        }
        return companion.m5734fromClosedRange7ftBX0g(first, last, j10);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }
}
