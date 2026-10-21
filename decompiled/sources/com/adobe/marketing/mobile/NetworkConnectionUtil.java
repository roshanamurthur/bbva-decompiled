package com.adobe.marketing.mobile;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
final class NetworkConnectionUtil {
    private static final int BUF_SIZE = 1024;
    private static final String DEFAULT_CHARSET = "UTF-8";
    static final String HTTP_HEADER_ACCEPT_TEXT_HTML = "text/html";
    static final String HTTP_HEADER_CONTENT_TYPE_JSON_APPLICATION = "application/json";
    static final String HTTP_HEADER_CONTENT_TYPE_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";
    static final String HTTP_HEADER_KEY_ACCEPT = "Accept";
    static final String HTTP_HEADER_KEY_ACCEPT_LANGUAGE = "Accept-Language";
    static final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    static ArrayList<Integer> recoverableNetworkErrorCodes = new ArrayList<>(Arrays.asList(Integer.valueOf(Constant.ERROR_CODE_408), 504, 503));

    private NetworkConnectionUtil() {
    }

    public static Map<String, String> getHeaders(boolean z10) {
        return getHeaders(z10, null);
    }

    public static String readFromInputStream(InputStream inputStream) throws IOException {
        return readFromInputStream(inputStream, "UTF-8");
    }

    public static Map<String, String> getHeaders(boolean z10, String str) {
        HashMap map = new HashMap();
        if (!z10) {
            map.put("connection", HearingDisabilitiesConstants.CLOSE_MODAL);
        }
        if (StringUtils.isNullOrEmpty(str)) {
            str = HTTP_HEADER_CONTENT_TYPE_WWW_FORM_URLENCODED;
        }
        map.put("Content-Type", str);
        return map;
    }

    public static String readFromInputStream(InputStream inputStream, String str) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
        inputStream.close();
        if (StringUtils.isNullOrEmpty(str)) {
            str = "UTF-8";
        }
        return byteArrayOutputStream.toString(str);
    }
}
