package com.adobe.marketing.mobile;

import androidx.camera.core.impl.utils.c;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.network.constant.ConstantsKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
final class UrlUtilities {
    private static final int ALL_BITS_ENABLED = 255;
    private static final String[] encodedChars = {"%00", "%01", "%02", "%03", "%04", "%05", "%06", "%07", "%08", "%09", ConstantsKt.ENTER, "%0B", "%0C", ConstantsKt.RETURN, "%0E", "%0F", "%10", "%11", "%12", "%13", "%14", "%15", "%16", "%17", "%18", "%19", "%1A", "%1B", "%1C", "%1D", "%1E", "%1F", "%20", "%21", ConstantsKt.QUOTATION, "%23", "%24", "%25", "%26", "%27", "%28", "%29", "%2A", "%2B", "%2C", Constant.DASH_STRING, Constant.DOT_STRING, "%2F", "0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", StorageTokenBuilder.OTP_LENGTH, "7", "8", "9", "%3A", "%3B", "%3C", "%3D", "%3E", "%3F", "%40", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "J", "K", "L", "M", "N", "O", "P", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "%5B", "%5C", "%5D", "%5E", PushConstants.GE_PARAMS_SEPARATOR, "%60", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", SharedPrefsStorage.VERSION_KEY, "w", "x", "y", "z", "%7B", "%7C", "%7D", "~", "%7F", "%80", "%81", "%82", "%83", "%84", "%85", "%86", "%87", "%88", "%89", "%8A", "%8B", "%8C", "%8D", "%8E", "%8F", "%90", "%91", "%92", "%93", "%94", "%95", "%96", "%97", "%98", "%99", "%9A", "%9B", "%9C", "%9D", "%9E", "%9F", "%A0", "%A1", "%A2", "%A3", "%A4", "%A5", "%A6", "%A7", "%A8", "%A9", "%AA", "%AB", "%AC", "%AD", "%AE", "%AF", "%B0", "%B1", "%B2", "%B3", "%B4", "%B5", "%B6", "%B7", "%B8", "%B9", "%BA", "%BB", "%BC", "%BD", "%BE", "%BF", "%C0", "%C1", "%C2", "%C3", "%C4", "%C5", "%C6", "%C7", "%C8", "%C9", "%CA", "%CB", "%CC", "%CD", "%CE", "%CF", "%D0", "%D1", "%D2", "%D3", "%D4", "%D5", "%D6", "%D7", "%D8", "%D9", "%DA", "%DB", "%DC", "%DD", "%DE", "%DF", "%E0", "%E1", "%E2", "%E3", "%E4", "%E5", "%E6", "%E7", "%E8", "%E9", "%EA", "%EB", "%EC", "%ED", "%EE", "%EF", "%F0", "%F1", "%F2", "%F3", "%F4", "%F5", "%F6", "%F7", "%F8", "%F9", "%FA", "%FB", "%FC", "%FD", "%FE", "%FF"};
    private static final boolean[] utf8Mask = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    private static final String LOG_TAG = "UrlUtilities";

    private UrlUtilities() {
    }

    public static Map<String, String> extractQueryParameters(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            if (!StringUtils.isNullOrEmpty(str2)) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length == 2 && !strArrSplit[0].isEmpty() && !strArrSplit[1].isEmpty()) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    public static String join(Iterable<?> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String serializeKeyValuePair(String str, String str2) {
        if (str == null || str2 == null || str.length() == 0) {
            return null;
        }
        return c.b(new StringBuilder(str2.length() + str.length() + 2), "&", str, "=", str2);
    }

    public static String serializeToQueryString(Map<String, Variant> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Variant> entry : map.entrySet()) {
            String strUrlEncode = urlEncode(entry.getKey());
            Variant value = entry.getValue();
            try {
                String strSerializeKeyValuePair = serializeKeyValuePair(strUrlEncode, value.getKind() == VariantKind.VECTOR ? urlEncode(join(value.getStringList(), ",")) : urlEncode(value.convertToString()));
                if (strSerializeKeyValuePair != null) {
                    sb2.append(strSerializeKeyValuePair);
                }
            } catch (VariantException unused) {
            }
        }
        return sb2.toString();
    }

    public static String urlEncode(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i10 = 0;
            while (i10 < length && utf8Mask[bytes[i10] & 255]) {
                i10++;
            }
            if (i10 == length) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(bytes.length << 1);
            if (i10 > 0) {
                sb2.append(new String(bytes, 0, i10, "UTF-8"));
            }
            while (i10 < length) {
                sb2.append(encodedChars[bytes[i10] & 255]);
                i10++;
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e5) {
            Log.debug(LOG_TAG, "Failed to url encode string %s (%s)", str, e5);
            return null;
        }
    }
}
