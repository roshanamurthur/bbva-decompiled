package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;

/* JADX INFO: compiled from: ViewTransitionController.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements SharedValues.SharedValuesListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ViewTransition f19628p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f19629q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f19630r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f19631s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ ViewTransitionController f19632t0;

    public i(ViewTransitionController viewTransitionController, ViewTransition viewTransition, int i10, boolean z10, int i11) {
        this.f19632t0 = viewTransitionController;
        this.f19628p0 = viewTransition;
        this.f19629q0 = i10;
        this.f19630r0 = z10;
        this.f19631s0 = i11;
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public final void onNewValue(int i10, int i11, int i12) {
        ViewTransition viewTransition = this.f19628p0;
        int sharedValueCurrent = viewTransition.getSharedValueCurrent();
        viewTransition.setSharedValueCurrent(i11);
        if (this.f19629q0 != i10 || sharedValueCurrent == i11) {
            return;
        }
        boolean z10 = this.f19630r0;
        int i13 = this.f19631s0;
        ViewTransitionController viewTransitionController = this.f19632t0;
        if (z10) {
            if (i13 == i11) {
                int childCount = viewTransitionController.f19576a.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = viewTransitionController.f19576a.getChildAt(i14);
                    if (viewTransition.c(childAt)) {
                        int currentState = viewTransitionController.f19576a.getCurrentState();
                        ConstraintSet constraintSet = viewTransitionController.f19576a.getConstraintSet(currentState);
                        ViewTransition viewTransition2 = this.f19628p0;
                        ViewTransitionController viewTransitionController2 = this.f19632t0;
                        viewTransition2.a(viewTransitionController2, viewTransitionController2.f19576a, currentState, constraintSet, childAt);
                    }
                }
                return;
            }
            return;
        }
        if (i13 != i11) {
            int childCount2 = viewTransitionController.f19576a.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = viewTransitionController.f19576a.getChildAt(i15);
                if (viewTransition.c(childAt2)) {
                    int currentState2 = viewTransitionController.f19576a.getCurrentState();
                    ConstraintSet constraintSet2 = viewTransitionController.f19576a.getConstraintSet(currentState2);
                    ViewTransition viewTransition3 = this.f19628p0;
                    ViewTransitionController viewTransitionController3 = this.f19632t0;
                    viewTransition3.a(viewTransitionController3, viewTransitionController3.f19576a, currentState2, constraintSet2, childAt2);
                }
            }
        }
    }
}
