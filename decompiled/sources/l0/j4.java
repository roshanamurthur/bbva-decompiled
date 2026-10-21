package l0;

import androidx.compose.material3.SwipeableV2State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j4 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SwipeableV2State<Object> f82630p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(SwipeableV2State<Object> swipeableV2State) {
        super(0);
        this.f82630p0 = swipeableV2State;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SwipeableV2State<Object> swipeableV2State = this.f82630p0;
        Object value = swipeableV2State.f11846n.getValue();
        if (value != null) {
            return value;
        }
        Float offset = swipeableV2State.getOffset();
        return offset != null ? swipeableV2State.a(offset.floatValue(), 0.0f, swipeableV2State.getCurrentValue()) : swipeableV2State.getCurrentValue();
    }
}
