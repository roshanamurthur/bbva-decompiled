package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes5.dex */
public class EntropyUtil {
    public static byte[] generateSeed(EntropySource entropySource, int i10) {
        byte[] bArr = new byte[i10];
        if (i10 * 8 <= entropySource.entropySize()) {
            System.arraycopy(entropySource.getEntropy(), 0, bArr, 0, i10);
        } else {
            int iEntropySize = entropySource.entropySize() / 8;
            for (int i11 = 0; i11 < i10; i11 += iEntropySize) {
                byte[] entropy = entropySource.getEntropy();
                int i12 = i10 - i11;
                if (entropy.length <= i12) {
                    System.arraycopy(entropy, 0, bArr, i11, entropy.length);
                } else {
                    System.arraycopy(entropy, 0, bArr, i11, i12);
                }
            }
        }
        return bArr;
    }
}
