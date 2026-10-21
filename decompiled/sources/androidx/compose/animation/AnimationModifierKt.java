package androidx.compose.animation;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001aY\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032:\b\u0002\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"animateContentSize", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "finishedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,162:1\n135#2:163\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n72#1:163\n*E\n"})
public final class AnimationModifierKt {

    /* JADX INFO: compiled from: AnimationModifier.kt */
    @SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,162:1\n486#2,4:163\n490#2,2:171\n494#2:177\n25#3:167\n36#3:178\n1097#4,3:168\n1100#4,3:174\n1097#4,6:179\n486#5:173\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n*L\n79#1:163,4\n79#1:171,2\n79#1:177\n79#1:167\n80#1:178\n79#1:168,3\n79#1:174,3\n80#1:179,6\n79#1:173\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<IntSize, IntSize, Unit> f2697p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FiniteAnimationSpec<IntSize> f2698q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FiniteAnimationSpec finiteAnimationSpec, Function2 function2) {
            super(3);
            this.f2697p0 = function2;
            this.f2698q0 = finiteAnimationSpec;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -843180607);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-843180607, iA, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
            }
            Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(coroutineScope);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SizeAnimationModifier(this.f2698q0, coroutineScope);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) objRememberedValue;
            sizeAnimationModifier.f2803c = this.f2697p0;
            Modifier modifierThen = ClipKt.clipToBounds(modifier2).then(sizeAnimationModifier);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierThen;
        }
    }

    @NotNull
    public static final Modifier animateContentSize(@NotNull Modifier modifier, @NotNull final FiniteAnimationSpec<IntSize> animationSpec, @Nullable final Function2<? super IntSize, ? super IntSize, Unit> function2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "animateContentSize").set("animationSpec", animationSpec);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("finishedListener", function2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new a(animationSpec, function2));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, function2);
    }
}
