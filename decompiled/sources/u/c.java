package u;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f93640p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f93641q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VelocityTracker velocityTracker, Ref.LongRef longRef) {
        super(2);
        this.f93640p0 = velocityTracker;
        this.f93641q0 = longRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
        PointerInputChange event = pointerInputChange;
        long f15533a = offset.getF15533a();
        Intrinsics.checkNotNullParameter(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.f93640p0, event);
        event.consume();
        this.f93641q0.element = f15533a;
        return Unit.INSTANCE;
    }
}
