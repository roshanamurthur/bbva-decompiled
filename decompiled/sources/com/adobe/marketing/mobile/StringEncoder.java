package com.adobe.marketing.mobile;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
final class StringEncoder {
    private static final int ALL_BITS_ENABLED = 255;
    private static final int HEX_CHAR_MULTIPLIER = 15;
    private static final int HEX_RADIX = 16;
    private static final String LOG_TAG = "StringEncoder";
    private static final int OFFSET = -2128831035;
    private static final int PRIME = 16777619;
    private static final int SHIFT_BY = 4;
    private static final char[] hexArray = "0123456789abcdef".toCharArray();

    private StringEncoder() {
    }

    public static long convertMapToDecimalHash(Map<String, Variant> map) {
        StringBuilder sb2 = new StringBuilder();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                try {
                    sb2.append(str + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + map.get(str).convertToString());
                } catch (VariantException unused) {
                    Log.trace(LOG_TAG, "Unable to convert variant %s to string.", map.get(str));
                }
            }
        }
        return convertStringToDecimalHash(sb2.toString());
    }

    public static long convertStringToDecimalHash(String str) {
        return Long.parseLong(Integer.toHexString(getFnv1aHash(str)), 16);
    }

    private static int getFnv1aHash(String str) {
        int i10 = StringUtils.isNullOrEmpty(str) ? 0 : OFFSET;
        for (byte b10 : str.getBytes()) {
            i10 = (i10 ^ (b10 & 255)) * PRIME;
        }
        return i10;
    }

    public static String getSha1HashedString(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[bArrDigest.length * 2];
            for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                byte b10 = bArrDigest[i10];
                int i11 = i10 * 2;
                char[] cArr2 = hexArray;
                cArr[i11] = cArr2[(b10 & 255) >>> 4];
                cArr[i11 + 1] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (UnsupportedEncodingException e5) {
            Log.debug(LOG_TAG, "ADBMobile - error while attempting to encode a string (%s)", e5);
            return null;
        } catch (NoSuchAlgorithmException e7) {
            Log.debug(LOG_TAG, "ADBMobile - error while attempting to encode a string (%s)", e7);
            return null;
        }
    }
}
