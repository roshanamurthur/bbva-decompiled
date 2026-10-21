package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,992:1\n174#2,5:993\n180#2,3:999\n174#2,5:1002\n180#2,3:1008\n1#3:998\n1#3:1007\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n924#1:993,5\n924#1:999,3\n982#1:1002,5\n982#1:1008,3\n924#1:998\n982#1:1007\n*E\n"})
public final class OperationKt {
    public static final int access$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier applier) {
        int iAnchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < iAnchorIndex);
        while (!slotWriter.indexInParent(iAnchorIndex)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iSkipGroup = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, iGroupSize)) {
                if (slotWriter.isNode(iGroupSize)) {
                    iSkipGroup = 0;
                }
                iGroupSize++;
            } else {
                iSkipGroup += slotWriter.isNode(iGroupSize) ? 1 : slotWriter.nodeCount(iGroupSize);
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        while (slotWriter.getCurrentGroup() < iAnchorIndex) {
            if (slotWriter.indexInCurrentGroup(iAnchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iSkipGroup = 0;
                }
                slotWriter.startGroup();
            } else {
                iSkipGroup += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == iAnchorIndex);
        return iSkipGroup;
    }

    public static final void access$positionToParentOf(SlotWriter slotWriter, Applier applier, int i10) {
        while (!slotWriter.indexInParent(i10)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    public static final void access$releaseMovableGroupAtCurrent(final ControlledComposition controlledComposition, CompositionContext compositionContext, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable.collectCalledByInformation();
        }
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(movableContentStateReference.getParameter());
            List<Anchor> listMoveTo = slotWriter.moveTo(movableContentStateReference.getAnchor(), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            slotWriterOpenWriter.close(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.INSTANCE;
            if (companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, listMoveTo)) {
                RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.changelist.OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    @NotNull
                    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
                        InvalidationResult invalidationResultInvalidate;
                        ControlledComposition controlledComposition2 = controlledComposition;
                        RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                        if (recomposeScopeOwner2 == null || (invalidationResultInvalidate = recomposeScopeOwner2.invalidate(scope, instance)) == null) {
                            invalidationResultInvalidate = InvalidationResult.IGNORED;
                        }
                        if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                            return invalidationResultInvalidate;
                        }
                        MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                        movableContentStateReference2.setInvalidations$runtime_release(CollectionsKt___CollectionsKt.plus((Collection<? extends Pair>) movableContentStateReference2.getInvalidations$runtime_release(), TuplesKt.to(scope, instance)));
                        return InvalidationResult.SCHEDULED;
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recordReadOf(@NotNull Object value) {
                    }
                };
                SlotWriter slotWriterOpenWriter2 = slotTable.openWriter();
                try {
                    companion.adoptAnchoredScopes$runtime_release(slotWriterOpenWriter2, listMoveTo, recomposeScopeOwner);
                    Unit unit = Unit.INSTANCE;
                    slotWriterOpenWriter2.close(true);
                } catch (Throwable th2) {
                    slotWriterOpenWriter2.close(false);
                    throw th2;
                }
            }
            compositionContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } catch (Throwable th3) {
            slotWriterOpenWriter.close(false);
            throw th3;
        }
    }
}
