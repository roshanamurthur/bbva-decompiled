package pe;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: FadeThroughProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f92654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f92655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f92656e;

    public f(View view, float f6, float f10, float f11, float f12) {
        this.f92652a = view;
        this.f92653b = f6;
        this.f92654c = f10;
        this.f92655d = f11;
        this.f92656e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f92652a.setAlpha(p.d(this.f92653b, this.f92654c, this.f92655d, this.f92656e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
