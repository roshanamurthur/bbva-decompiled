package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public interface Digest {
    int doFinal(byte[] bArr, int i10);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b10);

    void update(byte[] bArr, int i10, int i11);
}
