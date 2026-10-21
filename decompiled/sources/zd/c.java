package zd;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: compiled from: CollapsingToolbarLayout.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f95036a;

    public c(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f95036a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f95036a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
