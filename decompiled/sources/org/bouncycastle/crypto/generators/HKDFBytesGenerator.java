package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes4.dex */
public class HKDFBytesGenerator implements DerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HMac f88732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88736e;

    public HKDFBytesGenerator(Digest digest) {
        this.f88732a = new HMac(digest);
        this.f88733b = digest.getDigestSize();
    }

    public final void a() throws DataLengthException {
        int i10 = this.f88736e;
        int i11 = this.f88733b;
        int i12 = (i10 / i11) + 1;
        if (i12 >= 256) {
            throw new DataLengthException("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        HMac hMac = this.f88732a;
        if (i10 != 0) {
            hMac.update(this.f88735d, 0, i11);
        }
        byte[] bArr = this.f88734c;
        hMac.update(bArr, 0, bArr.length);
        hMac.update((byte) i12);
        hMac.doFinal(this.f88735d, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        int i12 = this.f88736e;
        int i13 = i12 + i11;
        int i14 = this.f88733b;
        if (i13 > i14 * 255) {
            throw new DataLengthException("HKDF may only be used for 255 * HashLen bytes of output");
        }
        if (i12 % i14 == 0) {
            a();
        }
        int i15 = this.f88736e;
        int i16 = i15 % i14;
        int iMin = Math.min(i14 - (i15 % i14), i11);
        System.arraycopy(this.f88735d, i16, bArr, i10, iMin);
        this.f88736e += iMin;
        int i17 = i11 - iMin;
        while (true) {
            i10 += iMin;
            if (i17 <= 0) {
                return i11;
            }
            a();
            iMin = Math.min(i14, i17);
            System.arraycopy(this.f88735d, 0, bArr, i10, iMin);
            this.f88736e += iMin;
            i17 -= iMin;
        }
    }

    public Digest getDigest() {
        return this.f88732a.getUnderlyingDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof HKDFParameters)) {
            throw new IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
        }
        HKDFParameters hKDFParameters = (HKDFParameters) derivationParameters;
        boolean zSkipExtract = hKDFParameters.skipExtract();
        int i10 = this.f88733b;
        HMac hMac = this.f88732a;
        if (zSkipExtract) {
            hMac.init(new KeyParameter(hKDFParameters.getIKM()));
        } else {
            byte[] salt = hKDFParameters.getSalt();
            byte[] ikm = hKDFParameters.getIKM();
            if (salt == null) {
                hMac.init(new KeyParameter(new byte[i10]));
            } else {
                hMac.init(new KeyParameter(salt));
            }
            hMac.update(ikm, 0, ikm.length);
            byte[] bArr = new byte[i10];
            hMac.doFinal(bArr, 0);
            hMac.init(new KeyParameter(bArr));
        }
        this.f88734c = hKDFParameters.getInfo();
        this.f88736e = 0;
        this.f88735d = new byte[i10];
    }
}
