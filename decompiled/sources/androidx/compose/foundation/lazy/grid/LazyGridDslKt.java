package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.c;
import z.f;
import z.g;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0080\u0001\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aã\u0001\u0010\u001d\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u001b*\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2%\b\n\u0010\"\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010\u001120\b\n\u0010&\u001a*\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010#¢\u0006\u0002\b\u00142%\b\n\u0010'\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0\u001123\b\u0004\u0010*\u001a-\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130#¢\u0006\u0002\b)¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010+\u001a·\u0002\u0010/\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u001b*\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2:\b\n\u0010\"\u001a4\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010#2E\b\n\u0010&\u001a?\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010.¢\u0006\u0002\b\u00142:\b\u0006\u0010'\u001a4\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0#2H\b\u0004\u0010*\u001aB\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130.¢\u0006\u0002\b)¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aã\u0001\u0010\u001d\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u001b*\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u0000012%\b\n\u0010\"\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010\u001120\b\n\u0010&\u001a*\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010#¢\u0006\u0002\b\u00142%\b\n\u0010'\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0\u001123\b\u0004\u0010*\u001a-\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130#¢\u0006\u0002\b)¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u00102\u001a·\u0002\u0010/\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u001b*\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u0000012:\b\n\u0010\"\u001a4\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010#2E\b\n\u0010&\u001a?\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010.¢\u0006\u0002\b\u00142:\b\u0006\u0010'\u001a4\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0#2H\b\u0004\u0010*\u001aB\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110,¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130.¢\u0006\u0002\b)¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00103\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rows", "LazyHorizontalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", ExifInterface.GPS_DIRECTION_TRUE, "", FirebaseAnalytics.Param.ITEMS, "Lkotlin/ParameterName;", "name", AnalyticsConstants.Key.ITEM, "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,557:1\n154#2:558\n154#2:559\n67#3,3:560\n66#3:563\n67#3,3:570\n66#3:573\n1097#4,6:564\n1097#4,6:574\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n66#1:558\n119#1:559\n149#1:560,3\n149#1:563\n182#1:570,3\n182#1:573\n149#1:564,6\n182#1:574,6\n*E\n"})
public final class LazyGridDslKt {

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ GridCells f4700p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4701q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyGridState f4702r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4703s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f4704t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Horizontal f4705u0;
        public final /* synthetic */ Arrangement.Vertical v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f4706w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f4707x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyGridScope, Unit> f4708y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, FlingBehavior flingBehavior, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, PaddingValues paddingValues, GridCells gridCells, LazyGridState lazyGridState, Modifier modifier, Function1 function1, boolean z10, boolean z11) {
            super(2);
            this.f4700p0 = gridCells;
            this.f4701q0 = modifier;
            this.f4702r0 = lazyGridState;
            this.f4703s0 = paddingValues;
            this.f4704t0 = z10;
            this.f4705u0 = horizontal;
            this.v0 = vertical;
            this.f4706w0 = flingBehavior;
            this.f4707x0 = z11;
            this.f4708y0 = function1;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyGridDslKt.LazyHorizontalGrid(this.f4700p0, this.f4701q0, this.f4702r0, this.f4703s0, this.f4704t0, this.f4705u0, this.v0, this.f4706w0, this.f4707x0, this.f4708y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ GridCells f4709p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4710q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyGridState f4711r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4712s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f4713t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f4714u0;
        public final /* synthetic */ Arrangement.Horizontal v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f4715w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f4716x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyGridScope, Unit> f4717y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, FlingBehavior flingBehavior, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, PaddingValues paddingValues, GridCells gridCells, LazyGridState lazyGridState, Modifier modifier, Function1 function1, boolean z10, boolean z11) {
            super(2);
            this.f4709p0 = gridCells;
            this.f4710q0 = modifier;
            this.f4711r0 = lazyGridState;
            this.f4712s0 = paddingValues;
            this.f4713t0 = z10;
            this.f4714u0 = vertical;
            this.v0 = horizontal;
            this.f4715w0 = flingBehavior;
            this.f4716x0 = z11;
            this.f4717y0 = function1;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyGridDslKt.LazyVerticalGrid(this.f4709p0, this.f4710q0, this.f4711r0, this.f4712s0, this.f4713t0, this.f4714u0, this.v0, this.f4715w0, this.f4716x0, this.f4717y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$10\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> f4718p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4719q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.f4718p0 = function4;
            this.f4719q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(407562193, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:520)");
            }
            this.f4718p0.invoke(items, this.f4719q0[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass2 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4720p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4721q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.f4720p0 = function1;
            this.f4721q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i10) {
            return this.f4720p0.invoke((T) this.f4721q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass3 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> f4722p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4723q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, List<? extends T> list) {
            super(2);
            this.f4722p0 = function2;
            this.f4723q0 = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m374boximpl(m382invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m382invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.f4722p0.invoke(lazyGridItemSpanScope, (T) this.f4723q0.get(i10)).getF4697a();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass4 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4724p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4725q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.f4724p0 = function1;
            this.f4725q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.f4724p0.invoke((T) this.f4725q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> f4726p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4727q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.f4726p0 = function4;
            this.f4727q0 = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:454)");
            }
            this.f4726p0.invoke(items, (T) this.f4727q0.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$7\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4728p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4729q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.f4728p0 = function1;
            this.f4729q0 = tArr;
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
        @NotNull
        public final Object invoke(int i10) {
            return this.f4728p0.invoke(this.f4729q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> f4730p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4731q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, T[] tArr) {
            super(2);
            this.f4730p0 = function2;
            this.f4731q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m374boximpl(m383invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
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
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m383invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.f4730p0.invoke(lazyGridItemSpanScope, this.f4731q0[i10]).getF4697a();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$9\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass9 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f4732p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4733q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.f4732p0 = function1;
            this.f4733q0 = tArr;
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
            return this.f4732p0.invoke(this.f4733q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$10\n*L\n1#1,557:1\n*E\n"})
    public static final class C053410 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> f4734p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4735q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C053410(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.f4734p0 = function5;
            this.f4735q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(-911455938, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:553)");
            }
            this.f4734p0.invoke(items, Integer.valueOf(i10), this.f4735q0[i10], composer, Integer.valueOf((i12 & 14) | (i12 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2\n*L\n1#1,557:1\n*E\n"})
    public static final class C05352 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4736p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4737q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05352(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.f4736p0 = function2;
            this.f4737q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i10) {
            return this.f4736p0.invoke(Integer.valueOf(i10), (T) this.f4737q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3\n*L\n1#1,557:1\n*E\n"})
    public static final class C05363 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> f4738p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4739q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05363(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, List<? extends T> list) {
            super(2);
            this.f4738p0 = function3;
            this.f4739q0 = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m374boximpl(m384invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m384invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.f4738p0.invoke(lazyGridItemSpanScope, Integer.valueOf(i10), (T) this.f4739q0.get(i10)).getF4697a();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$4\n*L\n1#1,557:1\n*E\n"})
    public static final class C05374 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4740p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4741q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05374(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.f4740p0 = function2;
            this.f4741q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.f4740p0.invoke(Integer.valueOf(i10), (T) this.f4741q0.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5\n*L\n1#1,557:1\n*E\n"})
    public static final class C05385 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> f4742p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<T> f4743q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05385(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.f4742p0 = function5;
            this.f4743q0 = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(1229287273, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:487)");
            }
            this.f4742p0.invoke(items, Integer.valueOf(i10), (T) this.f4743q0.get(i10), composer, Integer.valueOf((i12 & 14) | (i12 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$7\n*L\n1#1,557:1\n*E\n"})
    public static final class C05407 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4744p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4745q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05407(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.f4744p0 = function2;
            this.f4745q0 = tArr;
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
        @NotNull
        public final Object invoke(int i10) {
            return this.f4744p0.invoke(Integer.valueOf(i10), this.f4745q0[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8\n*L\n1#1,557:1\n*E\n"})
    public static final class C05418 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> f4746p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4747q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05418(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, T[] tArr) {
            super(2);
            this.f4746p0 = function3;
            this.f4747q0 = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m374boximpl(m385invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
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
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m385invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.f4746p0.invoke(lazyGridItemSpanScope, Integer.valueOf(i10), this.f4747q0[i10]).getF4697a();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9\n*L\n1#1,557:1\n*E\n"})
    public static final class C05429 extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Object> f4748p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T[] f4749q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05429(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.f4748p0 = function2;
            this.f4749q0 = tArr;
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
            return this.f4748p0.invoke(Integer.valueOf(i10), this.f4749q0[i10]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201  */
    /* JADX WARN: Code duplicated, block: B:167:0x0222  */
    /* JADX WARN: Code duplicated, block: B:170:0x0242  */
    /* JADX WARN: Code duplicated, block: B:172:0x024a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0262  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyHorizontalGrid(@NotNull GridCells rows, @Nullable Modifier modifier, @Nullable LazyGridState lazyGridState, @Nullable PaddingValues paddingValues, boolean z10, @Nullable Arrangement.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, @Nullable FlingBehavior flingBehavior, boolean z11, @NotNull Function1<? super LazyGridScope, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        LazyGridState lazyGridState2;
        int i13;
        PaddingValues paddingValues2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        Arrangement.Horizontal horizontal2;
        int i17;
        Arrangement.Vertical vertical2;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        LazyGridState lazyGridStateRememberLazyGridState;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        boolean z13;
        Arrangement.Horizontal end;
        Arrangement.Vertical top;
        FlingBehavior flingBehavior2;
        boolean z14;
        PaddingValues paddingValues3;
        Arrangement.Horizontal horizontal3;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior3;
        int i22;
        boolean z15;
        Arrangement arrangement;
        int i23;
        boolean zChanged;
        Object objRememberedValue;
        boolean z16;
        Modifier modifier3;
        LazyGridState lazyGridState3;
        Arrangement.Horizontal horizontal4;
        boolean z17;
        Arrangement.Vertical vertical4;
        PaddingValues paddingValues4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2123608858);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(rows) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    int i25 = composerStartRestartGroup.changed(lazyGridState2) ? 256 : 128;
                    i12 |= i25;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i12 |= i25;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        z12 = z10;
                        if (composerStartRestartGroup.changed(z12)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            horizontal2 = horizontal;
                            int i26 = composerStartRestartGroup.changed(horizontal2) ? 131072 : 65536;
                            i12 |= i26;
                        } else {
                            horizontal2 = horizontal;
                        }
                        i12 |= i26;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(vertical2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z11)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 1879048192) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                        }
                        if ((1533916891 & i12) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateRememberLazyGridState = lazyGridState2;
                                }
                                if (i13 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                                }
                                z13 = i15 == 0 ? z12 : false;
                                if ((i11 & 32) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z13) {
                                        end = arrangement.getEnd();
                                    } else {
                                        end = arrangement.getStart();
                                    }
                                    i12 &= -458753;
                                } else {
                                    end = horizontal2;
                                }
                                if (i17 != 0) {
                                    top = Arrangement.INSTANCE.getTop();
                                } else {
                                    top = vertical2;
                                }
                                if ((i11 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i12 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i19 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                                horizontal3 = end;
                                vertical3 = top;
                                flingBehavior3 = flingBehavior2;
                                boolean z18 = z13;
                                i22 = i12;
                                z15 = z18;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                modifier2 = modifier;
                                flingBehavior3 = flingBehavior;
                                z14 = z11;
                                i22 = i12;
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                                paddingValues3 = paddingValues2;
                                z15 = z12;
                                horizontal3 = horizontal2;
                                vertical3 = vertical2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                            }
                            int i27 = i22 >> 3;
                            i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i27 & 896);
                            composerStartRestartGroup.startReplaceableGroup(239683573);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function2 function2 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Arrangement.Vertical vertical5 = vertical3;
                            LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function2, paddingValues3, z15, false, flingBehavior3, z14, vertical5, horizontal3, content, composerStartRestartGroup, (i27 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i27 & 112) | (i22 & 7168) | (57344 & i22) | (i27 & 3670016) | (i27 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z16 = z15;
                            modifier3 = modifier2;
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            horizontal4 = horizontal3;
                            z17 = z14;
                            vertical4 = vertical5;
                            paddingValues4 = paddingValues3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            flingBehavior3 = flingBehavior;
                            z17 = z11;
                            lazyGridState3 = lazyGridState2;
                            paddingValues4 = paddingValues2;
                            vertical4 = vertical2;
                            z16 = z12;
                            horizontal4 = horizontal2;
                            modifier3 = modifier;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
                    }
                    i21 = 805306368;
                    i12 |= i21;
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z19 = z13;
                            i22 = i12;
                            z15 = z19;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z110 = z13;
                            i22 = i12;
                            z15 = z110;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i28 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i28 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function3 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical6 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function3, paddingValues3, z15, false, flingBehavior3, z14, vertical6, horizontal3, content, composerStartRestartGroup, (i28 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i28 & 112) | (i22 & 7168) | (57344 & i22) | (i28 & 3670016) | (i28 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical6;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z111 = z13;
                            i22 = i12;
                            z15 = z111;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z112 = z13;
                            i22 = i12;
                            z15 = z112;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i29 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i29 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function4 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical7 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function4, paddingValues3, z15, false, flingBehavior3, z14, vertical7, horizontal3, content, composerStartRestartGroup, (i29 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i29 & 112) | (i22 & 7168) | (57344 & i22) | (i29 & 3670016) | (i29 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical7;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
                }
                i12 |= 24576;
                z12 = z10;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        horizontal2 = horizontal;
                        if (composerStartRestartGroup.changed(horizontal2)) {
                        }
                        i12 |= i26;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i12 |= i26;
                } else {
                    horizontal2 = horizontal;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z113 = z13;
                            i22 = i12;
                            z15 = z113;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z114 = z13;
                            i22 = i12;
                            z15 = z114;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i210 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i210 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function5 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical8 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function5, paddingValues3, z15, false, flingBehavior3, z14, vertical8, horizontal3, content, composerStartRestartGroup, (i210 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i210 & 112) | (i22 & 7168) | (57344 & i22) | (i210 & 3670016) | (i210 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical8;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z115 = z13;
                            i22 = i12;
                            z15 = z115;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z116 = z13;
                            i22 = i12;
                            z15 = z116;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i211 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function6 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical9 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function6, paddingValues3, z15, false, flingBehavior3, z14, vertical9, horizontal3, content, composerStartRestartGroup, (i211 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211 & 112) | (i22 & 7168) | (57344 & i22) | (i211 & 3670016) | (i211 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical9;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
                }
                i21 = 805306368;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z117 = z13;
                        i22 = i12;
                        z15 = z117;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z118 = z13;
                        i22 = i12;
                        z15 = z118;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i212 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i212 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function7 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical10 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function7, paddingValues3, z15, false, flingBehavior3, z14, vertical10, horizontal3, content, composerStartRestartGroup, (i212 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i212 & 112) | (i22 & 7168) | (57344 & i22) | (i212 & 3670016) | (i212 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical10;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z119 = z13;
                        i22 = i12;
                        z15 = z119;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1110 = z13;
                        i22 = i12;
                        z15 = z1110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i213 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i213 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function8 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical11 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function8, paddingValues3, z15, false, flingBehavior3, z14, vertical11, horizontal3, content, composerStartRestartGroup, (i213 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i213 & 112) | (i22 & 7168) | (57344 & i22) | (i213 & 3670016) | (i213 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical11;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
            }
            i12 |= 3072;
            paddingValues2 = paddingValues;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        horizontal2 = horizontal;
                        if (composerStartRestartGroup.changed(horizontal2)) {
                        }
                        i12 |= i26;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i12 |= i26;
                } else {
                    horizontal2 = horizontal;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z1111 = z13;
                            i22 = i12;
                            z15 = z1111;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z1112 = z13;
                            i22 = i12;
                            z15 = z1112;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i214 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i214 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function9 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical12 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function9, paddingValues3, z15, false, flingBehavior3, z14, vertical12, horizontal3, content, composerStartRestartGroup, (i214 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i214 & 112) | (i22 & 7168) | (57344 & i22) | (i214 & 3670016) | (i214 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical12;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z1113 = z13;
                            i22 = i12;
                            z15 = z1113;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z1114 = z13;
                            i22 = i12;
                            z15 = z1114;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i215 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i215 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function10 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical13 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function10, paddingValues3, z15, false, flingBehavior3, z14, vertical13, horizontal3, content, composerStartRestartGroup, (i215 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i215 & 112) | (i22 & 7168) | (57344 & i22) | (i215 & 3670016) | (i215 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical13;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
                }
                i21 = 805306368;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1115 = z13;
                        i22 = i12;
                        z15 = z1115;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1116 = z13;
                        i22 = i12;
                        z15 = z1116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i216 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i216 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function11 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical14 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function11, paddingValues3, z15, false, flingBehavior3, z14, vertical14, horizontal3, content, composerStartRestartGroup, (i216 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i216 & 112) | (i22 & 7168) | (57344 & i22) | (i216 & 3670016) | (i216 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical14;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1117 = z13;
                        i22 = i12;
                        z15 = z1117;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1118 = z13;
                        i22 = i12;
                        z15 = z1118;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i217 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i217 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function12 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical15 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function12, paddingValues3, z15, false, flingBehavior3, z14, vertical15, horizontal3, content, composerStartRestartGroup, (i217 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i217 & 112) | (i22 & 7168) | (57344 & i22) | (i217 & 3670016) | (i217 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical15;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i12 |= i26;
                } else {
                    horizontal2 = horizontal;
                }
                i12 |= i26;
            } else {
                horizontal2 = horizontal;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1119 = z13;
                        i22 = i12;
                        z15 = z1119;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z11110 = z13;
                        i22 = i12;
                        z15 = z11110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i218 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i218 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function13 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical16 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function13, paddingValues3, z15, false, flingBehavior3, z14, vertical16, horizontal3, content, composerStartRestartGroup, (i218 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i218 & 112) | (i22 & 7168) | (57344 & i22) | (i218 & 3670016) | (i218 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical16;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z11111 = z13;
                        i22 = i12;
                        z15 = z11111;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z11112 = z13;
                        i22 = i12;
                        z15 = z11112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i219 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i219 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function14 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical17 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function14, paddingValues3, z15, false, flingBehavior3, z14, vertical17, horizontal3, content, composerStartRestartGroup, (i219 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i219 & 112) | (i22 & 7168) | (57344 & i22) | (i219 & 3670016) | (i219 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical17;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
            }
            i21 = 805306368;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11113 = z13;
                    i22 = i12;
                    z15 = z11113;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11114 = z13;
                    i22 = i12;
                    z15 = z11114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i2110 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2110 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function15 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical18 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function15, paddingValues3, z15, false, flingBehavior3, z14, vertical18, horizontal3, content, composerStartRestartGroup, (i2110 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2110 & 112) | (i22 & 7168) | (57344 & i22) | (i2110 & 3670016) | (i2110 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical18;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11115 = z13;
                    i22 = i12;
                    z15 = z11115;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11116 = z13;
                    i22 = i12;
                    z15 = z11116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i2111 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2111 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function16 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical19 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function16, paddingValues3, z15, false, flingBehavior3, z14, vertical19, horizontal3, content, composerStartRestartGroup, (i2111 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2111 & 112) | (i22 & 7168) | (57344 & i22) | (i2111 & 3670016) | (i2111 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical19;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                lazyGridState2 = lazyGridState;
                if (composerStartRestartGroup.changed(lazyGridState2)) {
                }
                i12 |= i25;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i12 |= i25;
        } else {
            lazyGridState2 = lazyGridState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        horizontal2 = horizontal;
                        if (composerStartRestartGroup.changed(horizontal2)) {
                        }
                        i12 |= i26;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i12 |= i26;
                } else {
                    horizontal2 = horizontal;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z11117 = z13;
                            i22 = i12;
                            z15 = z11117;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z11118 = z13;
                            i22 = i12;
                            z15 = z11118;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i2112 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2112 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function17 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical110 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function17, paddingValues3, z15, false, flingBehavior3, z14, vertical110, horizontal3, content, composerStartRestartGroup, (i2112 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2112 & 112) | (i22 & 7168) | (57344 & i22) | (i2112 & 3670016) | (i2112 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical110;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z11119 = z13;
                            i22 = i12;
                            z15 = z11119;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i12 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i17 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                            boolean z111110 = z13;
                            i22 = i12;
                            z15 = z111110;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i2113 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2113 & 896);
                        composerStartRestartGroup.startReplaceableGroup(239683573);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function18 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Arrangement.Vertical vertical111 = vertical3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function18, paddingValues3, z15, false, flingBehavior3, z14, vertical111, horizontal3, content, composerStartRestartGroup, (i2113 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2113 & 112) | (i22 & 7168) | (57344 & i22) | (i2113 & 3670016) | (i2113 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        horizontal4 = horizontal3;
                        z17 = z14;
                        vertical4 = vertical111;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
                }
                i21 = 805306368;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111111 = z13;
                        i22 = i12;
                        z15 = z111111;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111112 = z13;
                        i22 = i12;
                        z15 = z111112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i2114 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2114 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function19 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical112 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function19, paddingValues3, z15, false, flingBehavior3, z14, vertical112, horizontal3, content, composerStartRestartGroup, (i2114 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2114 & 112) | (i22 & 7168) | (57344 & i22) | (i2114 & 3670016) | (i2114 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical112;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111113 = z13;
                        i22 = i12;
                        z15 = z111113;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111114 = z13;
                        i22 = i12;
                        z15 = z111114;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i2115 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2115 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function110 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical113 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function110, paddingValues3, z15, false, flingBehavior3, z14, vertical113, horizontal3, content, composerStartRestartGroup, (i2115 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2115 & 112) | (i22 & 7168) | (57344 & i22) | (i2115 & 3670016) | (i2115 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical113;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i12 |= i26;
                } else {
                    horizontal2 = horizontal;
                }
                i12 |= i26;
            } else {
                horizontal2 = horizontal;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111115 = z13;
                        i22 = i12;
                        z15 = z111115;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111116 = z13;
                        i22 = i12;
                        z15 = z111116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i2116 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2116 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function111 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical114 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function111, paddingValues3, z15, false, flingBehavior3, z14, vertical114, horizontal3, content, composerStartRestartGroup, (i2116 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2116 & 112) | (i22 & 7168) | (57344 & i22) | (i2116 & 3670016) | (i2116 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical114;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111117 = z13;
                        i22 = i12;
                        z15 = z111117;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z111118 = z13;
                        i22 = i12;
                        z15 = z111118;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i2117 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2117 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function112 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical115 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function112, paddingValues3, z15, false, flingBehavior3, z14, vertical115, horizontal3, content, composerStartRestartGroup, (i2117 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2117 & 112) | (i22 & 7168) | (57344 & i22) | (i2117 & 3670016) | (i2117 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical115;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
            }
            i21 = 805306368;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z111119 = z13;
                    i22 = i12;
                    z15 = z111119;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111110 = z13;
                    i22 = i12;
                    z15 = z1111110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i2118 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2118 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function113 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical116 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function113, paddingValues3, z15, false, flingBehavior3, z14, vertical116, horizontal3, content, composerStartRestartGroup, (i2118 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2118 & 112) | (i22 & 7168) | (57344 & i22) | (i2118 & 3670016) | (i2118 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical116;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111111 = z13;
                    i22 = i12;
                    z15 = z1111111;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111112 = z13;
                    i22 = i12;
                    z15 = z1111112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i2119 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2119 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function114 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical117 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function114, paddingValues3, z15, false, flingBehavior3, z14, vertical117, horizontal3, content, composerStartRestartGroup, (i2119 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2119 & 112) | (i22 & 7168) | (57344 & i22) | (i2119 & 3670016) | (i2119 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical117;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
        }
        i12 |= 3072;
        paddingValues2 = paddingValues;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                z12 = z10;
                if (composerStartRestartGroup.changed(z12)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i12 |= i26;
                } else {
                    horizontal2 = horizontal;
                }
                i12 |= i26;
            } else {
                horizontal2 = horizontal;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111113 = z13;
                        i22 = i12;
                        z15 = z1111113;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111114 = z13;
                        i22 = i12;
                        z15 = z1111114;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i21110 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21110 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function115 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical118 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function115, paddingValues3, z15, false, flingBehavior3, z14, vertical118, horizontal3, content, composerStartRestartGroup, (i21110 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21110 & 112) | (i22 & 7168) | (57344 & i22) | (i21110 & 3670016) | (i21110 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical118;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111115 = z13;
                        i22 = i12;
                        z15 = z1111115;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i12 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i17 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111116 = z13;
                        i22 = i12;
                        z15 = z1111116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i21111 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111 & 896);
                    composerStartRestartGroup.startReplaceableGroup(239683573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function116 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Arrangement.Vertical vertical119 = vertical3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function116, paddingValues3, z15, false, flingBehavior3, z14, vertical119, horizontal3, content, composerStartRestartGroup, (i21111 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111 & 112) | (i22 & 7168) | (57344 & i22) | (i21111 & 3670016) | (i21111 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    horizontal4 = horizontal3;
                    z17 = z14;
                    vertical4 = vertical119;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
            }
            i21 = 805306368;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111117 = z13;
                    i22 = i12;
                    z15 = z1111117;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111118 = z13;
                    i22 = i12;
                    z15 = z1111118;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i21112 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21112 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function117 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical1110 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function117, paddingValues3, z15, false, flingBehavior3, z14, vertical1110, horizontal3, content, composerStartRestartGroup, (i21112 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21112 & 112) | (i22 & 7168) | (57344 & i22) | (i21112 & 3670016) | (i21112 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical1110;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111119 = z13;
                    i22 = i12;
                    z15 = z1111119;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111110 = z13;
                    i22 = i12;
                    z15 = z11111110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i21113 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21113 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function118 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical1111 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function118, paddingValues3, z15, false, flingBehavior3, z14, vertical1111, horizontal3, content, composerStartRestartGroup, (i21113 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21113 & 112) | (i22 & 7168) | (57344 & i22) | (i21113 & 3670016) | (i21113 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical1111;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
        }
        i12 |= 24576;
        z12 = z10;
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i12 |= i26;
            } else {
                horizontal2 = horizontal;
            }
            i12 |= i26;
        } else {
            horizontal2 = horizontal;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            vertical2 = vertical;
        } else {
            vertical2 = vertical;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
            }
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111111 = z13;
                    i22 = i12;
                    z15 = z11111111;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111112 = z13;
                    i22 = i12;
                    z15 = z11111112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i21114 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21114 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function119 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical1112 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function119, paddingValues3, z15, false, flingBehavior3, z14, vertical1112, horizontal3, content, composerStartRestartGroup, (i21114 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21114 & 112) | (i22 & 7168) | (57344 & i22) | (i21114 & 3670016) | (i21114 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical1112;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111113 = z13;
                    i22 = i12;
                    z15 = z11111113;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i12 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i17 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111114 = z13;
                    i22 = i12;
                    z15 = z11111114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i21115 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21115 & 896);
                composerStartRestartGroup.startReplaceableGroup(239683573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function1110 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.Vertical vertical1113 = vertical3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function1110, paddingValues3, z15, false, flingBehavior3, z14, vertical1113, horizontal3, content, composerStartRestartGroup, (i21115 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21115 & 112) | (i22 & 7168) | (57344 & i22) | (i21115 & 3670016) | (i21115 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                horizontal4 = horizontal3;
                z17 = z14;
                vertical4 = vertical1113;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
        }
        i21 = 805306368;
        i12 |= i21;
        if ((1533916891 & i12) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i17 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
                boolean z11111115 = z13;
                i22 = i12;
                z15 = z11111115;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i17 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
                boolean z11111116 = z13;
                i22 = i12;
                z15 = z11111116;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
            }
            int i21116 = i22 >> 3;
            i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21116 & 896);
            composerStartRestartGroup.startReplaceableGroup(239683573);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1111 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Arrangement.Vertical vertical1114 = vertical3;
            LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function1111, paddingValues3, z15, false, flingBehavior3, z14, vertical1114, horizontal3, content, composerStartRestartGroup, (i21116 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21116 & 112) | (i22 & 7168) | (57344 & i22) | (i21116 & 3670016) | (i21116 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z16 = z15;
            modifier3 = modifier2;
            lazyGridState3 = lazyGridStateRememberLazyGridState;
            horizontal4 = horizontal3;
            z17 = z14;
            vertical4 = vertical1114;
            paddingValues4 = paddingValues3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i17 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
                boolean z11111117 = z13;
                i22 = i12;
                z15 = z11111117;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i12 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i17 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
                boolean z11111118 = z13;
                i22 = i12;
                z15 = z11111118;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123608858, i22, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
            }
            int i21117 = i22 >> 3;
            i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21117 & 896);
            composerStartRestartGroup.startReplaceableGroup(239683573);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(239683573, i23, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(rows) | composerStartRestartGroup.changed(vertical3) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(new g(paddingValues3, rows, vertical3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1112 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Arrangement.Vertical vertical1115 = vertical3;
            LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function1112, paddingValues3, z15, false, flingBehavior3, z14, vertical1115, horizontal3, content, composerStartRestartGroup, (i21117 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21117 & 112) | (i22 & 7168) | (57344 & i22) | (i21117 & 3670016) | (i21117 & 29360128) | ((i22 << 6) & 234881024) | ((i22 << 12) & 1879048192), (i22 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z16 = z15;
            modifier3 = modifier2;
            lazyGridState3 = lazyGridStateRememberLazyGridState;
            horizontal4 = horizontal3;
            z17 = z14;
            vertical4 = vertical1115;
            paddingValues4 = paddingValues3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, rows, lazyGridState3, modifier3, content, z16, z17));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201  */
    /* JADX WARN: Code duplicated, block: B:167:0x0222  */
    /* JADX WARN: Code duplicated, block: B:170:0x0242  */
    /* JADX WARN: Code duplicated, block: B:172:0x024a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0262  */
    /* JADX WARN: Code duplicated, block: B:178:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:183:0x02be  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyVerticalGrid(@NotNull GridCells columns, @Nullable Modifier modifier, @Nullable LazyGridState lazyGridState, @Nullable PaddingValues paddingValues, boolean z10, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, boolean z11, @NotNull Function1<? super LazyGridScope, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        LazyGridState lazyGridState2;
        int i13;
        PaddingValues paddingValues2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        Arrangement.Vertical vertical2;
        int i17;
        Arrangement.Horizontal horizontal2;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        LazyGridState lazyGridStateRememberLazyGridState;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        boolean z13;
        Arrangement.Vertical bottom;
        Arrangement.Horizontal start;
        FlingBehavior flingBehavior2;
        boolean z14;
        PaddingValues paddingValues3;
        Arrangement.Vertical vertical3;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        int i22;
        boolean z15;
        Arrangement arrangement;
        int i23;
        boolean zChanged;
        Object objRememberedValue;
        boolean z16;
        Modifier modifier3;
        LazyGridState lazyGridState3;
        Arrangement.Vertical vertical4;
        boolean z17;
        Arrangement.Horizontal horizontal4;
        PaddingValues paddingValues4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1485410512);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(columns) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    int i25 = composerStartRestartGroup.changed(lazyGridState2) ? 256 : 128;
                    i12 |= i25;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i12 |= i25;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        z12 = z10;
                        if (composerStartRestartGroup.changed(z12)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            vertical2 = vertical;
                            int i26 = composerStartRestartGroup.changed(vertical2) ? 131072 : 65536;
                            i12 |= i26;
                        } else {
                            vertical2 = vertical;
                        }
                        i12 |= i26;
                    } else {
                        vertical2 = vertical;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(horizontal2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z11)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 1879048192) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                        }
                        if ((1533916891 & i12) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateRememberLazyGridState = lazyGridState2;
                                }
                                if (i13 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                                }
                                z13 = i15 == 0 ? z12 : false;
                                if ((i11 & 32) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z13) {
                                        bottom = arrangement.getBottom();
                                    } else {
                                        bottom = arrangement.getTop();
                                    }
                                    i12 &= -458753;
                                } else {
                                    bottom = vertical2;
                                }
                                if (i17 != 0) {
                                    start = Arrangement.INSTANCE.getStart();
                                } else {
                                    start = horizontal2;
                                }
                                if ((i11 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i12 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i19 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                                vertical3 = bottom;
                                horizontal3 = start;
                                flingBehavior3 = flingBehavior2;
                                boolean z18 = z13;
                                i22 = i12;
                                z15 = z18;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                modifier2 = modifier;
                                flingBehavior3 = flingBehavior;
                                z14 = z11;
                                i22 = i12;
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                                paddingValues3 = paddingValues2;
                                z15 = z12;
                                vertical3 = vertical2;
                                horizontal3 = horizontal2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                            }
                            int i27 = i22 >> 3;
                            i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i27 & 896);
                            composerStartRestartGroup.startReplaceableGroup(-1355301804);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function2 function2 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i28 = (i27 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i27 & 112) | (i22 & 7168) | (57344 & i22) | (i27 & 3670016) | (i27 & 29360128);
                            int i29 = i22 << 9;
                            Arrangement.Horizontal horizontal5 = horizontal3;
                            LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function2, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal5, content, composerStartRestartGroup, i28 | (i29 & 234881024) | (i29 & 1879048192), (i22 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z16 = z15;
                            modifier3 = modifier2;
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            vertical4 = vertical3;
                            z17 = z14;
                            horizontal4 = horizontal5;
                            paddingValues4 = paddingValues3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            flingBehavior3 = flingBehavior;
                            z17 = z11;
                            lazyGridState3 = lazyGridState2;
                            paddingValues4 = paddingValues2;
                            horizontal4 = horizontal2;
                            z16 = z12;
                            vertical4 = vertical2;
                            modifier3 = modifier;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
                    }
                    i21 = 805306368;
                    i12 |= i21;
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z19 = z13;
                            i22 = i12;
                            z15 = z19;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z110 = z13;
                            i22 = i12;
                            z15 = z110;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i210 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i210 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function3 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i211 = (i210 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i210 & 112) | (i22 & 7168) | (57344 & i22) | (i210 & 3670016) | (i210 & 29360128);
                        int i212 = i22 << 9;
                        Arrangement.Horizontal horizontal6 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function3, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal6, content, composerStartRestartGroup, i211 | (i212 & 234881024) | (i212 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal6;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z111 = z13;
                            i22 = i12;
                            z15 = z111;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z112 = z13;
                            i22 = i12;
                            z15 = z112;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i213 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i213 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function4 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i214 = (i213 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i213 & 112) | (i22 & 7168) | (57344 & i22) | (i213 & 3670016) | (i213 & 29360128);
                        int i215 = i22 << 9;
                        Arrangement.Horizontal horizontal7 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function4, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal7, content, composerStartRestartGroup, i214 | (i215 & 234881024) | (i215 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal7;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
                }
                i12 |= 24576;
                z12 = z10;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        vertical2 = vertical;
                        if (composerStartRestartGroup.changed(vertical2)) {
                        }
                        i12 |= i26;
                    } else {
                        vertical2 = vertical;
                    }
                    i12 |= i26;
                } else {
                    vertical2 = vertical;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z113 = z13;
                            i22 = i12;
                            z15 = z113;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z114 = z13;
                            i22 = i12;
                            z15 = z114;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i216 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i216 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function5 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i217 = (i216 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i216 & 112) | (i22 & 7168) | (57344 & i22) | (i216 & 3670016) | (i216 & 29360128);
                        int i218 = i22 << 9;
                        Arrangement.Horizontal horizontal8 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function5, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal8, content, composerStartRestartGroup, i217 | (i218 & 234881024) | (i218 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal8;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z115 = z13;
                            i22 = i12;
                            z15 = z115;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z116 = z13;
                            i22 = i12;
                            z15 = z116;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i219 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i219 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function6 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2110 = (i219 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i219 & 112) | (i22 & 7168) | (57344 & i22) | (i219 & 3670016) | (i219 & 29360128);
                        int i2111 = i22 << 9;
                        Arrangement.Horizontal horizontal9 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function6, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal9, content, composerStartRestartGroup, i2110 | (i2111 & 234881024) | (i2111 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal9;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
                }
                i21 = 805306368;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z117 = z13;
                        i22 = i12;
                        z15 = z117;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z118 = z13;
                        i22 = i12;
                        z15 = z118;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i2112 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2112 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function7 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2113 = (i2112 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2112 & 112) | (i22 & 7168) | (57344 & i22) | (i2112 & 3670016) | (i2112 & 29360128);
                    int i2114 = i22 << 9;
                    Arrangement.Horizontal horizontal10 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function7, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal10, content, composerStartRestartGroup, i2113 | (i2114 & 234881024) | (i2114 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal10;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z119 = z13;
                        i22 = i12;
                        z15 = z119;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1110 = z13;
                        i22 = i12;
                        z15 = z1110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i2115 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2115 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function8 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2116 = (i2115 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2115 & 112) | (i22 & 7168) | (57344 & i22) | (i2115 & 3670016) | (i2115 & 29360128);
                    int i2117 = i22 << 9;
                    Arrangement.Horizontal horizontal11 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function8, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal11, content, composerStartRestartGroup, i2116 | (i2117 & 234881024) | (i2117 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal11;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
            }
            i12 |= 3072;
            paddingValues2 = paddingValues;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        vertical2 = vertical;
                        if (composerStartRestartGroup.changed(vertical2)) {
                        }
                        i12 |= i26;
                    } else {
                        vertical2 = vertical;
                    }
                    i12 |= i26;
                } else {
                    vertical2 = vertical;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z1111 = z13;
                            i22 = i12;
                            z15 = z1111;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z1112 = z13;
                            i22 = i12;
                            z15 = z1112;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i2118 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2118 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function9 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2119 = (i2118 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2118 & 112) | (i22 & 7168) | (57344 & i22) | (i2118 & 3670016) | (i2118 & 29360128);
                        int i21110 = i22 << 9;
                        Arrangement.Horizontal horizontal12 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function9, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal12, content, composerStartRestartGroup, i2119 | (i21110 & 234881024) | (i21110 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal12;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z1113 = z13;
                            i22 = i12;
                            z15 = z1113;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z1114 = z13;
                            i22 = i12;
                            z15 = z1114;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i21111 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function10 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21112 = (i21111 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111 & 112) | (i22 & 7168) | (57344 & i22) | (i21111 & 3670016) | (i21111 & 29360128);
                        int i21113 = i22 << 9;
                        Arrangement.Horizontal horizontal13 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function10, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal13, content, composerStartRestartGroup, i21112 | (i21113 & 234881024) | (i21113 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal13;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
                }
                i21 = 805306368;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1115 = z13;
                        i22 = i12;
                        z15 = z1115;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1116 = z13;
                        i22 = i12;
                        z15 = z1116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i21114 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21114 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function11 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21115 = (i21114 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21114 & 112) | (i22 & 7168) | (57344 & i22) | (i21114 & 3670016) | (i21114 & 29360128);
                    int i21116 = i22 << 9;
                    Arrangement.Horizontal horizontal14 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function11, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal14, content, composerStartRestartGroup, i21115 | (i21116 & 234881024) | (i21116 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal14;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1117 = z13;
                        i22 = i12;
                        z15 = z1117;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1118 = z13;
                        i22 = i12;
                        z15 = z1118;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i21117 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21117 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function12 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21118 = (i21117 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21117 & 112) | (i22 & 7168) | (57344 & i22) | (i21117 & 3670016) | (i21117 & 29360128);
                    int i21119 = i22 << 9;
                    Arrangement.Horizontal horizontal15 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function12, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal15, content, composerStartRestartGroup, i21118 | (i21119 & 234881024) | (i21119 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal15;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i12 |= i26;
                } else {
                    vertical2 = vertical;
                }
                i12 |= i26;
            } else {
                vertical2 = vertical;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1119 = z13;
                        i22 = i12;
                        z15 = z1119;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z11110 = z13;
                        i22 = i12;
                        z15 = z11110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i211110 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211110 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function13 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211111 = (i211110 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211110 & 112) | (i22 & 7168) | (57344 & i22) | (i211110 & 3670016) | (i211110 & 29360128);
                    int i211112 = i22 << 9;
                    Arrangement.Horizontal horizontal16 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function13, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal16, content, composerStartRestartGroup, i211111 | (i211112 & 234881024) | (i211112 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal16;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z11111 = z13;
                        i22 = i12;
                        z15 = z11111;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z11112 = z13;
                        i22 = i12;
                        z15 = z11112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i211113 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211113 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function14 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211114 = (i211113 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211113 & 112) | (i22 & 7168) | (57344 & i22) | (i211113 & 3670016) | (i211113 & 29360128);
                    int i211115 = i22 << 9;
                    Arrangement.Horizontal horizontal17 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function14, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal17, content, composerStartRestartGroup, i211114 | (i211115 & 234881024) | (i211115 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal17;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
            }
            i21 = 805306368;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11113 = z13;
                    i22 = i12;
                    z15 = z11113;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11114 = z13;
                    i22 = i12;
                    z15 = z11114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i211116 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211116 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function15 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211117 = (i211116 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211116 & 112) | (i22 & 7168) | (57344 & i22) | (i211116 & 3670016) | (i211116 & 29360128);
                int i211118 = i22 << 9;
                Arrangement.Horizontal horizontal18 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function15, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal18, content, composerStartRestartGroup, i211117 | (i211118 & 234881024) | (i211118 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal18;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11115 = z13;
                    i22 = i12;
                    z15 = z11115;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11116 = z13;
                    i22 = i12;
                    z15 = z11116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i211119 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211119 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function16 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111110 = (i211119 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211119 & 112) | (i22 & 7168) | (57344 & i22) | (i211119 & 3670016) | (i211119 & 29360128);
                int i2111111 = i22 << 9;
                Arrangement.Horizontal horizontal19 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function16, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal19, content, composerStartRestartGroup, i2111110 | (i2111111 & 234881024) | (i2111111 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal19;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                lazyGridState2 = lazyGridState;
                if (composerStartRestartGroup.changed(lazyGridState2)) {
                }
                i12 |= i25;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i12 |= i25;
        } else {
            lazyGridState2 = lazyGridState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    z12 = z10;
                    if (composerStartRestartGroup.changed(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        vertical2 = vertical;
                        if (composerStartRestartGroup.changed(vertical2)) {
                        }
                        i12 |= i26;
                    } else {
                        vertical2 = vertical;
                    }
                    i12 |= i26;
                } else {
                    vertical2 = vertical;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z11117 = z13;
                            i22 = i12;
                            z15 = z11117;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z11118 = z13;
                            i22 = i12;
                            z15 = z11118;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i2111112 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2111112 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function17 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2111113 = (i2111112 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2111112 & 112) | (i22 & 7168) | (57344 & i22) | (i2111112 & 3670016) | (i2111112 & 29360128);
                        int i2111114 = i22 << 9;
                        Arrangement.Horizontal horizontal110 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function17, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal110, content, composerStartRestartGroup, i2111113 | (i2111114 & 234881024) | (i2111114 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal110;
                        paddingValues4 = paddingValues3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z11119 = z13;
                            i22 = i12;
                            z15 = z11119;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i13 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z13) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i12 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i17 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i11 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i19 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                            boolean z111110 = z13;
                            i22 = i12;
                            z15 = z111110;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i2111115 = i22 >> 3;
                        i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2111115 & 896);
                        composerStartRestartGroup.startReplaceableGroup(-1355301804);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function2 function18 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2111116 = (i2111115 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2111115 & 112) | (i22 & 7168) | (57344 & i22) | (i2111115 & 3670016) | (i2111115 & 29360128);
                        int i2111117 = i22 << 9;
                        Arrangement.Horizontal horizontal111 = horizontal3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function18, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal111, content, composerStartRestartGroup, i2111116 | (i2111117 & 234881024) | (i2111117 & 1879048192), (i22 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z16 = z15;
                        modifier3 = modifier2;
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        vertical4 = vertical3;
                        z17 = z14;
                        horizontal4 = horizontal111;
                        paddingValues4 = paddingValues3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
                }
                i21 = 805306368;
                i12 |= i21;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111111 = z13;
                        i22 = i12;
                        z15 = z111111;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111112 = z13;
                        i22 = i12;
                        z15 = z111112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i2111118 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2111118 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function19 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111119 = (i2111118 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2111118 & 112) | (i22 & 7168) | (57344 & i22) | (i2111118 & 3670016) | (i2111118 & 29360128);
                    int i21111110 = i22 << 9;
                    Arrangement.Horizontal horizontal112 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function19, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal112, content, composerStartRestartGroup, i2111119 | (i21111110 & 234881024) | (i21111110 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal112;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111113 = z13;
                        i22 = i12;
                        z15 = z111113;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111114 = z13;
                        i22 = i12;
                        z15 = z111114;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i21111111 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111111 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function110 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21111112 = (i21111111 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111111 & 112) | (i22 & 7168) | (57344 & i22) | (i21111111 & 3670016) | (i21111111 & 29360128);
                    int i21111113 = i22 << 9;
                    Arrangement.Horizontal horizontal113 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function110, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal113, content, composerStartRestartGroup, i21111112 | (i21111113 & 234881024) | (i21111113 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal113;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
            }
            i12 |= 24576;
            z12 = z10;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i12 |= i26;
                } else {
                    vertical2 = vertical;
                }
                i12 |= i26;
            } else {
                vertical2 = vertical;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111115 = z13;
                        i22 = i12;
                        z15 = z111115;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111116 = z13;
                        i22 = i12;
                        z15 = z111116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i21111114 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111114 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function111 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21111115 = (i21111114 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111114 & 112) | (i22 & 7168) | (57344 & i22) | (i21111114 & 3670016) | (i21111114 & 29360128);
                    int i21111116 = i22 << 9;
                    Arrangement.Horizontal horizontal114 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function111, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal114, content, composerStartRestartGroup, i21111115 | (i21111116 & 234881024) | (i21111116 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal114;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111117 = z13;
                        i22 = i12;
                        z15 = z111117;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z111118 = z13;
                        i22 = i12;
                        z15 = z111118;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i21111117 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111117 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function112 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21111118 = (i21111117 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111117 & 112) | (i22 & 7168) | (57344 & i22) | (i21111117 & 3670016) | (i21111117 & 29360128);
                    int i21111119 = i22 << 9;
                    Arrangement.Horizontal horizontal115 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function112, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal115, content, composerStartRestartGroup, i21111118 | (i21111119 & 234881024) | (i21111119 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal115;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
            }
            i21 = 805306368;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z111119 = z13;
                    i22 = i12;
                    z15 = z111119;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111110 = z13;
                    i22 = i12;
                    z15 = z1111110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i211111110 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211111110 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function113 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211111111 = (i211111110 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211111110 & 112) | (i22 & 7168) | (57344 & i22) | (i211111110 & 3670016) | (i211111110 & 29360128);
                int i211111112 = i22 << 9;
                Arrangement.Horizontal horizontal116 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function113, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal116, content, composerStartRestartGroup, i211111111 | (i211111112 & 234881024) | (i211111112 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal116;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111111 = z13;
                    i22 = i12;
                    z15 = z1111111;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111112 = z13;
                    i22 = i12;
                    z15 = z1111112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i211111113 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211111113 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function114 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211111114 = (i211111113 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211111113 & 112) | (i22 & 7168) | (57344 & i22) | (i211111113 & 3670016) | (i211111113 & 29360128);
                int i211111115 = i22 << 9;
                Arrangement.Horizontal horizontal117 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function114, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal117, content, composerStartRestartGroup, i211111114 | (i211111115 & 234881024) | (i211111115 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal117;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
        }
        i12 |= 3072;
        paddingValues2 = paddingValues;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                z12 = z10;
                if (composerStartRestartGroup.changed(z12)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i12 |= i26;
                } else {
                    vertical2 = vertical;
                }
                i12 |= i26;
            } else {
                vertical2 = vertical;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111113 = z13;
                        i22 = i12;
                        z15 = z1111113;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111114 = z13;
                        i22 = i12;
                        z15 = z1111114;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i211111116 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211111116 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function115 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211111117 = (i211111116 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211111116 & 112) | (i22 & 7168) | (57344 & i22) | (i211111116 & 3670016) | (i211111116 & 29360128);
                    int i211111118 = i22 << 9;
                    Arrangement.Horizontal horizontal118 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function115, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal118, content, composerStartRestartGroup, i211111117 | (i211111118 & 234881024) | (i211111118 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal118;
                    paddingValues4 = paddingValues3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111115 = z13;
                        i22 = i12;
                        z15 = z1111115;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i13 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z13) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i12 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i17 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i11 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i19 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                        boolean z1111116 = z13;
                        i22 = i12;
                        z15 = z1111116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i211111119 = i22 >> 3;
                    i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i211111119 & 896);
                    composerStartRestartGroup.startReplaceableGroup(-1355301804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function2 function116 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111111110 = (i211111119 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i211111119 & 112) | (i22 & 7168) | (57344 & i22) | (i211111119 & 3670016) | (i211111119 & 29360128);
                    int i2111111111 = i22 << 9;
                    Arrangement.Horizontal horizontal119 = horizontal3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function116, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal119, content, composerStartRestartGroup, i2111111110 | (i2111111111 & 234881024) | (i2111111111 & 1879048192), (i22 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z16 = z15;
                    modifier3 = modifier2;
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    vertical4 = vertical3;
                    z17 = z14;
                    horizontal4 = horizontal119;
                    paddingValues4 = paddingValues3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
            }
            i21 = 805306368;
            i12 |= i21;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111117 = z13;
                    i22 = i12;
                    z15 = z1111117;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111118 = z13;
                    i22 = i12;
                    z15 = z1111118;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i2111111112 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2111111112 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function117 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111111113 = (i2111111112 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2111111112 & 112) | (i22 & 7168) | (57344 & i22) | (i2111111112 & 3670016) | (i2111111112 & 29360128);
                int i2111111114 = i22 << 9;
                Arrangement.Horizontal horizontal1110 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function117, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal1110, content, composerStartRestartGroup, i2111111113 | (i2111111114 & 234881024) | (i2111111114 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal1110;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z1111119 = z13;
                    i22 = i12;
                    z15 = z1111119;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111110 = z13;
                    i22 = i12;
                    z15 = z11111110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i2111111115 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2111111115 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function118 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111111116 = (i2111111115 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2111111115 & 112) | (i22 & 7168) | (57344 & i22) | (i2111111115 & 3670016) | (i2111111115 & 29360128);
                int i2111111117 = i22 << 9;
                Arrangement.Horizontal horizontal1111 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function118, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal1111, content, composerStartRestartGroup, i2111111116 | (i2111111117 & 234881024) | (i2111111117 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal1111;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
        }
        i12 |= 24576;
        z12 = z10;
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i12 |= i26;
            } else {
                vertical2 = vertical;
            }
            i12 |= i26;
        } else {
            vertical2 = vertical;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            horizontal2 = horizontal;
        } else {
            horizontal2 = horizontal;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
            }
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111111 = z13;
                    i22 = i12;
                    z15 = z11111111;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111112 = z13;
                    i22 = i12;
                    z15 = z11111112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i2111111118 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i2111111118 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function119 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111111119 = (i2111111118 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2111111118 & 112) | (i22 & 7168) | (57344 & i22) | (i2111111118 & 3670016) | (i2111111118 & 29360128);
                int i21111111110 = i22 << 9;
                Arrangement.Horizontal horizontal1112 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function119, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal1112, content, composerStartRestartGroup, i2111111119 | (i21111111110 & 234881024) | (i21111111110 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal1112;
                paddingValues4 = paddingValues3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111113 = z13;
                    i22 = i12;
                    z15 = z11111113;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i13 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z13) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i12 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i17 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i11 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i19 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    boolean z11111114 = z13;
                    i22 = i12;
                    z15 = z11111114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i21111111111 = i22 >> 3;
                i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111111111 & 896);
                composerStartRestartGroup.startReplaceableGroup(-1355301804);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
                }
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function2 function1110 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111111112 = (i21111111111 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111111111 & 112) | (i22 & 7168) | (57344 & i22) | (i21111111111 & 3670016) | (i21111111111 & 29360128);
                int i21111111113 = i22 << 9;
                Arrangement.Horizontal horizontal1113 = horizontal3;
                LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function1110, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal1113, content, composerStartRestartGroup, i21111111112 | (i21111111113 & 234881024) | (i21111111113 & 1879048192), (i22 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z16 = z15;
                modifier3 = modifier2;
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                vertical4 = vertical3;
                z17 = z14;
                horizontal4 = horizontal1113;
                paddingValues4 = paddingValues3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
        }
        i21 = 805306368;
        i12 |= i21;
        if ((1533916891 & i12) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i17 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
                boolean z11111115 = z13;
                i22 = i12;
                z15 = z11111115;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i17 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
                boolean z11111116 = z13;
                i22 = i12;
                z15 = z11111116;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
            }
            int i21111111114 = i22 >> 3;
            i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111111114 & 896);
            composerStartRestartGroup.startReplaceableGroup(-1355301804);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1111 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111111115 = (i21111111114 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111111114 & 112) | (i22 & 7168) | (57344 & i22) | (i21111111114 & 3670016) | (i21111111114 & 29360128);
            int i21111111116 = i22 << 9;
            Arrangement.Horizontal horizontal1114 = horizontal3;
            LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function1111, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal1114, content, composerStartRestartGroup, i21111111115 | (i21111111116 & 234881024) | (i21111111116 & 1879048192), (i22 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z16 = z15;
            modifier3 = modifier2;
            lazyGridState3 = lazyGridStateRememberLazyGridState;
            vertical4 = vertical3;
            z17 = z14;
            horizontal4 = horizontal1114;
            paddingValues4 = paddingValues3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i17 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
                boolean z11111117 = z13;
                i22 = i12;
                z15 = z11111117;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i13 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues2;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z13) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i12 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i17 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i11 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i19 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                paddingValues3 = paddingValuesM289PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
                boolean z11111118 = z13;
                i22 = i12;
                z15 = z11111118;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485410512, i22, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
            }
            int i21111111117 = i22 >> 3;
            i23 = (i22 & 14) | ((i22 >> 15) & 112) | (i21111111117 & 896);
            composerStartRestartGroup.startReplaceableGroup(-1355301804);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355301804, i23, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(columns) | composerStartRestartGroup.changed(horizontal3) | composerStartRestartGroup.changed(paddingValues3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(new f(paddingValues3, columns, horizontal3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function2 function1112 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111111118 = (i21111111117 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i21111111117 & 112) | (i22 & 7168) | (57344 & i22) | (i21111111117 & 3670016) | (i21111111117 & 29360128);
            int i21111111119 = i22 << 9;
            Arrangement.Horizontal horizontal1115 = horizontal3;
            LazyGridKt.LazyGrid(modifier2, lazyGridStateRememberLazyGridState, function1112, paddingValues3, z15, true, flingBehavior3, z14, vertical3, horizontal1115, content, composerStartRestartGroup, i21111111118 | (i21111111119 & 234881024) | (i21111111119 & 1879048192), (i22 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z16 = z15;
            modifier3 = modifier2;
            lazyGridState3 = lazyGridStateRememberLazyGridState;
            vertical4 = vertical3;
            z17 = z14;
            horizontal4 = horizontal1115;
            paddingValues4 = paddingValues3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, flingBehavior3, horizontal4, vertical4, paddingValues4, columns, lazyGridState3, modifier3, content, z16, z17));
    }

    public static final List access$calculateCellsCrossAxisSizeImpl(int i10, int i11, int i12) {
        int i13 = i10 - ((i11 - 1) * i12);
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, function2 != null ? new AnonymousClass3(function2, items) : null, new AnonymousClass4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, function2 != null ? new AnonymousClass3(function2, items) : null, new AnonymousClass4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new C05352(function2, items) : null, function3 != null ? new C05363(function3, items) : null, new C05374(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C05385(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
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
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new C05352(function2, items) : null, function3 != null ? new C05363(function3, items) : null, new C05374(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C05385(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new AnonymousClass7(function1, items) : null, function2 != null ? new AnonymousClass8(function2, items) : null, new AnonymousClass9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new C05407(function2, items) : null, function3 != null ? new C05418(function3, items) : null, new C05429(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C053410(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new AnonymousClass7(function1, items) : null, function2 != null ? new AnonymousClass8(function2, items) : null, new AnonymousClass9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
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
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new C05407(function2, items) : null, function3 != null ? new C05418(function3, items) : null, new C05429(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C053410(itemContent, items)));
    }
}
