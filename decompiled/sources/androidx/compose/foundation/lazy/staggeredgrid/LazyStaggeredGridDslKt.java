package androidx.compose.foundation.lazy.staggeredgrid;

import a0.c;
import a0.d;
import a0.g;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0086\u0001\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aÕ\u0001\u0010\"\u001a\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2%\b\n\u0010'\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010\u00112%\b\u0006\u0010(\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0\u00112%\b\n\u0010*\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010\u001123\b\u0004\u0010.\u001a-\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00130+¢\u0006\u0002\b-¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0002¢\u0006\u0004\b\"\u0010/\u001a©\u0002\u00103\u001a\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2:\b\n\u0010'\u001a4\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010+2:\b\u0006\u0010(\u001a4\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0+2:\b\n\u0010*\u001a4\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010+2H\b\u0004\u0010.\u001aB\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001302¢\u0006\u0002\b-¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0002¢\u0006\u0004\b3\u00104\u001aÕ\u0001\u0010\"\u001a\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u0000052%\b\n\u0010'\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010\u00112%\b\u0006\u0010(\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0\u00112%\b\n\u0010*\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010\u001123\b\u0004\u0010.\u001a-\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00130+¢\u0006\u0002\b-¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0002¢\u0006\u0004\b\"\u00106\u001a©\u0002\u00103\u001a\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u0000052:\b\n\u0010'\u001a4\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010+2:\b\u0006\u0010(\u001a4\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0+2:\b\n\u0010*\u001a4\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010+2H\b\u0004\u0010.\u001aB\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u001100¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001302¢\u0006\u0002\b-¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0002¢\u0006\u0004\b3\u00107\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "rows", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "horizontalItemSpacing", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyHorizontalStaggeredGrid", ExifInterface.GPS_DIRECTION_TRUE, "", FirebaseAnalytics.Param.ITEMS, "Lkotlin/ParameterName;", "name", AnalyticsConstants.Key.ITEM, "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,456:1\n154#2:457\n154#2:458\n154#2:459\n154#2:470\n154#2:471\n154#2:472\n67#3,3:460\n66#3:463\n67#3,3:473\n66#3:476\n1097#4,6:464\n1097#4,6:477\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n66#1:457\n68#1:458\n69#1:459\n156#1:470\n158#1:471\n159#1:472\n95#1:460,3\n95#1:463\n185#1:473,3\n185#1:476\n95#1:464,6\n185#1:477,6\n*E\n"})
public final class LazyStaggeredGridDslKt {

    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StaggeredGridCells f5120p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5121q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyStaggeredGridState f5122r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f5123s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f5124t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f5125u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f5126w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f5127x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyStaggeredGridScope, Unit> f5128y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z10, Arrangement.Vertical vertical, float f6, FlingBehavior flingBehavior, boolean z11, Function1<? super LazyStaggeredGridScope, Unit> function1, int i10, int i11) {
            super(2);
            this.f5120p0 = staggeredGridCells;
            this.f5121q0 = modifier;
            this.f5122r0 = lazyStaggeredGridState;
            this.f5123s0 = paddingValues;
            this.f5124t0 = z10;
            this.f5125u0 = vertical;
            this.v0 = f6;
            this.f5126w0 = flingBehavior;
            this.f5127x0 = z11;
            this.f5128y0 = function1;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyStaggeredGridDslKt.m419LazyHorizontalStaggeredGridcJHQLPU(this.f5120p0, this.f5121q0, this.f5122r0, this.f5123s0, this.f5124t0, this.f5125u0, this.v0, this.f5126w0, this.f5127x0, this.f5128y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StaggeredGridCells f5129p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5130q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyStaggeredGridState f5131r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f5132s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f5133t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f5134u0;
        public final /* synthetic */ Arrangement.Horizontal v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f5135w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f5136x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyStaggeredGridScope, Unit> f5137y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z10, float f6, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z11, Function1<? super LazyStaggeredGridScope, Unit> function1, int i10, int i11) {
            super(2);
            this.f5129p0 = staggeredGridCells;
            this.f5130q0 = modifier;
            this.f5131r0 = lazyStaggeredGridState;
            this.f5132s0 = paddingValues;
            this.f5133t0 = z10;
            this.f5134u0 = f6;
            this.v0 = horizontal;
            this.f5135w0 = flingBehavior;
            this.f5136x0 = z11;
            this.f5137y0 = function1;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyStaggeredGridDslKt.m420LazyVerticalStaggeredGridzadm560(this.f5129p0, this.f5130q0, this.f5131r0, this.f5132s0, this.f5133t0, this.f5134u0, this.v0, this.f5135w0, this.f5136x0, this.f5137y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> f5138p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f5139q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.f5138p0 = function4;
            this.f5139q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2101296000, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:414)");
            }
            this.f5138p0.invoke(items, this.f5139q0[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f5142p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f5143q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.f5142p0 = function1;
            this.f5143q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.f5142p0.invoke((T) this.f5143q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> f5146p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f5147q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.f5146p0 = function4;
            this.f5147q0 = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-886456479, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:336)");
            }
            this.f5146p0.invoke(items, (T) this.f5147q0.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass8 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f5150p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f5151q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.f5150p0 = function1;
            this.f5151q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Nullable
        public final Object invoke(int i10) {
            return this.f5150p0.invoke(this.f5151q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10\n*L\n1#1,456:1\n*E\n"})
    public static final class C054410 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> f5154p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f5155q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C054410(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.f5154p0 = function5;
            this.f5155q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-804487775, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:453)");
            }
            this.f5154p0.invoke(items, Integer.valueOf(i10), this.f5155q0[i10], composer, Integer.valueOf((i12 & 14) | (i12 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3\n*L\n1#1,456:1\n*E\n"})
    public static final class C05453 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f5158p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f5159q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05453(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.f5158p0 = function2;
            this.f5159q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.f5158p0.invoke(Integer.valueOf(i10), (T) this.f5159q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5\n*L\n1#1,456:1\n*E\n"})
    public static final class C05465 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> f5162p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f5163q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05465(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.f5162p0 = function5;
            this.f5163q0 = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284833944, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:375)");
            }
            this.f5162p0.invoke(items, Integer.valueOf(i10), (T) this.f5163q0.get(i10), composer, Integer.valueOf((i12 & 14) | (i12 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8\n*L\n1#1,456:1\n*E\n"})
    public static final class C05488 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f5166p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f5167q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05488(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.f5166p0 = function2;
            this.f5167q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Nullable
        public final Object invoke(int i10) {
            return this.f5166p0.invoke(Integer.valueOf(i10), this.f5167q0[i10]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0189  */
    /* JADX WARN: Code duplicated, block: B:128:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x0199  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01df  */
    /* JADX WARN: Code duplicated, block: B:150:0x0205  */
    /* JADX WARN: Code duplicated, block: B:153:0x0224  */
    /* JADX WARN: Code duplicated, block: B:155:0x022c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0244  */
    /* JADX WARN: Code duplicated, block: B:161:0x0290  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    public static final void m419LazyHorizontalStaggeredGridcJHQLPU(@NotNull StaggeredGridCells rows, @Nullable Modifier modifier, @Nullable LazyStaggeredGridState lazyStaggeredGridState, @Nullable PaddingValues paddingValues, boolean z10, @Nullable Arrangement.Vertical vertical, float f6, @Nullable FlingBehavior flingBehavior, boolean z11, @NotNull Function1<? super LazyStaggeredGridScope, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        PaddingValues paddingValues2;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        Arrangement.Vertical vertical2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        LazyStaggeredGridState lazyStaggeredGridStateRememberLazyStaggeredGridState;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        Arrangement.Vertical verticalM246spacedBy0680j_4;
        float fM4389constructorimpl;
        FlingBehavior flingBehavior2;
        boolean z13;
        LazyStaggeredGridState lazyStaggeredGridState2;
        Modifier modifier3;
        FlingBehavior flingBehavior3;
        boolean z14;
        PaddingValues paddingValues3;
        int i25;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier4;
        LazyStaggeredGridState lazyStaggeredGridState3;
        Arrangement.Vertical vertical3;
        boolean z15;
        PaddingValues paddingValues4;
        float f10;
        FlingBehavior flingBehavior4;
        boolean z16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-8666074);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(rows) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i26 = i11 & 2;
        if (i26 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 57344) == 0) {
                        z12 = z10;
                        if (composerStartRestartGroup.changed(z12)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(vertical2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                    }
                    i22 = i11 & 256;
                    if (i22 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z11)) {
                            i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i23 = 33554432;
                        }
                        i12 |= i23;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i24 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i24 = 268435456;
                            }
                        }
                        if (i13 != 4 && (1533916891 & i12) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            lazyStaggeredGridState3 = lazyStaggeredGridState;
                            f10 = f6;
                            flingBehavior4 = flingBehavior;
                            modifier4 = modifier2;
                            paddingValues4 = paddingValues2;
                            vertical3 = vertical2;
                            z15 = z12;
                            z16 = z11;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i26 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                                }
                                if (i14 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i16 != 0) {
                                    z12 = false;
                                }
                                if (i18 != 0) {
                                    verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    verticalM246spacedBy0680j_4 = vertical2;
                                }
                                if (i20 != 0) {
                                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                                } else {
                                    fM4389constructorimpl = f6;
                                }
                                if ((i11 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i12 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i22 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z11;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                                modifier3 = modifier2;
                                vertical2 = verticalM246spacedBy0680j_4;
                                flingBehavior3 = flingBehavior2;
                                z14 = z12;
                                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i13 != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                                fM4389constructorimpl = f6;
                                flingBehavior3 = flingBehavior;
                                z13 = z11;
                                modifier3 = modifier2;
                                z14 = z12;
                                paddingValues3 = paddingValues2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                            }
                            Orientation orientation = Orientation.Horizontal;
                            float spacing = vertical2.getSpacing();
                            int i27 = i12 >> 3;
                            i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i27 & 896);
                            composerStartRestartGroup.startReplaceableGroup(-675899235);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function2 function2 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i28 = i12 << 6;
                            int i29 = i12 << 3;
                            Arrangement.Vertical vertical4 = vertical2;
                            PaddingValues paddingValues5 = paddingValues3;
                            LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation, function2, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing, content, composerStartRestartGroup, (i27 & 29360128) | (i28 & 7168) | 56 | (57344 & i29) | (i29 & 458752) | (i27 & 3670016) | (i28 & 234881024), (i12 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            vertical3 = vertical4;
                            z15 = z14;
                            paddingValues4 = paddingValues5;
                            f10 = fM4389constructorimpl;
                            flingBehavior4 = flingBehavior3;
                            z16 = z13;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
                    }
                    i24 = 805306368;
                    i12 |= i24;
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation2 = Orientation.Horizontal;
                        float spacing2 = vertical2.getSpacing();
                        int i210 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i210 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function3 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i211 = i12 << 6;
                        int i212 = i12 << 3;
                        Arrangement.Vertical vertical5 = vertical2;
                        PaddingValues paddingValues6 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation2, function3, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing2, content, composerStartRestartGroup, (i210 & 29360128) | (i211 & 7168) | 56 | (57344 & i212) | (i212 & 458752) | (i210 & 3670016) | (i211 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical5;
                        z15 = z14;
                        paddingValues4 = paddingValues6;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation3 = Orientation.Horizontal;
                        float spacing3 = vertical2.getSpacing();
                        int i213 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i213 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function4 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i214 = i12 << 6;
                        int i215 = i12 << 3;
                        Arrangement.Vertical vertical6 = vertical2;
                        PaddingValues paddingValues7 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation3, function4, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing3, content, composerStartRestartGroup, (i213 & 29360128) | (i214 & 7168) | 56 | (57344 & i215) | (i215 & 458752) | (i213 & 3670016) | (i214 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical6;
                        z15 = z14;
                        paddingValues4 = paddingValues7;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
                }
                i12 |= 24576;
                z12 = z10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i22 = i11 & 256;
                if (i22 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i12 |= i23;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                    }
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation4 = Orientation.Horizontal;
                        float spacing4 = vertical2.getSpacing();
                        int i216 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i216 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function5 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i217 = i12 << 6;
                        int i218 = i12 << 3;
                        Arrangement.Vertical vertical7 = vertical2;
                        PaddingValues paddingValues8 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation4, function5, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing4, content, composerStartRestartGroup, (i216 & 29360128) | (i217 & 7168) | 56 | (57344 & i218) | (i218 & 458752) | (i216 & 3670016) | (i217 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical7;
                        z15 = z14;
                        paddingValues4 = paddingValues8;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation5 = Orientation.Horizontal;
                        float spacing5 = vertical2.getSpacing();
                        int i219 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i219 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function6 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2110 = i12 << 6;
                        int i2111 = i12 << 3;
                        Arrangement.Vertical vertical8 = vertical2;
                        PaddingValues paddingValues9 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation5, function6, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing5, content, composerStartRestartGroup, (i219 & 29360128) | (i2110 & 7168) | 56 | (57344 & i2111) | (i2111 & 458752) | (i219 & 3670016) | (i2110 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical8;
                        z15 = z14;
                        paddingValues4 = paddingValues9;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
                }
                i24 = 805306368;
                i12 |= i24;
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation6 = Orientation.Horizontal;
                    float spacing6 = vertical2.getSpacing();
                    int i2112 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2112 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function7 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2113 = i12 << 6;
                    int i2114 = i12 << 3;
                    Arrangement.Vertical vertical9 = vertical2;
                    PaddingValues paddingValues10 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation6, function7, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing6, content, composerStartRestartGroup, (i2112 & 29360128) | (i2113 & 7168) | 56 | (57344 & i2114) | (i2114 & 458752) | (i2112 & 3670016) | (i2113 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical9;
                    z15 = z14;
                    paddingValues4 = paddingValues10;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation7 = Orientation.Horizontal;
                    float spacing7 = vertical2.getSpacing();
                    int i2115 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2115 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function8 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2116 = i12 << 6;
                    int i2117 = i12 << 3;
                    Arrangement.Vertical vertical10 = vertical2;
                    PaddingValues paddingValues11 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation7, function8, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing7, content, composerStartRestartGroup, (i2115 & 29360128) | (i2116 & 7168) | 56 | (57344 & i2117) | (i2117 & 458752) | (i2115 & 3670016) | (i2116 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical10;
                    z15 = z14;
                    paddingValues4 = paddingValues11;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
            }
            i12 |= 3072;
            paddingValues2 = paddingValues;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i22 = i11 & 256;
                if (i22 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i12 |= i23;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                    }
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation8 = Orientation.Horizontal;
                        float spacing8 = vertical2.getSpacing();
                        int i2118 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2118 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function9 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2119 = i12 << 6;
                        int i21110 = i12 << 3;
                        Arrangement.Vertical vertical11 = vertical2;
                        PaddingValues paddingValues12 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation8, function9, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing8, content, composerStartRestartGroup, (i2118 & 29360128) | (i2119 & 7168) | 56 | (57344 & i21110) | (i21110 & 458752) | (i2118 & 3670016) | (i2119 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical11;
                        z15 = z14;
                        paddingValues4 = paddingValues12;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation9 = Orientation.Horizontal;
                        float spacing9 = vertical2.getSpacing();
                        int i21111 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21111 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function10 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21112 = i12 << 6;
                        int i21113 = i12 << 3;
                        Arrangement.Vertical vertical12 = vertical2;
                        PaddingValues paddingValues13 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation9, function10, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing9, content, composerStartRestartGroup, (i21111 & 29360128) | (i21112 & 7168) | 56 | (57344 & i21113) | (i21113 & 458752) | (i21111 & 3670016) | (i21112 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical12;
                        z15 = z14;
                        paddingValues4 = paddingValues13;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
                }
                i24 = 805306368;
                i12 |= i24;
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation10 = Orientation.Horizontal;
                    float spacing10 = vertical2.getSpacing();
                    int i21114 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21114 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function11 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21115 = i12 << 6;
                    int i21116 = i12 << 3;
                    Arrangement.Vertical vertical13 = vertical2;
                    PaddingValues paddingValues14 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation10, function11, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing10, content, composerStartRestartGroup, (i21114 & 29360128) | (i21115 & 7168) | 56 | (57344 & i21116) | (i21116 & 458752) | (i21114 & 3670016) | (i21115 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical13;
                    z15 = z14;
                    paddingValues4 = paddingValues14;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation11 = Orientation.Horizontal;
                    float spacing11 = vertical2.getSpacing();
                    int i21117 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21117 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function12 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21118 = i12 << 6;
                    int i21119 = i12 << 3;
                    Arrangement.Vertical vertical14 = vertical2;
                    PaddingValues paddingValues15 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation11, function12, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing11, content, composerStartRestartGroup, (i21117 & 29360128) | (i21118 & 7168) | 56 | (57344 & i21119) | (i21119 & 458752) | (i21117 & 3670016) | (i21118 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical14;
                    z15 = z14;
                    paddingValues4 = paddingValues15;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
            }
            i12 |= 24576;
            z12 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i22 = i11 & 256;
            if (i22 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i12 |= i23;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation12 = Orientation.Horizontal;
                    float spacing12 = vertical2.getSpacing();
                    int i211110 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211110 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function13 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211111 = i12 << 6;
                    int i211112 = i12 << 3;
                    Arrangement.Vertical vertical15 = vertical2;
                    PaddingValues paddingValues16 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation12, function13, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing12, content, composerStartRestartGroup, (i211110 & 29360128) | (i211111 & 7168) | 56 | (57344 & i211112) | (i211112 & 458752) | (i211110 & 3670016) | (i211111 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical15;
                    z15 = z14;
                    paddingValues4 = paddingValues16;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation13 = Orientation.Horizontal;
                    float spacing13 = vertical2.getSpacing();
                    int i211113 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211113 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function14 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211114 = i12 << 6;
                    int i211115 = i12 << 3;
                    Arrangement.Vertical vertical16 = vertical2;
                    PaddingValues paddingValues17 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation13, function14, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing13, content, composerStartRestartGroup, (i211113 & 29360128) | (i211114 & 7168) | 56 | (57344 & i211115) | (i211115 & 458752) | (i211113 & 3670016) | (i211114 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical16;
                    z15 = z14;
                    paddingValues4 = paddingValues17;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
            }
            i24 = 805306368;
            i12 |= i24;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation14 = Orientation.Horizontal;
                float spacing14 = vertical2.getSpacing();
                int i211116 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211116 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function15 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211117 = i12 << 6;
                int i211118 = i12 << 3;
                Arrangement.Vertical vertical17 = vertical2;
                PaddingValues paddingValues18 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation14, function15, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing14, content, composerStartRestartGroup, (i211116 & 29360128) | (i211117 & 7168) | 56 | (57344 & i211118) | (i211118 & 458752) | (i211116 & 3670016) | (i211117 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical17;
                z15 = z14;
                paddingValues4 = paddingValues18;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation15 = Orientation.Horizontal;
                float spacing15 = vertical2.getSpacing();
                int i211119 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211119 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function16 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111110 = i12 << 6;
                int i2111111 = i12 << 3;
                Arrangement.Vertical vertical18 = vertical2;
                PaddingValues paddingValues19 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation15, function16, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing15, content, composerStartRestartGroup, (i211119 & 29360128) | (i2111110 & 7168) | 56 | (57344 & i2111111) | (i2111111 & 458752) | (i211119 & 3670016) | (i2111110 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical18;
                z15 = z14;
                paddingValues4 = paddingValues19;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i22 = i11 & 256;
                if (i22 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i12 |= i23;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                    }
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation16 = Orientation.Horizontal;
                        float spacing16 = vertical2.getSpacing();
                        int i2111112 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2111112 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function17 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2111113 = i12 << 6;
                        int i2111114 = i12 << 3;
                        Arrangement.Vertical vertical19 = vertical2;
                        PaddingValues paddingValues110 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation16, function17, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing16, content, composerStartRestartGroup, (i2111112 & 29360128) | (i2111113 & 7168) | 56 | (57344 & i2111114) | (i2111114 & 458752) | (i2111112 & 3670016) | (i2111113 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical19;
                        z15 = z14;
                        paddingValues4 = paddingValues110;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                verticalM246spacedBy0680j_4 = vertical2;
                            }
                            if (i20 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f6;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM246spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        Orientation orientation17 = Orientation.Horizontal;
                        float spacing17 = vertical2.getSpacing();
                        int i2111115 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2111115 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-675899235);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function18 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2111116 = i12 << 6;
                        int i2111117 = i12 << 3;
                        Arrangement.Vertical vertical110 = vertical2;
                        PaddingValues paddingValues111 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation17, function18, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing17, content, composerStartRestartGroup, (i2111115 & 29360128) | (i2111116 & 7168) | 56 | (57344 & i2111117) | (i2111117 & 458752) | (i2111115 & 3670016) | (i2111116 & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical110;
                        z15 = z14;
                        paddingValues4 = paddingValues111;
                        f10 = fM4389constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
                }
                i24 = 805306368;
                i12 |= i24;
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation18 = Orientation.Horizontal;
                    float spacing18 = vertical2.getSpacing();
                    int i2111118 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2111118 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function19 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111119 = i12 << 6;
                    int i21111110 = i12 << 3;
                    Arrangement.Vertical vertical111 = vertical2;
                    PaddingValues paddingValues112 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation18, function19, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing18, content, composerStartRestartGroup, (i2111118 & 29360128) | (i2111119 & 7168) | 56 | (57344 & i21111110) | (i21111110 & 458752) | (i2111118 & 3670016) | (i2111119 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical111;
                    z15 = z14;
                    paddingValues4 = paddingValues112;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation19 = Orientation.Horizontal;
                    float spacing19 = vertical2.getSpacing();
                    int i21111111 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21111111 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function110 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21111112 = i12 << 6;
                    int i21111113 = i12 << 3;
                    Arrangement.Vertical vertical112 = vertical2;
                    PaddingValues paddingValues113 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation19, function110, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing19, content, composerStartRestartGroup, (i21111111 & 29360128) | (i21111112 & 7168) | 56 | (57344 & i21111113) | (i21111113 & 458752) | (i21111111 & 3670016) | (i21111112 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical112;
                    z15 = z14;
                    paddingValues4 = paddingValues113;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
            }
            i12 |= 24576;
            z12 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i22 = i11 & 256;
            if (i22 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i12 |= i23;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation110 = Orientation.Horizontal;
                    float spacing110 = vertical2.getSpacing();
                    int i21111114 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21111114 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function111 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21111115 = i12 << 6;
                    int i21111116 = i12 << 3;
                    Arrangement.Vertical vertical113 = vertical2;
                    PaddingValues paddingValues114 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation110, function111, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing110, content, composerStartRestartGroup, (i21111114 & 29360128) | (i21111115 & 7168) | 56 | (57344 & i21111116) | (i21111116 & 458752) | (i21111114 & 3670016) | (i21111115 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical113;
                    z15 = z14;
                    paddingValues4 = paddingValues114;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation111 = Orientation.Horizontal;
                    float spacing111 = vertical2.getSpacing();
                    int i21111117 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21111117 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function112 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21111118 = i12 << 6;
                    int i21111119 = i12 << 3;
                    Arrangement.Vertical vertical114 = vertical2;
                    PaddingValues paddingValues115 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation111, function112, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing111, content, composerStartRestartGroup, (i21111117 & 29360128) | (i21111118 & 7168) | 56 | (57344 & i21111119) | (i21111119 & 458752) | (i21111117 & 3670016) | (i21111118 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical114;
                    z15 = z14;
                    paddingValues4 = paddingValues115;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
            }
            i24 = 805306368;
            i12 |= i24;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation112 = Orientation.Horizontal;
                float spacing112 = vertical2.getSpacing();
                int i211111110 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211111110 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function113 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211111111 = i12 << 6;
                int i211111112 = i12 << 3;
                Arrangement.Vertical vertical115 = vertical2;
                PaddingValues paddingValues116 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation112, function113, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing112, content, composerStartRestartGroup, (i211111110 & 29360128) | (i211111111 & 7168) | 56 | (57344 & i211111112) | (i211111112 & 458752) | (i211111110 & 3670016) | (i211111111 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical115;
                z15 = z14;
                paddingValues4 = paddingValues116;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation113 = Orientation.Horizontal;
                float spacing113 = vertical2.getSpacing();
                int i211111113 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211111113 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function114 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211111114 = i12 << 6;
                int i211111115 = i12 << 3;
                Arrangement.Vertical vertical116 = vertical2;
                PaddingValues paddingValues117 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation113, function114, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing113, content, composerStartRestartGroup, (i211111113 & 29360128) | (i211111114 & 7168) | 56 | (57344 & i211111115) | (i211111115 & 458752) | (i211111113 & 3670016) | (i211111114 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical116;
                z15 = z14;
                paddingValues4 = paddingValues117;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
        }
        i12 |= 3072;
        paddingValues2 = paddingValues;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 57344) == 0) {
                z12 = z10;
                if (composerStartRestartGroup.changed(z12)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i22 = i11 & 256;
            if (i22 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i12 |= i23;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation114 = Orientation.Horizontal;
                    float spacing114 = vertical2.getSpacing();
                    int i211111116 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211111116 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function115 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211111117 = i12 << 6;
                    int i211111118 = i12 << 3;
                    Arrangement.Vertical vertical117 = vertical2;
                    PaddingValues paddingValues118 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation114, function115, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing114, content, composerStartRestartGroup, (i211111116 & 29360128) | (i211111117 & 7168) | 56 | (57344 & i211111118) | (i211111118 & 458752) | (i211111116 & 3670016) | (i211111117 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical117;
                    z15 = z14;
                    paddingValues4 = paddingValues118;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            verticalM246spacedBy0680j_4 = vertical2;
                        }
                        if (i20 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM246spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    Orientation orientation115 = Orientation.Horizontal;
                    float spacing115 = vertical2.getSpacing();
                    int i211111119 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i211111119 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-675899235);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function116 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111111110 = i12 << 6;
                    int i2111111111 = i12 << 3;
                    Arrangement.Vertical vertical118 = vertical2;
                    PaddingValues paddingValues119 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation115, function116, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing115, content, composerStartRestartGroup, (i211111119 & 29360128) | (i2111111110 & 7168) | 56 | (57344 & i2111111111) | (i2111111111 & 458752) | (i211111119 & 3670016) | (i2111111110 & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical118;
                    z15 = z14;
                    paddingValues4 = paddingValues119;
                    f10 = fM4389constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
            }
            i24 = 805306368;
            i12 |= i24;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation116 = Orientation.Horizontal;
                float spacing116 = vertical2.getSpacing();
                int i2111111112 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2111111112 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function117 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111111113 = i12 << 6;
                int i2111111114 = i12 << 3;
                Arrangement.Vertical vertical119 = vertical2;
                PaddingValues paddingValues1110 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation116, function117, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing116, content, composerStartRestartGroup, (i2111111112 & 29360128) | (i2111111113 & 7168) | 56 | (57344 & i2111111114) | (i2111111114 & 458752) | (i2111111112 & 3670016) | (i2111111113 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical119;
                z15 = z14;
                paddingValues4 = paddingValues1110;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation117 = Orientation.Horizontal;
                float spacing117 = vertical2.getSpacing();
                int i2111111115 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2111111115 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function118 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111111116 = i12 << 6;
                int i2111111117 = i12 << 3;
                Arrangement.Vertical vertical1110 = vertical2;
                PaddingValues paddingValues1111 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation117, function118, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing117, content, composerStartRestartGroup, (i2111111115 & 29360128) | (i2111111116 & 7168) | 56 | (57344 & i2111111117) | (i2111111117 & 458752) | (i2111111115 & 3670016) | (i2111111116 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical1110;
                z15 = z14;
                paddingValues4 = paddingValues1111;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
        }
        i12 |= 24576;
        z12 = z10;
        i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            vertical2 = vertical;
        } else {
            vertical2 = vertical;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        i20 = i11 & 64;
        if (i20 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i12 |= i21;
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
        }
        i22 = i11 & 256;
        if (i22 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i23 = 33554432;
            }
            i12 |= i23;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
            }
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation118 = Orientation.Horizontal;
                float spacing118 = vertical2.getSpacing();
                int i2111111118 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i2111111118 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function119 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111111119 = i12 << 6;
                int i21111111110 = i12 << 3;
                Arrangement.Vertical vertical1111 = vertical2;
                PaddingValues paddingValues1112 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation118, function119, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing118, content, composerStartRestartGroup, (i2111111118 & 29360128) | (i2111111119 & 7168) | 56 | (57344 & i21111111110) | (i21111111110 & 458752) | (i2111111118 & 3670016) | (i2111111119 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical1111;
                z15 = z14;
                paddingValues4 = paddingValues1112;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        verticalM246spacedBy0680j_4 = vertical2;
                    }
                    if (i20 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM246spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                Orientation orientation119 = Orientation.Horizontal;
                float spacing119 = vertical2.getSpacing();
                int i21111111111 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21111111111 & 896);
                composerStartRestartGroup.startReplaceableGroup(-675899235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function1110 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111111112 = i12 << 6;
                int i21111111113 = i12 << 3;
                Arrangement.Vertical vertical1112 = vertical2;
                PaddingValues paddingValues1113 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation119, function1110, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing119, content, composerStartRestartGroup, (i21111111111 & 29360128) | (i21111111112 & 7168) | 56 | (57344 & i21111111113) | (i21111111113 & 458752) | (i21111111111 & 3670016) | (i21111111112 & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical1112;
                z15 = z14;
                paddingValues4 = paddingValues1113;
                f10 = fM4389constructorimpl;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
        }
        i24 = 805306368;
        i12 |= i24;
        if (i13 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    verticalM246spacedBy0680j_4 = vertical2;
                }
                if (i20 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f6;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM246spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            } else {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    verticalM246spacedBy0680j_4 = vertical2;
                }
                if (i20 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f6;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM246spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
            }
            Orientation orientation1110 = Orientation.Horizontal;
            float spacing1110 = vertical2.getSpacing();
            int i21111111114 = i12 >> 3;
            i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21111111114 & 896);
            composerStartRestartGroup.startReplaceableGroup(-675899235);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1111 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111111115 = i12 << 6;
            int i21111111116 = i12 << 3;
            Arrangement.Vertical vertical1113 = vertical2;
            PaddingValues paddingValues1114 = paddingValues3;
            LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation1110, function1111, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing1110, content, composerStartRestartGroup, (i21111111114 & 29360128) | (i21111111115 & 7168) | 56 | (57344 & i21111111116) | (i21111111116 & 458752) | (i21111111114 & 3670016) | (i21111111115 & 234881024), (i12 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            vertical3 = vertical1113;
            z15 = z14;
            paddingValues4 = paddingValues1114;
            f10 = fM4389constructorimpl;
            flingBehavior4 = flingBehavior3;
            z16 = z13;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    verticalM246spacedBy0680j_4 = vertical2;
                }
                if (i20 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f6;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM246spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            } else {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    verticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    verticalM246spacedBy0680j_4 = vertical2;
                }
                if (i20 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f6;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM246spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8666074, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
            }
            Orientation orientation1111 = Orientation.Horizontal;
            float spacing1111 = vertical2.getSpacing();
            int i21111111117 = i12 >> 3;
            i25 = (i12 & 14) | ((i12 >> 12) & 112) | (i21111111117 & 896);
            composerStartRestartGroup.startReplaceableGroup(-675899235);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-675899235, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical2) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new g(new d(paddingValues3, rows, vertical2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1112 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111111118 = i12 << 6;
            int i21111111119 = i12 << 3;
            Arrangement.Vertical vertical1114 = vertical2;
            PaddingValues paddingValues1115 = paddingValues3;
            LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation1111, function1112, modifier3, paddingValues3, z14, flingBehavior3, z13, fM4389constructorimpl, spacing1111, content, composerStartRestartGroup, (i21111111117 & 29360128) | (i21111111118 & 7168) | 56 | (57344 & i21111111119) | (i21111111119 & 458752) | (i21111111117 & 3670016) | (i21111111118 & 234881024), (i12 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            vertical3 = vertical1114;
            z15 = z14;
            paddingValues4 = paddingValues1115;
            f10 = fM4389constructorimpl;
            flingBehavior4 = flingBehavior3;
            z16 = z13;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z15, vertical3, f10, flingBehavior4, z16, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0187  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0195  */
    /* JADX WARN: Code duplicated, block: B:130:0x0198  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:150:0x0206  */
    /* JADX WARN: Code duplicated, block: B:153:0x0225  */
    /* JADX WARN: Code duplicated, block: B:155:0x022d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:161:0x0293  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    public static final void m420LazyVerticalStaggeredGridzadm560(@NotNull StaggeredGridCells columns, @Nullable Modifier modifier, @Nullable LazyStaggeredGridState lazyStaggeredGridState, @Nullable PaddingValues paddingValues, boolean z10, float f6, @Nullable Arrangement.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, boolean z11, @NotNull Function1<? super LazyStaggeredGridScope, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        PaddingValues paddingValues2;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        float f10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        LazyStaggeredGridState lazyStaggeredGridStateRememberLazyStaggeredGridState;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        float fM4389constructorimpl;
        Arrangement.Horizontal horizontalM246spacedBy0680j_4;
        FlingBehavior flingBehavior2;
        boolean z13;
        LazyStaggeredGridState lazyStaggeredGridState2;
        Modifier modifier3;
        float f11;
        FlingBehavior flingBehavior3;
        boolean z14;
        PaddingValues paddingValues3;
        int i25;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier4;
        LazyStaggeredGridState lazyStaggeredGridState3;
        Arrangement.Horizontal horizontal2;
        boolean z15;
        PaddingValues paddingValues4;
        float f12;
        FlingBehavior flingBehavior4;
        boolean z16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1695323794);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(columns) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i26 = i11 & 2;
        if (i26 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 57344) == 0) {
                        z12 = z10;
                        if (composerStartRestartGroup.changed(z12)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f10 = f6;
                    } else {
                        f10 = f6;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(f10)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                    }
                    i22 = i11 & 256;
                    if (i22 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z11)) {
                            i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i23 = 33554432;
                        }
                        i12 |= i23;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i24 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i24 = 268435456;
                            }
                        }
                        if (i13 != 4 && (1533916891 & i12) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            lazyStaggeredGridState3 = lazyStaggeredGridState;
                            horizontal2 = horizontal;
                            flingBehavior4 = flingBehavior;
                            modifier4 = modifier2;
                            paddingValues4 = paddingValues2;
                            f12 = f10;
                            z15 = z12;
                            z16 = z11;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i26 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                                }
                                if (i14 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i16 != 0) {
                                    z12 = false;
                                }
                                if (i18 != 0) {
                                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                                } else {
                                    fM4389constructorimpl = f10;
                                }
                                if (i20 != 0) {
                                    horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    horizontalM246spacedBy0680j_4 = horizontal;
                                }
                                if ((i11 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i12 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i22 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z11;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                                modifier3 = modifier2;
                                f11 = fM4389constructorimpl;
                                flingBehavior3 = flingBehavior2;
                                z14 = z12;
                                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i13 != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                                flingBehavior3 = flingBehavior;
                                z13 = z11;
                                modifier3 = modifier2;
                                f11 = f10;
                                z14 = z12;
                                horizontalM246spacedBy0680j_4 = horizontal;
                                paddingValues3 = paddingValues2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                            }
                            Orientation orientation = Orientation.Vertical;
                            float spacing = horizontalM246spacedBy0680j_4.getSpacing();
                            int i27 = i12 >> 3;
                            i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i27 & 896);
                            composerStartRestartGroup.startReplaceableGroup(-1038659655);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function2 function2 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i28 = i12 << 3;
                            Arrangement.Horizontal horizontal3 = horizontalM246spacedBy0680j_4;
                            PaddingValues paddingValues5 = paddingValues3;
                            LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation, function2, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i28) | (i28 & 458752) | (i27 & 3670016) | (i27 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            horizontal2 = horizontal3;
                            z15 = z14;
                            paddingValues4 = paddingValues5;
                            f12 = f11;
                            flingBehavior4 = flingBehavior3;
                            z16 = z13;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
                    }
                    i24 = 805306368;
                    i12 |= i24;
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation2 = Orientation.Vertical;
                        float spacing2 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i29 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i29 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function3 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i210 = i12 << 3;
                        Arrangement.Horizontal horizontal4 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues6 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation2, function3, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing2, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i210) | (i210 & 458752) | (i29 & 3670016) | (i29 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal4;
                        z15 = z14;
                        paddingValues4 = paddingValues6;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation3 = Orientation.Vertical;
                        float spacing3 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i211 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i211 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function4 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i212 = i12 << 3;
                        Arrangement.Horizontal horizontal5 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues7 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation3, function4, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing3, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i212) | (i212 & 458752) | (i211 & 3670016) | (i211 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal5;
                        z15 = z14;
                        paddingValues4 = paddingValues7;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
                }
                i12 |= 24576;
                z12 = z10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i22 = i11 & 256;
                if (i22 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i12 |= i23;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                    }
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation4 = Orientation.Vertical;
                        float spacing4 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i213 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i213 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function5 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i214 = i12 << 3;
                        Arrangement.Horizontal horizontal6 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues8 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation4, function5, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing4, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i214) | (i214 & 458752) | (i213 & 3670016) | (i213 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal6;
                        z15 = z14;
                        paddingValues4 = paddingValues8;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation5 = Orientation.Vertical;
                        float spacing5 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i215 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i215 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function6 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i216 = i12 << 3;
                        Arrangement.Horizontal horizontal7 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues9 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation5, function6, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing5, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i216) | (i216 & 458752) | (i215 & 3670016) | (i215 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal7;
                        z15 = z14;
                        paddingValues4 = paddingValues9;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
                }
                i24 = 805306368;
                i12 |= i24;
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation6 = Orientation.Vertical;
                    float spacing6 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i217 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i217 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function7 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i218 = i12 << 3;
                    Arrangement.Horizontal horizontal8 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues10 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation6, function7, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing6, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i218) | (i218 & 458752) | (i217 & 3670016) | (i217 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal8;
                    z15 = z14;
                    paddingValues4 = paddingValues10;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation7 = Orientation.Vertical;
                    float spacing7 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i219 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i219 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function8 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2110 = i12 << 3;
                    Arrangement.Horizontal horizontal9 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues11 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation7, function8, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing7, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2110) | (i2110 & 458752) | (i219 & 3670016) | (i219 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal9;
                    z15 = z14;
                    paddingValues4 = paddingValues11;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
            }
            i12 |= 3072;
            paddingValues2 = paddingValues;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i22 = i11 & 256;
                if (i22 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i12 |= i23;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                    }
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation8 = Orientation.Vertical;
                        float spacing8 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i2111 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2111 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function9 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2112 = i12 << 3;
                        Arrangement.Horizontal horizontal10 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues12 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation8, function9, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing8, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2112) | (i2112 & 458752) | (i2111 & 3670016) | (i2111 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal10;
                        z15 = z14;
                        paddingValues4 = paddingValues12;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation9 = Orientation.Vertical;
                        float spacing9 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i2113 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2113 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function10 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2114 = i12 << 3;
                        Arrangement.Horizontal horizontal11 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues13 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation9, function10, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing9, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2114) | (i2114 & 458752) | (i2113 & 3670016) | (i2113 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal11;
                        z15 = z14;
                        paddingValues4 = paddingValues13;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
                }
                i24 = 805306368;
                i12 |= i24;
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation10 = Orientation.Vertical;
                    float spacing10 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i2115 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2115 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function11 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2116 = i12 << 3;
                    Arrangement.Horizontal horizontal12 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues14 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation10, function11, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing10, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2116) | (i2116 & 458752) | (i2115 & 3670016) | (i2115 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal12;
                    z15 = z14;
                    paddingValues4 = paddingValues14;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation11 = Orientation.Vertical;
                    float spacing11 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i2117 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2117 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function12 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2118 = i12 << 3;
                    Arrangement.Horizontal horizontal13 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues15 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation11, function12, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing11, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2118) | (i2118 & 458752) | (i2117 & 3670016) | (i2117 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal13;
                    z15 = z14;
                    paddingValues4 = paddingValues15;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
            }
            i12 |= 24576;
            z12 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i22 = i11 & 256;
            if (i22 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i12 |= i23;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation12 = Orientation.Vertical;
                    float spacing12 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i2119 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2119 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function13 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21110 = i12 << 3;
                    Arrangement.Horizontal horizontal14 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues16 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation12, function13, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing12, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21110) | (i21110 & 458752) | (i2119 & 3670016) | (i2119 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal14;
                    z15 = z14;
                    paddingValues4 = paddingValues16;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation13 = Orientation.Vertical;
                    float spacing13 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i21111 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21111 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function14 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21112 = i12 << 3;
                    Arrangement.Horizontal horizontal15 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues17 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation13, function14, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing13, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21112) | (i21112 & 458752) | (i21111 & 3670016) | (i21111 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal15;
                    z15 = z14;
                    paddingValues4 = paddingValues17;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
            }
            i24 = 805306368;
            i12 |= i24;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation14 = Orientation.Vertical;
                float spacing14 = horizontalM246spacedBy0680j_4.getSpacing();
                int i21113 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21113 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function15 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21114 = i12 << 3;
                Arrangement.Horizontal horizontal16 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues18 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation14, function15, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing14, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21114) | (i21114 & 458752) | (i21113 & 3670016) | (i21113 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal16;
                z15 = z14;
                paddingValues4 = paddingValues18;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation15 = Orientation.Vertical;
                float spacing15 = horizontalM246spacedBy0680j_4.getSpacing();
                int i21115 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21115 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function16 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21116 = i12 << 3;
                Arrangement.Horizontal horizontal17 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues19 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation15, function16, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing15, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21116) | (i21116 & 458752) | (i21115 & 3670016) | (i21115 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal17;
                z15 = z14;
                paddingValues4 = paddingValues19;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i22 = i11 & 256;
                if (i22 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i12 |= i23;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                    }
                    if (i13 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation16 = Orientation.Vertical;
                        float spacing16 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i21117 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21117 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function17 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21118 = i12 << 3;
                        Arrangement.Horizontal horizontal18 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues110 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation16, function17, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing16, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21118) | (i21118 & 458752) | (i21117 & 3670016) | (i21117 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal18;
                        z15 = z14;
                        paddingValues4 = paddingValues110;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        } else {
                            if (i26 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i14 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i20 != 0) {
                                horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                horizontalM246spacedBy0680j_4 = horizontal;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i22 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z14 = z12;
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        Orientation orientation17 = Orientation.Vertical;
                        float spacing17 = horizontalM246spacedBy0680j_4.getSpacing();
                        int i21119 = i12 >> 3;
                        i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21119 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1038659655);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function18 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i211110 = i12 << 3;
                        Arrangement.Horizontal horizontal19 = horizontalM246spacedBy0680j_4;
                        PaddingValues paddingValues111 = paddingValues3;
                        LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation17, function18, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing17, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i211110) | (i211110 & 458752) | (i21119 & 3670016) | (i21119 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal19;
                        z15 = z14;
                        paddingValues4 = paddingValues111;
                        f12 = f11;
                        flingBehavior4 = flingBehavior3;
                        z16 = z13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
                }
                i24 = 805306368;
                i12 |= i24;
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation18 = Orientation.Vertical;
                    float spacing18 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i211111 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i211111 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function19 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211112 = i12 << 3;
                    Arrangement.Horizontal horizontal110 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues112 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation18, function19, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing18, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i211112) | (i211112 & 458752) | (i211111 & 3670016) | (i211111 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal110;
                    z15 = z14;
                    paddingValues4 = paddingValues112;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation19 = Orientation.Vertical;
                    float spacing19 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i211113 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i211113 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function110 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211114 = i12 << 3;
                    Arrangement.Horizontal horizontal111 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues113 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation19, function110, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing19, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i211114) | (i211114 & 458752) | (i211113 & 3670016) | (i211113 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal111;
                    z15 = z14;
                    paddingValues4 = paddingValues113;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
            }
            i12 |= 24576;
            z12 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i22 = i11 & 256;
            if (i22 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i12 |= i23;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation110 = Orientation.Vertical;
                    float spacing110 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i211115 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i211115 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function111 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211116 = i12 << 3;
                    Arrangement.Horizontal horizontal112 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues114 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation110, function111, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing110, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i211116) | (i211116 & 458752) | (i211115 & 3670016) | (i211115 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal112;
                    z15 = z14;
                    paddingValues4 = paddingValues114;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation111 = Orientation.Vertical;
                    float spacing111 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i211117 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i211117 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function112 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211118 = i12 << 3;
                    Arrangement.Horizontal horizontal113 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues115 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation111, function112, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing111, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i211118) | (i211118 & 458752) | (i211117 & 3670016) | (i211117 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal113;
                    z15 = z14;
                    paddingValues4 = paddingValues115;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
            }
            i24 = 805306368;
            i12 |= i24;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation112 = Orientation.Vertical;
                float spacing112 = horizontalM246spacedBy0680j_4.getSpacing();
                int i211119 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i211119 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function113 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111110 = i12 << 3;
                Arrangement.Horizontal horizontal114 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues116 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation112, function113, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing112, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2111110) | (i2111110 & 458752) | (i211119 & 3670016) | (i211119 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal114;
                z15 = z14;
                paddingValues4 = paddingValues116;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation113 = Orientation.Vertical;
                float spacing113 = horizontalM246spacedBy0680j_4.getSpacing();
                int i2111111 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2111111 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function114 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111112 = i12 << 3;
                Arrangement.Horizontal horizontal115 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues117 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation113, function114, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing113, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2111112) | (i2111112 & 458752) | (i2111111 & 3670016) | (i2111111 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal115;
                z15 = z14;
                paddingValues4 = paddingValues117;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
        }
        i12 |= 3072;
        paddingValues2 = paddingValues;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 57344) == 0) {
                z12 = z10;
                if (composerStartRestartGroup.changed(z12)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i22 = i11 & 256;
            if (i22 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i12 |= i23;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation114 = Orientation.Vertical;
                    float spacing114 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i2111113 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2111113 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function115 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111114 = i12 << 3;
                    Arrangement.Horizontal horizontal116 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues118 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation114, function115, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing114, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2111114) | (i2111114 & 458752) | (i2111113 & 3670016) | (i2111113 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal116;
                    z15 = z14;
                    paddingValues4 = paddingValues118;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    } else {
                        if (i26 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i14 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i20 != 0) {
                            horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            horizontalM246spacedBy0680j_4 = horizontal;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i22 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z14 = z12;
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    Orientation orientation115 = Orientation.Vertical;
                    float spacing115 = horizontalM246spacedBy0680j_4.getSpacing();
                    int i2111115 = i12 >> 3;
                    i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2111115 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1038659655);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function116 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111116 = i12 << 3;
                    Arrangement.Horizontal horizontal117 = horizontalM246spacedBy0680j_4;
                    PaddingValues paddingValues119 = paddingValues3;
                    LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation115, function116, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing115, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2111116) | (i2111116 & 458752) | (i2111115 & 3670016) | (i2111115 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal117;
                    z15 = z14;
                    paddingValues4 = paddingValues119;
                    f12 = f11;
                    flingBehavior4 = flingBehavior3;
                    z16 = z13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
            }
            i24 = 805306368;
            i12 |= i24;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation116 = Orientation.Vertical;
                float spacing116 = horizontalM246spacedBy0680j_4.getSpacing();
                int i2111117 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2111117 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function117 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111118 = i12 << 3;
                Arrangement.Horizontal horizontal118 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues1110 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation116, function117, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing116, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i2111118) | (i2111118 & 458752) | (i2111117 & 3670016) | (i2111117 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal118;
                z15 = z14;
                paddingValues4 = paddingValues1110;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation117 = Orientation.Vertical;
                float spacing117 = horizontalM246spacedBy0680j_4.getSpacing();
                int i2111119 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i2111119 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function118 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111110 = i12 << 3;
                Arrangement.Horizontal horizontal119 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues1111 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation117, function118, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing117, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21111110) | (i21111110 & 458752) | (i2111119 & 3670016) | (i2111119 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal119;
                z15 = z14;
                paddingValues4 = paddingValues1111;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
        }
        i12 |= 24576;
        z12 = z10;
        i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f10 = f6;
        } else {
            f10 = f6;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(f10)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        i20 = i11 & 64;
        if (i20 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(horizontal)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i12 |= i21;
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
        }
        i22 = i11 & 256;
        if (i22 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i23 = 33554432;
            }
            i12 |= i23;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
            }
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation118 = Orientation.Vertical;
                float spacing118 = horizontalM246spacedBy0680j_4.getSpacing();
                int i21111111 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21111111 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function119 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111112 = i12 << 3;
                Arrangement.Horizontal horizontal1110 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues1112 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation118, function119, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing118, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21111112) | (i21111112 & 458752) | (i21111111 & 3670016) | (i21111111 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal1110;
                z15 = z14;
                paddingValues4 = paddingValues1112;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                } else {
                    if (i26 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i14 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i20 != 0) {
                        horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        horizontalM246spacedBy0680j_4 = horizontal;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i22 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z14 = z12;
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                Orientation orientation119 = Orientation.Vertical;
                float spacing119 = horizontalM246spacedBy0680j_4.getSpacing();
                int i21111113 = i12 >> 3;
                i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21111113 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1038659655);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function1110 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111114 = i12 << 3;
                Arrangement.Horizontal horizontal1111 = horizontalM246spacedBy0680j_4;
                PaddingValues paddingValues1113 = paddingValues3;
                LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation119, function1110, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing119, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21111114) | (i21111114 & 458752) | (i21111113 & 3670016) | (i21111113 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal1111;
                z15 = z14;
                paddingValues4 = paddingValues1113;
                f12 = f11;
                flingBehavior4 = flingBehavior3;
                z16 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
        }
        i24 = 805306368;
        i12 |= i24;
        if (i13 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i20 != 0) {
                    horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    horizontalM246spacedBy0680j_4 = horizontal;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            } else {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i20 != 0) {
                    horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    horizontalM246spacedBy0680j_4 = horizontal;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
            }
            Orientation orientation1110 = Orientation.Vertical;
            float spacing1110 = horizontalM246spacedBy0680j_4.getSpacing();
            int i21111115 = i12 >> 3;
            i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21111115 & 896);
            composerStartRestartGroup.startReplaceableGroup(-1038659655);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1111 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111116 = i12 << 3;
            Arrangement.Horizontal horizontal1112 = horizontalM246spacedBy0680j_4;
            PaddingValues paddingValues1114 = paddingValues3;
            LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation1110, function1111, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing1110, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21111116) | (i21111116 & 458752) | (i21111115 & 3670016) | (i21111115 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            horizontal2 = horizontal1112;
            z15 = z14;
            paddingValues4 = paddingValues1114;
            f12 = f11;
            flingBehavior4 = flingBehavior3;
            z16 = z13;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i20 != 0) {
                    horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    horizontalM246spacedBy0680j_4 = horizontal;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            } else {
                if (i26 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i14 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i20 != 0) {
                    horizontalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    horizontalM246spacedBy0680j_4 = horizontal;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i22 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                flingBehavior3 = flingBehavior2;
                z14 = z12;
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695323794, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
            }
            Orientation orientation1111 = Orientation.Vertical;
            float spacing1111 = horizontalM246spacedBy0680j_4.getSpacing();
            int i21111117 = i12 >> 3;
            i25 = (i12 & 14) | ((i12 >> 15) & 112) | (i21111117 & 896);
            composerStartRestartGroup.startReplaceableGroup(-1038659655);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038659655, i25, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontalM246spacedBy0680j_4) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new g(new c(paddingValues3, columns, horizontalM246spacedBy0680j_4));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1112 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111118 = i12 << 3;
            Arrangement.Horizontal horizontal1113 = horizontalM246spacedBy0680j_4;
            PaddingValues paddingValues1115 = paddingValues3;
            LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation1111, function1112, modifier3, paddingValues3, z14, flingBehavior3, z13, f11, spacing1111, content, composerStartRestartGroup, ((i12 << 6) & 7168) | 56 | (57344 & i21111118) | (i21111118 & 458752) | (i21111117 & 3670016) | (i21111117 & 29360128) | ((i12 << 9) & 234881024), (i12 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            horizontal2 = horizontal1113;
            z15 = z14;
            paddingValues4 = paddingValues1115;
            f12 = f11;
            flingBehavior4 = flingBehavior3;
            z16 = z13;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z15, f12, horizontal2, flingBehavior4, z16, content, i10, i11));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @Nullable Function1<? super T, StaggeredGridItemSpan> function2, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new AnonymousClass3(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$4$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function1 function1, Function1 contentType, Function1 function2, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new AnonymousClass3(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$4$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @Nullable Function2<? super Integer, ? super T, StaggeredGridItemSpan> function3, @NotNull Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new C05453(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C05465(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function2 function2, Function2 contentType, Function2 function3, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
                @Nullable
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i10 & 8) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new C05453(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C05465(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @Nullable Function1<? super T, StaggeredGridItemSpan> function2, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new AnonymousClass8(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$9$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @Nullable Function2<? super Integer, ? super T, StaggeredGridItemSpan> function3, @NotNull Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new C05488(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C054410(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function1 function1, Function1 contentType, Function1 function2, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new AnonymousClass8(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$9$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function2 function2, Function2 contentType, Function2 function3, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
                @Nullable
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i10 & 8) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new C05488(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C054410(itemContent, items)));
    }
}
