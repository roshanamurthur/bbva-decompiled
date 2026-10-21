package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t4 f66367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f66368b;

    public void a(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof l4) {
            this.f66367a = (t4) ((l4) cipherParameters).a();
        } else {
            this.f66367a = (t4) cipherParameters;
        }
        this.f66368b = z10;
    }

    public int b() {
        int iBitLength = this.f66367a.b().bitLength();
        return this.f66368b ? (iBitLength + 7) / 8 : ((iBitLength + 7) / 8) - 1;
    }

    public BigInteger b(BigInteger bigInteger) {
        t4 t4Var = this.f66367a;
        if (t4Var instanceof u4) {
            u4 u4Var = (u4) t4Var;
            BigInteger bigIntegerE = u4Var.e();
            BigInteger bigIntegerG = u4Var.g();
            BigInteger bigIntegerC = u4Var.c();
            BigInteger bigIntegerD = u4Var.d();
            BigInteger bigIntegerH = u4Var.h();
            BigInteger bigIntegerModPow = bigInteger.remainder(bigIntegerE).modPow(bigIntegerC, bigIntegerE);
            BigInteger bigIntegerModPow2 = bigInteger.remainder(bigIntegerG).modPow(bigIntegerD, bigIntegerG);
            return bigIntegerModPow.subtract(bigIntegerModPow2).multiply(bigIntegerH).mod(bigIntegerE).multiply(bigIntegerG).add(bigIntegerModPow2);
        }
        return bigInteger.modPow(t4Var.a(), this.f66367a.b());
    }

    public int a() {
        int iBitLength = this.f66367a.b().bitLength();
        if (this.f66368b) {
            return ((iBitLength + 7) / 8) - 1;
        }
        return (iBitLength + 7) / 8;
    }

    public BigInteger a(byte[] bArr, int i10, int i11) {
        if (i11 <= a() + 1) {
            if (i11 == a() + 1 && !this.f66368b) {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            if (i10 != 0 || i11 != bArr.length) {
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.f66367a.b()) < 0) {
                return bigInteger;
            }
            throw new DataLengthException("input too large for RSA cipher.");
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public byte[] a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.f66368b) {
            if (byteArray[0] == 0 && byteArray.length > b()) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            }
            if (byteArray.length < b()) {
                int iB = b();
                byte[] bArr2 = new byte[iB];
                System.arraycopy(byteArray, 0, bArr2, iB - byteArray.length, byteArray.length);
                return bArr2;
            }
        } else if (byteArray[0] == 0) {
            int length2 = byteArray.length - 1;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(byteArray, 1, bArr3, 0, length2);
            return bArr3;
        }
        return byteArray;
    }
}
