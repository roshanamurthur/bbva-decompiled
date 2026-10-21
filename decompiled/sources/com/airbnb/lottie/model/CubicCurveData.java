package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CubicCurveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f25947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f25948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f25949c;

    public CubicCurveData() {
        this.f25947a = new PointF();
        this.f25948b = new PointF();
        this.f25949c = new PointF();
    }

    public PointF getControlPoint1() {
        return this.f25947a;
    }

    public PointF getControlPoint2() {
        return this.f25948b;
    }

    public PointF getVertex() {
        return this.f25949c;
    }

    public void setControlPoint1(float f6, float f10) {
        this.f25947a.set(f6, f10);
    }

    public void setControlPoint2(float f6, float f10) {
        this.f25948b.set(f6, f10);
    }

    public void setFrom(CubicCurveData cubicCurveData) {
        PointF pointF = cubicCurveData.f25949c;
        setVertex(pointF.x, pointF.y);
        PointF pointF2 = cubicCurveData.f25947a;
        setControlPoint1(pointF2.x, pointF2.y);
        PointF pointF3 = cubicCurveData.f25948b;
        setControlPoint2(pointF3.x, pointF3.y);
    }

    public void setVertex(float f6, float f10) {
        this.f25949c.set(f6, f10);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        PointF pointF = this.f25949c;
        PointF pointF2 = this.f25947a;
        PointF pointF3 = this.f25948b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(pointF.x), Float.valueOf(pointF.y), Float.valueOf(pointF2.x), Float.valueOf(pointF2.y), Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public CubicCurveData(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f25947a = pointF;
        this.f25948b = pointF2;
        this.f25949c = pointF3;
    }
}
