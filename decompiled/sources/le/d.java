package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.progressindicator.c f83189a;

    public d(com.google.android.material.progressindicator.c cVar) {
        this.f83189a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        com.google.android.material.progressindicator.c cVar = this.f83189a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = cVar.f45062u0;
        if (arrayList == null || cVar.v0) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Animatable2Compat.AnimationCallback) it.next()).onAnimationEnd(cVar);
        }
    }
}
