package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f91238p0;

    public RainbowParameters() {
        this.f91238p0 = new int[]{6, 12, 17, 22, 33};
    }

    public int getDocLength() {
        int[] iArr = this.f91238p0;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f91238p0.length - 1;
    }

    public int[] getVi() {
        return this.f91238p0;
    }

    public RainbowParameters(int[] iArr) {
        this.f91238p0 = iArr;
        if (iArr == null) {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (iArr.length <= 1) {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i10 = 0;
        while (i10 < iArr.length - 1) {
            int i11 = iArr[i10];
            i10++;
            if (i11 >= iArr[i10]) {
                throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
            }
        }
    }
}
