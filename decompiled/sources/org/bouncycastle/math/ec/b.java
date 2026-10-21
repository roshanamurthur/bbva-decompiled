package org.bouncycastle.math.ec;

import java.math.BigInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f90625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90626b;

    public b(BigInteger bigInteger, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.f90625a = bigInteger;
        this.f90626b = i10;
    }

    public final b a(b bVar) {
        int i10 = bVar.f90626b;
        int i11 = this.f90626b;
        if (i11 == i10) {
            return new b(this.f90625a.add(bVar.f90625a), i11);
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final int b(BigInteger bigInteger) {
        return this.f90625a.compareTo(bigInteger.shiftLeft(this.f90626b));
    }

    public final BigInteger c() {
        BigInteger bigInteger = ECConstants.ONE;
        b bVar = new b(bigInteger, 1);
        int i10 = this.f90626b;
        if (i10 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        if (i10 != 1) {
            bVar = new b(bigInteger.shiftLeft(i10 - 1), i10);
        }
        b bVarA = a(bVar);
        return bVarA.f90625a.shiftRight(bVarA.f90626b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f90625a.equals(bVar.f90625a) && this.f90626b == bVar.f90626b;
    }

    public final int hashCode() {
        return this.f90625a.hashCode() ^ this.f90626b;
    }

    public final String toString() {
        BigInteger bigInteger = this.f90625a;
        int i10 = this.f90626b;
        if (i10 == 0) {
            return bigInteger.toString();
        }
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i10);
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(i10));
        if (bigInteger.signum() == -1) {
            bigIntegerSubtract = ECConstants.ONE.shiftLeft(i10).subtract(bigIntegerSubtract);
        }
        if (bigIntegerShiftRight.signum() == -1 && !bigIntegerSubtract.equals(ECConstants.ZERO)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        String string = bigIntegerShiftRight.toString();
        char[] cArr = new char[i10];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i11 = i10 - length;
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i12] = '0';
        }
        for (int i13 = 0; i13 < length; i13++) {
            cArr[i11 + i13] = string2.charAt(i13);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(Constant.DOT_STRING);
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
