package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public abstract class SplineSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18896b;
    protected CurveFit mCurveFit;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    public static class CustomSet extends SplineSet {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KeyFrameArray.CustomArray f18897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f18898d;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            String str2 = str.split(",")[1];
            this.f18897c = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i10, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setProperty(WidgetFrame widgetFrame, float f6) {
            this.mCurveFit.getPos(f6, this.f18898d);
            widgetFrame.setCustomValue(this.f18897c.valueAt(0), this.f18898d);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i10) {
            KeyFrameArray.CustomArray customArray = this.f18897c;
            int size = customArray.size();
            int iNumberOfInterpolatedValues = customArray.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f18898d = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = customArray.keyAt(i11);
                CustomAttribute customAttributeValueAt = customArray.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.f18898d);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f18898d;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, CustomAttribute customAttribute) {
            this.f18897c.append(i10, customAttribute);
        }
    }

    public static class CustomSpline extends SplineSet {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KeyFrameArray.CustomVar f18899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f18900d;

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            String str2 = str.split(",")[1];
            this.f18899c = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i10, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f6) {
            setProperty((MotionWidget) typedValues, f6);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i10) {
            KeyFrameArray.CustomVar customVar = this.f18899c;
            int size = customVar.size();
            int iNumberOfInterpolatedValues = customVar.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f18900d = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = customVar.keyAt(i11);
                CustomVariable customVariableValueAt = customVar.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.f18900d);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f18900d;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, CustomVariable customVariable) {
            this.f18899c.append(i10, customVariable);
        }

        public void setProperty(MotionWidget motionWidget, float f6) {
            this.mCurveFit.getPos(f6, this.f18900d);
            this.f18899c.valueAt(0).setInterpolatedValue(motionWidget, this.f18900d);
        }
    }

    public static class a extends SplineSet {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18901c;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void setProperty(TypedValues typedValues, float f6) {
            typedValues.setValue(typedValues.getId(this.f18901c), get(f6));
        }
    }

    public static SplineSet makeCustomSpline(String str, KeyFrameArray.CustomArray customArray) {
        return new CustomSet(str, customArray);
    }

    public static SplineSet makeCustomSplineSet(String str, KeyFrameArray.CustomVar customVar) {
        return new CustomSpline(str, customVar);
    }

    public static SplineSet makeSpline(String str, long j10) {
        a aVar = new a();
        aVar.f18901c = str;
        return aVar;
    }

    public float get(float f6) {
        return (float) this.mCurveFit.getPos(f6, 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f6) {
        return (float) this.mCurveFit.getSlope(f6, 0);
    }

    public void setPoint(int i10, float f6) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.f18895a + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i11 = this.f18895a;
        iArr2[i11] = i10;
        this.mValues[i11] = f6;
        this.f18895a = i11 + 1;
    }

    public void setProperty(TypedValues typedValues, float f6) {
        typedValues.setValue(androidx.constraintlayout.core.motion.utils.a.a(this.f18896b), get(f6));
    }

    public void setType(String str) {
        this.f18896b = str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    public void setup(int i10) {
        int i11 = this.f18895a;
        if (i11 == 0) {
            return;
        }
        int[] iArr = this.mTimePoints;
        float[] fArr = this.mValues;
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
                        float f6 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = f6;
                        i19++;
                    }
                    i18++;
                }
                int i22 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i22;
                float f10 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = f10;
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
        for (int i25 = 1; i25 < this.f18895a; i25++) {
            int[] iArr3 = this.mTimePoints;
            if (iArr3[i25 - 1] != iArr3[i25]) {
                i24++;
            }
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i24, 1);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f18895a; i27++) {
            if (i27 > 0) {
                int[] iArr4 = this.mTimePoints;
                if (iArr4[i27] != iArr4[i27 - 1]) {
                    dArr[i26] = ((double) this.mTimePoints[i27]) * 0.01d;
                    dArr2[i26][0] = this.mValues[i27];
                    i26++;
                }
            } else {
                dArr[i26] = ((double) this.mTimePoints[i27]) * 0.01d;
                dArr2[i26][0] = this.mValues[i27];
                i26++;
            }
        }
        this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
    }

    public String toString() {
        String string = this.f18896b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f18895a; i10++) {
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
