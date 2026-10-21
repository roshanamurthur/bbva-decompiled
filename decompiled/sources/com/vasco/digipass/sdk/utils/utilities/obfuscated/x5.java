package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class x5 {
    public int a(ECFieldElement eCFieldElement) {
        return (eCFieldElement.getFieldSize() + 7) / 8;
    }

    public byte[] a(BigInteger bigInteger, int i10) {
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
}
