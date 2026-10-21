package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.glomohybrid.welcome.presentation.util.TextSwitchHandler;
import com.veridas.detect.ImageAnalysisKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000*b\b\u0002\u0010\u0016\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material3/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "content", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,456:1\n76#2:457\n76#2:479\n25#3:458\n460#3,13:491\n473#3,3:507\n25#3:512\n25#3:519\n1114#4,6:459\n1114#4,6:513\n1114#4,6:520\n1549#5:465\n1620#5,3:466\n1620#5,3:469\n1855#5,2:505\n67#6,6:472\n73#6:504\n77#6:511\n75#7:478\n76#7,11:480\n89#7:510\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n*L\n223#1:457\n398#1:479\n344#1:458\n398#1:491,13\n398#1:507,3\n430#1:512\n443#1:519\n344#1:459,6\n430#1:513,6\n443#1:520,6\n347#1:465\n347#1:466,3\n352#1:469,3\n400#1:505,2\n398#1:472,6\n398#1:504\n398#1:511\n398#1:478\n398#1:480,11\n398#1:510\n*E\n"})
public final class SnackbarHostKt {

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,456:1\n36#2:457\n460#2,13:483\n473#2,3:497\n1114#3,6:458\n67#4,6:464\n73#4:496\n77#4:501\n75#5:470\n76#5,11:472\n89#5:500\n76#6:471\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n388#1:457\n381#1:483,13\n381#1:497,3\n388#1:458,6\n381#1:464,6\n381#1:496\n381#1:501\n381#1:470\n381#1:472,11\n381#1:500\n381#1:471\n*E\n"})
    public static final class a extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11498p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11499q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ List<SnackbarData> f11500r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ l0.x1<SnackbarData> f11501s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SnackbarData snackbarData, SnackbarData snackbarData2, List<SnackbarData> list, l0.x1<SnackbarData> x1Var) {
            super(3);
            this.f11498p0 = snackbarData;
            this.f11499q0 = snackbarData2;
            this.f11500r0 = list;
            this.f11501s0 = x1Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Function2<? super Composer, ? super Integer, ? extends Unit> children = function2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(children, "children");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changedInstance(children) ? 4 : 2;
            }
            int i10 = iIntValue;
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1365430839, i10, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:352)");
                }
                SnackbarData snackbarData = this.f11498p0;
                boolean zAreEqual = Intrinsics.areEqual(snackbarData, this.f11499q0);
                int i11 = zAreEqual ? 150 : 75;
                int i12 = (!zAreEqual || CollectionsKt___CollectionsKt.filterNotNull(this.f11500r0).size() == 1) ? 0 : 75;
                State stateAccess$animatedOpacity = SnackbarHostKt.access$animatedOpacity(AnimationSpecKt.tween(i11, i12, EasingKt.getLinearEasing()), zAreEqual, new m3(snackbarData, this.f11501s0), composer2, 0, 0);
                State stateAccess$animatedScale = SnackbarHostKt.access$animatedScale(AnimationSpecKt.tween(i11, i12, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                Modifier modifierM2651graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2651graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, ((Number) stateAccess$animatedScale.getValue()).floatValue(), ((Number) stateAccess$animatedScale.getValue()).floatValue(), ((Number) stateAccess$animatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(snackbarData);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new k3(snackbarData);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM2651graphicsLayerAp8cVGQ$default, false, (Function1) objRememberedValue, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                children.invoke(composer2, Integer.valueOf(i10 & 14));
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

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<SnackbarData, Composer, Integer, Unit> f11502p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11503q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f11504r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, SnackbarData snackbarData, int i10) {
            super(2);
            this.f11502p0 = function3;
            this.f11503q0 = snackbarData;
            this.f11504r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1462081411, iIntValue, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:401)");
                }
                SnackbarData snackbarData = this.f11503q0;
                Intrinsics.checkNotNull(snackbarData);
                this.f11502p0.invoke(snackbarData, composer2, Integer.valueOf((this.f11504r0 >> 3) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11505p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11506q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<SnackbarData, Composer, Integer, Unit> f11507r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f11508s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11509t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(SnackbarData snackbarData, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f11505p0 = snackbarData;
            this.f11506q0 = modifier;
            this.f11507r0 = function3;
            this.f11508s0 = i10;
            this.f11509t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarHostKt.a(this.f11505p0, this.f11506q0, this.f11507r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11508s0 | 1), this.f11509t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", i = {}, l = {ImageAnalysisKt.OVER_EXPOSED_THRESHOLD}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11510p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11511q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f11512r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f11511q0 = snackbarData;
            this.f11512r0 = accessibilityManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.f11511q0, this.f11512r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11510p0;
            SnackbarData snackbarData = this.f11511q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (snackbarData != null) {
                    long millis = SnackbarHostKt.toMillis(snackbarData.getVisuals().getDuration(), snackbarData.getVisuals().getActionLabel() != null, this.f11512r0);
                    this.f11510p0 = 1;
                    if (DelayKt.delay(millis, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            snackbarData.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarHostState f11513p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11514q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<SnackbarData, Composer, Integer, Unit> f11515r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f11516s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11517t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(SnackbarHostState snackbarHostState, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f11513p0 = snackbarHostState;
            this.f11514q0 = modifier;
            this.f11515r0 = function3;
            this.f11516s0 = i10;
            this.f11517t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarHostKt.SnackbarHost(this.f11513p0, this.f11514q0, this.f11515r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11516s0 | 1), this.f11517t0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(@NotNull SnackbarHostState hostState, @Nullable Modifier modifier, @Nullable Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(hostState, "hostState");
        Composer composerStartRestartGroup = composer.startRestartGroup(464178177);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(hostState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.INSTANCE.m1045getLambda1$material3_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(464178177, i12, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:216)");
            }
            SnackbarData currentSnackbarData = hostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData, new d(currentSnackbarData, (AccessibilityManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), composerStartRestartGroup, 64);
            a(hostState.getCurrentSnackbarData(), modifier, function3, composerStartRestartGroup, (i12 & 112) | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function4 = function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(hostState, modifier2, function4, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be A[LOOP:0: B:52:0x00b8->B:54:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef A[LOOP:1: B:59:0x00e9->B:61:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a9 A[LOOP:2: B:70:0x01a3->B:72:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(SnackbarData snackbarData, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        Object objRememberedValue;
        l0.x1 x1Var;
        boolean zAreEqual;
        ArrayList<l0.w1> arrayList;
        Function0<ComposeUiNode> constructor;
        ArrayList arrayList2;
        Iterator it;
        List mutableList;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1316639904);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316639904, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:338)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l0.x1();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                x1Var = (l0.x1) objRememberedValue;
                zAreEqual = Intrinsics.areEqual(snackbarData, x1Var.f83032a);
                arrayList = x1Var.f83033b;
                if (!zAreEqual) {
                    x1Var.f83032a = snackbarData;
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((SnackbarData) ((l0.w1) it.next()).f83019a);
                    }
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                    if (!mutableList.contains(snackbarData)) {
                        mutableList.add(snackbarData);
                    }
                    arrayList.clear();
                    for (SnackbarData snackbarData2 : CollectionsKt___CollectionsKt.filterNotNull(mutableList)) {
                        arrayList.add(new l0.w1(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1365430839, true, new a(snackbarData2, snackbarData, mutableList, x1Var))));
                    }
                }
                int i15 = (i12 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i16 = i15 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j((i17 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                x1Var.f83034c = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-733277355);
                for (l0.w1 w1Var : arrayList) {
                    SnackbarData snackbarData3 = (SnackbarData) w1Var.f83019a;
                    composerStartRestartGroup.startMovableGroup(870027328, snackbarData3);
                    w1Var.f83020b.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1462081411, true, new b(function3, snackbarData3, i12)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endMovableGroup();
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(snackbarData, modifier3, function3, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316639904, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:338)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l0.x1();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            x1Var = (l0.x1) objRememberedValue;
            zAreEqual = Intrinsics.areEqual(snackbarData, x1Var.f83032a);
            arrayList = x1Var.f83033b;
            if (!zAreEqual) {
                x1Var.f83032a = snackbarData;
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((SnackbarData) ((l0.w1) it.next()).f83019a);
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                arrayList.clear();
                while (r10.hasNext()) {
                    arrayList.add(new l0.w1(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1365430839, true, new a(snackbarData2, snackbarData, mutableList, x1Var))));
                }
            }
            int i18 = (i12 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i19 = i18 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i19 & 112) | (i19 & 14));
            Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifier3);
            int i110 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl2, density2));
            ai.a.j((i110 >> 3) & 112, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            x1Var.f83034c = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-733277355);
            while (r0.hasNext()) {
                SnackbarData snackbarData4 = (SnackbarData) w1Var.f83019a;
                composerStartRestartGroup.startMovableGroup(870027328, snackbarData4);
                w1Var.f83020b.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1462081411, true, new b(function3, snackbarData4, i12)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endMovableGroup();
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316639904, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:338)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l0.x1();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            x1Var = (l0.x1) objRememberedValue;
            zAreEqual = Intrinsics.areEqual(snackbarData, x1Var.f83032a);
            arrayList = x1Var.f83033b;
            if (!zAreEqual) {
                x1Var.f83032a = snackbarData;
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((SnackbarData) ((l0.w1) it.next()).f83019a);
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                arrayList.clear();
                while (r10.hasNext()) {
                    arrayList.add(new l0.w1(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1365430839, true, new a(snackbarData2, snackbarData, mutableList, x1Var))));
                }
            }
            int i111 = (i12 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i112 = i111 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i112 & 112) | (i112 & 14));
            Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier3);
            int i113 = ((((i111 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl3, density3));
            ai.a.j((i113 >> 3) & 112, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            x1Var.f83034c = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-733277355);
            while (r0.hasNext()) {
                SnackbarData snackbarData5 = (SnackbarData) w1Var.f83019a;
                composerStartRestartGroup.startMovableGroup(870027328, snackbarData5);
                w1Var.f83020b.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1462081411, true, new b(function3, snackbarData5, i12)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endMovableGroup();
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(snackbarData, modifier3, function3, i10, i11));
    }

    public static final State access$animatedOpacity(AnimationSpec animationSpec, boolean z10, Function0 function0, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1431889134);
        if ((i11 & 4) != 0) {
            function0 = l0.w3.f83026p0;
        }
        Function0 function1 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1431889134, i10, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:424)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new l0.x3(animatable, z10, animationSpec, function1, null), composer, ((i10 >> 3) & 14) | 64);
        State stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public static final State access$animatedScale(AnimationSpec animationSpec, boolean z10, Composer composer, int i10) {
        composer.startReplaceableGroup(1966809761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1966809761, i10, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:441)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new l0.y3(animatable, z10, animationSpec, null), composer, ((i10 >> 3) & 14) | 64);
        State stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public static final long toMillis(@NotNull SnackbarDuration snackbarDuration, boolean z10, @Nullable AccessibilityManager accessibilityManager) {
        long j10;
        Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j10 = TextSwitchHandler.DEFAULT_INTERVAL;
        }
        long j11 = j10;
        return accessibilityManager == null ? j11 : accessibilityManager.calculateRecommendedTimeoutMillis(j11, true, true, z10);
    }
}
