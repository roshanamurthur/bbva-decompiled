package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ViewTransitionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f19576a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<View> f19578c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<ViewTransition.a> f19580e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<ViewTransition> f19577b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19579d = "ViewTransitionController";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<ViewTransition.a> f19581f = new ArrayList<>();

    public ViewTransitionController(MotionLayout motionLayout) {
        this.f19576a = motionLayout;
    }

    public void add(ViewTransition viewTransition) {
        this.f19577b.add(viewTransition);
        this.f19578c = null;
        if (viewTransition.getStateTransition() == 4) {
            ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new i(this, viewTransition, viewTransition.getSharedValueID(), true, viewTransition.getSharedValue()));
        } else if (viewTransition.getStateTransition() == 5) {
            ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new i(this, viewTransition, viewTransition.getSharedValueID(), false, viewTransition.getSharedValue()));
        }
    }
}
