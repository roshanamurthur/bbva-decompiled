package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes10.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f44039p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f44040q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f44041r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f44042s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f44043t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f44044u0 = -1.0f;

    public BottomAppBarTopEdgeTreatment(float f6, float f10, float f11) {
        this.f44040q0 = f6;
        this.f44039p0 = f10;
        b(f11);
        this.f44043t0 = 0.0f;
    }

    public final void b(@FloatRange(from = 0.0d) float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f44042s0 = f6;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        float f12;
        float f13;
        float f14 = this.f44041r0;
        if (f14 == 0.0f) {
            shapePath.lineTo(f6, 0.0f);
            return;
        }
        float f15 = ((this.f44040q0 * 2.0f) + f14) / 2.0f;
        float f16 = f11 * this.f44039p0;
        float f17 = f10 + this.f44043t0;
        float fA = androidx.datastore.preferences.protobuf.e.a(1.0f, f11, f15, this.f44042s0 * f11);
        if (fA / f15 >= 1.0f) {
            shapePath.lineTo(f6, 0.0f);
            return;
        }
        float f18 = this.f44044u0;
        float f19 = f18 * f11;
        boolean z10 = f18 == -1.0f || Math.abs((f18 * 2.0f) - f14) < 0.1f;
        if (z10) {
            f12 = fA;
            f13 = 0.0f;
        } else {
            f13 = 1.75f;
            f12 = 0.0f;
        }
        float f20 = f15 + f16;
        float f21 = f12 + f16;
        float fSqrt = (float) Math.sqrt((f20 * f20) - (f21 * f21));
        float f22 = f17 - fSqrt;
        float f23 = f17 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f21));
        float f24 = (90.0f - degrees) + f13;
        shapePath.lineTo(f22, 0.0f);
        float f25 = f16 * 2.0f;
        shapePath.addArc(f22 - f16, 0.0f, f22 + f16, f25, 270.0f, degrees);
        if (z10) {
            shapePath.addArc(f17 - f15, (-f15) - f12, f17 + f15, f15 - f12, 180.0f - f24, (f24 * 2.0f) - 180.0f);
        } else {
            float f26 = this.f44040q0;
            float f27 = f19 * 2.0f;
            float f28 = f17 - f15;
            shapePath.addArc(f28, -(f19 + f26), f28 + f26 + f27, f26 + f19, 180.0f - f24, ((f24 * 2.0f) - 180.0f) / 2.0f);
            float f29 = f17 + f15;
            float f30 = this.f44040q0;
            shapePath.lineTo(f29 - ((f30 / 2.0f) + f19), f30 + f19);
            float f31 = this.f44040q0;
            shapePath.addArc(f29 - (f27 + f31), -(f19 + f31), f29, f31 + f19, 90.0f, f24 - 90.0f);
        }
        shapePath.addArc(f23 - f16, 0.0f, f23 + f16, f25, 270.0f - degrees, degrees);
        shapePath.lineTo(f6, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.f44044u0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.f44041r0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.f44043t0;
    }

    public void setFabCornerSize(float f6) {
        this.f44044u0 = f6;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f6) {
        this.f44041r0 = f6;
    }
}
