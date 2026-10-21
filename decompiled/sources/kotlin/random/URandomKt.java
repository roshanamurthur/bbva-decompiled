package kotlin.random;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a\u0011\u0010!\u001a\u00020\b*\u00020\rH\u0007¢\u0006\u0002\u0010\"\u001a\u001b\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$\u001a#\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class URandomKt {
    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m5715checkUIntRangeBoundsJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i10) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m5569boximpl(i10), UInt.m5569boximpl(i11)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m5716checkULongRangeBoundseb3DHEI(long j10, long j11) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j10) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m5594boximpl(j10), ULong.m5594boximpl(j11)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] nextUBytes(@NotNull Random random, int i10) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m5553constructorimpl(random.nextBytes(i10));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m5717nextUBytesEVgfTAA(@NotNull Random nextUBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m5718nextUBytesWvrt4B4(@NotNull Random nextUBytes, @NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i10, i11);
        return array;
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m5719nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = UByteArray.m5559getSizeimpl(bArr);
        }
        return m5718nextUBytesWvrt4B4(random, bArr, i10, i11);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m5570constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m5720nextUInta8DCA5k(@NotNull Random nextUInt, int i10, int i11) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m5715checkUIntRangeBoundsJ1ME1BU(i10, i11);
        return UInt.m5570constructorimpl(nextUInt.nextInt(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m5721nextUIntqCasIEU(@NotNull Random nextUInt, int i10) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m5720nextUInta8DCA5k(nextUInt, 0, i10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m5595constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m5722nextULongV1Xi4fY(@NotNull Random nextULong, long j10) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m5723nextULongjmpaWc(nextULong, 0L, j10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m5723nextULongjmpaWc(@NotNull Random nextULong, long j10, long j11) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m5716checkULongRangeBoundseb3DHEI(j10, j11);
        return ULong.m5595constructorimpl(nextULong.nextLong(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random, @NotNull UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Integer.compare(range.getLast() ^ Integer.MIN_VALUE, Integer.MAX_VALUE) < 0) {
            return m5720nextUInta8DCA5k(random, range.getFirst(), UInt.m5570constructorimpl(range.getLast() + 1));
        }
        return Integer.compare(range.getFirst() ^ Integer.MIN_VALUE, Integer.MIN_VALUE) > 0 ? UInt.m5570constructorimpl(m5720nextUInta8DCA5k(random, UInt.m5570constructorimpl(range.getFirst() - 1), range.getLast()) + 1) : nextUInt(random);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random, @NotNull ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compare(range.getLast() ^ Long.MIN_VALUE, Long.MAX_VALUE) < 0) {
            return m5723nextULongjmpaWc(random, range.getFirst(), ULong.m5595constructorimpl(ULong.m5595constructorimpl(((long) 1) & 4294967295L) + range.getLast()));
        }
        if (Long.compare(range.getFirst() ^ Long.MIN_VALUE, Long.MIN_VALUE) <= 0) {
            return nextULong(random);
        }
        long j10 = ((long) 1) & 4294967295L;
        return ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10) + m5723nextULongjmpaWc(random, ULong.m5595constructorimpl(range.getFirst() - ULong.m5595constructorimpl(j10)), range.getLast()));
    }
}
