package i1;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m {
    static {
        Owner.Companion companion = Owner.INSTANCE;
    }

    public static /* synthetic */ void a(Owner owner, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z10);
    }

    public static /* synthetic */ void f(Owner owner, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        owner.measureAndLayout(z10);
    }

    public static /* synthetic */ void g(Owner owner, LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        owner.onRequestMeasure(layoutNode, z10, z11, z12);
    }

    public static /* synthetic */ void h(Owner owner, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        owner.onRequestRelayout(layoutNode, z10, z11);
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void b() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void c() {
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
