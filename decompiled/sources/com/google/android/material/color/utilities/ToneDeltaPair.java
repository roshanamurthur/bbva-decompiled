package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ToneDeltaPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicColor f44441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DynamicColor f44442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TonePolarity f44444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44445e;

    public ToneDeltaPair(@NonNull DynamicColor dynamicColor, @NonNull DynamicColor dynamicColor2, double d2, @NonNull TonePolarity tonePolarity, boolean z10) {
        this.f44441a = dynamicColor;
        this.f44442b = dynamicColor2;
        this.f44443c = d2;
        this.f44444d = tonePolarity;
        this.f44445e = z10;
    }

    public double getDelta() {
        return this.f44443c;
    }

    @NonNull
    public TonePolarity getPolarity() {
        return this.f44444d;
    }

    @NonNull
    public DynamicColor getRoleA() {
        return this.f44441a;
    }

    @NonNull
    public DynamicColor getRoleB() {
        return this.f44442b;
    }

    public boolean getStayTogether() {
        return this.f44445e;
    }
}
