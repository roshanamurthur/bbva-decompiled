package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f44383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f44384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f44385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f44386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[] f44387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f44388f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44389a;

        static {
            int[] iArr = new int[c.values().length];
            f44389a = iArr;
            try {
                iArr[c.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44389a[c.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44389a[c.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44396g;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c BLUE;
        public static final c GREEN;
        public static final c RED;

        static {
            c cVar = new c("RED", 0);
            RED = cVar;
            c cVar2 = new c("GREEN", 1);
            GREEN = cVar2;
            c cVar3 = new c(InfoScreenComponent.STYLE_BLUE, 2);
            BLUE = cVar3;
            $VALUES = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f44398b;
    }

    public static int a(b bVar, c cVar, int[] iArr) {
        int i10;
        int i11;
        int i12 = a.f44389a[cVar.ordinal()];
        if (i12 == 1) {
            i10 = (-iArr[b(bVar.f44390a, bVar.f44393d, bVar.f44395f)]) + iArr[b(bVar.f44390a, bVar.f44393d, bVar.f44394e)] + iArr[b(bVar.f44390a, bVar.f44392c, bVar.f44395f)];
            i11 = iArr[b(bVar.f44390a, bVar.f44392c, bVar.f44394e)];
        } else if (i12 == 2) {
            i10 = (-iArr[b(bVar.f44391b, bVar.f44392c, bVar.f44395f)]) + iArr[b(bVar.f44391b, bVar.f44392c, bVar.f44394e)] + iArr[b(bVar.f44390a, bVar.f44392c, bVar.f44395f)];
            i11 = iArr[b(bVar.f44390a, bVar.f44392c, bVar.f44394e)];
        } else {
            if (i12 != 3) {
                throw new IllegalArgumentException("unexpected direction " + cVar);
            }
            i10 = (-iArr[b(bVar.f44391b, bVar.f44393d, bVar.f44394e)]) + iArr[b(bVar.f44391b, bVar.f44392c, bVar.f44394e)] + iArr[b(bVar.f44390a, bVar.f44393d, bVar.f44394e)];
            i11 = iArr[b(bVar.f44390a, bVar.f44392c, bVar.f44394e)];
        }
        return i10 - i11;
    }

    public static int b(int i10, int i11, int i12) {
        return androidx.appcompat.widget.c.a((i10 << 10) + (i10 << 6) + i10, i11 << 5, i11, i12);
    }

    public static int d(b bVar, c cVar, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13 = a.f44389a[cVar.ordinal()];
        if (i13 == 1) {
            i11 = (iArr[b(i10, bVar.f44393d, bVar.f44395f)] - iArr[b(i10, bVar.f44393d, bVar.f44394e)]) - iArr[b(i10, bVar.f44392c, bVar.f44395f)];
            i12 = iArr[b(i10, bVar.f44392c, bVar.f44394e)];
        } else if (i13 == 2) {
            i11 = (iArr[b(bVar.f44391b, i10, bVar.f44395f)] - iArr[b(bVar.f44391b, i10, bVar.f44394e)]) - iArr[b(bVar.f44390a, i10, bVar.f44395f)];
            i12 = iArr[b(bVar.f44390a, i10, bVar.f44394e)];
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException("unexpected direction " + cVar);
            }
            i11 = (iArr[b(bVar.f44391b, bVar.f44393d, i10)] - iArr[b(bVar.f44391b, bVar.f44392c, i10)]) - iArr[b(bVar.f44390a, bVar.f44393d, i10)];
            i12 = iArr[b(bVar.f44390a, bVar.f44392c, i10)];
        }
        return i11 + i12;
    }

    public static int f(b bVar, int[] iArr) {
        return ((((((iArr[b(bVar.f44391b, bVar.f44393d, bVar.f44395f)] - iArr[b(bVar.f44391b, bVar.f44393d, bVar.f44394e)]) - iArr[b(bVar.f44391b, bVar.f44392c, bVar.f44395f)]) + iArr[b(bVar.f44391b, bVar.f44392c, bVar.f44394e)]) - iArr[b(bVar.f44390a, bVar.f44393d, bVar.f44395f)]) + iArr[b(bVar.f44390a, bVar.f44393d, bVar.f44394e)]) + iArr[b(bVar.f44390a, bVar.f44392c, bVar.f44395f)]) - iArr[b(bVar.f44390a, bVar.f44392c, bVar.f44394e)];
    }

    public final d c(b bVar, c cVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        QuantizerWu quantizerWu = this;
        b bVar2 = bVar;
        c cVar2 = cVar;
        int iA = a(bVar2, cVar2, quantizerWu.f44384b);
        int iA2 = a(bVar2, cVar2, quantizerWu.f44385c);
        int iA3 = a(bVar2, cVar2, quantizerWu.f44386d);
        int iA4 = a(bVar2, cVar2, quantizerWu.f44383a);
        int i17 = -1;
        double d2 = 0.0d;
        int i18 = i10;
        while (i18 < i11) {
            int iD = d(bVar2, cVar2, i18, quantizerWu.f44384b) + iA;
            int iD2 = d(bVar2, cVar2, i18, quantizerWu.f44385c) + iA2;
            int iD3 = d(bVar2, cVar2, i18, quantizerWu.f44386d) + iA3;
            int iD4 = d(bVar2, cVar2, i18, quantizerWu.f44383a) + iA4;
            if (iD4 == 0) {
                i16 = iA;
            } else {
                i16 = iA;
                double d3 = ((double) ((iD3 * iD3) + ((iD2 * iD2) + (iD * iD)))) / ((double) iD4);
                int i19 = i12 - iD;
                int i20 = i13 - iD2;
                int i21 = i14 - iD3;
                int i22 = i15 - iD4;
                if (i22 != 0) {
                    double d7 = (((double) ((i21 * i21) + ((i20 * i20) + (i19 * i19)))) / ((double) i22)) + d3;
                    if (d7 > d2) {
                        d2 = d7;
                        i17 = i18;
                    }
                }
            }
            i18++;
            quantizerWu = this;
            bVar2 = bVar;
            cVar2 = cVar;
            iA = i16;
        }
        d dVar = new d();
        dVar.f44397a = i17;
        dVar.f44398b = d2;
        return dVar;
    }

    public final double e(b bVar) {
        int iF = f(bVar, this.f44384b);
        int iF2 = f(bVar, this.f44385c);
        int iF3 = f(bVar, this.f44386d);
        int i10 = iF3 * iF3;
        return (((((((this.f44387e[b(bVar.f44391b, bVar.f44393d, bVar.f44395f)] - this.f44387e[b(bVar.f44391b, bVar.f44393d, bVar.f44394e)]) - this.f44387e[b(bVar.f44391b, bVar.f44392c, bVar.f44395f)]) + this.f44387e[b(bVar.f44391b, bVar.f44392c, bVar.f44394e)]) - this.f44387e[b(bVar.f44390a, bVar.f44393d, bVar.f44395f)]) + this.f44387e[b(bVar.f44390a, bVar.f44393d, bVar.f44394e)]) + this.f44387e[b(bVar.f44390a, bVar.f44392c, bVar.f44395f)]) - this.f44387e[b(bVar.f44390a, bVar.f44392c, bVar.f44394e)]) - (((double) (i10 + ((iF2 * iF2) + (iF * iF)))) / ((double) f(bVar, this.f44383a)));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0270  */
    /* JADX WARN: Code duplicated, block: B:48:0x0279  */
    /* JADX WARN: Code duplicated, block: B:49:0x027e  */
    /* JADX WARN: Code duplicated, block: B:52:0x028a  */
    /* JADX WARN: Code duplicated, block: B:53:0x028f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0297  */
    /* JADX WARN: Code duplicated, block: B:59:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x02ba A[LOOP:5: B:20:0x0170->B:66:0x02ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x02ad A[SYNTHETIC] */
    public QuantizerResult quantize(int[] iArr, int i10) {
        int i11;
        Boolean bool;
        int i12;
        double d2;
        int i13;
        double d3;
        b bVar;
        double dE;
        b bVar2;
        double dE2;
        int i14 = i10;
        Map<Integer, Integer> map = new QuantizerMap().quantize(iArr, i14).colorToCount;
        this.f44383a = new int[35937];
        this.f44384b = new int[35937];
        this.f44385c = new int[35937];
        this.f44386d = new int[35937];
        this.f44387e = new double[35937];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int iB = b((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr2 = this.f44383a;
            iArr2[iB] = iArr2[iB] + iIntValue2;
            int[] iArr3 = this.f44384b;
            iArr3[iB] = (iRedFromArgb * iIntValue2) + iArr3[iB];
            int[] iArr4 = this.f44385c;
            iArr4[iB] = (iGreenFromArgb * iIntValue2) + iArr4[iB];
            int[] iArr5 = this.f44386d;
            iArr5[iB] = (iBlueFromArgb * iIntValue2) + iArr5[iB];
            double[] dArr = this.f44387e;
            dArr[iB] = dArr[iB] + ((double) (((iBlueFromArgb * iBlueFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iRedFromArgb * iRedFromArgb)) * iIntValue2));
        }
        int i15 = 1;
        while (true) {
            int i16 = 33;
            if (i15 >= 33) {
                break;
            }
            int[] iArr6 = new int[33];
            int[] iArr7 = new int[33];
            int[] iArr8 = new int[33];
            int[] iArr9 = new int[33];
            double[] dArr2 = new double[33];
            int i17 = 1;
            while (i17 < i16) {
                int i18 = 1;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                double d7 = 0.0d;
                while (i18 < i16) {
                    int iB2 = b(i15, i17, i18);
                    i19 += this.f44383a[iB2];
                    i20 += this.f44384b[iB2];
                    i21 += this.f44385c[iB2];
                    i22 += this.f44386d[iB2];
                    d7 += this.f44387e[iB2];
                    iArr6[i18] = iArr6[i18] + i19;
                    iArr7[i18] = iArr7[i18] + i20;
                    iArr8[i18] = iArr8[i18] + i21;
                    iArr9[i18] = iArr9[i18] + i22;
                    dArr2[i18] = dArr2[i18] + d7;
                    int iB3 = b(i15 - 1, i17, i18);
                    int[] iArr10 = this.f44383a;
                    iArr10[iB2] = iArr10[iB3] + iArr6[i18];
                    int[] iArr11 = this.f44384b;
                    iArr11[iB2] = iArr11[iB3] + iArr7[i18];
                    int[] iArr12 = this.f44385c;
                    iArr12[iB2] = iArr12[iB3] + iArr8[i18];
                    int[] iArr13 = this.f44386d;
                    iArr13[iB2] = iArr13[iB3] + iArr9[i18];
                    double[] dArr3 = this.f44387e;
                    dArr3[iB2] = dArr3[iB3] + dArr2[i18];
                    i18++;
                    i16 = 33;
                }
                i17++;
                i16 = 33;
            }
            i15++;
        }
        this.f44388f = new b[i14];
        for (int i23 = 0; i23 < i14; i23++) {
            b[] bVarArr = this.f44388f;
            b bVar3 = new b();
            bVar3.f44390a = 0;
            bVar3.f44391b = 0;
            bVar3.f44392c = 0;
            bVar3.f44393d = 0;
            bVar3.f44394e = 0;
            bVar3.f44395f = 0;
            bVar3.f44396g = 0;
            bVarArr[i23] = bVar3;
        }
        double[] dArr4 = new double[i14];
        b bVar4 = this.f44388f[0];
        bVar4.f44391b = 32;
        bVar4.f44393d = 32;
        bVar4.f44395f = 32;
        int i24 = 1;
        int i25 = 0;
        while (true) {
            if (i24 >= i14) {
                i11 = i10;
                break;
            }
            b[] bVarArr2 = this.f44388f;
            b bVar5 = bVarArr2[i25];
            b bVar6 = bVarArr2[i24];
            int iF = f(bVar5, this.f44384b);
            int iF2 = f(bVar5, this.f44385c);
            int iF3 = f(bVar5, this.f44386d);
            int iF4 = f(bVar5, this.f44383a);
            c cVar = c.RED;
            d dVarC = c(bVar5, cVar, bVar5.f44390a + 1, bVar5.f44391b, iF, iF2, iF3, iF4);
            c cVar2 = c.GREEN;
            d dVarC2 = c(bVar5, cVar2, bVar5.f44392c + 1, bVar5.f44393d, iF, iF2, iF3, iF4);
            c cVar3 = c.BLUE;
            int i26 = i24;
            d dVarC3 = c(bVar5, cVar3, bVar5.f44394e + 1, bVar5.f44395f, iF, iF2, iF3, iF4);
            double d10 = dVarC.f44398b;
            double d11 = dVarC2.f44398b;
            int i27 = dVarC.f44397a;
            double d12 = dVarC3.f44398b;
            if (d10 < d11 || d10 < d12) {
                cVar = (d11 < d10 || d11 < d12) ? cVar3 : cVar2;
            } else {
                if (i27 < 0) {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    bVar = this.f44388f[i25];
                    if (bVar.f44396g > 1) {
                        dE = e(bVar);
                    } else {
                        dE = 0.0d;
                    }
                    dArr4[i25] = dE;
                    bVar2 = this.f44388f[i26];
                    if (bVar2.f44396g > 1) {
                        dE2 = e(bVar2);
                    } else {
                        dE2 = 0.0d;
                    }
                    dArr4[i26] = dE2;
                    i12 = i26;
                } else {
                    dArr4[i25] = 0.0d;
                    i12 = i26 - 1;
                }
                d2 = dArr4[0];
                i25 = 0;
                for (i13 = 1; i13 <= i12; i13++) {
                    d3 = dArr4[i13];
                    if (d3 > d2) {
                        i25 = i13;
                        d2 = d3;
                    }
                }
                if (d2 <= 0.0d) {
                    i11 = i12 + 1;
                    break;
                }
                i24 = i12 + 1;
                i14 = i10;
            }
            bVar6.f44391b = bVar5.f44391b;
            bVar6.f44393d = bVar5.f44393d;
            bVar6.f44395f = bVar5.f44395f;
            int i28 = a.f44389a[cVar.ordinal()];
            if (i28 == 1) {
                bVar5.f44391b = i27;
                bVar6.f44390a = i27;
                bVar6.f44392c = bVar5.f44392c;
                bVar6.f44394e = bVar5.f44394e;
            } else if (i28 == 2) {
                int i29 = dVarC2.f44397a;
                bVar5.f44393d = i29;
                bVar6.f44390a = bVar5.f44390a;
                bVar6.f44392c = i29;
                bVar6.f44394e = bVar5.f44394e;
            } else if (i28 == 3) {
                int i30 = dVarC3.f44397a;
                bVar5.f44395f = i30;
                bVar6.f44390a = bVar5.f44390a;
                bVar6.f44392c = bVar5.f44392c;
                bVar6.f44394e = i30;
            }
            bVar5.f44396g = (bVar5.f44395f - bVar5.f44394e) * (bVar5.f44393d - bVar5.f44392c) * (bVar5.f44391b - bVar5.f44390a);
            bVar6.f44396g = (bVar6.f44395f - bVar6.f44394e) * (bVar6.f44393d - bVar6.f44392c) * (bVar6.f44391b - bVar6.f44390a);
            bool = Boolean.TRUE;
            if (bool.booleanValue()) {
                bVar = this.f44388f[i25];
                if (bVar.f44396g > 1) {
                    dE = e(bVar);
                } else {
                    dE = 0.0d;
                }
                dArr4[i25] = dE;
                bVar2 = this.f44388f[i26];
                if (bVar2.f44396g > 1) {
                    dE2 = e(bVar2);
                } else {
                    dE2 = 0.0d;
                }
                dArr4[i26] = dE2;
                i12 = i26;
            } else {
                dArr4[i25] = 0.0d;
                i12 = i26 - 1;
            }
            d2 = dArr4[0];
            i25 = 0;
            while (i13 <= i12) {
                d3 = dArr4[i13];
                if (d3 > d2) {
                    i25 = i13;
                    d2 = d3;
                }
            }
            if (d2 <= 0.0d) {
                i11 = i12 + 1;
                break;
            }
            i24 = i12 + 1;
            i14 = i10;
        }
        ArrayList arrayList = new ArrayList();
        for (int i31 = 0; i31 < i11; i31++) {
            b bVar7 = this.f44388f[i31];
            int iF5 = f(bVar7, this.f44383a);
            if (iF5 > 0) {
                arrayList.add(Integer.valueOf(((f(bVar7, this.f44386d) / iF5) & 255) | (((f(bVar7, this.f44384b) / iF5) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | (((f(bVar7, this.f44385c) / iF5) & 255) << 8)));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(((Integer) it.next()).intValue()), 0);
        }
        return new QuantizerResult(linkedHashMap);
    }
}
