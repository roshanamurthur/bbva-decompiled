package l0;

import androidx.compose.material3.SwipeableV2Kt;
import androidx.compose.material3.SwipeableV2State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SwipeableV2State<Object> f82580p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(SwipeableV2State<Object> swipeableV2State) {
        super(0);
        this.f82580p0 = swipeableV2State;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float fAccess$minOrNull = SwipeableV2Kt.access$minOrNull(this.f82580p0.getAnchors$material3_release());
        return Float.valueOf(fAccess$minOrNull != null ? fAccess$minOrNull.floatValue() : Float.NEGATIVE_INFINITY);
    }
}
