package j0;

import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PullRefreshIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f78740p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f78741q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Modifier f78742r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f78743s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PullRefreshState pullRefreshState, long j10, Modifier modifier, int i10) {
        super(2);
        this.f78740p0 = pullRefreshState;
        this.f78741q0 = j10;
        this.f78742r0 = modifier;
        this.f78743s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        PullRefreshIndicatorKt.m890access$CircularArrowIndicatoriJQMabo(this.f78740p0, this.f78741q0, this.f78742r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f78743s0 | 1));
        return Unit.INSTANCE;
    }
}
