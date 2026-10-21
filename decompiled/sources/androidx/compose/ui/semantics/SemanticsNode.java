package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b[\u0010\\J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010.\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010-R\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010=\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010A\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010E\u001a\u00020B8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010G\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\bF\u0010@R\u001a\u0010J\u001a\u00020H8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bI\u0010DR\u0011\u0010L\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\bK\u0010@R\u001a\u0010N\u001a\u00020H8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bM\u0010DR\u0014\u0010P\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u001cR\u0011\u0010R\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bQ\u0010(R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00000\b8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010X\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bX\u0010\u001cR\u0013\u0010Z\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bY\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getAlignmentLinePosition", "", "includeFakeNodes", "", "unmergedChildren$ui_release", "(Z)Ljava/util/List;", "unmergedChildren", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds", "copyWithMergingEnabled$ui_release", "()Landroidx/compose/ui/semantics/SemanticsNode;", "copyWithMergingEnabled", "Landroidx/compose/ui/Modifier$Node;", "a", "Landroidx/compose/ui/Modifier$Node;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "outerSemanticsNode", "b", "Z", "getMergingEnabled", "()Z", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "c", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "d", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "e", "isFake$ui_release", "setFake$ui_release", "(Z)V", "isFake", "g", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "id", "isUnmergedLeafNode$ui_release", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "root", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getPositionInWindow-F1C5BW0", "positionInWindow", "isTransparent$ui_release", "isTransparent", "getConfig", "config", "getChildren", "()Ljava/util/List;", "children", "getReplacedChildren$ui_release", "replacedChildren", "isRoot", "getParent", "parent", "<init>", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,462:1\n1#2:463\n33#3,6:464\n33#3,6:482\n460#4,7:470\n467#4,4:478\n76#5:477\n76#5:488\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n215#1:464,6\n348#1:482,6\n250#1:470,7\n250#1:478,4\n255#1:477\n369#1:488\n*E\n"})
public final class SemanticsNode {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Modifier.Node outerSemanticsNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean mergingEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SemanticsConfiguration unmergedConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isFake;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public SemanticsNode f17525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: compiled from: SemanticsNode.kt */
    public static final class a extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17527p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            SemanticsConfiguration collapsedSemantics$ui_release = it.getCollapsedSemantics$ui_release();
            boolean z10 = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: SemanticsNode.kt */
    public static final class b extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f17528p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            SemanticsConfiguration collapsedSemantics$ui_release = it.getCollapsedSemantics$ui_release();
            boolean z10 = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: SemanticsNode.kt */
    @SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,462:1\n76#2:463\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n*L\n336#1:463\n*E\n"})
    public static final class c extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f17529p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getNodes().m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8)));
        }
    }

    public SemanticsNode(@NotNull Modifier.Node outerSemanticsNode, boolean z10, @NotNull LayoutNode layoutNode, @NotNull SemanticsConfiguration unmergedConfig) {
        Intrinsics.checkNotNullParameter(outerSemanticsNode, "outerSemanticsNode");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(unmergedConfig, "unmergedConfig");
        this.outerSemanticsNode = outerSemanticsNode;
        this.mergingEnabled = z10;
        this.layoutNode = layoutNode;
        this.unmergedConfig = unmergedConfig;
        this.id = layoutNode.getSemanticsId();
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z10);
    }

    public final SemanticsNode a(Role role, Function1<? super SemanticsPropertyReceiver, Unit> function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, role != null ? SemanticsNodeKt.access$roleFakeNodeId(this) : SemanticsNodeKt.access$contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.f17525f = this;
        return semanticsNode;
    }

    public final void b(LayoutNode layoutNode, ArrayList arrayList) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode2 = content[i10];
                if (layoutNode2.isAttached()) {
                    if (layoutNode2.getNodes().m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8))) {
                        arrayList.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                    } else {
                        b(layoutNode2, arrayList);
                    }
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void c(List list) {
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i10);
            if (semanticsNode.e()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.c(list);
            }
        }
    }

    @NotNull
    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final List<SemanticsNode> d(boolean z10, boolean z11) {
        if (!z10 && this.unmergedConfig.getIsClearingSemantics()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (!e()) {
            return unmergedChildren$ui_release(z11);
        }
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        return arrayList;
    }

    public final boolean e() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    public final void f(SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i10);
            if (!semanticsNode.e()) {
                semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                semanticsNode.f(semanticsConfiguration);
            }
        }
    }

    @Nullable
    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        DelegatableNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.m3653requireCoordinator64DMado(outerMergingSemantics, NodeKind.m3725constructorimpl(8));
    }

    public final int getAlignmentLinePosition(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        Rect rectBoundsInRoot;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null && (rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui_release)) != null) {
                return rectBoundsInRoot;
            }
        }
        return Rect.INSTANCE.getZero();
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        Rect rectBoundsInWindow;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null && (rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(nodeCoordinatorFindCoordinatorToGetBounds$ui_release)) != null) {
                return rectBoundsInWindow;
            }
        }
        return Rect.INSTANCE.getZero();
    }

    @NotNull
    public final List<SemanticsNode> getChildren() {
        return d(!this.mergingEnabled, false);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        boolean zE = e();
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        if (!zE) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration semanticsConfigurationCopy = semanticsConfiguration.copy();
        f(semanticsConfigurationCopy);
        return semanticsConfigurationCopy;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: getOuterSemanticsNode$ui_release, reason: from getter */
    public final Modifier.Node getOuterSemanticsNode() {
        return this.outerSemanticsNode;
    }

    @Nullable
    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode = this.f17525f;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNode = this.layoutNode;
        boolean z10 = this.mergingEnabled;
        LayoutNode layoutNodeFindClosestParentNode = z10 ? SemanticsNodeKt.findClosestParentNode(layoutNode, b.f17528p0) : null;
        if (layoutNodeFindClosestParentNode == null) {
            layoutNodeFindClosestParentNode = SemanticsNodeKt.findClosestParentNode(layoutNode, c.f17529p0);
        }
        if (layoutNodeFindClosestParentNode == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(layoutNodeFindClosestParentNode, z10);
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m3838getPositionInRootF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m3839getPositionInWindowF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInWindow(nodeCoordinatorFindCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return d(false, true);
    }

    @Nullable
    public final RootForTest getRoot() {
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            return owner.getRootForTest();
        }
        return null;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3840getSizeYbymL2g() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        return nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null ? nodeCoordinatorFindCoordinatorToGetBounds$ui_release.mo3581getSizeYbymL2g() : IntSize.INSTANCE.m4554getZeroYbymL2g();
    }

    @NotNull
    public final Rect getTouchBoundsInRoot() {
        SemanticsModifierNode outerMergingSemantics;
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        boolean isMergingSemanticsOfDescendants = semanticsConfiguration.getIsMergingSemanticsOfDescendants();
        DelegatableNode delegatableNode = this.outerSemanticsNode;
        if (isMergingSemanticsOfDescendants && (outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode)) != null) {
            delegatableNode = outerMergingSemantics;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(delegatableNode.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(semanticsConfiguration));
    }

    @NotNull
    /* JADX INFO: renamed from: getUnmergedConfig$ui_release, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: isFake$ui_release, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        return !this.isFake && getReplacedChildren$ui_release().isEmpty() && SemanticsNodeKt.findClosestParentNode(this.layoutNode, a.f17527p0) == null;
    }

    public final void setFake$ui_release(boolean z10) {
        this.isFake = z10;
    }

    @NotNull
    public final List<SemanticsNode> unmergedChildren$ui_release(boolean includeFakeNodes) {
        if (this.isFake) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        b(this.layoutNode, arrayList);
        if (includeFakeNodes) {
            Role roleAccess$getRole = SemanticsNodeKt.access$getRole(this);
            SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
            if (roleAccess$getRole != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants() && (!arrayList.isEmpty())) {
                arrayList.add(a(roleAccess$getRole, new m1.b(roleAccess$getRole)));
            }
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!arrayList.isEmpty()) && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                List list = (List) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsProperties.getContentDescription());
                String str = list != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new m1.c(str)));
                }
            }
        }
        return arrayList;
    }
}
