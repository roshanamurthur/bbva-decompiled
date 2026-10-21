package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8446q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8447r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8448s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f8449t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f8450u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e2(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State<? extends Function1<? super Float, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.f8445p0 = mutableFloatState;
        this.f8446q0 = mutableFloatState2;
        this.f8447r0 = floatRef;
        this.f8448s0 = floatRef2;
        this.f8449t0 = state;
        this.f8450u0 = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f6) {
        float fFloatValue = f6.floatValue();
        MutableFloatState mutableFloatState = this.f8445p0;
        float floatValue = mutableFloatState.getFloatValue() + fFloatValue;
        MutableFloatState mutableFloatState2 = this.f8446q0;
        mutableFloatState.setFloatValue(mutableFloatState2.getFloatValue() + floatValue);
        mutableFloatState2.setFloatValue(0.0f);
        float floatValue2 = mutableFloatState.getFloatValue();
        Ref.FloatRef floatRef = this.f8447r0;
        float f10 = floatRef.element;
        Ref.FloatRef floatRef2 = this.f8448s0;
        float fCoerceIn = kotlin.ranges.c.coerceIn(floatValue2, f10, floatRef2.element);
        Function1<Float, Unit> value = this.f8449t0.getValue();
        float f11 = floatRef.element;
        float f12 = floatRef2.element;
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f8450u0;
        value.invoke(Float.valueOf(SliderKt.access$scale(f11, f12, fCoerceIn, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue())));
        return Unit.INSTANCE;
    }
}
