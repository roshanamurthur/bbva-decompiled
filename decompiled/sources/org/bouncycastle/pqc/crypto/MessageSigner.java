package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes13.dex */
public interface MessageSigner {
    byte[] generateSignature(byte[] bArr);

    void init(boolean z10, CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, byte[] bArr2);
}
