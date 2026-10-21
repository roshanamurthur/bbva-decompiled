package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.metrics.Tabulator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H$J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "", "read", "Lkotlin/time/ComparableTimeMark;", "markNow", "Lkotlin/time/DurationUnit;", "a", "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", Tabulator.KEY_UNIT, "<init>", "(Lkotlin/time/DurationUnit;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@ExperimentalTime
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DurationUnit unit;

    /* JADX INFO: compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$a;", "Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "elapsedNow", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "minus", "", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "startedAt", "Lkotlin/time/AbstractDoubleTimeSource;", "timeSource", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class a implements ComparableTimeMark {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final double f82372p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final AbstractDoubleTimeSource f82373q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f82374r0;

        public a(double d2, AbstractDoubleTimeSource timeSource, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f82372p0 = d2;
            this.f82373q0 = timeSource;
            this.f82374r0 = j10;
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo5804elapsedNowUwyO8pc() {
            AbstractDoubleTimeSource abstractDoubleTimeSource = this.f82373q0;
            return Duration.m5841minusLRDsOJo(DurationKt.toDuration(abstractDoubleTimeSource.read() - this.f82372p0, abstractDoubleTimeSource.getUnit()), this.f82374r0);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object other) {
            if (other instanceof a) {
                if (Intrinsics.areEqual(this.f82373q0, ((a) other).f82373q0) && Duration.m5816equalsimpl0(mo5806minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m5888getZEROUwyO8pc())) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Duration.m5836hashCodeimpl(Duration.m5842plusLRDsOJo(DurationKt.toDuration(this.f82372p0, this.f82373q0.getUnit()), this.f82374r0));
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo5805minusLRDsOJo(long j10) {
            return ComparableTimeMark.DefaultImpls.m5808minusLRDsOJo(this, j10);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
        public long mo5806minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                AbstractDoubleTimeSource abstractDoubleTimeSource = aVar.f82373q0;
                AbstractDoubleTimeSource abstractDoubleTimeSource2 = this.f82373q0;
                if (Intrinsics.areEqual(abstractDoubleTimeSource2, abstractDoubleTimeSource)) {
                    long j10 = aVar.f82374r0;
                    long j11 = this.f82374r0;
                    if (Duration.m5816equalsimpl0(j11, j10) && Duration.m5838isInfiniteimpl(j11)) {
                        return Duration.INSTANCE.m5888getZEROUwyO8pc();
                    }
                    long jM5841minusLRDsOJo = Duration.m5841minusLRDsOJo(j11, aVar.f82374r0);
                    long duration = DurationKt.toDuration(this.f82372p0 - aVar.f82372p0, abstractDoubleTimeSource2.getUnit());
                    return Duration.m5816equalsimpl0(duration, Duration.m5859unaryMinusUwyO8pc(jM5841minusLRDsOJo)) ? Duration.INSTANCE.m5888getZEROUwyO8pc() : Duration.m5842plusLRDsOJo(duration, jM5841minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DoubleTimeMark(");
            sb2.append(this.f82372p0);
            AbstractDoubleTimeSource abstractDoubleTimeSource = this.f82373q0;
            sb2.append(DurationUnitKt__DurationUnitKt.shortName(abstractDoubleTimeSource.getUnit()));
            sb2.append(" + ");
            sb2.append((Object) Duration.m5855toStringimpl(this.f82374r0));
            sb2.append(", ");
            sb2.append(abstractDoubleTimeSource);
            sb2.append(RootService.CLOSE_BRACKET);
            return sb2.toString();
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo5807plusLRDsOJo(long duration) {
            return new a(this.f82372p0, this.f82373q0, Duration.m5842plusLRDsOJo(this.f82374r0, duration), null);
        }
    }

    public AbstractDoubleTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract double read();

    @Override // kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new a(read(), this, Duration.INSTANCE.m5888getZEROUwyO8pc(), null);
    }
}
