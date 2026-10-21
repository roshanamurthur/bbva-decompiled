package org.bouncycastle.crypto.digests;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes2.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest() {
        this(128);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        return doFinal(bArr, i10, getDigestSize());
    }

    public int doOutput(byte[] bArr, int i10, int i11) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i10, ((long) i11) * 8);
        return i11;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHAKEDigest(int i10) {
        super(i10);
        if (i10 != 128 && i10 != 256) {
            throw new IllegalArgumentException(b.a("'bitLength' ", i10, " not supported for SHAKE"));
        }
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i10, byte b10, int i11) {
        return doFinal(bArr, i10, getDigestSize(), b10, i11);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i10, int i11) {
        int iDoOutput = doOutput(bArr, i10, i11);
        reset();
        return iDoOutput;
    }

    public int doFinal(byte[] bArr, int i10, int i11, byte b10, int i12) {
        if (i12 < 0 || i12 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i13 = (b10 & ((1 << i12) - 1)) | (15 << i12);
        int i14 = i12 + 4;
        if (i14 >= 8) {
            absorb(new byte[]{(byte) i13}, 0, 1);
            i14 = i12 - 4;
            i13 >>>= 8;
        }
        if (i14 > 0) {
            absorbBits(i13, i14);
        }
        squeeze(bArr, i10, ((long) i11) * 8);
        reset();
        return i11;
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }
}
