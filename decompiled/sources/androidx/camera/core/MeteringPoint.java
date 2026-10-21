package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;

    @Nullable
    private Rational mSurfaceAspectRatio;

    public MeteringPoint(float f6, float f10, float f11, @Nullable Rational rational) {
        this.mNormalizedX = f6;
        this.mNormalizedY = f10;
        this.mSize = f11;
        this.mSurfaceAspectRatio = rational;
    }

    public float getSize() {
        return this.mSize;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getX() {
        return this.mNormalizedX;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getY() {
        return this.mNormalizedY;
    }
}
