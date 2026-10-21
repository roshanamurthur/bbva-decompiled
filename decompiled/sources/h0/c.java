package h0;

import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.material.BackdropValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BackdropValue f68681p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68682q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68683r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f68684s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(BackdropValue backdropValue, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, int i10) {
        super(2);
        this.f68681p0 = backdropValue;
        this.f68682q0 = function2;
        this.f68683r0 = function3;
        this.f68684s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f68684s0 | 1);
        Function2<Composer, Integer, Unit> function2 = this.f68682q0;
        Function2<Composer, Integer, Unit> function3 = this.f68683r0;
        BackdropScaffoldKt.access$BackLayerTransition(this.f68681p0, function2, function3, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
