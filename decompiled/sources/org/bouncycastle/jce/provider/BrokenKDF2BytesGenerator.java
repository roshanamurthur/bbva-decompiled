package org.bouncycastle.jce.provider;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KDFParameters;

/* JADX INFO: loaded from: classes8.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f90391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f90392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f90393c;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.f90391a = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i11 < i10) {
            throw new OutputLengthException("output buffer too small");
        }
        long j10 = ((long) i11) * 8;
        Digest digest = this.f90391a;
        if (j10 > ((long) digest.getDigestSize()) * SvgConstantsKt.SPECIFIED_VIEWPORT_FILL_OPACITY) {
            throw new IllegalArgumentException("Output length too large");
        }
        int digestSize = (int) (j10 / ((long) digest.getDigestSize()));
        int digestSize2 = digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        for (int i12 = 1; i12 <= digestSize; i12++) {
            byte[] bArr3 = this.f90392b;
            digest.update(bArr3, 0, bArr3.length);
            digest.update((byte) (i12 & 255));
            digest.update((byte) ((i12 >> 8) & 255));
            digest.update((byte) ((i12 >> 16) & 255));
            digest.update((byte) ((i12 >> 24) & 255));
            byte[] bArr4 = this.f90393c;
            digest.update(bArr4, 0, bArr4.length);
            digest.doFinal(bArr2, 0);
            int i13 = i11 - i10;
            if (i13 > digestSize2) {
                System.arraycopy(bArr2, 0, bArr, i10, digestSize2);
                i10 += digestSize2;
            } else {
                System.arraycopy(bArr2, 0, bArr, i10, i13);
            }
        }
        digest.reset();
        return i11;
    }

    public Digest getDigest() {
        return this.f90391a;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.f90392b = kDFParameters.getSharedSecret();
        this.f90393c = kDFParameters.getIV();
    }
}
