package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f18808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18809c = true;

    public static class a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final double[] f18810s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f18811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f18812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f18813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f18814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f18815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f18816f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f18817g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f18818h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f18819i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f18820j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f18821k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f18822l;
        public double m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f18823n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f18824o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f18825p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f18826q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f18827r;

        public final double a() {
            double d2 = this.f18820j * this.f18825p;
            double dHypot = this.f18823n / Math.hypot(d2, (-this.f18821k) * this.f18824o);
            if (this.f18826q) {
                d2 = -d2;
            }
            return d2 * dHypot;
        }

        public final double b() {
            double d2 = this.f18820j * this.f18825p;
            double d3 = (-this.f18821k) * this.f18824o;
            double dHypot = this.f18823n / Math.hypot(d2, d3);
            return this.f18826q ? (-d3) * dHypot : d3 * dHypot;
        }

        public final double c(double d2) {
            double d3 = (d2 - this.f18813c) * this.f18819i;
            double d7 = this.f18816f;
            double d10 = this.f18815e;
            return ((d7 - d10) * d3) + d10;
        }

        public final double d(double d2) {
            double d3 = (d2 - this.f18813c) * this.f18819i;
            double d7 = this.f18818h;
            double d10 = this.f18817g;
            return ((d7 - d10) * d3) + d10;
        }

        public final double e() {
            return (this.f18820j * this.f18824o) + this.f18822l;
        }

        public final double f() {
            return (this.f18821k * this.f18825p) + this.m;
        }

        public final void g(double d2) {
            double d3 = (this.f18826q ? this.f18814d - d2 : d2 - this.f18813c) * this.f18819i;
            double d7 = 0.0d;
            if (d3 > 0.0d) {
                d7 = 1.0d;
                if (d3 < 1.0d) {
                    double[] dArr = this.f18811a;
                    double length = d3 * ((double) (dArr.length - 1));
                    int i10 = (int) length;
                    double d10 = dArr[i10];
                    d7 = ((dArr[i10 + 1] - d10) * (length - ((double) i10))) + d10;
                }
            }
            double d11 = d7 * 1.5707963267948966d;
            this.f18824o = Math.sin(d11);
            this.f18825p = Math.cos(d11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        ?? r10;
        ?? r11;
        ?? r22;
        a[] aVarArr;
        a aVar;
        boolean z10;
        double[] dArr3;
        ?? r12;
        ArcCurveFit arcCurveFit = this;
        double[] dArr4 = dArr;
        ?? r3 = 1;
        arcCurveFit.f18807a = dArr4;
        arcCurveFit.f18808b = new a[dArr4.length - 1];
        char c10 = 0;
        boolean z11 = true;
        ?? r13 = 1;
        int i10 = 0;
        while (true) {
            a[] aVarArr2 = arcCurveFit.f18808b;
            if (i10 >= aVarArr2.length) {
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 0) {
                r10 = 3;
                r11 = z11;
            } else if (i11 == r3) {
                r12 = r3;
                r10 = r12;
                r11 = r12;
            } else {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (z11 != r3) {
                            r12 = r3;
                        }
                        r10 = r12;
                        r11 = r12;
                    } else if (i11 == 4) {
                        r10 = 4;
                        r11 = z11;
                    } else if (i11 == 5) {
                        r10 = 5;
                        r11 = z11;
                    }
                }
                r11 = z11;
                r10 = r13;
                r12 = 2;
                r10 = r12;
                r11 = r12;
            }
            double d2 = dArr4[i10];
            int i12 = i10 + 1;
            double d3 = dArr4[i12];
            double[] dArr5 = dArr2[i10];
            double d7 = dArr5[c10];
            double d10 = dArr5[r3];
            double[] dArr6 = dArr2[i12];
            double d11 = dArr6[c10];
            int i13 = i10;
            double d12 = dArr6[r3];
            a aVar2 = new a();
            aVar2.f18827r = false;
            double d13 = d11 - d7;
            double d14 = d12 - d10;
            if (r10 == r3) {
                aVar2.f18826q = r3;
            } else if (r10 == 4) {
                aVar2.f18826q = d14 > 0.0d ? r3 : 0;
            } else if (r10 != 5) {
                aVar2.f18826q = false;
            } else {
                aVar2.f18826q = d14 < 0.0d ? r3 : 0;
            }
            aVar2.f18813c = d2;
            ?? r16 = r11;
            aVar2.f18814d = d3;
            double d15 = d3 - d2;
            double d16 = 1.0d / d15;
            aVar2.f18819i = d16;
            if (3 == r10) {
                aVar2.f18827r = true;
            }
            if (aVar2.f18827r || Math.abs(d13) < 0.001d || Math.abs(d14) < 0.001d) {
                r22 = r10 == true ? 1 : 0;
                aVarArr = aVarArr2;
                aVar = aVar2;
                z10 = true;
                aVar.f18827r = true;
                aVar.f18815e = d7;
                aVar.f18816f = d11;
                aVar.f18817g = d10;
                aVar.f18818h = d12;
                double dHypot = Math.hypot(d14, d13);
                aVar.f18812b = dHypot;
                aVar.f18823n = dHypot * d16;
                aVar.f18822l = d13 / d15;
                aVar.m = d14 / d15;
            } else {
                aVar2.f18811a = new double[101];
                boolean z12 = aVar2.f18826q;
                aVar2.f18820j = ((double) (z12 ? -1 : 1)) * d13;
                aVar2.f18821k = d14 * ((double) (z12 ? 1 : -1));
                aVar2.f18822l = z12 ? d11 : d7;
                aVar2.m = z12 ? d10 : d12;
                double d17 = d10 - d12;
                double d18 = 0.0d;
                double d19 = 0.0d;
                double d20 = 0.0d;
                int i14 = 0;
                ?? r14 = r10;
                while (true) {
                    dArr3 = a.f18810s;
                    r22 = r14;
                    if (i14 >= 91) {
                        break;
                    }
                    a[] aVarArr3 = aVarArr2;
                    a aVar3 = aVar2;
                    double d21 = d18;
                    double radians = Math.toRadians((((double) i14) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d13;
                    double dCos = Math.cos(radians) * d17;
                    if (i14 > 0) {
                        double dHypot2 = Math.hypot(dSin - d19, dCos - d20) + d21;
                        dArr3[i14] = dHypot2;
                        d21 = dHypot2;
                    }
                    i14++;
                    d20 = dCos;
                    d19 = dSin;
                    d18 = d21;
                    r14 = r22 == true ? 1 : 0;
                    aVarArr2 = aVarArr3;
                    aVar2 = aVar3;
                }
                aVarArr = aVarArr2;
                aVar = aVar2;
                aVar.f18812b = d18;
                for (int i15 = 0; i15 < 91; i15++) {
                    dArr3[i15] = dArr3[i15] / d18;
                }
                int i16 = 0;
                while (true) {
                    double[] dArr7 = aVar.f18811a;
                    if (i16 >= dArr7.length) {
                        break;
                    }
                    double[] dArr8 = dArr3;
                    double length = ((double) i16) / ((double) (dArr7.length - 1));
                    int iBinarySearch = Arrays.binarySearch(dArr8, length);
                    if (iBinarySearch >= 0) {
                        dArr7[i16] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr7[i16] = 0.0d;
                    } else {
                        int i17 = -iBinarySearch;
                        int i18 = i17 - 2;
                        double d22 = dArr8[i18];
                        dArr7[i16] = (((length - d22) / (dArr8[i17 - 1] - d22)) + ((double) i18)) / ((double) 90);
                    }
                    i16++;
                    dArr3 = dArr8;
                }
                aVar.f18823n = aVar.f18812b * aVar.f18819i;
                z10 = true;
            }
            aVarArr[i13] = aVar;
            arcCurveFit = this;
            dArr4 = dArr;
            r3 = z10;
            z11 = r16 == true ? 1 : 0;
            i10 = i12;
            r13 = r22;
            c10 = 0;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        boolean z10 = this.f18809c;
        a[] aVarArr = this.f18808b;
        if (z10) {
            a aVar = aVarArr[0];
            double d3 = aVar.f18813c;
            if (d2 < d3) {
                double d7 = d2 - d3;
                if (aVar.f18827r) {
                    double dC = aVar.c(d3);
                    a aVar2 = aVarArr[0];
                    dArr[0] = (aVar2.f18822l * d7) + dC;
                    dArr[1] = (d7 * aVarArr[0].m) + aVar2.d(d3);
                    return;
                }
                aVar.g(d3);
                dArr[0] = (aVarArr[0].a() * d7) + aVarArr[0].e();
                dArr[1] = (aVarArr[0].b() * d7) + aVarArr[0].f();
                return;
            }
            if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
                double d10 = aVarArr[aVarArr.length - 1].f18814d;
                double d11 = d2 - d10;
                int length = aVarArr.length - 1;
                a aVar3 = aVarArr[length];
                if (aVar3.f18827r) {
                    double dC2 = aVar3.c(d10);
                    a aVar4 = aVarArr[length];
                    dArr[0] = (aVar4.f18822l * d11) + dC2;
                    dArr[1] = (d11 * aVarArr[length].m) + aVar4.d(d10);
                    return;
                }
                aVar3.g(d2);
                dArr[0] = (aVarArr[length].a() * d11) + aVarArr[length].e();
                dArr[1] = (aVarArr[length].b() * d11) + aVarArr[length].f();
                return;
            }
        } else {
            double d12 = aVarArr[0].f18813c;
            if (d2 < d12) {
                d2 = d12;
            }
            if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
                d2 = aVarArr[aVarArr.length - 1].f18814d;
            }
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar5 = aVarArr[i10];
            if (d2 <= aVar5.f18814d) {
                if (aVar5.f18827r) {
                    dArr[0] = aVar5.c(d2);
                    dArr[1] = aVarArr[i10].d(d2);
                    return;
                } else {
                    aVar5.g(d2);
                    dArr[0] = aVarArr[i10].e();
                    dArr[1] = aVarArr[i10].f();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d2, double[] dArr) {
        a[] aVarArr = this.f18808b;
        double d3 = aVarArr[0].f18813c;
        if (d2 < d3) {
            d2 = d3;
        } else if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
            d2 = aVarArr[aVarArr.length - 1].f18814d;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            if (d2 <= aVar.f18814d) {
                if (aVar.f18827r) {
                    dArr[0] = aVar.f18822l;
                    dArr[1] = aVar.m;
                    return;
                } else {
                    aVar.g(d2);
                    dArr[0] = aVarArr[i10].a();
                    dArr[1] = aVarArr[i10].b();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f18807a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d2, int i10) {
        a[] aVarArr = this.f18808b;
        double d3 = aVarArr[0].f18813c;
        if (d2 < d3) {
            d2 = d3;
        }
        if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
            d2 = aVarArr[aVarArr.length - 1].f18814d;
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            if (d2 <= aVar.f18814d) {
                if (aVar.f18827r) {
                    if (i10 == 0) {
                        return aVar.f18822l;
                    }
                    return aVar.m;
                }
                aVar.g(d2);
                if (i10 == 0) {
                    return aVarArr[i11].a();
                }
                return aVarArr[i11].b();
            }
        }
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        boolean z10 = this.f18809c;
        a[] aVarArr = this.f18808b;
        if (z10) {
            a aVar = aVarArr[0];
            double d3 = aVar.f18813c;
            if (d2 < d3) {
                double d7 = d2 - d3;
                if (aVar.f18827r) {
                    double dC = aVar.c(d3);
                    a aVar2 = aVarArr[0];
                    fArr[0] = (float) ((aVar2.f18822l * d7) + dC);
                    fArr[1] = (float) ((d7 * aVarArr[0].m) + aVar2.d(d3));
                    return;
                }
                aVar.g(d3);
                fArr[0] = (float) ((aVarArr[0].a() * d7) + aVarArr[0].e());
                fArr[1] = (float) ((aVarArr[0].b() * d7) + aVarArr[0].f());
                return;
            }
            if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
                double d10 = aVarArr[aVarArr.length - 1].f18814d;
                double d11 = d2 - d10;
                int length = aVarArr.length - 1;
                a aVar3 = aVarArr[length];
                if (aVar3.f18827r) {
                    double dC2 = aVar3.c(d10);
                    a aVar4 = aVarArr[length];
                    fArr[0] = (float) ((aVar4.f18822l * d11) + dC2);
                    fArr[1] = (float) ((d11 * aVarArr[length].m) + aVar4.d(d10));
                    return;
                }
                aVar3.g(d2);
                fArr[0] = (float) aVarArr[length].e();
                fArr[1] = (float) aVarArr[length].f();
                return;
            }
        } else {
            double d12 = aVarArr[0].f18813c;
            if (d2 < d12) {
                d2 = d12;
            } else if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
                d2 = aVarArr[aVarArr.length - 1].f18814d;
            }
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar5 = aVarArr[i10];
            if (d2 <= aVar5.f18814d) {
                if (aVar5.f18827r) {
                    fArr[0] = (float) aVar5.c(d2);
                    fArr[1] = (float) aVarArr[i10].d(d2);
                    return;
                } else {
                    aVar5.g(d2);
                    fArr[0] = (float) aVarArr[i10].e();
                    fArr[1] = (float) aVarArr[i10].f();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d2, int i10) {
        double dF;
        double dB;
        boolean z10 = this.f18809c;
        a[] aVarArr = this.f18808b;
        if (z10) {
            a aVar = aVarArr[0];
            double d3 = aVar.f18813c;
            if (d2 < d3) {
                double d7 = d2 - d3;
                if (aVar.f18827r) {
                    if (i10 == 0) {
                        return (d7 * aVarArr[0].f18822l) + aVar.c(d3);
                    }
                    return (d7 * aVarArr[0].m) + aVar.d(d3);
                }
                aVar.g(d3);
                if (i10 == 0) {
                    dF = aVarArr[0].e();
                    dB = aVarArr[0].a();
                } else {
                    dF = aVarArr[0].f();
                    dB = aVarArr[0].b();
                }
                return (dB * d7) + dF;
            }
            if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
                double d10 = aVarArr[aVarArr.length - 1].f18814d;
                double d11 = d2 - d10;
                int length = aVarArr.length - 1;
                if (i10 == 0) {
                    return (d11 * aVarArr[length].f18822l) + aVarArr[length].c(d10);
                }
                return (d11 * aVarArr[length].m) + aVarArr[length].d(d10);
            }
        } else {
            double d12 = aVarArr[0].f18813c;
            if (d2 < d12) {
                d2 = d12;
            } else if (d2 > aVarArr[aVarArr.length - 1].f18814d) {
                d2 = aVarArr[aVarArr.length - 1].f18814d;
            }
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar2 = aVarArr[i11];
            if (d2 <= aVar2.f18814d) {
                if (aVar2.f18827r) {
                    if (i10 == 0) {
                        return aVar2.c(d2);
                    }
                    return aVar2.d(d2);
                }
                aVar2.g(d2);
                if (i10 == 0) {
                    return aVarArr[i11].e();
                }
                return aVarArr[i11].f();
            }
        }
        return Double.NaN;
    }
}
