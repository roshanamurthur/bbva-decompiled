package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import e1.e;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\r\u001a\u00020\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "process", "", "processCancel", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n1747#2,3:236\n1855#2,2:239\n1747#2,3:241\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n*L\n76#1:236,3\n79#1:239,2\n102#1:241,3\n*E\n"})
public final class PointerInputEventProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HitPathTracker f16429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f16430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HitTestResult f16431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16432e;

    public PointerInputEventProcessor(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.f16429b = new HitPathTracker(root.getCoordinates());
        this.f16430c = new e();
        this.f16431d = new HitTestResult();
    }

    /* JADX INFO: renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m3494processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return pointerInputEventProcessor.m3495processBIzXfog(pointerInputEvent, positionCalculator, z10);
    }

    @NotNull
    public final LayoutNode getRoot() {
        return this.root;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {all -> 0x003d, blocks: (B:7:0x001d, B:9:0x0033, B:23:0x005f, B:24:0x006d, B:27:0x0075, B:29:0x007d, B:31:0x0083, B:33:0x00a9, B:34:0x00b4, B:49:0x00f9, B:37:0x00c5, B:39:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00e7, B:47:0x00f3, B:14:0x0040, B:15:0x0044, B:17:0x004a, B:19:0x0056), top: B:54:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3 A[EDGE_INSN: B:36:0x00c3->B:49:0x00f9 BREAK  A[LOOP:1: B:43:0x00e1->B:67:0x00e1]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:7:0x001d, B:9:0x0033, B:23:0x005f, B:24:0x006d, B:27:0x0075, B:29:0x007d, B:31:0x0083, B:33:0x00a9, B:34:0x00b4, B:49:0x00f9, B:37:0x00c5, B:39:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00e7, B:47:0x00f3, B:14:0x0040, B:15:0x0044, B:17:0x004a, B:19:0x0056), top: B:54:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:7:0x001d, B:9:0x0033, B:23:0x005f, B:24:0x006d, B:27:0x0075, B:29:0x007d, B:31:0x0083, B:33:0x00a9, B:34:0x00b4, B:49:0x00f9, B:37:0x00c5, B:39:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00e7, B:47:0x00f3, B:14:0x0040, B:15:0x0044, B:17:0x004a, B:19:0x0056), top: B:54:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:7:0x001d, B:9:0x0033, B:23:0x005f, B:24:0x006d, B:27:0x0075, B:29:0x007d, B:31:0x0083, B:33:0x00a9, B:34:0x00b4, B:49:0x00f9, B:37:0x00c5, B:39:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00e7, B:47:0x00f3, B:14:0x0040, B:15:0x0044, B:17:0x004a, B:19:0x0056), top: B:54:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4 A[EDGE_INSN: B:56:0x00b4->B:34:0x00b4 BREAK  A[LOOP:0: B:24:0x006d->B:60:0x006d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: process-BIzXfog, reason: not valid java name */
    public final int m3495processBIzXfog(@NotNull PointerInputEvent pointerEvent, @NotNull PositionCalculator positionCalculator, boolean isInBounds) {
        boolean z10;
        Iterator<T> it;
        boolean zHasNext;
        HitPathTracker hitPathTracker;
        Collection<PointerInputChange> collectionValues;
        Iterator<T> it2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        HitTestResult hitTestResult = this.f16431d;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        if (this.f16432e) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z11 = true;
        try {
            this.f16432e = true;
            InternalPointerEvent internalPointerEventA = this.f16430c.a(pointerEvent, positionCalculator);
            Collection<PointerInputChange> collectionValues2 = internalPointerEventA.getChanges().values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator<T> it3 = collectionValues2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        PointerInputChange pointerInputChange3 = (PointerInputChange) it3.next();
                        if (pointerInputChange3.getPressed() || pointerInputChange3.getPreviousPressed()) {
                            z10 = false;
                        }
                    }
                    it = internalPointerEventA.getChanges().values().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        hitPathTracker = this.f16429b;
                        if (zHasNext) {
                            break;
                        }
                        pointerInputChange2 = (PointerInputChange) it.next();
                        if (!z10 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                            LayoutNode.m3664hitTestM_7yMNQ$ui_release$default(this.root, pointerInputChange2.getPosition(), this.f16431d, PointerType.m3532equalsimpl0(pointerInputChange2.getType(), PointerType.INSTANCE.m3539getTouchT8wyACA()), false, 8, null);
                            if (!hitTestResult.isEmpty()) {
                                hitPathTracker.m3411addHitPathKNwqfcY(pointerInputChange2.getId(), hitTestResult);
                                hitTestResult.clear();
                            }
                        }
                    }
                    hitPathTracker.removeDetachedPointerInputFilters();
                    boolean zDispatchChanges = hitPathTracker.dispatchChanges(internalPointerEventA, isInBounds);
                    if (internalPointerEventA.getSuppressMovementConsumption()) {
                        collectionValues = internalPointerEventA.getChanges().values();
                        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            it2 = collectionValues.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    pointerInputChange = (PointerInputChange) it2.next();
                                    if (!PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange) && pointerInputChange.isConsumed()) {
                                        break;
                                    }
                                }
                            }
                        }
                        z11 = false;
                        break;
                    }
                    z11 = false;
                    break;
                    return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z11);
                }
            }
            z10 = true;
            it = internalPointerEventA.getChanges().values().iterator();
            while (true) {
                zHasNext = it.hasNext();
                hitPathTracker = this.f16429b;
                if (zHasNext) {
                    break;
                    break;
                }
                pointerInputChange2 = (PointerInputChange) it.next();
                if (!z10) {
                }
                LayoutNode.m3664hitTestM_7yMNQ$ui_release$default(this.root, pointerInputChange2.getPosition(), this.f16431d, PointerType.m3532equalsimpl0(pointerInputChange2.getType(), PointerType.INSTANCE.m3539getTouchT8wyACA()), false, 8, null);
                if (!hitTestResult.isEmpty()) {
                    hitPathTracker.m3411addHitPathKNwqfcY(pointerInputChange2.getId(), hitTestResult);
                    hitTestResult.clear();
                }
            }
            hitPathTracker.removeDetachedPointerInputFilters();
            boolean zDispatchChanges2 = hitPathTracker.dispatchChanges(internalPointerEventA, isInBounds);
            if (internalPointerEventA.getSuppressMovementConsumption()) {
                collectionValues = internalPointerEventA.getChanges().values();
                if (!(collectionValues instanceof Collection)) {
                    it2 = collectionValues.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            z11 = false;
                            break;
                        }
                        pointerInputChange = (PointerInputChange) it2.next();
                        if (!PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange)) {
                        }
                    }
                } else {
                    it2 = collectionValues.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            z11 = false;
                            break;
                        }
                        pointerInputChange = (PointerInputChange) it2.next();
                        if (!PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange)) {
                        }
                    }
                }
            } else {
                z11 = false;
                break;
            }
            return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges2, z11);
        } finally {
            this.f16432e = false;
        }
    }

    public final void processCancel() {
        if (this.f16432e) {
            return;
        }
        this.f16430c.f68269a.clear();
        this.f16429b.processCancel();
    }
}
