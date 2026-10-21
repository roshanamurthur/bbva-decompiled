package qe;

import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f92848a;

    public k(Window window) {
        this.f92848a = window;
    }

    @Override // qe.r, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        WeakReference<View> weakReference = MaterialContainerTransformSharedElementCallback.f45965f;
        Drawable background = this.f92848a.getDecorView().getBackground();
        if (background == null) {
            return;
        }
        background.mutate().clearColorFilter();
    }

    @Override // qe.r, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        WeakReference<View> weakReference = MaterialContainerTransformSharedElementCallback.f45965f;
        Drawable background = this.f92848a.getDecorView().getBackground();
        if (background == null) {
            return;
        }
        background.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
    }
}
