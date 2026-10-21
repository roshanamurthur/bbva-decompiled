package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends Lambda implements Function2<Boolean, Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8364p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8365q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f8366r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8367s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8368t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> f8369u0;
    public final /* synthetic */ ClosedFloatingPointRange<Float> v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a2(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(2);
        this.f8364p0 = mutableFloatState;
        this.f8365q0 = mutableFloatState2;
        this.f8366r0 = closedFloatingPointRange;
        this.f8367s0 = floatRef;
        this.f8368t0 = floatRef2;
        this.f8369u0 = state;
        this.v0 = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Float f6) {
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        boolean zBooleanValue = bool.booleanValue();
        float fFloatValue = f6.floatValue();
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f8366r0;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.v0;
        Ref.FloatRef floatRef = this.f8368t0;
        Ref.FloatRef floatRef2 = this.f8367s0;
        MutableFloatState mutableFloatState = this.f8365q0;
        MutableFloatState mutableFloatState2 = this.f8364p0;
        if (zBooleanValue) {
            mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + fFloatValue);
            mutableFloatState.setFloatValue(SliderKt.a.a(closedFloatingPointRange.getEndInclusive().floatValue(), floatRef2, floatRef, closedFloatingPointRange2));
            float floatValue = mutableFloatState.getFloatValue();
            closedFloatingPointRangeRangeTo = ok.e.rangeTo(kotlin.ranges.c.coerceIn(mutableFloatState2.getFloatValue(), floatRef2.element, floatValue), floatValue);
        } else {
            mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + fFloatValue);
            mutableFloatState2.setFloatValue(SliderKt.a.a(closedFloatingPointRange.getStart().floatValue(), floatRef2, floatRef, closedFloatingPointRange2));
            float floatValue2 = mutableFloatState2.getFloatValue();
            closedFloatingPointRangeRangeTo = ok.e.rangeTo(floatValue2, kotlin.ranges.c.coerceIn(mutableFloatState.getFloatValue(), floatValue2, floatRef.element));
        }
        this.f8369u0.getValue().invoke(SliderKt.access$scale(floatRef2.element, floatRef.element, closedFloatingPointRangeRangeTo, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue()));
        return Unit.INSTANCE;
    }
}
