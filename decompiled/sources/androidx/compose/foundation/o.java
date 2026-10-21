package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function0<Offset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Density f5339p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Density, Offset>> f5340q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Offset> f5341r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Density density, State<? extends Function1<? super Density, Offset>> state, MutableState<Offset> mutableState) {
        super(0);
        this.f5339p0 = density;
        this.f5340q0 = state;
        this.f5341r0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Offset invoke() {
        long f15533a = this.f5340q0.getValue().invoke(this.f5339p0).getF15533a();
        MutableState<Offset> mutableState = this.f5341r0;
        return Offset.m2264boximpl((OffsetKt.m2294isSpecifiedk4lQ0M(mutableState.getValue().getF15533a()) && OffsetKt.m2294isSpecifiedk4lQ0M(f15533a)) ? Offset.m2280plusMKHz9U(mutableState.getValue().getF15533a(), f15533a) : Offset.INSTANCE.m2290getUnspecifiedF1C5BW0());
    }
}
