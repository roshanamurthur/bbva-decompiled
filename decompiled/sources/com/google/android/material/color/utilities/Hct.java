package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Hct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f44372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f44373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f44374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44375d;

    public Hct(int i10) {
        a(i10);
    }

    public static Hct from(double d2, double d3, double d7) {
        return new Hct(HctSolver.solveToInt(d2, d3, d7));
    }

    public static Hct fromInt(int i10) {
        return new Hct(i10);
    }

    public final void a(int i10) {
        this.f44375d = i10;
        Cam16 cam16FromInt = Cam16.fromInt(i10);
        this.f44372a = cam16FromInt.getHue();
        this.f44373b = cam16FromInt.getChroma();
        this.f44374c = ColorUtils.lstarFromArgb(i10);
    }

    public double getChroma() {
        return this.f44373b;
    }

    public double getHue() {
        return this.f44372a;
    }

    public double getTone() {
        return this.f44374c;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrB = Cam16.fromInt(toInt()).b(viewingConditions, null);
        Cam16 cam16A = Cam16.a(dArrB[0], dArrB[1], dArrB[2], ViewingConditions.DEFAULT);
        return from(cam16A.getHue(), cam16A.getChroma(), ColorUtils.lstarFromY(dArrB[1]));
    }

    public void setChroma(double d2) {
        a(HctSolver.solveToInt(this.f44372a, d2, this.f44374c));
    }

    public void setHue(double d2) {
        a(HctSolver.solveToInt(d2, this.f44373b, this.f44374c));
    }

    public void setTone(double d2) {
        a(HctSolver.solveToInt(this.f44372a, this.f44373b, d2));
    }

    public int toInt() {
        return this.f44375d;
    }
}
