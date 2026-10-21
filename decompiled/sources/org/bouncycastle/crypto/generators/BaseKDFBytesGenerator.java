package org.bouncycastle.crypto.generators;

import androidx.core.view.InputDeviceCompat;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes4.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f88689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88691d;

    public BaseKDFBytesGenerator(int i10, Digest digest) {
        this.f88688a = i10;
        this.f88689b = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 < i13) {
            throw new OutputLengthException("output buffer too small");
        }
        long j10 = i12;
        Digest digest = this.f88689b;
        int digestSize = digest.getDigestSize();
        if (j10 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j11 = digestSize;
        int i14 = (int) (((j10 + j11) - 1) / j11);
        byte[] bArr2 = new byte[digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        int i15 = this.f88688a;
        Pack.intToBigEndian(i15, bArr3, 0);
        int i16 = i15 & InputDeviceCompat.SOURCE_ANY;
        int i17 = 0;
        while (i17 < i14) {
            byte[] bArr4 = this.f88690c;
            int i18 = i14;
            digest.update(bArr4, 0, bArr4.length);
            digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.f88691d;
            if (bArr5 != null) {
                digest.update(bArr5, 0, bArr5.length);
            }
            digest.doFinal(bArr2, 0);
            if (i12 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                i13 += digestSize;
                i12 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i13, i12);
            }
            byte b10 = (byte) (bArr3[3] + 1);
            bArr3[3] = b10;
            if (b10 == 0) {
                i16 += 256;
                Pack.intToBigEndian(i16, bArr3, 0);
            }
            i17++;
            i14 = i18;
        }
        digest.reset();
        return (int) j10;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.f88689b;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.f88690c = kDFParameters.getSharedSecret();
            this.f88691d = kDFParameters.getIV();
        } else {
            if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                throw new IllegalArgumentException("KDF parameters required for generator");
            }
            this.f88690c = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.f88691d = null;
        }
    }
}
