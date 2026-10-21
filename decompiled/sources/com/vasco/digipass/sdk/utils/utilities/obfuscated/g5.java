package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g5 implements BlockCipher, h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockCipher f66059a;

    public g5(BlockCipher blockCipher) {
        this.f66059a = blockCipher;
    }

    public abstract byte a(byte b10);

    public int a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        int i13 = i10 + i11;
        if (i13 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i12 + i11 > bArr2.length) {
            throw new h4("output buffer too short");
        }
        while (i10 < i13) {
            bArr2[i12] = a(bArr[i10]);
            i12++;
            i10++;
        }
        return i11;
    }
}
