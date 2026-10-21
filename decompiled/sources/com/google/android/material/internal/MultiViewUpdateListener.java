package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.collection.h;
import java.util.Collection;
import w4.q;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f44848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View[] f44849b;

    public interface a {
        void c(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull a aVar, @NonNull View... viewArr) {
        this.f44848a = aVar;
        this.f44849b = viewArr;
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new h(), viewArr);
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new q(), viewArr);
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new z0.a(6), viewArr);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull View... viewArr) {
        return new MultiViewUpdateListener(new z0.b(5), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.f44849b) {
            this.f44848a.c(valueAnimator, view);
        }
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new com.google.android.gms.internal.mlkit_common.a(), collection);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new ai.a(), collection);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull a aVar, @NonNull Collection<View> collection) {
        this.f44848a = aVar;
        this.f44849b = (View[]) collection.toArray(new View[0]);
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new bc.org.bouncycastle.math.ec.a(), collection);
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull Collection<View> collection) {
        return new MultiViewUpdateListener(new k4.d(4), collection);
    }
}
