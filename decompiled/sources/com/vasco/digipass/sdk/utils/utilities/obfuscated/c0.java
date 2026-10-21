package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes9.dex */
public interface c0 {
    int a();

    byte[] a(byte[] bArr, int i10, int i11) throws InvalidCipherTextException;

    int b();

    void init(boolean z10, CipherParameters cipherParameters);
}
