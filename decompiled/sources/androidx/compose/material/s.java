package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,522:1\n36#2:523\n456#2,8:547\n464#2,3:561\n467#2,3:565\n1097#3,6:524\n154#4:530\n67#5,5:531\n72#5:564\n76#5:569\n78#6,11:536\n91#6:568\n4144#7,6:555\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1\n*L\n345#1:523\n367#1:547,8\n367#1:561,3\n367#1:565,3\n345#1:524,6\n372#1:530\n367#1:531,5\n367#1:564\n367#1:569\n367#1:536,11\n367#1:568\n367#1:555,6\n*E\n"})
public final class s extends Lambda implements Function4<Constraints, Float, Composer, Integer, Unit> {
    public final /* synthetic */ int E0;
    public final /* synthetic */ float F0;
    public final /* synthetic */ CoroutineScope G0;
    public final /* synthetic */ float H0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> I0;
    public final /* synthetic */ long J0;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f8999p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f9000q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f9001r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f9002s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f9003t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f9004u0;
    public final /* synthetic */ Shape v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ long f9005w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ long f9006x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ float f9007y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(float f6, boolean z10, boolean z11, BackdropScaffoldState backdropScaffoldState, float f10, int i10, Shape shape, long j10, long j11, float f11, int i11, float f12, CoroutineScope coroutineScope, float f13, Function2<? super Composer, ? super Integer, Unit> function2, long j12, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
        super(4);
        this.f8999p0 = f6;
        this.f9000q0 = z10;
        this.f9001r0 = z11;
        this.f9002s0 = backdropScaffoldState;
        this.f9003t0 = f10;
        this.f9004u0 = i10;
        this.v0 = shape;
        this.f9005w0 = j10;
        this.f9006x0 = j11;
        this.f9007y0 = f11;
        this.E0 = i11;
        this.F0 = f12;
        this.G0 = coroutineScope;
        this.H0 = f13;
        this.I0 = function2;
        this.J0 = j12;
        this.K0 = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(Constraints constraints, Float f6, Composer composer, Integer num) {
        int i10;
        long f18296a = constraints.getF18296a();
        float fFloatValue = f6.floatValue();
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            i10 = (composer2.changed(f18296a) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i10 |= composer2.changed(fFloatValue) ? 32 : 16;
        }
        if ((i10 & 731) == 146 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800047509, iIntValue, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:302)");
            }
            float fM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(f18296a) - this.f8999p0;
            float fMin = this.f9000q0 ? Math.min(fM4356getMaxHeightimpl, fFloatValue) : fM4356getMaxHeightimpl;
            boolean z10 = this.f9001r0;
            BackdropScaffoldState backdropScaffoldState = this.f9002s0;
            Modifier modifierNestedScroll$default = z10 ? NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierThen = companion.then(modifierNestedScroll$default);
            BackdropScaffoldState backdropScaffoldState2 = this.f9002s0;
            Map mapMapOf = bk.q.mapOf(TuplesKt.to(Float.valueOf(this.f9003t0), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(fMin), BackdropValue.Revealed));
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SwipeableKt.m841swipeablepPrIpRY(modifierThen, backdropScaffoldState2, mapMapOf, Orientation.Vertical, (288 & 8) != 0 ? true : this.f9001r0, (288 & 16) != 0 ? false : false, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? SwipeableKt.f.f7901p0 : null, (288 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (288 & 256) != 0 ? SwipeableDefaults.INSTANCE.m840getVelocityThresholdD9Ej5fM() : 0.0f), false, new q(backdropScaffoldState, this.G0), 1, null);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(backdropScaffoldState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new i(backdropScaffoldState);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue).then(modifierSemantics$default);
            Shape shape = this.v0;
            long j10 = this.f9005w0;
            long j11 = this.f9006x0;
            float f10 = this.f9007y0;
            float f11 = fMin;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1065299503, true, new l(this.H0, this.I0, this.f9004u0, this.J0, this.f9002s0, this.E0, this.f9001r0, this.G0));
            int i11 = this.E0;
            int i12 = i11 >> 6;
            SurfaceKt.m834SurfaceFjzlyU(modifierThen2, shape, j10, j11, null, f10, composableLambda, composer2, ((i11 >> 3) & 112) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i11 << 6) & 458752), 16);
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, (backdropScaffoldState.isRevealed() && f11 == fM4356getMaxHeightimpl) ? this.F0 : Dp.m4389constructorimpl(0), 7, null);
            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            this.K0.invoke(backdropScaffoldState.getSnackbarHostState(), composer2, Integer.valueOf((i11 >> 18) & 112));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
