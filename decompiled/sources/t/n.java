package t;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Modifier.Node implements SemanticsModifierNode {
    public boolean H0;

    @Nullable
    public String I0;

    @Nullable
    public Role J0;

    @NotNull
    public Function0<Unit> K0;

    @Nullable
    public String L0;

    @Nullable
    public Function0<Unit> M0;

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class a extends Lambda implements Function0<Boolean> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            n.this.K0.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Function0<Unit> function0 = n.this.M0;
            if (function0 != null) {
                function0.invoke();
            }
            return Boolean.TRUE;
        }
    }

    public n(Role role, String str, String str2, Function0 onClick, Function0 function0, boolean z10) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.H0 = z10;
        this.I0 = str;
        this.J0 = role;
        this.K0 = onClick;
        this.L0 = str2;
        this.M0 = function0;
    }

    public final void a(@Nullable Role role, @Nullable String str, @Nullable String str2, @NotNull Function0 onClick, @Nullable Function0 function0, boolean z10) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.H0 = z10;
        this.I0 = str;
        this.J0 = role;
        this.K0 = onClick;
        this.L0 = str2;
        this.M0 = function0;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Role role = this.J0;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semanticsPropertyReceiver, role.getF17490a());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.I0, new a());
        if (this.M0 != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.L0, new b());
        }
        if (this.H0) {
            return;
        }
        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics */
    public final /* synthetic */ boolean getIsClearingSemantics() {
        return i1.p.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }
}
