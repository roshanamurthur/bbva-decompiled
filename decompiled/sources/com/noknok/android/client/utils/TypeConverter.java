package com.noknok.android.client.utils;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class TypeConverter {
    public static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append("0123456789ABCDEF".charAt((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4));
            sb2.append("0123456789ABCDEF".charAt(b10 & 15));
        }
        return sb2.toString();
    }
}
