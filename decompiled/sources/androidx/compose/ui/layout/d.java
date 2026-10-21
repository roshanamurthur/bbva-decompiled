package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function0<LayoutCoordinates> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f16710p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LayoutNode layoutNode) {
        super(0);
        this.f16710p0 = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutCoordinates invoke() {
        LayoutNode parent$ui_release = this.f16710p0.getParent$ui_release();
        Intrinsics.checkNotNull(parent$ui_release);
        return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
    }
}
