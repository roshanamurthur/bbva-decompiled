package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RSAKeyParameters f88662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88663b;

    public final BigInteger a(byte[] bArr, int i10, int i11) {
        if (i11 > c() + 1) {
            throw new DataLengthException("input too large for RSA cipher.");
        }
        if (i11 == c() + 1 && !this.f88663b) {
            throw new DataLengthException("input too large for RSA cipher.");
        }
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.f88662a.getModulus()) < 0) {
            return bigInteger;
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public final byte[] b(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.f88663b) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            Arrays.fill(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > d()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        }
        if (byteArray.length >= d()) {
            return byteArray;
        }
        int iD = d();
        byte[] bArr3 = new byte[iD];
        System.arraycopy(byteArray, 0, bArr3, iD - byteArray.length, byteArray.length);
        return bArr3;
    }

    public final int c() {
        int iBitLength = (this.f88662a.getModulus().bitLength() + 7) / 8;
        return this.f88663b ? iBitLength - 1 : iBitLength;
    }

    public final int d() {
        int iBitLength = (this.f88662a.getModulus().bitLength() + 7) / 8;
        return this.f88663b ? iBitLength : iBitLength - 1;
    }

    public final void e(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.f88662a = (RSAKeyParameters) cipherParameters;
        this.f88663b = z10;
    }

    public final BigInteger f(BigInteger bigInteger) {
        RSAKeyParameters rSAKeyParameters = this.f88662a;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters)) {
            return bigInteger.modPow(rSAKeyParameters.getExponent(), this.f88662a.getModulus());
        }
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters;
        BigInteger p4 = rSAPrivateCrtKeyParameters.getP();
        BigInteger q10 = rSAPrivateCrtKeyParameters.getQ();
        BigInteger dp = rSAPrivateCrtKeyParameters.getDP();
        BigInteger dq = rSAPrivateCrtKeyParameters.getDQ();
        BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
        BigInteger bigIntegerModPow = bigInteger.remainder(p4).modPow(dp, p4);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(q10).modPow(dq, q10);
        return bigIntegerModPow.subtract(bigIntegerModPow2).multiply(qInv).mod(p4).multiply(q10).add(bigIntegerModPow2);
    }
}
