package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RectEvaluator implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f44870a;

    public RectEvaluator(@NonNull Rect rect) {
        this.f44870a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f6, @NonNull Rect rect, @NonNull Rect rect2) {
        int i10 = rect.left;
        int i11 = i10 + ((int) ((rect2.left - i10) * f6));
        int i12 = rect.top;
        int i13 = i12 + ((int) ((rect2.top - i12) * f6));
        int i14 = rect.right;
        int i15 = i14 + ((int) ((rect2.right - i14) * f6));
        int i16 = rect.bottom;
        int i17 = i16 + ((int) ((rect2.bottom - i16) * f6));
        Rect rect3 = this.f44870a;
        rect3.set(i11, i13, i15, i17);
        return rect3;
    }
}
