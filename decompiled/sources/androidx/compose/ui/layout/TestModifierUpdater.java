package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TestModifierUpdater.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Deprecated(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "Landroidx/compose/ui/Modifier;", "modifier", "", "updateModifier", "Landroidx/compose/ui/node/LayoutNode;", "node", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class TestModifierUpdater {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LayoutNode f16699a;

    public TestModifierUpdater(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f16699a = node;
    }

    public final void updateModifier(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f16699a.setModifier(modifier);
    }
}
