package com.facetec.sdk;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42829b;

    public /* synthetic */ s5(Object obj, int i10) {
        this.f42828a = i10;
        this.f42829b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f42828a;
        Object obj = this.f42829b;
        switch (i10) {
            case 0:
                ((bk) obj).aE_(valueAnimator);
                break;
            default:
                ((bz) obj).aU_(valueAnimator);
                break;
        }
    }
}
