package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposerChangeListWriter.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 k2\u00020\u0001:\u0001kB\u0017\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u0010\\\u001a\u00020\b¢\u0006\u0004\bi\u0010jJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086\bJ\u0017\u0010\r\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086\bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0018\u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0002J \u0010\u0015\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 J\u001e\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010$\u001a\u00020#J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002J\"\u0010+\u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040'2\u0006\u0010*\u001a\u00020(J\u0010\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001J@\u00102\u001a\u00020\u0004\"\u0004\b\u0000\u0010.\"\u0004\b\u0001\u0010/2\u0006\u0010\u000f\u001a\u00028\u00012\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000400¢\u0006\u0002\b1¢\u0006\u0004\b2\u00103J\u0016\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u001e\u00107\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u00108\u001a\u00020\u0004J\u0006\u00109\u001a\u00020\u0004J\u0016\u0010;\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002J\u0006\u0010<\u001a\u00020\u0004J\u0010\u0010=\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001J\u0014\u0010?\u001a\u00020\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u0016\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u0010F\u001a\u00020\u00042\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010C2\u0006\u0010E\u001a\u00020@J(\u0010L\u001a\u00020\u00042\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010J\u001a\u00020I2\u0006\u0010!\u001a\u00020K2\u0006\u00106\u001a\u00020KJ\u001e\u0010O\u001a\u00020\u00042\u0006\u0010*\u001a\u00020M2\u0006\u0010J\u001a\u00020I2\u0006\u0010N\u001a\u00020KJ\u0006\u0010P\u001a\u00020\u0004J\u001a\u0010R\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010@J\u0006\u0010S\u001a\u00020\u0004J\u0006\u0010T\u001a\u00020\u0004J\u0006\u0010U\u001a\u00020\u0004R\"\u0010\\\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0011\u0010f\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\be\u0010a¨\u0006l"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "", "location", "", "moveReaderRelativeTo", "moveReaderToAbsolute", "recordSlotEditing", "Landroidx/compose/runtime/changelist/ChangeList;", "newChangeList", "Lkotlin/Function0;", "block", "withChangeList", "withoutImplicitRootStart", "Landroidx/compose/runtime/RememberObserver;", "value", "remember", "groupSlotIndex", "updateValue", "Landroidx/compose/runtime/Anchor;", "anchor", "updateAnchoredValue", "appendValue", "count", "trimValues", "resetSlots", "data", "updateAuxData", "endRoot", "endCurrentGroup", "skipToEndOfCurrentGroup", "removeCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "insertSlots", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", TypedValues.CycleType.S_WAVE_OFFSET, "moveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "endCompositionScope", "node", "useNode", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nodeIndex", "removeNode", TypedValues.TransitionType.S_TO, "moveNode", "releaseMovableContent", "endNodeMovement", "group", "endNodeMovementAndDeleteNode", "moveUp", "moveDown", "effect", "sideEffect", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "determineMovableContentNodeIndex", "", "nodes", "effectiveNodeIndex", "copyNodesToNewAnchorLocation", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "copySlotTableToAnchorLocation", "Landroidx/compose/runtime/ControlledComposition;", "reference", "releaseMovableGroupAtCurrent", "endMovableContentPlacement", "other", "includeOperationsIn", "finalizeComposition", "resetTransientState", "deactivateCurrentGroup", "b", "Landroidx/compose/runtime/changelist/ChangeList;", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "changeList", "", "e", "Z", "getImplicitRootStart", "()Z", "setImplicitRootStart", "(Z)V", "implicitRootStart", "getPastParent", "pastParent", "Landroidx/compose/runtime/ComposerImpl;", "composer", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n4553#2,7:485\n4553#2,7:492\n4553#2,7:499\n4553#2,7:506\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n167#1:485,7\n248#1:492,7\n318#1:499,7\n466#1:506,7\n*E\n"})
public final class ComposerChangeListWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComposerImpl f14825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ChangeList changeList;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14827c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14831g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14836l;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IntStack f14828d = new IntStack();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean implicitRootStart = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Stack<Object> f14832h = new Stack<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14833i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14834j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14835k = -1;

    public ComposerChangeListWriter(@NotNull ComposerImpl composerImpl, @NotNull ChangeList changeList) {
        this.f14825a = composerImpl;
        this.changeList = changeList;
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    public final void a() {
        int i10 = this.f14831g;
        if (i10 > 0) {
            this.changeList.pushUps(i10);
            this.f14831g = 0;
        }
        Stack<Object> stack = this.f14832h;
        if (stack.isNotEmpty()) {
            this.changeList.pushDowns(stack.toArray());
            stack.clear();
        }
    }

    public final void appendValue(@NotNull Anchor anchor, @Nullable Object value) {
        this.changeList.pushAppendValue(anchor, value);
    }

    public final void b() {
        int i10 = this.f14836l;
        if (i10 > 0) {
            int i11 = this.f14833i;
            if (i11 >= 0) {
                a();
                this.changeList.pushRemoveNode(i11, i10);
                this.f14833i = -1;
            } else {
                int i12 = this.f14835k;
                int i13 = this.f14834j;
                a();
                this.changeList.pushMoveNode(i12, i13, i10);
                this.f14834j = -1;
                this.f14835k = -1;
            }
            this.f14836l = 0;
        }
    }

    public final void c(boolean z10) {
        ComposerImpl composerImpl = this.f14825a;
        int parent = z10 ? composerImpl.getReader().getParent() : composerImpl.getReader().getCurrentGroup();
        int i10 = parent - this.f14830f;
        if (!(i10 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i10 > 0) {
            this.changeList.pushAdvanceSlotsBy(i10);
            this.f14830f = parent;
        }
    }

    public final void copyNodesToNewAnchorLocation(@NotNull List<? extends Object> nodes, @NotNull IntRef effectiveNodeIndex) {
        this.changeList.pushCopyNodesToNewAnchorLocation(nodes, effectiveNodeIndex);
    }

    public final void copySlotTableToAnchorLocation(@Nullable MovableContentState resolvedState, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference from, @NotNull MovableContentStateReference to) {
        this.changeList.pushCopySlotTableToAnchorLocation(resolvedState, parentContext, from, to);
    }

    public final void deactivateCurrentGroup() {
        c(false);
        this.changeList.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(@NotNull IntRef effectiveNodeIndexOut, @NotNull Anchor anchor) {
        a();
        this.changeList.pushDetermineMovableContentNodeIndex(effectiveNodeIndexOut, anchor);
    }

    public final void endCompositionScope(@NotNull Function1<? super Composition, Unit> action, @NotNull Composition composition) {
        this.changeList.pushEndCompositionScope(action, composition);
    }

    public final void endCurrentGroup() {
        int parent = this.f14825a.getReader().getParent();
        IntStack intStack = this.f14828d;
        if (intStack.peekOr(-1) > parent) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (intStack.peekOr(-1) == parent) {
            c(false);
            intStack.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.f14830f = 0;
    }

    public final void endNodeMovement() {
        b();
    }

    public final void endNodeMovementAndDeleteNode(int nodeIndex, int group) {
        endNodeMovement();
        a();
        ComposerImpl composerImpl = this.f14825a;
        int iNodeCount = composerImpl.getReader().isNode(group) ? 1 : composerImpl.getReader().nodeCount(group);
        if (iNodeCount > 0) {
            removeNode(nodeIndex, iNodeCount);
        }
    }

    public final void endRoot() {
        if (this.f14827c) {
            c(false);
            c(false);
            this.changeList.pushEndCurrentGroup();
            this.f14827c = false;
        }
    }

    public final void finalizeComposition() {
        a();
        if (this.f14828d.isEmpty()) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    @NotNull
    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean getPastParent() {
        return this.f14825a.getReader().getParent() - this.f14830f < 0;
    }

    public final void includeOperationsIn(@NotNull ChangeList other, @Nullable IntRef effectiveNodeIndex) {
        this.changeList.pushExecuteOperationsIn(other, effectiveNodeIndex);
    }

    public final void insertSlots(@NotNull Anchor anchor, @NotNull SlotTable from) {
        a();
        c(false);
        recordSlotEditing();
        b();
        this.changeList.pushInsertSlots(anchor, from);
    }

    public final void moveCurrentGroup(int offset) {
        c(false);
        recordSlotEditing();
        this.changeList.pushMoveCurrentGroup(offset);
    }

    public final void moveDown(@Nullable Object node) {
        b();
        this.f14832h.push(node);
    }

    public final void moveNode(int from, int to, int count) {
        if (count > 0) {
            int i10 = this.f14836l;
            if (i10 > 0 && this.f14834j == from - i10 && this.f14835k == to - i10) {
                this.f14836l = i10 + count;
                return;
            }
            b();
            this.f14834j = from;
            this.f14835k = to;
            this.f14836l = count;
        }
    }

    public final void moveReaderRelativeTo(int location) {
        this.f14830f = (location - this.f14825a.getReader().getCurrentGroup()) + this.f14830f;
    }

    public final void moveReaderToAbsolute(int location) {
        this.f14830f = location;
    }

    public final void moveUp() {
        b();
        Stack<Object> stack = this.f14832h;
        if (stack.isNotEmpty()) {
            stack.pop();
        } else {
            this.f14831g++;
        }
    }

    public final void recordSlotEditing() {
        ComposerImpl composerImpl = this.f14825a;
        if (composerImpl.getReader().getF14739c() > 0) {
            SlotReader reader = composerImpl.getReader();
            int parent = reader.getParent();
            IntStack intStack = this.f14828d;
            if (intStack.peekOr(-2) != parent) {
                if (!this.f14827c && this.implicitRootStart) {
                    c(false);
                    this.changeList.pushEnsureRootStarted();
                    this.f14827c = true;
                }
                if (parent > 0) {
                    Anchor anchor = reader.anchor(parent);
                    intStack.push(parent);
                    c(false);
                    this.changeList.pushEnsureGroupStarted(anchor);
                    this.f14827c = true;
                }
            }
        }
    }

    public final void releaseMovableContent() {
        a();
        if (this.f14827c) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(@NotNull ControlledComposition composition, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference reference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(composition, parentContext, reference);
    }

    public final void remember(@NotNull RememberObserver value) {
        this.changeList.pushRemember(value);
    }

    public final void removeCurrentGroup() {
        c(false);
        recordSlotEditing();
        this.changeList.pushRemoveCurrentGroup();
        this.f14830f = this.f14825a.getReader().getGroupSize() + this.f14830f;
    }

    public final void removeNode(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                ComposerKt.composeImmediateRuntimeError("Invalid remove index " + nodeIndex);
            }
            if (this.f14833i == nodeIndex) {
                this.f14836l += count;
                return;
            }
            b();
            this.f14833i = nodeIndex;
            this.f14836l = count;
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void resetTransientState() {
        this.f14827c = false;
        this.f14828d.clear();
        this.f14830f = 0;
    }

    public final void setChangeList(@NotNull ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z10) {
        this.implicitRootStart = z10;
    }

    public final void sideEffect(@NotNull Function0<Unit> effect) {
        this.changeList.pushSideEffect(effect);
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void trimValues(int count) {
        if (count > 0) {
            c(false);
            recordSlotEditing();
            this.changeList.pushTrimValues(count);
        }
    }

    public final void updateAnchoredValue(@Nullable Object value, @NotNull Anchor anchor, int groupSlotIndex) {
        this.changeList.pushUpdateAnchoredValue(value, anchor, groupSlotIndex);
    }

    public final void updateAuxData(@Nullable Object data) {
        c(false);
        this.changeList.pushUpdateAuxData(data);
    }

    public final <T, V> void updateNode(V value, @NotNull Function2<? super T, ? super V, Unit> block) {
        a();
        this.changeList.pushUpdateNode(value, block);
    }

    public final void updateValue(@Nullable Object value, int groupSlotIndex) {
        c(true);
        this.changeList.pushUpdateValue(value, groupSlotIndex);
    }

    public final void useNode(@Nullable Object node) {
        a();
        this.changeList.pushUseNode(node);
    }

    public final void withChangeList(@NotNull ChangeList newChangeList, @NotNull Function0<Unit> block) {
        ChangeList changeList = getChangeList();
        try {
            setChangeList(newChangeList);
            block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            setChangeList(changeList);
            InlineMarker.finallyEnd(1);
        }
    }

    public final void withoutImplicitRootStart(@NotNull Function0<Unit> block) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            setImplicitRootStart(implicitRootStart);
            InlineMarker.finallyEnd(1);
        }
    }

    public final void insertSlots(@NotNull Anchor anchor, @NotNull SlotTable from, @NotNull FixupList fixups) {
        a();
        c(false);
        recordSlotEditing();
        b();
        this.changeList.pushInsertSlots(anchor, from, fixups);
    }
}
