package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.metrics.Tabulator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H$J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "", "read", "Lkotlin/time/ComparableTimeMark;", "markNow", "Lkotlin/time/DurationUnit;", "a", "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", Tabulator.KEY_UNIT, "<init>", "(Lkotlin/time/DurationUnit;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalTime.class})
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DurationUnit unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f82376b;

    /* JADX INFO: compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$a;", "Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "elapsedNow", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "minus", "", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "startedAt", "Lkotlin/time/AbstractLongTimeSource;", "timeSource", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    public static final class a implements ComparableTimeMark {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f82377p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final AbstractLongTimeSource f82378q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f82379r0;

        public a(long j10, AbstractLongTimeSource timeSource, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f82377p0 = j10;
            this.f82378q0 = timeSource;
            this.f82379r0 = j11;
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo5804elapsedNowUwyO8pc() {
            AbstractLongTimeSource abstractLongTimeSource = this.f82378q0;
            return Duration.m5841minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(AbstractLongTimeSource.access$adjustedRead(abstractLongTimeSource), this.f82377p0, abstractLongTimeSource.getUnit()), this.f82379r0);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object other) {
            if (other instanceof a) {
                if (Intrinsics.areEqual(this.f82378q0, ((a) other).f82378q0) && Duration.m5816equalsimpl0(mo5806minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m5888getZEROUwyO8pc())) {
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
            int iM5836hashCodeimpl = Duration.m5836hashCodeimpl(this.f82379r0) * 37;
            long j10 = this.f82377p0;
            return iM5836hashCodeimpl + ((int) (j10 ^ (j10 >>> 32)));
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo5805minusLRDsOJo(long j10) {
            return ComparableTimeMark.DefaultImpls.m5808minusLRDsOJo(this, j10);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo5806minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                AbstractLongTimeSource abstractLongTimeSource = aVar.f82378q0;
                AbstractLongTimeSource abstractLongTimeSource2 = this.f82378q0;
                if (Intrinsics.areEqual(abstractLongTimeSource2, abstractLongTimeSource)) {
                    return Duration.m5842plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.f82377p0, aVar.f82377p0, abstractLongTimeSource2.getUnit()), Duration.m5841minusLRDsOJo(this.f82379r0, aVar.f82379r0));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LongTimeMark(");
            sb2.append(this.f82377p0);
            AbstractLongTimeSource abstractLongTimeSource = this.f82378q0;
            sb2.append(DurationUnitKt__DurationUnitKt.shortName(abstractLongTimeSource.getUnit()));
            sb2.append(" + ");
            sb2.append((Object) Duration.m5855toStringimpl(this.f82379r0));
            sb2.append(", ");
            sb2.append(abstractLongTimeSource);
            sb2.append(RootService.CLOSE_BRACKET);
            return sb2.toString();
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo5807plusLRDsOJo(long duration) {
            DurationUnit unit = this.f82378q0.getUnit();
            boolean zM5838isInfiniteimpl = Duration.m5838isInfiniteimpl(duration);
            long j10 = this.f82377p0;
            if (zM5838isInfiniteimpl) {
                return new a(LongSaturatedMathKt.m5911saturatingAddNuflL3o(j10, unit, duration), this.f82378q0, Duration.INSTANCE.m5888getZEROUwyO8pc(), null);
            }
            long jM5858truncateToUwyO8pc$kotlin_stdlib = Duration.m5858truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long jM5842plusLRDsOJo = Duration.m5842plusLRDsOJo(Duration.m5841minusLRDsOJo(duration, jM5858truncateToUwyO8pc$kotlin_stdlib), this.f82379r0);
            long jM5911saturatingAddNuflL3o = LongSaturatedMathKt.m5911saturatingAddNuflL3o(j10, unit, jM5858truncateToUwyO8pc$kotlin_stdlib);
            long jM5858truncateToUwyO8pc$kotlin_stdlib2 = Duration.m5858truncateToUwyO8pc$kotlin_stdlib(jM5842plusLRDsOJo, unit);
            long jM5911saturatingAddNuflL3o2 = LongSaturatedMathKt.m5911saturatingAddNuflL3o(jM5911saturatingAddNuflL3o, unit, jM5858truncateToUwyO8pc$kotlin_stdlib2);
            long jM5841minusLRDsOJo = Duration.m5841minusLRDsOJo(jM5842plusLRDsOJo, jM5858truncateToUwyO8pc$kotlin_stdlib2);
            long jM5831getInWholeNanosecondsimpl = Duration.m5831getInWholeNanosecondsimpl(jM5841minusLRDsOJo);
            if (jM5911saturatingAddNuflL3o2 != 0 && jM5831getInWholeNanosecondsimpl != 0 && (jM5911saturatingAddNuflL3o2 ^ jM5831getInWholeNanosecondsimpl) < 0) {
                long duration2 = DurationKt.toDuration(c.getSign(jM5831getInWholeNanosecondsimpl), unit);
                jM5911saturatingAddNuflL3o2 = LongSaturatedMathKt.m5911saturatingAddNuflL3o(jM5911saturatingAddNuflL3o2, unit, duration2);
                jM5841minusLRDsOJo = Duration.m5841minusLRDsOJo(jM5841minusLRDsOJo, duration2);
            }
            if ((1 | (jM5911saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                jM5841minusLRDsOJo = Duration.INSTANCE.m5888getZEROUwyO8pc();
            }
            return new a(jM5911saturatingAddNuflL3o2, this.f82378q0, jM5841minusLRDsOJo, null);
        }
    }

    /* JADX INFO: compiled from: TimeSources.kt */
    public static final class b extends Lambda implements Function0<Long> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return Long.valueOf(AbstractLongTimeSource.this.read());
        }
    }

    public AbstractLongTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.f82376b = LazyKt__LazyJVMKt.lazy(new b());
    }

    public static final long access$adjustedRead(AbstractLongTimeSource abstractLongTimeSource) {
        return abstractLongTimeSource.read() - ((Number) abstractLongTimeSource.f82376b.getValue()).longValue();
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract long read();

    @Override // kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new a(read() - ((Number) this.f82376b.getValue()).longValue(), this, Duration.INSTANCE.m5888getZEROUwyO8pc(), null);
    }
}
