package qe;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: FadeThroughProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f92835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f92836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f92837e;

    public f(View view, float f6, float f10, float f11, float f12) {
        this.f92833a = view;
        this.f92834b = f6;
        this.f92835c = f10;
        this.f92836d = f11;
        this.f92837e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f92833a.setAlpha(s.d(this.f92834b, this.f92835c, this.f92836d, this.f92837e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
