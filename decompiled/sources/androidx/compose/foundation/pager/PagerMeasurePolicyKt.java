package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PagerMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0094\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondBoundsPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "pageCount", "rememberPagerMeasurePolicy-BxUkNYg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,190:1\n83#2,3:191\n1097#3,6:194\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n54#1:191,3\n54#1:194,6\n*E\n"})
public final class PagerMeasurePolicyKt {

    /* JADX INFO: compiled from: PagerMeasurePolicy.kt */
    @SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,190:1\n1#2:191\n495#3,4:192\n500#3:201\n129#4,5:196\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n144#1:192,4\n144#1:201\n144#1:196,5\n*E\n"})
    public static final class a extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5455p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f5456q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f5457r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PagerState f5458s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f5459t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ PageSize f5460u0;
        public final /* synthetic */ Function0<PagerLazyLayoutItemProvider> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<Integer> f5461w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f5462x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f5463y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Orientation orientation, PaddingValues paddingValues, boolean z10, PagerState pagerState, float f6, PageSize pageSize, Function0<PagerLazyLayoutItemProvider> function0, Function0<Integer> function1, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i10) {
            super(2);
            this.f5455p0 = orientation;
            this.f5456q0 = paddingValues;
            this.f5457r0 = z10;
            this.f5458s0 = pagerState;
            this.f5459t0 = f6;
            this.f5460u0 = pageSize;
            this.v0 = function0;
            this.f5461w0 = function1;
            this.f5462x0 = vertical;
            this.f5463y0 = horizontal;
            this.E0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
            int i10;
            long jIntOffset;
            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope2, "$this$null");
            Orientation orientation = Orientation.Vertical;
            Orientation orientation2 = this.f5455p0;
            boolean z10 = orientation2 == orientation;
            CheckScrollableContainerConstraintsKt.m143checkScrollableContainerConstraintsK40F9xA(f18296a, z10 ? orientation : Orientation.Horizontal);
            PaddingValues paddingValues = this.f5456q0;
            int iMo413roundToPx0680j_4 = z10 ? lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.mo302calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope2.getLayoutDirection())) : lazyLayoutMeasureScope2.mo413roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection()));
            int iMo413roundToPx0680j_5 = z10 ? lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.mo303calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope2.getLayoutDirection())) : lazyLayoutMeasureScope2.mo413roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection()));
            int iMo413roundToPx0680j_6 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.getTop());
            int iMo413roundToPx0680j_7 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.getBottom());
            int i11 = iMo413roundToPx0680j_6 + iMo413roundToPx0680j_7;
            int i12 = iMo413roundToPx0680j_4 + iMo413roundToPx0680j_5;
            int i13 = z10 ? i11 : i12;
            boolean z11 = this.f5457r0;
            if (z10 && !z11) {
                i10 = iMo413roundToPx0680j_6;
            } else if (z10 && z11) {
                i10 = iMo413roundToPx0680j_7;
            } else {
                i10 = (z10 || z11) ? iMo413roundToPx0680j_5 : iMo413roundToPx0680j_4;
            }
            int i14 = i13 - i10;
            long jM4373offsetNN6EwU = ConstraintsKt.m4373offsetNN6EwU(f18296a, -i12, -i11);
            PagerState pagerState = this.f5458s0;
            pagerState.setDensity$foundation_release(lazyLayoutMeasureScope2);
            int iMo413roundToPx0680j_8 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(this.f5459t0);
            int iM4356getMaxHeightimpl = z10 ? Constraints.m4356getMaxHeightimpl(f18296a) - i11 : Constraints.m4357getMaxWidthimpl(f18296a) - i12;
            if (!z11 || iM4356getMaxHeightimpl > 0) {
                jIntOffset = IntOffsetKt.IntOffset(iMo413roundToPx0680j_4, iMo413roundToPx0680j_6);
            } else {
                if (!z10) {
                    iMo413roundToPx0680j_4 += iM4356getMaxHeightimpl;
                }
                if (z10) {
                    iMo413roundToPx0680j_6 += iM4356getMaxHeightimpl;
                }
                jIntOffset = IntOffsetKt.IntOffset(iMo413roundToPx0680j_4, iMo413roundToPx0680j_6);
            }
            long j10 = jIntOffset;
            int iCalculateMainAxisPageSize = this.f5460u0.calculateMainAxisPageSize(lazyLayoutMeasureScope2, iM4356getMaxHeightimpl, iMo413roundToPx0680j_8);
            pagerState.m455setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation2 == orientation ? Constraints.m4357getMaxWidthimpl(jM4373offsetNN6EwU) : iCalculateMainAxisPageSize, 0, orientation2 != orientation ? Constraints.m4356getMaxHeightimpl(jM4373offsetNN6EwU) : iCalculateMainAxisPageSize, 5, null));
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int firstVisiblePage$foundation_release = pagerState.getFirstVisiblePage$foundation_release();
                    int iRoundToInt = Intrinsics.areEqual(pagerState.getLayoutInfo$foundation_release(), PagerStateKt.getEmptyLayoutInfo()) ? mk.c.roundToInt(pagerState.getInitialPageOffsetFraction() * iCalculateMainAxisPageSize) : pagerState.getFirstVisiblePageOffset$foundation_release();
                    Unit unit = Unit.INSTANCE;
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = this.v0.invoke();
                    PagerMeasureResult pagerMeasureResultM451measurePagerntgEbfI = PagerMeasureKt.m451measurePagerntgEbfI(lazyLayoutMeasureScope2, this.f5461w0.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, iM4356getMaxHeightimpl, i10, i14, iMo413roundToPx0680j_8, firstVisiblePage$foundation_release, iRoundToInt, pagerState.getScrollToBeConsumed(), jM4373offsetNN6EwU, this.f5455p0, this.f5462x0, this.f5463y0, this.f5457r0, j10, iCalculateMainAxisPageSize, this.E0, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), new e(lazyLayoutMeasureScope2, f18296a, i12, i11));
                    pagerState.applyMeasureResult$foundation_release(pagerMeasureResultM451measurePagerntgEbfI);
                    return pagerMeasureResultM451measurePagerntgEbfI;
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v0 ??, still in use, count: 1, list:
          (r13v0 ?? I:java.lang.Object) from 0x00a7: INVOKE (r25v0 ?? I:androidx.compose.runtime.Composer), (r13v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:168)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: rememberPagerMeasurePolicy-BxUkNYg, reason: not valid java name */
    public static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> m452rememberPagerMeasurePolicyBxUkNYg(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v0 ??, still in use, count: 1, list:
          (r13v0 ?? I:java.lang.Object) from 0x00a7: INVOKE (r25v0 ?? I:androidx.compose.runtime.Composer), (r13v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:168)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
