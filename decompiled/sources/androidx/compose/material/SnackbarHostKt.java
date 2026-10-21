package androidx.compose.material;

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
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.bbva.glomohybrid.welcome.presentation.util.TextSwitchHandler;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000*b\b\u0002\u0010\u0016\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "content", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n76#2:374\n25#3:375\n456#3,8:406\n464#3,3:420\n467#3,3:430\n25#3:435\n25#3:442\n1097#4,6:376\n1097#4,6:436\n1097#4,6:443\n1549#5:382\n1620#5,3:383\n1620#5,3:386\n66#6,6:389\n72#6:423\n76#6:434\n78#7,11:395\n91#7:433\n4144#8,6:414\n33#9,6:424\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n157#1:374\n262#1:375\n316#1:406,8\n316#1:420,3\n316#1:430,3\n348#1:435\n361#1:442\n262#1:376,6\n348#1:436,6\n361#1:443,6\n265#1:382\n265#1:383,3\n270#1:386,3\n316#1:389,6\n316#1:423\n316#1:434\n316#1:395,11\n316#1:433\n316#1:414,6\n318#1:424,6\n*E\n"})
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
    @SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,373:1\n66#2,6:374\n72#2:408\n76#2:413\n78#3,11:380\n91#3:412\n456#4,8:391\n464#4,3:405\n467#4,3:409\n4144#5,6:399\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n299#1:374,6\n299#1:408\n299#1:413\n299#1:380,11\n299#1:412\n299#1:391,8\n299#1:405,3\n299#1:409,3\n299#1:399,6\n*E\n"})
    public static final class a extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f7694p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f7695q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ List<SnackbarData> f7696r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ h0.f1<SnackbarData> f7697s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SnackbarData snackbarData, SnackbarData snackbarData2, List<SnackbarData> list, h0.f1<SnackbarData> f1Var) {
            super(3);
            this.f7694p0 = snackbarData;
            this.f7695q0 = snackbarData2;
            this.f7696r0 = list;
            this.f7697s0 = f1Var;
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
                    ComposerKt.traceEventStart(-94104314, i10, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
                }
                SnackbarData snackbarData = this.f7694p0;
                boolean zAreEqual = Intrinsics.areEqual(snackbarData, this.f7695q0);
                int i11 = zAreEqual ? 150 : 75;
                int i12 = (!zAreEqual || CollectionsKt___CollectionsKt.filterNotNull(this.f7696r0).size() == 1) ? 0 : 75;
                State stateAccess$animatedOpacity = SnackbarHostKt.access$animatedOpacity(AnimationSpecKt.tween(i11, i12, EasingKt.getLinearEasing()), zAreEqual, new l2(snackbarData, this.f7697s0), composer2, 0, 0);
                State stateAccess$animatedScale = SnackbarHostKt.access$animatedScale(AnimationSpecKt.tween(i11, i12, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(GraphicsLayerModifierKt.m2651graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, ((Number) stateAccess$animatedScale.getValue()).floatValue(), ((Number) stateAccess$animatedScale.getValue()).floatValue(), ((Number) stateAccess$animatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null), false, new j2(snackbarData), 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSemantics$default);
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
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
        public final /* synthetic */ Function3<SnackbarData, Composer, Integer, Unit> f7698p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f7699q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7700r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, SnackbarData snackbarData, int i10) {
            super(2);
            this.f7698p0 = function3;
            this.f7699q0 = snackbarData;
            this.f7700r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2041982076, iIntValue, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:319)");
                }
                SnackbarData snackbarData = this.f7699q0;
                Intrinsics.checkNotNull(snackbarData);
                this.f7698p0.invoke(snackbarData, composer2, Integer.valueOf((this.f7700r0 >> 3) & 112));
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
        public final /* synthetic */ SnackbarData f7701p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7702q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<SnackbarData, Composer, Integer, Unit> f7703r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7704s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7705t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(SnackbarData snackbarData, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f7701p0 = snackbarData;
            this.f7702q0 = modifier;
            this.f7703r0 = function3;
            this.f7704s0 = i10;
            this.f7705t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarHostKt.a(this.f7701p0, this.f7702q0, this.f7703r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7704s0 | 1), this.f7705t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f7706p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f7707q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f7708r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f7707q0 = snackbarData;
            this.f7708r0 = accessibilityManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.f7707q0, this.f7708r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f7706p0;
            SnackbarData snackbarData = this.f7707q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (snackbarData != null) {
                    long millis = SnackbarHostKt.toMillis(snackbarData.getDuration(), snackbarData.getActionLabel() != null, this.f7708r0);
                    this.f7706p0 = 1;
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
        public final /* synthetic */ SnackbarHostState f7709p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7710q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<SnackbarData, Composer, Integer, Unit> f7711r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7712s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7713t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(SnackbarHostState snackbarHostState, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f7709p0 = snackbarHostState;
            this.f7710q0 = modifier;
            this.f7711r0 = function3;
            this.f7712s0 = i10;
            this.f7713t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SnackbarHostKt.SnackbarHost(this.f7709p0, this.f7710q0, this.f7711r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7712s0 | 1), this.f7713t0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(@NotNull SnackbarHostState hostState, @Nullable Modifier modifier, @Nullable Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(hostState, "hostState");
        Composer composerStartRestartGroup = composer.startRestartGroup(431012348);
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
                function3 = ComposableSingletons$SnackbarHostKt.INSTANCE.m743getLambda1$material_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431012348, i12, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)");
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
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac A[LOOP:2: B:75:0x01aa->B:76:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01de  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(SnackbarData snackbarData, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        Object objRememberedValue;
        h0.f1 f1Var;
        boolean zAreEqual;
        ArrayList arrayList;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        int size;
        int i14;
        ArrayList arrayList2;
        Iterator it;
        List mutableList;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2036134589);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
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
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2036134589, i12, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new h0.f1();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                f1Var = (h0.f1) objRememberedValue;
                zAreEqual = Intrinsics.areEqual(snackbarData, f1Var.f68762a);
                arrayList = f1Var.f68763b;
                if (!zAreEqual) {
                    f1Var.f68762a = snackbarData;
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((SnackbarData) ((h0.e1) it.next()).f68729a);
                    }
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                    if (!mutableList.contains(snackbarData)) {
                        mutableList.add(snackbarData);
                    }
                    arrayList.clear();
                    for (SnackbarData snackbarData2 : CollectionsKt___CollectionsKt.filterNotNull(mutableList)) {
                        arrayList.add(new h0.e1(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -94104314, true, new a(snackbarData2, snackbarData, mutableList, f1Var))));
                    }
                }
                int i16 = (i12 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i17 = i16 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i17 & 112) | (i17 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j((i18 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                f1Var.f68764c = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1656513320);
                size = arrayList.size();
                for (i14 = 0; i14 < size; i14++) {
                    h0.e1 e1Var = (h0.e1) arrayList.get(i14);
                    SnackbarData snackbarData3 = (SnackbarData) e1Var.f68729a;
                    composerStartRestartGroup.startMovableGroup(-208579897, snackbarData3);
                    e1Var.f68730b.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2041982076, true, new b(function3, snackbarData3, i12)), composerStartRestartGroup, 6);
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
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036134589, i12, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new h0.f1();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            f1Var = (h0.f1) objRememberedValue;
            zAreEqual = Intrinsics.areEqual(snackbarData, f1Var.f68762a);
            arrayList = f1Var.f68763b;
            if (!zAreEqual) {
                f1Var.f68762a = snackbarData;
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((SnackbarData) ((h0.e1) it.next()).f68729a);
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                arrayList.clear();
                while (r10.hasNext()) {
                    arrayList.add(new h0.e1(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -94104314, true, new a(snackbarData2, snackbarData, mutableList, f1Var))));
                }
            }
            int i19 = (i12 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i110 = i19 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i110 & 112) | (i110 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
            int i111 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j((i111 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            f1Var.f68764c = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1656513320);
            size = arrayList.size();
            while (i14 < size) {
                h0.e1 e1Var2 = (h0.e1) arrayList.get(i14);
                SnackbarData snackbarData4 = (SnackbarData) e1Var2.f68729a;
                composerStartRestartGroup.startMovableGroup(-208579897, snackbarData4);
                e1Var2.f68730b.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2041982076, true, new b(function3, snackbarData4, i12)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endMovableGroup();
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036134589, i12, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new h0.f1();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            f1Var = (h0.f1) objRememberedValue;
            zAreEqual = Intrinsics.areEqual(snackbarData, f1Var.f68762a);
            arrayList = f1Var.f68763b;
            if (!zAreEqual) {
                f1Var.f68762a = snackbarData;
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((SnackbarData) ((h0.e1) it.next()).f68729a);
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                arrayList.clear();
                while (r10.hasNext()) {
                    arrayList.add(new h0.e1(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -94104314, true, new a(snackbarData2, snackbarData, mutableList, f1Var))));
                }
            }
            int i112 = (i12 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i113 = i112 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i113 & 112) | (i113 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
            int i114 = ((((i112 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j((i114 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            f1Var.f68764c = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1656513320);
            size = arrayList.size();
            while (i14 < size) {
                h0.e1 e1Var3 = (h0.e1) arrayList.get(i14);
                SnackbarData snackbarData5 = (SnackbarData) e1Var3.f68729a;
                composerStartRestartGroup.startMovableGroup(-208579897, snackbarData5);
                e1Var3.f68730b.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2041982076, true, new b(function3, snackbarData5, i12)), composerStartRestartGroup, 6);
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
        composer.startReplaceableGroup(1016418159);
        if ((i11 & 4) != 0) {
            function0 = h0.a3.f68645p0;
        }
        Function0 function1 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i10, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new h0.b3(animatable, z10, animationSpec, function1, null), composer, ((i10 >> 3) & 14) | 64);
        State stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public static final State access$animatedScale(AnimationSpec animationSpec, boolean z10, Composer composer, int i10) {
        composer.startReplaceableGroup(2003504988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i10, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new h0.c3(animatable, z10, animationSpec, null), composer, ((i10 >> 3) & 14) | 64);
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
