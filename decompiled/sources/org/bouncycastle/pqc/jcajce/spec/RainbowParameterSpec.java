package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f91557b = {6, 12, 17, 22, 33};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f91558a;

    public RainbowParameterSpec() {
        this.f91558a = f91557b;
    }

    public int getDocumentLength() {
        int[] iArr = this.f91558a;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f91558a.length - 1;
    }

    public int[] getVi() {
        return Arrays.clone(this.f91558a);
    }

    public RainbowParameterSpec(int[] iArr) {
        this.f91558a = iArr;
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
