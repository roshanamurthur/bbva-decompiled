package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ClampedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45226a;

    public ClampedCornerSize(float f6) {
        this.f45226a = f6;
    }

    @NonNull
    public static ClampedCornerSize createFromCornerSize(@NonNull AbsoluteCornerSize absoluteCornerSize) {
        return new ClampedCornerSize(absoluteCornerSize.getCornerSize());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.f45226a == ((ClampedCornerSize) obj).f45226a;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return Math.min(this.f45226a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f45226a)});
    }
}
