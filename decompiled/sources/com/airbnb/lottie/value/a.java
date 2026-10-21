package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: LottieInterpolatedValue.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> extends LottieValueCallback<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f26242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f26243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f26244e;

    public a(T t10, T t11) {
        this(t10, t11, new LinearInterpolator());
    }

    public abstract T a(T t10, T t11, float f6);

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return a(this.f26242c, this.f26243d, this.f26244e.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    public a(T t10, T t11, Interpolator interpolator) {
        this.f26242c = t10;
        this.f26243d = t11;
        this.f26244e = interpolator;
    }
}
