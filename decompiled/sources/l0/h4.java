package l0;

import androidx.compose.material3.SwipeableV2State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SwipeableV2State<Object> f82600p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(SwipeableV2State<Object> swipeableV2State) {
        super(0);
        this.f82600p0 = swipeableV2State;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        SwipeableV2State<Object> swipeableV2State = this.f82600p0;
        Float f6 = swipeableV2State.getAnchors$material3_release().get(swipeableV2State.getCurrentValue());
        float f10 = 0.0f;
        float fFloatValue = f6 != null ? f6.floatValue() : 0.0f;
        Float f11 = swipeableV2State.getAnchors$material3_release().get(swipeableV2State.getTargetValue());
        float fFloatValue2 = (f11 != null ? f11.floatValue() : 0.0f) - fFloatValue;
        if (Math.abs(fFloatValue2) > 1.0E-6f) {
            float fRequireOffset = (swipeableV2State.requireOffset() - fFloatValue) / fFloatValue2;
            if (fRequireOffset >= 1.0E-6f) {
                if (fRequireOffset > 0.999999f) {
                    f10 = 1.0f;
                } else {
                    f10 = fRequireOffset;
                }
            }
        } else {
            f10 = 1.0f;
        }
        return Float.valueOf(f10);
    }
}
