package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MotionEventAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR \u0010\u0015\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "Landroid/view/MotionEvent;", "motionEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent$ui_release", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent", "", "pointerId", "", "endStream", "Landroid/util/SparseLongArray;", "b", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "()V", "motionEventToComposePointerIdMap", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class MotionEventAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SparseBooleanArray f16361c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList f16362d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16363e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16364f = -1;

    /* JADX WARN: Code duplicated, block: B:101:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Code duplicated, block: B:78:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0168  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0197  */
    @Nullable
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@NotNull MotionEvent motionEvent, @NotNull PositionCalculator positionCalculator) {
        int i10;
        int i11;
        long jValueAt;
        long j10;
        long jMo3541localToScreenMKHz9U;
        long jA;
        long jMo3542screenToLocalMKHz9U;
        int toolType;
        int iM3540getUnknownT8wyACA;
        int historySize;
        int i12;
        char c10;
        char c11;
        long jM2291getZeroF1C5BW0;
        float historicalX;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
        SparseBooleanArray sparseBooleanArray = this.f16361c;
        if (actionMasked == 3) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f16363e || source != this.f16364f) {
                this.f16363e = toolType2;
                this.f16364f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j11 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j12 = this.f16359a;
                this.f16359a = j12 + 1;
                sparseLongArray.put(pointerId, j12);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j13 = this.f16359a;
                this.f16359a = j13 + 1;
                sparseLongArray.put(pointerId2, j13);
            }
        }
        boolean z10 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z11 = actionMasked == 8;
        if (z10) {
            i10 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i10 = 1;
        }
        int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f16362d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i13 = 0;
        while (i13 < pointerCount) {
            boolean z12 = (z10 || i13 == actionIndex2 || (z11 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i13);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                jValueAt = this.f16359a;
                this.f16359a = jValueAt + j11;
                sparseLongArray.put(pointerId3, jValueAt);
            }
            long jM3459constructorimpl = PointerId.m3459constructorimpl(jValueAt);
            int i14 = i13;
            float pressure = motionEvent.getPressure(i14);
            long jOffset = OffsetKt.Offset(motionEvent.getX(i14), motionEvent.getY(i14));
            if (i14 == 0) {
                jA = OffsetKt.Offset(motionEvent.getRawX(), motionEvent.getRawY());
                jMo3542screenToLocalMKHz9U = positionCalculator.mo3542screenToLocalMKHz9U(jA);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jA = e1.c.f68259a.a(motionEvent, i14);
                    jMo3542screenToLocalMKHz9U = positionCalculator.mo3542screenToLocalMKHz9U(jA);
                } else {
                    j10 = jOffset;
                    jMo3541localToScreenMKHz9U = positionCalculator.mo3541localToScreenMKHz9U(jOffset);
                }
                toolType = motionEvent.getToolType(i14);
                if (toolType != 0) {
                    iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3540getUnknownT8wyACA();
                } else if (toolType != 1) {
                    iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3539getTouchT8wyACA();
                } else if (toolType != 2) {
                    iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3538getStylusT8wyACA();
                } else if (toolType != 3) {
                    iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3537getMouseT8wyACA();
                } else if (toolType != 4) {
                    iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3540getUnknownT8wyACA();
                } else {
                    iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3536getEraserT8wyACA();
                }
                int i15 = iM3540getUnknownT8wyACA;
                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                for (i12 = 0; i12 < historySize; i12++) {
                    historicalX = motionEvent.getHistoricalX(i14, i12);
                    float historicalY = motionEvent.getHistoricalY(i14, i12);
                    if (Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                        arrayList2.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i12), OffsetKt.Offset(historicalX, historicalY), null));
                    }
                }
                if (motionEvent.getActionMasked() == 8) {
                    c10 = '\n';
                    c11 = '\t';
                    jM2291getZeroF1C5BW0 = OffsetKt.Offset(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c10 = '\n';
                    c11 = '\t';
                    jM2291getZeroF1C5BW0 = Offset.INSTANCE.m2291getZeroF1C5BW0();
                }
                arrayList.add(new PointerInputEventData(jM3459constructorimpl, motionEvent.getEventTime(), jMo3541localToScreenMKHz9U, j10, z12, pressure, i15, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList2, jM2291getZeroF1C5BW0, null));
                z10 = z10;
                j11 = 1;
                i13 = i14 + 1;
            }
            jMo3541localToScreenMKHz9U = jA;
            j10 = jMo3542screenToLocalMKHz9U;
            toolType = motionEvent.getToolType(i14);
            if (toolType != 0) {
                iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3540getUnknownT8wyACA();
            } else if (toolType != 1) {
                iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3539getTouchT8wyACA();
            } else if (toolType != 2) {
                iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3538getStylusT8wyACA();
            } else if (toolType != 3) {
                iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3537getMouseT8wyACA();
            } else if (toolType != 4) {
                iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3540getUnknownT8wyACA();
            } else {
                iM3540getUnknownT8wyACA = PointerType.INSTANCE.m3536getEraserT8wyACA();
            }
            int i16 = iM3540getUnknownT8wyACA;
            ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i12 < historySize) {
                historicalX = motionEvent.getHistoricalX(i14, i12);
                float historicalY2 = motionEvent.getHistoricalY(i14, i12);
                if (Float.isInfinite(historicalX)) {
                }
            }
            if (motionEvent.getActionMasked() == 8) {
                c10 = '\n';
                c11 = '\t';
                jM2291getZeroF1C5BW0 = OffsetKt.Offset(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                c10 = '\n';
                c11 = '\t';
                jM2291getZeroF1C5BW0 = Offset.INSTANCE.m2291getZeroF1C5BW0();
            }
            arrayList.add(new PointerInputEventData(jM3459constructorimpl, motionEvent.getEventTime(), jMo3541localToScreenMKHz9U, j10, z12, pressure, i16, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList3, jM2291getZeroF1C5BW0, null));
            z10 = z10;
            j11 = 1;
            i13 = i14 + 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i11 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i11 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i17 = i11;
                while (true) {
                    if (i17 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i17) == iKeyAt) {
                        break;
                    }
                    i17++;
                }
            }
        }
        return new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent);
    }

    public final void endStream(int pointerId) {
        this.f16361c.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    @NotNull
    /* JADX INFO: renamed from: getMotionEventToComposePointerIdMap$ui_release, reason: from getter */
    public final SparseLongArray getMotionEventToComposePointerIdMap() {
        return this.motionEventToComposePointerIdMap;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }
}
