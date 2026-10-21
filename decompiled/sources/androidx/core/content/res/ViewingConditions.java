package androidx.core.content.res;

import androidx.annotation.NonNull;
import androidx.core.graphics.b;
import androidx.datastore.preferences.protobuf.q;

/* JADX INFO: loaded from: classes.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((((double) CamUtils.yFromLStar(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f6, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.mN = f6;
        this.mAw = f10;
        this.mNbb = f11;
        this.mNcb = f12;
        this.mC = f13;
        this.mNc = f14;
        this.mRgbD = fArr;
        this.mFl = f15;
        this.mFlRoot = f16;
        this.mZ = f17;
    }

    @NonNull
    public static ViewingConditions make(@NonNull float[] fArr, float f6, float f10, float f11, boolean z10) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = (fArr3[1] * f14) + f13;
        float f16 = fArr[2];
        float f17 = (fArr3[2] * f16) + f15;
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f14) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f19 = (f16 * fArr5[2]) + (f14 * fArr5[1]) + (f12 * fArr5[0]);
        float f20 = (f11 / 10.0f) + 0.8f;
        float fLerp = ((double) f20) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f20 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f20 - 0.8f) * 10.0f);
        float fA = z10 ? 1.0f : b.a((float) Math.exp(((-f6) - 42.0f) / 92.0f), 0.2777778f, 1.0f, f20);
        double d2 = fA;
        if (d2 > 1.0d) {
            fA = 1.0f;
        } else if (d2 < 0.0d) {
            fA = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * fA) + 1.0f) - fA, (((100.0f / f18) * fA) + 1.0f) - fA, (((100.0f / f19) * fA) + 1.0f) - fA};
        float f21 = 1.0f / ((5.0f * f6) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float fCbrt = (0.1f * f23 * f23 * ((float) Math.cbrt(((double) f6) * 5.0d))) + (f22 * f6);
        float fYFromLStar = CamUtils.yFromLStar(f10) / fArr[1];
        double d3 = fYFromLStar;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f19)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f17)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f18)) / 100.0d, 0.42d), fPow2};
        float f24 = fArr7[0];
        float f25 = fArr7[1];
        return new ViewingConditions(fYFromLStar, q.a((400.0f * fPow2) / (fPow2 + 27.13f), 0.05f, (((f24 * 400.0f) / (f24 + 27.13f)) * 2.0f) + ((f25 * 400.0f) / (f25 + 27.13f)), fPow), fPow, fPow, fLerp, f20, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNc() {
        return this.mNc;
    }

    public float getNcb() {
        return this.mNcb;
    }

    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.mZ;
    }
}
