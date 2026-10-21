package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f9141p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f9142q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ List<Float> f9143r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f9144s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f9145t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f9146u0;
    public final /* synthetic */ CoroutineScope v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> f9147w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f9148x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Function0<Unit> function0, CoroutineScope coroutineScope, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.f9141p0 = mutableFloatState;
        this.f9142q0 = mutableFloatState2;
        this.f9143r0 = list;
        this.f9144s0 = floatRef;
        this.f9145t0 = floatRef2;
        this.f9146u0 = function0;
        this.v0 = coroutineScope;
        this.f9147w0 = state;
        this.f9148x0 = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        float floatValue = (zBooleanValue ? this.f9141p0 : this.f9142q0).getFloatValue();
        float fAccess$snapValueToTick = SliderKt.access$snapValueToTick(floatValue, this.f9143r0, this.f9144s0.element, this.f9145t0.element);
        if (floatValue == fAccess$snapValueToTick) {
            Function0<Unit> function0 = this.f9146u0;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new y1(floatValue, fAccess$snapValueToTick, this.f9146u0, zBooleanValue, this.f9141p0, this.f9142q0, this.f9147w0, this.f9144s0, this.f9145t0, this.f9148x0, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
