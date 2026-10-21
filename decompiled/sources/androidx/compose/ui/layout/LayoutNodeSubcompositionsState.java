package androidx.compose.ui.layout;

import androidx.collection.g;
import androidx.collection.j;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import g1.v;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003<\u001d&B\u0017\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010,\u001a\u00020$¢\u0006\u0004\b:\u0010;J0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004J(\u0010\u0016\u001a\u00020\u00152\u001d\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0002\b\u0013ø\u0001\u0000J*\u0010\u0018\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010,\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R<\u00104\u001a\u0019\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0002\b\u00138\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00106\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "startIndex", "disposeOrReuseStartingFromIndex", "makeSureStateIsConsistent", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren", "disposeCurrentNodes", "Landroidx/compose/runtime/CompositionContext;", "b", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "value", "c", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "slotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", "i", "Lkotlin/jvm/functions/Function2;", "getIntermediateMeasurePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "setIntermediateMeasurePolicy$ui_release", "(Lkotlin/jvm/functions/Function2;)V", "intermediateMeasurePolicy", "", "isInLookaheadScope", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1063:1\n978#1:1085\n978#1:1099\n978#1:1115\n978#1:1120\n361#2,7:1064\n361#2,7:1071\n361#2,7:1106\n495#3,4:1078\n500#3:1091\n495#3,4:1092\n500#3:1105\n129#4,3:1082\n133#4:1090\n129#4,3:1096\n133#4:1104\n1067#5,4:1086\n1067#5,4:1100\n1067#5,4:1116\n1067#5,4:1121\n1067#5,4:1125\n1067#5,2:1129\n1069#5,2:1133\n215#6,2:1113\n1855#7,2:1131\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n692#1:1085\n760#1:1099\n966#1:1115\n972#1:1120\n648#1:1064,7\n679#1:1071,7\n901#1:1106,7\n691#1:1078,4\n691#1:1091\n744#1:1092,4\n744#1:1105\n691#1:1082,3\n691#1:1090\n744#1:1096,3\n744#1:1104\n692#1:1086,4\n760#1:1100,4\n966#1:1116,4\n972#1:1121,4\n978#1:1125,4\n981#1:1129,2\n981#1:1133,2\n957#1:1113,2\n982#1:1131,2\n*E\n"})
public final class LayoutNodeSubcompositionsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LayoutNode f16576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CompositionContext compositionContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SubcomposeSlotReusePolicy slotReusePolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f16580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f16581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c f16582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final a f16583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> intermediateMeasurePolicy;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f16585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SubcomposeSlotReusePolicy.SlotIdsSet f16586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16587l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f16588n;

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public final class a implements SubcomposeIntermediateMeasureScope, MeasureScope {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ c f16589p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> f16591r0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f16590q0 = IntSize.INSTANCE.m4554getZeroYbymL2g();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f16592s0 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        public a() {
            this.f16589p0 = LayoutNodeSubcompositionsState.this.f16582g;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.f16589p0.f16600q0;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            return this.f16589p0.f16601r0;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.f16589p0.f16599p0;
        }

        @Override // androidx.compose.ui.layout.SubcomposeIntermediateMeasureScope
        /* JADX INFO: renamed from: getLookaheadConstraints-msEJaDk, reason: not valid java name */
        public final long mo3588getLookaheadConstraintsmsEJaDk() {
            return this.f16592s0;
        }

        @Override // androidx.compose.ui.layout.SubcomposeIntermediateMeasureScope
        @NotNull
        public final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getLookaheadMeasurePolicy() {
            Function2 function2 = this.f16591r0;
            if (function2 != null) {
                return function2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("lookaheadMeasurePolicy");
            return null;
        }

        @Override // androidx.compose.ui.layout.SubcomposeIntermediateMeasureScope
        /* JADX INFO: renamed from: getLookaheadSize-YbymL2g, reason: not valid java name */
        public final long mo3589getLookaheadSizeYbymL2g() {
            return this.f16590q0;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @ExperimentalComposeUiApi
        public final boolean isLookingAhead() {
            return this.f16589p0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @NotNull
        public final MeasureResult layout(int i10, int i11, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            c cVar = this.f16589p0;
            cVar.getClass();
            return MeasureScope.CC.a(cVar, i10, i11, alignmentLines, placementBlock);
        }

        @Override // androidx.compose.ui.layout.SubcomposeIntermediateMeasureScope
        @NotNull
        public final List<Measurable> measurablesForSlot(@Nullable Object obj) {
            List<Measurable> childMeasurables$ui_release;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.f16581f.get(obj);
            return (layoutNode == null || (childMeasurables$ui_release = layoutNode.getChildMeasurables$ui_release()) == null) ? CollectionsKt__CollectionsKt.emptyList() : childMeasurables$ui_release;
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public final int mo412roundToPxR2X_6o(long j10) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.a(cVar, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public final int mo413roundToPx0680j_4(float f6) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.b(cVar, f6);
        }

        @Override // androidx.compose.ui.layout.SubcomposeIntermediateMeasureScope, androidx.compose.ui.layout.SubcomposeMeasureScope
        public final /* synthetic */ List subcompose(Object obj, Function2 function2) {
            return v.a(this, obj, function2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public final float mo404toDpGaN1DYA(long j10) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.c(cVar, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final float mo405toDpu2uoSUM(float f6) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.d(cVar, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public final long mo407toDpSizekrfVVM(long j10) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.f(cVar, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public final float mo414toPxR2X_6o(long j10) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.g(cVar, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public final float mo415toPx0680j_4(float f6) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.h(cVar, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @NotNull
        public final Rect toRect(@NotNull DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.i(cVar, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public final long mo408toSizeXkaWNTQ(long j10) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.j(cVar, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public final long mo409toSp0xMU5do(float f6) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.k(cVar, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final long mo410toSpkPz2Gy4(float f6) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.l(cVar, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final float mo406toDpu2uoSUM(int i10) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.e(cVar, i10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final long mo411toSpkPz2Gy4(int i10) {
            c cVar = this.f16589p0;
            cVar.getClass();
            return x1.a.m(cVar, i10);
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1063:1\n81#2:1064\n107#2,2:1065\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n*L\n1001#1:1064\n1001#1:1065,2\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Object f16594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public Function2<? super Composer, ? super Integer, Unit> f16595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Composition f16596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final MutableState f16598e;

        public b() {
            throw null;
        }

        public b(Object obj, Function2 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f16594a = obj;
            this.f16595b = content;
            this.f16596c = null;
            this.f16598e = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public final class c implements SubcomposeMeasureScope {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public LayoutDirection f16599p0 = LayoutDirection.Rtl;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public float f16600q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f16601r0;

        public c() {
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.f16600q0;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            return this.f16601r0;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.f16599p0;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final boolean isLookingAhead() {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return layoutNodeSubcompositionsState.f16576a.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut || layoutNodeSubcompositionsState.f16576a.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final /* synthetic */ MeasureResult layout(int i10, int i11, Map map, Function1 function1) {
            return MeasureScope.CC.a(this, i10, i11, map, function1);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
            return x1.a.a(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
            return x1.a.b(this, f6);
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @NotNull
        public final List<Measurable> subcompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return LayoutNodeSubcompositionsState.this.subcompose(obj, content);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
            return x1.a.c(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
            return x1.a.d(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
            return x1.a.f(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
            return x1.a.g(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public final /* synthetic */ float mo415toPx0680j_4(float f6) {
            return x1.a.h(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        public final /* synthetic */ Rect toRect(DpRect dpRect) {
            return x1.a.i(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
            return x1.a.j(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
            return x1.a.k(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
            return x1.a.l(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
            return x1.a.e(this, i10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
            return x1.a.m(this, i10);
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class d extends Lambda implements Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f16608p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final MeasureResult invoke(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, Constraints constraints) {
            SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope2 = subcomposeIntermediateMeasureScope;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(subcomposeIntermediateMeasureScope2, "$this$null");
            return subcomposeIntermediateMeasureScope2.getLookaheadMeasurePolicy().invoke(subcomposeIntermediateMeasureScope2, Constraints.m4346boximpl(f18296a));
        }
    }

    public LayoutNodeSubcompositionsState(@NotNull LayoutNode root, @NotNull SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f16576a = root;
        this.slotReusePolicy = slotReusePolicy;
        this.f16580e = new LinkedHashMap();
        this.f16581f = new LinkedHashMap();
        this.f16582g = new c();
        this.f16583h = new a();
        this.intermediateMeasurePolicy = d.f16608p0;
        this.f16585j = new LinkedHashMap();
        this.f16586k = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
        this.f16588n = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(int i10, int i11, int i12) {
        LayoutNode layoutNode = this.f16576a;
        layoutNode.H0 = true;
        layoutNode.move$ui_release(i10, i11, i12);
        layoutNode.H0 = false;
    }

    public final void b(LayoutNode layoutNode, Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
        LinkedHashMap linkedHashMap = this.f16580e;
        Object bVar = linkedHashMap.get(layoutNode);
        if (bVar == null) {
            bVar = new b(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m3569getLambda1$ui_release());
            linkedHashMap.put(layoutNode, bVar);
        }
        b bVar2 = (b) bVar;
        Composition composition = bVar2.f16596c;
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (bVar2.f16595b != function2 || hasInvalidations || bVar2.f16597d) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            bVar2.f16595b = function2;
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    LayoutNode layoutNode2 = this.f16576a;
                    layoutNode2.H0 = true;
                    Function2<? super Composer, ? super Integer, Unit> function3 = bVar2.f16595b;
                    Composition compositionCreateSubcomposition = bVar2.f16596c;
                    CompositionContext compositionContext = this.compositionContext;
                    if (compositionContext == null) {
                        throw new IllegalStateException("parent composition reference not set".toString());
                    }
                    ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-34810602, true, new androidx.compose.ui.layout.b(bVar2, function3));
                    if (compositionCreateSubcomposition == null || compositionCreateSubcomposition.getP0()) {
                        compositionCreateSubcomposition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext);
                    }
                    compositionCreateSubcomposition.setContent(composableLambdaComposableLambdaInstance);
                    bVar2.f16596c = compositionCreateSubcomposition;
                    layoutNode2.H0 = false;
                    Unit unit = Unit.INSTANCE;
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    bVar2.f16597d = false;
                } catch (Throwable th2) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
    }

    public final LayoutNode c(Object obj) {
        LinkedHashMap linkedHashMap;
        int i10;
        if (this.f16587l == 0) {
            return null;
        }
        LayoutNode layoutNode = this.f16576a;
        int size = layoutNode.getFoldedChildren$ui_release().size() - this.m;
        int i11 = size - this.f16587l;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            linkedHashMap = this.f16580e;
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            Object obj2 = linkedHashMap.get(layoutNode.getFoldedChildren$ui_release().get(i13));
            Intrinsics.checkNotNull(obj2);
            if (Intrinsics.areEqual(((b) obj2).f16594a, obj)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                Object obj3 = linkedHashMap.get(layoutNode.getFoldedChildren$ui_release().get(i12));
                Intrinsics.checkNotNull(obj3);
                b bVar = (b) obj3;
                if (this.slotReusePolicy.areCompatible(obj, bVar.f16594a)) {
                    bVar.f16594a = obj;
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            a(i13, i11, 1);
        }
        this.f16587l--;
        LayoutNode layoutNode2 = layoutNode.getFoldedChildren$ui_release().get(i11);
        Object obj4 = linkedHashMap.get(layoutNode2);
        Intrinsics.checkNotNull(obj4);
        b bVar2 = (b) obj4;
        bVar2.f16598e.setValue(Boolean.TRUE);
        bVar2.f16597d = true;
        Snapshot.INSTANCE.sendApplyNotifications();
        return layoutNode2;
    }

    @NotNull
    public final MeasurePolicy createMeasurePolicy(@NotNull final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        a aVar = this.f16583h;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(block, "<set-?>");
        aVar.f16591r0 = block;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.f16588n) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasurePolicy.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                c cVar = layoutNodeSubcompositionsState.f16582g;
                LayoutDirection layoutDirection = measure.getLayoutDirection();
                cVar.getClass();
                Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
                cVar.f16599p0 = layoutDirection;
                layoutNodeSubcompositionsState.f16582g.f16600q0 = measure.getDensity();
                layoutNodeSubcompositionsState.f16582g.f16601r0 = measure.getFontScale();
                if ((layoutNodeSubcompositionsState.f16576a.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring || layoutNodeSubcompositionsState.f16576a.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) && layoutNodeSubcompositionsState.f16576a.getLookaheadRoot() != null) {
                    return layoutNodeSubcompositionsState.getIntermediateMeasurePolicy$ui_release().invoke(layoutNodeSubcompositionsState.f16583h, Constraints.m4346boximpl(j10));
                }
                layoutNodeSubcompositionsState.f16579d = 0;
                layoutNodeSubcompositionsState.f16583h.f16592s0 = j10;
                final MeasureResult measureResultInvoke = block.invoke(layoutNodeSubcompositionsState.f16582g, Constraints.m4346boximpl(j10));
                final int i10 = layoutNodeSubcompositionsState.f16579d;
                layoutNodeSubcompositionsState.f16583h.f16590q0 = IntSizeKt.IntSize(measureResultInvoke.getWidth(), measureResultInvoke.getHeight());
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    @NotNull
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResultInvoke.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResultInvoke.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResultInvoke.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        int i11 = i10;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                        layoutNodeSubcompositionsState2.f16579d = i11;
                        measureResultInvoke.placeChildren();
                        layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.f16579d);
                    }
                };
            }
        };
    }

    public final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.f16576a;
        layoutNode.H0 = true;
        LinkedHashMap linkedHashMap = this.f16580e;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            Composition composition = ((b) it.next()).f16596c;
            if (composition != null) {
                composition.dispose();
            }
        }
        layoutNode.removeAll$ui_release();
        layoutNode.H0 = false;
        linkedHashMap.clear();
        this.f16581f.clear();
        this.m = 0;
        this.f16587l = 0;
        this.f16585j.clear();
        makeSureStateIsConsistent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void disposeOrReuseStartingFromIndex(int startIndex) {
        this.f16587l = 0;
        LayoutNode layoutNode = this.f16576a;
        int size = (layoutNode.getFoldedChildren$ui_release().size() - this.m) - 1;
        if (startIndex <= size) {
            SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet = this.f16586k;
            slotIdsSet.clear();
            LinkedHashMap linkedHashMap = this.f16580e;
            if (startIndex <= size) {
                int i10 = startIndex;
                while (true) {
                    Object obj = linkedHashMap.get(layoutNode.getFoldedChildren$ui_release().get(i10));
                    Intrinsics.checkNotNull(obj);
                    slotIdsSet.add(((b) obj).f16594a);
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(slotIdsSet);
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                boolean z10 = false;
                while (size >= startIndex) {
                    try {
                        LayoutNode layoutNode2 = layoutNode.getFoldedChildren$ui_release().get(size);
                        Object obj2 = linkedHashMap.get(layoutNode2);
                        Intrinsics.checkNotNull(obj2);
                        b bVar = (b) obj2;
                        Object obj3 = bVar.f16594a;
                        MutableState mutableState = bVar.f16598e;
                        if (slotIdsSet.contains(obj3)) {
                            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = layoutNode2.getMeasurePassDelegate$ui_release();
                            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLookaheadPassDelegate$ui_release();
                            if (lookaheadPassDelegate$ui_release != null) {
                                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                            }
                            this.f16587l++;
                            if (((Boolean) mutableState.getValue()).booleanValue()) {
                                mutableState.setValue(Boolean.FALSE);
                                z10 = true;
                            }
                        } else {
                            layoutNode.H0 = true;
                            linkedHashMap.remove(layoutNode2);
                            Composition composition = bVar.f16596c;
                            if (composition != null) {
                                composition.dispose();
                            }
                            layoutNode.removeAt$ui_release(size, 1);
                            layoutNode.H0 = false;
                        }
                        this.f16581f.remove(obj3);
                        size--;
                    } catch (Throwable th2) {
                        snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        throw th2;
                    }
                }
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                if (z10) {
                    Snapshot.INSTANCE.sendApplyNotifications();
                }
            } catch (Throwable th3) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
        makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        Iterator it = this.f16580e.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).f16597d = true;
        }
        LayoutNode layoutNode = this.f16576a;
        if (layoutNode.getMeasurePending$ui_release()) {
            return;
        }
        LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, 3, null);
    }

    @Nullable
    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    @NotNull
    public final Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> getIntermediateMeasurePolicy$ui_release() {
        return this.intermediateMeasurePolicy;
    }

    @NotNull
    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final boolean isInLookaheadScope() {
        return this.f16576a.getLookaheadRoot() != null;
    }

    public final void makeSureStateIsConsistent() {
        LinkedHashMap linkedHashMap = this.f16580e;
        int size = linkedHashMap.size();
        LayoutNode layoutNode = this.f16576a;
        if (size != layoutNode.getFoldedChildren$ui_release().size()) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + linkedHashMap.size() + ") and the children count on the SubcomposeLayout (" + layoutNode.getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((layoutNode.getFoldedChildren$ui_release().size() - this.f16587l) - this.m < 0) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + layoutNode.getFoldedChildren$ui_release().size() + ". Reusable children " + this.f16587l + ". Precomposed children " + this.m).toString());
        }
        LinkedHashMap linkedHashMap2 = this.f16585j;
        if (linkedHashMap2.size() == this.m) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.m + ". Map size " + linkedHashMap2.size()).toString());
    }

    @NotNull
    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(@Nullable final Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        if (!this.f16581f.containsKey(slotId)) {
            LinkedHashMap linkedHashMap = this.f16585j;
            Object objC = linkedHashMap.get(slotId);
            if (objC == null) {
                objC = c(slotId);
                LayoutNode layoutNode = this.f16576a;
                boolean z10 = true;
                if (objC != null) {
                    a(layoutNode.getFoldedChildren$ui_release().indexOf(objC), layoutNode.getFoldedChildren$ui_release().size(), 1);
                    this.m++;
                } else {
                    int size = layoutNode.getFoldedChildren$ui_release().size();
                    LayoutNode layoutNode2 = new LayoutNode(z10, 0, 2, null);
                    layoutNode.H0 = true;
                    layoutNode.insertAt$ui_release(size, layoutNode2);
                    layoutNode.H0 = false;
                    this.m++;
                    objC = layoutNode2;
                }
                linkedHashMap.put(slotId, objC);
            }
            b((LayoutNode) objC, slotId, content);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                layoutNodeSubcompositionsState.makeSureStateIsConsistent();
                LayoutNode layoutNode3 = (LayoutNode) layoutNodeSubcompositionsState.f16585j.remove(slotId);
                if (layoutNode3 != null) {
                    if (layoutNodeSubcompositionsState.m <= 0) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    int iIndexOf = layoutNodeSubcompositionsState.f16576a.getFoldedChildren$ui_release().indexOf(layoutNode3);
                    if (iIndexOf < layoutNodeSubcompositionsState.f16576a.getFoldedChildren$ui_release().size() - layoutNodeSubcompositionsState.m) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    layoutNodeSubcompositionsState.f16587l++;
                    layoutNodeSubcompositionsState.m--;
                    int size2 = (layoutNodeSubcompositionsState.f16576a.getFoldedChildren$ui_release().size() - layoutNodeSubcompositionsState.m) - layoutNodeSubcompositionsState.f16587l;
                    layoutNodeSubcompositionsState.a(iIndexOf, size2, 1);
                    layoutNodeSubcompositionsState.disposeOrReuseStartingFromIndex(size2);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                List<LayoutNode> children$ui_release;
                LayoutNode layoutNode3 = (LayoutNode) LayoutNodeSubcompositionsState.this.f16585j.get(slotId);
                if (layoutNode3 == null || (children$ui_release = layoutNode3.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* JADX INFO: renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo3590premeasure0kLqBqw(int index, long constraints) {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                LayoutNode layoutNode3 = (LayoutNode) layoutNodeSubcompositionsState.f16585j.get(slotId);
                if (layoutNode3 == null || !layoutNode3.isAttached()) {
                    return;
                }
                int size2 = layoutNode3.getChildren$ui_release().size();
                if (index < 0 || index >= size2) {
                    throw new IndexOutOfBoundsException(g.b("Index (", index, ") is out of bound of [0, ", size2, RootService.CLOSE_BRACKET));
                }
                if (!(!layoutNode3.isPlaced())) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                LayoutNode layoutNode4 = layoutNodeSubcompositionsState.f16576a;
                layoutNode4.H0 = true;
                LayoutNodeKt.requireOwner(layoutNode3).mo3780measureAndLayout0kLqBqw(layoutNode3.getChildren$ui_release().get(index), constraints);
                layoutNode4.H0 = false;
            }
        };
    }

    public final void setCompositionContext(@Nullable CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setIntermediateMeasurePolicy$ui_release(@NotNull Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.intermediateMeasurePolicy = function2;
    }

    public final void setSlotReusePolicy(@NotNull SubcomposeSlotReusePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.slotReusePolicy != value) {
            this.slotReusePolicy = value;
            disposeOrReuseStartingFromIndex(0);
        }
    }

    @NotNull
    public final List<Measurable> subcompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        LayoutNode layoutNode = this.f16576a;
        LayoutNode.LayoutState layoutState$ui_release = layoutNode.getLayoutState$ui_release();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (layoutState$ui_release != layoutState && layoutState$ui_release != LayoutNode.LayoutState.LayingOut && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui_release != LayoutNode.LayoutState.LookaheadLayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        LinkedHashMap linkedHashMap = this.f16581f;
        Object objC = linkedHashMap.get(slotId);
        boolean z10 = true;
        if (objC == null) {
            objC = (LayoutNode) this.f16585j.remove(slotId);
            if (objC != null) {
                int i10 = this.m;
                if (i10 <= 0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                this.m = i10 - 1;
            } else {
                objC = c(slotId);
                if (objC == null) {
                    int i11 = this.f16579d;
                    LayoutNode layoutNode2 = new LayoutNode(z10, 0, 2, null);
                    layoutNode.H0 = true;
                    layoutNode.insertAt$ui_release(i11, layoutNode2);
                    layoutNode.H0 = false;
                    objC = layoutNode2;
                }
            }
            linkedHashMap.put(slotId, objC);
        }
        LayoutNode layoutNode3 = (LayoutNode) objC;
        int iIndexOf = layoutNode.getFoldedChildren$ui_release().indexOf(layoutNode3);
        int i12 = this.f16579d;
        if (iIndexOf < i12) {
            throw new IllegalArgumentException(j.b("Key \"", slotId, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
        }
        if (i12 != iIndexOf) {
            a(iIndexOf, i12, 1);
        }
        this.f16579d++;
        b(layoutNode3, slotId, content);
        return (layoutState$ui_release == layoutState || layoutState$ui_release == LayoutNode.LayoutState.LayingOut) ? layoutNode3.getChildMeasurables$ui_release() : layoutNode3.getChildLookaheadMeasurables$ui_release();
    }
}
