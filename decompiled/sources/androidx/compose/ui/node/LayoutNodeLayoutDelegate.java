package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import i1.j;
import i1.k;
import i1.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002_`B\u000f\u0012\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0004J\u0006\u0010\f\u001a\u00020\u0002J\u000f\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0002R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR$\u0010%\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR$\u0010(\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR*\u0010.\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010-R*\u00102\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010-R*\u0010:\u001a\u0002032\u0006\u0010)\u001a\u0002038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010@\u001a\u00060;R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R0\u0010F\u001a\b\u0018\u00010AR\u00020\u00002\f\u0010\u0014\u001a\b\u0018\u00010AR\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0011\u0010J\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010N\u001a\u0004\u0018\u00010K8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001c\u0010P\u001a\u0004\u0018\u00010K8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0014\u0010R\u001a\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u00107R\u0014\u0010T\u001a\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u00107R\u0014\u0010X\u001a\u00020U8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u0004\u0018\u00010U8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010W\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "", "markLayoutPending$ui_release", "()V", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "onCoordinatesUsed", "ensureLookaheadDelegateCreated$ui_release", "ensureLookaheadDelegateCreated", "updateParentData", "invalidateParentData", "resetAlignmentLines", "markChildrenDirty", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "<set-?>", "b", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "", "c", "Z", "getMeasurePending$ui_release", "()Z", "measurePending", "d", "getLayoutPending$ui_release", "layoutPending", "f", "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", "g", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", "value", "k", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "(Z)V", "coordinatesAccessedDuringPlacement", "l", "getCoordinatesAccessedDuringModifierPlacement", "setCoordinatesAccessedDuringModifierPlacement", "coordinatesAccessedDuringModifierPlacement", "", "m", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "n", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "o", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getLastLookaheadConstraints-DWUhwKw", "lastLookaheadConstraints", "getHeight$ui_release", "height", "getWidth$ui_release", "width", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadAlignmentLinesOwner", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1652:1\n1#2:1653\n*E\n"})
public final class LayoutNodeLayoutDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LayoutNode f16817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LayoutNode.LayoutState layoutState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean measurePending;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean layoutPending;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean lookaheadMeasurePending;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean lookaheadLayoutPending;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean coordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean coordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int childrenAccessingCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MeasurePassDelegate measurePassDelegate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LookaheadPassDelegate lookaheadPassDelegate;

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\nH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0006\u0010\u000f\u001a\u00020\u0004J\u001d\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J@\u0010\"\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0019\u0010\u001f\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\u001eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0011\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0016J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015J\u0006\u0010-\u001a\u00020\u0004J\u0006\u0010.\u001a\u00020\u0015J\u000f\u00101\u001a\u00020\u0004H\u0000¢\u0006\u0004\b/\u00100J\u0006\u00102\u001a\u00020\u0004J\u0006\u00103\u001a\u00020\u0004R\"\u0010:\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR-\u0010O\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u00198\u0000@BX\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010T\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SRJ\u0010Y\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\u001e2\u0019\u0010J\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\u001e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\"\u0010[\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010D\u001a\u0004\b[\u0010F\"\u0004\b\\\u0010HR\u001a\u0010b\u001a\u00020]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\"\u0010f\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010D\u001a\u0004\bd\u0010F\"\u0004\be\u0010HR$\u0010i\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010D\u001a\u0004\bh\u0010FR(\u0010o\u001a\u0004\u0018\u00010j2\b\u0010J\u001a\u0004\u0018\u00010j8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0018\u0010t\u001a\u00060pR\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001c\u0010w\u001a\u0004\u0018\u00010\u00108Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u001e\u0010\u007f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020q0|8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0019\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u00107R\u0016\u0010\u0086\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u00107\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "layoutChildren", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLines", "Lkotlin/Function1;", "block", "forEachChildAlignmentLinesOwner", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "alignmentLine", "get", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "forceRequest", "invalidateIntrinsicsParent", "invalidateParentData", "updateParentData", "onNodePlaced$ui_release", "()V", "onNodePlaced", "replace", "onNodeDetached", "w0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPlaceOrder$ui_release", "()I", "setPlaceOrder$ui_release", "(I)V", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "x0", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "y0", "Z", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", "<set-?>", "G0", "J", "getLastPosition-nOcc-ac$ui_release", "()J", "lastPosition", "H0", "F", "getLastZIndex$ui_release", "()F", "lastZIndex", "I0", "Lkotlin/jvm/functions/Function1;", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "J0", "isPlaced", "setPlaced", "Landroidx/compose/ui/node/AlignmentLines;", "K0", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "M0", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "childDelegatesDirty", "N0", "getLayingOutChildren", "layingOutChildren", "", "P0", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1652:1\n1002#1:1691\n1003#1,2:1700\n1002#1:1706\n1003#1,2:1715\n1002#1:1745\n1003#1,2:1754\n1161#2,2:1653\n1570#3:1655\n1571#3,6:1664\n1577#3,5:1674\n199#4:1656\n197#4:1679\n197#4:1692\n197#4:1707\n197#4:1721\n197#4:1733\n197#4:1746\n197#4:1760\n197#4:1772\n476#5,7:1657\n483#5,4:1670\n460#5,11:1680\n460#5,7:1693\n467#5,4:1702\n460#5,7:1708\n467#5,4:1717\n460#5,11:1722\n460#5,11:1734\n460#5,7:1747\n467#5,4:1756\n460#5,11:1761\n460#5,11:1773\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n1054#1:1691\n1054#1:1700,2\n1069#1:1706\n1069#1:1715,2\n1392#1:1745\n1392#1:1754,2\n982#1:1653,2\n991#1:1655\n991#1:1664,6\n991#1:1674,5\n991#1:1656\n1002#1:1679\n1054#1:1692\n1069#1:1707\n1096#1:1721\n1122#1:1733\n1392#1:1746\n1414#1:1760\n1447#1:1772\n991#1:1657,7\n991#1:1670,4\n1002#1:1680,11\n1054#1:1693,7\n1054#1:1702,4\n1069#1:1708,7\n1069#1:1717,4\n1096#1:1722,11\n1122#1:1734,11\n1392#1:1747,7\n1392#1:1756,4\n1414#1:1761,11\n1447#1:1773,11\n*E\n"})
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        public boolean E0;

        @Nullable
        public Constraints F0;

        /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
        public float lastZIndex;

        /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
        @Nullable
        public Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;

        /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
        public boolean isPlaced;

        /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
        public boolean layingOutChildren;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f16831u0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
        public boolean duringAlignmentLinesQuery;
        public int v0 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        public int placeOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

        /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
        public long lastPosition = IntOffset.INSTANCE.m4517getZeronOccac();

        @NotNull
        public final LookaheadAlignmentLines K0 = new LookaheadAlignmentLines(this);

        @NotNull
        public final MutableVector<LookaheadPassDelegate> L0 = new MutableVector<>(new LookaheadPassDelegate[16], 0);

        /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
        public boolean childDelegatesDirty = true;
        public boolean O0 = true;

        /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
        @Nullable
        public Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ LookaheadDelegate f16836q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LookaheadDelegate lookaheadDelegate) {
                super(0);
                this.f16836q0 = lookaheadDelegate;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                LookaheadPassDelegate lookaheadPassDelegate = LookaheadPassDelegate.this;
                LookaheadPassDelegate.access$clearPlaceOrder(lookaheadPassDelegate);
                lookaheadPassDelegate.forEachChildAlignmentLinesOwner(androidx.compose.ui.node.b.f16944p0);
                this.f16836q0.getMeasureResult$ui_release().placeChildren();
                LookaheadPassDelegate.access$checkChildrenPlaceOrderForUpdates(lookaheadPassDelegate);
                lookaheadPassDelegate.forEachChildAlignmentLinesOwner(androidx.compose.ui.node.c.f16945p0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        public static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LayoutNodeLayoutDelegate f16837p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ long f16838q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j10) {
                super(0);
                this.f16837p0 = layoutNodeLayoutDelegate;
                this.f16838q0 = j10;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                long j10 = this.f16838q0;
                LookaheadDelegate lookaheadDelegate = this.f16837p0.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                Placeable.PlacementScope.m3611place70tqf50$default(companion, lookaheadDelegate, j10, 0.0f, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        public static final class c extends Lambda implements Function1<AlignmentLinesOwner, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f16839p0 = new c(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                AlignmentLinesOwner it = alignmentLinesOwner;
                Intrinsics.checkNotNullParameter(it, "it");
                it.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                return Unit.INSTANCE;
            }
        }

        public LookaheadPassDelegate() {
        }

        public static final void access$checkChildrenPlaceOrderForUpdates(LookaheadPassDelegate lookaheadPassDelegate) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f16817a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate2 = content[i10].getLayoutDelegate().getLookaheadPassDelegate();
                    Intrinsics.checkNotNull(lookaheadPassDelegate2);
                    int i11 = lookaheadPassDelegate2.v0;
                    int i12 = lookaheadPassDelegate2.placeOrder;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate2.c();
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        public static final void access$clearPlaceOrder(LookaheadPassDelegate lookaheadPassDelegate) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            int i10 = 0;
            layoutNodeLayoutDelegate.f16825i = 0;
            MutableVector<LayoutNode> mutableVector = layoutNodeLayoutDelegate.f16817a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate2 = content[i10].getLayoutDelegate().getLookaheadPassDelegate();
                    Intrinsics.checkNotNull(lookaheadPassDelegate2);
                    lookaheadPassDelegate2.v0 = lookaheadPassDelegate2.placeOrder;
                    lookaheadPassDelegate2.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate2.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate2.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        public final void b() {
            boolean isPlaced = getIsPlaced();
            setPlaced(true);
            int i10 = 0;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (!isPlaced && layoutNodeLayoutDelegate.getLookaheadMeasurePending()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.f16817a, true, false, 2, null);
            }
            MutableVector<LayoutNode> mutableVector = layoutNodeLayoutDelegate.f16817a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode = content[i10];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.b();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        public final void c() {
            if (getIsPlaced()) {
                int i10 = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f16817a.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate = content[i10].getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate);
                        lookaheadPassDelegate.c();
                        i10++;
                    } while (i10 < size);
                }
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                if (layoutNodeLayoutDelegate.getLayoutState() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty()) {
                        layoutNodeLayoutDelegate.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        public final void d() {
            LayoutNode.UsageByParent intrinsicsUsageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.f16817a, false, false, 3, null);
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            if (parent$ui_release == null || layoutNodeLayoutDelegate.f16817a.getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
            int i10 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i10 != 2) {
                intrinsicsUsageByParent = i10 != 3 ? parent$ui_release.getIntrinsicsUsageByParent() : LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(intrinsicsUsageByParent);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1<? super AlignmentLinesOwner, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f16817a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i10].getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
                    Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
                    block.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i10++;
                } while (i10 < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            int i10 = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i10;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.K0;
        }

        @NotNull
        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate.f16817a.getChildren$ui_release();
            boolean z10 = this.childDelegatesDirty;
            MutableVector<LookaheadPassDelegate> mutableVector = this.L0;
            if (!z10) {
                return mutableVector.asMutableList();
            }
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i10 = 0;
                do {
                    LayoutNode layoutNode2 = content[i10];
                    if (mutableVector.getSize() <= i10) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate);
                        mutableVector.add(lookaheadPassDelegate);
                    } else {
                        LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate2);
                        mutableVector.set(i10, lookaheadPassDelegate2);
                    }
                    i10++;
                } while (i10 < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return mutableVector.asMutableList();
        }

        /* JADX INFO: renamed from: getChildDelegatesDirty$ui_release, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        /* JADX INFO: renamed from: getDuringAlignmentLinesQuery$ui_release, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.f16817a.getInnerCoordinator$ui_release();
        }

        @Nullable
        /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name and from getter */
        public final Constraints getF0() {
            return this.F0;
        }

        @Nullable
        public final Function1<GraphicsLayerScope, Unit> getLastLayerBlock$ui_release() {
            return this.lastLayerBlock;
        }

        /* JADX INFO: renamed from: getLastPosition-nOcc-ac$ui_release, reason: not valid java name and from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        /* JADX INFO: renamed from: getLastZIndex$ui_release, reason: from getter */
        public final float getLastZIndex() {
            return this.lastZIndex;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @NotNull
        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate();
        }

        @NotNull
        /* JADX INFO: renamed from: getMeasuredByParent$ui_release, reason: from getter */
        public final LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f16817a.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate = parent$ui_release.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.parentData;
        }

        /* JADX INFO: renamed from: getPlaceOrder$ui_release, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        public final void invalidateIntrinsicsParent(boolean forceRequest) {
            LayoutNode parent$ui_release;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode parent$ui_release2 = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent = layoutNodeLayoutDelegate.f16817a.getIntrinsicsUsageByParent();
            if (parent$ui_release2 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i10 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i10 == 1) {
                if (parent$ui_release2.getLookaheadRoot() != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
                    return;
                } else {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
                    return;
                }
            }
            if (i10 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            if (parent$ui_release2.getLookaheadRoot() != null) {
                parent$ui_release2.requestLookaheadRelayout$ui_release(forceRequest);
            } else {
                parent$ui_release2.requestRelayout$ui_release(forceRequest);
            }
        }

        public final void invalidateParentData() {
            this.O0 = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        /* JADX INFO: renamed from: isPlaced, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.getLookaheadLayoutPending() && (size = (mutableVector = layoutNodeLayoutDelegate.f16817a.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    LayoutNode layoutNode = content[i10];
                    if (layoutNode.getLookaheadMeasurePending$ui_release() && layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.checkNotNull(lookaheadPassDelegate);
                        Constraints f6 = getF0();
                        Intrinsics.checkNotNull(f6);
                        if (lookaheadPassDelegate.m3686remeasureBRTryo0(f6.getF18296a())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.f16817a, false, false, 3, null);
                        }
                    }
                    i10++;
                } while (i10 < size);
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (layoutNodeLayoutDelegate.f16824h || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && layoutNodeLayoutDelegate.getLookaheadLayoutPending())) {
                layoutNodeLayoutDelegate.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.getLayoutState();
                layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate.f16817a);
                layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(ownerRequireOwner.getSnapshotObserver(), layoutNodeLayoutDelegate.f16817a, false, new a(lookaheadDelegate), 2, null);
                layoutNodeLayoutDelegate.layoutState = layoutState;
                if (layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f16824h = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            d();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            d();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo3575measureBRTryo0(long constraints) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release == null) {
                this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            } else {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i10 == 1 || i10 == 2) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
                this.measuredByParent = usageByParent;
            }
            if (layoutNodeLayoutDelegate.f16817a.getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.NotUsed) {
                layoutNodeLayoutDelegate.f16817a.clearSubtreeIntrinsicsUsage$ui_release();
            }
            m3686remeasureBRTryo0(constraints);
            return this;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            d();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            d();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(height);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = layoutNodeLayoutDelegate.f16817a.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.notifyChildrenUsingCoordinatesWhilePlacing();
                }
                i10++;
            } while (i10 < size);
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.v0 = Integer.MAX_VALUE;
            setPlaced(false);
        }

        public final void onNodePlaced$ui_release() {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f16817a.getParent$ui_release();
            if (!getIsPlaced()) {
                b();
            }
            if (parent$ui_release == null) {
                this.placeOrder = 0;
            } else if (!this.f16831u0 && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (this.placeOrder != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                this.placeOrder = parent$ui_release.getLayoutDelegate().f16825i;
                parent$ui_release.getLayoutDelegate().f16825i++;
            }
            layoutChildren();
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo3579placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate.layoutState = layoutState;
            this.E0 = true;
            if (!IntOffset.m4506equalsimpl0(position, this.lastPosition)) {
                if (layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                    layoutNodeLayoutDelegate.lookaheadLayoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate.f16817a);
            if (layoutNodeLayoutDelegate.getLookaheadLayoutPending() || !getIsPlaced()) {
                layoutNodeLayoutDelegate.setCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(ownerRequireOwner.getSnapshotObserver(), layoutNodeLayoutDelegate.f16817a, false, new b(layoutNodeLayoutDelegate, position), 2, null);
            } else {
                onNodePlaced$ui_release();
            }
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.Idle;
        }

        /* JADX INFO: renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m3686remeasureBRTryo0(long constraints) {
            Constraints constraints2;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            layoutNodeLayoutDelegate.f16817a.setCanMultiMeasure$ui_release(layoutNodeLayoutDelegate.f16817a.getCanMultiMeasure() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure()));
            if (!layoutNodeLayoutDelegate.f16817a.getLookaheadMeasurePending$ui_release() && (constraints2 = this.F0) != null && Constraints.m4351equalsimpl0(constraints2.getF18296a(), constraints)) {
                Owner owner = layoutNodeLayoutDelegate.f16817a.getOwner();
                if (owner != null) {
                    owner.forceMeasureTheSubtree(layoutNodeLayoutDelegate.f16817a, true);
                }
                layoutNodeLayoutDelegate.f16817a.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            this.F0 = Constraints.m4346boximpl(constraints);
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(c.f16839p0);
            LookaheadDelegate lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            long jIntSize = IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
            LayoutNodeLayoutDelegate.m3680access$performLookaheadMeasureBRTryo0(layoutNodeLayoutDelegate, constraints);
            m3609setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (IntSize.m4549getWidthimpl(jIntSize) == lookaheadDelegate.getWidth() && IntSize.m4548getHeightimpl(jIntSize) == lookaheadDelegate.getHeight()) ? false : true;
        }

        public final void replace() {
            try {
                this.f16831u0 = true;
                if (!this.E0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                mo3579placeAtf8xVGno(this.lastPosition, 0.0f, null);
                this.f16831u0 = false;
            } catch (Throwable th2) {
                this.f16831u0 = false;
                throw th2;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.f16817a, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.f16817a, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z10) {
            this.childDelegatesDirty = z10;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z10) {
            this.duringAlignmentLinesQuery = z10;
        }

        public final void setMeasuredByParent$ui_release(@NotNull LayoutNode.UsageByParent usageByParent) {
            Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
            this.measuredByParent = usageByParent;
        }

        public final void setPlaceOrder$ui_release(int i10) {
            this.placeOrder = i10;
        }

        public void setPlaced(boolean z10) {
            this.isPlaced = z10;
        }

        public final boolean updateParentData() {
            Object parentData = getParentData();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (parentData == null) {
                LookaheadDelegate lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.O0) {
                return false;
            }
            this.O0 = false;
            LookaheadDelegate lookaheadDelegate2 = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }
    }

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b{\u0010|J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0002J@\u0010 \u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0019\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a¢\u0006\u0002\b\u001cH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020\u0004J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0014H\u0016J\u0006\u0010(\u001a\u00020\u0004J\u0006\u0010)\u001a\u00020\u000eJ\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140*H\u0016J\u001c\u0010-\u001a\u00020\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001aH\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\u0006\u00100\u001a\u00020\u0004J\u000e\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u000eJ\u0006\u00103\u001a\u00020\u0004J\u0006\u00104\u001a\u00020\u0004J\u0006\u00105\u001a\u00020\u0004R$\u0010;\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R$\u0010>\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010:R\"\u0010F\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010S\u001a\u0004\u0018\u00010N2\b\u00106\u001a\u0004\u0018\u00010N8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR*\u0010U\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010H\u001a\u0004\bU\u0010J\"\u0004\bV\u0010LR\u001a\u0010\\\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\"\u0010`\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010H\u001a\u0004\b^\u0010J\"\u0004\b_\u0010LR$\u0010c\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010H\u001a\u0004\bb\u0010JR$\u0010\u0019\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001c\u0010j\u001a\u0004\u0018\u00010\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001e\u0010s\u001a\f\u0012\b\u0012\u00060\u0000R\u00020p0o8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010:R\u0014\u0010w\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010:R\u0016\u0010z\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006}"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "layoutChildren", "onNodePlaced$ui_release", "()V", "onNodePlaced", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "replace", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "invalidateParentData", "updateParentData", "", "calculateAlignmentLines", "block", "forEachChildAlignmentLinesOwner", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "forceRequest", "invalidateIntrinsicsParent", "onNodeDetached", "measureBasedOnLookahead", "placeBasedOnLookahead", "<set-?>", "v0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "w0", "getPlaceOrder$ui_release", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "E0", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "F0", "Z", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", "", "K0", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "parentData", "L0", "isPlaced", "setPlaced$ui_release", "Landroidx/compose/ui/node/AlignmentLines;", "M0", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "O0", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "childDelegatesDirty", "P0", "getLayingOutChildren", "layingOutChildren", "Q0", "F", "getZIndex$ui_release", "()F", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1652:1\n512#1:1691\n513#1,2:1700\n515#1:1706\n512#1:1733\n513#1,2:1742\n515#1:1748\n1161#2,2:1653\n1570#3:1655\n1571#3,6:1664\n1577#3,5:1674\n199#4:1656\n197#4:1679\n197#4:1692\n1242#4,7:1707\n197#4:1714\n1230#4,7:1726\n197#4:1734\n197#4:1749\n197#4:1761\n197#4:1773\n197#4:1785\n476#5,7:1657\n483#5,4:1670\n460#5,11:1680\n460#5,7:1693\n467#5,4:1702\n460#5,11:1715\n460#5,7:1735\n467#5,4:1744\n460#5,11:1750\n460#5,11:1762\n460#5,11:1774\n460#5,11:1786\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n412#1:1691\n412#1:1700,2\n412#1:1706\n499#1:1733\n499#1:1742,2\n499#1:1748\n318#1:1653,2\n328#1:1655\n328#1:1664,6\n328#1:1674,5\n328#1:1656\n394#1:1679\n412#1:1692\n431#1:1707,7\n436#1:1714\n458#1:1726,7\n499#1:1734\n512#1:1749\n789#1:1761\n815#1:1773\n851#1:1785\n328#1:1657,7\n328#1:1670,4\n394#1:1680,11\n412#1:1693,7\n412#1:1702,4\n436#1:1715,11\n499#1:1735,7\n499#1:1744,4\n512#1:1750,11\n789#1:1762,11\n815#1:1774,11\n851#1:1786,11\n*E\n"})
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {

        /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
        public boolean duringAlignmentLinesQuery;

        @Nullable
        public Function1<? super GraphicsLayerScope, Unit> H0;
        public float I0;

        /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
        @Nullable
        public Object parentData;

        /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
        public boolean isPlaced;

        /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
        public boolean layingOutChildren;

        /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
        public float zIndex;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f16840u0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public boolean f16842x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f16843y0;

        /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
        public int previousPlaceOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        public int placeOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
        @NotNull
        public LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        public long G0 = IntOffset.INSTANCE.m4517getZeronOccac();
        public boolean J0 = true;

        @NotNull
        public final LayoutNodeAlignmentLines M0 = new LayoutNodeAlignmentLines(this);

        @NotNull
        public final MutableVector<MeasurePassDelegate> N0 = new MutableVector<>(new MeasurePassDelegate[16], 0);

        /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
        public boolean childDelegatesDirty = true;

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ LayoutNode f16845q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LayoutNode layoutNode) {
                super(0);
                this.f16845q0 = layoutNode;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                MeasurePassDelegate measurePassDelegate = MeasurePassDelegate.this;
                MeasurePassDelegate.access$clearPlaceOrder(measurePassDelegate);
                measurePassDelegate.forEachChildAlignmentLinesOwner(d.f16946p0);
                this.f16845q0.getInnerCoordinator$ui_release().getMeasureResult$ui_release().placeChildren();
                MeasurePassDelegate.access$checkChildrenPlaceOrderForUpdates(measurePassDelegate);
                measurePassDelegate.forEachChildAlignmentLinesOwner(e.f16947p0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        public static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<GraphicsLayerScope, Unit> f16846p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ LayoutNodeLayoutDelegate f16847q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ long f16848r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ float f16849s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super GraphicsLayerScope, Unit> function1, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j10, float f6) {
                super(0);
                this.f16846p0 = function1;
                this.f16847q0 = layoutNodeLayoutDelegate;
                this.f16848r0 = j10;
                this.f16849s0 = f6;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                long j10 = this.f16848r0;
                float f6 = this.f16849s0;
                Function1<GraphicsLayerScope, Unit> function1 = this.f16846p0;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f16847q0;
                if (function1 == null) {
                    companion.m3615place70tqf50(layoutNodeLayoutDelegate.getOuterCoordinator(), j10, f6);
                } else {
                    companion.m3620placeWithLayeraW9wM(layoutNodeLayoutDelegate.getOuterCoordinator(), j10, f6, function1);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        public static final class c extends Lambda implements Function1<AlignmentLinesOwner, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f16850p0 = new c(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                AlignmentLinesOwner it = alignmentLinesOwner;
                Intrinsics.checkNotNullParameter(it, "it");
                it.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                return Unit.INSTANCE;
            }
        }

        public MeasurePassDelegate() {
        }

        public static final void access$checkChildrenPlaceOrderForUpdates(MeasurePassDelegate measurePassDelegate) {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f16817a;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    LayoutNode layoutNode2 = content[i10];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().c();
                        }
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        public static final void access$clearPlaceOrder(MeasurePassDelegate measurePassDelegate) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            int i10 = 0;
            layoutNodeLayoutDelegate.f16826j = 0;
            MutableVector<LayoutNode> mutableVector = layoutNodeLayoutDelegate.f16817a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i10].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        public final void b() {
            boolean isPlaced = getIsPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f16817a;
            int i10 = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator wrapped = layoutNode.getInnerCoordinator$ui_release().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode2 = content[i10];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().b();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        public final void c() {
            if (getIsPlaced()) {
                int i10 = 0;
                setPlaced$ui_release(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f16817a.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i10].getMeasurePassDelegate$ui_release().c();
                        i10++;
                    } while (i10 < size);
                }
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                if (layoutNodeLayoutDelegate.getLayoutState() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty()) {
                        layoutNodeLayoutDelegate.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        public final void d() {
            LayoutNode.UsageByParent intrinsicsUsageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.f16817a, false, false, 3, null);
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            if (parent$ui_release == null || layoutNodeLayoutDelegate.f16817a.getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
            int i10 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i10 != 1) {
                intrinsicsUsageByParent = i10 != 2 ? parent$ui_release.getIntrinsicsUsageByParent() : LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(intrinsicsUsageByParent);
        }

        public final void e(long j10, float f6, Function1<? super GraphicsLayerScope, Unit> function1) {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LayingOut;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate.layoutState = layoutState;
            this.G0 = j10;
            this.I0 = f6;
            this.H0 = function1;
            this.f16843y0 = true;
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate.f16817a);
            if (layoutNodeLayoutDelegate.getLayoutPending() || !getIsPlaced()) {
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                layoutNodeLayoutDelegate.setCoordinatesAccessedDuringModifierPlacement(false);
                ownerRequireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(layoutNodeLayoutDelegate.f16817a, false, new b(function1, LayoutNodeLayoutDelegate.this, j10, f6));
            } else {
                layoutNodeLayoutDelegate.getOuterCoordinator().m3716placeSelfApparentToRealOffsetf8xVGno(j10, f6, function1);
                onNodePlaced$ui_release();
            }
            layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.Idle;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1<? super AlignmentLinesOwner, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f16817a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    block.invoke(content[i10].getLayoutDelegate().getAlignmentLinesOwner$ui_release());
                    i10++;
                } while (i10 < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int i10 = layoutNodeLayoutDelegate.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i10;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.M0;
        }

        @NotNull
        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate.f16817a.updateChildrenIfDirty$ui_release();
            boolean z10 = this.childDelegatesDirty;
            MutableVector<MeasurePassDelegate> mutableVector = this.N0;
            if (!z10) {
                return mutableVector.asMutableList();
            }
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i10 = 0;
                do {
                    LayoutNode layoutNode2 = content[i10];
                    if (mutableVector.getSize() <= i10) {
                        mutableVector.add(layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    } else {
                        mutableVector.set(i10, layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    }
                    i10++;
                } while (i10 < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return mutableVector.asMutableList();
        }

        /* JADX INFO: renamed from: getChildDelegatesDirty$ui_release, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        /* JADX INFO: renamed from: getDuringAlignmentLinesQuery$ui_release, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.f16817a.getInnerCoordinator$ui_release();
        }

        @Nullable
        /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m3687getLastConstraintsDWUhwKw() {
            if (this.f16842x0) {
                return Constraints.m4346boximpl(getMeasurementConstraints());
            }
            return null;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @NotNull
        /* JADX INFO: renamed from: getMeasuredByParent$ui_release, reason: from getter */
        public final LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f16817a.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate = parent$ui_release.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.getAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.parentData;
        }

        /* JADX INFO: renamed from: getPlaceOrder$ui_release, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        /* JADX INFO: renamed from: getPreviousPlaceOrder$ui_release, reason: from getter */
        public final int getPreviousPlaceOrder() {
            return this.previousPlaceOrder;
        }

        /* JADX INFO: renamed from: getZIndex$ui_release, reason: from getter */
        public final float getZIndex() {
            return this.zIndex;
        }

        public final void invalidateIntrinsicsParent(boolean forceRequest) {
            LayoutNode parent$ui_release;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode parent$ui_release2 = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent = layoutNodeLayoutDelegate.f16817a.getIntrinsicsUsageByParent();
            if (parent$ui_release2 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i10 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i10 == 1) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                parent$ui_release2.requestRelayout$ui_release(forceRequest);
            }
        }

        public final void invalidateParentData() {
            this.J0 = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        /* JADX INFO: renamed from: isPlaced, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.getLayoutPending() && (size = (mutableVector = layoutNodeLayoutDelegate.f16817a.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    LayoutNode layoutNode = content[i10];
                    if (layoutNode.getMeasurePending$ui_release() && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m3667remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.f16817a, false, false, 3, null);
                    }
                    i10++;
                } while (i10 < size);
            }
            if (layoutNodeLayoutDelegate.f16821e || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().getIsPlacingForAlignment() && layoutNodeLayoutDelegate.getLayoutPending())) {
                layoutNodeLayoutDelegate.layoutPending = false;
                LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.getLayoutState();
                layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.LayingOut;
                layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f16817a;
                LayoutNodeKt.requireOwner(layoutNode2).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode2, false, new a(layoutNode2));
                layoutNodeLayoutDelegate.layoutState = layoutState;
                if (getInnerCoordinator().getIsPlacingForAlignment() && layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f16821e = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            d();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            d();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo3575measureBRTryo0(long constraints) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode.UsageByParent intrinsicsUsageByParent = layoutNodeLayoutDelegate.f16817a.getIntrinsicsUsageByParent();
            LayoutNode.UsageByParent usageByParent2 = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent == usageByParent2) {
                layoutNodeLayoutDelegate.f16817a.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (LayoutNodeLayoutDelegate.access$isOutMostLookaheadRoot(layoutNodeLayoutDelegate, layoutNodeLayoutDelegate.f16817a)) {
                this.f16842x0 = true;
                m3610setMeasurementConstraintsBRTryo0(constraints);
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegate);
                lookaheadPassDelegate.setMeasuredByParent$ui_release(usageByParent2);
                lookaheadPassDelegate.mo3575measureBRTryo0(constraints);
            }
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release == null) {
                this.measuredByParent = usageByParent2;
            } else {
                if (this.measuredByParent != usageByParent2 && !layoutNode.getCanMultiMeasure()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i10 == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
                this.measuredByParent = usageByParent;
            }
            m3688remeasureBRTryo0(constraints);
            return this;
        }

        public final void measureBasedOnLookahead() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.getLookaheadPassDelegate();
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            Intrinsics.checkNotNull(parent$ui_release);
            if (lookaheadPassDelegate == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (lookaheadPassDelegate.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                Constraints f6 = lookaheadPassDelegate.getF0();
                Intrinsics.checkNotNull(f6);
                mo3575measureBRTryo0(f6.getF18296a());
            } else if (lookaheadPassDelegate.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                Constraints f10 = lookaheadPassDelegate.getF0();
                Intrinsics.checkNotNull(f10);
                mo3575measureBRTryo0(f10.getF18296a());
            }
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            d();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            d();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(height);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = layoutNodeLayoutDelegate.f16817a.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                i10++;
            } while (i10 < size);
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void onNodePlaced$ui_release() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!getIsPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                b();
            }
            if (parent$ui_release == null) {
                this.placeOrder = 0;
            } else if (!this.f16840u0 && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                if (this.placeOrder != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                this.placeOrder = parent$ui_release.getLayoutDelegate().f16826j;
                parent$ui_release.getLayoutDelegate().f16826j++;
            }
            layoutChildren();
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo3579placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            boolean zM4506equalsimpl0 = IntOffset.m4506equalsimpl0(position, this.G0);
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (!zM4506equalsimpl0) {
                if (layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                    layoutNodeLayoutDelegate.layoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            if (LayoutNodeLayoutDelegate.access$isOutMostLookaheadRoot(layoutNodeLayoutDelegate, layoutNodeLayoutDelegate.f16817a)) {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegate);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate().f16825i = 0;
                }
                lookaheadPassDelegate.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(companion, lookaheadPassDelegate, IntOffset.m4507getXimpl(position), IntOffset.m4508getYimpl(position), 0.0f, 4, null);
            }
            e(position, zIndex, layerBlock);
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            if (lookaheadPassDelegate == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            mo3579placeAtf8xVGno(lookaheadPassDelegate.getLastPosition(), lookaheadPassDelegate.getLastZIndex(), lookaheadPassDelegate.getLastLayerBlock$ui_release());
        }

        /* JADX INFO: renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m3688remeasureBRTryo0(long constraints) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate.f16817a);
            LayoutNode parent$ui_release = layoutNodeLayoutDelegate.f16817a.getParent$ui_release();
            boolean z10 = true;
            layoutNodeLayoutDelegate.f16817a.setCanMultiMeasure$ui_release(layoutNodeLayoutDelegate.f16817a.getCanMultiMeasure() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure()));
            if (!layoutNodeLayoutDelegate.f16817a.getMeasurePending$ui_release() && Constraints.m4351equalsimpl0(getMeasurementConstraints(), constraints)) {
                m.a(ownerRequireOwner, layoutNodeLayoutDelegate.f16817a, false, 2, null);
                layoutNodeLayoutDelegate.f16817a.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(c.f16850p0);
            this.f16842x0 = true;
            long jMo3581getSizeYbymL2g = layoutNodeLayoutDelegate.getOuterCoordinator().mo3581getSizeYbymL2g();
            m3610setMeasurementConstraintsBRTryo0(constraints);
            LayoutNodeLayoutDelegate.m3681access$performMeasureBRTryo0(layoutNodeLayoutDelegate, constraints);
            if (IntSize.m4547equalsimpl0(layoutNodeLayoutDelegate.getOuterCoordinator().mo3581getSizeYbymL2g(), jMo3581getSizeYbymL2g) && layoutNodeLayoutDelegate.getOuterCoordinator().getWidth() == getWidth() && layoutNodeLayoutDelegate.getOuterCoordinator().getHeight() == getHeight()) {
                z10 = false;
            }
            m3609setMeasuredSizeozmzZPI(IntSizeKt.IntSize(layoutNodeLayoutDelegate.getOuterCoordinator().getWidth(), layoutNodeLayoutDelegate.getOuterCoordinator().getHeight()));
            return z10;
        }

        public final void replace() {
            try {
                this.f16840u0 = true;
                if (!this.f16843y0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                e(this.G0, this.I0, this.H0);
                this.f16840u0 = false;
            } catch (Throwable th2) {
                this.f16840u0 = false;
                throw th2;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.f16817a, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.f16817a, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z10) {
            this.childDelegatesDirty = z10;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z10) {
            this.duringAlignmentLinesQuery = z10;
        }

        public final void setMeasuredByParent$ui_release(@NotNull LayoutNode.UsageByParent usageByParent) {
            Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
            this.measuredByParent = usageByParent;
        }

        public void setPlaced$ui_release(boolean z10) {
            this.isPlaced = z10;
        }

        public final boolean updateParentData() {
            Object parentData = getParentData();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if ((parentData == null && layoutNodeLayoutDelegate.getOuterCoordinator().getParentData() == null) || !this.J0) {
                return false;
            }
            this.J0 = false;
            this.parentData = layoutNodeLayoutDelegate.getOuterCoordinator().getParentData();
            return true;
        }
    }

    public LayoutNodeLayoutDelegate(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f16817a = layoutNode;
        this.layoutState = LayoutNode.LayoutState.Idle;
        this.measurePassDelegate = new MeasurePassDelegate();
    }

    public static boolean a(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot() != null) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot() : null) == null) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ boolean access$isOutMostLookaheadRoot(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LayoutNode layoutNode) {
        layoutNodeLayoutDelegate.getClass();
        return a(layoutNode);
    }

    /* JADX INFO: renamed from: access$performLookaheadMeasure-BRTryo0, reason: not valid java name */
    public static final void m3680access$performLookaheadMeasureBRTryo0(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j10) {
        layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        layoutNodeLayoutDelegate.lookaheadMeasurePending = false;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver(), layoutNodeLayoutDelegate.f16817a, false, new j(layoutNodeLayoutDelegate, j10), 2, null);
        layoutNodeLayoutDelegate.markLookaheadLayoutPending$ui_release();
        if (a(layoutNode)) {
            layoutNodeLayoutDelegate.markLayoutPending$ui_release();
        } else {
            layoutNodeLayoutDelegate.markMeasurePending$ui_release();
        }
        layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.Idle;
    }

    /* JADX INFO: renamed from: access$performMeasure-BRTryo0, reason: not valid java name */
    public static final void m3681access$performMeasureBRTryo0(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j10) {
        LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.layoutState;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState != layoutState2) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        layoutNodeLayoutDelegate.layoutState = layoutState3;
        layoutNodeLayoutDelegate.measurePending = false;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f16817a;
        LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(layoutNode, false, new k(layoutNodeLayoutDelegate, j10));
        if (layoutNodeLayoutDelegate.layoutState == layoutState3) {
            layoutNodeLayoutDelegate.markLayoutPending$ui_release();
            layoutNodeLayoutDelegate.layoutState = layoutState2;
        }
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    @NotNull
    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    @Nullable
    /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m3682getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m3687getLastConstraintsDWUhwKw();
    }

    @Nullable
    /* JADX INFO: renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m3683getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getF0();
        }
        return null;
    }

    /* JADX INFO: renamed from: getLayoutPending$ui_release, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutState$ui_release, reason: from getter */
    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    @Nullable
    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: getLookaheadLayoutPending$ui_release, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* JADX INFO: renamed from: getLookaheadMeasurePending$ui_release, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    @Nullable
    /* JADX INFO: renamed from: getLookaheadPassDelegate$ui_release, reason: from getter */
    public final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    @NotNull
    /* JADX INFO: renamed from: getMeasurePassDelegate$ui_release, reason: from getter */
    public final MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: getMeasurePending$ui_release, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator() {
        return this.f16817a.getNodes().getOuterCoordinator();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.f16821e = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.f16824h = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.f16817a.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringModifierPlacement(true);
            } else {
                setCoordinatesAccessedDuringPlacement(true);
            }
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i10) {
        int i11 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode parent$ui_release = this.f16817a.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate = parent$ui_release != null ? parent$ui_release.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i10 == 0) {
                    layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z10) {
        if (this.coordinatesAccessedDuringModifierPlacement != z10) {
            this.coordinatesAccessedDuringModifierPlacement = z10;
            if (z10 && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z10) {
        if (this.coordinatesAccessedDuringPlacement != z10) {
            this.coordinatesAccessedDuringPlacement = z10;
            if (z10 && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void updateParentData() {
        LayoutNode parent$ui_release;
        boolean zUpdateParentData = this.measurePassDelegate.updateParentData();
        LayoutNode layoutNode = this.f16817a;
        if (zUpdateParentData && (parent$ui_release = layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, 3, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.updateParentData()) {
            return;
        }
        if (a(layoutNode)) {
            LayoutNode parent$ui_release2 = layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, 3, null);
                return;
            }
            return;
        }
        LayoutNode parent$ui_release3 = layoutNode.getParent$ui_release();
        if (parent$ui_release3 != null) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, 3, null);
        }
    }
}
