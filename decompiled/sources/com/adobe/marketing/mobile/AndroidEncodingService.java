package com.adobe.marketing.mobile;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
class AndroidEncodingService implements EncodingService {
    private static final String LOG_TAG = "AndroidEncodingService";

    @Override // com.adobe.marketing.mobile.EncodingService
    public byte[] base64Decode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Base64.decode(str, 0);
        } catch (IllegalArgumentException unused) {
            Log.debug(LOG_TAG, "Unable to Base64 decode string (%s).", str);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.EncodingService
    public byte[] base64Encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return Base64.encode(bArr, 2);
        } catch (IllegalArgumentException unused) {
            Log.debug(LOG_TAG, "Unable to Base64 encode string (%s).", bArr);
            return null;
        }
    }
}
