package t;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z extends Modifier.Node implements ModifierLocalModifierNode, Function1<LayoutCoordinates, Unit> {

    @NotNull
    public Function1<? super LayoutCoordinates, Unit> H0;

    @NotNull
    public final ModifierLocalMap I0;

    public z(@NotNull Function1<? super LayoutCoordinates, Unit> onPositioned) {
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        this.H0 = onPositioned;
        this.I0 = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), this));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return h1.c.a(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @NotNull
    public final ModifierLocalMap getProvidedValues() {
        return this.I0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
        if (getIsAttached()) {
            this.H0.invoke(layoutCoordinates2);
            Function1 function1 = getIsAttached() ? (Function1) h1.c.a(this, FocusedBoundsKt.getModifierLocalFocusedBoundsObserver()) : null;
            if (function1 != null) {
                function1.invoke(layoutCoordinates2);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        h1.c.c(this, modifierLocal, obj);
    }
}
