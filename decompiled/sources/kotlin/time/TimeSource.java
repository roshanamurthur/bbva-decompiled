package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f82388a;

    /* JADX INFO: compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f82388a = new Companion();
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Monotonic implements WithComparableMarks {

        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        /* JADX INFO: compiled from: TimeSource.kt */
        @SinceKotlin(version = "1.9")
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010'\u001a\u00060%j\u0002`&¢\u0006\u0004\b(\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010$\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#\u0088\u0001'\u0092\u0001\u00060%j\u0002`&\u0082\u0002\u0004\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "(J)J", "elapsedNow", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(JJ)J", "plus", "minus-LRDsOJo", "minus", "", "hasPassedNow-impl", "(J)Z", "hasPassedNow", "hasNotPassedNow-impl", "hasNotPassedNow", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus-6eNON_k", "", "compareTo-6eNON_k", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "constructor-impl", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        public static final class ValueTimeMark implements ComparableTimeMark {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final long f82389p0;

            public /* synthetic */ ValueTimeMark(long j10) {
                this.f82389p0 = j10;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m5920boximpl(long j10) {
                return new ValueTimeMark(j10);
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m5921compareTo6eNON_k(long j10, long j11) {
                return Duration.m5810compareToLRDsOJo(m5930minus6eNON_k(j10, j11), Duration.INSTANCE.m5888getZEROUwyO8pc());
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m5922compareToimpl(long j10, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m5920boximpl(j10).compareTo(other);
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m5925equalsimpl(long j10, Object obj) {
                return (obj instanceof ValueTimeMark) && j10 == ((ValueTimeMark) obj).getF82389p0();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m5926equalsimpl0(long j10, long j11) {
                return j10 == j11;
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m5927hasNotPassedNowimpl(long j10) {
                return Duration.m5839isNegativeimpl(m5924elapsedNowUwyO8pc(j10));
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m5928hasPassedNowimpl(long j10) {
                return !Duration.m5839isNegativeimpl(m5924elapsedNowUwyO8pc(j10));
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m5929hashCodeimpl(long j10) {
                return (int) (j10 ^ (j10 >>> 32));
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m5930minus6eNON_k(long j10, long j11) {
                return MonotonicTimeSource.INSTANCE.m5913differenceBetweenfRLX17w(j10, j11);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m5934toStringimpl(long j10) {
                return "ValueTimeMark(reading=" + j10 + RootService.CLOSE_BRACKET;
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo5804elapsedNowUwyO8pc() {
                return m5924elapsedNowUwyO8pc(this.f82389p0);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return m5925equalsimpl(this.f82389p0, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m5927hasNotPassedNowimpl(this.f82389p0);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m5928hasPassedNowimpl(this.f82389p0);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m5929hashCodeimpl(this.f82389p0);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo5805minusLRDsOJo(long j10) {
                return m5920boximpl(m5935minusLRDsOJo(j10));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo5806minusUwyO8pc(@NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m5932minusUwyO8pc(this.f82389p0, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo5807plusLRDsOJo(long j10) {
                return m5920boximpl(m5936plusLRDsOJo(j10));
            }

            public String toString() {
                return m5934toStringimpl(this.f82389p0);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getF82389p0() {
                return this.f82389p0;
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m5924elapsedNowUwyO8pc(long j10) {
                return MonotonicTimeSource.INSTANCE.m5914elapsedFrom6eNON_k(j10);
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m5932minusUwyO8pc(long j10, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m5930minus6eNON_k(j10, ((ValueTimeMark) other).getF82389p0());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m5934toStringimpl(j10)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo5805minusLRDsOJo(long j10) {
                return m5920boximpl(m5935minusLRDsOJo(j10));
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo5807plusLRDsOJo(long j10) {
                return m5920boximpl(m5936plusLRDsOJo(j10));
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m5935minusLRDsOJo(long j10) {
                return m5931minusLRDsOJo(this.f82389p0, j10);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m5936plusLRDsOJo(long j10) {
                return m5933plusLRDsOJo(this.f82389p0, j10);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m5931minusLRDsOJo(long j10, long j11) {
                return MonotonicTimeSource.INSTANCE.m5912adjustReading6QKq23U(j10, Duration.m5859unaryMinusUwyO8pc(j11));
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m5933plusLRDsOJo(long j10, long j11) {
                return MonotonicTimeSource.INSTANCE.m5912adjustReading6QKq23U(j10, j11);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m5923constructorimpl(long j10) {
                return j10;
            }
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m5920boximpl(m5919markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m5919markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m5915markNowz9LOYto();
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m5920boximpl(m5919markNowz9LOYto());
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @SinceKotlin(version = "1.9")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        @NotNull
        ComparableTimeMark markNow();
    }

    @NotNull
    TimeMark markNow();
}
