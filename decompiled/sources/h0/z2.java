package h0;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1190:1\n486#2,4:1191\n490#2,2:1199\n494#2:1205\n25#3:1195\n1097#4,3:1196\n1100#4,3:1202\n486#5:1201\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n*L\n908#1:1191,4\n908#1:1199,2\n908#1:1205\n908#1:1195\n908#1:1196,3\n908#1:1202,3\n908#1:1201\n*E\n"})
public final class z2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f69246p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DraggableState f69247q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f69248r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f69249s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f69250t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f69251u0;
    public final /* synthetic */ State<Float> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f69252w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f6, boolean z10, State state, State state2, MutableState mutableState, boolean z11) {
        super(3);
        this.f69246p0 = z10;
        this.f69247q0 = draggableState;
        this.f69248r0 = mutableInteractionSource;
        this.f69249s0 = f6;
        this.f69250t0 = z11;
        this.f69251u0 = mutableState;
        this.v0 = state;
        this.f69252w0 = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier modifierPointerInput = modifier;
        Composer composer2 = composer;
        int iA = ci.a.a(num, modifierPointerInput, "$this$composed", composer2, 1945228890);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1945228890, iA, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:905)");
        }
        if (this.f69246p0) {
            Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
            if (objB == Composer.INSTANCE.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composer2.endReplaceableGroup();
            modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput, new Object[]{this.f69247q0, this.f69248r0, Float.valueOf(this.f69249s0), Boolean.valueOf(this.f69250t0)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new x2(this.f69250t0, this.f69249s0, this.f69251u0, this.v0, coroutineScope, this.f69247q0, this.f69252w0, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierPointerInput;
    }
}
