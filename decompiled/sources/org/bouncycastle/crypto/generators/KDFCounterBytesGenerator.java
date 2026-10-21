package org.bouncycastle.crypto.generators;

import androidx.appcompat.widget.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFCounterParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes4.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BigInteger f88737i = BigInteger.valueOf(2147483647L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BigInteger f88738j = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mac f88739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f88744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f88746h;

    public KDFCounterBytesGenerator(Mac mac) {
        this.f88739a = mac;
        int macSize = mac.getMacSize();
        this.f88740b = macSize;
        this.f88746h = new byte[macSize];
    }

    public final void a() {
        int i10 = (this.f88745g / this.f88740b) + 1;
        byte[] bArr = this.f88744f;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i10 >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i10 >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i10 >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i10;
        byte[] bArr2 = this.f88741c;
        int length2 = bArr2.length;
        Mac mac = this.f88739a;
        mac.update(bArr2, 0, length2);
        byte[] bArr3 = this.f88744f;
        mac.update(bArr3, 0, bArr3.length);
        byte[] bArr4 = this.f88742d;
        mac.update(bArr4, 0, bArr4.length);
        mac.doFinal(this.f88746h, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        int i12 = this.f88745g;
        int i13 = i12 + i11;
        if (i13 < 0 || i13 >= this.f88743e) {
            throw new DataLengthException(a.c(new StringBuilder("Current KDFCTR may only be used for "), this.f88743e, " bytes"));
        }
        int i14 = this.f88740b;
        if (i12 % i14 == 0) {
            a();
        }
        int i15 = this.f88745g;
        int i16 = i15 % i14;
        int iMin = Math.min(i14 - (i15 % i14), i11);
        byte[] bArr2 = this.f88746h;
        System.arraycopy(bArr2, i16, bArr, i10, iMin);
        this.f88745g += iMin;
        int i17 = i11 - iMin;
        while (true) {
            i10 += iMin;
            if (i17 <= 0) {
                return i11;
            }
            a();
            iMin = Math.min(i14, i17);
            System.arraycopy(bArr2, 0, bArr, i10, iMin);
            this.f88745g += iMin;
            i17 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.f88739a;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.f88739a.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.f88741c = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.f88742d = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r3 = kDFCounterParameters.getR();
        this.f88744f = new byte[r3 / 8];
        BigInteger bigIntegerMultiply = f88738j.pow(r3).multiply(BigInteger.valueOf(this.f88740b));
        this.f88743e = bigIntegerMultiply.compareTo(f88737i) == 1 ? Integer.MAX_VALUE : bigIntegerMultiply.intValue();
        this.f88745g = 0;
    }
}
