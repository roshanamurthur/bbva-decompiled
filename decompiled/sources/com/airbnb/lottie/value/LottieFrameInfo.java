package com.airbnb.lottie.value;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public class LottieFrameInfo<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f26231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f26232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f26233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26235g;

    public float getEndFrame() {
        return this.f26230b;
    }

    public T getEndValue() {
        return this.f26232d;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.f26234f;
    }

    public float getLinearKeyframeProgress() {
        return this.f26233e;
    }

    public float getOverallProgress() {
        return this.f26235g;
    }

    public float getStartFrame() {
        return this.f26229a;
    }

    public T getStartValue() {
        return this.f26231c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieFrameInfo<T> set(float f6, float f10, T t10, T t11, float f11, float f12, float f13) {
        this.f26229a = f6;
        this.f26230b = f10;
        this.f26231c = t10;
        this.f26232d = t11;
        this.f26233e = f11;
        this.f26234f = f12;
        this.f26235g = f13;
        return this;
    }
}
