package com.mypinpad.tsdk.isolation;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aud {
    public aud(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        setY(new Object[]{bigIntegerArr, ConfigConstantsKt.CUSTOMERS_API_VERSION}, -1025963413, 1025963413, (int) System.currentTimeMillis());
        setY(new Object[]{bigIntegerArr2, "v2"}, -1025963413, 1025963413, (int) System.currentTimeMillis());
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        BigInteger bigInteger5 = bigIntegerArr2[0];
        BigInteger bigInteger6 = bigIntegerArr2[1];
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        BigInteger[] bigIntegerArr = (BigInteger[]) objArr[0];
        String str = (String) objArr[1];
        if (bigIntegerArr != null && bigIntegerArr.length == 2 && bigIntegerArr[0] != null && bigIntegerArr[1] != null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("'");
        sb2.append(str);
        sb2.append("' must consist of exactly 2 (non-null) values");
        throw new IllegalArgumentException(sb2.toString());
    }
}
