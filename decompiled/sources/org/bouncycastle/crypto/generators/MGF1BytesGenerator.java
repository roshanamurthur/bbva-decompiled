package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.MGFParameters;

/* JADX INFO: loaded from: classes4.dex */
public class MGF1BytesGenerator implements DerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f88770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88771c;

    public MGF1BytesGenerator(Digest digest) {
        this.f88769a = digest;
        this.f88771c = digest.getDigestSize();
    }

    public static void a(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i11 < i10) {
            throw new OutputLengthException("output buffer too small");
        }
        int i12 = this.f88771c;
        byte[] bArr2 = new byte[i12];
        byte[] bArr3 = new byte[4];
        Digest digest = this.f88769a;
        digest.reset();
        int i13 = 0;
        if (i11 > i12) {
            do {
                a(i13, bArr3);
                byte[] bArr4 = this.f88770b;
                digest.update(bArr4, 0, bArr4.length);
                digest.update(bArr3, 0, 4);
                digest.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, (i13 * i12) + i10, i12);
                i13++;
            } while (i13 < i11 / i12);
        }
        int i14 = i12 * i13;
        if (i14 < i11) {
            a(i13, bArr3);
            byte[] bArr5 = this.f88770b;
            digest.update(bArr5, 0, bArr5.length);
            digest.update(bArr3, 0, 4);
            digest.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i10 + i14, i11 - i14);
        }
        return i11;
    }

    public Digest getDigest() {
        return this.f88769a;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof MGFParameters)) {
            throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
        }
        this.f88770b = ((MGFParameters) derivationParameters).getSeed();
    }
}
