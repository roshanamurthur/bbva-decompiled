package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final EdgeTreatment f45266p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f45267q0;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f6) {
        this.f45266p0 = edgeTreatment;
        this.f45267q0 = f6;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final boolean a() {
        return this.f45266p0.a();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        this.f45266p0.getEdgePath(f6, f10 - this.f45267q0, f11, shapePath);
    }
}
