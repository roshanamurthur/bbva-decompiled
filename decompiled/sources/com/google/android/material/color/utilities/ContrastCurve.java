package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ContrastCurve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f44362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f44363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f44365d;

    public ContrastCurve(double d2, double d3, double d7, double d10) {
        this.f44362a = d2;
        this.f44363b = d3;
        this.f44364c = d7;
        this.f44365d = d10;
    }

    public double getContrast(double d2) {
        if (d2 <= -1.0d) {
            return this.f44362a;
        }
        if (d2 < 0.0d) {
            return MathUtils.lerp(this.f44362a, this.f44363b, (d2 - (-1.0d)) / 1.0d);
        }
        if (d2 < 0.5d) {
            return MathUtils.lerp(this.f44363b, this.f44364c, (d2 - 0.0d) / 0.5d);
        }
        return d2 < 1.0d ? MathUtils.lerp(this.f44364c, this.f44365d, (d2 - 0.5d) / 0.5d) : this.f44365d;
    }
}
