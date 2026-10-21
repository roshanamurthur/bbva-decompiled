package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: ItemTouchHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ItemTouchHelper.e f23044a;

    public l(ItemTouchHelper.e eVar) {
        this.f23044a = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f23044a.m = valueAnimator.getAnimatedFraction();
    }
}
