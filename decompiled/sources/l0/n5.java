package l0;

import androidx.compose.material3.TooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f82744p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82745q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f82746r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n5(long j10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
        super(2);
        this.f82744p0 = j10;
        this.f82745q0 = function2;
        this.f82746r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82746r0 | 1);
        TooltipKt.m1490access$PlainTooltipImplIv8Zu3U(this.f82744p0, this.f82745q0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
