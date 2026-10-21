package com.facetec.sdk;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41965b;

    public /* synthetic */ k0(Object obj, int i10) {
        this.f41964a = i10;
        this.f41965b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f41964a;
        Object obj = this.f41965b;
        switch (i10) {
            case 0:
                ((a) obj).h_(valueAnimator);
                break;
            case 1:
                ((be) obj).aq_(valueAnimator);
                break;
            default:
                ((ct) obj).bm_(valueAnimator);
                break;
        }
    }
}
