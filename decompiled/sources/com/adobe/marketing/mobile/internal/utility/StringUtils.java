package com.adobe.marketing.mobile.internal.utility;

import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class StringUtils {
    public static final String CHARSET_UTF_8 = "UTF-8";
    private static final String LOG_SOURCE = "Adobe Marketing";
    private static final int STREAM_READ_BUFFER_SIZE = 1024;

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String streamToString(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (IOException e5) {
                MobileCore.log(LoggingMode.DEBUG, LOG_SOURCE, "Unable to convert InputStream to String," + e5.getLocalizedMessage());
                return null;
            }
        }
    }

    public static boolean stringIsUrl(String str) {
        if (isNullOrEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }
}
