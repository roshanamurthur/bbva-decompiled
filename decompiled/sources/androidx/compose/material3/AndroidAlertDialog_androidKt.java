package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aâ\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aD\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/runtime/Composable;", "confirmButton", "Landroidx/compose/ui/Modifier;", "modifier", "dismissButton", "icon", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/ui/window/DialogProperties;", LogKeysKt.PROPERTIES, "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "AlertDialog", "content", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidAlertDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material3/AndroidAlertDialog_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,192:1\n154#2:193\n154#2:194\n*S KotlinDebug\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material3/AndroidAlertDialog_androidKt\n*L\n190#1:193\n191#1:194\n*E\n"})
public final class AndroidAlertDialog_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9187a = Dp.m4389constructorimpl(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9188b = Dp.m4389constructorimpl(12);

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9189p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9190q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9191r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f9192s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f9193t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f9194u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f9195w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f9196x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f9197y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Shape shape, long j10, float f6, long j11, long j12, long j13, int i10, int i11, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6) {
            super(2);
            this.f9189p0 = function2;
            this.f9190q0 = function3;
            this.f9191r0 = function4;
            this.f9192s0 = shape;
            this.f9193t0 = j10;
            this.f9194u0 = f6;
            this.v0 = j11;
            this.f9195w0 = j12;
            this.f9196x0 = j13;
            this.f9197y0 = i10;
            this.E0 = i11;
            this.F0 = function5;
            this.G0 = function6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(741647174, iIntValue, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:91)");
                }
                int i10 = this.f9197y0;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1873210524, true, new h(i10, this.F0, this.G0));
                Function2<Composer, Integer, Unit> function2 = this.f9189p0;
                Function2<Composer, Integer, Unit> function3 = this.f9190q0;
                Function2<Composer, Integer, Unit> function4 = this.f9191r0;
                Shape shape = this.f9192s0;
                long j10 = this.f9193t0;
                float f6 = this.f9194u0;
                long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6);
                long j11 = this.v0;
                long j12 = this.f9195w0;
                long j13 = this.f9196x0;
                int i11 = i10 >> 6;
                int i12 = (i11 & 7168) | (i11 & 896) | 6 | (57344 & i11) | (458752 & i11) | (i11 & 3670016);
                int i13 = this.E0;
                AlertDialogKt.m905AlertDialogContent4hvqGtA(composableLambda, null, function2, function3, function4, shape, j10, f6, color, j11, j12, j13, composer2, i12 | ((i13 << 15) & 29360128) | (i10 & 1879048192), (i13 & 14) | (i13 & 112), 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ long E0;
        public final /* synthetic */ long F0;
        public final /* synthetic */ float G0;
        public final /* synthetic */ DialogProperties H0;
        public final /* synthetic */ int I0;
        public final /* synthetic */ int J0;
        public final /* synthetic */ int K0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9198p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9199q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9200r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9201s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9202t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9203u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Shape f9204w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f9205x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ long f9206y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Shape shape, long j10, long j11, long j12, long j13, float f6, DialogProperties dialogProperties, int i10, int i11, int i12) {
            super(2);
            this.f9198p0 = function0;
            this.f9199q0 = function2;
            this.f9200r0 = modifier;
            this.f9201s0 = function3;
            this.f9202t0 = function4;
            this.f9203u0 = function5;
            this.v0 = function6;
            this.f9204w0 = shape;
            this.f9205x0 = j10;
            this.f9206y0 = j11;
            this.E0 = j12;
            this.F0 = j13;
            this.G0 = f6;
            this.H0 = dialogProperties;
            this.I0 = i10;
            this.J0 = i11;
            this.K0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidAlertDialog_androidKt.m907AlertDialogOix01E0(this.f9198p0, this.f9199q0, this.f9200r0, this.f9201s0, this.f9202t0, this.f9203u0, this.v0, this.f9204w0, this.f9205x0, this.f9206y0, this.E0, this.F0, this.G0, this.H0, composer, RecomposeScopeImplKt.updateChangedFlags(this.I0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.J0), this.K0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidAlertDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material3/AndroidAlertDialog_androidKt$AlertDialog$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,192:1\n36#2:193\n460#2,13:219\n473#2,3:233\n1114#3,6:194\n67#4,6:200\n73#4:232\n77#4:237\n75#5:206\n76#5,11:208\n89#5:236\n76#6:207\n*S KotlinDebug\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material3/AndroidAlertDialog_androidKt$AlertDialog$3\n*L\n159#1:193\n156#1:219,13\n156#1:233,3\n159#1:194,6\n156#1:200,6\n156#1:232\n156#1:237\n156#1:206\n156#1:208,11\n156#1:236\n156#1:207\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9207p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9208q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f9209r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, Modifier modifier, Function2 function2) {
            super(2);
            this.f9207p0 = modifier;
            this.f9208q0 = function2;
            this.f9209r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(823217604, iIntValue, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:153)");
                }
                String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1296getDialogadMyvUU(), composer2, 6);
                Modifier modifierM339sizeInqDBjuR0$default = SizeKt.m339sizeInqDBjuR0$default(this.f9207p0, AlertDialogKt.getDialogMinWidth(), 0.0f, AlertDialogKt.getDialogMaxWidth(), 0.0f, 10, null);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(strM1320getStringNWtq28);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new i(strM1320getStringNWtq28);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierThen = modifierM339sizeInqDBjuR0$default.then(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.appcompat.widget.g0.d(this.f9208q0, composer2, Integer.valueOf((this.f9209r0 >> 9) & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9210p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9211q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DialogProperties f9212r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9213s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9214t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f9215u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<Unit> function0, Modifier modifier, DialogProperties dialogProperties, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f9210p0 = function0;
            this.f9211q0 = modifier;
            this.f9212r0 = dialogProperties;
            this.f9213s0 = function2;
            this.f9214t0 = i10;
            this.f9215u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidAlertDialog_androidKt.AlertDialog(this.f9210p0, this.f9211q0, this.f9212r0, this.f9213s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9214t0 | 1), this.f9215u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void AlertDialog(@NotNull Function0<Unit> onDismissRequest, @Nullable Modifier modifier, @Nullable DialogProperties dialogProperties, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        DialogProperties dialogProperties2;
        int i14;
        int i15;
        Modifier modifier3;
        DialogProperties dialogProperties3;
        Modifier modifier4;
        DialogProperties dialogProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(63450171);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(63450171, i12, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
                    }
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 823217604, true, new c(i12, modifier3, content)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i12 >> 3) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    dialogProperties4 = dialogProperties3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    dialogProperties4 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, modifier4, dialogProperties4, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            dialogProperties2 = dialogProperties;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(63450171, i12, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 823217604, true, new c(i12, modifier3, content)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i12 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                dialogProperties4 = dialogProperties3;
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(63450171, i12, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 823217604, true, new c(i12, modifier3, content)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i12 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                dialogProperties4 = dialogProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, modifier4, dialogProperties4, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                dialogProperties2 = dialogProperties;
                if (composerStartRestartGroup.changed(dialogProperties2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(63450171, i12, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 823217604, true, new c(i12, modifier3, content)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i12 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                dialogProperties4 = dialogProperties3;
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(63450171, i12, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 823217604, true, new c(i12, modifier3, content)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i12 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                dialogProperties4 = dialogProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, modifier4, dialogProperties4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        dialogProperties2 = dialogProperties;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 5851) == 1170) {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
            } else {
                dialogProperties3 = dialogProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(63450171, i12, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
            }
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 823217604, true, new c(i12, modifier3, content)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i12 >> 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            dialogProperties4 = dialogProperties3;
        } else {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
            } else {
                dialogProperties3 = dialogProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(63450171, i12, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
            }
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 823217604, true, new c(i12, modifier3, content)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i12 >> 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            dialogProperties4 = dialogProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, modifier4, dialogProperties4, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0180  */
    /* JADX WARN: Code duplicated, block: B:133:0x0184  */
    /* JADX WARN: Code duplicated, block: B:135:0x018c  */
    /* JADX WARN: Code duplicated, block: B:136:0x018f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0197  */
    /* JADX WARN: Code duplicated, block: B:142:0x019c  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:177:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0230  */
    /* JADX WARN: Code duplicated, block: B:181:0x0236  */
    /* JADX WARN: Code duplicated, block: B:183:0x0239  */
    /* JADX WARN: Code duplicated, block: B:185:0x023c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0240  */
    /* JADX WARN: Code duplicated, block: B:191:0x0246  */
    /* JADX WARN: Code duplicated, block: B:192:0x024f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0254  */
    /* JADX WARN: Code duplicated, block: B:196:0x025d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0263  */
    /* JADX WARN: Code duplicated, block: B:200:0x0271  */
    /* JADX WARN: Code duplicated, block: B:203:0x0277  */
    /* JADX WARN: Code duplicated, block: B:204:0x0280  */
    /* JADX WARN: Code duplicated, block: B:207:0x0286  */
    /* JADX WARN: Code duplicated, block: B:208:0x0290  */
    /* JADX WARN: Code duplicated, block: B:210:0x0294  */
    /* JADX WARN: Code duplicated, block: B:211:0x029b  */
    /* JADX WARN: Code duplicated, block: B:213:0x029f  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:221:0x0341  */
    /* JADX WARN: Code duplicated, block: B:226:0x0360  */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    public static final void m907AlertDialogOix01E0(@NotNull Function0<Unit> onDismissRequest, @NotNull Function2<? super Composer, ? super Integer, Unit> confirmButton, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @Nullable Shape shape, long j10, long j11, long j12, long j13, float f6, @Nullable DialogProperties dialogProperties, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        Modifier modifier2;
        int i14;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i15;
        int i16;
        Function2<? super Composer, ? super Integer, Unit> function7;
        int i17;
        int i18;
        Function2<? super Composer, ? super Integer, Unit> function8;
        int i19;
        int i20;
        Function2<? super Composer, ? super Integer, Unit> function9;
        int i21;
        Shape shape2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Shape shape3;
        long containerColor;
        long iconContentColor;
        long titleContentColor;
        long textContentColor;
        float fM904getTonalElevationD9Ej5fM;
        DialogProperties dialogProperties2;
        Function2<? super Composer, ? super Integer, Unit> function10;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Shape shape4;
        long j14;
        Modifier modifier3;
        long j15;
        long j16;
        int i27;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function13;
        long j17;
        Composer composer2;
        Modifier modifier4;
        Function2<? super Composer, ? super Integer, Unit> function14;
        Function2<? super Composer, ? super Integer, Unit> function15;
        Function2<? super Composer, ? super Integer, Unit> function16;
        Shape shape5;
        long j18;
        long j19;
        long j20;
        long j21;
        float f10;
        DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i28;
        int i29;
        int i30;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2081346864);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(confirmButton) ? 32 : 16;
        }
        int i31 = i12 & 4;
        if (i31 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    function6 = function2;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    i13 |= 24576;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i10 & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    function9 = function5;
                } else {
                    function9 = function5;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 29360128) == 0) {
                    if ((i12 & 128) == 0) {
                        shape2 = shape;
                        int i32 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i13 |= i32;
                    } else {
                        shape2 = shape;
                    }
                    i13 |= i32;
                } else {
                    shape2 = shape;
                }
                if ((i10 & 234881024) == 0) {
                    int i33 = i13;
                    if ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) {
                        i30 = 33554432;
                    } else {
                        i30 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    i22 = i33 | i30;
                } else {
                    i22 = i13;
                }
                if ((i10 & 1879048192) != 0) {
                    if ((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) {
                        i29 = 268435456;
                    } else {
                        i29 = PKIFailureInfo.duplicateCertReq;
                    }
                    i22 |= i29;
                }
                if ((i11 & 14) == 0) {
                    if ((i12 & 1024) == 0 || !composerStartRestartGroup.changed(j12)) {
                        i28 = 2;
                    } else {
                        i28 = 4;
                    }
                    i23 = i11 | i28;
                } else {
                    i23 = i11;
                }
                if ((i11 & 112) != 0) {
                    i23 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(j13)) ? 16 : 32;
                }
                i24 = i12 & 4096;
                if (i24 != 0) {
                    if ((i11 & 896) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    i26 = i12 & 8192;
                    if (i26 != 0) {
                        if ((i11 & 7168) == 0) {
                            i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                        }
                        if ((i22 & 1533916891) != 306783378 && (i23 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            j21 = j13;
                            f10 = f6;
                            dialogProperties3 = dialogProperties;
                            function12 = function7;
                            function15 = function8;
                            function16 = function9;
                            shape5 = shape2;
                            modifier4 = modifier2;
                            j18 = j10;
                            j19 = j11;
                            function14 = function6;
                            composer2 = composerStartRestartGroup;
                            j20 = j12;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i31 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i14 != 0) {
                                    function6 = null;
                                }
                                if (i16 != 0) {
                                    function7 = null;
                                }
                                if (i18 != 0) {
                                    function8 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function17 = i20 == 0 ? function9 : null;
                                if ((i12 & 128) != 0) {
                                    shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    i22 &= -29360129;
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i12 & 256) != 0) {
                                    containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                    i22 &= -234881025;
                                } else {
                                    containerColor = j10;
                                }
                                if ((i12 & 512) != 0) {
                                    iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                    i22 &= -1879048193;
                                } else {
                                    iconContentColor = j11;
                                }
                                if ((i12 & 1024) != 0) {
                                    titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                    i23 &= -15;
                                } else {
                                    titleContentColor = j12;
                                }
                                if ((i12 & 2048) != 0) {
                                    textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                    i23 &= -113;
                                } else {
                                    textContentColor = j13;
                                }
                                if (i24 != 0) {
                                    fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                                } else {
                                    fM904getTonalElevationD9Ej5fM = f6;
                                }
                                if (i26 != 0) {
                                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                                } else {
                                    dialogProperties2 = dialogProperties;
                                }
                                function10 = function17;
                                function11 = function6;
                                shape4 = shape3;
                                j14 = textContentColor;
                                modifier3 = modifier2;
                                j15 = containerColor;
                                j16 = titleContentColor;
                                i27 = i22;
                                function12 = function7;
                                function13 = function8;
                                j17 = iconContentColor;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i12 & 128) != 0) {
                                    i22 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i22 &= -234881025;
                                }
                                if ((i12 & 512) != 0) {
                                    i22 &= -1879048193;
                                }
                                if ((i12 & 1024) != 0) {
                                    i23 &= -15;
                                }
                                if ((i12 & 2048) != 0) {
                                    i23 &= -113;
                                }
                                j15 = j10;
                                j16 = j12;
                                j14 = j13;
                                fM904getTonalElevationD9Ej5fM = f6;
                                dialogProperties2 = dialogProperties;
                                function11 = function6;
                                function12 = function7;
                                function13 = function8;
                                function10 = function9;
                                shape4 = shape2;
                                modifier3 = modifier2;
                                i27 = i22;
                                j17 = j11;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                            }
                            Modifier modifier5 = modifier3;
                            int i34 = i23;
                            int i35 = i27;
                            composer2 = composerStartRestartGroup;
                            AlertDialog(onDismissRequest, modifier5, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i35, i34, function11, confirmButton)), composer2, (i35 & 14) | 3072 | ((i35 >> 3) & 112) | ((i34 >> 3) & 896), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            function14 = function11;
                            function15 = function13;
                            function16 = function10;
                            shape5 = shape4;
                            j18 = j15;
                            j19 = j17;
                            j20 = j16;
                            j21 = j14;
                            f10 = fM904getTonalElevationD9Ej5fM;
                            dialogProperties3 = dialogProperties2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
                    }
                    i23 |= 3072;
                    if ((i22 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier6 = modifier3;
                        int i36 = i23;
                        int i37 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier6, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i37, i36, function11, confirmButton)), composer2, (i37 & 14) | 3072 | ((i37 >> 3) & 112) | ((i36 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier6;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier7 = modifier3;
                        int i38 = i23;
                        int i39 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier7, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i39, i38, function11, confirmButton)), composer2, (i39 & 14) | 3072 | ((i39 >> 3) & 112) | ((i38 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier7;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
                }
                i23 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                i26 = i12 & 8192;
                if (i26 != 0) {
                    if ((i11 & 7168) == 0) {
                        i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                    }
                    if ((i22 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier8 = modifier3;
                        int i310 = i23;
                        int i311 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier8, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i311, i310, function11, confirmButton)), composer2, (i311 & 14) | 3072 | ((i311 >> 3) & 112) | ((i310 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier8;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier9 = modifier3;
                        int i312 = i23;
                        int i313 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier9, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i313, i312, function11, confirmButton)), composer2, (i313 & 14) | 3072 | ((i313 >> 3) & 112) | ((i312 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier9;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
                }
                i23 |= 3072;
                if ((i22 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier10 = modifier3;
                    int i314 = i23;
                    int i315 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier10, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i315, i314, function11, confirmButton)), composer2, (i315 & 14) | 3072 | ((i315 >> 3) & 112) | ((i314 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier10;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier11 = modifier3;
                    int i316 = i23;
                    int i317 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier11, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i317, i316, function11, confirmButton)), composer2, (i317 & 14) | 3072 | ((i317 >> 3) & 112) | ((i316 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier11;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
            }
            i13 |= 3072;
            function6 = function2;
            i16 = i12 & 16;
            if (i16 != 0) {
                i13 |= 24576;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                function9 = function5;
            } else {
                function9 = function5;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i13 |= i32;
                } else {
                    shape2 = shape;
                }
                i13 |= i32;
            } else {
                shape2 = shape;
            }
            if ((i10 & 234881024) == 0) {
                int i318 = i13;
                if ((i12 & 256) == 0) {
                    i30 = 33554432;
                } else {
                    i30 = 33554432;
                }
                i22 = i318 | i30;
            } else {
                i22 = i13;
            }
            if ((i10 & 1879048192) != 0) {
                if ((i12 & 512) == 0) {
                    i29 = 268435456;
                } else {
                    i29 = 268435456;
                }
                i22 |= i29;
            }
            if ((i11 & 14) == 0) {
                if ((i12 & 1024) == 0) {
                    i28 = 2;
                } else {
                    i28 = 2;
                }
                i23 = i11 | i28;
            } else {
                i23 = i11;
            }
            if ((i11 & 112) != 0) {
                i23 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(j13)) ? 16 : 32;
            }
            i24 = i12 & 4096;
            if (i24 != 0) {
                if ((i11 & 896) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                i26 = i12 & 8192;
                if (i26 != 0) {
                    if ((i11 & 7168) == 0) {
                        i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                    }
                    if ((i22 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier12 = modifier3;
                        int i319 = i23;
                        int i3110 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier12, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3110, i319, function11, confirmButton)), composer2, (i3110 & 14) | 3072 | ((i3110 >> 3) & 112) | ((i319 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier12;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier13 = modifier3;
                        int i3111 = i23;
                        int i3112 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier13, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3112, i3111, function11, confirmButton)), composer2, (i3112 & 14) | 3072 | ((i3112 >> 3) & 112) | ((i3111 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier13;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
                }
                i23 |= 3072;
                if ((i22 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier14 = modifier3;
                    int i3113 = i23;
                    int i3114 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier14, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3114, i3113, function11, confirmButton)), composer2, (i3114 & 14) | 3072 | ((i3114 >> 3) & 112) | ((i3113 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier14;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier15 = modifier3;
                    int i3115 = i23;
                    int i3116 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier15, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3116, i3115, function11, confirmButton)), composer2, (i3116 & 14) | 3072 | ((i3116 >> 3) & 112) | ((i3115 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier15;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
            }
            i23 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i26 = i12 & 8192;
            if (i26 != 0) {
                if ((i11 & 7168) == 0) {
                    i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                }
                if ((i22 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier16 = modifier3;
                    int i3117 = i23;
                    int i3118 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier16, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3118, i3117, function11, confirmButton)), composer2, (i3118 & 14) | 3072 | ((i3118 >> 3) & 112) | ((i3117 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier16;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier17 = modifier3;
                    int i3119 = i23;
                    int i31110 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier17, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31110, i3119, function11, confirmButton)), composer2, (i31110 & 14) | 3072 | ((i31110 >> 3) & 112) | ((i3119 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier17;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
            }
            i23 |= 3072;
            if ((i22 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier18 = modifier3;
                int i31111 = i23;
                int i31112 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier18, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31112, i31111, function11, confirmButton)), composer2, (i31112 & 14) | 3072 | ((i31112 >> 3) & 112) | ((i31111 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier18;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier19 = modifier3;
                int i31113 = i23;
                int i31114 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier19, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31114, i31113, function11, confirmButton)), composer2, (i31114 & 14) | 3072 | ((i31114 >> 3) & 112) | ((i31113 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier19;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                function6 = function2;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                i13 |= 24576;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                function9 = function5;
            } else {
                function9 = function5;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i13 |= i32;
                } else {
                    shape2 = shape;
                }
                i13 |= i32;
            } else {
                shape2 = shape;
            }
            if ((i10 & 234881024) == 0) {
                int i3120 = i13;
                if ((i12 & 256) == 0) {
                    i30 = 33554432;
                } else {
                    i30 = 33554432;
                }
                i22 = i3120 | i30;
            } else {
                i22 = i13;
            }
            if ((i10 & 1879048192) != 0) {
                if ((i12 & 512) == 0) {
                    i29 = 268435456;
                } else {
                    i29 = 268435456;
                }
                i22 |= i29;
            }
            if ((i11 & 14) == 0) {
                if ((i12 & 1024) == 0) {
                    i28 = 2;
                } else {
                    i28 = 2;
                }
                i23 = i11 | i28;
            } else {
                i23 = i11;
            }
            if ((i11 & 112) != 0) {
                i23 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(j13)) ? 16 : 32;
            }
            i24 = i12 & 4096;
            if (i24 != 0) {
                if ((i11 & 896) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                i26 = i12 & 8192;
                if (i26 != 0) {
                    if ((i11 & 7168) == 0) {
                        i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                    }
                    if ((i22 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier110 = modifier3;
                        int i31115 = i23;
                        int i31116 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier110, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31116, i31115, function11, confirmButton)), composer2, (i31116 & 14) | 3072 | ((i31116 >> 3) & 112) | ((i31115 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier110;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        } else {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                function6 = null;
                            }
                            if (i16 != 0) {
                                function7 = null;
                            }
                            if (i18 != 0) {
                                function8 = null;
                            }
                            if (i20 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                                shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i22 &= -29360129;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i12 & 256) != 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i22 &= -234881025;
                            } else {
                                containerColor = j10;
                            }
                            if ((i12 & 512) != 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i22 &= -1879048193;
                            } else {
                                iconContentColor = j11;
                            }
                            if ((i12 & 1024) != 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i23 &= -15;
                            } else {
                                titleContentColor = j12;
                            }
                            if ((i12 & 2048) != 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i23 &= -113;
                            } else {
                                textContentColor = j13;
                            }
                            if (i24 != 0) {
                                fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                            } else {
                                fM904getTonalElevationD9Ej5fM = f6;
                            }
                            if (i26 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function10 = function17;
                            function11 = function6;
                            shape4 = shape3;
                            j14 = textContentColor;
                            modifier3 = modifier2;
                            j15 = containerColor;
                            j16 = titleContentColor;
                            i27 = i22;
                            function12 = function7;
                            function13 = function8;
                            j17 = iconContentColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                        }
                        Modifier modifier111 = modifier3;
                        int i31117 = i23;
                        int i31118 = i27;
                        composer2 = composerStartRestartGroup;
                        AlertDialog(onDismissRequest, modifier111, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31118, i31117, function11, confirmButton)), composer2, (i31118 & 14) | 3072 | ((i31118 >> 3) & 112) | ((i31117 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier111;
                        function14 = function11;
                        function15 = function13;
                        function16 = function10;
                        shape5 = shape4;
                        j18 = j15;
                        j19 = j17;
                        j20 = j16;
                        j21 = j14;
                        f10 = fM904getTonalElevationD9Ej5fM;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
                }
                i23 |= 3072;
                if ((i22 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier112 = modifier3;
                    int i31119 = i23;
                    int i311110 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier112, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i311110, i31119, function11, confirmButton)), composer2, (i311110 & 14) | 3072 | ((i311110 >> 3) & 112) | ((i31119 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier112;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier113 = modifier3;
                    int i311111 = i23;
                    int i311112 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier113, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i311112, i311111, function11, confirmButton)), composer2, (i311112 & 14) | 3072 | ((i311112 >> 3) & 112) | ((i311111 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier113;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
            }
            i23 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i26 = i12 & 8192;
            if (i26 != 0) {
                if ((i11 & 7168) == 0) {
                    i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                }
                if ((i22 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier114 = modifier3;
                    int i311113 = i23;
                    int i311114 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier114, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i311114, i311113, function11, confirmButton)), composer2, (i311114 & 14) | 3072 | ((i311114 >> 3) & 112) | ((i311113 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier114;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier115 = modifier3;
                    int i311115 = i23;
                    int i311116 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier115, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i311116, i311115, function11, confirmButton)), composer2, (i311116 & 14) | 3072 | ((i311116 >> 3) & 112) | ((i311115 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier115;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
            }
            i23 |= 3072;
            if ((i22 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier116 = modifier3;
                int i311117 = i23;
                int i311118 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier116, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i311118, i311117, function11, confirmButton)), composer2, (i311118 & 14) | 3072 | ((i311118 >> 3) & 112) | ((i311117 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier116;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier117 = modifier3;
                int i311119 = i23;
                int i3111110 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier117, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3111110, i311119, function11, confirmButton)), composer2, (i3111110 & 14) | 3072 | ((i3111110 >> 3) & 112) | ((i311119 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier117;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
        }
        i13 |= 3072;
        function6 = function2;
        i16 = i12 & 16;
        if (i16 != 0) {
            i13 |= 24576;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
        }
        i18 = i12 & 32;
        if (i18 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function8 = function4;
        } else {
            function8 = function4;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function8)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
        }
        i20 = i12 & 64;
        if (i20 != 0) {
            i13 |= 1572864;
            function9 = function5;
        } else {
            function9 = function5;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function9)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
        }
        if ((i10 & 29360128) == 0) {
            if ((i12 & 128) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i13 |= i32;
            } else {
                shape2 = shape;
            }
            i13 |= i32;
        } else {
            shape2 = shape;
        }
        if ((i10 & 234881024) == 0) {
            int i3121 = i13;
            if ((i12 & 256) == 0) {
                i30 = 33554432;
            } else {
                i30 = 33554432;
            }
            i22 = i3121 | i30;
        } else {
            i22 = i13;
        }
        if ((i10 & 1879048192) != 0) {
            if ((i12 & 512) == 0) {
                i29 = 268435456;
            } else {
                i29 = 268435456;
            }
            i22 |= i29;
        }
        if ((i11 & 14) == 0) {
            if ((i12 & 1024) == 0) {
                i28 = 2;
            } else {
                i28 = 2;
            }
            i23 = i11 | i28;
        } else {
            i23 = i11;
        }
        if ((i11 & 112) != 0) {
            i23 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(j13)) ? 16 : 32;
        }
        i24 = i12 & 4096;
        if (i24 != 0) {
            if ((i11 & 896) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i23 |= i25;
            }
            i26 = i12 & 8192;
            if (i26 != 0) {
                if ((i11 & 7168) == 0) {
                    i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                }
                if ((i22 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier118 = modifier3;
                    int i3111111 = i23;
                    int i3111112 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier118, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3111112, i3111111, function11, confirmButton)), composer2, (i3111112 & 14) | 3072 | ((i3111112 >> 3) & 112) | ((i3111111 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier118;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            function6 = null;
                        }
                        if (i16 != 0) {
                            function7 = null;
                        }
                        if (i18 != 0) {
                            function8 = null;
                        }
                        if (i20 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                            shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i22 &= -29360129;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i12 & 256) != 0) {
                            containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i22 &= -234881025;
                        } else {
                            containerColor = j10;
                        }
                        if ((i12 & 512) != 0) {
                            iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                            i22 &= -1879048193;
                        } else {
                            iconContentColor = j11;
                        }
                        if ((i12 & 1024) != 0) {
                            titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                            i23 &= -15;
                        } else {
                            titleContentColor = j12;
                        }
                        if ((i12 & 2048) != 0) {
                            textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                            i23 &= -113;
                        } else {
                            textContentColor = j13;
                        }
                        if (i24 != 0) {
                            fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                        } else {
                            fM904getTonalElevationD9Ej5fM = f6;
                        }
                        if (i26 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function10 = function17;
                        function11 = function6;
                        shape4 = shape3;
                        j14 = textContentColor;
                        modifier3 = modifier2;
                        j15 = containerColor;
                        j16 = titleContentColor;
                        i27 = i22;
                        function12 = function7;
                        function13 = function8;
                        j17 = iconContentColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                    }
                    Modifier modifier119 = modifier3;
                    int i3111113 = i23;
                    int i3111114 = i27;
                    composer2 = composerStartRestartGroup;
                    AlertDialog(onDismissRequest, modifier119, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3111114, i3111113, function11, confirmButton)), composer2, (i3111114 & 14) | 3072 | ((i3111114 >> 3) & 112) | ((i3111113 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier119;
                    function14 = function11;
                    function15 = function13;
                    function16 = function10;
                    shape5 = shape4;
                    j18 = j15;
                    j19 = j17;
                    j20 = j16;
                    j21 = j14;
                    f10 = fM904getTonalElevationD9Ej5fM;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
            }
            i23 |= 3072;
            if ((i22 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier1110 = modifier3;
                int i3111115 = i23;
                int i3111116 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier1110, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3111116, i3111115, function11, confirmButton)), composer2, (i3111116 & 14) | 3072 | ((i3111116 >> 3) & 112) | ((i3111115 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1110;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier1111 = modifier3;
                int i3111117 = i23;
                int i3111118 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier1111, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i3111118, i3111117, function11, confirmButton)), composer2, (i3111118 & 14) | 3072 | ((i3111118 >> 3) & 112) | ((i3111117 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1111;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
        }
        i23 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i26 = i12 & 8192;
        if (i26 != 0) {
            if ((i11 & 7168) == 0) {
                i23 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
            }
            if ((i22 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier1112 = modifier3;
                int i3111119 = i23;
                int i31111110 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier1112, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31111110, i3111119, function11, confirmButton)), composer2, (i31111110 & 14) | 3072 | ((i31111110 >> 3) & 112) | ((i3111119 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1112;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function6 = null;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    }
                    if (i20 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                        shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i22 &= -29360129;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i12 & 256) != 0) {
                        containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i22 &= -234881025;
                    } else {
                        containerColor = j10;
                    }
                    if ((i12 & 512) != 0) {
                        iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                        i22 &= -1879048193;
                    } else {
                        iconContentColor = j11;
                    }
                    if ((i12 & 1024) != 0) {
                        titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                        i23 &= -15;
                    } else {
                        titleContentColor = j12;
                    }
                    if ((i12 & 2048) != 0) {
                        textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                        i23 &= -113;
                    } else {
                        textContentColor = j13;
                    }
                    if (i24 != 0) {
                        fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                    } else {
                        fM904getTonalElevationD9Ej5fM = f6;
                    }
                    if (i26 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function10 = function17;
                    function11 = function6;
                    shape4 = shape3;
                    j14 = textContentColor;
                    modifier3 = modifier2;
                    j15 = containerColor;
                    j16 = titleContentColor;
                    i27 = i22;
                    function12 = function7;
                    function13 = function8;
                    j17 = iconContentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                }
                Modifier modifier1113 = modifier3;
                int i31111111 = i23;
                int i31111112 = i27;
                composer2 = composerStartRestartGroup;
                AlertDialog(onDismissRequest, modifier1113, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31111112, i31111111, function11, confirmButton)), composer2, (i31111112 & 14) | 3072 | ((i31111112 >> 3) & 112) | ((i31111111 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier1113;
                function14 = function11;
                function15 = function13;
                function16 = function10;
                shape5 = shape4;
                j18 = j15;
                j19 = j17;
                j20 = j16;
                j21 = j14;
                f10 = fM904getTonalElevationD9Ej5fM;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
        }
        i23 |= 3072;
        if ((i22 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i16 != 0) {
                    function7 = null;
                }
                if (i18 != 0) {
                    function8 = null;
                }
                if (i20 == 0) {
                }
                if ((i12 & 128) != 0) {
                    shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i22 &= -29360129;
                } else {
                    shape3 = shape2;
                }
                if ((i12 & 256) != 0) {
                    containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i22 &= -234881025;
                } else {
                    containerColor = j10;
                }
                if ((i12 & 512) != 0) {
                    iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                    i22 &= -1879048193;
                } else {
                    iconContentColor = j11;
                }
                if ((i12 & 1024) != 0) {
                    titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                    i23 &= -15;
                } else {
                    titleContentColor = j12;
                }
                if ((i12 & 2048) != 0) {
                    textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                    i23 &= -113;
                } else {
                    textContentColor = j13;
                }
                if (i24 != 0) {
                    fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                } else {
                    fM904getTonalElevationD9Ej5fM = f6;
                }
                if (i26 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function10 = function17;
                function11 = function6;
                shape4 = shape3;
                j14 = textContentColor;
                modifier3 = modifier2;
                j15 = containerColor;
                j16 = titleContentColor;
                i27 = i22;
                function12 = function7;
                function13 = function8;
                j17 = iconContentColor;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i16 != 0) {
                    function7 = null;
                }
                if (i18 != 0) {
                    function8 = null;
                }
                if (i20 == 0) {
                }
                if ((i12 & 128) != 0) {
                    shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i22 &= -29360129;
                } else {
                    shape3 = shape2;
                }
                if ((i12 & 256) != 0) {
                    containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i22 &= -234881025;
                } else {
                    containerColor = j10;
                }
                if ((i12 & 512) != 0) {
                    iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                    i22 &= -1879048193;
                } else {
                    iconContentColor = j11;
                }
                if ((i12 & 1024) != 0) {
                    titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                    i23 &= -15;
                } else {
                    titleContentColor = j12;
                }
                if ((i12 & 2048) != 0) {
                    textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                    i23 &= -113;
                } else {
                    textContentColor = j13;
                }
                if (i24 != 0) {
                    fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                } else {
                    fM904getTonalElevationD9Ej5fM = f6;
                }
                if (i26 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function10 = function17;
                function11 = function6;
                shape4 = shape3;
                j14 = textContentColor;
                modifier3 = modifier2;
                j15 = containerColor;
                j16 = titleContentColor;
                i27 = i22;
                function12 = function7;
                function13 = function8;
                j17 = iconContentColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
            }
            Modifier modifier1114 = modifier3;
            int i31111113 = i23;
            int i31111114 = i27;
            composer2 = composerStartRestartGroup;
            AlertDialog(onDismissRequest, modifier1114, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31111114, i31111113, function11, confirmButton)), composer2, (i31111114 & 14) | 3072 | ((i31111114 >> 3) & 112) | ((i31111113 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier1114;
            function14 = function11;
            function15 = function13;
            function16 = function10;
            shape5 = shape4;
            j18 = j15;
            j19 = j17;
            j20 = j16;
            j21 = j14;
            f10 = fM904getTonalElevationD9Ej5fM;
            dialogProperties3 = dialogProperties2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i16 != 0) {
                    function7 = null;
                }
                if (i18 != 0) {
                    function8 = null;
                }
                if (i20 == 0) {
                }
                if ((i12 & 128) != 0) {
                    shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i22 &= -29360129;
                } else {
                    shape3 = shape2;
                }
                if ((i12 & 256) != 0) {
                    containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i22 &= -234881025;
                } else {
                    containerColor = j10;
                }
                if ((i12 & 512) != 0) {
                    iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                    i22 &= -1879048193;
                } else {
                    iconContentColor = j11;
                }
                if ((i12 & 1024) != 0) {
                    titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                    i23 &= -15;
                } else {
                    titleContentColor = j12;
                }
                if ((i12 & 2048) != 0) {
                    textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                    i23 &= -113;
                } else {
                    textContentColor = j13;
                }
                if (i24 != 0) {
                    fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                } else {
                    fM904getTonalElevationD9Ej5fM = f6;
                }
                if (i26 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function10 = function17;
                function11 = function6;
                shape4 = shape3;
                j14 = textContentColor;
                modifier3 = modifier2;
                j15 = containerColor;
                j16 = titleContentColor;
                i27 = i22;
                function12 = function7;
                function13 = function8;
                j17 = iconContentColor;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    function6 = null;
                }
                if (i16 != 0) {
                    function7 = null;
                }
                if (i18 != 0) {
                    function8 = null;
                }
                if (i20 == 0) {
                }
                if ((i12 & 128) != 0) {
                    shape3 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i22 &= -29360129;
                } else {
                    shape3 = shape2;
                }
                if ((i12 & 256) != 0) {
                    containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i22 &= -234881025;
                } else {
                    containerColor = j10;
                }
                if ((i12 & 512) != 0) {
                    iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                    i22 &= -1879048193;
                } else {
                    iconContentColor = j11;
                }
                if ((i12 & 1024) != 0) {
                    titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                    i23 &= -15;
                } else {
                    titleContentColor = j12;
                }
                if ((i12 & 2048) != 0) {
                    textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                    i23 &= -113;
                } else {
                    textContentColor = j13;
                }
                if (i24 != 0) {
                    fM904getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m904getTonalElevationD9Ej5fM();
                } else {
                    fM904getTonalElevationD9Ej5fM = f6;
                }
                if (i26 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function10 = function17;
                function11 = function6;
                shape4 = shape3;
                j14 = textContentColor;
                modifier3 = modifier2;
                j15 = containerColor;
                j16 = titleContentColor;
                i27 = i22;
                function12 = function7;
                function13 = function8;
                j17 = iconContentColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2081346864, i27, i23, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
            }
            Modifier modifier1115 = modifier3;
            int i31111115 = i23;
            int i31111116 = i27;
            composer2 = composerStartRestartGroup;
            AlertDialog(onDismissRequest, modifier1115, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new a(function12, function13, function10, shape4, j15, fM904getTonalElevationD9Ej5fM, j17, j16, j14, i31111116, i31111115, function11, confirmButton)), composer2, (i31111116 & 14) | 3072 | ((i31111116 >> 3) & 112) | ((i31111115 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier1115;
            function14 = function11;
            function15 = function13;
            function16 = function10;
            shape5 = shape4;
            j18 = j15;
            j19 = j17;
            j20 = j16;
            j21 = j14;
            f10 = fM904getTonalElevationD9Ej5fM;
            dialogProperties3 = dialogProperties2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier4, function14, function12, function15, function16, shape5, j18, j19, j20, j21, f10, dialogProperties3, i10, i11, i12));
    }
}
