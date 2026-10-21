package l0;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1508:1\n474#2,4:1509\n478#2,2:1517\n482#2:1523\n25#3:1513\n1114#4,3:1514\n1117#4,3:1520\n474#5:1519\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$sliderTapModifier$2\n*L\n1174#1:1509,4\n1174#1:1517,2\n1174#1:1523\n1174#1:1513\n1174#1:1514,3\n1174#1:1520,3\n1174#1:1519\n*E\n"})
public final class v3 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f82994p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DraggableState f82995q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f82996r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82997s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f82998t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f82999u0;
    public final /* synthetic */ State<Float> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ State<Function0<Unit>> f83000w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(o3 o3Var, MutableInteractionSource mutableInteractionSource, int i10, boolean z10, MutableState mutableState, State state, MutableState mutableState2, boolean z11) {
        super(3);
        this.f82994p0 = z10;
        this.f82995q0 = o3Var;
        this.f82996r0 = mutableInteractionSource;
        this.f82997s0 = i10;
        this.f82998t0 = z11;
        this.f82999u0 = mutableState2;
        this.v0 = mutableState;
        this.f83000w0 = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier modifierPointerInput = modifier;
        Composer composer2 = composer;
        int iA = ci.a.a(num, modifierPointerInput, "$this$composed", composer2, 2040469710);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2040469710, iA, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1171)");
        }
        if (this.f82994p0) {
            Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
            if (objB == Composer.INSTANCE.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composer2.endReplaceableGroup();
            modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput, new Object[]{this.f82995q0, this.f82996r0, Integer.valueOf(this.f82997s0), Boolean.valueOf(this.f82998t0)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new t3(this.f82998t0, this.f82997s0, this.f82999u0, this.v0, coroutineScope, this.f82995q0, this.f83000w0, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierPointerInput;
    }
}
