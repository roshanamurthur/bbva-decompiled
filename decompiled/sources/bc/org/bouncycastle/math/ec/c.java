package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f25057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25058b;

    public c(BigInteger bigInteger, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.f25057a = bigInteger;
        this.f25058b = i10;
    }

    public final int a(BigInteger bigInteger) {
        return this.f25057a.compareTo(bigInteger.shiftLeft(this.f25058b));
    }

    public final c b(c cVar) {
        int i10 = cVar.f25058b;
        int i11 = this.f25058b;
        if (i11 == i10) {
            return new c(this.f25057a.add(cVar.f25057a), i11);
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final BigInteger c() {
        BigInteger bigInteger = ECConstants.ONE;
        c cVar = new c(bigInteger, 1);
        int i10 = this.f25058b;
        if (i10 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        if (i10 != 1) {
            cVar = new c(bigInteger.shiftLeft(i10 - 1), i10);
        }
        c cVarB = b(cVar);
        return cVarB.f25057a.shiftRight(cVarB.f25058b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25057a.equals(cVar.f25057a) && this.f25058b == cVar.f25058b;
    }

    public final int hashCode() {
        return this.f25057a.hashCode() ^ this.f25058b;
    }

    public final String toString() {
        BigInteger bigInteger = this.f25057a;
        int i10 = this.f25058b;
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
