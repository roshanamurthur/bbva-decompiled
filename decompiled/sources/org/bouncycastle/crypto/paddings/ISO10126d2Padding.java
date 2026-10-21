package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes5.dex */
public class ISO10126d2Padding implements BlockCipherPadding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f89180a;

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i10) {
        byte length = (byte) (bArr.length - i10);
        while (i10 < bArr.length - 1) {
            bArr[i10] = (byte) this.f89180a.nextInt();
            i10++;
        }
        bArr[i10] = length;
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO10126-2";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
        if (secureRandom == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f89180a = secureRandom;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i10 = bArr[bArr.length - 1] & 255;
        if (i10 <= bArr.length) {
            return i10;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
