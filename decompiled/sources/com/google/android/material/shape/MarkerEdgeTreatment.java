package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f45235p0;

    public MarkerEdgeTreatment(float f6) {
        this.f45235p0 = f6 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        float f12 = this.f45235p0;
        float fSqrt = (float) ((Math.sqrt(2.0d) * ((double) f12)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(f12, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.reset(f10 - fSqrt, ((float) (-((Math.sqrt(2.0d) * ((double) f12)) - ((double) f12)))) + fSqrt2);
        shapePath.lineTo(f10, (float) (-((Math.sqrt(2.0d) * ((double) f12)) - ((double) f12))));
        shapePath.lineTo(f10 + fSqrt, ((float) (-((Math.sqrt(2.0d) * ((double) f12)) - ((double) f12)))) + fSqrt2);
    }
}
