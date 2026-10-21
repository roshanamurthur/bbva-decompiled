package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/ui/node/DelegatableNode;", "nestedScrollModifierNode", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "a", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalNestedScroll", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalNestedScroll", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class NestedScrollNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableModifierLocal<NestedScrollNode> f16342a = ModifierLocalKt.modifierLocalOf(a.f16343p0);

    /* JADX INFO: compiled from: NestedScrollNode.kt */
    public static final class a extends Lambda implements Function0<NestedScrollNode> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16343p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ NestedScrollNode invoke() {
            return null;
        }
    }

    @NotNull
    public static final ProvidableModifierLocal<NestedScrollNode> getModifierLocalNestedScroll() {
        return f16342a;
    }

    @NotNull
    public static final DelegatableNode nestedScrollModifierNode(@NotNull NestedScrollConnection connection, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        return new NestedScrollNode(connection, nestedScrollDispatcher);
    }
}
