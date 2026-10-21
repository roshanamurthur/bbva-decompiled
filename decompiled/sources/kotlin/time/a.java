package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lkotlin/time/a;", "Lkotlin/time/TimeMark;", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "elapsedNow", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "mark", "adjustment", "<init>", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class a implements TimeMark {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final TimeMark f82392p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f82393q0;

    public a(TimeMark mark, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.f82392p0 = mark;
        this.f82393q0 = j10;
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo5804elapsedNowUwyO8pc() {
        return Duration.m5841minusLRDsOJo(this.f82392p0.mo5804elapsedNowUwyO8pc(), this.f82393q0);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public TimeMark mo5805minusLRDsOJo(long j10) {
        return TimeMark.DefaultImpls.m5917minusLRDsOJo(this, j10);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo5807plusLRDsOJo(long duration) {
        return new a(this.f82392p0, Duration.m5842plusLRDsOJo(this.f82393q0, duration), null);
    }
}
