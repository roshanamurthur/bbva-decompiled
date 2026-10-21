package com.google.android.material.floatingactionbutton;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f44749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f44750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f44751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f44752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f44753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f44754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f44755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Matrix f44756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f44757i;

    public k(j jVar, float f6, float f10, float f11, float f12, float f13, float f14, float f15, Matrix matrix) {
        this.f44757i = jVar;
        this.f44749a = f6;
        this.f44750b = f10;
        this.f44751c = f11;
        this.f44752d = f12;
        this.f44753e = f13;
        this.f44754f = f14;
        this.f44755g = f15;
        this.f44756h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j jVar = this.f44757i;
        jVar.f44736v.setAlpha(AnimationUtils.lerp(this.f44749a, this.f44750b, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = jVar.f44736v;
        float f6 = this.f44751c;
        float f10 = this.f44752d;
        floatingActionButton.setScaleX(AnimationUtils.lerp(f6, f10, fFloatValue));
        jVar.f44736v.setScaleY(AnimationUtils.lerp(this.f44753e, f10, fFloatValue));
        float f11 = this.f44754f;
        float f12 = this.f44755g;
        jVar.f44730p = AnimationUtils.lerp(f11, f12, fFloatValue);
        float fLerp = AnimationUtils.lerp(f11, f12, fFloatValue);
        Matrix matrix = this.f44756h;
        jVar.a(fLerp, matrix);
        jVar.f44736v.setImageMatrix(matrix);
    }
}
