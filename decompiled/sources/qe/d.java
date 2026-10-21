package qe;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: FadeProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f92828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f92829d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f92830e;

    public d(View view, float f6, float f10, float f11) {
        this.f92826a = view;
        this.f92827b = f6;
        this.f92828c = f10;
        this.f92830e = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f92826a.setAlpha(s.d(this.f92827b, this.f92828c, this.f92829d, this.f92830e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
