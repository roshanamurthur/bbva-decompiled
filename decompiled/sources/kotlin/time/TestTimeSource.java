package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "", "read", "Lkotlin/time/Duration;", TypedValues.TransitionType.S_DURATION, "", "plusAssign-LRDsOJo", "(J)V", "plusAssign", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
public final class TestTimeSource extends AbstractLongTimeSource {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f82387c;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    public final void a(long j10) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f82387c + DurationUnitKt__DurationUnitKt.shortName(getCom.noknok.android.client.metrics.Tabulator.KEY_UNIT java.lang.String()) + " is advanced by " + ((Object) Duration.m5855toStringimpl(j10)) + '.');
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m5916plusAssignLRDsOJo(long duration) {
        long jM5852toLongimpl = Duration.m5852toLongimpl(duration, getCom.noknok.android.client.metrics.Tabulator.KEY_UNIT java.lang.String());
        if (((jM5852toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j10 = this.f82387c;
            long j11 = j10 + jM5852toLongimpl;
            if ((jM5852toLongimpl ^ j10) < 0 || (j10 ^ j11) >= 0) {
                this.f82387c = j11;
                return;
            } else {
                a(duration);
                throw null;
            }
        }
        long jM5814divUwyO8pc = Duration.m5814divUwyO8pc(duration, 2);
        if ((1 | (Duration.m5852toLongimpl(jM5814divUwyO8pc, getCom.noknok.android.client.metrics.Tabulator.KEY_UNIT java.lang.String()) - 1)) == Long.MAX_VALUE) {
            a(duration);
            throw null;
        }
        long j12 = this.f82387c;
        try {
            m5916plusAssignLRDsOJo(jM5814divUwyO8pc);
            m5916plusAssignLRDsOJo(Duration.m5841minusLRDsOJo(duration, jM5814divUwyO8pc));
        } catch (IllegalStateException e5) {
            this.f82387c = j12;
            throw e5;
        }
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* JADX INFO: renamed from: read, reason: from getter */
    public long getF82387c() {
        return this.f82387c;
    }
}
