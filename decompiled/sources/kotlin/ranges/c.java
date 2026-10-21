package kotlin.ranges;

import androidx.collection.g;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
public class c extends ok.e {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d2);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b10, byte b11) {
        return b10 < b11 ? b11 : b10;
    }

    public static final byte coerceAtMost(byte b10, byte b11) {
        return b10 > b11 ? b11 : b10;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t10, @Nullable T t11, @Nullable T t12) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        if (t11 == null || t12 == null) {
            if (t11 != null && t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t12 != null && t10.compareTo(t12) > 0) {
                return t12;
            }
        } else {
            if (t11.compareTo(t12) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + '.');
            }
            if (t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
        return t10;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(b10));
    }

    @NotNull
    public static final IntProgression downTo(int i10, byte b10) {
        return IntProgression.INSTANCE.fromClosedRange(i10, b10, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer firstOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(b10));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, byte b10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(b10));
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer lastOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, byte b10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(b10));
    }

    @SinceKotlin(version = "1.3")
    public static int random(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer randomOrNull(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    @NotNull
    public static IntProgression reversed(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, byte b10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Short.valueOf(b10));
    }

    @NotNull
    public static IntProgression step(@NotNull IntProgression intProgression, int i10) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        ok.e.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        IntProgression.Companion companion = IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.fromClosedRange(first, last, i10);
    }

    @Nullable
    public static final Byte toByteExactOrNull(int i10) {
        if (new IntRange(-128, 127).contains(i10)) {
            return Byte.valueOf((byte) i10);
        }
        return null;
    }

    @Nullable
    public static final Integer toIntExactOrNull(long j10) {
        if (new LongRange(-2147483648L, 2147483647L).contains(j10)) {
            return Integer.valueOf((int) j10);
        }
        return null;
    }

    @Nullable
    public static final Long toLongExactOrNull(double d2) {
        if (-9.223372036854776E18d > d2 || d2 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d2);
    }

    @Nullable
    public static final Short toShortExactOrNull(int i10) {
        if (new IntRange(-32768, 32767).contains(i10)) {
            return Short.valueOf((short) i10);
        }
        return null;
    }

    @NotNull
    public static final IntRange until(int i10, byte b10) {
        return new IntRange(i10, b10 - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f6) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f6);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final double coerceAtLeast(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static final double coerceAtMost(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> closedRange, float f6) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(f6));
    }

    @NotNull
    public static final LongProgression downTo(long j10, byte b10) {
        return LongProgression.INSTANCE.fromClosedRange(j10, b10, -1L);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long firstOrNull(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(@NotNull ClosedRange<Float> closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) d2));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, byte b10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(b10));
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long lastOrNull(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, byte b10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(b10));
    }

    @NotNull
    public static final LongProgression reversed(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, byte b10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Short.valueOf(b10));
    }

    @Nullable
    public static final Byte toByteExactOrNull(long j10) {
        if (new LongRange(-128L, 127L).contains(j10)) {
            return Byte.valueOf((byte) j10);
        }
        return null;
    }

    @Nullable
    public static final Integer toIntExactOrNull(double d2) {
        if (-2.147483648E9d > d2 || d2 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d2);
    }

    @Nullable
    public static final Long toLongExactOrNull(float f6) {
        if (-9.223372E18f > f6 || f6 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f6);
    }

    @Nullable
    public static final Short toShortExactOrNull(long j10) {
        if (new LongRange(-32768L, 32767L).contains(j10)) {
            return Short.valueOf((short) j10);
        }
        return null;
    }

    @NotNull
    public static final LongRange until(long j10, byte b10) {
        return new LongRange(j10, ((long) b10) - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i10);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static float coerceAtLeast(float f6, float f10) {
        return f6 < f10 ? f10 : f6;
    }

    public static float coerceAtMost(float f6, float f10) {
        return f6 > f10 ? f10 : f6;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull OpenEndRange<Double> openEndRange, float f6) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Double.valueOf(f6));
    }

    @NotNull
    public static final IntProgression downTo(byte b10, byte b11) {
        return IntProgression.INSTANCE.fromClosedRange(b10, b11, -1);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character firstOrNull(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(i10));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d2);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character lastOrNull(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(d2);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull LongRange longRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long randomOrNull(@NotNull LongRange longRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    @NotNull
    public static final CharProgression reversed(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d2);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final LongProgression step(@NotNull LongProgression longProgression, long j10) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        ok.e.checkStepIsPositive(j10 > 0, Long.valueOf(j10));
        LongProgression.Companion companion = LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j10 = -j10;
        }
        return companion.fromClosedRange(first, last, j10);
    }

    @Nullable
    public static final Byte toByteExactOrNull(short s4) {
        if (intRangeContains((ClosedRange<Integer>) new IntRange(-128, 127), s4)) {
            return Byte.valueOf((byte) s4);
        }
        return null;
    }

    @Nullable
    public static final Integer toIntExactOrNull(float f6) {
        if (-2.1474836E9f > f6 || f6 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f6);
    }

    @Nullable
    public static final Short toShortExactOrNull(double d2) {
        if (-32768.0d > d2 || d2 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d2);
    }

    @NotNull
    public static final IntRange until(byte b10, byte b11) {
        return new IntRange(b10, b11 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, int i10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i10);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static int coerceAtMost(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(i10));
    }

    @NotNull
    public static final IntProgression downTo(short s4, byte b10) {
        return IntProgression.INSTANCE.fromClosedRange(s4, b10, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(j10));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f6) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f6);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f6) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(f6);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f6) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f6);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Nullable
    public static final Byte toByteExactOrNull(double d2) {
        if (-128.0d > d2 || d2 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d2);
    }

    @Nullable
    public static final Short toShortExactOrNull(float f6) {
        if (-32768.0f > f6 || f6 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f6);
    }

    @NotNull
    public static final IntRange until(short s4, byte b10) {
        return new IntRange(s4, b10 - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, long j10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j10);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static long coerceAtMost(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(j10));
    }

    @NotNull
    public static final CharProgression downTo(char c10, char c11) {
        return CharProgression.INSTANCE.fromClosedRange(c10, c11, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(s4));
    }

    @JvmName(name = "intRangeContains")
    public static boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, long j10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j10);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(i10));
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharRange charRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull CharRange charRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i10);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final CharProgression step(@NotNull CharProgression charProgression, int i10) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        ok.e.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        CharProgression.Companion companion = CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.fromClosedRange(first, last, i10);
    }

    @Nullable
    public static final Byte toByteExactOrNull(float f6) {
        if (-128.0f > f6 || f6 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f6);
    }

    @NotNull
    public static final CharRange until(char c10, char c11) {
        return Intrinsics.compare((int) c11, 0) <= 0 ? CharRange.INSTANCE.getEMPTY() : new CharRange(c10, (char) (c11 - 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, long j10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j10);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s4, short s7) {
        return s4 < s7 ? s7 : s4;
    }

    public static final short coerceAtMost(short s4, short s7) {
        return s4 > s7 ? s7 : s4;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(s4));
    }

    @NotNull
    public static IntProgression downTo(int i10, int i11) {
        return IntProgression.INSTANCE.fromClosedRange(i10, i11, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, long j10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j10);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, int i10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(i10));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, int i10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i10);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s4);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T t10, @NotNull T minimumValue) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t10.compareTo(minimumValue) < 0 ? minimumValue : t10;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T coerceAtMost(@NotNull T t10, @NotNull T maximumValue) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t10.compareTo(maximumValue) > 0 ? maximumValue : t10;
    }

    public static final byte coerceIn(byte b10, byte b11, byte b12) {
        if (b11 > b12) {
            throw new IllegalArgumentException(g.b("Cannot coerce value to an empty range: maximum ", b12, " is less than minimum ", b11, '.'));
        }
        if (b10 < b11) {
            return b11;
        }
        return b10 > b12 ? b12 : b10;
    }

    @NotNull
    public static final LongProgression downTo(long j10, int i10) {
        return LongProgression.INSTANCE.fromClosedRange(j10, i10, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(s4));
    }

    @SinceKotlin(version = "1.7")
    public static final char last(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(s4));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, long j10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j10);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static IntRange until(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(i10, i11 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s4);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final IntProgression downTo(byte b10, int i10) {
        return IntProgression.INSTANCE.fromClosedRange(b10, i10, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(s4));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(s4));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, long j10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j10);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final IntProgression downTo(short s4, int i10) {
        return IntProgression.INSTANCE.fromClosedRange(s4, i10, -1);
    }

    @NotNull
    public static final LongRange until(long j10, int i10) {
        return new LongRange(j10, ((long) i10) - 1);
    }

    @NotNull
    public static final LongProgression downTo(int i10, long j10) {
        return LongProgression.INSTANCE.fromClosedRange(i10, j10, -1L);
    }

    @NotNull
    public static final IntRange until(byte b10, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(b10, i10 - 1);
    }

    @NotNull
    public static final LongProgression downTo(long j10, long j11) {
        return LongProgression.INSTANCE.fromClosedRange(j10, j11, -1L);
    }

    @NotNull
    public static final LongProgression downTo(byte b10, long j10) {
        return LongProgression.INSTANCE.fromClosedRange(b10, j10, -1L);
    }

    @NotNull
    public static final IntRange until(short s4, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(s4, i10 - 1);
    }

    @NotNull
    public static final LongProgression downTo(short s4, long j10) {
        return LongProgression.INSTANCE.fromClosedRange(s4, j10, -1L);
    }

    @NotNull
    public static final IntProgression downTo(int i10, short s4) {
        return IntProgression.INSTANCE.fromClosedRange(i10, s4, -1);
    }

    @NotNull
    public static final LongRange until(int i10, long j10) {
        if (j10 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(i10, j10 - 1);
    }

    @NotNull
    public static final LongProgression downTo(long j10, short s4) {
        return LongProgression.INSTANCE.fromClosedRange(j10, s4, -1L);
    }

    @NotNull
    public static final IntProgression downTo(byte b10, short s4) {
        return IntProgression.INSTANCE.fromClosedRange(b10, s4, -1);
    }

    @NotNull
    public static final LongRange until(long j10, long j11) {
        if (j11 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(j10, j11 - 1);
    }

    @NotNull
    public static final IntProgression downTo(short s4, short s7) {
        return IntProgression.INSTANCE.fromClosedRange(s4, s7, -1);
    }

    @NotNull
    public static final LongRange until(byte b10, long j10) {
        if (j10 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(b10, j10 - 1);
    }

    @NotNull
    public static final LongRange until(short s4, long j10) {
        if (j10 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(s4, j10 - 1);
    }

    @NotNull
    public static final IntRange until(int i10, short s4) {
        return new IntRange(i10, s4 - 1);
    }

    @NotNull
    public static final LongRange until(long j10, short s4) {
        return new LongRange(j10, ((long) s4) - 1);
    }

    public static final short coerceIn(short s4, short s7, short s9) {
        if (s7 > s9) {
            throw new IllegalArgumentException(g.b("Cannot coerce value to an empty range: maximum ", s9, " is less than minimum ", s7, '.'));
        }
        if (s4 < s7) {
            return s7;
        }
        return s4 > s9 ? s9 : s4;
    }

    @NotNull
    public static final IntRange until(byte b10, short s4) {
        return new IntRange(b10, s4 - 1);
    }

    @NotNull
    public static final IntRange until(short s4, short s7) {
        return new IntRange(s4, s7 - 1);
    }

    public static int coerceIn(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(g.b("Cannot coerce value to an empty range: maximum ", i12, " is less than minimum ", i11, '.'));
        }
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static long coerceIn(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static float coerceIn(float f6, float f10, float f11) {
        if (f10 <= f11) {
            if (f6 < f10) {
                return f10;
            }
            return f6 > f11 ? f11 : f6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static double coerceIn(double d2, double d3, double d7) {
        if (d3 <= d7) {
            if (d2 < d3) {
                return d3;
            }
            return d2 > d7 ? d7 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d7 + " is less than minimum " + d3 + '.');
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T coerceIn(@NotNull T t10, @NotNull ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.lessThanOrEquals(t10, range.getStart()) || range.lessThanOrEquals(range.getStart(), t10)) {
                return (!range.lessThanOrEquals(range.getEndInclusive(), t10) || range.lessThanOrEquals(t10, range.getEndInclusive())) ? t10 : range.getEndInclusive();
            }
            return range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t10, @NotNull ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) coerceIn((Comparable) t10, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            if (t10.compareTo(range.getStart()) < 0) {
                return (T) range.getStart();
            }
            return t10.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static int coerceIn(int i10, @NotNull ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i10), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i10 < ((Number) range.getStart()).intValue()) {
                return ((Number) range.getStart()).intValue();
            }
            return i10 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long coerceIn(long j10, @NotNull ClosedRange<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j10), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j10 < ((Number) range.getStart()).longValue()) {
                return ((Number) range.getStart()).longValue();
            }
            return j10 > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
