package com.google.zxing.common;

import androidx.camera.camera2.internal.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class PerspectiveTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f49832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f49833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f49834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f49835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f49836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f49837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f49838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f49839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f49840i;

    public PerspectiveTransform(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f49832a = f6;
        this.f49833b = f12;
        this.f49834c = f15;
        this.f49835d = f10;
        this.f49836e = f13;
        this.f49837f = f16;
        this.f49838g = f11;
        this.f49839h = f14;
        this.f49840i = f17;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        PerspectiveTransform perspectiveTransformQuadrilateralToSquare = quadrilateralToSquare(f6, f10, f11, f12, f13, f14, f15, f16);
        PerspectiveTransform perspectiveTransformSquareToQuadrilateral = squareToQuadrilateral(f17, f18, f19, f20, f21, f22, f23, f24);
        perspectiveTransformSquareToQuadrilateral.getClass();
        float f25 = perspectiveTransformQuadrilateralToSquare.f49832a;
        float f26 = perspectiveTransformSquareToQuadrilateral.f49832a;
        float f27 = perspectiveTransformSquareToQuadrilateral.f49835d;
        float f28 = perspectiveTransformQuadrilateralToSquare.f49833b;
        float f29 = perspectiveTransformSquareToQuadrilateral.f49838g;
        float f30 = perspectiveTransformQuadrilateralToSquare.f49834c;
        float f31 = (f27 * f28) + (f26 * f25) + (f29 * f30);
        float f32 = perspectiveTransformQuadrilateralToSquare.f49835d;
        float f33 = perspectiveTransformQuadrilateralToSquare.f49836e;
        float f34 = perspectiveTransformQuadrilateralToSquare.f49837f;
        float f35 = (f27 * f33) + (f26 * f32) + (f29 * f34);
        float f36 = perspectiveTransformQuadrilateralToSquare.f49838g;
        float f37 = perspectiveTransformQuadrilateralToSquare.f49839h;
        float f38 = perspectiveTransformQuadrilateralToSquare.f49840i;
        float f39 = f29 * f38;
        float f40 = f39 + (f27 * f37) + (f26 * f36);
        float f41 = perspectiveTransformSquareToQuadrilateral.f49833b;
        float f42 = perspectiveTransformSquareToQuadrilateral.f49836e;
        float f43 = perspectiveTransformSquareToQuadrilateral.f49839h;
        float f44 = (f43 * f30) + (f42 * f28) + (f41 * f25);
        float f45 = (f43 * f34) + (f42 * f33) + (f41 * f32);
        float f46 = (f42 * f37) + (f41 * f36) + (f43 * f38);
        float f47 = perspectiveTransformSquareToQuadrilateral.f49834c;
        float f48 = perspectiveTransformSquareToQuadrilateral.f49837f;
        float f49 = f28 * f48;
        float f50 = perspectiveTransformSquareToQuadrilateral.f49840i;
        return new PerspectiveTransform(f31, f35, f40, f44, f45, f46, (f30 * f50) + f49 + (f25 * f47), (f34 * f50) + (f33 * f48) + (f32 * f47), (f50 * f38) + (f48 * f37) + (f47 * f36));
    }

    public static PerspectiveTransform quadrilateralToSquare(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        PerspectiveTransform perspectiveTransformSquareToQuadrilateral = squareToQuadrilateral(f6, f10, f11, f12, f13, f14, f15, f16);
        float f17 = perspectiveTransformSquareToQuadrilateral.f49836e;
        float f18 = perspectiveTransformSquareToQuadrilateral.f49840i;
        float f19 = perspectiveTransformSquareToQuadrilateral.f49837f;
        float f20 = perspectiveTransformSquareToQuadrilateral.f49839h;
        float f21 = (f17 * f18) - (f19 * f20);
        float f22 = perspectiveTransformSquareToQuadrilateral.f49838g;
        float f23 = perspectiveTransformSquareToQuadrilateral.f49835d;
        float f24 = (f19 * f22) - (f23 * f18);
        float f25 = (f23 * f20) - (f17 * f22);
        float f26 = perspectiveTransformSquareToQuadrilateral.f49834c;
        float f27 = perspectiveTransformSquareToQuadrilateral.f49833b;
        float f28 = perspectiveTransformSquareToQuadrilateral.f49832a;
        return new PerspectiveTransform(f21, f24, f25, (f26 * f20) - (f27 * f18), (f18 * f28) - (f26 * f22), (f22 * f27) - (f20 * f28), (f27 * f19) - (f26 * f17), (f26 * f23) - (f19 * f28), (f28 * f17) - (f27 * f23));
    }

    public static PerspectiveTransform squareToQuadrilateral(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f6 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new PerspectiveTransform(f11 - f6, f13 - f11, f6, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float fA = h0.a(f20, f18, f22 * f17, f23);
        float fA2 = h0.a(f17, f21, f19 * f18, f23);
        return new PerspectiveTransform((fA * f11) + (f11 - f6), (fA2 * f15) + (f15 - f6), f6, (fA * f12) + (f12 - f10), (fA2 * f16) + (f16 - f10), f10, fA, fA2, 1.0f);
    }

    public void transformPoints(float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f6 = fArr[i10];
            int i11 = i10 + 1;
            float f10 = fArr[i11];
            float f11 = (this.f49837f * f10) + (this.f49834c * f6) + this.f49840i;
            fArr[i10] = (((this.f49835d * f10) + (this.f49832a * f6)) + this.f49838g) / f11;
            fArr[i11] = (((this.f49836e * f10) + (this.f49833b * f6)) + this.f49839h) / f11;
        }
    }

    public void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f6 = fArr[i10];
            float f10 = fArr2[i10];
            float f11 = (this.f49837f * f10) + (this.f49834c * f6) + this.f49840i;
            fArr[i10] = (((this.f49835d * f10) + (this.f49832a * f6)) + this.f49838g) / f11;
            fArr2[i10] = (((this.f49836e * f10) + (this.f49833b * f6)) + this.f49839h) / f11;
        }
    }
}
