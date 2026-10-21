package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KDFParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ConcatenationKDFGenerator implements DerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f87935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f87936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f87937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87938d;

    public ConcatenationKDFGenerator(Digest digest) {
        this.f87935a = digest;
        this.f87938d = digest.getDigestSize();
    }

    public static void a(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        int i12;
        if (bArr.length - i11 < i10) {
            throw new OutputLengthException("output buffer too small");
        }
        int i13 = this.f87938d;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[4];
        Digest digest = this.f87935a;
        digest.reset();
        int i14 = 1;
        int i15 = 0;
        if (i11 > i13) {
            while (true) {
                a(i14, bArr3);
                digest.update(bArr3, 0, 4);
                byte[] bArr4 = this.f87936b;
                digest.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = this.f87937c;
                digest.update(bArr5, 0, bArr5.length);
                digest.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10 + i15, i13);
                i15 += i13;
                i12 = i14 + 1;
                if (i14 >= i11 / i13) {
                    break;
                }
                i14 = i12;
            }
            i14 = i12;
        }
        if (i15 < i11) {
            a(i14, bArr3);
            digest.update(bArr3, 0, 4);
            byte[] bArr6 = this.f87936b;
            digest.update(bArr6, 0, bArr6.length);
            byte[] bArr7 = this.f87937c;
            digest.update(bArr7, 0, bArr7.length);
            digest.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i10 + i15, i11 - i15);
        }
        return i11;
    }

    public Digest getDigest() {
        return this.f87935a;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.f87936b = kDFParameters.getSharedSecret();
        this.f87937c = kDFParameters.getIV();
    }
}
