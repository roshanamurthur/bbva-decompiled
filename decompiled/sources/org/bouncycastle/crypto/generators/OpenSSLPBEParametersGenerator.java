package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* JADX INFO: loaded from: classes4.dex */
public class OpenSSLPBEParametersGenerator extends PBEParametersGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88778a = DigestFactory.createMD5();

    public final byte[] a(int i10) {
        Digest digest = this.f88778a;
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.password;
            digest.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = this.salt;
            digest.update(bArr4, 0, bArr4.length);
            digest.doFinal(bArr, 0);
            int i12 = i10 > digestSize ? digestSize : i10;
            System.arraycopy(bArr, 0, bArr2, i11, i12);
            i11 += i12;
            i10 -= i12;
            if (i10 == 0) {
                return bArr2;
            }
            digest.reset();
            digest.update(bArr, 0, digestSize);
        }
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i10) {
        return generateDerivedParameters(i10);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        return new KeyParameter(a(i11), 0, i11);
    }

    public void init(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] bArrA = a(i12 + i13);
        return new ParametersWithIV(new KeyParameter(bArrA, 0, i12), bArrA, i12, i13);
    }
}
