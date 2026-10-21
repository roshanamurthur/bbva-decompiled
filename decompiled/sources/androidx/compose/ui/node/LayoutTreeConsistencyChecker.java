package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LayoutTreeConsistencyChecker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "", "assertConsistent", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,142:1\n33#2,6:143\n116#2,2:149\n33#2,6:151\n118#2:157\n116#2,2:158\n33#2,6:160\n118#2:166\n33#2,6:167\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:143,6\n59#1:149,2\n59#1:151,6\n59#1:157\n83#1:158,2\n83#1:160,6\n83#1:166\n135#1:167,6\n*E\n"})
public final class LayoutTreeConsistencyChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LayoutNode f16851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DepthSortedSetsForDifferentPasses f16852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<MeasureAndLayoutDelegate.PostponedRequest> f16853c;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode root, @NotNull DepthSortedSetsForDifferentPasses relayoutNodes, @NotNull List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.f16851a = root;
        this.f16852b = relayoutNodes;
        this.f16853c = postponedMeasureRequests;
    }

    public static final void c(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb2, LayoutNode layoutNode, int i10) {
        layoutTreeConsistencyChecker.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(layoutNode);
        sb3.append(Constant.BRACKET_OPEN + layoutNode.getLayoutState$ui_release() + AbstractJsonLexerKt.END_LIST);
        if (!layoutNode.isPlaced()) {
            sb3.append("[!isPlaced]");
        }
        sb3.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + AbstractJsonLexerKt.END_LIST);
        if (!layoutTreeConsistencyChecker.a(layoutNode)) {
            sb3.append("[INCONSISTENT]");
        }
        String string = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string, "with(StringBuilder()) {\n…     toString()\n        }");
        if (string.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(string);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
            i10++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            c(layoutTreeConsistencyChecker, sb2, children$ui_release.get(i12), i10);
        }
    }

    public final boolean a(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        LayoutNode.LayoutState layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        boolean zIsPlaced = layoutNode.isPlaced();
        List<MeasureAndLayoutDelegate.PostponedRequest> list = this.f16853c;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16852b;
        if (zIsPlaced || (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.isPlaced())) {
            if (layoutNode.getMeasurePending$ui_release()) {
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        postponedRequest = null;
                        break;
                    }
                    postponedRequest = list.get(i10);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = postponedRequest;
                    if (Intrinsics.areEqual(postponedRequest3.getNode(), layoutNode) && !postponedRequest3.getIsLookahead()) {
                        break;
                    }
                    i10++;
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                return depthSortedSetsForDifferentPasses.contains(layoutNode) || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || ((parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.getLayoutPending$ui_release()) {
                return depthSortedSetsForDifferentPasses.contains(layoutNode) || parent$ui_release == null || parent$ui_release.getMeasurePending$ui_release() || parent$ui_release.getLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut;
            }
        }
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list.get(i11);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (Intrinsics.areEqual(postponedRequest5.getNode(), layoutNode) && postponedRequest5.getIsLookahead()) {
                        postponedRequest2 = postponedRequest4;
                        break;
                    }
                }
                if (postponedRequest2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                return depthSortedSetsForDifferentPasses.contains(layoutNode, true) || (parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release() && Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode));
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release()) {
                return depthSortedSetsForDifferentPasses.contains(layoutNode, true) || parent$ui_release == null || parent$ui_release.getLookaheadMeasurePending$ui_release() || parent$ui_release.getLookaheadLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut || (parent$ui_release.getLayoutPending$ui_release() && Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode));
            }
        }
        return true;
    }

    public final void assertConsistent() {
        LayoutNode layoutNode = this.f16851a;
        if (!b(layoutNode)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tree state:");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
            c(this, sb2, layoutNode, 0);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
            System.out.println((Object) string);
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    public final boolean b(LayoutNode layoutNode) {
        if (!a(layoutNode)) {
            return false;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b(children$ui_release.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
