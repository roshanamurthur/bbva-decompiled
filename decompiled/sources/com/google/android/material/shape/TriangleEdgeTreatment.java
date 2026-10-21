package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f45334p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f45335q0;

    public TriangleEdgeTreatment(float f6, boolean z10) {
        this.f45334p0 = f6;
        this.f45335q0 = z10;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        boolean z10 = this.f45335q0;
        float f12 = this.f45334p0;
        if (!z10) {
            shapePath.lineTo(f10 - (f12 * f11), 0.0f, f10, (-f12) * f11);
            shapePath.lineTo((f12 * f11) + f10, 0.0f, f6, 0.0f);
        } else {
            shapePath.lineTo(f10 - (f12 * f11), 0.0f);
            shapePath.lineTo(f10, f12 * f11, (f12 * f11) + f10, 0.0f);
            shapePath.lineTo(f6, 0.0f);
        }
    }
}
