package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Lambda implements Function1<LayoutNode, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v f17453p0 = new v(1);

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode layoutNode) {
        boolean z10;
        LayoutNode it = layoutNode;
        Intrinsics.checkNotNullParameter(it, "it");
        SemanticsConfiguration collapsedSemantics$ui_release = it.getCollapsedSemantics$ui_release();
        if (collapsedSemantics$ui_release != null) {
            z10 = collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants() && collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText());
        }
        return Boolean.valueOf(z10);
    }
}
