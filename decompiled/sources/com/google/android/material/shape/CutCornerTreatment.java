package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class CutCornerTreatment extends CornerTreatment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45227a;

    public CutCornerTreatment() {
        this.f45227a = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f10, float f11) {
        shapePath.reset(0.0f, f11 * f10, 180.0f, 180.0f - f6);
        double d2 = f11;
        double d3 = f10;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f6)) * d2 * d3), (float) (Math.sin(Math.toRadians(90.0f - f6)) * d2 * d3));
    }

    @Deprecated
    public CutCornerTreatment(float f6) {
        this.f45227a = f6;
    }
}
