package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.noknok.android.client.metrics.Tabulator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\f\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0080\b¨\u0006\u0012"}, d2 = {"", "value", "Lkotlin/time/DurationUnit;", Tabulator.KEY_UNIT, "Lkotlin/time/Duration;", TypedValues.TransitionType.S_DURATION, "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAdd", "valueNs", "origin", "saturatingDiff", "(JJLkotlin/time/DurationUnit;)J", "origin1", "origin2", "saturatingOriginsDiff", "", "isSaturated", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class LongSaturatedMathKt {
    public static final long a(long j10) {
        return j10 < 0 ? Duration.INSTANCE.m5887getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m5886getINFINITEUwyO8pc();
    }

    public static final long b(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return DurationKt.toDuration(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m5859unaryMinusUwyO8pc(a(j12));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jConvertDurationUnit) - (j11 / jConvertDurationUnit);
        long j14 = (j10 % jConvertDurationUnit) - (j11 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m5842plusLRDsOJo(DurationKt.toDuration(j13, durationUnit2), DurationKt.toDuration(j14, durationUnit));
    }

    public static final boolean isSaturated(long j10) {
        return ((j10 - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m5911saturatingAddNuflL3o(long j10, @NotNull DurationUnit unit, long j11) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM5852toLongimpl = Duration.m5852toLongimpl(j11, unit);
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            if (!Duration.m5838isInfiniteimpl(j11) || (j10 ^ jM5852toLongimpl) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        if (((jM5852toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            long jM5814divUwyO8pc = Duration.m5814divUwyO8pc(j11, 2);
            long jM5852toLongimpl2 = Duration.m5852toLongimpl(jM5814divUwyO8pc, unit);
            return (1 | (jM5852toLongimpl2 - 1)) == Long.MAX_VALUE ? jM5852toLongimpl2 : m5911saturatingAddNuflL3o(m5911saturatingAddNuflL3o(j10, unit, jM5814divUwyO8pc), unit, Duration.m5841minusLRDsOJo(j11, jM5814divUwyO8pc));
        }
        long j12 = j10 + jM5852toLongimpl;
        if (((jM5852toLongimpl ^ j12) & (j10 ^ j12)) < 0) {
            return j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j12;
    }

    public static final long saturatingDiff(long j10, long j11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? Duration.m5859unaryMinusUwyO8pc(a(j11)) : b(j10, j11, unit);
    }

    public static final long saturatingOriginsDiff(long j10, long j11, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return j10 == j11 ? Duration.INSTANCE.m5888getZEROUwyO8pc() : Duration.m5859unaryMinusUwyO8pc(a(j11));
        }
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : b(j10, j11, unit);
    }
}
