package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InternalPointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "issuesEnterExitEvent-0FcD4WY", "(J)Z", "issuesEnterExitEvent", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "a", "Ljava/util/Map;", "getChanges", "()Ljava/util/Map;", "changes", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "b", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "getPointerInputEvent", "()Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerInputEvent", "c", "Z", "getSuppressMovementConsumption", "()Z", "setSuppressMovementConsumption", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/Map;Landroidx/compose/ui/input/pointer/PointerInputEvent;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,35:1\n116#2,2:36\n33#2,6:38\n118#2:44\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n30#1:36,2\n30#1:38,6\n30#1:44\n*E\n"})
public final class InternalPointerEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<PointerId, PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PointerInputEvent pointerInputEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean suppressMovementConsumption;

    public InternalPointerEvent(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull PointerInputEvent pointerInputEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        this.changes = changes;
        this.pointerInputEvent = pointerInputEvent;
    }

    @NotNull
    public final Map<PointerId, PointerInputChange> getChanges() {
        return this.changes;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    @NotNull
    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    /* JADX INFO: renamed from: issuesEnterExitEvent-0FcD4WY, reason: not valid java name */
    public final boolean m3412issuesEnterExitEvent0FcD4WY(long pointerId) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i10);
            if (PointerId.m3461equalsimpl0(pointerInputEventData.m3489getIdJ3iCeTQ(), pointerId)) {
                break;
            }
            i10++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getIssuesEnterExit();
        }
        return false;
    }

    public final void setSuppressMovementConsumption(boolean z10) {
        this.suppressMovementConsumption = z10;
    }
}
