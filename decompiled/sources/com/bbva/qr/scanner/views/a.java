package com.bbva.qr.scanner.views;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import ee.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36337b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f36336a = i10;
        this.f36337b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f36336a;
        Object obj = this.f36337b;
        switch (i10) {
            case 0:
                GraphicOverlay graphicOverlay = (GraphicOverlay) obj;
                int i11 = GraphicOverlay.f36331s0;
                graphicOverlay.getClass();
                graphicOverlay.f36334r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                graphicOverlay.invalidate();
                break;
            case 1:
                b bVar = (b) obj;
                ColorDrawable colorDrawable = b.A;
                bVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bVar.f68319j.setAlpha((int) (255.0f * fFloatValue));
                bVar.f68333y = fFloatValue;
                break;
            default:
                ((DrawerArrowDrawable) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
