package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0089\u0001\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000e¢\u0006\u0002\b\u00122\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001d\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\b\u0012H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Lkotlin/ExtensionFunctionType;", "slots", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "rememberStaggeredGridMeasurePolicy-nbWgWpA", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberStaggeredGridMeasurePolicy", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,164:1\n83#2,3:165\n1097#3,6:168\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n48#1:165,3\n48#1:168,6\n*E\n"})
public final class LazyStaggeredGridMeasurePolicyKt {

    /* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,164:1\n51#2:165\n51#2:166\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n92#1:165\n95#1:166\n*E\n"})
    public static final class a extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5233p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Density, Constraints, LazyStaggeredGridSlots> f5234q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyStaggeredGridItemProvider> f5235r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LazyStaggeredGridState f5236s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f5237t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f5238u0;
        public final /* synthetic */ float v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Orientation orientation, Function2<? super Density, ? super Constraints, LazyStaggeredGridSlots> function2, Function0<? extends LazyStaggeredGridItemProvider> function0, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z10, float f6) {
            super(2);
            this.f5233p0 = orientation;
            this.f5234q0 = function2;
            this.f5235r0 = function0;
            this.f5236s0 = lazyStaggeredGridState;
            this.f5237t0 = paddingValues;
            this.f5238u0 = z10;
            this.v0 = f6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope2, "$this$null");
            Orientation orientation = this.f5233p0;
            CheckScrollableContainerConstraintsKt.m143checkScrollableContainerConstraintsK40F9xA(f18296a, orientation);
            LazyStaggeredGridSlots lazyStaggeredGridSlotsInvoke = this.f5234q0.invoke(lazyLayoutMeasureScope2, Constraints.m4346boximpl(f18296a));
            boolean z10 = orientation == Orientation.Vertical;
            LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = this.f5235r0.invoke();
            LazyStaggeredGridState lazyStaggeredGridState = this.f5236s0;
            lazyStaggeredGridState.setSlots$foundation_release(lazyStaggeredGridSlotsInvoke);
            lazyStaggeredGridState.setVertical$foundation_release(z10);
            lazyStaggeredGridState.setSpanProvider$foundation_release(lazyStaggeredGridItemProviderInvoke.getSpanProvider());
            LayoutDirection layoutDirection = lazyLayoutMeasureScope2.getLayoutDirection();
            PaddingValues paddingValues = this.f5237t0;
            boolean z11 = this.f5238u0;
            int iMo413roundToPx0680j_4 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.access$beforePadding(paddingValues, orientation, z11, layoutDirection));
            int iMo413roundToPx0680j_5 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.access$afterPadding(paddingValues, orientation, z11, lazyLayoutMeasureScope2.getLayoutDirection()));
            int iMo413roundToPx0680j_6 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.access$startPadding(paddingValues, orientation, lazyLayoutMeasureScope2.getLayoutDirection()));
            int iM4356getMaxHeightimpl = ((z10 ? Constraints.m4356getMaxHeightimpl(f18296a) : Constraints.m4357getMaxWidthimpl(f18296a)) - iMo413roundToPx0680j_4) - iMo413roundToPx0680j_5;
            long jIntOffset = z10 ? IntOffsetKt.IntOffset(iMo413roundToPx0680j_6, iMo413roundToPx0680j_4) : IntOffsetKt.IntOffset(iMo413roundToPx0680j_4, iMo413roundToPx0680j_6);
            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM429measureStaggeredGriddSVRQoE = LazyStaggeredGridMeasureKt.m429measureStaggeredGriddSVRQoE(lazyLayoutMeasureScope2, this.f5236s0, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridSlotsInvoke, Constraints.m4349copyZbe2FdA$default(f18296a, ConstraintsKt.m4371constrainWidthK40F9xA(f18296a, lazyLayoutMeasureScope2.mo413roundToPx0680j_4(Dp.m4389constructorimpl(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection()) + PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection())))), 0, ConstraintsKt.m4370constrainHeightK40F9xA(f18296a, lazyLayoutMeasureScope2.mo413roundToPx0680j_4(Dp.m4389constructorimpl(paddingValues.getBottom() + paddingValues.getTop()))), 0, 10, null), z10, this.f5238u0, jIntOffset, iM4356getMaxHeightimpl, lazyLayoutMeasureScope2.mo413roundToPx0680j_4(this.v0), iMo413roundToPx0680j_4, iMo413roundToPx0680j_5);
            lazyStaggeredGridState.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResultM429measureStaggeredGriddSVRQoE);
            return lazyStaggeredGridMeasureResultM429measureStaggeredGriddSVRQoE;
        }
    }

    public static final float access$afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z10, LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return z10 ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i10 == 2) {
            return z10 ? PaddingKt.calculateStartPadding(paddingValues, layoutDirection) : PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float access$beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z10, LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return z10 ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i10 == 2) {
            return z10 ? PaddingKt.calculateEndPadding(paddingValues, layoutDirection) : PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float access$startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i10 == 2) {
            return paddingValues.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v10 ??, still in use, count: 1, list:
          (r9v10 ?? I:java.lang.Object) from 0x008f: INVOKE (r19v0 ?? I:androidx.compose.runtime.Composer), (r9v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:144)
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
    /* JADX INFO: renamed from: rememberStaggeredGridMeasurePolicy-nbWgWpA, reason: not valid java name */
    public static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> m430rememberStaggeredGridMeasurePolicynbWgWpA(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v10 ??, still in use, count: 1, list:
          (r9v10 ?? I:java.lang.Object) from 0x008f: INVOKE (r19v0 ?? I:androidx.compose.runtime.Composer), (r9v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:144)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
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
