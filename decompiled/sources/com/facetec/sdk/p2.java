package com.facetec.sdk;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f42766b;

    public /* synthetic */ p2(int i10, View view) {
        this.f42765a = i10;
        this.f42766b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f42765a;
        View view = this.f42766b;
        switch (i10) {
            case 0:
                ((bb) view).af_(valueAnimator);
                break;
            default:
                ((bk) view).aF_(valueAnimator);
                break;
        }
    }
}
