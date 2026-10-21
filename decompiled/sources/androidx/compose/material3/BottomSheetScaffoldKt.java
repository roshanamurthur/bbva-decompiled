package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0002\u0010 \u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010$\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007¢\u0006\u0004\b$\u0010%\u001a9\u0010*\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150\u00002\b\b\u0002\u0010)\u001a\u00020\u0015H\u0007¢\u0006\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/BottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-6cEcpDs", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "snackbarHostState", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "Landroidx/compose/material3/SheetValue;", "initialValue", "confirmValueChange", "skipHiddenState", "rememberStandardBottomSheetState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n36#2:397\n25#2:404\n50#2:411\n49#2:412\n25#2:423\n50#2:436\n49#2:437\n36#2:444\n67#2,3:451\n66#2:454\n83#2,3:461\n1114#3,6:398\n1114#3,6:405\n1114#3,6:413\n1114#3,3:424\n1117#3,3:430\n1114#3,6:438\n1114#3,6:445\n1114#3,6:455\n1114#3,6:464\n474#4,4:419\n478#4,2:427\n482#4:433\n474#5:429\n76#6:434\n1#7:435\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n123#1:397\n169#1:404\n171#1:411\n171#1:412\n210#1:423\n215#1:436\n215#1:437\n236#1:444\n253#1:451,3\n253#1:454\n329#1:461,3\n123#1:398,6\n169#1:405,6\n171#1:413,6\n210#1:424,3\n210#1:430,3\n215#1:438,6\n236#1:445,6\n253#1:455,6\n329#1:464,6\n210#1:419,4\n210#1:427,2\n210#1:433\n210#1:429\n211#1:434\n*E\n"})
public final class BottomSheetScaffoldKt {

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class a extends Lambda implements Function3<Integer, Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BottomSheetScaffoldState f9419p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f9420q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f9421r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f9422s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f9423t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f9424u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f9425w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9426x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9427y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(BottomSheetScaffoldState bottomSheetScaffoldState, float f6, boolean z10, Shape shape, long j10, long j11, float f10, float f11, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(3);
            this.f9419p0 = bottomSheetScaffoldState;
            this.f9420q0 = f6;
            this.f9421r0 = z10;
            this.f9422s0 = shape;
            this.f9423t0 = j10;
            this.f9424u0 = j11;
            this.v0 = f10;
            this.f9425w0 = f11;
            this.f9426x0 = function2;
            this.f9427y0 = function3;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Integer num, Composer composer, Integer num2) {
            int i10;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 14) == 0) {
                i10 = (composer2.changed(iIntValue) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(106433656, iIntValue2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:126)");
                }
                SheetState bottomSheetState = this.f9419p0.getBottomSheetState();
                float f6 = this.f9420q0;
                boolean z10 = this.f9421r0;
                float f10 = iIntValue;
                Shape shape = this.f9422s0;
                long j10 = this.f9423t0;
                long j11 = this.f9424u0;
                float f11 = this.v0;
                float f12 = this.f9425w0;
                Function2<Composer, Integer, Unit> function2 = this.f9426x0;
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f9427y0;
                int i11 = this.E0;
                BottomSheetScaffoldKt.m927access$StandardBottomSheet8oydGBM(bottomSheetState, f6, z10, f10, shape, j10, j11, f11, f12, function2, function3, composer2, ((i11 >> 6) & 112) | ((this.F0 << 6) & 896) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), i11 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> f9428p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BottomSheetScaffoldState f9429q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f9430r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, BottomSheetScaffoldState bottomSheetScaffoldState, int i10) {
            super(2);
            this.f9428p0 = function3;
            this.f9429q0 = bottomSheetScaffoldState;
            this.f9430r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1629779374, iIntValue, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:118)");
                }
                this.f9428p0.invoke(this.f9429q0.getSnackbarHostState(), composer2, Integer.valueOf((this.f9430r0 >> 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class c extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BottomSheetScaffoldState f9431p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BottomSheetScaffoldState bottomSheetScaffoldState) {
            super(0);
            this.f9431p0 = bottomSheetScaffoldState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f9431p0.getBottomSheetState().requireOffset());
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean E0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> G0;
        public final /* synthetic */ long H0;
        public final /* synthetic */ long I0;
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> J0;
        public final /* synthetic */ int K0;
        public final /* synthetic */ int L0;
        public final /* synthetic */ int M0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9432p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9433q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BottomSheetScaffoldState f9434r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f9435s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f9436t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f9437u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f9438w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ float f9439x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9440y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f6, Shape shape, long j10, long j11, float f10, float f11, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, Function2<? super Composer, ? super Integer, Unit> function4, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function5, long j12, long j13, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function6, int i10, int i11, int i12) {
            super(2);
            this.f9432p0 = function3;
            this.f9433q0 = modifier;
            this.f9434r0 = bottomSheetScaffoldState;
            this.f9435s0 = f6;
            this.f9436t0 = shape;
            this.f9437u0 = j10;
            this.v0 = j11;
            this.f9438w0 = f10;
            this.f9439x0 = f11;
            this.f9440y0 = function2;
            this.E0 = z10;
            this.F0 = function4;
            this.G0 = function5;
            this.H0 = j12;
            this.I0 = j13;
            this.J0 = function6;
            this.K0 = i10;
            this.L0 = i11;
            this.M0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BottomSheetScaffoldKt.m925BottomSheetScaffold6cEcpDs(this.f9432p0, this.f9433q0, this.f9434r0, this.f9435s0, this.f9436t0, this.f9437u0, this.v0, this.f9438w0, this.f9439x0, this.f9440y0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, composer, RecomposeScopeImplKt.updateChangedFlags(this.K0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.L0), this.M0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9441p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9442q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f9443r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<Integer, Composer, Integer, Unit> f9444s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9445t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f9446u0;
        public final /* synthetic */ Function0<Float> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ SheetState f9447w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f9448x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ long f9449y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f6, int i10, long j10, long j11, SheetState sheetState, Modifier modifier, Function0 function0, Function2 function2, Function2 function3, Function3 function4, Function3 function5) {
            super(2);
            this.f9441p0 = modifier;
            this.f9442q0 = function2;
            this.f9443r0 = function4;
            this.f9444s0 = function5;
            this.f9445t0 = function3;
            this.f9446u0 = f6;
            this.v0 = function0;
            this.f9447w0 = sheetState;
            this.f9448x0 = j10;
            this.f9449y0 = j11;
            this.E0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BottomSheetScaffoldKt.a(this.f9441p0, this.f9442q0, this.f9443r0, this.f9444s0, this.f9445t0, this.f9446u0, this.v0, this.f9447w0, this.f9448x0, this.f9449y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class f extends Lambda implements Function1<SheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f9450p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SheetValue sheetValue) {
            SheetValue it = sheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x017c  */
    /* JADX WARN: Code duplicated, block: B:126:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01de  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:177:0x022e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0235  */
    /* JADX WARN: Code duplicated, block: B:201:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x028d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0290  */
    /* JADX WARN: Code duplicated, block: B:206:0x0297  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02af  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:214:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:217:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:218:0x02de  */
    /* JADX WARN: Code duplicated, block: B:221:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:224:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:225:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:227:0x0302  */
    /* JADX WARN: Code duplicated, block: B:228:0x0309  */
    /* JADX WARN: Code duplicated, block: B:230:0x030d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0314  */
    /* JADX WARN: Code duplicated, block: B:233:0x0318  */
    /* JADX WARN: Code duplicated, block: B:234:0x031a  */
    /* JADX WARN: Code duplicated, block: B:236:0x031e  */
    /* JADX WARN: Code duplicated, block: B:237:0x0321  */
    /* JADX WARN: Code duplicated, block: B:239:0x0325  */
    /* JADX WARN: Code duplicated, block: B:240:0x032c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0332  */
    /* JADX WARN: Code duplicated, block: B:244:0x0343  */
    /* JADX WARN: Code duplicated, block: B:247:0x034c  */
    /* JADX WARN: Code duplicated, block: B:248:0x036c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0388  */
    /* JADX WARN: Code duplicated, block: B:254:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:256:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:259:0x0434  */
    /* JADX WARN: Code duplicated, block: B:264:0x044b  */
    /* JADX WARN: Code duplicated, block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomSheetScaffold-6cEcpDs, reason: not valid java name */
    public static final void m925BottomSheetScaffold6cEcpDs(@NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, @Nullable Modifier modifier, @Nullable BottomSheetScaffoldState bottomSheetScaffoldState, float f6, @Nullable Shape shape, long j10, long j11, float f10, float f11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function4, long j12, long j13, @NotNull Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Modifier modifier2;
        BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
        float fM924getSheetPeekHeightD9Ej5fM;
        int i33;
        Shape expandedShape;
        float f12;
        long containerColor;
        long jM1014contentColorForek8zF_U;
        float fM923getElevationD9Ej5fM;
        float fM923getElevationD9Ej5fM2;
        Function2<? super Composer, ? super Integer, Unit> function2M1032getLambda1$material3_release;
        boolean z11;
        Function2<? super Composer, ? super Integer, Unit> function5;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M1033getLambda2$material3_release;
        int i34;
        long jM978getSurface0d7_KjU;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Modifier modifier3;
        long j14;
        int i35;
        long j15;
        int i36;
        float f13;
        Function2<? super Composer, ? super Integer, Unit> function7;
        boolean z12;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function8;
        Shape shape2;
        float f14;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        boolean zChanged;
        Object objRememberedValue;
        Shape shape3;
        float f15;
        BottomSheetScaffoldState bottomSheetScaffoldState3;
        float f16;
        Function2<? super Composer, ? super Integer, Unit> function9;
        boolean z13;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function10;
        float f17;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i37;
        int i38;
        int i39;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(144898711);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i40 = i12 & 2;
        if (i40 == 0) {
            if ((i10 & 112) == 0) {
                i13 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) != 0) {
                i13 |= ((i12 & 4) == 0 || !composerStartRestartGroup.changed(bottomSheetScaffoldState)) ? 128 : 256;
            }
            i14 = i12 & 8;
            i15 = 1024;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = 8192;
                if ((i10 & 57344) != 0) {
                    if ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) {
                        i39 = 8192;
                    } else {
                        i39 = 16384;
                    }
                    i13 |= i39;
                }
                if ((i10 & 458752) != 0) {
                    if ((i12 & 32) == 0 || !composerStartRestartGroup.changed(j10)) {
                        i38 = 65536;
                    } else {
                        i38 = 131072;
                    }
                    i13 |= i38;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i12 & 64) == 0 || !composerStartRestartGroup.changed(j11)) {
                        i37 = 524288;
                    } else {
                        i37 = 1048576;
                    }
                    i13 |= i37;
                }
                i18 = i12 & 128;
                if (i18 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 256;
                if (i20 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(f11)) {
                        i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 512;
                if (i22 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 1024;
                if (i24 != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                i27 = i12 & 2048;
                if (i27 != 0) {
                    i25 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i25 |= i28;
                }
                i29 = i25;
                i30 = i12 & 4096;
                if (i30 != 0) {
                    if ((i11 & 896) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i31 = 256;
                        } else {
                            i31 = 128;
                        }
                        i29 |= i31;
                    }
                    if ((i11 & 7168) != 0) {
                        if ((i12 & 8192) == 0 && composerStartRestartGroup.changed(j12)) {
                            i15 = 2048;
                        }
                        i29 |= i15;
                    }
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0 && composerStartRestartGroup.changed(j13)) {
                            i17 = 16384;
                        }
                        i29 |= i17;
                    }
                    if ((i12 & 32768) != 0) {
                        if ((i11 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i32 = 131072;
                            } else {
                                i32 = 65536;
                            }
                        }
                        if ((i13 & 1533916891) != 306783378 && (374491 & i29) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            bottomSheetScaffoldState3 = bottomSheetScaffoldState;
                            f16 = f6;
                            shape3 = shape;
                            containerColor = j10;
                            jM1014contentColorForek8zF_U = j11;
                            f17 = f10;
                            f15 = f11;
                            function9 = function2;
                            z13 = z10;
                            function5 = function3;
                            function10 = function4;
                            j15 = j12;
                            j14 = j13;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i40 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if ((i12 & 4) != 0) {
                                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                    i13 &= -897;
                                } else {
                                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                                }
                                if (i14 != 0) {
                                    fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                                } else {
                                    fM924getSheetPeekHeightD9Ej5fM = f6;
                                }
                                if ((i12 & 16) != 0) {
                                    i33 = 6;
                                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                    i13 &= -57345;
                                } else {
                                    i33 = 6;
                                    expandedShape = shape;
                                }
                                f12 = fM924getSheetPeekHeightD9Ej5fM;
                                if ((i12 & 32) != 0) {
                                    i13 &= -458753;
                                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                                } else {
                                    containerColor = j10;
                                }
                                if ((i12 & 64) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                    i13 &= -3670017;
                                } else {
                                    jM1014contentColorForek8zF_U = j11;
                                }
                                if (i18 != 0) {
                                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                                } else {
                                    fM923getElevationD9Ej5fM = f10;
                                }
                                if (i20 != 0) {
                                    fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                                } else {
                                    fM923getElevationD9Ej5fM2 = f11;
                                }
                                if (i22 != 0) {
                                    function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                                } else {
                                    function2M1032getLambda1$material3_release = function2;
                                }
                                if (i24 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i27 != 0) {
                                    function5 = null;
                                } else {
                                    function5 = function3;
                                }
                                if (i30 != 0) {
                                    function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                                } else {
                                    function3M1033getLambda2$material3_release = function4;
                                }
                                if ((i12 & 8192) != 0) {
                                    i34 = i29 & (-7169);
                                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                                } else {
                                    i34 = i29;
                                    jM978getSurface0d7_KjU = j12;
                                }
                                function6 = function2M1032getLambda1$material3_release;
                                if ((i12 & 16384) != 0) {
                                    long jM1014contentColorForek8zF_U2 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                    i36 = (-57345) & i34;
                                    i35 = i13;
                                    function8 = function3M1033getLambda2$material3_release;
                                    j14 = jM1014contentColorForek8zF_U2;
                                    modifier3 = modifier2;
                                    f13 = f12;
                                    f14 = fM923getElevationD9Ej5fM2;
                                    j15 = jM978getSurface0d7_KjU;
                                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                    function7 = function6;
                                    z12 = z11;
                                    shape2 = expandedShape;
                                } else {
                                    modifier3 = modifier2;
                                    j14 = j13;
                                    i35 = i13;
                                    j15 = jM978getSurface0d7_KjU;
                                    i36 = i34;
                                    f13 = f12;
                                    function7 = function6;
                                    z12 = z11;
                                    function8 = function3M1033getLambda2$material3_release;
                                    shape2 = expandedShape;
                                    f14 = fM923getElevationD9Ej5fM2;
                                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 8192) != 0) {
                                    i29 &= -7169;
                                }
                                if ((i12 & 16384) != 0) {
                                    i29 &= -57345;
                                }
                                modifier3 = modifier;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                                shape2 = shape;
                                containerColor = j10;
                                jM1014contentColorForek8zF_U = j11;
                                fM923getElevationD9Ej5fM = f10;
                                f14 = f11;
                                function7 = function2;
                                function5 = function3;
                                function8 = function4;
                                j15 = j12;
                                j14 = j13;
                                i35 = i13;
                                i36 = i29;
                                f13 = f6;
                                z12 = z10;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                            }
                            SheetState bottomSheetState = bottomSheetScaffoldState2.getBottomSheetState();
                            Shape shape4 = shape2;
                            float f18 = f14;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                            float f19 = fM923getElevationD9Ej5fM;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new c(bottomSheetScaffoldState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                            int i41 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                            int i42 = i36 << 15;
                            a(modifier3, function5, content, composableLambda, composableLambda2, f13, (Function0) objRememberedValue, bottomSheetState, j15, j14, composerStartRestartGroup, i41 | (234881024 & i42) | (i42 & 1879048192));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape3 = shape4;
                            f15 = f18;
                            bottomSheetScaffoldState3 = bottomSheetScaffoldState4;
                            f16 = f13;
                            function9 = function7;
                            z13 = z12;
                            function10 = function8;
                            f17 = f19;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
                    }
                    i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i29 |= i32;
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U3 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U3;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U4 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U4;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState2 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape5 = shape2;
                        float f110 = f14;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f111 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState2;
                        int i43 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i44 = i36 << 15;
                        a(modifier3, function5, content, composableLambda3, composableLambda4, f13, (Function0) objRememberedValue, bottomSheetState2, j15, j14, composerStartRestartGroup, i43 | (234881024 & i44) | (i44 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape5;
                        f15 = f110;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState5;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f111;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U5 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U5;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U6 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U6;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState3 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape6 = shape2;
                        float f112 = f14;
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f113 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState2;
                        int i45 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i46 = i36 << 15;
                        a(modifier3, function5, content, composableLambda5, composableLambda6, f13, (Function0) objRememberedValue, bottomSheetState3, j15, j14, composerStartRestartGroup, i45 | (234881024 & i46) | (i46 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape6;
                        f15 = f112;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState6;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f113;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
                }
                i29 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                if ((i11 & 7168) != 0) {
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i29 |= i15;
                }
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i29 |= i17;
                }
                if ((i12 & 32768) != 0) {
                    if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i32 = 131072;
                        } else {
                            i32 = 65536;
                        }
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U7 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U7;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U8 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U8;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState4 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape7 = shape2;
                        float f114 = f14;
                        ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f115 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState7 = bottomSheetScaffoldState2;
                        int i47 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i48 = i36 << 15;
                        a(modifier3, function5, content, composableLambda7, composableLambda8, f13, (Function0) objRememberedValue, bottomSheetState4, j15, j14, composerStartRestartGroup, i47 | (234881024 & i48) | (i48 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape7;
                        f15 = f114;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState7;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f115;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U9 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U9;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U10 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U10;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState5 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape8 = shape2;
                        float f116 = f14;
                        ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f117 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState8 = bottomSheetScaffoldState2;
                        int i49 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i410 = i36 << 15;
                        a(modifier3, function5, content, composableLambda9, composableLambda10, f13, (Function0) objRememberedValue, bottomSheetState5, j15, j14, composerStartRestartGroup, i49 | (234881024 & i410) | (i410 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape8;
                        f15 = f116;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState8;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f117;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
                }
                i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i29 |= i32;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U11 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U11;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U12 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U12;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState6 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape9 = shape2;
                    float f118 = f14;
                    ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f119 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState9 = bottomSheetScaffoldState2;
                    int i411 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i412 = i36 << 15;
                    a(modifier3, function5, content, composableLambda11, composableLambda12, f13, (Function0) objRememberedValue, bottomSheetState6, j15, j14, composerStartRestartGroup, i411 | (234881024 & i412) | (i412 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape9;
                    f15 = f118;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState9;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f119;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U13 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U13;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U14 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U14;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState7 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape10 = shape2;
                    float f1110 = f14;
                    ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f1111 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState10 = bottomSheetScaffoldState2;
                    int i413 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i414 = i36 << 15;
                    a(modifier3, function5, content, composableLambda13, composableLambda14, f13, (Function0) objRememberedValue, bottomSheetState7, j15, j14, composerStartRestartGroup, i413 | (234881024 & i414) | (i414 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape10;
                    f15 = f1110;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState10;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f1111;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
            }
            i13 |= 3072;
            i17 = 8192;
            if ((i10 & 57344) != 0) {
                if ((i12 & 16) == 0) {
                    i39 = 8192;
                } else {
                    i39 = 8192;
                }
                i13 |= i39;
            }
            if ((i10 & 458752) != 0) {
                if ((i12 & 32) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i13 |= i38;
            }
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i37 = 524288;
                } else {
                    i37 = 524288;
                }
                i13 |= i37;
            }
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f10)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            i20 = i12 & 256;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(f11)) {
                    i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            i22 = i12 & 512;
            if (i22 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i12 & 1024;
            if (i24 != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            i27 = i12 & 2048;
            if (i27 != 0) {
                i25 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i25 |= i28;
            }
            i29 = i25;
            i30 = i12 & 4096;
            if (i30 != 0) {
                if ((i11 & 896) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i31 = 256;
                    } else {
                        i31 = 128;
                    }
                    i29 |= i31;
                }
                if ((i11 & 7168) != 0) {
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i29 |= i15;
                }
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i29 |= i17;
                }
                if ((i12 & 32768) != 0) {
                    if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i32 = 131072;
                        } else {
                            i32 = 65536;
                        }
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U15 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U15;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U16 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U16;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState8 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape11 = shape2;
                        float f1112 = f14;
                        ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f1113 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState11 = bottomSheetScaffoldState2;
                        int i415 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i416 = i36 << 15;
                        a(modifier3, function5, content, composableLambda15, composableLambda16, f13, (Function0) objRememberedValue, bottomSheetState8, j15, j14, composerStartRestartGroup, i415 | (234881024 & i416) | (i416 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape11;
                        f15 = f1112;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState11;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f1113;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U17 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U17;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U18 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U18;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState9 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape12 = shape2;
                        float f1114 = f14;
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f1115 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState12 = bottomSheetScaffoldState2;
                        int i417 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i418 = i36 << 15;
                        a(modifier3, function5, content, composableLambda17, composableLambda18, f13, (Function0) objRememberedValue, bottomSheetState9, j15, j14, composerStartRestartGroup, i417 | (234881024 & i418) | (i418 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape12;
                        f15 = f1114;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState12;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f1115;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
                }
                i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i29 |= i32;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U19 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U19;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U110 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U110;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState10 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape13 = shape2;
                    float f1116 = f14;
                    ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f1117 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState13 = bottomSheetScaffoldState2;
                    int i419 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i4110 = i36 << 15;
                    a(modifier3, function5, content, composableLambda19, composableLambda110, f13, (Function0) objRememberedValue, bottomSheetState10, j15, j14, composerStartRestartGroup, i419 | (234881024 & i4110) | (i4110 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape13;
                    f15 = f1116;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState13;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f1117;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U111 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U111;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U112 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U112;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState11 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape14 = shape2;
                    float f1118 = f14;
                    ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f1119 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState14 = bottomSheetScaffoldState2;
                    int i4111 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i4112 = i36 << 15;
                    a(modifier3, function5, content, composableLambda111, composableLambda112, f13, (Function0) objRememberedValue, bottomSheetState11, j15, j14, composerStartRestartGroup, i4111 | (234881024 & i4112) | (i4112 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape14;
                    f15 = f1118;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState14;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f1119;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
            }
            i29 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            if ((i11 & 7168) != 0) {
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i29 |= i15;
            }
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i29 |= i17;
            }
            if ((i12 & 32768) != 0) {
                if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i32 = 131072;
                    } else {
                        i32 = 65536;
                    }
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U113 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U113;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U114 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U114;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState12 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape15 = shape2;
                    float f11110 = f14;
                    ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f11111 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState15 = bottomSheetScaffoldState2;
                    int i4113 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i4114 = i36 << 15;
                    a(modifier3, function5, content, composableLambda113, composableLambda114, f13, (Function0) objRememberedValue, bottomSheetState12, j15, j14, composerStartRestartGroup, i4113 | (234881024 & i4114) | (i4114 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape15;
                    f15 = f11110;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState15;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f11111;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U115 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U115;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U116 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U116;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState13 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape16 = shape2;
                    float f11112 = f14;
                    ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f11113 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState16 = bottomSheetScaffoldState2;
                    int i4115 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i4116 = i36 << 15;
                    a(modifier3, function5, content, composableLambda115, composableLambda116, f13, (Function0) objRememberedValue, bottomSheetState13, j15, j14, composerStartRestartGroup, i4115 | (234881024 & i4116) | (i4116 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape16;
                    f15 = f11112;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState16;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f11113;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
            }
            i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i29 |= i32;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U117 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U117;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U118 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U118;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState14 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape17 = shape2;
                float f11114 = f14;
                ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f11115 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState17 = bottomSheetScaffoldState2;
                int i4117 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i4118 = i36 << 15;
                a(modifier3, function5, content, composableLambda117, composableLambda118, f13, (Function0) objRememberedValue, bottomSheetState14, j15, j14, composerStartRestartGroup, i4117 | (234881024 & i4118) | (i4118 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape17;
                f15 = f11114;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState17;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f11115;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U119 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U119;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U1110 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U1110;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState15 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape18 = shape2;
                float f11116 = f14;
                ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f11117 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda1110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState18 = bottomSheetScaffoldState2;
                int i4119 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i41110 = i36 << 15;
                a(modifier3, function5, content, composableLambda119, composableLambda1110, f13, (Function0) objRememberedValue, bottomSheetState15, j15, j14, composerStartRestartGroup, i4119 | (234881024 & i41110) | (i41110 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape18;
                f15 = f11116;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState18;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f11117;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
        }
        i13 |= 48;
        if ((i10 & 896) != 0) {
            i13 |= ((i12 & 4) == 0 || !composerStartRestartGroup.changed(bottomSheetScaffoldState)) ? 128 : 256;
        }
        i14 = i12 & 8;
        i15 = 1024;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = 8192;
            if ((i10 & 57344) != 0) {
                if ((i12 & 16) == 0) {
                    i39 = 8192;
                } else {
                    i39 = 8192;
                }
                i13 |= i39;
            }
            if ((i10 & 458752) != 0) {
                if ((i12 & 32) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i13 |= i38;
            }
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i37 = 524288;
                } else {
                    i37 = 524288;
                }
                i13 |= i37;
            }
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f10)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            i20 = i12 & 256;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(f11)) {
                    i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            i22 = i12 & 512;
            if (i22 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i12 & 1024;
            if (i24 != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            i27 = i12 & 2048;
            if (i27 != 0) {
                i25 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i25 |= i28;
            }
            i29 = i25;
            i30 = i12 & 4096;
            if (i30 != 0) {
                if ((i11 & 896) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i31 = 256;
                    } else {
                        i31 = 128;
                    }
                    i29 |= i31;
                }
                if ((i11 & 7168) != 0) {
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i29 |= i15;
                }
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i29 |= i17;
                }
                if ((i12 & 32768) != 0) {
                    if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i32 = 131072;
                        } else {
                            i32 = 65536;
                        }
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U1111 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U1111;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U1112 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U1112;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState16 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape19 = shape2;
                        float f11118 = f14;
                        ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f11119 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda1112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState19 = bottomSheetScaffoldState2;
                        int i41111 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i41112 = i36 << 15;
                        a(modifier3, function5, content, composableLambda1111, composableLambda1112, f13, (Function0) objRememberedValue, bottomSheetState16, j15, j14, composerStartRestartGroup, i41111 | (234881024 & i41112) | (i41112 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape19;
                        f15 = f11118;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState19;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f11119;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U1113 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U1113;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        } else {
                            if (i40 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i13 &= -897;
                            } else {
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                            }
                            if (i14 != 0) {
                                fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                            } else {
                                fM924getSheetPeekHeightD9Ej5fM = f6;
                            }
                            if ((i12 & 16) != 0) {
                                i33 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i13 &= -57345;
                            } else {
                                i33 = 6;
                                expandedShape = shape;
                            }
                            f12 = fM924getSheetPeekHeightD9Ej5fM;
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 64) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            } else {
                                jM1014contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if (i20 != 0) {
                                fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM2 = f11;
                            }
                            if (i22 != 0) {
                                function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                            } else {
                                function2M1032getLambda1$material3_release = function2;
                            }
                            if (i24 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i27 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i30 != 0) {
                                function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                            } else {
                                function3M1033getLambda2$material3_release = function4;
                            }
                            if ((i12 & 8192) != 0) {
                                i34 = i29 & (-7169);
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            } else {
                                i34 = i29;
                                jM978getSurface0d7_KjU = j12;
                            }
                            function6 = function2M1032getLambda1$material3_release;
                            if ((i12 & 16384) != 0) {
                                long jM1014contentColorForek8zF_U1114 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                i36 = (-57345) & i34;
                                i35 = i13;
                                function8 = function3M1033getLambda2$material3_release;
                                j14 = jM1014contentColorForek8zF_U1114;
                                modifier3 = modifier2;
                                f13 = f12;
                                f14 = fM923getElevationD9Ej5fM2;
                                j15 = jM978getSurface0d7_KjU;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function7 = function6;
                                z12 = z11;
                                shape2 = expandedShape;
                            } else {
                                modifier3 = modifier2;
                                j14 = j13;
                                i35 = i13;
                                j15 = jM978getSurface0d7_KjU;
                                i36 = i34;
                                f13 = f12;
                                function7 = function6;
                                z12 = z11;
                                function8 = function3M1033getLambda2$material3_release;
                                shape2 = expandedShape;
                                f14 = fM923getElevationD9Ej5fM2;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                        }
                        SheetState bottomSheetState17 = bottomSheetScaffoldState2.getBottomSheetState();
                        Shape shape110 = shape2;
                        float f111110 = f14;
                        ComposableLambda composableLambda1113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                        float f111111 = fM923getElevationD9Ej5fM;
                        ComposableLambda composableLambda1114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(bottomSheetScaffoldState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BottomSheetScaffoldState bottomSheetScaffoldState110 = bottomSheetScaffoldState2;
                        int i41113 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                        int i41114 = i36 << 15;
                        a(modifier3, function5, content, composableLambda1113, composableLambda1114, f13, (Function0) objRememberedValue, bottomSheetState17, j15, j14, composerStartRestartGroup, i41113 | (234881024 & i41114) | (i41114 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape110;
                        f15 = f111110;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState110;
                        f16 = f13;
                        function9 = function7;
                        z13 = z12;
                        function10 = function8;
                        f17 = f111111;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
                }
                i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i29 |= i32;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U1115 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U1115;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U1116 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U1116;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState18 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape111 = shape2;
                    float f111112 = f14;
                    ComposableLambda composableLambda1115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f111113 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda1116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState111 = bottomSheetScaffoldState2;
                    int i41115 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i41116 = i36 << 15;
                    a(modifier3, function5, content, composableLambda1115, composableLambda1116, f13, (Function0) objRememberedValue, bottomSheetState18, j15, j14, composerStartRestartGroup, i41115 | (234881024 & i41116) | (i41116 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape111;
                    f15 = f111112;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState111;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f111113;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U1117 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U1117;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U1118 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U1118;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState19 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape112 = shape2;
                    float f111114 = f14;
                    ComposableLambda composableLambda1117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f111115 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda1118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState112 = bottomSheetScaffoldState2;
                    int i41117 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i41118 = i36 << 15;
                    a(modifier3, function5, content, composableLambda1117, composableLambda1118, f13, (Function0) objRememberedValue, bottomSheetState19, j15, j14, composerStartRestartGroup, i41117 | (234881024 & i41118) | (i41118 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape112;
                    f15 = f111114;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState112;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f111115;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
            }
            i29 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            if ((i11 & 7168) != 0) {
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i29 |= i15;
            }
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i29 |= i17;
            }
            if ((i12 & 32768) != 0) {
                if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i32 = 131072;
                    } else {
                        i32 = 65536;
                    }
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U1119 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U1119;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U11110 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U11110;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState110 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape113 = shape2;
                    float f111116 = f14;
                    ComposableLambda composableLambda1119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f111117 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda11110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState113 = bottomSheetScaffoldState2;
                    int i41119 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i411110 = i36 << 15;
                    a(modifier3, function5, content, composableLambda1119, composableLambda11110, f13, (Function0) objRememberedValue, bottomSheetState110, j15, j14, composerStartRestartGroup, i41119 | (234881024 & i411110) | (i411110 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape113;
                    f15 = f111116;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState113;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f111117;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U11111 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U11111;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U11112 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U11112;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState111 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape114 = shape2;
                    float f111118 = f14;
                    ComposableLambda composableLambda11111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f111119 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda11112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState114 = bottomSheetScaffoldState2;
                    int i411111 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i411112 = i36 << 15;
                    a(modifier3, function5, content, composableLambda11111, composableLambda11112, f13, (Function0) objRememberedValue, bottomSheetState111, j15, j14, composerStartRestartGroup, i411111 | (234881024 & i411112) | (i411112 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape114;
                    f15 = f111118;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState114;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f111119;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
            }
            i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i29 |= i32;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U11113 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U11113;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U11114 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U11114;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState112 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape115 = shape2;
                float f1111110 = f14;
                ComposableLambda composableLambda11113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f1111111 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda11114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState115 = bottomSheetScaffoldState2;
                int i411113 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i411114 = i36 << 15;
                a(modifier3, function5, content, composableLambda11113, composableLambda11114, f13, (Function0) objRememberedValue, bottomSheetState112, j15, j14, composerStartRestartGroup, i411113 | (234881024 & i411114) | (i411114 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape115;
                f15 = f1111110;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState115;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f1111111;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U11115 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U11115;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U11116 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U11116;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState113 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape116 = shape2;
                float f1111112 = f14;
                ComposableLambda composableLambda11115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f1111113 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda11116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState116 = bottomSheetScaffoldState2;
                int i411115 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i411116 = i36 << 15;
                a(modifier3, function5, content, composableLambda11115, composableLambda11116, f13, (Function0) objRememberedValue, bottomSheetState113, j15, j14, composerStartRestartGroup, i411115 | (234881024 & i411116) | (i411116 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape116;
                f15 = f1111112;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState116;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f1111113;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
        }
        i13 |= 3072;
        i17 = 8192;
        if ((i10 & 57344) != 0) {
            if ((i12 & 16) == 0) {
                i39 = 8192;
            } else {
                i39 = 8192;
            }
            i13 |= i39;
        }
        if ((i10 & 458752) != 0) {
            if ((i12 & 32) == 0) {
                i38 = 65536;
            } else {
                i38 = 65536;
            }
            i13 |= i38;
        }
        if ((i10 & 3670016) != 0) {
            if ((i12 & 64) == 0) {
                i37 = 524288;
            } else {
                i37 = 524288;
            }
            i13 |= i37;
        }
        i18 = i12 & 128;
        if (i18 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f10)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i13 |= i19;
        }
        i20 = i12 & 256;
        if (i20 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(f11)) {
                i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i21 = 33554432;
            }
            i13 |= i21;
        }
        i22 = i12 & 512;
        if (i22 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i23 = PKIFailureInfo.duplicateCertReq;
            } else {
                i23 = 268435456;
            }
            i13 |= i23;
        }
        i24 = i12 & 1024;
        if (i24 != 0) {
            i25 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i11 | i26;
        } else {
            i25 = i11;
        }
        i27 = i12 & 2048;
        if (i27 != 0) {
            i25 |= 48;
        } else if ((i11 & 112) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i25 |= i28;
        }
        i29 = i25;
        i30 = i12 & 4096;
        if (i30 != 0) {
            if ((i11 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i31 = 256;
                } else {
                    i31 = 128;
                }
                i29 |= i31;
            }
            if ((i11 & 7168) != 0) {
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i29 |= i15;
            }
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i29 |= i17;
            }
            if ((i12 & 32768) != 0) {
                if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i32 = 131072;
                    } else {
                        i32 = 65536;
                    }
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U11117 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U11117;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U11118 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U11118;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState114 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape117 = shape2;
                    float f1111114 = f14;
                    ComposableLambda composableLambda11117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f1111115 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda11118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState117 = bottomSheetScaffoldState2;
                    int i411117 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i411118 = i36 << 15;
                    a(modifier3, function5, content, composableLambda11117, composableLambda11118, f13, (Function0) objRememberedValue, bottomSheetState114, j15, j14, composerStartRestartGroup, i411117 | (234881024 & i411118) | (i411118 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape117;
                    f15 = f1111114;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState117;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f1111115;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U11119 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U11119;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    } else {
                        if (i40 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i13 &= -897;
                        } else {
                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                        }
                        if (i14 != 0) {
                            fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                        } else {
                            fM924getSheetPeekHeightD9Ej5fM = f6;
                        }
                        if ((i12 & 16) != 0) {
                            i33 = 6;
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i13 &= -57345;
                        } else {
                            i33 = 6;
                            expandedShape = shape;
                        }
                        f12 = fM924getSheetPeekHeightD9Ej5fM;
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 64) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if (i20 != 0) {
                            fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM2 = f11;
                        }
                        if (i22 != 0) {
                            function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                        } else {
                            function2M1032getLambda1$material3_release = function2;
                        }
                        if (i24 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i27 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i30 != 0) {
                            function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                        } else {
                            function3M1033getLambda2$material3_release = function4;
                        }
                        if ((i12 & 8192) != 0) {
                            i34 = i29 & (-7169);
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        } else {
                            i34 = i29;
                            jM978getSurface0d7_KjU = j12;
                        }
                        function6 = function2M1032getLambda1$material3_release;
                        if ((i12 & 16384) != 0) {
                            long jM1014contentColorForek8zF_U111110 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                            i36 = (-57345) & i34;
                            i35 = i13;
                            function8 = function3M1033getLambda2$material3_release;
                            j14 = jM1014contentColorForek8zF_U111110;
                            modifier3 = modifier2;
                            f13 = f12;
                            f14 = fM923getElevationD9Ej5fM2;
                            j15 = jM978getSurface0d7_KjU;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function7 = function6;
                            z12 = z11;
                            shape2 = expandedShape;
                        } else {
                            modifier3 = modifier2;
                            j14 = j13;
                            i35 = i13;
                            j15 = jM978getSurface0d7_KjU;
                            i36 = i34;
                            f13 = f12;
                            function7 = function6;
                            z12 = z11;
                            function8 = function3M1033getLambda2$material3_release;
                            shape2 = expandedShape;
                            f14 = fM923getElevationD9Ej5fM2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                    }
                    SheetState bottomSheetState115 = bottomSheetScaffoldState2.getBottomSheetState();
                    Shape shape118 = shape2;
                    float f1111116 = f14;
                    ComposableLambda composableLambda11119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                    float f1111117 = fM923getElevationD9Ej5fM;
                    ComposableLambda composableLambda111110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(bottomSheetScaffoldState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState118 = bottomSheetScaffoldState2;
                    int i411119 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                    int i4111110 = i36 << 15;
                    a(modifier3, function5, content, composableLambda11119, composableLambda111110, f13, (Function0) objRememberedValue, bottomSheetState115, j15, j14, composerStartRestartGroup, i411119 | (234881024 & i4111110) | (i4111110 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape118;
                    f15 = f1111116;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState118;
                    f16 = f13;
                    function9 = function7;
                    z13 = z12;
                    function10 = function8;
                    f17 = f1111117;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
            }
            i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i29 |= i32;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111111 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111111;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111112 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111112;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState116 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape119 = shape2;
                float f1111118 = f14;
                ComposableLambda composableLambda111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f1111119 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda111112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState119 = bottomSheetScaffoldState2;
                int i4111111 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i4111112 = i36 << 15;
                a(modifier3, function5, content, composableLambda111111, composableLambda111112, f13, (Function0) objRememberedValue, bottomSheetState116, j15, j14, composerStartRestartGroup, i4111111 | (234881024 & i4111112) | (i4111112 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape119;
                f15 = f1111118;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState119;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f1111119;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111113 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111113;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111114 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111114;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState117 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape1110 = shape2;
                float f11111110 = f14;
                ComposableLambda composableLambda111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f11111111 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda111114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState1110 = bottomSheetScaffoldState2;
                int i4111113 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i4111114 = i36 << 15;
                a(modifier3, function5, content, composableLambda111113, composableLambda111114, f13, (Function0) objRememberedValue, bottomSheetState117, j15, j14, composerStartRestartGroup, i4111113 | (234881024 & i4111114) | (i4111114 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape1110;
                f15 = f11111110;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState1110;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f11111111;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
        }
        i29 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        if ((i11 & 7168) != 0) {
            if ((i12 & 8192) == 0) {
                i15 = 2048;
            }
            i29 |= i15;
        }
        if ((i11 & 57344) != 0) {
            if ((i12 & 16384) == 0) {
                i17 = 16384;
            }
            i29 |= i17;
        }
        if ((i12 & 32768) != 0) {
            if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i32 = 131072;
                } else {
                    i32 = 65536;
                }
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111115 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111115;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111116 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111116;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState118 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape1111 = shape2;
                float f11111112 = f14;
                ComposableLambda composableLambda111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f11111113 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda111116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState1111 = bottomSheetScaffoldState2;
                int i4111115 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i4111116 = i36 << 15;
                a(modifier3, function5, content, composableLambda111115, composableLambda111116, f13, (Function0) objRememberedValue, bottomSheetState118, j15, j14, composerStartRestartGroup, i4111115 | (234881024 & i4111116) | (i4111116 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape1111;
                f15 = f11111112;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState1111;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f11111113;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111117 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111117;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                } else {
                    if (i40 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    }
                    if (i14 != 0) {
                        fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                    } else {
                        fM924getSheetPeekHeightD9Ej5fM = f6;
                    }
                    if ((i12 & 16) != 0) {
                        i33 = 6;
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        i33 = 6;
                        expandedShape = shape;
                    }
                    f12 = fM924getSheetPeekHeightD9Ej5fM;
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 64) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if (i20 != 0) {
                        fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM2 = f11;
                    }
                    if (i22 != 0) {
                        function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                    } else {
                        function2M1032getLambda1$material3_release = function2;
                    }
                    if (i24 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i27 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i30 != 0) {
                        function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                    } else {
                        function3M1033getLambda2$material3_release = function4;
                    }
                    if ((i12 & 8192) != 0) {
                        i34 = i29 & (-7169);
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    } else {
                        i34 = i29;
                        jM978getSurface0d7_KjU = j12;
                    }
                    function6 = function2M1032getLambda1$material3_release;
                    if ((i12 & 16384) != 0) {
                        long jM1014contentColorForek8zF_U111118 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                        i36 = (-57345) & i34;
                        i35 = i13;
                        function8 = function3M1033getLambda2$material3_release;
                        j14 = jM1014contentColorForek8zF_U111118;
                        modifier3 = modifier2;
                        f13 = f12;
                        f14 = fM923getElevationD9Ej5fM2;
                        j15 = jM978getSurface0d7_KjU;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        function7 = function6;
                        z12 = z11;
                        shape2 = expandedShape;
                    } else {
                        modifier3 = modifier2;
                        j14 = j13;
                        i35 = i13;
                        j15 = jM978getSurface0d7_KjU;
                        i36 = i34;
                        f13 = f12;
                        function7 = function6;
                        z12 = z11;
                        function8 = function3M1033getLambda2$material3_release;
                        shape2 = expandedShape;
                        f14 = fM923getElevationD9Ej5fM2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                }
                SheetState bottomSheetState119 = bottomSheetScaffoldState2.getBottomSheetState();
                Shape shape1112 = shape2;
                float f11111114 = f14;
                ComposableLambda composableLambda111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
                float f11111115 = fM923getElevationD9Ej5fM;
                ComposableLambda composableLambda111118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(bottomSheetScaffoldState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState1112 = bottomSheetScaffoldState2;
                int i4111117 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
                int i4111118 = i36 << 15;
                a(modifier3, function5, content, composableLambda111117, composableLambda111118, f13, (Function0) objRememberedValue, bottomSheetState119, j15, j14, composerStartRestartGroup, i4111117 | (234881024 & i4111118) | (i4111118 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape1112;
                f15 = f11111114;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState1112;
                f16 = f13;
                function9 = function7;
                z13 = z12;
                function10 = function8;
                f17 = f11111115;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
        }
        i32 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i29 |= i32;
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i40 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                }
                if (i14 != 0) {
                    fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                } else {
                    fM924getSheetPeekHeightD9Ej5fM = f6;
                }
                if ((i12 & 16) != 0) {
                    i33 = 6;
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    i33 = 6;
                    expandedShape = shape;
                }
                f12 = fM924getSheetPeekHeightD9Ej5fM;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                } else {
                    containerColor = j10;
                }
                if ((i12 & 64) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                    i13 &= -3670017;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if (i20 != 0) {
                    fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM2 = f11;
                }
                if (i22 != 0) {
                    function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                } else {
                    function2M1032getLambda1$material3_release = function2;
                }
                if (i24 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i27 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i30 != 0) {
                    function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                } else {
                    function3M1033getLambda2$material3_release = function4;
                }
                if ((i12 & 8192) != 0) {
                    i34 = i29 & (-7169);
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                } else {
                    i34 = i29;
                    jM978getSurface0d7_KjU = j12;
                }
                function6 = function2M1032getLambda1$material3_release;
                if ((i12 & 16384) != 0) {
                    long jM1014contentColorForek8zF_U111119 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                    i36 = (-57345) & i34;
                    i35 = i13;
                    function8 = function3M1033getLambda2$material3_release;
                    j14 = jM1014contentColorForek8zF_U111119;
                    modifier3 = modifier2;
                    f13 = f12;
                    f14 = fM923getElevationD9Ej5fM2;
                    j15 = jM978getSurface0d7_KjU;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    function7 = function6;
                    z12 = z11;
                    shape2 = expandedShape;
                } else {
                    modifier3 = modifier2;
                    j14 = j13;
                    i35 = i13;
                    j15 = jM978getSurface0d7_KjU;
                    i36 = i34;
                    f13 = f12;
                    function7 = function6;
                    z12 = z11;
                    function8 = function3M1033getLambda2$material3_release;
                    shape2 = expandedShape;
                    f14 = fM923getElevationD9Ej5fM2;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                }
            } else {
                if (i40 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                }
                if (i14 != 0) {
                    fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                } else {
                    fM924getSheetPeekHeightD9Ej5fM = f6;
                }
                if ((i12 & 16) != 0) {
                    i33 = 6;
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    i33 = 6;
                    expandedShape = shape;
                }
                f12 = fM924getSheetPeekHeightD9Ej5fM;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                } else {
                    containerColor = j10;
                }
                if ((i12 & 64) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                    i13 &= -3670017;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if (i20 != 0) {
                    fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM2 = f11;
                }
                if (i22 != 0) {
                    function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                } else {
                    function2M1032getLambda1$material3_release = function2;
                }
                if (i24 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i27 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i30 != 0) {
                    function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                } else {
                    function3M1033getLambda2$material3_release = function4;
                }
                if ((i12 & 8192) != 0) {
                    i34 = i29 & (-7169);
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                } else {
                    i34 = i29;
                    jM978getSurface0d7_KjU = j12;
                }
                function6 = function2M1032getLambda1$material3_release;
                if ((i12 & 16384) != 0) {
                    long jM1014contentColorForek8zF_U1111110 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                    i36 = (-57345) & i34;
                    i35 = i13;
                    function8 = function3M1033getLambda2$material3_release;
                    j14 = jM1014contentColorForek8zF_U1111110;
                    modifier3 = modifier2;
                    f13 = f12;
                    f14 = fM923getElevationD9Ej5fM2;
                    j15 = jM978getSurface0d7_KjU;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    function7 = function6;
                    z12 = z11;
                    shape2 = expandedShape;
                } else {
                    modifier3 = modifier2;
                    j14 = j13;
                    i35 = i13;
                    j15 = jM978getSurface0d7_KjU;
                    i36 = i34;
                    f13 = f12;
                    function7 = function6;
                    z12 = z11;
                    function8 = function3M1033getLambda2$material3_release;
                    shape2 = expandedShape;
                    f14 = fM923getElevationD9Ej5fM2;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
            }
            SheetState bottomSheetState1110 = bottomSheetScaffoldState2.getBottomSheetState();
            Shape shape1113 = shape2;
            float f11111116 = f14;
            ComposableLambda composableLambda111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
            float f11111117 = fM923getElevationD9Ej5fM;
            ComposableLambda composableLambda1111110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(bottomSheetScaffoldState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(bottomSheetScaffoldState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BottomSheetScaffoldState bottomSheetScaffoldState1113 = bottomSheetScaffoldState2;
            int i4111119 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
            int i41111110 = i36 << 15;
            a(modifier3, function5, content, composableLambda111119, composableLambda1111110, f13, (Function0) objRememberedValue, bottomSheetState1110, j15, j14, composerStartRestartGroup, i4111119 | (234881024 & i41111110) | (i41111110 & 1879048192));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape3 = shape1113;
            f15 = f11111116;
            bottomSheetScaffoldState3 = bottomSheetScaffoldState1113;
            f16 = f13;
            function9 = function7;
            z13 = z12;
            function10 = function8;
            f17 = f11111117;
            modifier4 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i40 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                }
                if (i14 != 0) {
                    fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                } else {
                    fM924getSheetPeekHeightD9Ej5fM = f6;
                }
                if ((i12 & 16) != 0) {
                    i33 = 6;
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    i33 = 6;
                    expandedShape = shape;
                }
                f12 = fM924getSheetPeekHeightD9Ej5fM;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                } else {
                    containerColor = j10;
                }
                if ((i12 & 64) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                    i13 &= -3670017;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if (i20 != 0) {
                    fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM2 = f11;
                }
                if (i22 != 0) {
                    function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                } else {
                    function2M1032getLambda1$material3_release = function2;
                }
                if (i24 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i27 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i30 != 0) {
                    function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                } else {
                    function3M1033getLambda2$material3_release = function4;
                }
                if ((i12 & 8192) != 0) {
                    i34 = i29 & (-7169);
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                } else {
                    i34 = i29;
                    jM978getSurface0d7_KjU = j12;
                }
                function6 = function2M1032getLambda1$material3_release;
                if ((i12 & 16384) != 0) {
                    long jM1014contentColorForek8zF_U1111111 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                    i36 = (-57345) & i34;
                    i35 = i13;
                    function8 = function3M1033getLambda2$material3_release;
                    j14 = jM1014contentColorForek8zF_U1111111;
                    modifier3 = modifier2;
                    f13 = f12;
                    f14 = fM923getElevationD9Ej5fM2;
                    j15 = jM978getSurface0d7_KjU;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    function7 = function6;
                    z12 = z11;
                    shape2 = expandedShape;
                } else {
                    modifier3 = modifier2;
                    j14 = j13;
                    i35 = i13;
                    j15 = jM978getSurface0d7_KjU;
                    i36 = i34;
                    f13 = f12;
                    function7 = function6;
                    z12 = z11;
                    function8 = function3M1033getLambda2$material3_release;
                    shape2 = expandedShape;
                    f14 = fM923getElevationD9Ej5fM2;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                }
            } else {
                if (i40 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                }
                if (i14 != 0) {
                    fM924getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m924getSheetPeekHeightD9Ej5fM();
                } else {
                    fM924getSheetPeekHeightD9Ej5fM = f6;
                }
                if ((i12 & 16) != 0) {
                    i33 = 6;
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    i33 = 6;
                    expandedShape = shape;
                }
                f12 = fM924getSheetPeekHeightD9Ej5fM;
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i33);
                } else {
                    containerColor = j10;
                }
                if ((i12 & 64) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 15) & 14);
                    i13 &= -3670017;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if (i20 != 0) {
                    fM923getElevationD9Ej5fM2 = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM2 = f11;
                }
                if (i22 != 0) {
                    function2M1032getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1032getLambda1$material3_release();
                } else {
                    function2M1032getLambda1$material3_release = function2;
                }
                if (i24 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i27 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i30 != 0) {
                    function3M1033getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1033getLambda2$material3_release();
                } else {
                    function3M1033getLambda2$material3_release = function4;
                }
                if ((i12 & 8192) != 0) {
                    i34 = i29 & (-7169);
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                } else {
                    i34 = i29;
                    jM978getSurface0d7_KjU = j12;
                }
                function6 = function2M1032getLambda1$material3_release;
                if ((i12 & 16384) != 0) {
                    long jM1014contentColorForek8zF_U1111112 = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                    i36 = (-57345) & i34;
                    i35 = i13;
                    function8 = function3M1033getLambda2$material3_release;
                    j14 = jM1014contentColorForek8zF_U1111112;
                    modifier3 = modifier2;
                    f13 = f12;
                    f14 = fM923getElevationD9Ej5fM2;
                    j15 = jM978getSurface0d7_KjU;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                    function7 = function6;
                    z12 = z11;
                    shape2 = expandedShape;
                } else {
                    modifier3 = modifier2;
                    j14 = j13;
                    i35 = i13;
                    j15 = jM978getSurface0d7_KjU;
                    i36 = i34;
                    f13 = f12;
                    function7 = function6;
                    z12 = z11;
                    function8 = function3M1033getLambda2$material3_release;
                    shape2 = expandedShape;
                    f14 = fM923getElevationD9Ej5fM2;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144898711, i35, i36, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
            }
            SheetState bottomSheetState1111 = bottomSheetScaffoldState2.getBottomSheetState();
            Shape shape1114 = shape2;
            float f11111118 = f14;
            ComposableLambda composableLambda1111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 106433656, true, new a(bottomSheetScaffoldState2, f13, z12, shape2, containerColor, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, f14, function7, sheetContent, i35, i36));
            float f11111119 = fM923getElevationD9Ej5fM;
            ComposableLambda composableLambda1111112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1629779374, true, new b(function8, bottomSheetScaffoldState2, i36));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldState2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(bottomSheetScaffoldState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(bottomSheetScaffoldState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BottomSheetScaffoldState bottomSheetScaffoldState1114 = bottomSheetScaffoldState2;
            int i41111111 = ((i36 >> 9) & 896) | ((i35 >> 3) & 14) | 27648 | (i36 & 112) | ((i35 << 6) & 458752);
            int i41111112 = i36 << 15;
            a(modifier3, function5, content, composableLambda1111111, composableLambda1111112, f13, (Function0) objRememberedValue, bottomSheetState1111, j15, j14, composerStartRestartGroup, i41111111 | (234881024 & i41111112) | (i41111112 & 1879048192));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape3 = shape1114;
            f15 = f11111118;
            bottomSheetScaffoldState3 = bottomSheetScaffoldState1114;
            f16 = f13;
            function9 = function7;
            z13 = z12;
            function10 = function8;
            f17 = f11111119;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(sheetContent, modifier4, bottomSheetScaffoldState3, f16, shape3, containerColor, jM1014contentColorForek8zF_U, f17, f15, function9, z13, function5, function10, j15, j14, content, i10, i11, i12));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_]]")
    public static final void a(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function4, final Function2<? super Composer, ? super Integer, Unit> function5, final float f6, final Function0<Float> function0, final SheetState sheetState, final long j10, final long j11, Composer composer, int i10) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1120561936);
        int i11 = (i10 & 14) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function5) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(sheetState) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        final int i12 = i11;
        if ((1533916891 & i12) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120561936, i12, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:316)");
            }
            Object[] objArr = {function4, function0, function2, modifier, Color.m2498boximpl(j10), Color.m2498boximpl(j11), function3, Dp.m4387boximpl(f6), function5, sheetState};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i13 = 0; i13 < 10; i13++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i13]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function6 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        int height;
                        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
                        long f18296a = constraints.getF18296a();
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a);
                        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(f18296a);
                        long jM4349copyZbe2FdA$default = Constraints.m4349copyZbe2FdA$default(f18296a, 0, 0, 0, 0, 10, null);
                        l0.y yVar = l0.y.Sheet;
                        Function3<Integer, Composer, Integer, Unit> function7 = function4;
                        int i14 = i12;
                        Placeable placeableMo3575measureBRTryo0 = SubcomposeLayout.subcompose(yVar, ComposableLambdaKt.composableLambdaInstance(-1192048628, true, new n(iM4356getMaxHeightimpl, i14, function7))).get(0).mo3575measureBRTryo0(jM4349copyZbe2FdA$default);
                        int iRoundToInt = mk.c.roundToInt(function0.invoke().floatValue());
                        int iMax = Math.max(0, (iM4357getMaxWidthimpl - placeableMo3575measureBRTryo0.getWidth()) / 2);
                        Function2<Composer, Integer, Unit> function8 = function2;
                        Placeable placeableMo3575measureBRTryo1 = function8 != null ? SubcomposeLayout.subcompose(l0.y.TopBar, ComposableLambdaKt.composableLambdaInstance(-873203005, true, new o(i14, function8))).get(0).mo3575measureBRTryo0(jM4349copyZbe2FdA$default) : null;
                        int height2 = placeableMo3575measureBRTryo1 != null ? placeableMo3575measureBRTryo1.getHeight() : 0;
                        Placeable placeable = placeableMo3575measureBRTryo1;
                        Placeable placeableMo3575measureBRTryo2 = SubcomposeLayout.subcompose(l0.y.Body, ComposableLambdaKt.composableLambdaInstance(-1459220575, true, new m(modifier, j10, j11, i12, function3, f6))).get(0).mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(jM4349copyZbe2FdA$default, 0, 0, 0, iM4356getMaxHeightimpl - height2, 7, null));
                        Placeable placeableMo3575measureBRTryo3 = SubcomposeLayout.subcompose(l0.y.Snackbar, function5).get(0).mo3575measureBRTryo0(jM4349copyZbe2FdA$default);
                        int iA = androidx.collection.a.a(placeableMo3575measureBRTryo3, iM4357getMaxWidthimpl, 2);
                        int i15 = WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
                        if (i15 == 1) {
                            height = iRoundToInt - placeableMo3575measureBRTryo3.getHeight();
                        } else {
                            if (i15 != 2 && i15 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            height = iM4356getMaxHeightimpl - placeableMo3575measureBRTryo3.getHeight();
                        }
                        return MeasureScope.CC.q(SubcomposeLayout, iM4357getMaxWidthimpl, iM4356getMaxHeightimpl, null, new k(placeableMo3575measureBRTryo2, height2, placeable, placeableMo3575measureBRTryo0, iMax, iRoundToInt, placeableMo3575measureBRTryo3, iA, height), 4, null);
                    }
                };
                composer2.updateRememberedValue(function6);
                objRememberedValue = function6;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(f6, i10, j10, j11, sheetState, modifier, function0, function2, function5, function3, function4));
    }

    public static final AnchorChangeHandler access$BottomSheetScaffoldAnchorChangeHandler(final SheetState sheetState, final Function2 function2, final Function1 function1) {
        return new AnchorChangeHandler<SheetValue>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1

            /* JADX INFO: compiled from: BottomSheetScaffold.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material3.AnchorChangeHandler
            public final void onAnchorsChanged(SheetValue sheetValue, Map<SheetValue, Float> previousAnchors, Map<SheetValue, Float> newAnchors) {
                SheetValue sheetValue2;
                SheetValue previousTarget = sheetValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f6 = previousAnchors.get(previousTarget);
                int i10 = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    sheetValue2 = SheetValue.PartiallyExpanded;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sheetValue2 = SheetValue.Expanded;
                    if (!newAnchors.containsKey(sheetValue2)) {
                        sheetValue2 = SheetValue.PartiallyExpanded;
                    }
                }
                if (Intrinsics.areEqual(((Number) bk.q.getValue(newAnchors, sheetValue2)).floatValue(), f6)) {
                    return;
                }
                SheetState sheetState2 = sheetState;
                if (!sheetState2.getSwipeableState$material3_release().isAnimationRunning()) {
                    function1.invoke(sheetValue2);
                } else {
                    function2.invoke(sheetValue2, Float.valueOf(sheetState2.getSwipeableState$material3_release().getLastVelocity()));
                }
            }
        };
    }

    /* JADX INFO: renamed from: access$StandardBottomSheet-8oydGBM, reason: not valid java name */
    public static final void m927access$StandardBottomSheet8oydGBM(final SheetState sheetState, float f6, boolean z10, final float f10, Shape shape, long j10, long j11, float f11, float f12, Function2 function2, Function3 function3, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-763942484);
        if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(f6) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(f10) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i12 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((i10 & 458752) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(j11) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(f11) ? 8388608 : 4194304;
        }
        if ((i10 & 234881024) == 0) {
            i12 |= composerStartRestartGroup.changed(f12) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i10 & 1879048192) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 14) == 0) {
            i13 = i11 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 1533916891) == 306783378 && (i13 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763942484, i12, i13, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:196)");
            }
            Object objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final float fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f6);
            int i14 = i12;
            Orientation orientation = Orientation.Vertical;
            int i15 = i13;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(sheetState) | composerStartRestartGroup.changed(coroutineScope);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == companion.getEmpty()) {
                objRememberedValue = access$BottomSheetScaffoldAnchorChangeHandler(sheetState, new l0.v(sheetState, coroutineScope), new l0.x(sheetState, coroutineScope));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AnchorChangeHandler anchorChangeHandler = (AnchorChangeHandler) objRememberedValue;
            Modifier modifierM326requiredHeightInVpY3zN4$default = SizeKt.m326requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m342widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, null), 0.0f, 1, null), f6, 0.0f, 2, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release = sheetState.getSwipeableState$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(swipeableState$material3_release);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new l0.l(sheetState, coroutineScope));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(NestedScrollModifierKt.nestedScroll$default(modifierM326requiredHeightInVpY3zN4$default, (NestedScrollConnection) objRememberedValue2, null, 2, null), sheetState.getSwipeableState$material3_release(), orientation, z10, false, null, 24, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release2 = sheetState.getSwipeableState$material3_release();
            Set of2 = bk.w.setOf((Object[]) new SheetValue[]{SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded});
            Float fValueOf = Float.valueOf(f10);
            Float fValueOf2 = Float.valueOf(fMo415toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged3 = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(sheetState) | composerStartRestartGroup.changed(fValueOf2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function2<SheetValue, IntSize, Float>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1

                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Float invoke(SheetValue sheetValue, IntSize intSize) {
                        SheetValue value = sheetValue;
                        long f18319a = intSize.getF18319a();
                        Intrinsics.checkNotNullParameter(value, "value");
                        int i16 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
                        float f13 = fMo415toPx0680j_4;
                        SheetState sheetState2 = sheetState;
                        float f14 = f10;
                        if (i16 == 1) {
                            if (sheetState2.getSkipPartiallyExpanded()) {
                                return null;
                            }
                            return Float.valueOf(f14 - f13);
                        }
                        if (i16 == 2) {
                            if (IntSize.m4548getHeightimpl(f18319a) == mk.c.roundToInt(f13)) {
                                return null;
                            }
                            return Float.valueOf(Math.max(0.0f, f14 - IntSize.m4548getHeightimpl(f18319a)));
                        }
                        if (i16 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (sheetState2.getSkipHiddenState()) {
                            return null;
                        }
                        return Float.valueOf(f14);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i16 = i14 >> 9;
            SurfaceKt.m1329SurfaceT9BRK9s(SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material3_release2, of2, anchorChangeHandler, (Function2) objRememberedValue3), shape, j10, j11, f11, f12, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1381492089, true, new p(function2, function3, i15, sheetState, z10, coroutineScope, i14)), composerStartRestartGroup, (i16 & 112) | 12582912 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.t(sheetState, f6, z10, f10, shape, j10, j11, f11, f12, function2, function3, i10, i11));
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable SheetState sheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1474606134);
        if ((i11 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
        }
        if ((i11 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i10, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:166)");
        }
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(sheetState) | composer.changed(snackbarHostState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberStandardBottomSheetState(@Nullable SheetValue sheetValue, @Nullable Function1<? super SheetValue, Boolean> function1, boolean z10, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(678511581);
        if ((i11 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i11 & 2) != 0) {
            function1 = f.f9450p0;
        }
        Function1<? super SheetValue, Boolean> function2 = function1;
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i10, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:188)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, function2, sheetValue2, z11, composer, (i10 & 112) | 6 | ((i10 << 6) & 896) | ((i10 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetStateRememberSheetState;
    }
}
