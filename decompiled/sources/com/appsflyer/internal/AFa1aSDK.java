package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1aSDK {
    private static String AFInAppEventType;

    private static String AFInAppEventParameterName(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile = null;
        byte[] bArr2 = null;
        randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    bArr2 = new byte[(int) randomAccessFile2.length()];
                    randomAccessFile2.readFully(bArr2);
                    randomAccessFile2.close();
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e5) {
                        AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
                    }
                } catch (IOException e7) {
                    e = e7;
                    bArr = bArr2;
                    randomAccessFile = randomAccessFile2;
                    AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e10) {
                            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e10);
                        }
                    }
                    bArr2 = bArr;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e11) {
                            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e11);
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                bArr = null;
            }
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return new String(bArr2, Charset.defaultCharset());
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static synchronized String AFInAppEventParameterName(AFb1bSDK aFb1bSDK, AFb1fSDK aFb1fSDK) {
        if (aFb1bSDK.AFInAppEventParameterName == null) {
            return AFInAppEventType;
        }
        if (AFInAppEventType == null) {
            String strValueOf = aFb1fSDK.valueOf("AF_INSTALLATION", (String) null);
            if (strValueOf != null) {
                AFInAppEventType = strValueOf;
            } else {
                try {
                    File file = new File(aFb1bSDK.AFInAppEventParameterName.getFilesDir(), "AF_INSTALLATION");
                    if (!file.exists()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(Constant.DASH_STRING);
                        sb2.append(Math.abs(new SecureRandom().nextLong()));
                        AFInAppEventType = sb2.toString();
                    } else {
                        AFInAppEventType = AFInAppEventParameterName(file);
                        file.delete();
                    }
                    aFb1fSDK.values("AF_INSTALLATION", AFInAppEventType);
                } catch (Exception e5) {
                    AFLogger.afErrorLog("Error getting AF unique ID", e5);
                }
            }
            if (AFInAppEventType != null) {
                AppsFlyerProperties.getInstance().set("uid", AFInAppEventType);
            }
        }
        return AFInAppEventType;
    }
}
