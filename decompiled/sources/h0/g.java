package h0;

import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f68772p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68773q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<Constraints, Constraints> f68774r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function4<Constraints, Float, Composer, Integer, Unit> f68775s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f68776t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Constraints, Constraints> function1, Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, int i10) {
        super(2);
        this.f68772p0 = modifier;
        this.f68773q0 = function2;
        this.f68774r0 = function1;
        this.f68775s0 = function4;
        this.f68776t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        BackdropScaffoldKt.access$BackdropStack(this.f68772p0, this.f68773q0, this.f68774r0, this.f68775s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68776t0 | 1));
        return Unit.INSTANCE;
    }
}
