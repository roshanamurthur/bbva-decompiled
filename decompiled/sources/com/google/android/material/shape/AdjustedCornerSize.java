package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AdjustedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CornerSize f45224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f45225b;

    public AdjustedCornerSize(float f6, @NonNull CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f45224a;
            f6 += ((AdjustedCornerSize) cornerSize).f45225b;
        }
        this.f45224a = cornerSize;
        this.f45225b = f6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        return this.f45224a.equals(adjustedCornerSize.f45224a) && this.f45225b == adjustedCornerSize.f45225b;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f45224a.getCornerSize(rectF) + this.f45225b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45224a, Float.valueOf(this.f45225b)});
    }
}
