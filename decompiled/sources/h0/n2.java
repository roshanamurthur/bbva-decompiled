package h0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f68943p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Float> f68944q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f68945r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f68946s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f68947t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n2(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super Float, Float> function1, float f6, MutableState<Float> mutableState, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(0);
        this.f68943p0 = closedFloatingPointRange;
        this.f68944q0 = function1;
        this.f68945r0 = f6;
        this.f68946s0 = mutableState;
        this.f68947t0 = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f68943p0;
        float fFloatValue = (closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) / 1000;
        float fFloatValue2 = this.f68944q0.invoke(Float.valueOf(this.f68945r0)).floatValue();
        MutableState<Float> mutableState = this.f68946s0;
        if (Math.abs(fFloatValue2 - mutableState.getValue().floatValue()) > fFloatValue) {
            if (this.f68947t0.contains(mutableState.getValue())) {
                mutableState.setValue(Float.valueOf(fFloatValue2));
            }
        }
        return Unit.INSTANCE;
    }
}
