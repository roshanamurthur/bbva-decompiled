package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: loaded from: classes12.dex */
public class X9IntegerConverter {
    public int getByteLength(ECCurve eCCurve) {
        return (eCCurve.getFieldSize() + 7) / 8;
    }

    public byte[] integerToBytes(BigInteger bigInteger, int i10) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i10 < byteArray.length) {
            byte[] bArr = new byte[i10];
            System.arraycopy(byteArray, byteArray.length - i10, bArr, 0, i10);
            return bArr;
        }
        if (i10 <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(byteArray, 0, bArr2, i10 - byteArray.length, byteArray.length);
        return bArr2;
    }

    public int getByteLength(ECFieldElement eCFieldElement) {
        return (eCFieldElement.getFieldSize() + 7) / 8;
    }
}
