package com.bbva.tohu.android.product.valkyria.sdk.utils;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;

/* JADX INFO: loaded from: classes6.dex */
public class CardUtils {
    public static String formatYear(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.length() != 2 && str.length() != 4) {
            return null;
        }
        int length = str.length() - (z10 ? 2 : 4);
        return length >= 0 ? str.substring(length) : PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND.concat(str);
    }

    public static String getRange(String str) {
        return (str == null || str.length() <= 9) ? str : str.substring(0, 9);
    }

    public static String truncatePan(String str) {
        return (str == null || str.length() <= 4) ? str : str.substring(str.length() - 4);
    }
}
