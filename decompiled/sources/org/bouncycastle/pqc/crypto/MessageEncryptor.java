package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes13.dex */
public interface MessageEncryptor {
    void init(boolean z10, CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException;

    byte[] messageEncrypt(byte[] bArr);
}
