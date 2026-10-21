package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import qe.o;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f45981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f45982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45985f;

    public ScaleProvider() {
        this(true);
    }

    public static ObjectAnimator a(View view, float f6, float f10) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f6, scaleX * f10), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f6 * scaleY, f10 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new o(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f45984e ? a(view, this.f45982c, this.f45983d) : a(view, this.f45981b, this.f45980a);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f45985f) {
            return this.f45984e ? a(view, this.f45980a, this.f45981b) : a(view, this.f45983d, this.f45982c);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.f45983d;
    }

    public float getIncomingStartScale() {
        return this.f45982c;
    }

    public float getOutgoingEndScale() {
        return this.f45981b;
    }

    public float getOutgoingStartScale() {
        return this.f45980a;
    }

    public boolean isGrowing() {
        return this.f45984e;
    }

    public boolean isScaleOnDisappear() {
        return this.f45985f;
    }

    public void setGrowing(boolean z10) {
        this.f45984e = z10;
    }

    public void setIncomingEndScale(float f6) {
        this.f45983d = f6;
    }

    public void setIncomingStartScale(float f6) {
        this.f45982c = f6;
    }

    public void setOutgoingEndScale(float f6) {
        this.f45981b = f6;
    }

    public void setOutgoingStartScale(float f6) {
        this.f45980a = f6;
    }

    public void setScaleOnDisappear(boolean z10) {
        this.f45985f = z10;
    }

    public ScaleProvider(boolean z10) {
        this.f45980a = 1.0f;
        this.f45981b = 1.1f;
        this.f45982c = 0.8f;
        this.f45983d = 1.0f;
        this.f45985f = true;
        this.f45984e = z10;
    }
}
