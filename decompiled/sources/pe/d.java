package pe;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: FadeProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f92647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f92648d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f92649e;

    public d(View view, float f6, float f10, float f11) {
        this.f92645a = view;
        this.f92646b = f6;
        this.f92647c = f10;
        this.f92649e = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f92645a.setAlpha(p.d(this.f92646b, this.f92647c, this.f92648d, this.f92649e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
