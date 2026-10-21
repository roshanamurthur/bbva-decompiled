package mc;

import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.bbva.ui.widget.topsnackbar.TSnackbar;
import com.bbva.ui.widget.topsnackbar.TSnackbar.c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import z0.d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Handler.Callback {
    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = TSnackbar.LENGTH_INDEFINITE;
        int i11 = message.what;
        if (i11 == 0) {
            TSnackbar tSnackbar = (TSnackbar) message.obj;
            TSnackbar.SnackbarLayout snackbarLayout = tSnackbar.f37752c;
            if (snackbarLayout.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                    TSnackbar.c cVar = tSnackbar.new c();
                    cVar.setStartAlphaSwipeDistance(0.1f);
                    cVar.setEndAlphaSwipeDistance(0.6f);
                    cVar.setSwipeDirection(0);
                    cVar.setListener(new com.bbva.ui.widget.topsnackbar.b(tSnackbar));
                    ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(cVar);
                }
                tSnackbar.f37750a.addView(snackbarLayout);
            }
            snackbarLayout.setOnAttachStateChangeListener(new com.bbva.ui.widget.topsnackbar.c(tSnackbar));
            if (ViewCompat.isLaidOut(snackbarLayout)) {
                tSnackbar.a();
            } else {
                snackbarLayout.setOnLayoutChangeListener(new d(tSnackbar));
            }
        } else {
            if (i11 != 1) {
                return false;
            }
            TSnackbar tSnackbar2 = (TSnackbar) message.obj;
            int i12 = message.arg1;
            TSnackbar.SnackbarLayout snackbarLayout2 = tSnackbar2.f37752c;
            if (snackbarLayout2.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = snackbarLayout2.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.LayoutParams) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams2).getBehavior();
                    if ((behavior instanceof SwipeDismissBehavior) && ((SwipeDismissBehavior) behavior).getDragState() != 0) {
                        tSnackbar2.d(i12);
                    }
                }
                ViewCompat.animate(snackbarLayout2).translationY(-snackbarLayout2.getHeight()).setInterpolator(new FastOutSlowInInterpolator()).setDuration(250L).setListener(new com.bbva.ui.widget.topsnackbar.d(tSnackbar2, i12)).start();
            } else {
                tSnackbar2.d(i12);
            }
        }
        return true;
    }
}
