package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class RelativeCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45268a;

    public RelativeCornerSize(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f45268a = f6;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static RelativeCornerSize createFromCornerSize(@NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? (RelativeCornerSize) cornerSize : new RelativeCornerSize(cornerSize.getCornerSize(rectF) / Math.min(rectF.width(), rectF.height()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.f45268a == ((RelativeCornerSize) obj).f45268a;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f45268a;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getRelativePercent() {
        return this.f45268a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f45268a)});
    }
}
