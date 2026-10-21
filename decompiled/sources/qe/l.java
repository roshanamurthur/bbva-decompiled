package qe;

import android.app.Activity;
import android.transition.Transition;
import android.view.View;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f92849a;

    public l(Activity activity) {
        this.f92849a = activity;
    }

    @Override // qe.r, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        View view;
        WeakReference<View> weakReference = MaterialContainerTransformSharedElementCallback.f45965f;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.setAlpha(1.0f);
            MaterialContainerTransformSharedElementCallback.f45965f = null;
        }
        Activity activity = this.f92849a;
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
