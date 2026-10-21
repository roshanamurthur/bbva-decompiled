package h0;

import androidx.compose.material.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Float> f68996p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f68997q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f68998r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f68999s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f69000t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f69001u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o2(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, MutableState<Float> mutableState, float f6, int i10) {
        super(2);
        this.f68996p0 = function1;
        this.f68997q0 = closedFloatingPointRange;
        this.f68998r0 = closedFloatingPointRange2;
        this.f68999s0 = mutableState;
        this.f69000t0 = f6;
        this.f69001u0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        SliderKt.access$CorrectValueSideEffect(this.f68996p0, this.f68997q0, this.f68998r0, this.f68999s0, this.f69000t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f69001u0 | 1));
        return Unit.INSTANCE;
    }
}
