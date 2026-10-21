package org.bouncycastle.pqc.math.linearalgebra;

import ad.d;
import androidx.camera.core.processing.f;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;

/* JADX INFO: loaded from: classes13.dex */
public class GF2mField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91588b;

    public GF2mField(int i10) {
        this.f91587a = 0;
        if (i10 >= 32) {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
        this.f91587a = i10;
        this.f91588b = PolynomialRingGF2.getIrreduciblePolynomial(i10);
    }

    public int add(int i10, int i11) {
        return i10 ^ i11;
    }

    public String elementToStr(int i10) {
        String strD = "";
        for (int i11 = 0; i11 < this.f91587a; i11++) {
            strD = f.d((((byte) i10) & 1) == 0 ? "0" : "1", strD);
            i10 >>>= 1;
        }
        return strD;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.f91587a == gF2mField.f91587a && this.f91588b == gF2mField.f91588b) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i10, int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i11 < 0) {
            i10 = inverse(i10);
            i11 = -i11;
        }
        int iMult = 1;
        while (i11 != 0) {
            if ((i11 & 1) == 1) {
                iMult = mult(iMult, i10);
            }
            i10 = mult(i10, i10);
            i11 >>>= 1;
        }
        return iMult;
    }

    public int getDegree() {
        return this.f91587a;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.f91588b);
    }

    public int getPolynomial() {
        return this.f91588b;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.a(1 << this.f91587a, secureRandom);
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(CryptoServicesRegistrar.getSecureRandom());
    }

    public int hashCode() {
        return this.f91588b;
    }

    public int inverse(int i10) {
        return exp(i10, (1 << this.f91587a) - 2);
    }

    public boolean isElementOfThisField(int i10) {
        int i11 = this.f91587a;
        if (i11 == 31) {
            return i10 >= 0;
        }
        return i10 >= 0 && i10 < (1 << i11);
    }

    public int mult(int i10, int i11) {
        return PolynomialRingGF2.modMultiply(i10, i11, this.f91588b);
    }

    public int sqRoot(int i10) {
        for (int i11 = 1; i11 < this.f91587a; i11++) {
            i10 = mult(i10, i10);
        }
        return i10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Finite Field GF(2^");
        sb2.append(this.f91587a);
        sb2.append(") = GF(2)[X]/<");
        int i10 = this.f91588b;
        if (i10 == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i10 & 1)) == 1 ? "1" : "";
            int i11 = i10 >>> 1;
            int i12 = 1;
            while (i11 != 0) {
                if (((byte) (i11 & 1)) == 1) {
                    str2 = str2 + "+x^" + i12;
                }
                i11 >>>= 1;
                i12++;
            }
            str = str2;
        }
        return d.f(sb2, str, "> ");
    }

    public GF2mField(int i10, int i11) {
        this.f91587a = 0;
        if (i10 != PolynomialRingGF2.degree(i11)) {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!PolynomialRingGF2.isIrreducible(i11)) {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        }
        this.f91587a = i10;
        this.f91588b = i11;
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int i10 = this.f91587a;
        int iA = RandUtils.a(1 << i10, secureRandom);
        int i11 = 0;
        while (iA == 0 && i11 < 1048576) {
            iA = RandUtils.a(1 << i10, secureRandom);
            i11++;
        }
        if (i11 == 1048576) {
            return 1;
        }
        return iA;
    }

    public GF2mField(GF2mField gF2mField) {
        this.f91587a = 0;
        this.f91587a = gF2mField.f91587a;
        this.f91588b = gF2mField.f91588b;
    }

    public GF2mField(byte[] bArr) {
        this.f91587a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr);
        this.f91588b = iOS2IP;
        if (!PolynomialRingGF2.isIrreducible(iOS2IP)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f91587a = PolynomialRingGF2.degree(iOS2IP);
    }
}
