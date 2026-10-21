package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupCiphertext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f88347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f88348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BigInteger f88349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BigInteger f88350d;

    public CramerShoupCiphertext() {
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f88347a = bigInteger;
        this.f88348b = bigInteger2;
        this.f88349c = bigInteger3;
        this.f88350d = bigInteger4;
    }

    public BigInteger getE() {
        return this.f88349c;
    }

    public BigInteger getU1() {
        return this.f88347a;
    }

    public BigInteger getU2() {
        return this.f88348b;
    }

    public BigInteger getV() {
        return this.f88350d;
    }

    public void setE(BigInteger bigInteger) {
        this.f88349c = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f88347a = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f88348b = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f88350d = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f88347a.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f88348b.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f88349c.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f88350d.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i10 = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i10, length2);
        int i11 = i10 + length2;
        Pack.intToBigEndian(length3, bArr, i11);
        int i12 = i11 + 4;
        System.arraycopy(byteArray3, 0, bArr, i12, length3);
        int i13 = i12 + length3;
        Pack.intToBigEndian(length4, bArr, i13);
        System.arraycopy(byteArray4, 0, bArr, i13 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.f88347a.toString());
        stringBuffer.append("\nu2: " + this.f88348b.toString());
        stringBuffer.append("\ne: " + this.f88349c.toString());
        stringBuffer.append("\nv: " + this.f88350d.toString());
        return stringBuffer.toString();
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i10 = 4 + iBigEndianToInt;
        this.f88347a = new BigInteger(Arrays.copyOfRange(bArr, 4, i10));
        int i11 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i10) + i11;
        this.f88348b = new BigInteger(Arrays.copyOfRange(bArr, i11, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i12 = iBigEndianToInt2 + 4;
        int i13 = iBigEndianToInt3 + i12;
        this.f88349c = new BigInteger(Arrays.copyOfRange(bArr, i12, i13));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i13);
        int i14 = i13 + 4;
        this.f88350d = new BigInteger(Arrays.copyOfRange(bArr, i14, iBigEndianToInt4 + i14));
    }
}
