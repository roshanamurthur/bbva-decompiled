package h0;

import androidx.compose.material.DrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f69189p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f69190q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Float> f69191r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ long f69192s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f69193t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(boolean z10, Function0<Unit> function0, Function0<Float> function1, long j10, int i10) {
        super(2);
        this.f69189p0 = z10;
        this.f69190q0 = function0;
        this.f69191r0 = function1;
        this.f69192s0 = j10;
        this.f69193t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        DrawerKt.m753access$ScrimBx497Mc(this.f69189p0, this.f69190q0, this.f69191r0, this.f69192s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f69193t0 | 1));
        return Unit.INSTANCE;
    }
}
