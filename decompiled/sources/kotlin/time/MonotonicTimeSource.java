package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0010\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "", "toString", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "markNow", "timeMark", "Lkotlin/time/Duration;", "elapsedFrom-6eNON_k", "(J)J", "elapsedFrom", "one", "another", "differenceBetween-fRLX17w", "(JJ)J", "differenceBetween", TypedValues.TransitionType.S_DURATION, "adjustReading-6QKq23U", "adjustReading", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    @NotNull
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f82386a = System.nanoTime();

    /* JADX INFO: renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m5912adjustReading6QKq23U(long timeMark, long duration) {
        return TimeSource.Monotonic.ValueTimeMark.m5923constructorimpl(LongSaturatedMathKt.m5911saturatingAddNuflL3o(timeMark, DurationUnit.NANOSECONDS, duration));
    }

    /* JADX INFO: renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m5913differenceBetweenfRLX17w(long one, long another) {
        return LongSaturatedMathKt.saturatingOriginsDiff(one, another, DurationUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m5914elapsedFrom6eNON_k(long timeMark) {
        return LongSaturatedMathKt.saturatingDiff(System.nanoTime() - f82386a, timeMark, DurationUnit.NANOSECONDS);
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m5920boximpl(m5915markNowz9LOYto());
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m5915markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m5923constructorimpl(System.nanoTime() - f82386a);
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ TimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m5920boximpl(m5915markNowz9LOYto());
    }
}
