package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractClickableNode {

    @Nullable
    public Function0<Unit> N0;

    @NotNull
    public final t.n O0;

    @NotNull
    public final h P0;

    public g() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MutableInteractionSource interactionSource, boolean z10, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function1) {
        super(interactionSource, z10, onClick);
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.N0 = function0;
        this.O0 = (t.n) delegate(new t.n(role, str, str2, onClick, function0, z10));
        AbstractClickableNode.InteractionData interactionData = this.M0;
        Function0<Unit> function2 = this.N0;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        h hVar = new h(z10, interactionSource, onClick, interactionData);
        hVar.P0 = function2;
        hVar.Q0 = function1;
        this.P0 = (h) delegate(hVar);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final a c() {
        return this.P0;
    }
}
