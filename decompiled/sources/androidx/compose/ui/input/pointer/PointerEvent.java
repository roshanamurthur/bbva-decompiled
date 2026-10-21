package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010'B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b&\u0010(J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\b\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R3\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@@X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "component1", "changes", "Landroid/view/MotionEvent;", "motionEvent", "copy", "a", "Ljava/util/List;", "getChanges", "()Ljava/util/List;", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "b", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/PointerButtons;", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getButtons-ry648PA", "()I", "buttons", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "d", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerEventType;", "<set-?>", "e", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "type", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,201:1\n33#2,6:202\n33#2,6:208\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n71#1:202,6\n96#1:208,6\n*E\n"})
public final class PointerEvent {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InternalPointerEvent internalPointerEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int buttons;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int keyboardModifiers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int type;

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    public PointerEvent(@NotNull List<PointerInputChange> changes, @Nullable InternalPointerEvent internalPointerEvent) {
        int iM3434getMove7fucELk;
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.changes = changes;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m3414constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m3524constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        MotionEvent motionEvent$ui_release3 = getMotionEvent$ui_release();
        if (motionEvent$ui_release3 != null) {
            int actionMasked = motionEvent$ui_release3.getActionMasked();
            if (actionMasked == 0) {
                iM3434getMove7fucELk = PointerEventType.INSTANCE.m3435getPress7fucELk();
            } else if (actionMasked == 1) {
                iM3434getMove7fucELk = PointerEventType.INSTANCE.m3436getRelease7fucELk();
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        iM3434getMove7fucELk = PointerEventType.INSTANCE.m3435getPress7fucELk();
                        break;
                    case 6:
                        iM3434getMove7fucELk = PointerEventType.INSTANCE.m3436getRelease7fucELk();
                        break;
                    case 7:
                        iM3434getMove7fucELk = PointerEventType.INSTANCE.m3434getMove7fucELk();
                        break;
                    case 8:
                        iM3434getMove7fucELk = PointerEventType.INSTANCE.m3437getScroll7fucELk();
                        break;
                    case 9:
                        iM3434getMove7fucELk = PointerEventType.INSTANCE.m3432getEnter7fucELk();
                        break;
                    case 10:
                        iM3434getMove7fucELk = PointerEventType.INSTANCE.m3433getExit7fucELk();
                        break;
                    default:
                        iM3434getMove7fucELk = PointerEventType.INSTANCE.m3438getUnknown7fucELk();
                        break;
                }
            } else {
                iM3434getMove7fucELk = PointerEventType.INSTANCE.m3434getMove7fucELk();
            }
        } else {
            int size = changes.size();
            for (int i10 = 0; i10 < size; i10++) {
                PointerInputChange pointerInputChange = changes.get(i10);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    iM3434getMove7fucELk = PointerEventType.INSTANCE.m3436getRelease7fucELk();
                } else if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    iM3434getMove7fucELk = PointerEventType.INSTANCE.m3435getPress7fucELk();
                }
            }
            iM3434getMove7fucELk = PointerEventType.INSTANCE.m3434getMove7fucELk();
        }
        this.type = iM3434getMove7fucELk;
    }

    @NotNull
    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    @NotNull
    public final PointerEvent copy(@NotNull List<PointerInputChange> changes, @Nullable MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        if (motionEvent == null) {
            return new PointerEvent(changes, null);
        }
        boolean zAreEqual = Intrinsics.areEqual(motionEvent, getMotionEvent$ui_release());
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (zAreEqual) {
            return new PointerEvent(changes, internalPointerEvent);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(changes.size());
        ArrayList arrayList = new ArrayList(changes.size());
        int size = changes.size();
        int i10 = 0;
        while (i10 < size) {
            PointerInputChange pointerInputChange = changes.get(i10);
            linkedHashMap.put(PointerId.m3458boximpl(pointerInputChange.getId()), pointerInputChange);
            int i11 = i10;
            arrayList.add(new PointerInputEventData(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressure(), pointerInputChange.getType(), internalPointerEvent != null && internalPointerEvent.m3412issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()), null, 0L, ViewUtils.EDGE_TO_EDGE_FLAGS, null));
            i10 = i11 + 1;
        }
        return new PointerEvent(changes, new InternalPointerEvent(linkedHashMap, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* JADX INFO: renamed from: getButtons-ry648PA, reason: not valid java name and from getter */
    public final int getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    @Nullable
    /* JADX INFO: renamed from: getInternalPointerEvent$ui_release, reason: from getter */
    public final InternalPointerEvent getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name and from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    @Nullable
    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* JADX INFO: renamed from: getType-7fucELk, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m3423setTypeEhbLWgg$ui_release(int i10) {
        this.type = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerEvent(@NotNull List<PointerInputChange> changes) {
        this(changes, null);
        Intrinsics.checkNotNullParameter(changes, "changes");
    }
}
