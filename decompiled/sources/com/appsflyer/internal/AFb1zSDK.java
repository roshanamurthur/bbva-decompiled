package com.appsflyer.internal;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1zSDK {
    private static int AFInAppEventParameterName = 0;
    private static char AFInAppEventType = 21153;
    private static char AFKeystoreWrapper = 1632;
    private static int afInfoLog = 1;
    private static char valueOf = 18203;
    private static char values = 10764;

    public static String AFInAppEventParameterName(String str) {
        int i10 = afInfoLog + 49;
        AFInAppEventParameterName = i10 % 128;
        String str2 = null;
        try {
            if (i10 % 2 == 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes(Charset.defaultCharset()));
                String strAFInAppEventParameterName = AFInAppEventParameterName(messageDigest.digest());
                int i11 = afInfoLog + 25;
                AFInAppEventParameterName = i11 % 128;
                int i12 = i11 % 2;
                return strAFInAppEventParameterName;
            }
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
            messageDigest2.update(str.getBytes(Charset.defaultCharset()));
            String strAFInAppEventParameterName2 = AFInAppEventParameterName(messageDigest2.digest());
            try {
                throw null;
            } catch (Exception e5) {
                str2 = strAFInAppEventParameterName2;
                e = e5;
                StringBuilder sb2 = new StringBuilder("Error turning ");
                sb2.append(str.substring(0, 6));
                sb2.append(".. to SHA-256");
                AFLogger.afErrorLog(sb2.toString(), e);
                return str2;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        int i10 = AFInAppEventParameterName + 1;
        afInfoLog = i10 % 128;
        int i11 = i10 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            String strValues = values(messageDigest.digest());
            int i12 = afInfoLog + 9;
            AFInAppEventParameterName = i12 % 128;
            int i13 = i12 % 2;
            return strValues;
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to MD5");
            AFLogger.afErrorLog(sb2.toString(), e5);
            return null;
        }
    }

    public static boolean valueOf(Map<String, Object> map, String[] strArr, AFb1cSDK aFb1cSDK) throws IllegalStateException {
        int i10 = AFInAppEventParameterName + 123;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (map == null || map.isEmpty()) {
            return false;
        }
        int length = strArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = AFInAppEventParameterName + 67;
            afInfoLog = i12 % 128;
            if (i12 % 2 == 0) {
                map.containsKey(strArr[i11]);
                throw null;
            }
            if (!map.containsKey(strArr[i11])) {
                return false;
            }
            i11++;
            int i13 = afInfoLog + 83;
            AFInAppEventParameterName = i13 % 128;
            int i14 = i13 % 2;
        }
        String str = (String) map.remove("sig");
        if (str == null) {
            return false;
        }
        String strAFInAppEventParameterName = AFb1cSDK.AFInAppEventParameterName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new JSONObject(map));
        sb2.append(strAFInAppEventParameterName);
        return AFKeystoreWrapper(sb2.toString(), AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType)).equals(str);
    }

    public static String values(String str) {
        String strValues;
        int i10 = afInfoLog + 119;
        AFInAppEventParameterName = i10 % 128;
        int i11 = i10 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.reset();
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            strValues = values(messageDigest.digest());
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA1");
            AFLogger.afErrorLog(sb2.toString(), e5);
            strValues = null;
        }
        int i12 = afInfoLog + 89;
        AFInAppEventParameterName = i12 % 128;
        if (i12 % 2 == 0) {
            return strValues;
        }
        throw null;
    }

    public static String AFKeystoreWrapper(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
            int i10 = afInfoLog + 65;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 == 0) {
                return lowerCase;
            }
            throw null;
        } catch (InvalidKeyException | NoSuchAlgorithmException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5, true);
            return e5.getMessage();
        }
    }

    private static String values(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = AFInAppEventParameterName + 45;
            afInfoLog = i11 % 128;
            if (i11 % 2 == 0) {
                Object[] objArr = new Object[1];
                objArr[1] = Byte.valueOf(bArr[i10]);
                formatter.format("%02x", objArr);
                i10 += 85;
            } else {
                formatter.format("%02x", Byte.valueOf(bArr[i10]));
                i10++;
            }
            int i12 = AFInAppEventParameterName + 77;
            afInfoLog = i12 % 128;
            int i13 = i12 % 2;
        }
        String string = formatter.toString();
        formatter.close();
        int i14 = AFInAppEventParameterName + 9;
        afInfoLog = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 47 / 0;
        }
        return string;
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = AFInAppEventParameterName + 121;
            afInfoLog = i11 % 128;
            int i12 = i11 % 2;
            sb2.append(Integer.toString((bArr[i10] & 255) + 256, 16).substring(1));
            i10++;
            int i13 = AFInAppEventParameterName + 15;
            afInfoLog = i13 % 128;
            int i14 = i13 % 2;
        }
        return sb2.toString();
    }

    public static String AFKeystoreWrapper(Map<String, Object> map) {
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d((String) map.get("appsflyerKey"));
        Object[] objArr = new Object[1];
        valueOf("椆阘郁㎂㿑嬺샀蠆됰푗蝦\ude1f", 12 - (Process.myTid() >> 22), objArr);
        sbD.append(map.get(((String) objArr[0]).intern()));
        StringBuilder sbD2 = androidx.camera.core.impl.utils.c.d(sbD.toString());
        sbD2.append(map.get("uid"));
        StringBuilder sbD3 = androidx.camera.core.impl.utils.c.d(sbD2.toString());
        sbD3.append(map.get("installDate"));
        StringBuilder sbD4 = androidx.camera.core.impl.utils.c.d(sbD3.toString());
        sbD4.append(map.get("counter"));
        StringBuilder sbD5 = androidx.camera.core.impl.utils.c.d(sbD4.toString());
        sbD5.append(map.get("iaecounter"));
        String strValues = values(AFKeystoreWrapper(sbD5.toString()));
        int i10 = AFInAppEventParameterName + 19;
        afInfoLog = i10 % 128;
        int i11 = i10 % 2;
        return strValues;
    }

    private static void valueOf(String str, int i10, Object[] objArr) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            try {
                char[] cArr2 = new char[cArr.length];
                AFg1kSDK.AFInAppEventType = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = AFg1kSDK.AFInAppEventType;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + values)) ^ ((c11 >>> 5) + valueOf)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + AFKeystoreWrapper) ^ ((c12 + i12) ^ ((c12 << 4) + AFInAppEventType))));
                            i12 -= 40503;
                        }
                        int i14 = AFg1kSDK.AFInAppEventType;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        AFg1kSDK.AFInAppEventType = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }

    public static String values(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        Object[] objArr = new Object[1];
        valueOf("椆阘郁㎂㿑嬺샀蠆됰푗蝦\ude1f", View.getDefaultSize(0, 0) + 12, objArr);
        String str2 = (String) map.get(((String) objArr[0]).intern());
        String str3 = (String) map.get("uid");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 7));
        sb2.append(str3.substring(0, 7));
        sb2.append(str2.substring(str2.length() - 7));
        String strValues = values(sb2.toString());
        int i10 = AFInAppEventParameterName + 115;
        afInfoLog = i10 % 128;
        int i11 = i10 % 2;
        return strValues;
    }

    public static String values(String... strArr) {
        int i10 = afInfoLog + 111;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            return TextUtils.join("\u2063", strArr);
        }
        TextUtils.join("\u2063", strArr);
        throw null;
    }
}
