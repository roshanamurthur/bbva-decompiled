package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> f8388p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f8389q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b2(State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, float f6) {
        super(1);
        this.f8388p0 = state;
        this.f8389q0 = f6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f6) {
        this.f8388p0.getValue().invoke(ok.e.rangeTo(f6.floatValue(), this.f8389q0));
        return Unit.INSTANCE;
    }
}
