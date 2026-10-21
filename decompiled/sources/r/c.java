package r;

import androidx.compose.animation.ChangeSize;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.ExpandShrinkModifier;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1177:1\n36#2:1178\n25#2:1185\n25#2:1192\n36#2:1199\n1097#3,6:1179\n1097#3,6:1186\n1097#3,6:1193\n1097#3,6:1200\n81#4:1206\n107#4,2:1207\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n*L\n1035#1:1178\n1058#1:1185\n1063#1:1192\n1067#1:1199\n1035#1:1179,6\n1058#1:1186,6\n1063#1:1193,6\n1067#1:1200,6\n1035#1:1206\n1035#1:1207,2\n*E\n"})
public final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Transition<EnterExitState> f92889p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ State<ChangeSize> f92890q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ State<ChangeSize> f92891r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f92892s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        super(3);
        this.f92889p0 = transition;
        this.f92890q0 = state;
        this.f92891r0 = state2;
        this.f92892s0 = str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Alignment alignment;
        ChangeSize value;
        Modifier modifierThen = modifier;
        Composer composer2 = composer;
        int iA = ci.a.a(num, modifierThen, "$this$composed", composer2, -140634085);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-140634085, iA, -1, "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1030)");
        }
        composer2.startReplaceableGroup(1157296644);
        Transition<EnterExitState> transition = this.f92889p0;
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
        State<ChangeSize> state = this.f92891r0;
        State<ChangeSize> state2 = this.f92890q0;
        if (currentState == targetState && !transition.isSeeking()) {
            mutableState.setValue(Boolean.FALSE);
        } else if (state2.getValue() != null || state.getValue() != null) {
            mutableState.setValue(Boolean.TRUE);
        }
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            if (transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
                ChangeSize value2 = state2.getValue();
                if (value2 == null || (alignment = value2.getAlignment()) == null) {
                    ChangeSize value3 = state.getValue();
                    if (value3 != null) {
                        alignment = value3.getAlignment();
                    } else {
                        alignment = null;
                    }
                }
            } else {
                ChangeSize value4 = state.getValue();
                if (value4 == null || (alignment = value4.getAlignment()) == null) {
                    ChangeSize value5 = state2.getValue();
                    if (value5 != null) {
                        alignment = value5.getAlignment();
                    } else {
                        alignment = null;
                    }
                }
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(alignment, composer2, 0);
            Transition<EnterExitState> transition2 = this.f92889p0;
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object empty = companion.getEmpty();
            String str = this.f92892s0;
            if (objRememberedValue2 == empty) {
                objRememberedValue2 = str + " shrink/expand";
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = TransitionKt.createDeferredAnimation(transition2, vectorConverter, (String) objRememberedValue2, composer2, 448, 0);
            composer2.startMovableGroup(-1553213689, Boolean.valueOf(transition.getCurrentState() == transition.getTargetState()));
            Transition<EnterExitState> transition3 = this.f92889p0;
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = str + " InterruptionHandlingOffset";
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2 = TransitionKt.createDeferredAnimation(transition3, vectorConverter2, (String) objRememberedValue3, composer2, 448, 0);
            composer2.endMovableGroup();
            State<ChangeSize> state3 = this.f92890q0;
            State<ChangeSize> state4 = this.f92891r0;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer2.changed(transition);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ExpandShrinkModifier(deferredAnimationCreateDeferredAnimation, deferredAnimationCreateDeferredAnimation2, state3, state4, stateRememberUpdatedState);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            ExpandShrinkModifier expandShrinkModifier = (ExpandShrinkModifier) objRememberedValue4;
            if (transition.getCurrentState() == transition.getTargetState()) {
                expandShrinkModifier.f2777f = null;
            } else if (expandShrinkModifier.f2777f == null) {
                Alignment topStart = (Alignment) stateRememberUpdatedState.getValue();
                if (topStart == null) {
                    topStart = Alignment.INSTANCE.getTopStart();
                }
                expandShrinkModifier.f2777f = topStart;
            }
            ChangeSize value6 = state2.getValue();
            modifierThen = modifierThen.then(((value6 == null || value6.getClip()) && ((value = state.getValue()) == null || value.getClip())) ? ClipKt.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE).then(expandShrinkModifier);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierThen;
    }
}
