package h0;

import androidx.compose.material.BottomNavigationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomNavigation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68897p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68898q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f68899r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f68900s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, float f6, int i10) {
        super(2);
        this.f68897p0 = function2;
        this.f68898q0 = function3;
        this.f68899r0 = f6;
        this.f68900s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f68900s0 | 1);
        Function2<Composer, Integer, Unit> function2 = this.f68898q0;
        float f6 = this.f68899r0;
        BottomNavigationKt.access$BottomNavigationItemBaselineLayout(this.f68897p0, function2, f6, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
