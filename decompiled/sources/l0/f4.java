package l0;

import androidx.compose.material3.SwipeableV2Kt;
import androidx.compose.material3.SwipeableV2State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SwipeableV2State<Object> f82552p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(SwipeableV2State<Object> swipeableV2State) {
        super(0);
        this.f82552p0 = swipeableV2State;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float fAccess$maxOrNull = SwipeableV2Kt.access$maxOrNull(this.f82552p0.getAnchors$material3_release());
        return Float.valueOf(fAccess$maxOrNull != null ? fAccess$maxOrNull.floatValue() : Float.POSITIVE_INFINITY);
    }
}
