package r;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.Slide;
import androidx.compose.animation.SlideModifier;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1177:1\n36#2:1178\n25#2:1185\n36#2:1192\n1097#3,6:1179\n1097#3,6:1186\n1097#3,6:1193\n81#4:1199\n107#4,2:1200\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n*L\n953#1:1178\n965#1:1185\n967#1:1192\n953#1:1179,6\n965#1:1186,6\n967#1:1193,6\n953#1:1199\n953#1:1200,2\n*E\n"})
public final class d extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Transition<EnterExitState> f92893p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ State<Slide> f92894q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ State<Slide> f92895r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f92896s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        super(3);
        this.f92893p0 = transition;
        this.f92894q0 = state;
        this.f92895r0 = state2;
        this.f92896s0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier modifierThen = modifier;
        Composer composer2 = composer;
        int iA = ci.a.a(num, modifierThen, "$this$composed", composer2, 158379472);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(158379472, iA, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:949)");
        }
        composer2.startReplaceableGroup(1157296644);
        Transition<EnterExitState> transition = this.f92893p0;
        boolean zChanged = composer2.changed(transition);
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState targetState = transition.getTargetState();
        State<Slide> state = this.f92895r0;
        State<Slide> state2 = this.f92894q0;
        if (currentState == targetState && !transition.isSeeking()) {
            mutableState.setValue(Boolean.FALSE);
        } else if (state2.getValue() != null || state.getValue() != null) {
            mutableState.setValue(Boolean.TRUE);
        }
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            Transition<EnterExitState> transition2 = this.f92893p0;
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = this.f92896s0 + " slide";
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = TransitionKt.createDeferredAnimation(transition2, vectorConverter, (String) objRememberedValue2, composer2, 448, 0);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer2.changed(transition);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new SlideModifier(deferredAnimationCreateDeferredAnimation, state2, state);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            modifierThen = modifierThen.then((SlideModifier) objRememberedValue3);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierThen;
    }
}
