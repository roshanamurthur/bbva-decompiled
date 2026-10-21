package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45223a;

    public AbsoluteCornerSize(float f6) {
        this.f45223a = f6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.f45223a == ((AbsoluteCornerSize) obj).f45223a;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.f45223a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f45223a)});
    }

    public float getCornerSize() {
        return this.f45223a;
    }
}
