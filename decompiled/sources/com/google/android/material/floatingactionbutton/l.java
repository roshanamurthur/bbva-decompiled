package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements TypeEvaluator<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatEvaluator f44758a;

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f6, Float f10, Float f11) {
        float fFloatValue = this.f44758a.evaluate(f6, (Number) f10, (Number) f11).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
