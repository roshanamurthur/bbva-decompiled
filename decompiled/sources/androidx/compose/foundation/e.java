package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractClickableNode {

    @NotNull
    public final t.n N0;

    @NotNull
    public final f O0;

    public e() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MutableInteractionSource interactionSource, boolean z10, String str, Role role, Function0 onClick) {
        super(interactionSource, z10, onClick);
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.N0 = (t.n) delegate(new t.n(role, str, null, onClick, null, z10));
        AbstractClickableNode.InteractionData interactionData = this.M0;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.O0 = (f) delegate(new f(z10, interactionSource, onClick, interactionData));
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final a c() {
        return this.O0;
    }
}
