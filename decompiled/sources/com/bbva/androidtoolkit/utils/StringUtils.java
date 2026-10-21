package com.bbva.androidtoolkit.utils;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.orhanobut.logger.Logger;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtils {
    public static final String ENCODING_S_IS_NOT_SUPPORTED_BY_YOUR_JVM = "Encoding (%s) is not supported by your JVM";
    public static final String TAG = "StringUtils";
    public static final String UTF_8 = "UTF-8";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f26548a = "0123456789ABCDEF".toCharArray();

    public static void appendHexString(byte[] bArr, int i10, int i11, StringBuffer stringBuffer) {
        if (bArr != null) {
            int iMin = Math.min(i11 + i10, bArr.length);
            while (i10 < iMin) {
                byte b10 = bArr[i10];
                int i12 = (b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4;
                char[] cArr = f26548a;
                stringBuffer.append(cArr[i12]);
                stringBuffer.append(cArr[b10 & 15]);
                i10++;
            }
        }
    }

    public static String concat(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str.concat(str2);
    }

    public static String createString(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e5) {
            throw new IllegalArgumentException(String.format(ENCODING_S_IS_NOT_SUPPORTED_BY_YOUR_JVM, str), e5);
        }
    }

    public static String createStringFromList(List<String> list, char c10) {
        StringBuilder sb2 = new StringBuilder();
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(list.get(i10));
                if (i10 != size - 1) {
                    sb2.append(c10);
                }
            }
        }
        return sb2.toString();
    }

    public static String createUTF8String(byte[] bArr) {
        return createString(bArr, "UTF-8");
    }

    public static String createUtf8String(byte[] bArr) {
        return createString(bArr, "UTF-8");
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        boolean z10 = isNullOrEmpty(str) && isNotNullOrEmpty(str2);
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null || !str.equalsIgnoreCase(str2)) {
            return z10;
        }
        return true;
    }

    public static boolean equalsIgnoreCaseWithTrim(String str, String str2) {
        if (str == null || str2 == null) {
            return str == str2;
        }
        return equalsIgnoreCase(str.trim(), str2.trim());
    }

    public static boolean equalsWithTrim(String str, String str2) {
        if (str == null || str2 == null) {
            return str == str2;
        }
        return isEquals(str.trim(), str2.trim());
    }

    public static String fillFromString(String str, int i10, boolean z10, char c10) {
        if (str != null && str.length() < i10) {
            while (str.length() != i10) {
                if (z10) {
                    str = str + c10;
                } else {
                    str = c10 + str;
                }
            }
        }
        return str;
    }

    public static String fillMiddleFromString(String str, String str2, int i10, char c10) {
        if (str == null || str2 == null) {
            return "";
        }
        int length = str2.length() + str.length();
        if (length < i10) {
            while (length < i10) {
                str = str + c10;
                length++;
            }
        }
        return u.f(str, str2);
    }

    public static String firstLetterUpperCase(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1, str.length());
    }

    public static byte[] fromHexString(String str) {
        byte[] bArr = null;
        if (str != null) {
            try {
                int length = str.length();
                bArr = new byte[length / 2];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 2;
                    if (i11 <= length) {
                        bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
                    }
                    i10 = i11;
                }
            } catch (Throwable th2) {
                Logger.e(th2, th2.getMessage(), new Object[0]);
            }
        }
        return bArr;
    }

    public static byte[] getBytes(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e5) {
            throw new IllegalArgumentException(String.format(ENCODING_S_IS_NOT_SUPPORTED_BY_YOUR_JVM, str2), e5);
        }
    }

    public static String getFileNameFromUrl(String str) {
        if (!isNotNullOrEmpty(str)) {
            return "";
        }
        String strSubstring = str.substring(str.lastIndexOf(File.separator) + 1, str.length());
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            iLastIndexOf = strSubstring.length();
        }
        return strSubstring.substring(0, iLastIndexOf);
    }

    public static byte[] getUtf8Bytes(String str) {
        return getBytes(str, "UTF-8");
    }

    public static boolean isEquals(String str, String str2) {
        boolean z10 = isNullOrEmpty(str) && isNotNullOrEmpty(str2);
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null || !str.equals(str2)) {
            return z10;
        }
        return true;
    }

    public static boolean isNotNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String joinStrings(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        if (strArr != null) {
            for (String str : strArr) {
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public static String joinStringsWithSeparator(char c10, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        if (strArr != null) {
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr[i10];
                if (str != null) {
                    if (i10 == length - 1) {
                        sb2.append(str);
                    } else {
                        sb2.append(str);
                        sb2.append(c10);
                    }
                }
            }
        }
        return sb2.toString();
    }

    public static String parseInteger(Integer num) {
        return num != null ? String.valueOf(num) : "";
    }

    public static String removeWhiteSpaces(String str) {
        return isNotNullOrEmpty(str) ? str.replaceAll("\\s", "") : "";
    }

    public static String removeZerosByLeft(String str) {
        return isNotNullOrEmpty(str) ? str.replaceFirst("^0*", "") : "";
    }

    public static String separateSpacesBetweenText(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 == length - 1) {
                    sb2.append(str.charAt(i10));
                } else {
                    sb2.append(str.charAt(i10));
                    sb2.append("  ");
                }
            }
        }
        return sb2.toString();
    }

    public static String toHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr != null) {
            appendHexString(bArr, 0, bArr.length, stringBuffer);
        }
        return stringBuffer.toString();
    }

    public static String truncateString(String str, int i10) {
        return str != null ? str.substring(0, i10) : "";
    }

    public static String separateSpacesBetweenText(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(" ");
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        if (str != null) {
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                if (i12 == length - 1) {
                    sb3.append(str.charAt(i12));
                } else {
                    sb3.append(str.charAt(i12));
                    sb3.append(string);
                }
            }
        }
        return sb3.toString();
    }
}
