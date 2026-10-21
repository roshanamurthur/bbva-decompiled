package org.bouncycastle.crypto.generators;

import c2.b;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* JADX INFO: loaded from: classes4.dex */
public class PKCS5S2ParametersGenerator extends PBEParametersGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HMac f88783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88784b;

    public PKCS5S2ParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    public final byte[] a(int i10) {
        HMac hMac = this.f88783a;
        int macSize = hMac.getMacSize();
        byte b10 = 1;
        int iA = b.a(i10, macSize, 1, macSize);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[iA * macSize];
        hMac.init(new KeyParameter(this.password));
        int i11 = 1;
        int i12 = 0;
        while (i11 <= iA) {
            int i13 = 3;
            while (true) {
                byte b11 = (byte) (bArr[i13] + b10);
                bArr[i13] = b11;
                if (b11 != 0) {
                    break;
                }
                i13--;
            }
            byte[] bArr3 = this.salt;
            int i14 = this.iterationCount;
            if (i14 == 0) {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
            if (bArr3 != null) {
                hMac.update(bArr3, 0, bArr3.length);
            }
            hMac.update(bArr, 0, 4);
            byte[] bArr4 = this.f88784b;
            hMac.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i12, bArr4.length);
            for (int i15 = b10; i15 < i14; i15++) {
                hMac.update(bArr4, 0, bArr4.length);
                hMac.doFinal(bArr4, 0);
                for (int i16 = 0; i16 != bArr4.length; i16++) {
                    int i17 = i12 + i16;
                    bArr2[i17] = (byte) (bArr2[i17] ^ bArr4[i16]);
                }
            }
            i12 += macSize;
            i11++;
            b10 = 1;
        }
        return bArr2;
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

    public PKCS5S2ParametersGenerator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.f88783a = hMac;
        this.f88784b = new byte[hMac.getMacSize()];
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] bArrA = a(i12 + i13);
        return new ParametersWithIV(new KeyParameter(bArrA, 0, i12), bArrA, i12, i13);
    }
}
