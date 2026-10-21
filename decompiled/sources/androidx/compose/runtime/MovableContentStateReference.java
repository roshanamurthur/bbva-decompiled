package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B_\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u001a\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\u00010 0\u001f\u0012\u0006\u0010.\u001a\u00020)¢\u0006\u0004\b/\u00100R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR6\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\u00010 0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "Landroidx/compose/runtime/MovableContent;", "a", "Landroidx/compose/runtime/MovableContent;", "getContent$runtime_release", "()Landroidx/compose/runtime/MovableContent;", "content", "b", "Ljava/lang/Object;", "getParameter$runtime_release", "()Ljava/lang/Object;", "parameter", "Landroidx/compose/runtime/ControlledComposition;", "c", "Landroidx/compose/runtime/ControlledComposition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/SlotTable;", "d", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/Anchor;", "e", "Landroidx/compose/runtime/Anchor;", "getAnchor$runtime_release", "()Landroidx/compose/runtime/Anchor;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "f", "Ljava/util/List;", "getInvalidations$runtime_release", "()Ljava/util/List;", "setInvalidations$runtime_release", "(Ljava/util/List;)V", "invalidations", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "g", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getLocals$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "locals", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class MovableContentStateReference {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MovableContent<Object> content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object parameter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ControlledComposition composition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SlotTable slotTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Anchor anchor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Pair<RecomposeScopeImpl, ? extends Object>> invalidations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PersistentCompositionLocalMap locals;

    public MovableContentStateReference(@NotNull MovableContent<Object> movableContent, @Nullable Object obj, @NotNull ControlledComposition controlledComposition, @NotNull SlotTable slotTable, @NotNull Anchor anchor, @NotNull List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
    }

    @NotNull
    /* JADX INFO: renamed from: getAnchor$runtime_release, reason: from getter */
    public final Anchor getAnchor() {
        return this.anchor;
    }

    @NotNull
    /* JADX INFO: renamed from: getComposition$runtime_release, reason: from getter */
    public final ControlledComposition getComposition() {
        return this.composition;
    }

    @NotNull
    public final MovableContent<Object> getContent$runtime_release() {
        return this.content;
    }

    @NotNull
    public final List<Pair<RecomposeScopeImpl, Object>> getInvalidations$runtime_release() {
        return this.invalidations;
    }

    @NotNull
    /* JADX INFO: renamed from: getLocals$runtime_release, reason: from getter */
    public final PersistentCompositionLocalMap getLocals() {
        return this.locals;
    }

    @Nullable
    /* JADX INFO: renamed from: getParameter$runtime_release, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final void setInvalidations$runtime_release(@NotNull List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list) {
        this.invalidations = list;
    }
}
