package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class CurveFit {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    public static class a extends CurveFit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f18828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f18829b;

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void getPos(double d2, double[] dArr) {
            double[] dArr2 = this.f18829b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double getSlope(double d2, int i10) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double[] getTimePoints() {
            return new double[]{this.f18828a};
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void getPos(double d2, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f18829b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void getSlope(double d2, double[] dArr) {
            for (int i10 = 0; i10 < this.f18829b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double getPos(double d2, int i10) {
            return this.f18829b[i10];
        }
    }

    public static CurveFit get(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 == 0) {
            return new MonotonicCurveFit(dArr, dArr2);
        }
        if (i10 != 2) {
            return new LinearCurveFit(dArr, dArr2);
        }
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        a aVar = new a();
        aVar.f18828a = d2;
        aVar.f18829b = dArr3;
        return aVar;
    }

    public static CurveFit getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        return new ArcCurveFit(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d2, int i10);

    public abstract void getPos(double d2, double[] dArr);

    public abstract void getPos(double d2, float[] fArr);

    public abstract double getSlope(double d2, int i10);

    public abstract void getSlope(double d2, double[] dArr);

    public abstract double[] getTimePoints();
}
