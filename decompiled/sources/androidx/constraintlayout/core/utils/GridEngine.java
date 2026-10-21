package androidx.constraintlayout.core.utils;

import c2.b;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridEngine {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19123i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean[][] f19124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[][] f19125k;

    public GridEngine() {
    }

    public static int[][] f(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public final void a(boolean z10) {
        int[][] iArrF;
        int[][] iArrF2;
        if (z10) {
            for (int i10 = 0; i10 < this.f19124j.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f19124j;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            for (int i12 = 0; i12 < this.f19125k.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr = this.f19125k;
                    if (i13 < iArr[0].length) {
                        iArr[i12][i13] = -1;
                        i13++;
                    }
                }
            }
        }
        this.f19123i = 0;
        String str = this.f19121g;
        if (str != null && !str.trim().isEmpty() && (iArrF2 = f(this.f19121g)) != null) {
            for (int i14 = 0; i14 < iArrF2.length; i14++) {
                int iC = c(iArrF2[i14][0]);
                int iB = b(iArrF2[i14][0]);
                int[] iArr2 = iArrF2[i14];
                if (!e(iC, iB, iArr2[1], iArr2[2])) {
                    break;
                }
            }
        }
        String str2 = this.f19120f;
        if (str2 != null && !str2.trim().isEmpty() && (iArrF = f(this.f19120f)) != null) {
            for (int i15 = 0; i15 < iArrF.length; i15++) {
                int iC2 = c(iArrF[i15][0]);
                int iB2 = b(iArrF[i15][0]);
                int[] iArr3 = iArrF[i15];
                if (!e(iC2, iB2, iArr3[1], iArr3[2])) {
                    break;
                }
                int[] iArr4 = iArrF[i15];
                int i16 = iArr4[1];
                int i17 = iArr4[2];
                int[] iArr5 = this.f19125k[i15];
                iArr5[0] = iB2;
                iArr5[1] = iC2;
                iArr5[2] = (iB2 + i17) - 1;
                iArr5[3] = (iC2 + i16) - 1;
            }
        }
        for (int i18 = 0; i18 < this.f19117c; i18++) {
            if (leftOfWidget(i18) == -1) {
                boolean z11 = false;
                int i19 = 0;
                while (!z11) {
                    i19 = this.f19123i;
                    if (i19 >= this.f19115a * this.f19118d) {
                        i19 = -1;
                        break;
                    }
                    int iC3 = c(i19);
                    int iB3 = b(this.f19123i);
                    boolean[] zArr2 = this.f19124j[iC3];
                    if (zArr2[iB3]) {
                        zArr2[iB3] = false;
                        z11 = true;
                    }
                    this.f19123i++;
                }
                int iC4 = c(i19);
                int iB4 = b(i19);
                if (i19 == -1) {
                    return;
                }
                int[] iArr6 = this.f19125k[i18];
                iArr6[0] = iB4;
                iArr6[1] = iC4;
                iArr6[2] = iB4;
                iArr6[3] = iC4;
            }
        }
    }

    public final int b(int i10) {
        return this.f19122h == 1 ? i10 / this.f19115a : i10 % this.f19118d;
    }

    public int bottomOfWidget(int i10) {
        int[][] iArr = this.f19125k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][3];
    }

    public final int c(int i10) {
        return this.f19122h == 1 ? i10 % this.f19115a : i10 / this.f19118d;
    }

    public final void d() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f19115a, this.f19118d);
        this.f19124j = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f19117c;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f19125k = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean e(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f19124j;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void g() {
        int i10;
        int i11 = this.f19116b;
        if (i11 != 0 && (i10 = this.f19119e) != 0) {
            this.f19115a = i11;
            this.f19118d = i10;
            return;
        }
        int i12 = this.f19119e;
        if (i12 > 0) {
            this.f19118d = i12;
            this.f19115a = b.a(this.f19117c, i12, 1, i12);
        } else if (i11 > 0) {
            this.f19115a = i11;
            this.f19118d = b.a(this.f19117c, i11, 1, i11);
        } else {
            int iSqrt = (int) (Math.sqrt(this.f19117c) + 1.5d);
            this.f19115a = iSqrt;
            this.f19118d = b.a(this.f19117c, iSqrt, 1, iSqrt);
        }
    }

    public int leftOfWidget(int i10) {
        int[][] iArr = this.f19125k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][0];
    }

    public int rightOfWidget(int i10) {
        int[][] iArr = this.f19125k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][2];
    }

    public void setColumns(int i10) {
        if (i10 <= 50 && this.f19119e != i10) {
            this.f19119e = i10;
            g();
        }
    }

    public void setNumWidgets(int i10) {
        if (i10 > this.f19115a * this.f19118d) {
            return;
        }
        this.f19117c = i10;
    }

    public void setOrientation(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f19122h != i10) {
            this.f19122h = i10;
        }
    }

    public void setRows(int i10) {
        if (i10 <= 50 && this.f19116b != i10) {
            this.f19116b = i10;
            g();
        }
    }

    public void setSkips(String str) {
        String str2 = this.f19121g;
        if (str2 == null || !str2.equals(str)) {
            this.f19121g = str;
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.f19120f;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f19120f = charSequence.toString();
        }
    }

    public void setup() {
        boolean[][] zArr;
        int[][] iArr = this.f19125k;
        boolean z10 = false;
        if (iArr != null && iArr.length == this.f19117c && (zArr = this.f19124j) != null && zArr.length == this.f19115a && zArr[0].length == this.f19118d) {
            z10 = true;
        }
        if (!z10) {
            d();
        }
        a(z10);
    }

    public int topOfWidget(int i10) {
        int[][] iArr = this.f19125k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][1];
    }

    public GridEngine(int i10, int i11) {
        this.f19116b = i10;
        this.f19119e = i11;
        if (i10 > 50) {
            this.f19116b = 3;
        }
        if (i11 > 50) {
            this.f19119e = 3;
        }
        g();
        d();
    }

    public GridEngine(int i10, int i11, int i12) {
        this.f19116b = i10;
        this.f19119e = i11;
        this.f19117c = i12;
        if (i10 > 50) {
            this.f19116b = 3;
        }
        if (i11 > 50) {
            this.f19119e = 3;
        }
        g();
        int i13 = this.f19115a;
        int i14 = this.f19118d;
        if (i12 > i13 * i14 || i12 < 1) {
            this.f19117c = i13 * i14;
        }
        d();
        a(false);
    }
}
