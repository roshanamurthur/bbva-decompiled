package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019\u0012<\u0010#\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001b¢\u0006\u0002\b\"\u0012<\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110$¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001b¢\u0006\u0002\b\"\u0012\u0006\u0010'\u001a\u00020\tø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/DraggableNode;", "create", "node", "", "update", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DraggableState f3733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<PointerInputChange, Boolean> f3734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Orientation f3735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final MutableInteractionSource f3737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f3738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> f3739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> f3740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3741j;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(@NotNull DraggableState state, @NotNull Function1<? super PointerInputChange, Boolean> canDrag, @NotNull Orientation orientation, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function0<Boolean> startDragImmediately, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        this.f3733b = state;
        this.f3734c = canDrag;
        this.f3735d = orientation;
        this.f3736e = z10;
        this.f3737f = mutableInteractionSource;
        this.f3738g = startDragImmediately;
        this.f3739h = onDragStarted;
        this.f3740i = onDragStopped;
        this.f3741j = z11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DraggableElement.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DraggableElement");
        DraggableElement draggableElement = (DraggableElement) other;
        return Intrinsics.areEqual(this.f3733b, draggableElement.f3733b) && Intrinsics.areEqual(this.f3734c, draggableElement.f3734c) && this.f3735d == draggableElement.f3735d && this.f3736e == draggableElement.f3736e && Intrinsics.areEqual(this.f3737f, draggableElement.f3737f) && Intrinsics.areEqual(this.f3738g, draggableElement.f3738g) && Intrinsics.areEqual(this.f3739h, draggableElement.f3739h) && Intrinsics.areEqual(this.f3740i, draggableElement.f3740i) && this.f3741j == draggableElement.f3741j;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (((this.f3735d.hashCode() + ((this.f3734c.hashCode() + (this.f3733b.hashCode() * 31)) * 31)) * 31) + (this.f3736e ? 1231 : 1237)) * 31;
        MutableInteractionSource mutableInteractionSource = this.f3737f;
        return ((this.f3740i.hashCode() + ((this.f3739h.hashCode() + ((this.f3738g.hashCode() + ((iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31)) * 31)) * 31)) * 31) + (this.f3741j ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "draggable").set("canDrag", this.f3734c);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("orientation", this.f3735d);
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f3741j, com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f3736e, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("interactionSource", this.f3737f);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("startDragImmediately", this.f3738g);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onDragStarted", this.f3739h);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onDragStopped", this.f3740i);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("state", this.f3733b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public DraggableNode create() {
        return new DraggableNode(this.f3733b, this.f3734c, this.f3735d, this.f3736e, this.f3737f, this.f3738g, this.f3739h, this.f3740i, this.f3741j);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull DraggableNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.update(this.f3733b, this.f3734c, this.f3735d, this.f3736e, this.f3737f, this.f3738g, this.f3739h, this.f3740i, this.f3741j);
    }
}
