package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import bk.q;
import com.noknok.android.client.extension.PlayIntegrity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0014\u0010\n\u001a\u00020\u0006*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H$J\u0006\u0010\u000b\u001a\u00020\u0002J\u000f\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000f\u001a\u00020\u0002J!\u0010\u0014\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010*\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\"\u0010.\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\"\u00102\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\"\u00106\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u0014\u00108\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001fR\u0014\u0010:\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u001fR$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0001\u0002>?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "", "recalculateQueryOwner", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getLastCalculation", "Landroidx/compose/ui/node/NodeCoordinator;", "alignmentLine", "getPositionFor", "recalculate", "reset$ui_release", "()V", "reset", "onAlignmentsChanged", "Landroidx/compose/ui/geometry/Offset;", "position", "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculatePositionInParent", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "a", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "", "b", "Z", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "c", "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "usedDuringParentMeasurement", "d", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "previousUsedDuringParentLayout", "f", "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedByModifierMeasurement", "g", "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "usedByModifierLayout", "getQueried$ui_release", "queried", "getRequired$ui_release", PlayIntegrity.KEY_REQUIRED, "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AlignmentLinesOwner alignmentLinesOwner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean usedDuringParentMeasurement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean usedDuringParentLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean previousUsedDuringParentLayout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean usedByModifierMeasurement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean usedByModifierLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public AlignmentLinesOwner f16736h;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean dirty = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashMap f16737i = new HashMap();

    /* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
    @SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n215#2,2:247\n1855#3,2:249\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:247,2\n170#1:249,2\n*E\n"})
    public static final class a extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
            AlignmentLines alignmentLines;
            AlignmentLinesOwner childOwner = alignmentLinesOwner;
            Intrinsics.checkNotNullParameter(childOwner, "childOwner");
            if (childOwner.getIsPlaced()) {
                if (childOwner.getAlignmentLines().getDirty()) {
                    childOwner.layoutChildren();
                }
                Iterator it = childOwner.getAlignmentLines().f16737i.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    alignmentLines = AlignmentLines.this;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    AlignmentLines.access$addAlignmentLine(alignmentLines, (AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), childOwner.getInnerCoordinator());
                }
                NodeCoordinator wrappedBy = childOwner.getInnerCoordinator().getWrappedBy();
                Intrinsics.checkNotNull(wrappedBy);
                while (!Intrinsics.areEqual(wrappedBy, alignmentLines.getAlignmentLinesOwner().getInnerCoordinator())) {
                    for (AlignmentLine alignmentLine : alignmentLines.getAlignmentLinesMap(wrappedBy).keySet()) {
                        AlignmentLines.access$addAlignmentLine(alignmentLines, alignmentLine, alignmentLines.getPositionFor(wrappedBy, alignmentLine), wrappedBy);
                    }
                    wrappedBy = wrappedBy.getWrappedBy();
                    Intrinsics.checkNotNull(wrappedBy);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, DefaultConstructorMarker defaultConstructorMarker) {
        this.alignmentLinesOwner = alignmentLinesOwner;
    }

    public static final void access$addAlignmentLine(AlignmentLines alignmentLines, AlignmentLine alignmentLine, int i10, NodeCoordinator nodeCoordinator) {
        alignmentLines.getClass();
        float f6 = i10;
        long jOffset = OffsetKt.Offset(f6, f6);
        while (true) {
            jOffset = alignmentLines.mo3648calculatePositionInParentR5De75A(nodeCoordinator, jOffset);
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            Intrinsics.checkNotNull(nodeCoordinator);
            if (Intrinsics.areEqual(nodeCoordinator, alignmentLines.alignmentLinesOwner.getInnerCoordinator())) {
                break;
            } else if (alignmentLines.getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine)) {
                float positionFor = alignmentLines.getPositionFor(nodeCoordinator, alignmentLine);
                jOffset = OffsetKt.Offset(positionFor, positionFor);
            }
        }
        int iRoundToInt = alignmentLine instanceof HorizontalAlignmentLine ? mk.c.roundToInt(Offset.m2276getYimpl(jOffset)) : mk.c.roundToInt(Offset.m2275getXimpl(jOffset));
        HashMap map = alignmentLines.f16737i;
        if (map.containsKey(alignmentLine)) {
            iRoundToInt = AlignmentLineKt.merge(alignmentLine, ((Number) q.getValue(map, alignmentLine)).intValue(), iRoundToInt);
        }
        map.put(alignmentLine, Integer.valueOf(iRoundToInt));
    }

    /* JADX INFO: renamed from: calculatePositionInParent-R5De75A, reason: not valid java name */
    public abstract long mo3648calculatePositionInParentR5De75A(@NotNull NodeCoordinator nodeCoordinator, long j10);

    @NotNull
    public abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(@NotNull NodeCoordinator nodeCoordinator);

    @NotNull
    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* JADX INFO: renamed from: getDirty$ui_release, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    @NotNull
    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.f16737i;
    }

    public abstract int getPositionFor(@NotNull NodeCoordinator nodeCoordinator, @NotNull AlignmentLine alignmentLine);

    /* JADX INFO: renamed from: getPreviousUsedDuringParentLayout$ui_release, reason: from getter */
    public final boolean getPreviousUsedDuringParentLayout() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui_release() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        return this.f16736h != null;
    }

    /* JADX INFO: renamed from: getUsedByModifierLayout$ui_release, reason: from getter */
    public final boolean getUsedByModifierLayout() {
        return this.usedByModifierLayout;
    }

    /* JADX INFO: renamed from: getUsedByModifierMeasurement$ui_release, reason: from getter */
    public final boolean getUsedByModifierMeasurement() {
        return this.usedByModifierMeasurement;
    }

    /* JADX INFO: renamed from: getUsedDuringParentLayout$ui_release, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    /* JADX INFO: renamed from: getUsedDuringParentMeasurement$ui_release, reason: from getter */
    public final boolean getUsedDuringParentMeasurement() {
        return this.usedDuringParentMeasurement;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner alignmentLinesOwner = this.alignmentLinesOwner;
        AlignmentLinesOwner parentAlignmentLinesOwner = alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            alignmentLinesOwner.requestMeasure();
        }
        if (this.usedByModifierLayout) {
            alignmentLinesOwner.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        HashMap map = this.f16737i;
        map.clear();
        a aVar = new a();
        AlignmentLinesOwner alignmentLinesOwner = this.alignmentLinesOwner;
        alignmentLinesOwner.forEachChildAlignmentLinesOwner(aVar);
        map.putAll(getAlignmentLinesMap(alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        boolean queried$ui_release = getQueried$ui_release();
        AlignmentLinesOwner alignmentLinesOwner = this.alignmentLinesOwner;
        if (!queried$ui_release) {
            AlignmentLinesOwner parentAlignmentLinesOwner = alignmentLinesOwner.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            alignmentLinesOwner = parentAlignmentLinesOwner.getAlignmentLines().f16736h;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().getQueried$ui_release()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.f16736h;
                if (alignmentLinesOwner2 == null || alignmentLinesOwner2.getAlignmentLines().getQueried$ui_release()) {
                    return;
                }
                AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                    alignmentLines2.recalculateQueryOwner();
                }
                AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                alignmentLinesOwner = (parentAlignmentLinesOwner3 == null || (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) == null) ? null : alignmentLines.f16736h;
            }
        }
        this.f16736h = alignmentLinesOwner;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.f16736h = null;
    }

    public final void setDirty$ui_release(boolean z10) {
        this.dirty = z10;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z10) {
        this.previousUsedDuringParentLayout = z10;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z10) {
        this.usedByModifierLayout = z10;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z10) {
        this.usedByModifierMeasurement = z10;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z10) {
        this.usedDuringParentLayout = z10;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z10) {
        this.usedDuringParentMeasurement = z10;
    }
}
