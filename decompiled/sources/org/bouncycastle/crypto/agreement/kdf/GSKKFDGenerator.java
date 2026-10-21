package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class GSKKFDGenerator implements DigestDerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f87955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f87956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f87958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f87959e;

    public GSKKFDGenerator(Digest digest) {
        this.f87955a = digest;
        this.f87959e = new byte[digest.getDigestSize()];
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("output buffer too small");
        }
        byte[] bArr2 = this.f87956b;
        int length = bArr2.length;
        Digest digest = this.f87955a;
        digest.update(bArr2, 0, length);
        int i12 = this.f87957c;
        this.f87957c = i12 + 1;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i12);
        digest.update(bArrIntToBigEndian, 0, bArrIntToBigEndian.length);
        byte[] bArr3 = this.f87958d;
        if (bArr3 != null) {
            digest.update(bArr3, 0, bArr3.length);
        }
        byte[] bArr4 = this.f87959e;
        digest.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr, i10, i11);
        Arrays.clear(bArr4);
        return i11;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.f87955a;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof GSKKDFParameters)) {
            throw new IllegalArgumentException("unkown parameters type");
        }
        GSKKDFParameters gSKKDFParameters = (GSKKDFParameters) derivationParameters;
        this.f87956b = gSKKDFParameters.getZ();
        this.f87957c = gSKKDFParameters.getStartCounter();
        this.f87958d = gSKKDFParameters.getNonce();
    }
}
