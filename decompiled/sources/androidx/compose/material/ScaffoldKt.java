package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a¢\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u0013\b\u0002\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0002\b\f¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\"\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalFabPlacement", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,375:1\n25#2:376\n25#2:383\n83#2,3:390\n1097#3,6:377\n1097#3,6:384\n1097#3,6:393\n154#4:399\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n65#1:376\n66#1:383\n237#1:390,3\n65#1:377,6\n66#1:384,6\n237#1:393,6\n372#1:399\n*E\n"})
public final class ScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> f7582a = CompositionLocalKt.staticCompositionLocalOf(a.f7584p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7583b = Dp.m4389constructorimpl(16);

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class a extends Lambda implements Function0<FabPlacement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7584p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ FabPlacement invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f7585p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComposableLambda composableLambda) {
            super(2);
            this.f7585p0 = composableLambda;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(100842932, iIntValue, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                }
                this.f7585p0.invoke(Modifier.INSTANCE, composer2, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Shape E0;
        public final /* synthetic */ float F0;
        public final /* synthetic */ long G0;
        public final /* synthetic */ long H0;
        public final /* synthetic */ long I0;
        public final /* synthetic */ long J0;
        public final /* synthetic */ long K0;
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> L0;
        public final /* synthetic */ int M0;
        public final /* synthetic */ int N0;
        public final /* synthetic */ int O0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7586p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ScaffoldState f7587q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7588r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7589s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> f7590t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7591u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f7592w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7593x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ boolean f7594y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, int i10, boolean z10, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function6, boolean z11, Shape shape, float f6, long j10, long j11, long j12, long j13, long j14, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function7, int i11, int i12, int i13) {
            super(2);
            this.f7586p0 = modifier;
            this.f7587q0 = scaffoldState;
            this.f7588r0 = function2;
            this.f7589s0 = function3;
            this.f7590t0 = function4;
            this.f7591u0 = function5;
            this.v0 = i10;
            this.f7592w0 = z10;
            this.f7593x0 = function6;
            this.f7594y0 = z11;
            this.E0 = shape;
            this.F0 = f6;
            this.G0 = j10;
            this.H0 = j11;
            this.I0 = j12;
            this.J0 = j13;
            this.K0 = j14;
            this.L0 = function7;
            this.M0 = i11;
            this.N0 = i12;
            this.O0 = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ScaffoldKt.m812Scaffold27mzLpw(this.f7586p0, this.f7587q0, this.f7588r0, this.f7589s0, this.f7590t0, this.f7591u0, this.v0, this.f7592w0, this.f7593x0, this.f7594y0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, composer, RecomposeScopeImplKt.updateChangedFlags(this.M0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.N0), this.O0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class d extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> E0;
        public final /* synthetic */ ScaffoldState F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f7595p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7596q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7597r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7598s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7599t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7600u0;
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7601w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7602x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f7603y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j10, long j11, int i10, boolean z10, int i11, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, int i12, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function6, ScaffoldState scaffoldState) {
            super(3);
            this.f7595p0 = j10;
            this.f7596q0 = j11;
            this.f7597r0 = i10;
            this.f7598s0 = z10;
            this.f7599t0 = i11;
            this.f7600u0 = function2;
            this.v0 = function3;
            this.f7601w0 = function4;
            this.f7602x0 = function5;
            this.f7603y0 = i12;
            this.E0 = function6;
            this.F0 = scaffoldState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier childModifier = modifier;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(childModifier) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1823402604, iIntValue, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                }
                long j10 = this.f7595p0;
                long j11 = this.f7596q0;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new t1(this.f7598s0, this.f7599t0, this.f7600u0, this.v0, this.f7601w0, this.f7602x0, this.f7603y0, this.f7597r0, this.E0, this.F0));
                int i10 = 1572864 | (iIntValue & 14);
                int i11 = this.f7597r0 >> 9;
                SurfaceKt.m834SurfaceFjzlyU(childModifier, null, j10, j11, null, 0.0f, composableLambda, composer2, i10 | (i11 & 896) | (i11 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0151  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:113:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:120:0x017f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x018b  */
    /* JADX WARN: Code duplicated, block: B:125:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0196  */
    /* JADX WARN: Code duplicated, block: B:131:0x019a  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01de  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:168:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:171:0x0201  */
    /* JADX WARN: Code duplicated, block: B:173:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x0212  */
    /* JADX WARN: Code duplicated, block: B:180:0x0218  */
    /* JADX WARN: Code duplicated, block: B:182:0x021d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0221  */
    /* JADX WARN: Code duplicated, block: B:186:0x0227  */
    /* JADX WARN: Code duplicated, block: B:187:0x022a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0237  */
    /* JADX WARN: Code duplicated, block: B:196:0x026d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0274  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:225:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:229:0x02de  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:232:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:233:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:235:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:236:0x0301  */
    /* JADX WARN: Code duplicated, block: B:238:0x0305  */
    /* JADX WARN: Code duplicated, block: B:239:0x030c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0310  */
    /* JADX WARN: Code duplicated, block: B:243:0x0318  */
    /* JADX WARN: Code duplicated, block: B:245:0x0320  */
    /* JADX WARN: Code duplicated, block: B:246:0x0322  */
    /* JADX WARN: Code duplicated, block: B:249:0x0327  */
    /* JADX WARN: Code duplicated, block: B:251:0x032b  */
    /* JADX WARN: Code duplicated, block: B:252:0x032d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0336  */
    /* JADX WARN: Code duplicated, block: B:257:0x0345  */
    /* JADX WARN: Code duplicated, block: B:259:0x034a  */
    /* JADX WARN: Code duplicated, block: B:260:0x0351  */
    /* JADX WARN: Code duplicated, block: B:263:0x0357  */
    /* JADX WARN: Code duplicated, block: B:264:0x036d  */
    /* JADX WARN: Code duplicated, block: B:267:0x037b  */
    /* JADX WARN: Code duplicated, block: B:268:0x0386  */
    /* JADX WARN: Code duplicated, block: B:271:0x038c  */
    /* JADX WARN: Code duplicated, block: B:272:0x039b  */
    /* JADX WARN: Code duplicated, block: B:275:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:276:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:279:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:280:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:283:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:286:0x0421  */
    /* JADX WARN: Code duplicated, block: B:287:0x047f  */
    /* JADX WARN: Code duplicated, block: B:290:0x049b  */
    /* JADX WARN: Code duplicated, block: B:295:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114  */
    /* JADX WARN: Code duplicated, block: B:88:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0123  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0131  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x013c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0143  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Scaffold-27mzLpw, reason: not valid java name */
    public static final void m812Scaffold27mzLpw(@Nullable Modifier modifier, @Nullable ScaffoldState scaffoldState, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, int i10, boolean z10, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function6, boolean z11, @Nullable Shape shape, float f6, long j10, long j11, long j12, long j13, long j14, @NotNull Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function2M742getLambda4$material_release;
        int i20;
        int i21;
        int i22;
        int iM772getEnd5ygKITE;
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
        int i33;
        ScaffoldState scaffoldStateRememberScaffoldState;
        Function2<? super Composer, ? super Integer, Unit> function2M739getLambda1$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M740getLambda2$material_release;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M741getLambda3$material_release;
        boolean z12;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7;
        boolean z13;
        boolean z14;
        Shape large;
        int i34;
        float fM749getElevationD9Ej5fM;
        int i35;
        long jM717getSurface0d7_KjU;
        Shape shape2;
        long jM731contentColorForek8zF_U;
        int i36;
        long scrimColor;
        long j15;
        long jM706getBackground0d7_KjU;
        Shape shape3;
        long j16;
        long j17;
        long j18;
        int i37;
        boolean z15;
        boolean z16;
        int i38;
        Modifier modifier2;
        ComposableLambda composableLambda;
        Modifier modifier3;
        float f10;
        Function2<? super Composer, ? super Integer, Unit> function8;
        int i39;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function9;
        long j19;
        long j20;
        Shape shape4;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function10;
        Function2<? super Composer, ? super Integer, Unit> function11;
        boolean z17;
        boolean z18;
        Function2<? super Composer, ? super Integer, Unit> function12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i40;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1037492569);
        int i41 = i13 & 1;
        if (i41 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 112) == 0) {
            i14 |= ((i13 & 2) == 0 && composerStartRestartGroup.changed(scaffoldState)) ? 32 : 16;
        }
        int i42 = i13 & 4;
        int i43 = 128;
        if (i42 == 0) {
            if ((i11 & 896) == 0) {
                i14 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i11 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function2M742getLambda4$material_release = function5;
                } else {
                    function2M742getLambda4$material_release = function5;
                    if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2M742getLambda4$material_release)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i14 |= i20;
                    }
                }
                i21 = i13 & 64;
                i22 = 524288;
                if (i21 != 0) {
                    i14 |= 1572864;
                    iM772getEnd5ygKITE = i10;
                } else {
                    iM772getEnd5ygKITE = i10;
                    if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(iM772getEnd5ygKITE)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 256;
                if (i26 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i27 = 33554432;
                    }
                    i14 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i29 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i29 = 268435456;
                    }
                    i14 |= i29;
                }
                if ((i12 & 14) == 0) {
                    i30 = i12 | (((i13 & 1024) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
                } else {
                    i30 = i12;
                }
                i31 = i13 & 2048;
                if (i31 != 0) {
                    i30 |= 48;
                } else if ((i12 & 112) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i32 = 32;
                    } else {
                        i32 = 16;
                    }
                    i30 |= i32;
                }
                if ((i12 & 896) != 0) {
                    if ((i13 & 4096) == 0 && composerStartRestartGroup.changed(j10)) {
                        i43 = 256;
                    }
                    i30 |= i43;
                }
                if ((i12 & 7168) != 0) {
                    i30 |= ((i13 & 8192) == 0 || !composerStartRestartGroup.changed(j11)) ? 1024 : 2048;
                }
                if ((i12 & 57344) != 0) {
                    i30 |= ((i13 & 16384) == 0 || !composerStartRestartGroup.changed(j12)) ? 8192 : 16384;
                }
                if ((i12 & 458752) != 0) {
                    if ((i13 & 32768) == 0 || !composerStartRestartGroup.changed(j13)) {
                        i40 = 65536;
                    } else {
                        i40 = 131072;
                    }
                    i30 |= i40;
                }
                if ((i12 & 3670016) != 0) {
                    if ((i13 & 65536) == 0 && composerStartRestartGroup.changed(j14)) {
                        i22 = 1048576;
                    }
                    i30 |= i22;
                }
                if ((i13 & 131072) != 0) {
                    if ((i12 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i33 = 8388608;
                        } else {
                            i33 = 4194304;
                        }
                    }
                    if ((i14 & 1533916891) != 306783378 && (i30 & 23967451) == 4793490 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scaffoldStateRememberScaffoldState = scaffoldState;
                        function12 = function2;
                        function11 = function3;
                        function9 = function4;
                        z17 = z10;
                        z18 = z11;
                        f10 = f6;
                        j19 = j10;
                        jM731contentColorForek8zF_U = j11;
                        j16 = j12;
                        j18 = j13;
                        j20 = j14;
                        function8 = function2M742getLambda4$material_release;
                        i39 = iM772getEnd5ygKITE;
                        function10 = function6;
                        shape4 = shape;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i41 != 0) {
                                modifier = Modifier.INSTANCE;
                            } else {
                                modifier = modifier;
                            }
                            if ((i13 & 2) != 0) {
                                scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i14 &= -113;
                            } else {
                                scaffoldStateRememberScaffoldState = scaffoldState;
                            }
                            if (i42 != 0) {
                                function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                            } else {
                                function2M739getLambda1$material_release = function2;
                            }
                            if (i15 != 0) {
                                function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                            } else {
                                function2M740getLambda2$material_release = function3;
                            }
                            if (i17 != 0) {
                                function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                            } else {
                                function3M741getLambda3$material_release = function4;
                            }
                            if (i19 != 0) {
                                function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                            }
                            if (i21 != 0) {
                                iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                            }
                            if (i24 != 0) {
                                z12 = false;
                            } else {
                                z12 = z10;
                            }
                            function7 = i26 == 0 ? function6 : null;
                            if (i28 != 0) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            z14 = z12;
                            if ((i13 & 1024) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i30 &= -15;
                            } else {
                                large = shape;
                            }
                            i34 = i30;
                            if (i31 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f6;
                            }
                            if ((i13 & 4096) != 0) {
                                i35 = i34 & (-897);
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            } else {
                                i35 = i34;
                                jM717getSurface0d7_KjU = j10;
                            }
                            shape2 = large;
                            if ((i13 & 8192) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                                i35 &= -7169;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if ((i13 & 16384) != 0) {
                                i36 = 6;
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i35 &= -57345;
                            } else {
                                i36 = 6;
                                scrimColor = j12;
                            }
                            j15 = scrimColor;
                            if ((i13 & 32768) != 0) {
                                jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                                i35 &= -458753;
                            } else {
                                jM706getBackground0d7_KjU = j13;
                            }
                            if ((i13 & 65536) != 0) {
                                long jM731contentColorForek8zF_U2 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                                i35 &= -3670017;
                                shape3 = shape2;
                                j18 = jM706getBackground0d7_KjU;
                                i37 = i14;
                                j17 = jM731contentColorForek8zF_U2;
                                z15 = z14;
                                z16 = z13;
                                j16 = j15;
                            } else {
                                shape3 = shape2;
                                j16 = j15;
                                j17 = j14;
                                j18 = jM706getBackground0d7_KjU;
                                i37 = i14;
                                z15 = z14;
                                z16 = z13;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i13 & 2) != 0) {
                                i14 &= -113;
                            }
                            if ((i13 & 1024) != 0) {
                                i30 &= -15;
                            }
                            i35 = i30;
                            if ((i13 & 4096) != 0) {
                                i35 &= -897;
                            }
                            if ((i13 & 8192) != 0) {
                                i35 &= -7169;
                            }
                            if ((i13 & 16384) != 0) {
                                i35 &= -57345;
                            }
                            if ((i13 & 32768) != 0) {
                                i35 &= -458753;
                            }
                            if ((i13 & 65536) != 0) {
                                i35 &= -3670017;
                            }
                            scaffoldStateRememberScaffoldState = scaffoldState;
                            function2M739getLambda1$material_release = function2;
                            function2M740getLambda2$material_release = function3;
                            function3M741getLambda3$material_release = function4;
                            z15 = z10;
                            function7 = function6;
                            z16 = z11;
                            shape3 = shape;
                            fM749getElevationD9Ej5fM = f6;
                            jM717getSurface0d7_KjU = j10;
                            jM731contentColorForek8zF_U = j11;
                            j16 = j12;
                            j18 = j13;
                            j17 = j14;
                            i37 = i14;
                        }
                        i38 = i35;
                        modifier2 = modifier;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                        }
                        boolean z19 = z15;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                        if (function7 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1013848234);
                            int i44 = i38 << 12;
                            DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i44 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i44 & 57344) | (i44 & 458752) | (i44 & 3670016) | (i44 & 29360128), 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1013847725);
                            composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        f10 = fM749getElevationD9Ej5fM;
                        function8 = function2M742getLambda4$material_release;
                        i39 = iM772getEnd5ygKITE;
                        function9 = function3M741getLambda3$material_release;
                        j19 = jM717getSurface0d7_KjU;
                        j20 = j17;
                        shape4 = shape3;
                        function10 = function7;
                        function11 = function2M740getLambda2$material_release;
                        z17 = z19;
                        z18 = z16;
                        function12 = function2M739getLambda1$material_release;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
                }
                i33 = 12582912;
                i30 |= i33;
                if ((i14 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U3 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U3;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    } else {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U4 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U4;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    }
                    i38 = i35;
                    modifier2 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    boolean z110 = z15;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                    if (function7 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i45 = i38 << 12;
                        DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i45 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | (i45 & 29360128), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f10 = fM749getElevationD9Ej5fM;
                    function8 = function2M742getLambda4$material_release;
                    i39 = iM772getEnd5ygKITE;
                    function9 = function3M741getLambda3$material_release;
                    j19 = jM717getSurface0d7_KjU;
                    j20 = j17;
                    shape4 = shape3;
                    function10 = function7;
                    function11 = function2M740getLambda2$material_release;
                    z17 = z110;
                    z18 = z16;
                    function12 = function2M739getLambda1$material_release;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U5 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U5;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    } else {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U6 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U6;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    }
                    i38 = i35;
                    modifier2 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    boolean z111 = z15;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                    if (function7 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i46 = i38 << 12;
                        DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i46 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f10 = fM749getElevationD9Ej5fM;
                    function8 = function2M742getLambda4$material_release;
                    i39 = iM772getEnd5ygKITE;
                    function9 = function3M741getLambda3$material_release;
                    j19 = jM717getSurface0d7_KjU;
                    j20 = j17;
                    shape4 = shape3;
                    function10 = function7;
                    function11 = function2M740getLambda2$material_release;
                    z17 = z111;
                    z18 = z16;
                    function12 = function2M739getLambda1$material_release;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
            }
            i14 |= 3072;
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function2M742getLambda4$material_release = function5;
            } else {
                function2M742getLambda4$material_release = function5;
                if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2M742getLambda4$material_release)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
            }
            i21 = i13 & 64;
            i22 = 524288;
            if (i21 != 0) {
                i14 |= 1572864;
                iM772getEnd5ygKITE = i10;
            } else {
                iM772getEnd5ygKITE = i10;
                if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(iM772getEnd5ygKITE)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i29 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            if ((i12 & 14) == 0) {
                i30 = i12 | (((i13 & 1024) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
            } else {
                i30 = i12;
            }
            i31 = i13 & 2048;
            if (i31 != 0) {
                i30 |= 48;
            } else if ((i12 & 112) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i32 = 32;
                } else {
                    i32 = 16;
                }
                i30 |= i32;
            }
            if ((i12 & 896) != 0) {
                if ((i13 & 4096) == 0) {
                    i43 = 256;
                }
                i30 |= i43;
            }
            if ((i12 & 7168) != 0) {
                i30 |= ((i13 & 8192) == 0 || !composerStartRestartGroup.changed(j11)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i30 |= ((i13 & 16384) == 0 || !composerStartRestartGroup.changed(j12)) ? 8192 : 16384;
            }
            if ((i12 & 458752) != 0) {
                if ((i13 & 32768) == 0) {
                    i40 = 65536;
                } else {
                    i40 = 65536;
                }
                i30 |= i40;
            }
            if ((i12 & 3670016) != 0) {
                if ((i13 & 65536) == 0) {
                    i22 = 1048576;
                }
                i30 |= i22;
            }
            if ((i13 & 131072) != 0) {
                if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i33 = 8388608;
                    } else {
                        i33 = 4194304;
                    }
                }
                if ((i14 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U7 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U7;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    } else {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U8 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U8;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    }
                    i38 = i35;
                    modifier2 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    boolean z112 = z15;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                    if (function7 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i47 = i38 << 12;
                        DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i47 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i47 & 57344) | (i47 & 458752) | (i47 & 3670016) | (i47 & 29360128), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f10 = fM749getElevationD9Ej5fM;
                    function8 = function2M742getLambda4$material_release;
                    i39 = iM772getEnd5ygKITE;
                    function9 = function3M741getLambda3$material_release;
                    j19 = jM717getSurface0d7_KjU;
                    j20 = j17;
                    shape4 = shape3;
                    function10 = function7;
                    function11 = function2M740getLambda2$material_release;
                    z17 = z112;
                    z18 = z16;
                    function12 = function2M739getLambda1$material_release;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U9 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U9;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    } else {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U10 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U10;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    }
                    i38 = i35;
                    modifier2 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    boolean z113 = z15;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                    if (function7 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i48 = i38 << 12;
                        DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i48 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i48 & 57344) | (i48 & 458752) | (i48 & 3670016) | (i48 & 29360128), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f10 = fM749getElevationD9Ej5fM;
                    function8 = function2M742getLambda4$material_release;
                    i39 = iM772getEnd5ygKITE;
                    function9 = function3M741getLambda3$material_release;
                    j19 = jM717getSurface0d7_KjU;
                    j20 = j17;
                    shape4 = shape3;
                    function10 = function7;
                    function11 = function2M740getLambda2$material_release;
                    z17 = z113;
                    z18 = z16;
                    function12 = function2M739getLambda1$material_release;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
            }
            i33 = 12582912;
            i30 |= i33;
            if ((i14 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U11 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U11;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                } else {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U12 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U12;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                }
                i38 = i35;
                modifier2 = modifier;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                boolean z114 = z15;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                if (function7 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i49 = i38 << 12;
                    DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i49 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016) | (i49 & 29360128), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f10 = fM749getElevationD9Ej5fM;
                function8 = function2M742getLambda4$material_release;
                i39 = iM772getEnd5ygKITE;
                function9 = function3M741getLambda3$material_release;
                j19 = jM717getSurface0d7_KjU;
                j20 = j17;
                shape4 = shape3;
                function10 = function7;
                function11 = function2M740getLambda2$material_release;
                z17 = z114;
                z18 = z16;
                function12 = function2M739getLambda1$material_release;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U13 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U13;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                } else {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U14 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U14;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                }
                i38 = i35;
                modifier2 = modifier;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                boolean z115 = z15;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                if (function7 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i410 = i38 << 12;
                    DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i410 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i410 & 57344) | (i410 & 458752) | (i410 & 3670016) | (i410 & 29360128), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f10 = fM749getElevationD9Ej5fM;
                function8 = function2M742getLambda4$material_release;
                i39 = iM772getEnd5ygKITE;
                function9 = function3M741getLambda3$material_release;
                j19 = jM717getSurface0d7_KjU;
                j20 = j17;
                shape4 = shape3;
                function10 = function7;
                function11 = function2M740getLambda2$material_release;
                z17 = z115;
                z18 = z16;
                function12 = function2M739getLambda1$material_release;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
        }
        i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i11 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function2M742getLambda4$material_release = function5;
            } else {
                function2M742getLambda4$material_release = function5;
                if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2M742getLambda4$material_release)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
            }
            i21 = i13 & 64;
            i22 = 524288;
            if (i21 != 0) {
                i14 |= 1572864;
                iM772getEnd5ygKITE = i10;
            } else {
                iM772getEnd5ygKITE = i10;
                if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(iM772getEnd5ygKITE)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i29 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            if ((i12 & 14) == 0) {
                i30 = i12 | (((i13 & 1024) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
            } else {
                i30 = i12;
            }
            i31 = i13 & 2048;
            if (i31 != 0) {
                i30 |= 48;
            } else if ((i12 & 112) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i32 = 32;
                } else {
                    i32 = 16;
                }
                i30 |= i32;
            }
            if ((i12 & 896) != 0) {
                if ((i13 & 4096) == 0) {
                    i43 = 256;
                }
                i30 |= i43;
            }
            if ((i12 & 7168) != 0) {
                i30 |= ((i13 & 8192) == 0 || !composerStartRestartGroup.changed(j11)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i30 |= ((i13 & 16384) == 0 || !composerStartRestartGroup.changed(j12)) ? 8192 : 16384;
            }
            if ((i12 & 458752) != 0) {
                if ((i13 & 32768) == 0) {
                    i40 = 65536;
                } else {
                    i40 = 65536;
                }
                i30 |= i40;
            }
            if ((i12 & 3670016) != 0) {
                if ((i13 & 65536) == 0) {
                    i22 = 1048576;
                }
                i30 |= i22;
            }
            if ((i13 & 131072) != 0) {
                if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i33 = 8388608;
                    } else {
                        i33 = 4194304;
                    }
                }
                if ((i14 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U15 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U15;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    } else {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U16 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U16;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    }
                    i38 = i35;
                    modifier2 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    boolean z116 = z15;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                    if (function7 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i411 = i38 << 12;
                        DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i411 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i411 & 57344) | (i411 & 458752) | (i411 & 3670016) | (i411 & 29360128), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f10 = fM749getElevationD9Ej5fM;
                    function8 = function2M742getLambda4$material_release;
                    i39 = iM772getEnd5ygKITE;
                    function9 = function3M741getLambda3$material_release;
                    j19 = jM717getSurface0d7_KjU;
                    j20 = j17;
                    shape4 = shape3;
                    function10 = function7;
                    function11 = function2M740getLambda2$material_release;
                    z17 = z116;
                    z18 = z16;
                    function12 = function2M739getLambda1$material_release;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U17 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U17;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    } else {
                        if (i41 != 0) {
                            modifier = Modifier.INSTANCE;
                        } else {
                            modifier = modifier;
                        }
                        if ((i13 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i14 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i42 != 0) {
                            function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                        } else {
                            function2M739getLambda1$material_release = function2;
                        }
                        if (i15 != 0) {
                            function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                        } else {
                            function2M740getLambda2$material_release = function3;
                        }
                        if (i17 != 0) {
                            function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                        } else {
                            function3M741getLambda3$material_release = function4;
                        }
                        if (i19 != 0) {
                            function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                        }
                        if (i21 != 0) {
                            iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                        }
                        if (i24 != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        if (i26 == 0) {
                        }
                        if (i28 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        z14 = z12;
                        if ((i13 & 1024) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i30 &= -15;
                        } else {
                            large = shape;
                        }
                        i34 = i30;
                        if (i31 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i13 & 4096) != 0) {
                            i35 = i34 & (-897);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i35 = i34;
                            jM717getSurface0d7_KjU = j10;
                        }
                        shape2 = large;
                        if ((i13 & 8192) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                            i35 &= -7169;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i13 & 16384) != 0) {
                            i36 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i35 &= -57345;
                        } else {
                            i36 = 6;
                            scrimColor = j12;
                        }
                        j15 = scrimColor;
                        if ((i13 & 32768) != 0) {
                            jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                            i35 &= -458753;
                        } else {
                            jM706getBackground0d7_KjU = j13;
                        }
                        if ((i13 & 65536) != 0) {
                            long jM731contentColorForek8zF_U18 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                            i35 &= -3670017;
                            shape3 = shape2;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            j17 = jM731contentColorForek8zF_U18;
                            z15 = z14;
                            z16 = z13;
                            j16 = j15;
                        } else {
                            shape3 = shape2;
                            j16 = j15;
                            j17 = j14;
                            j18 = jM706getBackground0d7_KjU;
                            i37 = i14;
                            z15 = z14;
                            z16 = z13;
                        }
                    }
                    i38 = i35;
                    modifier2 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    boolean z117 = z15;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                    if (function7 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i412 = i38 << 12;
                        DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i412 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i412 & 57344) | (i412 & 458752) | (i412 & 3670016) | (i412 & 29360128), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f10 = fM749getElevationD9Ej5fM;
                    function8 = function2M742getLambda4$material_release;
                    i39 = iM772getEnd5ygKITE;
                    function9 = function3M741getLambda3$material_release;
                    j19 = jM717getSurface0d7_KjU;
                    j20 = j17;
                    shape4 = shape3;
                    function10 = function7;
                    function11 = function2M740getLambda2$material_release;
                    z17 = z117;
                    z18 = z16;
                    function12 = function2M739getLambda1$material_release;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
            }
            i33 = 12582912;
            i30 |= i33;
            if ((i14 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U19 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U19;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                } else {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U110 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U110;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                }
                i38 = i35;
                modifier2 = modifier;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                boolean z118 = z15;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                if (function7 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i413 = i38 << 12;
                    DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i413 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i413 & 57344) | (i413 & 458752) | (i413 & 3670016) | (i413 & 29360128), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f10 = fM749getElevationD9Ej5fM;
                function8 = function2M742getLambda4$material_release;
                i39 = iM772getEnd5ygKITE;
                function9 = function3M741getLambda3$material_release;
                j19 = jM717getSurface0d7_KjU;
                j20 = j17;
                shape4 = shape3;
                function10 = function7;
                function11 = function2M740getLambda2$material_release;
                z17 = z118;
                z18 = z16;
                function12 = function2M739getLambda1$material_release;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U111 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U111;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                } else {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U112 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U112;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                }
                i38 = i35;
                modifier2 = modifier;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                boolean z119 = z15;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                if (function7 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i414 = i38 << 12;
                    DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i414 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i414 & 57344) | (i414 & 458752) | (i414 & 3670016) | (i414 & 29360128), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f10 = fM749getElevationD9Ej5fM;
                function8 = function2M742getLambda4$material_release;
                i39 = iM772getEnd5ygKITE;
                function9 = function3M741getLambda3$material_release;
                j19 = jM717getSurface0d7_KjU;
                j20 = j17;
                shape4 = shape3;
                function10 = function7;
                function11 = function2M740getLambda2$material_release;
                z17 = z119;
                z18 = z16;
                function12 = function2M739getLambda1$material_release;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
        }
        i14 |= 3072;
        i17 = i13 & 16;
        if (i17 != 0) {
            i14 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i14 |= i18;
        }
        i19 = i13 & 32;
        if (i19 != 0) {
            i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function2M742getLambda4$material_release = function5;
        } else {
            function2M742getLambda4$material_release = function5;
            if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function2M742getLambda4$material_release)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
        }
        i21 = i13 & 64;
        i22 = 524288;
        if (i21 != 0) {
            i14 |= 1572864;
            iM772getEnd5ygKITE = i10;
        } else {
            iM772getEnd5ygKITE = i10;
            if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(iM772getEnd5ygKITE)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
        }
        i24 = i13 & 128;
        if (i24 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i14 |= i25;
        }
        i26 = i13 & 256;
        if (i26 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function6)) {
                i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i27 = 33554432;
            }
            i14 |= i27;
        }
        i28 = i13 & 512;
        if (i28 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i29 = PKIFailureInfo.duplicateCertReq;
            } else {
                i29 = 268435456;
            }
            i14 |= i29;
        }
        if ((i12 & 14) == 0) {
            i30 = i12 | (((i13 & 1024) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
        } else {
            i30 = i12;
        }
        i31 = i13 & 2048;
        if (i31 != 0) {
            i30 |= 48;
        } else if ((i12 & 112) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i32 = 32;
            } else {
                i32 = 16;
            }
            i30 |= i32;
        }
        if ((i12 & 896) != 0) {
            if ((i13 & 4096) == 0) {
                i43 = 256;
            }
            i30 |= i43;
        }
        if ((i12 & 7168) != 0) {
            i30 |= ((i13 & 8192) == 0 || !composerStartRestartGroup.changed(j11)) ? 1024 : 2048;
        }
        if ((i12 & 57344) != 0) {
            i30 |= ((i13 & 16384) == 0 || !composerStartRestartGroup.changed(j12)) ? 8192 : 16384;
        }
        if ((i12 & 458752) != 0) {
            if ((i13 & 32768) == 0) {
                i40 = 65536;
            } else {
                i40 = 65536;
            }
            i30 |= i40;
        }
        if ((i12 & 3670016) != 0) {
            if ((i13 & 65536) == 0) {
                i22 = 1048576;
            }
            i30 |= i22;
        }
        if ((i13 & 131072) != 0) {
            if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i33 = 8388608;
                } else {
                    i33 = 4194304;
                }
            }
            if ((i14 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U113 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U113;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                } else {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U114 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U114;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                }
                i38 = i35;
                modifier2 = modifier;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                boolean z1110 = z15;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                if (function7 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i415 = i38 << 12;
                    DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i415 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i415 & 57344) | (i415 & 458752) | (i415 & 3670016) | (i415 & 29360128), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f10 = fM749getElevationD9Ej5fM;
                function8 = function2M742getLambda4$material_release;
                i39 = iM772getEnd5ygKITE;
                function9 = function3M741getLambda3$material_release;
                j19 = jM717getSurface0d7_KjU;
                j20 = j17;
                shape4 = shape3;
                function10 = function7;
                function11 = function2M740getLambda2$material_release;
                z17 = z1110;
                z18 = z16;
                function12 = function2M739getLambda1$material_release;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U115 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U115;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                } else {
                    if (i41 != 0) {
                        modifier = Modifier.INSTANCE;
                    } else {
                        modifier = modifier;
                    }
                    if ((i13 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i14 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i42 != 0) {
                        function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                    } else {
                        function2M739getLambda1$material_release = function2;
                    }
                    if (i15 != 0) {
                        function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                    } else {
                        function2M740getLambda2$material_release = function3;
                    }
                    if (i17 != 0) {
                        function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                    } else {
                        function3M741getLambda3$material_release = function4;
                    }
                    if (i19 != 0) {
                        function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                    }
                    if (i21 != 0) {
                        iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                    }
                    if (i24 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    if (i26 == 0) {
                    }
                    if (i28 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    z14 = z12;
                    if ((i13 & 1024) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i30 &= -15;
                    } else {
                        large = shape;
                    }
                    i34 = i30;
                    if (i31 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i13 & 4096) != 0) {
                        i35 = i34 & (-897);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i35 = i34;
                        jM717getSurface0d7_KjU = j10;
                    }
                    shape2 = large;
                    if ((i13 & 8192) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                        i35 &= -7169;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i13 & 16384) != 0) {
                        i36 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i35 &= -57345;
                    } else {
                        i36 = 6;
                        scrimColor = j12;
                    }
                    j15 = scrimColor;
                    if ((i13 & 32768) != 0) {
                        jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                        i35 &= -458753;
                    } else {
                        jM706getBackground0d7_KjU = j13;
                    }
                    if ((i13 & 65536) != 0) {
                        long jM731contentColorForek8zF_U116 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                        i35 &= -3670017;
                        shape3 = shape2;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        j17 = jM731contentColorForek8zF_U116;
                        z15 = z14;
                        z16 = z13;
                        j16 = j15;
                    } else {
                        shape3 = shape2;
                        j16 = j15;
                        j17 = j14;
                        j18 = jM706getBackground0d7_KjU;
                        i37 = i14;
                        z15 = z14;
                        z16 = z13;
                    }
                }
                i38 = i35;
                modifier2 = modifier;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                boolean z1111 = z15;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
                if (function7 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i416 = i38 << 12;
                    DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i416 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i416 & 57344) | (i416 & 458752) | (i416 & 3670016) | (i416 & 29360128), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f10 = fM749getElevationD9Ej5fM;
                function8 = function2M742getLambda4$material_release;
                i39 = iM772getEnd5ygKITE;
                function9 = function3M741getLambda3$material_release;
                j19 = jM717getSurface0d7_KjU;
                j20 = j17;
                shape4 = shape3;
                function10 = function7;
                function11 = function2M740getLambda2$material_release;
                z17 = z1111;
                z18 = z16;
                function12 = function2M739getLambda1$material_release;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
        }
        i33 = 12582912;
        i30 |= i33;
        if ((i14 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i41 != 0) {
                    modifier = Modifier.INSTANCE;
                } else {
                    modifier = modifier;
                }
                if ((i13 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i14 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i42 != 0) {
                    function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                } else {
                    function2M739getLambda1$material_release = function2;
                }
                if (i15 != 0) {
                    function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                } else {
                    function2M740getLambda2$material_release = function3;
                }
                if (i17 != 0) {
                    function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                } else {
                    function3M741getLambda3$material_release = function4;
                }
                if (i19 != 0) {
                    function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                }
                if (i21 != 0) {
                    iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                }
                if (i24 != 0) {
                    z12 = false;
                } else {
                    z12 = z10;
                }
                if (i26 == 0) {
                }
                if (i28 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                z14 = z12;
                if ((i13 & 1024) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i30 &= -15;
                } else {
                    large = shape;
                }
                i34 = i30;
                if (i31 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i13 & 4096) != 0) {
                    i35 = i34 & (-897);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i35 = i34;
                    jM717getSurface0d7_KjU = j10;
                }
                shape2 = large;
                if ((i13 & 8192) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                    i35 &= -7169;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i13 & 16384) != 0) {
                    i36 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i35 &= -57345;
                } else {
                    i36 = 6;
                    scrimColor = j12;
                }
                j15 = scrimColor;
                if ((i13 & 32768) != 0) {
                    jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                    i35 &= -458753;
                } else {
                    jM706getBackground0d7_KjU = j13;
                }
                if ((i13 & 65536) != 0) {
                    long jM731contentColorForek8zF_U117 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                    i35 &= -3670017;
                    shape3 = shape2;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    j17 = jM731contentColorForek8zF_U117;
                    z15 = z14;
                    z16 = z13;
                    j16 = j15;
                } else {
                    shape3 = shape2;
                    j16 = j15;
                    j17 = j14;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    z15 = z14;
                    z16 = z13;
                }
            } else {
                if (i41 != 0) {
                    modifier = Modifier.INSTANCE;
                } else {
                    modifier = modifier;
                }
                if ((i13 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i14 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i42 != 0) {
                    function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                } else {
                    function2M739getLambda1$material_release = function2;
                }
                if (i15 != 0) {
                    function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                } else {
                    function2M740getLambda2$material_release = function3;
                }
                if (i17 != 0) {
                    function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                } else {
                    function3M741getLambda3$material_release = function4;
                }
                if (i19 != 0) {
                    function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                }
                if (i21 != 0) {
                    iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                }
                if (i24 != 0) {
                    z12 = false;
                } else {
                    z12 = z10;
                }
                if (i26 == 0) {
                }
                if (i28 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                z14 = z12;
                if ((i13 & 1024) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i30 &= -15;
                } else {
                    large = shape;
                }
                i34 = i30;
                if (i31 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i13 & 4096) != 0) {
                    i35 = i34 & (-897);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i35 = i34;
                    jM717getSurface0d7_KjU = j10;
                }
                shape2 = large;
                if ((i13 & 8192) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                    i35 &= -7169;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i13 & 16384) != 0) {
                    i36 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i35 &= -57345;
                } else {
                    i36 = 6;
                    scrimColor = j12;
                }
                j15 = scrimColor;
                if ((i13 & 32768) != 0) {
                    jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                    i35 &= -458753;
                } else {
                    jM706getBackground0d7_KjU = j13;
                }
                if ((i13 & 65536) != 0) {
                    long jM731contentColorForek8zF_U118 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                    i35 &= -3670017;
                    shape3 = shape2;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    j17 = jM731contentColorForek8zF_U118;
                    z15 = z14;
                    z16 = z13;
                    j16 = j15;
                } else {
                    shape3 = shape2;
                    j16 = j15;
                    j17 = j14;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    z15 = z14;
                    z16 = z13;
                }
            }
            i38 = i35;
            modifier2 = modifier;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
            }
            boolean z1112 = z15;
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
            if (function7 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1013848234);
                int i417 = i38 << 12;
                DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i417 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i417 & 57344) | (i417 & 458752) | (i417 & 3670016) | (i417 & 29360128), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1013847725);
                composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            f10 = fM749getElevationD9Ej5fM;
            function8 = function2M742getLambda4$material_release;
            i39 = iM772getEnd5ygKITE;
            function9 = function3M741getLambda3$material_release;
            j19 = jM717getSurface0d7_KjU;
            j20 = j17;
            shape4 = shape3;
            function10 = function7;
            function11 = function2M740getLambda2$material_release;
            z17 = z1112;
            z18 = z16;
            function12 = function2M739getLambda1$material_release;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i41 != 0) {
                    modifier = Modifier.INSTANCE;
                } else {
                    modifier = modifier;
                }
                if ((i13 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i14 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i42 != 0) {
                    function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                } else {
                    function2M739getLambda1$material_release = function2;
                }
                if (i15 != 0) {
                    function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                } else {
                    function2M740getLambda2$material_release = function3;
                }
                if (i17 != 0) {
                    function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                } else {
                    function3M741getLambda3$material_release = function4;
                }
                if (i19 != 0) {
                    function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                }
                if (i21 != 0) {
                    iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                }
                if (i24 != 0) {
                    z12 = false;
                } else {
                    z12 = z10;
                }
                if (i26 == 0) {
                }
                if (i28 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                z14 = z12;
                if ((i13 & 1024) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i30 &= -15;
                } else {
                    large = shape;
                }
                i34 = i30;
                if (i31 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i13 & 4096) != 0) {
                    i35 = i34 & (-897);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i35 = i34;
                    jM717getSurface0d7_KjU = j10;
                }
                shape2 = large;
                if ((i13 & 8192) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                    i35 &= -7169;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i13 & 16384) != 0) {
                    i36 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i35 &= -57345;
                } else {
                    i36 = 6;
                    scrimColor = j12;
                }
                j15 = scrimColor;
                if ((i13 & 32768) != 0) {
                    jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                    i35 &= -458753;
                } else {
                    jM706getBackground0d7_KjU = j13;
                }
                if ((i13 & 65536) != 0) {
                    long jM731contentColorForek8zF_U119 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                    i35 &= -3670017;
                    shape3 = shape2;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    j17 = jM731contentColorForek8zF_U119;
                    z15 = z14;
                    z16 = z13;
                    j16 = j15;
                } else {
                    shape3 = shape2;
                    j16 = j15;
                    j17 = j14;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    z15 = z14;
                    z16 = z13;
                }
            } else {
                if (i41 != 0) {
                    modifier = Modifier.INSTANCE;
                } else {
                    modifier = modifier;
                }
                if ((i13 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i14 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i42 != 0) {
                    function2M739getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m739getLambda1$material_release();
                } else {
                    function2M739getLambda1$material_release = function2;
                }
                if (i15 != 0) {
                    function2M740getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m740getLambda2$material_release();
                } else {
                    function2M740getLambda2$material_release = function3;
                }
                if (i17 != 0) {
                    function3M741getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m741getLambda3$material_release();
                } else {
                    function3M741getLambda3$material_release = function4;
                }
                if (i19 != 0) {
                    function2M742getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m742getLambda4$material_release();
                }
                if (i21 != 0) {
                    iM772getEnd5ygKITE = FabPosition.INSTANCE.m772getEnd5ygKITE();
                }
                if (i24 != 0) {
                    z12 = false;
                } else {
                    z12 = z10;
                }
                if (i26 == 0) {
                }
                if (i28 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                z14 = z12;
                if ((i13 & 1024) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i30 &= -15;
                } else {
                    large = shape;
                }
                i34 = i30;
                if (i31 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i13 & 4096) != 0) {
                    i35 = i34 & (-897);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i35 = i34;
                    jM717getSurface0d7_KjU = j10;
                }
                shape2 = large;
                if ((i13 & 8192) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 6) & 14);
                    i35 &= -7169;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i13 & 16384) != 0) {
                    i36 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i35 &= -57345;
                } else {
                    i36 = 6;
                    scrimColor = j12;
                }
                j15 = scrimColor;
                if ((i13 & 32768) != 0) {
                    jM706getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i36).m706getBackground0d7_KjU();
                    i35 &= -458753;
                } else {
                    jM706getBackground0d7_KjU = j13;
                }
                if ((i13 & 65536) != 0) {
                    long jM731contentColorForek8zF_U1110 = ColorsKt.m731contentColorForek8zF_U(jM706getBackground0d7_KjU, composerStartRestartGroup, (i35 >> 15) & 14);
                    i35 &= -3670017;
                    shape3 = shape2;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    j17 = jM731contentColorForek8zF_U1110;
                    z15 = z14;
                    z16 = z13;
                    j16 = j15;
                } else {
                    shape3 = shape2;
                    j16 = j15;
                    j17 = j14;
                    j18 = jM706getBackground0d7_KjU;
                    i37 = i14;
                    z15 = z14;
                    z16 = z13;
                }
            }
            i38 = i35;
            modifier2 = modifier;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037492569, i37, i38, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
            }
            boolean z1113 = z15;
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new d(j18, j17, i38, z15, iM772getEnd5ygKITE, function2M739getLambda1$material_release, content, function2M742getLambda4$material_release, function2M740getLambda2$material_release, i37, function3M741getLambda3$material_release, scaffoldStateRememberScaffoldState));
            if (function7 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1013848234);
                int i418 = i38 << 12;
                DrawerKt.m751ModalDrawerGs3lGvM(function7, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z16, shape3, fM749getElevationD9Ej5fM, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, j16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new b(composableLambda)), composerStartRestartGroup, (i418 & 234881024) | ((i37 >> 24) & 14) | 805306368 | ((i37 << 3) & 112) | ((i37 >> 18) & 7168) | (i418 & 57344) | (i418 & 458752) | (i418 & 3670016) | (i418 & 29360128), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1013847725);
                composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i37 & 14) | 48));
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            f10 = fM749getElevationD9Ej5fM;
            function8 = function2M742getLambda4$material_release;
            i39 = iM772getEnd5ygKITE;
            function9 = function3M741getLambda3$material_release;
            j19 = jM717getSurface0d7_KjU;
            j20 = j17;
            shape4 = shape3;
            function10 = function7;
            function11 = function2M740getLambda2$material_release;
            z17 = z1113;
            z18 = z16;
            function12 = function2M739getLambda1$material_release;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, scaffoldStateRememberScaffoldState, function12, function11, function9, function8, i39, z17, function10, z18, shape4, f10, j19, jM731contentColorForek8zF_U, j16, j18, j20, content, i11, i12, i13));
    }

    /* JADX INFO: renamed from: access$ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m813access$ScaffoldLayoutMDYNRJg(boolean z10, int i10, Function2 function2, Function3 function3, Function2 function4, Function2 function5, Function2 function6, Composer composer, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1401632215);
        int i12 = (i11 & 14) == 0 ? (composerStartRestartGroup.changed(z10) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function6) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((2995931 & i13) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1401632215, i13, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {function2, function4, function5, FabPosition.m764boximpl(i10), Boolean.valueOf(z10), function6, function3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i14 = 0;
            boolean zChanged = false;
            for (int i15 = 7; i14 < i15; i15 = 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i14]);
                i14++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                h0.h2 h2Var = new h0.h2(i10, i13, function2, function4, function5, function6, function3, z10);
                composerStartRestartGroup.updateRememberedValue(h2Var);
                objRememberedValue = h2Var;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.i2(i10, i11, function2, function4, function5, function6, function3, z10));
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return f7582a;
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1569641925);
        if ((i11 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
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
            ComposerKt.traceEventStart(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }
}
