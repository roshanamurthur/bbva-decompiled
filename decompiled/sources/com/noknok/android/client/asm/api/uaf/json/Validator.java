package com.noknok.android.client.asm.api.uaf.json;

import android.util.Base64;
import androidx.collection.k;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class Validator {
    public static boolean isValidAAID(String str) {
        return str != null && str.matches("^[0-9A-Fa-f]{4}#[0-9A-Fa-f]{4}$");
    }

    public static boolean isValidBase64Format(String str, int i10, int i11) {
        for (char c10 : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c10) && c10 != '-' && c10 != '_') {
                Logger.e("Validator", "The data is not a valid UAF-base64url-encoded string");
                return false;
            }
        }
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(Charsets.utf8Charset), 8);
            if (bArrDecode.length >= i10 && bArrDecode.length <= i11) {
                return true;
            }
            Logger.e("Validator", k.c("The data length is not in the range [", i10, "...", i11, "]."));
            return false;
        } catch (IllegalArgumentException unused) {
            Logger.e("Validator", "The data is not a valid base64-encoded string.");
            return false;
        }
    }

    public static boolean isValidServerChallenge(String str) {
        if (str == null || str.equals("")) {
            Logger.e("Validator", "Server Challenge is missing.");
            return false;
        }
        if (isValidBase64Format(str, 8, 64)) {
            return true;
        }
        Logger.e("Validator", "Server Challenge format is incorrect.");
        return false;
    }
}
