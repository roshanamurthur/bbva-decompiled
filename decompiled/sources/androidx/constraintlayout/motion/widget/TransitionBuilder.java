package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintSet;

/* JADX INFO: loaded from: classes.dex */
public class TransitionBuilder {
    public static MotionScene.Transition buildTransition(MotionScene motionScene, int i10, int i11, ConstraintSet constraintSet, int i12, ConstraintSet constraintSet2) {
        MotionScene.Transition transition = new MotionScene.Transition(i10, motionScene, i11, i12);
        int startConstraintSetId = transition.getStartConstraintSetId();
        int endConstraintSetId = transition.getEndConstraintSetId();
        motionScene.setConstraintSet(startConstraintSetId, constraintSet);
        motionScene.setConstraintSet(endConstraintSetId, constraintSet2);
        return transition;
    }

    public static void validate(MotionLayout motionLayout) {
        MotionScene motionScene = motionLayout.f19431p0;
        if (motionScene == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!motionScene.validateLayout(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (motionScene.f19487c == null || motionScene.getDefinedTransitions().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
