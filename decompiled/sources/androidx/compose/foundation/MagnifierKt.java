package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001ao\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0001H\u0007ø\u0001\u0000\u001ao\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000\u001a\u0012\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0001\")\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00158\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#²\u0006\u000e\u0010\u001c\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u001d\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00048\nX\u008a\u0084\u0002²\u0006\u001d\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u001a\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "", "zoom", "Landroidx/compose/foundation/MagnifierStyle;", "style", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "magnifier", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "", ContextualDataConstants.CD_SDK_VERSION, "", "isPlatformMagnifierSupported", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "MagnifierPositionInRoot", "anchorPositionInRoot", "updatedSourceCenter", "updatedMagnifierCenter", "updatedZoom", "updatedOnSizeChanged", "sourceCenterInRoot", "isMagnifierShown", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,392:1\n135#2:393\n146#2:394\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n232#1:393\n230#1:394\n*E\n"})
public final class MagnifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SemanticsPropertyKey<Function0<Offset>> f3394a = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    /* JADX INFO: compiled from: Magnifier.kt */
    public static final class a extends Lambda implements Function1<Density, Offset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3395p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Offset invoke(Density density) {
            Intrinsics.checkNotNullParameter(density, "$this$null");
            return Offset.m2264boximpl(Offset.INSTANCE.m2290getUnspecifiedF1C5BW0());
        }
    }

    /* JADX INFO: compiled from: Magnifier.kt */
    @SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,392:1\n76#2:393\n76#2:394\n25#3:395\n25#3:402\n25#3:409\n25#3:416\n36#3:423\n36#3:430\n1097#4,6:396\n1097#4,6:403\n1097#4,6:410\n1097#4,6:417\n1097#4,6:424\n1097#4,6:431\n81#5:437\n107#5,2:438\n81#5:440\n81#5:441\n81#5:442\n81#5:443\n81#5:444\n81#5:445\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n*L\n272#1:393\n273#1:394\n274#1:395\n279#1:402\n289#1:409\n294#1:416\n372#1:423\n384#1:430\n274#1:396,6\n279#1:403,6\n289#1:410,6\n294#1:417,6\n372#1:424,6\n384#1:431,6\n274#1:437\n274#1:438,2\n275#1:440\n276#1:441\n277#1:442\n278#1:443\n279#1:444\n289#1:445\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Density, Offset> f3396p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Density, Offset> f3397q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f3398r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<DpSize, Unit> f3399s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PlatformMagnifierFactory f3400t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MagnifierStyle f3401u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function2, float f6, Function1<? super DpSize, Unit> function3, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
            super(3);
            this.f3396p0 = function1;
            this.f3397q0 = function2;
            this.f3398r0 = f6;
            this.f3399s0 = function3;
            this.f3400t0 = platformMagnifierFactory;
            this.f3401u0 = magnifierStyle;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -454877003);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454877003, iA, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:270)");
            }
            View view = (View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(Offset.m2264boximpl(Offset.INSTANCE.m2290getUnspecifiedF1C5BW0()), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.f3396p0, composer2, 0);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.f3397q0, composer2, 0);
            float f6 = this.f3398r0;
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(f6), composer2, 0);
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.f3399s0, composer2, 0);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new o(density, stateRememberUpdatedState, mutableState));
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            State state = (State) objRememberedValue2;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new n(state));
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            State state2 = (State) objRememberedValue3;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) objRememberedValue4;
            if (this.f3400t0.getCanUpdateZoom()) {
                f6 = 0.0f;
            }
            MagnifierStyle magnifierStyle = this.f3401u0;
            EffectsKt.LaunchedEffect(new Object[]{view, density, Float.valueOf(f6), magnifierStyle, Boolean.valueOf(Intrinsics.areEqual(magnifierStyle, MagnifierStyle.INSTANCE.getTextDefault()))}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new i(this.f3400t0, this.f3401u0, view, density, this.f3398r0, mutableSharedFlow, stateRememberUpdatedState4, state2, state, stateRememberUpdatedState2, mutableState, stateRememberUpdatedState3, null), composer2, 72);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(mutableState);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new j(mutableState);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceableGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) objRememberedValue5), new k(mutableSharedFlow));
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer2.changed(state);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new m(state);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceableGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierDrawBehind, false, (Function1) objRememberedValue6, 1, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierSemantics$default;
        }
    }

    @NotNull
    public static final SemanticsPropertyKey<Function0<Offset>> getMagnifierPositionInRoot() {
        return f3394a;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i10);
    }

    @RequiresApi(28)
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull Function1<? super Density, Offset> sourceCenter, @NotNull Function1<? super Density, Offset> magnifierCenter, float f6, @NotNull MagnifierStyle style, @Nullable Function1<? super DpSize, Unit> function1, @NotNull PlatformMagnifierFactory platformMagnifierFactory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new b(sourceCenter, magnifierCenter, f6, function1, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function2, float f6, MagnifierStyle magnifierStyle, Function1 function3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = a.f3395p0;
        }
        Function1 function4 = function2;
        if ((i10 & 4) != 0) {
            f6 = Float.NaN;
        }
        float f10 = f6;
        if ((i10 & 8) != 0) {
            magnifierStyle = MagnifierStyle.INSTANCE.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i10 & 16) != 0) {
            function3 = null;
        }
        return magnifier(modifier, function1, function4, f10, magnifierStyle2, function3);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull final Function1<? super Density, Offset> sourceCenter, @NotNull final Function1<? super Density, Offset> magnifierCenter, final float f6, @NotNull final MagnifierStyle style, @Nullable Function1<? super DpSize, Unit> function1) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Function1<InspectorInfo, Unit> noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("sourceCenter", sourceCenter);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("magnifierCenter", magnifierCenter);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("zoom", Float.valueOf(f6));
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("style", style);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier modifierMagnifier = Modifier.INSTANCE;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifierMagnifier = magnifier(modifierMagnifier, sourceCenter, magnifierCenter, f6, style, function1, PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, modifierMagnifier);
    }
}
