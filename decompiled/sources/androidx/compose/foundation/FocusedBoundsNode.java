package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "", "focused", "", "setFocus", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class FocusedBoundsNode extends Modifier.Node implements ModifierLocalModifierNode, GlobalPositionAwareModifierNode {
    public boolean H0;

    @Nullable
    public LayoutCoordinates I0;

    public final Function1<LayoutCoordinates, Unit> a() {
        if (getIsAttached()) {
            return (Function1) h1.c.a(this, FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return h1.c.a(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ ModifierLocalMap getProvidedValues() {
        return h1.c.b(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Function1<LayoutCoordinates, Unit> function1A;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.I0 = coordinates;
        if (this.H0) {
            if (!coordinates.isAttached()) {
                Function1<LayoutCoordinates, Unit> function1A2 = a();
                if (function1A2 != null) {
                    function1A2.invoke(null);
                    return;
                }
                return;
            }
            LayoutCoordinates layoutCoordinates = this.I0;
            if (layoutCoordinates != null) {
                Intrinsics.checkNotNull(layoutCoordinates);
                if (!layoutCoordinates.isAttached() || (function1A = a()) == null) {
                    return;
                }
                function1A.invoke(this.I0);
            }
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        h1.c.c(this, modifierLocal, obj);
    }

    public final void setFocus(boolean focused) {
        Function1<LayoutCoordinates, Unit> function1A;
        if (focused == this.H0) {
            return;
        }
        if (focused) {
            LayoutCoordinates layoutCoordinates = this.I0;
            if (layoutCoordinates != null) {
                Intrinsics.checkNotNull(layoutCoordinates);
                if (layoutCoordinates.isAttached() && (function1A = a()) != null) {
                    function1A.invoke(this.I0);
                }
            }
        } else {
            Function1<LayoutCoordinates, Unit> function1A2 = a();
            if (function1A2 != null) {
                function1A2.invoke(null);
            }
        }
        this.H0 = focused;
    }
}
