package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f90991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f90992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f90993d;

    public GMSSParameters(int i10) throws IllegalArgumentException {
        if (i10 <= 10) {
            a(1, new int[]{10}, new int[]{3}, new int[]{2});
        } else if (i10 <= 20) {
            a(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2});
        } else {
            a(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2});
        }
    }

    public final void a(int i10, int[] iArr, int[] iArr2, int[] iArr3) throws IllegalArgumentException {
        String str;
        boolean z10;
        this.f90990a = i10;
        if (i10 == iArr2.length && i10 == iArr.length && i10 == iArr3.length) {
            z10 = true;
            str = "";
        } else {
            str = "Unexpected parameterset format";
            z10 = false;
        }
        for (int i11 = 0; i11 < this.f90990a; i11++) {
            int i12 = iArr3[i11];
            if (i12 < 2 || (iArr[i11] - i12) % 2 != 0) {
                str = "Wrong parameter K (K >= 2 and H-K even required)!";
                z10 = false;
            }
            if (iArr[i11] < 4 || iArr2[i11] < 2) {
                str = "Wrong parameter H or w (H > 3 and w > 1 required)!";
                z10 = false;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
        this.f90991b = Arrays.clone(iArr);
        this.f90992c = Arrays.clone(iArr2);
        this.f90993d = Arrays.clone(iArr3);
    }

    public int[] getHeightOfTrees() {
        return Arrays.clone(this.f90991b);
    }

    public int[] getK() {
        return Arrays.clone(this.f90993d);
    }

    public int getNumOfLayers() {
        return this.f90990a;
    }

    public int[] getWinternitzParameter() {
        return Arrays.clone(this.f90992c);
    }

    public GMSSParameters(int i10, int[] iArr, int[] iArr2, int[] iArr3) throws IllegalArgumentException {
        a(i10, iArr, iArr2, iArr3);
    }
}
