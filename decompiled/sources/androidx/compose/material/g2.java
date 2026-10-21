package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8478p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<Float> f8479q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8480r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8481s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8482t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ h0.m2 f8483u0;
    public final /* synthetic */ Function0<Unit> v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(MutableFloatState mutableFloatState, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, CoroutineScope coroutineScope, h0.m2 m2Var, Function0<Unit> function0) {
        super(1);
        this.f8478p0 = mutableFloatState;
        this.f8479q0 = list;
        this.f8480r0 = floatRef;
        this.f8481s0 = floatRef2;
        this.f8482t0 = coroutineScope;
        this.f8483u0 = m2Var;
        this.v0 = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f6) {
        Function0<Unit> function0;
        float fFloatValue = f6.floatValue();
        float floatValue = this.f8478p0.getFloatValue();
        float fAccess$snapValueToTick = SliderKt.access$snapValueToTick(floatValue, this.f8479q0, this.f8480r0.element, this.f8481s0.element);
        if (floatValue != fAccess$snapValueToTick) {
            BuildersKt__Builders_commonKt.launch$default(this.f8482t0, null, null, new f2(this.f8483u0, floatValue, fAccess$snapValueToTick, fFloatValue, this.v0, null), 3, null);
        } else if (!((Boolean) this.f8483u0.f68913b.getValue()).booleanValue() && (function0 = this.v0) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
