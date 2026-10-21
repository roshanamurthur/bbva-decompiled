package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerInputEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "", "a", "J", "getUptime", "()J", "uptime", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "b", "Ljava/util/List;", "getPointers", "()Ljava/util/List;", "pointers", "Landroid/view/MotionEvent;", "c", "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class PointerInputEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long uptime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<PointerInputEventData> pointers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MotionEvent motionEvent;

    public PointerInputEvent(long j10, @NotNull List<PointerInputEventData> pointers, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(pointers, "pointers");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.uptime = j10;
        this.pointers = pointers;
        this.motionEvent = motionEvent;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    @NotNull
    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }
}
