package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.InvalidCipherTextException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public interface p0 {
    int addPadding(byte[] bArr, int i10);

    void init(SecureRandom secureRandom) throws IllegalArgumentException;

    int padCount(byte[] bArr) throws InvalidCipherTextException;
}
