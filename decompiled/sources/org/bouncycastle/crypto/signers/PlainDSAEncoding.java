package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class PlainDSAEncoding implements DSAEncoding {
    public static final PlainDSAEncoding INSTANCE = new PlainDSAEncoding();

    public BigInteger checkValue(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public BigInteger[] decode(BigInteger bigInteger, byte[] bArr) {
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(bigInteger);
        if (bArr.length == unsignedByteLength * 2) {
            return new BigInteger[]{decodeValue(bigInteger, bArr, 0, unsignedByteLength), decodeValue(bigInteger, bArr, unsignedByteLength, unsignedByteLength)};
        }
        throw new IllegalArgumentException("Encoding has incorrect length");
    }

    public BigInteger decodeValue(BigInteger bigInteger, byte[] bArr, int i10, int i11) {
        return checkValue(bigInteger, new BigInteger(1, Arrays.copyOfRange(bArr, i10, i11 + i10)));
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(bigInteger);
        byte[] bArr = new byte[unsignedByteLength * 2];
        byte[] byteArray = checkValue(bigInteger, bigInteger2).toByteArray();
        int iMax = Math.max(0, byteArray.length - unsignedByteLength);
        int length = byteArray.length - iMax;
        int i10 = unsignedByteLength - length;
        Arrays.fill(bArr, 0, i10, (byte) 0);
        System.arraycopy(byteArray, iMax, bArr, i10, length);
        byte[] byteArray2 = checkValue(bigInteger, bigInteger3).toByteArray();
        int iMax2 = Math.max(0, byteArray2.length - unsignedByteLength);
        int length2 = byteArray2.length - iMax2;
        int i11 = (unsignedByteLength - length2) + unsignedByteLength;
        Arrays.fill(bArr, unsignedByteLength, i11, (byte) 0);
        System.arraycopy(byteArray2, iMax2, bArr, i11, length2);
        return bArr;
    }
}
