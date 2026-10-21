package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    protected static float sVal2PI = 6.2831855f;
    protected int mCount;
    protected CurveFit mCurveFit;
    protected long mLastTime;
    protected String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float mLastCycle = Float.NaN;

    public static class CustomSet extends TimeCycleSplineSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KeyFrameArray.CustomArray f18934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KeyFrameArray.a f18935c = new KeyFrameArray.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f18936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f18937e;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.f18933a = str.split(",")[1];
            this.f18934b = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i10, float f6, float f10, int i11, float f11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f6, long j10, KeyCache keyCache) {
            this.mCurveFit.getPos(f6, this.f18936d);
            float[] fArr = this.f18936d;
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            long j11 = j10 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.f18933a, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f12 = (float) ((((j11 * 1.0E-9d) * ((double) f10)) + ((double) this.mLastCycle)) % 1.0d);
            this.mLastCycle = f12;
            this.mLastTime = j10;
            float fCalcWave = calcWave(f12);
            this.mContinue = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f18937e;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.mContinue;
                float f13 = this.f18936d[i10];
                this.mContinue = z10 | (((double) f13) != 0.0d);
                fArr2[i10] = (f13 * fCalcWave) + f11;
                i10++;
            }
            motionWidget.setInterpolatedValue(this.f18934b.valueAt(0), this.f18937e);
            if (f10 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i10) {
            KeyFrameArray.CustomArray customArray = this.f18934b;
            int size = customArray.size();
            int iNumberOfInterpolatedValues = customArray.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i11 = iNumberOfInterpolatedValues + 2;
            this.f18936d = new float[i11];
            this.f18937e = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = customArray.keyAt(i12);
                CustomAttribute customAttributeValueAt = customArray.valueAt(i12);
                KeyFrameArray.a aVar = this.f18935c;
                float[] fArr = aVar.f18876b[aVar.f18875a[i12]];
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.f18936d);
                int i13 = 0;
                while (true) {
                    float[] fArr2 = this.f18936d;
                    if (i13 < fArr2.length) {
                        dArr2[i12][i13] = fArr2[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iNumberOfInterpolatedValues] = fArr[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArr[1];
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, CustomAttribute customAttribute, float f6, int i11, float f10) {
            this.f18934b.append(i10, customAttribute);
            this.f18935c.a(i10, new float[]{f6, f10});
            this.mWaveShape = Math.max(this.mWaveShape, i11);
        }
    }

    public static class CustomVarSet extends TimeCycleSplineSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KeyFrameArray.CustomVar f18939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KeyFrameArray.a f18940c = new KeyFrameArray.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f18941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f18942e;

        public CustomVarSet(String str, KeyFrameArray.CustomVar customVar) {
            this.f18938a = str.split(",")[1];
            this.f18939b = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i10, float f6, float f10, int i11, float f11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f6, long j10, KeyCache keyCache) {
            this.mCurveFit.getPos(f6, this.f18941d);
            float[] fArr = this.f18941d;
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            long j11 = j10 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.f18938a, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f12 = (float) ((((j11 * 1.0E-9d) * ((double) f10)) + ((double) this.mLastCycle)) % 1.0d);
            this.mLastCycle = f12;
            this.mLastTime = j10;
            float fCalcWave = calcWave(f12);
            this.mContinue = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f18942e;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.mContinue;
                float f13 = this.f18941d[i10];
                this.mContinue = z10 | (((double) f13) != 0.0d);
                fArr2[i10] = (f13 * fCalcWave) + f11;
                i10++;
            }
            this.f18939b.valueAt(0).setInterpolatedValue(motionWidget, this.f18942e);
            if (f10 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i10) {
            KeyFrameArray.CustomVar customVar = this.f18939b;
            int size = customVar.size();
            int iNumberOfInterpolatedValues = customVar.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i11 = iNumberOfInterpolatedValues + 2;
            this.f18941d = new float[i11];
            this.f18942e = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = customVar.keyAt(i12);
                CustomVariable customVariableValueAt = customVar.valueAt(i12);
                KeyFrameArray.a aVar = this.f18940c;
                float[] fArr = aVar.f18876b[aVar.f18875a[i12]];
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.f18941d);
                int i13 = 0;
                while (true) {
                    float[] fArr2 = this.f18941d;
                    if (i13 < fArr2.length) {
                        dArr2[i12][i13] = fArr2[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iNumberOfInterpolatedValues] = fArr[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArr[1];
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, CustomVariable customVariable, float f6, int i11, float f10) {
            this.f18939b.append(i10, customVariable);
            this.f18940c.a(i10, new float[]{f6, f10});
            this.mWaveShape = Math.max(this.mWaveShape, i11);
        }
    }

    public static class Sort {
    }

    public float calcWave(float f6) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f6 * sVal2PI);
            case 2:
                fAbs = Math.abs(f6);
                break;
            case 3:
                return (((f6 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f6 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f6 * sVal2PI);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f6 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f6 * sVal2PI);
        }
        return 1.0f - fAbs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i10, float f6, float f10, int i11, float f11) {
        int[] iArr = this.mTimePoints;
        int i12 = this.mCount;
        iArr[i12] = i10;
        float[] fArr = this.mValues[i12];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f11;
        this.mWaveShape = Math.max(this.mWaveShape, i11);
        this.mCount++;
    }

    public void setStartTime(long j10) {
        this.mLastTime = j10;
    }

    public void setType(String str) {
        this.mType = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    public void setup(int i10) {
        int i11 = this.mCount;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.mType);
            return;
        }
        int[] iArr = this.mTimePoints;
        float[][] fArr = this.mValues;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (i12 > 0) {
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            int i15 = i12 - 2;
            int i16 = iArr2[i15];
            if (i14 < i16) {
                int i17 = iArr[i16];
                int i18 = i14;
                int i19 = i18;
                while (i18 < i16) {
                    int i20 = iArr[i18];
                    if (i20 <= i17) {
                        int i21 = iArr[i19];
                        iArr[i19] = i20;
                        iArr[i18] = i21;
                        float[] fArr2 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = fArr2;
                        i19++;
                    }
                    i18++;
                }
                int i22 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i22;
                float[] fArr3 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = fArr3;
                iArr2[i15] = i19 - 1;
                iArr2[i13] = i14;
                int i23 = i12 + 1;
                iArr2[i12] = i16;
                i12 += 2;
                iArr2[i23] = i19 + 1;
            } else {
                i12 = i15;
            }
        }
        int i24 = 1;
        int i25 = 0;
        while (true) {
            int[] iArr3 = this.mTimePoints;
            if (i24 >= iArr3.length) {
                break;
            }
            if (iArr3[i24] != iArr3[i24 - 1]) {
                i25++;
            }
            i24++;
        }
        if (i25 == 0) {
            i25 = 1;
        }
        double[] dArr = new double[i25];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i25, 3);
        int i26 = 0;
        for (int i27 = 0; i27 < this.mCount; i27++) {
            if (i27 > 0) {
                int[] iArr4 = this.mTimePoints;
                if (iArr4[i27] != iArr4[i27 - 1]) {
                    dArr[i26] = ((double) this.mTimePoints[i27]) * 0.01d;
                    double[] dArr3 = dArr2[i26];
                    float[] fArr4 = this.mValues[i27];
                    dArr3[0] = fArr4[0];
                    dArr3[1] = fArr4[1];
                    dArr3[2] = fArr4[2];
                    i26++;
                }
            } else {
                dArr[i26] = ((double) this.mTimePoints[i27]) * 0.01d;
                double[] dArr4 = dArr2[i26];
                float[] fArr5 = this.mValues[i27];
                dArr4[0] = fArr5[0];
                dArr4[1] = fArr5[1];
                dArr4[2] = fArr5[2];
                i26++;
            }
        }
        this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
    }

    public String toString() {
        String string = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.mCount; i10++) {
            StringBuilder sbE = androidx.camera.core.processing.f.e(string, Constant.BRACKET_OPEN);
            sbE.append(this.mTimePoints[i10]);
            sbE.append(" , ");
            sbE.append(decimalFormat.format(this.mValues[i10]));
            sbE.append("] ");
            string = sbE.toString();
        }
        return string;
    }
}
