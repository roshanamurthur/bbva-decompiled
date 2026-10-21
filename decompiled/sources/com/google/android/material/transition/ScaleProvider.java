package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import pe.l;

/* JADX INFO: loaded from: classes10.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f45905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f45906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45909f;

    public ScaleProvider() {
        this(true);
    }

    public static ObjectAnimator a(View view, float f6, float f10) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f6, scaleX * f10), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f6 * scaleY, f10 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new l(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f45908e ? a(view, this.f45906c, this.f45907d) : a(view, this.f45905b, this.f45904a);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f45909f) {
            return this.f45908e ? a(view, this.f45904a, this.f45905b) : a(view, this.f45907d, this.f45906c);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.f45907d;
    }

    public float getIncomingStartScale() {
        return this.f45906c;
    }

    public float getOutgoingEndScale() {
        return this.f45905b;
    }

    public float getOutgoingStartScale() {
        return this.f45904a;
    }

    public boolean isGrowing() {
        return this.f45908e;
    }

    public boolean isScaleOnDisappear() {
        return this.f45909f;
    }

    public void setGrowing(boolean z10) {
        this.f45908e = z10;
    }

    public void setIncomingEndScale(float f6) {
        this.f45907d = f6;
    }

    public void setIncomingStartScale(float f6) {
        this.f45906c = f6;
    }

    public void setOutgoingEndScale(float f6) {
        this.f45905b = f6;
    }

    public void setOutgoingStartScale(float f6) {
        this.f45904a = f6;
    }

    public void setScaleOnDisappear(boolean z10) {
        this.f45909f = z10;
    }

    public ScaleProvider(boolean z10) {
        this.f45904a = 1.0f;
        this.f45905b = 1.1f;
        this.f45906c = 0.8f;
        this.f45907d = 1.0f;
        this.f45909f = true;
        this.f45908e = z10;
    }
}
