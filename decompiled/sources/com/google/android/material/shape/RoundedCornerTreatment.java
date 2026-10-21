package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class RoundedCornerTreatment extends CornerTreatment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45269a;

    public RoundedCornerTreatment() {
        this.f45269a = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f10, float f11) {
        shapePath.reset(0.0f, f11 * f10, 180.0f, 180.0f - f6);
        float f12 = f11 * 2.0f * f10;
        shapePath.addArc(0.0f, 0.0f, f12, f12, 180.0f, f6);
    }

    @Deprecated
    public RoundedCornerTreatment(float f6) {
        this.f45269a = f6;
    }
}
