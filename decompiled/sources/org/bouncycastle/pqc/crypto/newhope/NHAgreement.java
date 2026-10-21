package org.bouncycastle.pqc.crypto.newhope;

import a4.c;
import org.bouncycastle.crypto.CipherParameters;
import te.d;

/* JADX INFO: loaded from: classes13.dex */
public class NHAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NHPrivateKeyParameters f91193a;

    public byte[] calculateAgreement(CipherParameters cipherParameters) {
        byte[] bArr = new byte[32];
        short[] sArr = this.f91193a.f91198q0;
        byte[] bArr2 = ((NHPublicKeyParameters) cipherParameters).f91199q0;
        short[] sArr2 = new short[1024];
        short[] sArr3 = new short[1024];
        d.c(bArr2, sArr2);
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 4;
            byte b10 = bArr2[i10 + 1792];
            int i12 = b10 & 255;
            sArr3[i11] = (short) (b10 & 3);
            sArr3[i11 + 1] = (short) ((i12 >>> 2) & 3);
            sArr3[i11 + 2] = (short) ((i12 >>> 4) & 3);
            sArr3[i11 + 3] = (short) (i12 >>> 6);
        }
        short[] sArr4 = new short[1024];
        d.g(sArr, sArr2, sArr4);
        d.d(sArr4);
        c.c(bArr, sArr4, sArr3);
        androidx.collection.b.c(bArr);
        return bArr;
    }

    public void init(CipherParameters cipherParameters) {
        this.f91193a = (NHPrivateKeyParameters) cipherParameters;
    }
}
