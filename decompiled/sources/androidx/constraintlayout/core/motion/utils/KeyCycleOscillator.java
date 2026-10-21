package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeyCycleOscillator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CurveFit f18847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f18848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18850d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18851e = null;
    public int mVariesBy = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<d> f18852f = new ArrayList<>();

    public static class PathRotateSet extends KeyCycleOscillator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f18853g;

        public PathRotateSet(String str) {
            this.f18853g = androidx.constraintlayout.core.motion.utils.c.a(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f6, double d2, double d3) {
            motionWidget.setRotationZ(get(f6) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f6) {
            motionWidget.setValue(this.f18853g, get(f6));
        }
    }

    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        public final int compare(d dVar, d dVar2) {
            return Integer.compare(dVar.f18864a, dVar2.f18864a);
        }
    }

    public static class b extends KeyCycleOscillator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18854g;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public final void setProperty(MotionWidget motionWidget, float f6) {
            motionWidget.setValue(this.f18854g, get(f6));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Oscillator f18855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f18856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double[] f18857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f18858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f18859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float[] f18860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CurveFit f18861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double[] f18862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double[] f18863i;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f18865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f18866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f18867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f18868e;

        public d(float f6, float f10, float f11, float f12, int i10) {
            this.f18864a = i10;
            this.f18865b = f12;
            this.f18866c = f10;
            this.f18867d = f6;
            this.f18868e = f11;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        if (str.equals("pathRotate")) {
            return new PathRotateSet(str);
        }
        b bVar = new b();
        bVar.f18854g = androidx.constraintlayout.core.motion.utils.c.a(str);
        return bVar;
    }

    public float get(float f6) {
        c cVar = this.f18848b;
        CurveFit curveFit = cVar.f18861g;
        if (curveFit != null) {
            curveFit.getPos(f6, cVar.f18862h);
        } else {
            double[] dArr = cVar.f18862h;
            dArr[0] = cVar.f18859e[0];
            dArr[1] = cVar.f18860f[0];
            dArr[2] = cVar.f18856b[0];
        }
        double[] dArr2 = cVar.f18862h;
        return (float) ((cVar.f18855a.getValue(f6, dArr2[1]) * cVar.f18862h[2]) + dArr2[0]);
    }

    public CurveFit getCurveFit() {
        return this.f18847a;
    }

    public float getSlope(float f6) {
        c cVar = this.f18848b;
        CurveFit curveFit = cVar.f18861g;
        if (curveFit != null) {
            double d2 = f6;
            curveFit.getSlope(d2, cVar.f18863i);
            cVar.f18861g.getPos(d2, cVar.f18862h);
        } else {
            double[] dArr = cVar.f18863i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d3 = f6;
        double value = cVar.f18855a.getValue(d3, cVar.f18862h[1]);
        double slope = cVar.f18855a.getSlope(d3, cVar.f18862h[1], cVar.f18863i[1]);
        double[] dArr2 = cVar.f18863i;
        return (float) ((slope * cVar.f18862h[2]) + (value * dArr2[2]) + dArr2[0]);
    }

    public void setPoint(int i10, int i11, String str, int i12, float f6, float f10, float f11, float f12, Object obj) {
        this.f18852f.add(new d(f6, f10, f11, f12, i10));
        if (i12 != -1) {
            this.mVariesBy = i12;
        }
        this.f18850d = i11;
        setCustom(obj);
        this.f18851e = str;
    }

    public void setType(String str) {
        this.f18849c = str;
    }

    public void setup(float f6) {
        ArrayList<d> arrayList = this.f18852f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        int i10 = this.f18850d;
        String str = this.f18851e;
        c cVar = new c();
        Oscillator oscillator = new Oscillator();
        cVar.f18855a = oscillator;
        oscillator.setType(i10, str);
        cVar.f18856b = new float[size];
        cVar.f18857c = new double[size];
        cVar.f18858d = new float[size];
        cVar.f18859e = new float[size];
        cVar.f18860f = new float[size];
        float[] fArr = new float[size];
        this.f18848b = cVar;
        int i11 = 0;
        for (d dVar : arrayList) {
            float f10 = dVar.f18867d;
            dArr[i11] = ((double) f10) * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f11 = dVar.f18865b;
            dArr3[0] = f11;
            float f12 = dVar.f18866c;
            dArr3[1] = f12;
            float f13 = dVar.f18868e;
            dArr3[2] = f13;
            c cVar2 = this.f18848b;
            cVar2.f18857c[i11] = ((double) dVar.f18864a) / 100.0d;
            cVar2.f18858d[i11] = f10;
            cVar2.f18859e[i11] = f12;
            cVar2.f18860f[i11] = f13;
            cVar2.f18856b[i11] = f11;
            i11++;
        }
        c cVar3 = this.f18848b;
        double[] dArr4 = cVar3.f18857c;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr4.length, 3);
        float[] fArr2 = cVar3.f18856b;
        cVar3.f18862h = new double[fArr2.length + 2];
        cVar3.f18863i = new double[fArr2.length + 2];
        double d2 = dArr4[0];
        float[] fArr3 = cVar3.f18858d;
        Oscillator oscillator2 = cVar3.f18855a;
        if (d2 > 0.0d) {
            oscillator2.addPoint(0.0d, fArr3[0]);
        }
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            oscillator2.addPoint(1.0d, fArr3[length]);
        }
        for (int i12 = 0; i12 < dArr5.length; i12++) {
            double[] dArr6 = dArr5[i12];
            dArr6[0] = cVar3.f18859e[i12];
            dArr6[1] = cVar3.f18860f[i12];
            dArr6[2] = fArr2[i12];
            oscillator2.addPoint(dArr4[i12], fArr3[i12]);
        }
        oscillator2.normalize();
        if (dArr4.length > 1) {
            cVar3.f18861g = CurveFit.get(0, dArr4, dArr5);
        } else {
            cVar3.f18861g = null;
        }
        this.f18847a = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String string = this.f18849c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (d dVar : this.f18852f) {
            StringBuilder sbE = androidx.camera.core.processing.f.e(string, Constant.BRACKET_OPEN);
            sbE.append(dVar.f18864a);
            sbE.append(" , ");
            sbE.append(decimalFormat.format(dVar.f18865b));
            sbE.append("] ");
            string = sbE.toString();
        }
        return string;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    public void setPoint(int i10, int i11, String str, int i12, float f6, float f10, float f11, float f12) {
        this.f18852f.add(new d(f6, f10, f11, f12, i10));
        if (i12 != -1) {
            this.mVariesBy = i12;
        }
        this.f18850d = i11;
        this.f18851e = str;
    }

    public void setCustom(Object obj) {
    }

    public void setProperty(MotionWidget motionWidget, float f6) {
    }
}
