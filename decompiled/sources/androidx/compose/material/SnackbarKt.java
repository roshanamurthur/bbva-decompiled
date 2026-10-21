package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a{\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ac\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "action", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Snackbar", "Landroidx/compose/material/SnackbarData;", "snackbarData", "actionColor", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,364:1\n154#2:365\n154#2:366\n154#2:367\n154#2:675\n154#2:676\n154#2:677\n154#2:678\n154#2:679\n154#2:680\n154#2:681\n154#2:682\n154#2:683\n75#3,14:368\n78#3,11:405\n91#3:437\n91#3:442\n78#3,11:449\n78#3,11:484\n91#3:516\n78#3,11:524\n91#3:556\n91#3:561\n78#3,11:563\n78#3,11:597\n91#3:629\n78#3,11:637\n91#3:669\n91#3:674\n456#4,8:382\n464#4,3:396\n456#4,8:416\n464#4,3:430\n467#4,3:434\n467#4,3:439\n456#4,8:460\n464#4,3:474\n456#4,8:495\n464#4,3:509\n467#4,3:513\n456#4,8:535\n464#4,3:549\n467#4,3:553\n467#4,3:558\n456#4,8:574\n464#4,3:588\n456#4,8:608\n464#4,3:622\n467#4,3:626\n456#4,8:648\n464#4,3:662\n467#4,3:666\n467#4,3:671\n4144#5,6:390\n4144#5,6:424\n4144#5,6:468\n4144#5,6:503\n4144#5,6:543\n4144#5,6:582\n4144#5,6:616\n4144#5,6:656\n66#6,6:399\n72#6:433\n76#6:438\n66#6,6:478\n72#6:512\n76#6:517\n66#6,6:518\n72#6:552\n76#6:557\n66#6,6:591\n72#6:625\n76#6:630\n66#6,6:631\n72#6:665\n76#6:670\n72#7,6:443\n78#7:477\n82#7:562\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n88#1:365\n160#1:366\n175#1:367\n355#1:675\n356#1:676\n357#1:677\n358#1:678\n359#1:679\n360#1:680\n361#1:681\n362#1:682\n363#1:683\n237#1:368,14\n238#1:405,11\n238#1:437\n237#1:442\n275#1:449,11\n283#1:484,11\n283#1:516\n287#1:524,11\n287#1:556\n275#1:561\n298#1:563,11\n300#1:597,11\n300#1:629\n301#1:637,11\n301#1:669\n298#1:674\n237#1:382,8\n237#1:396,3\n238#1:416,8\n238#1:430,3\n238#1:434,3\n237#1:439,3\n275#1:460,8\n275#1:474,3\n283#1:495,8\n283#1:509,3\n283#1:513,3\n287#1:535,8\n287#1:549,3\n287#1:553,3\n275#1:558,3\n298#1:574,8\n298#1:588,3\n300#1:608,8\n300#1:622,3\n300#1:626,3\n301#1:648,8\n301#1:662,3\n301#1:666,3\n298#1:671,3\n237#1:390,6\n238#1:424,6\n275#1:468,6\n283#1:503,6\n287#1:543,6\n298#1:582,6\n300#1:616,6\n301#1:656,6\n238#1:399,6\n238#1:433\n238#1:438\n283#1:478,6\n283#1:512\n283#1:517\n287#1:518,6\n287#1:552\n287#1:557\n300#1:591,6\n300#1:625\n300#1:630\n301#1:631,6\n301#1:665\n301#1:670\n275#1:443,6\n275#1:477\n275#1:562\n*E\n"})
public final class SnackbarKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7729c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f7732f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7727a = Dp.m4389constructorimpl(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7728b = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7730d = Dp.m4389constructorimpl(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f7731e = Dp.m4389constructorimpl(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f7733g = Dp.m4389constructorimpl(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f7734h = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f7735i = Dp.m4389constructorimpl(68);

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7736p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7737q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7738r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7739s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Function2 function2, Function2 function3, boolean z10) {
            super(2);
            this.f7736p0 = function2;
            this.f7737q0 = function3;
            this.f7738r0 = i10;
            this.f7739s0 = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2084221700, iIntValue, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new n2(this.f7738r0, this.f7736p0, this.f7737q0, this.f7739s0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7740p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7741q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f7742r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f7743s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f7744t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f7745u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7746w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f7747x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f7748y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, Shape shape, long j10, long j11, float f6, Function2<? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f7740p0 = modifier;
            this.f7741q0 = function2;
            this.f7742r0 = z10;
            this.f7743s0 = shape;
            this.f7744t0 = j10;
            this.f7745u0 = j11;
            this.v0 = f6;
            this.f7746w0 = function3;
            this.f7747x0 = i10;
            this.f7748y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarKt.m817Snackbar7zSek6w(this.f7740p0, this.f7741q0, this.f7742r0, this.f7743s0, this.f7744t0, this.f7745u0, this.v0, this.f7746w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7747x0 | 1), this.f7748y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f7749p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SnackbarData snackbarData) {
            super(2);
            this.f7749p0 = snackbarData;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-261845785, iIntValue, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
                }
                TextKt.m879Text4IGK_g(this.f7749p0.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f7750p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7751q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f7752r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f7753s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f7754t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f7755u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f7756w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f7757x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f7758y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SnackbarData snackbarData, Modifier modifier, boolean z10, Shape shape, long j10, long j11, long j12, float f6, int i10, int i11) {
            super(2);
            this.f7750p0 = snackbarData;
            this.f7751q0 = modifier;
            this.f7752r0 = z10;
            this.f7753s0 = shape;
            this.f7754t0 = j10;
            this.f7755u0 = j11;
            this.v0 = j12;
            this.f7756w0 = f6;
            this.f7757x0 = i10;
            this.f7758y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarKt.m818SnackbarsPrSdHI(this.f7750p0, this.f7751q0, this.f7752r0, this.f7753s0, this.f7754t0, this.f7755u0, this.v0, this.f7756w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7757x0 | 1), this.f7758y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f7759p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7760q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f7761r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f7762s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, int i10, SnackbarData snackbarData, String str) {
            super(2);
            this.f7759p0 = j10;
            this.f7760q0 = i10;
            this.f7761r0 = snackbarData;
            this.f7762s0 = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1843479216, iIntValue, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
                }
                ButtonKt.TextButton(new o2(this.f7761r0), null, false, null, null, null, null, ButtonDefaults.INSTANCE.m689textButtonColorsRGew2ao(0L, this.f7759p0, 0L, composer2, ((this.f7760q0 >> 15) & 112) | 3072, 5), null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new p2(this.f7762s0)), composer2, 805306368, 382);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 8;
        f7729c = Dp.m4389constructorimpl(f6);
        f7732f = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0140 A[PHI: r0 r2 r4 r5 r6 r8 r13
      0x0140: PHI (r0v15 androidx.compose.ui.Modifier) = (r0v12 androidx.compose.ui.Modifier), (r0v20 androidx.compose.ui.Modifier) binds: [B:128:0x0188, B:107:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r2v7 boolean) = (r2v2 boolean), (r2v8 boolean) binds: [B:128:0x0188, B:107:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r4v25 int) = (r4v19 int), (r4v28 int) binds: [B:128:0x0188, B:107:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r5v8 androidx.compose.ui.graphics.Shape) = (r5v3 androidx.compose.ui.graphics.Shape), (r5v9 androidx.compose.ui.graphics.Shape) binds: [B:128:0x0188, B:107:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r6v6 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r6v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r6v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:128:0x0188, B:107:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r8v9 long) = (r8v4 long), (r8v3 long) binds: [B:128:0x0188, B:107:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r13v13 long) = (r13v4 long), (r13v3 long) binds: [B:128:0x0188, B:107:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:129:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x019a  */
    /* JADX WARN: Code duplicated, block: B:135:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Snackbar-7zSek6w, reason: not valid java name */
    public static final void m817Snackbar7zSek6w(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, @Nullable Shape shape, long j10, long j11, float f6, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i13;
        int i14;
        long backgroundColor;
        long jM717getSurface0d7_KjU;
        int i15;
        float f10;
        int i16;
        int i17;
        Modifier modifier2;
        boolean z11;
        Shape small;
        float fM4389constructorimpl;
        int i18;
        Shape shape2;
        boolean z12;
        Modifier modifier3;
        float f11;
        long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-558258760);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 112) == 0) {
                function3 = function2;
                i12 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) != 0) {
                    i12 |= ((i11 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? 1024 : 2048;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        backgroundColor = j10;
                        int i22 = composerStartRestartGroup.changed(backgroundColor) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        backgroundColor = j10;
                    }
                    i12 |= i22;
                } else {
                    backgroundColor = j10;
                }
                if ((i10 & 458752) == 0) {
                    jM717getSurface0d7_KjU = j11;
                    if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(jM717getSurface0d7_KjU)) {
                        i19 = 65536;
                    } else {
                        i19 = 131072;
                    }
                    i12 |= i19;
                } else {
                    jM717getSurface0d7_KjU = j11;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i21 != 0) {
                                function3 = null;
                            }
                            if (i13 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i12 &= -7169;
                            } else {
                                small = shape;
                            }
                            if ((i11 & 16) != 0) {
                                backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 = (-458753) & i12;
                            }
                            if (i15 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(6);
                            }
                            long j13 = backgroundColor;
                            i18 = i12;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                            }
                            int i23 = i18 >> 6;
                            SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j13, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | ((i18 >> 3) & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            backgroundColor = j13;
                            shape2 = small;
                            z12 = z11;
                            modifier3 = modifier2;
                            f11 = fM4389constructorimpl;
                            j12 = jM717getSurface0d7_KjU;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            modifier2 = modifier;
                            z11 = z10;
                            small = shape;
                        }
                        fM4389constructorimpl = f10;
                        long j14 = backgroundColor;
                        i18 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                        }
                        int i24 = i18 >> 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j14, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | ((i18 >> 3) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        backgroundColor = j14;
                        shape2 = small;
                        z12 = z11;
                        modifier3 = modifier2;
                        f11 = fM4389constructorimpl;
                        j12 = jM717getSurface0d7_KjU;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z12 = z10;
                        shape2 = shape;
                        j12 = jM717getSurface0d7_KjU;
                        f11 = f10;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
                }
                i17 = 12582912;
                i12 |= i17;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    }
                    long j15 = backgroundColor;
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i25 = i18 >> 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j15, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i25 & 112) | (i25 & 896) | (i25 & 7168) | ((i18 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j15;
                    shape2 = small;
                    z12 = z11;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    j12 = jM717getSurface0d7_KjU;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    }
                    long j16 = backgroundColor;
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i26 = i18 >> 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j16, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i26 & 112) | (i26 & 896) | (i26 & 7168) | ((i18 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j16;
                    shape2 = small;
                    z12 = z11;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    j12 = jM717getSurface0d7_KjU;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            if ((i10 & 7168) != 0) {
                i12 |= ((i11 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? 1024 : 2048;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    backgroundColor = j10;
                    if (composerStartRestartGroup.changed(backgroundColor)) {
                    }
                    i12 |= i22;
                } else {
                    backgroundColor = j10;
                }
                i12 |= i22;
            } else {
                backgroundColor = j10;
            }
            if ((i10 & 458752) == 0) {
                jM717getSurface0d7_KjU = j11;
                if ((i11 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            } else {
                jM717getSurface0d7_KjU = j11;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    }
                    long j17 = backgroundColor;
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i27 = i18 >> 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j17, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i18 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j17;
                    shape2 = small;
                    z12 = z11;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    j12 = jM717getSurface0d7_KjU;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    }
                    long j18 = backgroundColor;
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i28 = i18 >> 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j18, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | ((i18 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j18;
                    shape2 = small;
                    z12 = z11;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    j12 = jM717getSurface0d7_KjU;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
            }
            i17 = 12582912;
            i12 |= i17;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                }
                long j19 = backgroundColor;
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i29 = i18 >> 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j19, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | ((i18 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j19;
                shape2 = small;
                z12 = z11;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                j12 = jM717getSurface0d7_KjU;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                }
                long j110 = backgroundColor;
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i210 = i18 >> 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j110, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i210 & 112) | (i210 & 896) | (i210 & 7168) | ((i18 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j110;
                shape2 = small;
                z12 = z11;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                j12 = jM717getSurface0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
        }
        i12 |= 48;
        function3 = function2;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) != 0) {
                i12 |= ((i11 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? 1024 : 2048;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    backgroundColor = j10;
                    if (composerStartRestartGroup.changed(backgroundColor)) {
                    }
                    i12 |= i22;
                } else {
                    backgroundColor = j10;
                }
                i12 |= i22;
            } else {
                backgroundColor = j10;
            }
            if ((i10 & 458752) == 0) {
                jM717getSurface0d7_KjU = j11;
                if ((i11 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            } else {
                jM717getSurface0d7_KjU = j11;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    }
                    long j111 = backgroundColor;
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i211 = i18 >> 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j111, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i211 & 112) | (i211 & 896) | (i211 & 7168) | ((i18 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j111;
                    shape2 = small;
                    z12 = z11;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    j12 = jM717getSurface0d7_KjU;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i21 != 0) {
                            function3 = null;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 = (-458753) & i12;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                    }
                    long j112 = backgroundColor;
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                    }
                    int i212 = i18 >> 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j112, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i212 & 112) | (i212 & 896) | (i212 & 7168) | ((i18 >> 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    backgroundColor = j112;
                    shape2 = small;
                    z12 = z11;
                    modifier3 = modifier2;
                    f11 = fM4389constructorimpl;
                    j12 = jM717getSurface0d7_KjU;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
            }
            i17 = 12582912;
            i12 |= i17;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                }
                long j113 = backgroundColor;
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i213 = i18 >> 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j113, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i213 & 112) | (i213 & 896) | (i213 & 7168) | ((i18 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j113;
                shape2 = small;
                z12 = z11;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                j12 = jM717getSurface0d7_KjU;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                }
                long j114 = backgroundColor;
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i214 = i18 >> 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j114, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i214 & 112) | (i214 & 896) | (i214 & 7168) | ((i18 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j114;
                shape2 = small;
                z12 = z11;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                j12 = jM717getSurface0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        if ((i10 & 7168) != 0) {
            i12 |= ((i11 & 8) == 0 || !composerStartRestartGroup.changed(shape)) ? 1024 : 2048;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                backgroundColor = j10;
                if (composerStartRestartGroup.changed(backgroundColor)) {
                }
                i12 |= i22;
            } else {
                backgroundColor = j10;
            }
            i12 |= i22;
        } else {
            backgroundColor = j10;
        }
        if ((i10 & 458752) == 0) {
            jM717getSurface0d7_KjU = j11;
            if ((i11 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        } else {
            jM717getSurface0d7_KjU = j11;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
            f10 = f6;
        } else {
            f10 = f6;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f10)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                }
                long j115 = backgroundColor;
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i215 = i18 >> 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j115, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i215 & 112) | (i215 & 896) | (i215 & 7168) | ((i18 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j115;
                shape2 = small;
                z12 = z11;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                j12 = jM717getSurface0d7_KjU;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i21 != 0) {
                        function3 = null;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 = (-458753) & i12;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                }
                long j116 = backgroundColor;
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
                }
                int i216 = i18 >> 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j116, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i216 & 112) | (i216 & 896) | (i216 & 7168) | ((i18 >> 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                backgroundColor = j116;
                shape2 = small;
                z12 = z11;
                modifier3 = modifier2;
                f11 = fM4389constructorimpl;
                j12 = jM717getSurface0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
        }
        i17 = 12582912;
        i12 |= i17;
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i21 != 0) {
                    function3 = null;
                }
                if (i13 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 = (-458753) & i12;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f10;
                }
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i21 != 0) {
                    function3 = null;
                }
                if (i13 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 = (-458753) & i12;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f10;
                }
            }
            long j117 = backgroundColor;
            i18 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
            }
            int i217 = i18 >> 6;
            SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j117, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i217 & 112) | (i217 & 896) | (i217 & 7168) | ((i18 >> 3) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            backgroundColor = j117;
            shape2 = small;
            z12 = z11;
            modifier3 = modifier2;
            f11 = fM4389constructorimpl;
            j12 = jM717getSurface0d7_KjU;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i21 != 0) {
                    function3 = null;
                }
                if (i13 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 = (-458753) & i12;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f10;
                }
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i21 != 0) {
                    function3 = null;
                }
                if (i13 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 = (-458753) & i12;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f10;
                }
            }
            long j118 = backgroundColor;
            i18 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558258760, i18, -1, "androidx.compose.material.Snackbar (Snackbar.kt:80)");
            }
            int i218 = i18 >> 6;
            SurfaceKt.m834SurfaceFjzlyU(modifier2, small, j118, jM717getSurface0d7_KjU, null, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2084221700, true, new a(i18, function3, content, z11)), composerStartRestartGroup, (i18 & 14) | 1572864 | (i218 & 112) | (i218 & 896) | (i218 & 7168) | ((i18 >> 3) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            backgroundColor = j118;
            shape2 = small;
            z12 = z11;
            modifier3 = modifier2;
            f11 = fM4389constructorimpl;
            j12 = jM717getSurface0d7_KjU;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, function3, z12, shape2, backgroundColor, j12, f11, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01df  */
    /* JADX WARN: Code duplicated, block: B:147:0x0229  */
    /* JADX WARN: Code duplicated, block: B:152:0x0236  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    public static final void m818SnackbarsPrSdHI(@NotNull SnackbarData snackbarData, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, long j10, long j11, long j12, float f6, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        Shape shape2;
        long jM717getSurface0d7_KjU;
        long j13;
        int i15;
        int i16;
        Modifier modifier2;
        boolean z12;
        Shape small;
        long backgroundColor;
        long primaryActionColor;
        float fM4389constructorimpl;
        long j14;
        long j15;
        long j16;
        String actionLabel;
        ComposableLambda composableLambda;
        Modifier modifier3;
        float f10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
        Composer composerStartRestartGroup = composer.startRestartGroup(258660814);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        shape2 = shape;
                        int i19 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i19;
                } else {
                    shape2 = shape;
                }
                if ((i10 & 57344) != 0) {
                    i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        jM717getSurface0d7_KjU = j11;
                        int i20 = composerStartRestartGroup.changed(jM717getSurface0d7_KjU) ? 131072 : 65536;
                        i12 |= i20;
                    } else {
                        jM717getSurface0d7_KjU = j11;
                    }
                    i12 |= i20;
                } else {
                    jM717getSurface0d7_KjU = j11;
                }
                if ((i10 & 3670016) == 0) {
                    j13 = j12;
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(j13)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i12 |= i17;
                } else {
                    j13 = j12;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
                if ((i12 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i12 &= -7169;
                        } else {
                            small = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            backgroundColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            primaryActionColor = j13;
                        }
                        if (i15 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(6);
                        } else {
                            fM4389constructorimpl = f6;
                        }
                        j14 = primaryActionColor;
                        j15 = jM717getSurface0d7_KjU;
                        j16 = backgroundColor;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        modifier2 = modifier;
                        fM4389constructorimpl = f6;
                        z12 = z11;
                        small = shape2;
                        j14 = j13;
                        j15 = jM717getSurface0d7_KjU;
                        j16 = j10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                    }
                    actionLabel = snackbarData.getActionLabel();
                    if (actionLabel != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new e(j14, i12, snackbarData, actionLabel));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifier4 = modifier2;
                    m817Snackbar7zSek6w(PaddingKt.m296padding3ABfNKs(modifier2, Dp.m4389constructorimpl(12)), composableLambda, z12, small, j16, j15, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new c(snackbarData)), composerStartRestartGroup, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    f10 = fM4389constructorimpl;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    f10 = f6;
                    z12 = z11;
                    small = shape2;
                    j14 = j13;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = j10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier3, z12, small, j16, j15, j14, f10, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i19;
                } else {
                    shape2 = shape;
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    jM717getSurface0d7_KjU = j11;
                    if (composerStartRestartGroup.changed(jM717getSurface0d7_KjU)) {
                    }
                    i12 |= i20;
                } else {
                    jM717getSurface0d7_KjU = j11;
                }
                i12 |= i20;
            } else {
                jM717getSurface0d7_KjU = j11;
            }
            if ((i10 & 3670016) == 0) {
                j13 = j12;
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                j13 = j12;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new e(j14, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                Modifier modifier5 = modifier2;
                m817Snackbar7zSek6w(PaddingKt.m296padding3ABfNKs(modifier2, Dp.m4389constructorimpl(12)), composableLambda, z12, small, j16, j15, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new c(snackbarData)), composerStartRestartGroup, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                f10 = fM4389constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new e(j14, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                Modifier modifier6 = modifier2;
                m817Snackbar7zSek6w(PaddingKt.m296padding3ABfNKs(modifier2, Dp.m4389constructorimpl(12)), composableLambda, z12, small, j16, j15, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new c(snackbarData)), composerStartRestartGroup, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                f10 = fM4389constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier3, z12, small, j16, j15, j14, f10, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i19;
                } else {
                    shape2 = shape;
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    jM717getSurface0d7_KjU = j11;
                    if (composerStartRestartGroup.changed(jM717getSurface0d7_KjU)) {
                    }
                    i12 |= i20;
                } else {
                    jM717getSurface0d7_KjU = j11;
                }
                i12 |= i20;
            } else {
                jM717getSurface0d7_KjU = j11;
            }
            if ((i10 & 3670016) == 0) {
                j13 = j12;
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                j13 = j12;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new e(j14, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                Modifier modifier7 = modifier2;
                m817Snackbar7zSek6w(PaddingKt.m296padding3ABfNKs(modifier2, Dp.m4389constructorimpl(12)), composableLambda, z12, small, j16, j15, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new c(snackbarData)), composerStartRestartGroup, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                f10 = fM4389constructorimpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i12 &= -7169;
                    } else {
                        small = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        backgroundColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        primaryActionColor = j13;
                    }
                    if (i15 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(6);
                    } else {
                        fM4389constructorimpl = f6;
                    }
                    j14 = primaryActionColor;
                    j15 = jM717getSurface0d7_KjU;
                    j16 = backgroundColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
                }
                actionLabel = snackbarData.getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new e(j14, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                Modifier modifier8 = modifier2;
                m817Snackbar7zSek6w(PaddingKt.m296padding3ABfNKs(modifier2, Dp.m4389constructorimpl(12)), composableLambda, z12, small, j16, j15, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new c(snackbarData)), composerStartRestartGroup, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier8;
                f10 = fM4389constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier3, z12, small, j16, j15, j14, f10, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            i12 |= i19;
        } else {
            shape2 = shape;
        }
        if ((i10 & 57344) != 0) {
            i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                jM717getSurface0d7_KjU = j11;
                if (composerStartRestartGroup.changed(jM717getSurface0d7_KjU)) {
                }
                i12 |= i20;
            } else {
                jM717getSurface0d7_KjU = j11;
            }
            i12 |= i20;
        } else {
            jM717getSurface0d7_KjU = j11;
        }
        if ((i10 & 3670016) == 0) {
            j13 = j12;
            if ((i11 & 64) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        } else {
            j13 = j12;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((i12 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    backgroundColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    primaryActionColor = j13;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f6;
                }
                j14 = primaryActionColor;
                j15 = jM717getSurface0d7_KjU;
                j16 = backgroundColor;
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    backgroundColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    primaryActionColor = j13;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f6;
                }
                j14 = primaryActionColor;
                j15 = jM717getSurface0d7_KjU;
                j16 = backgroundColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
            }
            actionLabel = snackbarData.getActionLabel();
            if (actionLabel != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new e(j14, i12, snackbarData, actionLabel));
            } else {
                composableLambda = null;
            }
            Modifier modifier9 = modifier2;
            m817Snackbar7zSek6w(PaddingKt.m296padding3ABfNKs(modifier2, Dp.m4389constructorimpl(12)), composableLambda, z12, small, j16, j15, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new c(snackbarData)), composerStartRestartGroup, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier9;
            f10 = fM4389constructorimpl;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    backgroundColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    primaryActionColor = j13;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f6;
                }
                j14 = primaryActionColor;
                j15 = jM717getSurface0d7_KjU;
                j16 = backgroundColor;
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i12 &= -7169;
                } else {
                    small = shape2;
                }
                if ((i11 & 16) != 0) {
                    backgroundColor = SnackbarDefaults.INSTANCE.getBackgroundColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    backgroundColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    primaryActionColor = SnackbarDefaults.INSTANCE.getPrimaryActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    primaryActionColor = j13;
                }
                if (i15 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(6);
                } else {
                    fM4389constructorimpl = f6;
                }
                j14 = primaryActionColor;
                j15 = jM717getSurface0d7_KjU;
                j16 = backgroundColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(258660814, i12, -1, "androidx.compose.material.Snackbar (Snackbar.kt:151)");
            }
            actionLabel = snackbarData.getActionLabel();
            if (actionLabel != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1843479216, true, new e(j14, i12, snackbarData, actionLabel));
            } else {
                composableLambda = null;
            }
            Modifier modifier10 = modifier2;
            m817Snackbar7zSek6w(PaddingKt.m296padding3ABfNKs(modifier2, Dp.m4389constructorimpl(12)), composableLambda, z12, small, j16, j15, fM4389constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -261845785, true, new c(snackbarData)), composerStartRestartGroup, (i12 & 896) | 12582912 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 >> 3) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier10;
            f10 = fM4389constructorimpl;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier3, z12, small, j16, j15, j14, f10, i10, i11));
    }

    public static final void access$NewLineButtonSnackbar(Function2 function2, Function2 function3, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:270)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f6 = f7728b;
            float f10 = f7729c;
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifierFillMaxWidth$default, f6, 0.0f, f10, f7730d, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(AlignmentLineKt.m233paddingFromBaselineVpY3zN4(companion, f7727a, f7733g), 0.0f, 0.0f, f10, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, currentCompositionLocalMap2);
            if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getEnd());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C3 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, currentCompositionLocalMap3);
            if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
            }
            ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function3.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.d3(i10, function2, function3));
    }

    public static final void access$OneRowSnackbar(Function2 function2, Function2 function3, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-534813202);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534813202, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, f7728b, 0.0f, f7729c, 0.0f, 10, null);
            h0.e3 e3Var = new h0.e3();
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, e3Var, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, f7731e, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM298paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, currentCompositionLocalMap2);
            if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "action");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, currentCompositionLocalMap3);
            if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function3.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.f3(i10, function2, function3));
    }

    public static final void access$TextOnlySnackbar(Function2 function2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(917397959);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917397959, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            h0.g3 g3Var = h0.g3.f68786a;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, g3Var, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierM297paddingVpY3zN4 = PaddingKt.m297paddingVpY3zN4(companion, f7728b, f7731e);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM297paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, currentCompositionLocalMap2);
            if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.h3(i10, function2));
    }
}
