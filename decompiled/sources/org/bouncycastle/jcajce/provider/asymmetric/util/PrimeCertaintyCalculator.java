package org.bouncycastle.jcajce.provider.asymmetric.util;

/* JADX INFO: loaded from: classes8.dex */
public class PrimeCertaintyCalculator {
    public static int getDefaultCertainty(int i10) {
        if (i10 <= 1024) {
            return 80;
        }
        return (((i10 - 1) / 1024) * 16) + 96;
    }
}
