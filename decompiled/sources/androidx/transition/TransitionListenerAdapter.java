package androidx.transition;

import androidx.annotation.NonNull;
import h3.n;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionListenerAdapter implements Transition.TransitionListener {
    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
        n.a(this, transition, z10);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
        n.b(this, transition, z10);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(@NonNull Transition transition) {
    }
}
