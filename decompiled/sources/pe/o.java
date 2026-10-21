package pe;

import androidx.transition.Transition;

/* JADX INFO: compiled from: TransitionListenerAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class o implements Transition.TransitionListener {
    @Override // androidx.transition.Transition.TransitionListener
    public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
        h3.n.a(this, transition, z10);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
        h3.n.b(this, transition, z10);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
