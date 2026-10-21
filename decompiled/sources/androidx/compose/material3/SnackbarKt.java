package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009c\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001am\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", "content", "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Snackbar", "Landroidx/compose/material3/SnackbarData;", "snackbarData", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,435:1\n154#2:436\n154#2:508\n154#2:591\n154#2:734\n154#2:735\n154#2:736\n154#2:737\n154#2:738\n154#2:739\n154#2:740\n154#2:741\n74#3,6:437\n80#3:469\n84#3:590\n75#4:443\n76#4,11:445\n75#4:476\n76#4,11:478\n89#4:506\n75#4:515\n76#4,11:517\n75#4:549\n76#4,11:551\n89#4:579\n89#4:584\n89#4:589\n74#4:592\n75#4,11:594\n75#4:622\n76#4,11:624\n89#4:652\n75#4:660\n76#4,11:662\n89#4:690\n75#4:698\n76#4,11:700\n89#4:728\n88#4:733\n76#5:444\n76#5:477\n76#5:516\n76#5:550\n76#5:593\n76#5:623\n76#5:661\n76#5:699\n460#6,13:456\n460#6,13:489\n473#6,3:503\n460#6,13:528\n460#6,13:562\n473#6,3:576\n473#6,3:581\n473#6,3:586\n456#6,11:605\n460#6,13:635\n473#6,3:649\n460#6,13:673\n473#6,3:687\n460#6,13:711\n473#6,3:725\n467#6,3:730\n67#7,6:470\n73#7:502\n77#7:507\n67#7,6:509\n73#7:541\n77#7:585\n67#7,6:616\n73#7:648\n77#7:653\n67#7,6:654\n73#7:686\n77#7:691\n67#7,6:692\n73#7:724\n77#7:729\n74#8,7:542\n81#8:575\n85#8:580\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n238#1:436\n277#1:508\n331#1:591\n427#1:734\n428#1:735\n429#1:736\n430#1:737\n431#1:738\n432#1:739\n433#1:740\n434#1:741\n260#1:437,6\n260#1:469\n260#1:590\n260#1:443\n260#1:445,11\n270#1:476\n270#1:478,11\n270#1:506\n275#1:515\n275#1:517,11\n279#1:549\n279#1:551,11\n279#1:579\n275#1:584\n260#1:589\n308#1:592\n308#1:594,11\n310#1:622\n310#1:624,11\n310#1:652\n312#1:660\n312#1:662,11\n312#1:690\n321#1:698\n321#1:700,11\n321#1:728\n308#1:733\n260#1:444\n270#1:477\n275#1:516\n279#1:550\n308#1:593\n310#1:623\n312#1:661\n321#1:699\n260#1:456,13\n270#1:489,13\n270#1:503,3\n275#1:528,13\n279#1:562,13\n279#1:576,3\n275#1:581,3\n260#1:586,3\n308#1:605,11\n310#1:635,13\n310#1:649,3\n312#1:673,13\n312#1:687,3\n321#1:711,13\n321#1:725,3\n308#1:730,3\n270#1:470,6\n270#1:502\n270#1:507\n275#1:509,6\n275#1:541\n275#1:585\n310#1:616,6\n310#1:648\n310#1:653\n312#1:654,6\n312#1:686\n312#1:691\n321#1:692,6\n321#1:724\n321#1:729\n279#1:542,7\n279#1:575\n279#1:580\n*E\n"})
public final class SnackbarKt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11535d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f11538g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11532a = Dp.m4389constructorimpl(600);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11533b = Dp.m4389constructorimpl(30);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11534c = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11536e = Dp.m4389constructorimpl(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f11537f = Dp.m4389constructorimpl(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f11539h = Dp.m4389constructorimpl(12);

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11540p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11541q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11542r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f11543s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f11544t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11545u0;
        public final /* synthetic */ boolean v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, long j10, long j11, int i10, boolean z10) {
            super(2);
            this.f11540p0 = function2;
            this.f11541q0 = function3;
            this.f11542r0 = function4;
            this.f11543s0 = j10;
            this.f11544t0 = j11;
            this.f11545u0 = i10;
            this.v0 = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1829663446, iIntValue, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:112)");
                }
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                Typography typography = materialTheme.getTypography(composer2, 6);
                SnackbarTokens snackbarTokens = SnackbarTokens.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(typography, snackbarTokens.getSupportingTextFont()))}, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new n3(this.f11540p0, this.f11541q0, this.f11542r0, TypographyKt.fromToken(materialTheme.getTypography(composer2, 6), snackbarTokens.getActionLabelTextFont()), this.f11543s0, this.f11544t0, this.f11545u0, this.v0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11546p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11547q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11548r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11549s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f11550t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f11551u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f11552w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f11553x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11554y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, Shape shape, long j10, long j11, long j12, long j13, Function2<? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f11546p0 = modifier;
            this.f11547q0 = function2;
            this.f11548r0 = function3;
            this.f11549s0 = z10;
            this.f11550t0 = shape;
            this.f11551u0 = j10;
            this.v0 = j11;
            this.f11552w0 = j12;
            this.f11553x0 = j13;
            this.f11554y0 = function4;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarKt.m1246SnackbareQBnUkQ(this.f11546p0, this.f11547q0, this.f11548r0, this.f11549s0, this.f11550t0, this.f11551u0, this.v0, this.f11552w0, this.f11553x0, this.f11554y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11555p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SnackbarData snackbarData) {
            super(2);
            this.f11555p0 = snackbarData;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1266389126, iIntValue, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:246)");
                }
                TextKt.m1389Text4IGK_g(this.f11555p0.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11556p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11557q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f11558r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f11559s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f11560t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f11561u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f11562w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f11563x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f11564y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SnackbarData snackbarData, Modifier modifier, boolean z10, Shape shape, long j10, long j11, long j12, long j13, long j14, int i10, int i11) {
            super(2);
            this.f11556p0 = snackbarData;
            this.f11557q0 = modifier;
            this.f11558r0 = z10;
            this.f11559s0 = shape;
            this.f11560t0 = j10;
            this.f11561u0 = j11;
            this.v0 = j12;
            this.f11562w0 = j13;
            this.f11563x0 = j14;
            this.f11564y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarKt.m1247SnackbarsDKtq54(this.f11556p0, this.f11557q0, this.f11558r0, this.f11559s0, this.f11560t0, this.f11561u0, this.v0, this.f11562w0, this.f11563x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11564y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,435:1\n36#2:436\n1114#3,6:437\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n*L\n214#1:436\n214#1:437,6\n*E\n"})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f11565p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f11566q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11567r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f11568s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, int i10, SnackbarData snackbarData, String str) {
            super(2);
            this.f11565p0 = j10;
            this.f11566q0 = i10;
            this.f11567r0 = snackbarData;
            this.f11568s0 = str;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1378313599, iIntValue, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:210)");
                }
                ButtonColors buttonColorsM939textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m939textButtonColorsro_MJ88(0L, this.f11565p0, 0L, 0L, composer2, ((this.f11566q0 >> 15) & 112) | 24576, 13);
                composer2.startReplaceableGroup(1157296644);
                SnackbarData snackbarData = this.f11567r0;
                boolean zChanged = composer2.changed(snackbarData);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o3(snackbarData);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, buttonColorsM939textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new p3(this.f11568s0)), composer2, 805306368, 494);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snackbar.kt */
    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,435:1\n36#2:436\n1114#3,6:437\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1\n*L\n225#1:436\n225#1:437,6\n*E\n"})
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11569p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SnackbarData snackbarData, int i10) {
            super(2);
            this.f11569p0 = snackbarData;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1812633777, iIntValue, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:222)");
                }
                composer2.startReplaceableGroup(1157296644);
                SnackbarData snackbarData = this.f11569p0;
                boolean zChanged = composer2.changed(snackbarData);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new q3(snackbarData);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1046getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 8;
        f11535d = Dp.m4389constructorimpl(f6);
        f11538g = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0110  */
    /* JADX WARN: Code duplicated, block: B:103:0x0115  */
    /* JADX WARN: Code duplicated, block: B:105:0x011b  */
    /* JADX WARN: Code duplicated, block: B:106:0x011e  */
    /* JADX WARN: Code duplicated, block: B:109:0x012a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:134:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0192  */
    /* JADX WARN: Code duplicated, block: B:139:0x0196  */
    /* JADX WARN: Code duplicated, block: B:142:0x019a  */
    /* JADX WARN: Code duplicated, block: B:144:0x019d  */
    /* JADX WARN: Code duplicated, block: B:145:0x019f  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01af  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01be  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:170:0x0256  */
    /* JADX WARN: Code duplicated, block: B:175:0x0269  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:99:0x010c  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    public static final void m1246SnackbareQBnUkQ(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, @Nullable Shape shape, long j10, long j11, long j12, long j13, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i14;
        int i15;
        int i16;
        long dismissActionContentColor;
        int i17;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function6;
        boolean z11;
        Shape shape2;
        long color;
        long contentColor;
        long actionContentColor;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function7;
        long j14;
        long j15;
        long j16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i18;
        int i19;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1235788955);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 112) == 0) {
                function4 = function2;
                i12 |= composerStartRestartGroup.changedInstance(function4) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) != 0) {
                        i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                    }
                    if ((458752 & i10) != 0) {
                        if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(j10)) {
                            i21 = 65536;
                        } else {
                            i21 = 131072;
                        }
                        i12 |= i21;
                    }
                    if ((3670016 & i10) != 0) {
                        if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(j11)) {
                            i20 = 524288;
                        } else {
                            i20 = 1048576;
                        }
                        i12 |= i20;
                    }
                    if ((29360128 & i10) != 0) {
                        if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j12)) {
                            i19 = 4194304;
                        } else {
                            i19 = 8388608;
                        }
                        i12 |= i19;
                    }
                    if ((234881024 & i10) == 0) {
                        dismissActionContentColor = j13;
                        if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(dismissActionContentColor)) {
                            i18 = 33554432;
                        } else {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        i12 |= i18;
                    } else {
                        dismissActionContentColor = j13;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i17 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i17 = 268435456;
                            }
                        }
                        if ((1533916891 & i12) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i22 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i23 != 0) {
                                    function4 = null;
                                }
                                function6 = i13 == 0 ? function5 : null;
                                if (i15 != 0) {
                                    z11 = false;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 16) != 0) {
                                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    i12 &= -57345;
                                } else {
                                    shape2 = shape;
                                }
                                if ((i11 & 32) != 0) {
                                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                    i12 &= -458753;
                                } else {
                                    color = j10;
                                }
                                if ((i11 & 64) != 0) {
                                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                    i12 &= -3670017;
                                } else {
                                    contentColor = j11;
                                }
                                if ((i11 & 128) != 0) {
                                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                    i12 &= -29360129;
                                } else {
                                    actionContentColor = j12;
                                }
                                if ((i11 & 256) != 0) {
                                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                    i12 &= -234881025;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                shape2 = shape;
                                contentColor = j11;
                                actionContentColor = j12;
                                modifier3 = modifier2;
                                function6 = function5;
                                z11 = z10;
                                color = j10;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                            }
                            float fM1944getContainerElevationD9Ej5fM = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                            Function2<? super Composer, ? super Integer, Unit> function8 = function6;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                            int i24 = 12779520 | (i12 & 14);
                            int i25 = i12 >> 9;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM, null, composableLambda, composerStartRestartGroup, (i25 & 7168) | i24 | (i25 & 112) | (i25 & 896), 80);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z12 = z11;
                            function7 = function4;
                            j14 = color;
                            j15 = dismissActionContentColor;
                            j16 = actionContentColor;
                            function5 = function8;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z12 = z10;
                            shape2 = shape;
                            contentColor = j11;
                            function7 = function4;
                            j15 = dismissActionContentColor;
                            j14 = j10;
                            j16 = j12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
                    }
                    i17 = 805306368;
                    i12 |= i17;
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM2 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function9 = function6;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i26 = 12779520 | (i12 & 14);
                        int i27 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM2, null, composableLambda2, composerStartRestartGroup, (i27 & 7168) | i26 | (i27 & 112) | (i27 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function9;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM3 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i28 = 12779520 | (i12 & 14);
                        int i29 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM3, null, composableLambda3, composerStartRestartGroup, (i29 & 7168) | i28 | (i29 & 112) | (i29 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function10;
                        modifier2 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
                }
                i12 |= 3072;
                if ((57344 & i10) != 0) {
                    i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
                if ((3670016 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((29360128 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((234881024 & i10) == 0) {
                    dismissActionContentColor = j13;
                    if ((i11 & 256) == 0) {
                        i18 = 33554432;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                } else {
                    dismissActionContentColor = j13;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM4 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function11 = function6;
                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i210 = 12779520 | (i12 & 14);
                        int i211 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM4, null, composableLambda4, composerStartRestartGroup, (i211 & 7168) | i210 | (i211 & 112) | (i211 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function11;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM5 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function12 = function6;
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i212 = 12779520 | (i12 & 14);
                        int i213 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM5, null, composableLambda5, composerStartRestartGroup, (i213 & 7168) | i212 | (i213 & 112) | (i213 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function12;
                        modifier2 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
                }
                i17 = 805306368;
                i12 |= i17;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM6 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function13 = function6;
                    ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i214 = 12779520 | (i12 & 14);
                    int i215 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM6, null, composableLambda6, composerStartRestartGroup, (i215 & 7168) | i214 | (i215 & 112) | (i215 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function13;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM7 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                    ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i216 = 12779520 | (i12 & 14);
                    int i217 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM7, null, composableLambda7, composerStartRestartGroup, (i217 & 7168) | i216 | (i217 & 112) | (i217 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function14;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            function5 = function3;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) != 0) {
                    i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
                if ((3670016 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((29360128 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((234881024 & i10) == 0) {
                    dismissActionContentColor = j13;
                    if ((i11 & 256) == 0) {
                        i18 = 33554432;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                } else {
                    dismissActionContentColor = j13;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM8 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function15 = function6;
                        ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i218 = 12779520 | (i12 & 14);
                        int i219 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM8, null, composableLambda8, composerStartRestartGroup, (i219 & 7168) | i218 | (i219 & 112) | (i219 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function15;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM9 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                        ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i2110 = 12779520 | (i12 & 14);
                        int i2111 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM9, null, composableLambda9, composerStartRestartGroup, (i2111 & 7168) | i2110 | (i2111 & 112) | (i2111 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function16;
                        modifier2 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
                }
                i17 = 805306368;
                i12 |= i17;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM10 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function17 = function6;
                    ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i2112 = 12779520 | (i12 & 14);
                    int i2113 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM10, null, composableLambda10, composerStartRestartGroup, (i2113 & 7168) | i2112 | (i2113 & 112) | (i2113 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function17;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM11 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                    ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i2114 = 12779520 | (i12 & 14);
                    int i2115 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM11, null, composableLambda11, composerStartRestartGroup, (i2115 & 7168) | i2114 | (i2115 & 112) | (i2115 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function18;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
            }
            i12 |= 3072;
            if ((57344 & i10) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            }
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((29360128 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((234881024 & i10) == 0) {
                dismissActionContentColor = j13;
                if ((i11 & 256) == 0) {
                    i18 = 33554432;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            } else {
                dismissActionContentColor = j13;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i17 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM12 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function19 = function6;
                    ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i2116 = 12779520 | (i12 & 14);
                    int i2117 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM12, null, composableLambda12, composerStartRestartGroup, (i2117 & 7168) | i2116 | (i2117 & 112) | (i2117 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function19;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM13 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                    ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i2118 = 12779520 | (i12 & 14);
                    int i2119 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM13, null, composableLambda13, composerStartRestartGroup, (i2119 & 7168) | i2118 | (i2119 & 112) | (i2119 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function110;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
            }
            i17 = 805306368;
            i12 |= i17;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM14 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function111 = function6;
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i21110 = 12779520 | (i12 & 14);
                int i21111 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM14, null, composableLambda14, composerStartRestartGroup, (i21111 & 7168) | i21110 | (i21111 & 112) | (i21111 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function111;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM15 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i21112 = 12779520 | (i12 & 14);
                int i21113 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM15, null, composableLambda15, composerStartRestartGroup, (i21113 & 7168) | i21112 | (i21113 & 112) | (i21113 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function112;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
        }
        i12 |= 48;
        function4 = function2;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) != 0) {
                    i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
                if ((3670016 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((29360128 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((234881024 & i10) == 0) {
                    dismissActionContentColor = j13;
                    if ((i11 & 256) == 0) {
                        i18 = 33554432;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                } else {
                    dismissActionContentColor = j13;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM16 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function113 = function6;
                        ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i21114 = 12779520 | (i12 & 14);
                        int i21115 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM16, null, composableLambda16, composerStartRestartGroup, (i21115 & 7168) | i21114 | (i21115 & 112) | (i21115 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function113;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i23 != 0) {
                                function4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i11 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            } else {
                                color = j10;
                            }
                            if ((i11 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                contentColor = j11;
                            }
                            if ((i11 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -29360129;
                            } else {
                                actionContentColor = j12;
                            }
                            if ((i11 & 256) != 0) {
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                i12 &= -234881025;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                        }
                        float fM1944getContainerElevationD9Ej5fM17 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                        Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                        int i21116 = 12779520 | (i12 & 14);
                        int i21117 = i12 >> 9;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM17, null, composableLambda17, composerStartRestartGroup, (i21117 & 7168) | i21116 | (i21117 & 112) | (i21117 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        function7 = function4;
                        j14 = color;
                        j15 = dismissActionContentColor;
                        j16 = actionContentColor;
                        function5 = function114;
                        modifier2 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
                }
                i17 = 805306368;
                i12 |= i17;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM18 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function115 = function6;
                    ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i21118 = 12779520 | (i12 & 14);
                    int i21119 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM18, null, composableLambda18, composerStartRestartGroup, (i21119 & 7168) | i21118 | (i21119 & 112) | (i21119 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function115;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM19 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                    ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i211110 = 12779520 | (i12 & 14);
                    int i211111 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM19, null, composableLambda19, composerStartRestartGroup, (i211111 & 7168) | i211110 | (i211111 & 112) | (i211111 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function116;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
            }
            i12 |= 3072;
            if ((57344 & i10) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            }
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((29360128 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((234881024 & i10) == 0) {
                dismissActionContentColor = j13;
                if ((i11 & 256) == 0) {
                    i18 = 33554432;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            } else {
                dismissActionContentColor = j13;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i17 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM110 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function117 = function6;
                    ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i211112 = 12779520 | (i12 & 14);
                    int i211113 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM110, null, composableLambda110, composerStartRestartGroup, (i211113 & 7168) | i211112 | (i211113 & 112) | (i211113 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function117;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM111 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function118 = function6;
                    ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i211114 = 12779520 | (i12 & 14);
                    int i211115 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM111, null, composableLambda111, composerStartRestartGroup, (i211115 & 7168) | i211114 | (i211115 & 112) | (i211115 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function118;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
            }
            i17 = 805306368;
            i12 |= i17;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM112 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function119 = function6;
                ComposableLambda composableLambda112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i211116 = 12779520 | (i12 & 14);
                int i211117 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM112, null, composableLambda112, composerStartRestartGroup, (i211117 & 7168) | i211116 | (i211117 & 112) | (i211117 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function119;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM113 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i211118 = 12779520 | (i12 & 14);
                int i211119 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM113, null, composableLambda113, composerStartRestartGroup, (i211119 & 7168) | i211118 | (i211119 & 112) | (i211119 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function1110;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        function5 = function3;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            }
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((29360128 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((234881024 & i10) == 0) {
                dismissActionContentColor = j13;
                if ((i11 & 256) == 0) {
                    i18 = 33554432;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            } else {
                dismissActionContentColor = j13;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i17 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM114 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function1111 = function6;
                    ComposableLambda composableLambda114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i2111110 = 12779520 | (i12 & 14);
                    int i2111111 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM114, null, composableLambda114, composerStartRestartGroup, (i2111111 & 7168) | i2111110 | (i2111111 & 112) | (i2111111 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function1111;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i23 != 0) {
                            function4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i11 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            contentColor = j11;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -29360129;
                        } else {
                            actionContentColor = j12;
                        }
                        if ((i11 & 256) != 0) {
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            i12 &= -234881025;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                    }
                    float fM1944getContainerElevationD9Ej5fM115 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                    Function2<? super Composer, ? super Integer, Unit> function1112 = function6;
                    ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                    int i2111112 = 12779520 | (i12 & 14);
                    int i2111113 = i12 >> 9;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM115, null, composableLambda115, composerStartRestartGroup, (i2111113 & 7168) | i2111112 | (i2111113 & 112) | (i2111113 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    function7 = function4;
                    j14 = color;
                    j15 = dismissActionContentColor;
                    j16 = actionContentColor;
                    function5 = function1112;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
            }
            i17 = 805306368;
            i12 |= i17;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM116 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function1113 = function6;
                ComposableLambda composableLambda116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i2111114 = 12779520 | (i12 & 14);
                int i2111115 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM116, null, composableLambda116, composerStartRestartGroup, (i2111115 & 7168) | i2111114 | (i2111115 & 112) | (i2111115 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function1113;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM117 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i2111116 = 12779520 | (i12 & 14);
                int i2111117 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM117, null, composableLambda117, composerStartRestartGroup, (i2111117 & 7168) | i2111116 | (i2111117 & 112) | (i2111117 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function1114;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
        }
        i12 |= 3072;
        if ((57344 & i10) != 0) {
            i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
        }
        if ((458752 & i10) != 0) {
            if ((i11 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i12 |= i21;
        }
        if ((3670016 & i10) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        if ((29360128 & i10) != 0) {
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i12 |= i19;
        }
        if ((234881024 & i10) == 0) {
            dismissActionContentColor = j13;
            if ((i11 & 256) == 0) {
                i18 = 33554432;
            } else {
                i18 = 33554432;
            }
            i12 |= i18;
        } else {
            dismissActionContentColor = j13;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i17 = 268435456;
                }
            }
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM118 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function1115 = function6;
                ComposableLambda composableLambda118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i2111118 = 12779520 | (i12 & 14);
                int i2111119 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM118, null, composableLambda118, composerStartRestartGroup, (i2111119 & 7168) | i2111118 | (i2111119 & 112) | (i2111119 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function1115;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i23 != 0) {
                        function4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i11 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        contentColor = j11;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -29360129;
                    } else {
                        actionContentColor = j12;
                    }
                    if ((i11 & 256) != 0) {
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        i12 &= -234881025;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                }
                float fM1944getContainerElevationD9Ej5fM119 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
                Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
                ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
                int i21111110 = 12779520 | (i12 & 14);
                int i21111111 = i12 >> 9;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM119, null, composableLambda119, composerStartRestartGroup, (i21111111 & 7168) | i21111110 | (i21111111 & 112) | (i21111111 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                function7 = function4;
                j14 = color;
                j15 = dismissActionContentColor;
                j16 = actionContentColor;
                function5 = function1116;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
        }
        i17 = 805306368;
        i12 |= i17;
        if ((1533916891 & i12) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i23 != 0) {
                    function4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i11 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    color = j10;
                }
                if ((i11 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    contentColor = j11;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    actionContentColor = j12;
                }
                if ((i11 & 256) != 0) {
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -234881025;
                }
            } else {
                if (i22 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i23 != 0) {
                    function4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i11 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    color = j10;
                }
                if ((i11 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    contentColor = j11;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    actionContentColor = j12;
                }
                if ((i11 & 256) != 0) {
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -234881025;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
            }
            float fM1944getContainerElevationD9Ej5fM1110 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
            Function2<? super Composer, ? super Integer, Unit> function1117 = function6;
            ComposableLambda composableLambda1110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
            int i21111112 = 12779520 | (i12 & 14);
            int i21111113 = i12 >> 9;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM1110, null, composableLambda1110, composerStartRestartGroup, (i21111113 & 7168) | i21111112 | (i21111113 & 112) | (i21111113 & 896), 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z11;
            function7 = function4;
            j14 = color;
            j15 = dismissActionContentColor;
            j16 = actionContentColor;
            function5 = function1117;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i23 != 0) {
                    function4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i11 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    color = j10;
                }
                if ((i11 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    contentColor = j11;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    actionContentColor = j12;
                }
                if ((i11 & 256) != 0) {
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -234881025;
                }
            } else {
                if (i22 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i23 != 0) {
                    function4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i11 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    color = j10;
                }
                if ((i11 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    contentColor = j11;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -29360129;
                } else {
                    actionContentColor = j12;
                }
                if ((i11 & 256) != 0) {
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    i12 &= -234881025;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
            }
            float fM1944getContainerElevationD9Ej5fM1111 = SnackbarTokens.INSTANCE.m1944getContainerElevationD9Ej5fM();
            Function2<? super Composer, ? super Integer, Unit> function1118 = function6;
            ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new a(function4, content, function6, actionContentColor, dismissActionContentColor, i12, z11));
            int i21111114 = 12779520 | (i12 & 14);
            int i21111115 = i12 >> 9;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape2, color, contentColor, 0.0f, fM1944getContainerElevationD9Ej5fM1111, null, composableLambda1111, composerStartRestartGroup, (i21111115 & 7168) | i21111114 | (i21111115 & 112) | (i21111115 & 896), 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z11;
            function7 = function4;
            j14 = color;
            j15 = dismissActionContentColor;
            j16 = actionContentColor;
            function5 = function1118;
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, function7, function5, z12, shape2, j14, contentColor, j16, j15, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x013b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x0179  */
    /* JADX WARN: Code duplicated, block: B:131:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x017e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0184  */
    /* JADX WARN: Code duplicated, block: B:136:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0192  */
    /* JADX WARN: Code duplicated, block: B:140:0x019b  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:161:0x020e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0219  */
    /* JADX WARN: Code duplicated, block: B:165:0x022b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0282  */
    /* JADX WARN: Code duplicated, block: B:173:0x0292  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Snackbar-sDKtq54, reason: not valid java name */
    public static final void m1247SnackbarsDKtq54(@NotNull SnackbarData snackbarData, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        Shape shape2;
        long contentColor;
        long actionColor;
        Modifier modifier3;
        boolean z12;
        Shape shape3;
        long color;
        long actionContentColor;
        long dismissActionContentColor;
        long j15;
        String actionLabel;
        ComposableLambda composableLambda;
        SnackbarData snackbarData2;
        ComposableLambda composableLambda2;
        boolean z13;
        Shape shape4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i15;
        int i16;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
        Composer composerStartRestartGroup = composer.startRestartGroup(274621471);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
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
                        int i20 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i20;
                } else {
                    shape2 = shape;
                }
                if ((i10 & 57344) != 0) {
                    i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
                }
                if ((i10 & 458752) == 0) {
                    contentColor = j11;
                    if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(contentColor)) {
                        i18 = 65536;
                    } else {
                        i18 = 131072;
                    }
                    i12 |= i18;
                } else {
                    contentColor = j11;
                }
                if ((i10 & 3670016) == 0) {
                    actionColor = j12;
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(actionColor)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i12 |= i17;
                } else {
                    actionColor = j12;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j13)) {
                        i16 = 4194304;
                    } else {
                        i16 = 8388608;
                    }
                    i12 |= i16;
                }
                if ((i10 & 234881024) != 0) {
                    if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j14)) {
                        i15 = 33554432;
                    } else {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    i12 |= i15;
                }
                if ((191739611 & i12) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        } else {
                            color = j10;
                        }
                        if ((i11 & 32) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i12 = (-29360129) & i12;
                        } else {
                            actionContentColor = j13;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j15 = actionContentColor;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        } else {
                            dismissActionContentColor = j14;
                            j15 = actionContentColor;
                        }
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
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                        }
                        j15 = j13;
                        dismissActionContentColor = j14;
                        modifier3 = modifier2;
                        z12 = z11;
                        shape3 = shape2;
                        color = j10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
                    }
                    actionLabel = snackbarData.getVisuals().getActionLabel();
                    if (actionLabel != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, new e(actionColor, i12, snackbarData, actionLabel));
                    } else {
                        composableLambda = null;
                    }
                    if (snackbarData.getVisuals().getWithDismissAction()) {
                        snackbarData2 = snackbarData;
                        composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, true, new f(snackbarData2, i12));
                    } else {
                        snackbarData2 = snackbarData;
                        composableLambda2 = null;
                    }
                    Modifier modifier4 = modifier3;
                    int i21 = i12 << 3;
                    m1246SnackbareQBnUkQ(PaddingKt.m296padding3ABfNKs(modifier3, Dp.m4389constructorimpl(12)), composableLambda, composableLambda2, z12, shape3, color, contentColor, j15, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, true, new c(snackbarData2)), composerStartRestartGroup, (i21 & 3670016) | (i21 & 7168) | 805306368 | (57344 & i21) | (458752 & i21) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    actionColor = actionColor;
                    z13 = z12;
                    shape4 = shape3;
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j15 = j13;
                    dismissActionContentColor = j14;
                    z13 = z11;
                    shape4 = shape2;
                    color = j10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier2, z13, shape4, color, contentColor, actionColor, j15, dismissActionContentColor, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i20;
                } else {
                    shape2 = shape;
                }
                i12 |= i20;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                contentColor = j11;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                contentColor = j11;
            }
            if ((i10 & 3670016) == 0) {
                actionColor = j12;
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                actionColor = j12;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i16 = 4194304;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i10 & 234881024) != 0) {
                if ((i11 & 256) == 0) {
                    i15 = 33554432;
                } else {
                    i15 = 33554432;
                }
                i12 |= i15;
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, new e(actionColor, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    snackbarData2 = snackbarData;
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, true, new f(snackbarData2, i12));
                } else {
                    snackbarData2 = snackbarData;
                    composableLambda2 = null;
                }
                Modifier modifier5 = modifier3;
                int i22 = i12 << 3;
                m1246SnackbareQBnUkQ(PaddingKt.m296padding3ABfNKs(modifier3, Dp.m4389constructorimpl(12)), composableLambda, composableLambda2, z12, shape3, color, contentColor, j15, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, true, new c(snackbarData2)), composerStartRestartGroup, (i22 & 3670016) | (i22 & 7168) | 805306368 | (57344 & i22) | (458752 & i22) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                actionColor = actionColor;
                z13 = z12;
                shape4 = shape3;
                modifier2 = modifier5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, new e(actionColor, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    snackbarData2 = snackbarData;
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, true, new f(snackbarData2, i12));
                } else {
                    snackbarData2 = snackbarData;
                    composableLambda2 = null;
                }
                Modifier modifier6 = modifier3;
                int i23 = i12 << 3;
                m1246SnackbareQBnUkQ(PaddingKt.m296padding3ABfNKs(modifier3, Dp.m4389constructorimpl(12)), composableLambda, composableLambda2, z12, shape3, color, contentColor, j15, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, true, new c(snackbarData2)), composerStartRestartGroup, (i23 & 3670016) | (i23 & 7168) | 805306368 | (57344 & i23) | (458752 & i23) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                actionColor = actionColor;
                z13 = z12;
                shape4 = shape3;
                modifier2 = modifier6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier2, z13, shape4, color, contentColor, actionColor, j15, dismissActionContentColor, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
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
                    i12 |= i20;
                } else {
                    shape2 = shape;
                }
                i12 |= i20;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                contentColor = j11;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                contentColor = j11;
            }
            if ((i10 & 3670016) == 0) {
                actionColor = j12;
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                actionColor = j12;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i16 = 4194304;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i10 & 234881024) != 0) {
                if ((i11 & 256) == 0) {
                    i15 = 33554432;
                } else {
                    i15 = 33554432;
                }
                i12 |= i15;
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, new e(actionColor, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    snackbarData2 = snackbarData;
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, true, new f(snackbarData2, i12));
                } else {
                    snackbarData2 = snackbarData;
                    composableLambda2 = null;
                }
                Modifier modifier7 = modifier3;
                int i24 = i12 << 3;
                m1246SnackbareQBnUkQ(PaddingKt.m296padding3ABfNKs(modifier3, Dp.m4389constructorimpl(12)), composableLambda, composableLambda2, z12, shape3, color, contentColor, j15, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, true, new c(snackbarData2)), composerStartRestartGroup, (i24 & 3670016) | (i24 & 7168) | 805306368 | (57344 & i24) | (458752 & i24) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                actionColor = actionColor;
                z13 = z12;
                shape4 = shape3;
                modifier2 = modifier7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    } else {
                        color = j10;
                    }
                    if ((i11 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        actionContentColor = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j14;
                        j15 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, new e(actionColor, i12, snackbarData, actionLabel));
                } else {
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    snackbarData2 = snackbarData;
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, true, new f(snackbarData2, i12));
                } else {
                    snackbarData2 = snackbarData;
                    composableLambda2 = null;
                }
                Modifier modifier8 = modifier3;
                int i25 = i12 << 3;
                m1246SnackbareQBnUkQ(PaddingKt.m296padding3ABfNKs(modifier3, Dp.m4389constructorimpl(12)), composableLambda, composableLambda2, z12, shape3, color, contentColor, j15, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, true, new c(snackbarData2)), composerStartRestartGroup, (i25 & 3670016) | (i25 & 7168) | 805306368 | (57344 & i25) | (458752 & i25) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                actionColor = actionColor;
                z13 = z12;
                shape4 = shape3;
                modifier2 = modifier8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier2, z13, shape4, color, contentColor, actionColor, j15, dismissActionContentColor, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i20;
            } else {
                shape2 = shape;
            }
            i12 |= i20;
        } else {
            shape2 = shape;
        }
        if ((i10 & 57344) != 0) {
            i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
        }
        if ((i10 & 458752) == 0) {
            contentColor = j11;
            if ((i11 & 32) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        } else {
            contentColor = j11;
        }
        if ((i10 & 3670016) == 0) {
            actionColor = j12;
            if ((i11 & 64) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        } else {
            actionColor = j12;
        }
        if ((i10 & 29360128) != 0) {
            if ((i11 & 128) == 0) {
                i16 = 4194304;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((i10 & 234881024) != 0) {
            if ((i11 & 256) == 0) {
                i15 = 33554432;
            } else {
                i15 = 33554432;
            }
            i12 |= i15;
        }
        if ((191739611 & i12) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    color = j10;
                }
                if ((i11 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 = (-29360129) & i12;
                } else {
                    actionContentColor = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j14;
                    j15 = actionContentColor;
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    color = j10;
                }
                if ((i11 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 = (-29360129) & i12;
                } else {
                    actionContentColor = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j14;
                    j15 = actionContentColor;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
            }
            actionLabel = snackbarData.getVisuals().getActionLabel();
            if (actionLabel != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, new e(actionColor, i12, snackbarData, actionLabel));
            } else {
                composableLambda = null;
            }
            if (snackbarData.getVisuals().getWithDismissAction()) {
                snackbarData2 = snackbarData;
                composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, true, new f(snackbarData2, i12));
            } else {
                snackbarData2 = snackbarData;
                composableLambda2 = null;
            }
            Modifier modifier9 = modifier3;
            int i26 = i12 << 3;
            m1246SnackbareQBnUkQ(PaddingKt.m296padding3ABfNKs(modifier3, Dp.m4389constructorimpl(12)), composableLambda, composableLambda2, z12, shape3, color, contentColor, j15, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, true, new c(snackbarData2)), composerStartRestartGroup, (i26 & 3670016) | (i26 & 7168) | 805306368 | (57344 & i26) | (458752 & i26) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            actionColor = actionColor;
            z13 = z12;
            shape4 = shape3;
            modifier2 = modifier9;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    color = j10;
                }
                if ((i11 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 = (-29360129) & i12;
                } else {
                    actionContentColor = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j14;
                    j15 = actionContentColor;
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                } else {
                    color = j10;
                }
                if ((i11 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i12 = (-29360129) & i12;
                } else {
                    actionContentColor = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j14;
                    j15 = actionContentColor;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
            }
            actionLabel = snackbarData.getVisuals().getActionLabel();
            if (actionLabel != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, new e(actionColor, i12, snackbarData, actionLabel));
            } else {
                composableLambda = null;
            }
            if (snackbarData.getVisuals().getWithDismissAction()) {
                snackbarData2 = snackbarData;
                composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, true, new f(snackbarData2, i12));
            } else {
                snackbarData2 = snackbarData;
                composableLambda2 = null;
            }
            Modifier modifier10 = modifier3;
            int i27 = i12 << 3;
            m1246SnackbareQBnUkQ(PaddingKt.m296padding3ABfNKs(modifier3, Dp.m4389constructorimpl(12)), composableLambda, composableLambda2, z12, shape3, color, contentColor, j15, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, true, new c(snackbarData2)), composerStartRestartGroup, (i27 & 3670016) | (i27 & 7168) | 805306368 | (57344 & i27) | (458752 & i27) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            actionColor = actionColor;
            z13 = z12;
            shape4 = shape3;
            modifier2 = modifier10;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(snackbarData, modifier2, z13, shape4, color, contentColor, actionColor, j15, dismissActionContentColor, i10, i11));
    }

    /* JADX INFO: renamed from: access$NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m1248access$NewLineButtonSnackbarkKq0p4A(Function2 function2, Function2 function3, Function2 function4, TextStyle textStyle, long j10, long j11, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332496681);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i11, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:251)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m342widthInVpY3zN4$default(companion, 0.0f, f11532a, 1, null), 0.0f, 1, null), f11534c, 0.0f, 0.0f, f11536e, 6, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion2, top, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM233paddingFromBaselineVpY3zN4 = AlignmentLineKt.m233paddingFromBaselineVpY3zN4(companion, f11533b, f11539h);
            float f6 = f11535d;
            Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(modifierM233paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f6, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM300paddingqDBjuR0$default3 = PaddingKt.m300paddingqDBjuR0$default(columnScopeInstance.align(companion, companion2.getEnd()), 0.0f, 0.0f, function4 == null ? f6 : Dp.m4389constructorimpl(0), 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl4, measurePolicyRowMeasurePolicy, composerM2074constructorimpl4, density4));
            ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(j10)), TextKt.getLocalTextStyle().provides(textStyle)}, (Function2<? super Composer, ? super Integer, Unit>) function3, composerStartRestartGroup, (i11 & 112) | 8);
            composerStartRestartGroup.startReplaceableGroup(302366994);
            if (function4 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(j11))}, (Function2<? super Composer, ? super Integer, Unit>) function4, composerStartRestartGroup, ((i11 >> 3) & 112) | 8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.z3(function2, function3, function4, textStyle, j10, j11, i10));
    }

    /* JADX INFO: renamed from: access$OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m1249access$OneRowSnackbarkKq0p4A(Function2 function2, Function2 function3, Function2 function4, TextStyle textStyle, long j10, long j11, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-903235475);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i11, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:296)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, f11534c, 0.0f, function4 == null ? f11535d : Dp.m4389constructorimpl(0), 0.0f, 10, null);
            l0.a4 a4Var = new l0.a4();
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
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
            Updater.m2081setimpl(composerM2074constructorimpl, a4Var, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, density, companion2.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            ai.a.j(0, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, f11537f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM298paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-167734350);
            if (function3 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "action");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, density3));
                ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(j10)), TextKt.getLocalTextStyle().provides(textStyle)}, (Function2<? super Composer, ? super Integer, Unit>) function3, composerStartRestartGroup, (i11 & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(44738809);
            if (function4 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierLayoutId2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl4, measurePolicyC3, composerM2074constructorimpl4, density4));
                ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(j11))}, (Function2<? super Composer, ? super Integer, Unit>) function4, composerStartRestartGroup, ((i11 >> 3) & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
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
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.b4(function2, function3, function4, textStyle, j10, j11, i10));
    }
}
