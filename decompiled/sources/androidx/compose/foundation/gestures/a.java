package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function1<PointerInputChange, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f4011p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SendChannel<DragEvent> f4012q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f4013r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(VelocityTracker velocityTracker, SendChannel<? super DragEvent> sendChannel, boolean z10) {
        super(1);
        this.f4011p0 = velocityTracker;
        this.f4012q0 = sendChannel;
        this.f4013r0 = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PointerInputChange pointerInputChange) {
        PointerInputChange event = pointerInputChange;
        Intrinsics.checkNotNullParameter(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.f4011p0, event);
        if (!PointerEventKt.changedToUpIgnoreConsumed(event)) {
            long jPositionChange = PointerEventKt.positionChange(event);
            event.consume();
            if (this.f4013r0) {
                jPositionChange = Offset.m2282timestuRUvjQ(jPositionChange, -1.0f);
            }
            this.f4012q0.mo5953trySendJP2dKIU(new DragEvent.DragDelta(jPositionChange, null));
        }
        return Unit.INSTANCE;
    }
}
