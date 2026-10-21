package com.mastercard.mpsdk.mcbp.mcmlite.impl.state;

import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteUncheckedException;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public class DateUtils {
    public static byte[] getTodayTransactionDate() {
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1) - 2000;
        if (i10 < 0) {
            throw new McmLiteUncheckedException("Unable to retrieve the current year");
        }
        int i11 = calendar.get(2) + 1;
        int i12 = calendar.get(5);
        StringBuilder sb2 = new StringBuilder();
        String strValueOf = String.valueOf(i10);
        if (strValueOf.length() == 1) {
            strValueOf = "0".concat(strValueOf);
        }
        sb2.append(strValueOf);
        String strValueOf2 = String.valueOf(i11);
        if (strValueOf2.length() == 1) {
            strValueOf2 = "0".concat(strValueOf2);
        }
        sb2.append(strValueOf2);
        String strValueOf3 = String.valueOf(i12);
        if (strValueOf3.length() == 1) {
            strValueOf3 = "0".concat(strValueOf3);
        }
        sb2.append(strValueOf3);
        return McmLiteUtils.byteArrayFromHexString(sb2.toString());
    }
}
