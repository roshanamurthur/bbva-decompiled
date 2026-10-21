package org.bouncycastle.crypto.generators;

import androidx.appcompat.widget.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFFeedbackParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes4.dex */
public class KDFFeedbackBytesGenerator implements MacDerivationFunction {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BigInteger f88758j = BigInteger.valueOf(2147483647L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BigInteger f88759k = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mac f88760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f88765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f88768i;

    public KDFFeedbackBytesGenerator(Mac mac) {
        this.f88760a = mac;
        int macSize = mac.getMacSize();
        this.f88761b = macSize;
        this.f88768i = new byte[macSize];
    }

    public final void a() {
        int i10 = this.f88767h;
        byte[] bArr = this.f88768i;
        Mac mac = this.f88760a;
        if (i10 == 0) {
            byte[] bArr2 = this.f88765f;
            mac.update(bArr2, 0, bArr2.length);
        } else {
            mac.update(bArr, 0, bArr.length);
        }
        if (this.f88766g) {
            int i11 = (this.f88767h / this.f88761b) + 1;
            byte[] bArr3 = this.f88764e;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr3[0] = (byte) (i11 >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i11 >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i11 >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i11;
            mac.update(bArr3, 0, bArr3.length);
        }
        byte[] bArr4 = this.f88762c;
        mac.update(bArr4, 0, bArr4.length);
        mac.doFinal(bArr, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        int i12 = this.f88767h;
        int i13 = i12 + i11;
        if (i13 < 0 || i13 >= this.f88763d) {
            throw new DataLengthException(a.c(new StringBuilder("Current KDFCTR may only be used for "), this.f88763d, " bytes"));
        }
        int i14 = this.f88761b;
        if (i12 % i14 == 0) {
            a();
        }
        int i15 = this.f88767h;
        int i16 = i15 % i14;
        int iMin = Math.min(i14 - (i15 % i14), i11);
        byte[] bArr2 = this.f88768i;
        System.arraycopy(bArr2, i16, bArr, i10, iMin);
        this.f88767h += iMin;
        int i17 = i11 - iMin;
        while (true) {
            i10 += iMin;
            if (i17 <= 0) {
                return i11;
            }
            a();
            iMin = Math.min(i14, i17);
            System.arraycopy(bArr2, 0, bArr, i10, iMin);
            this.f88767h += iMin;
            i17 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.f88760a;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFFeedbackParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFFeedbackParameters kDFFeedbackParameters = (KDFFeedbackParameters) derivationParameters;
        this.f88760a.init(new KeyParameter(kDFFeedbackParameters.getKI()));
        this.f88762c = kDFFeedbackParameters.getFixedInputData();
        int r3 = kDFFeedbackParameters.getR();
        this.f88764e = new byte[r3 / 8];
        int iIntValue = Integer.MAX_VALUE;
        if (kDFFeedbackParameters.useCounter()) {
            BigInteger bigIntegerMultiply = f88759k.pow(r3).multiply(BigInteger.valueOf(this.f88761b));
            if (bigIntegerMultiply.compareTo(f88758j) != 1) {
                iIntValue = bigIntegerMultiply.intValue();
            }
        }
        this.f88763d = iIntValue;
        this.f88765f = kDFFeedbackParameters.getIV();
        this.f88766g = kDFFeedbackParameters.useCounter();
        this.f88767h = 0;
    }
}
