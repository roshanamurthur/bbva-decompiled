package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1bSDK {
    private static int AFInAppEventParameterName = 0;
    private static long AFInAppEventType = 0;
    private static int valueOf = 1;
    private static char[] values;

    static {
        AFKeystoreWrapper();
        KeyEvent.getDeadChar(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getJumpTapTimeout();
        int i10 = valueOf + 55;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @NonNull
    private static AFf1rSDK AFInAppEventType(@NonNull AFf1vSDK aFf1vSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String string;
        if (str == null) {
            return new AFf1rSDK(aFf1vSDK.valueOf == AFf1xSDK.DEFAULT, AFf1sSDK.NA);
        }
        Object[] objArr = new Object[1];
        values(65 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 57189), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFf1vSDK.valueOf == AFf1xSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = AFKeystoreWrapper(new StringBuilder(str3).reverse().toString(), aFf1vSDK.AFInAppEventParameterName, "android", ConfigConstantsKt.CUSTOMERS_API_VERSION, string).equals(str);
        return new AFf1rSDK(zEquals, zEquals ? AFf1sSDK.SUCCESS : AFf1sSDK.FAILURE);
    }

    public static void AFKeystoreWrapper() {
        values = new char[]{57174, 64449, 38524, 45715, 19722, 27040, 1240, 57202, 64494, 38419, 45748, 19745, 26691, 1274, 57107, 64398, 38439, 45396, 19919, 26725, 1179, 57151, 64427, 38604, 45433, 19946, 26631, 1228, 57303, 64077, 38626, 45341, 19891, 26660, 862, 57332, 64111, 38647, 45370, 19539, 26827, 783, 57238, 64121, 38566, 45535, 19572, 26856, 770, 57270, 64040, 38215, 45566, 19473, 26765, 805, 56922, 64187, 38241, 45469, 19509, 26797, 965, 56845};
        AFInAppEventType = -6336437974626589545L;
    }

    private static void values(int i10, int i11, char c10, Object[] objArr) {
        String str;
        synchronized (AFg1iSDK.valueOf) {
            try {
                char[] cArr = new char[i10];
                AFg1iSDK.values = 0;
                while (true) {
                    int i12 = AFg1iSDK.values;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((((long) values[i11 + i12]) ^ (((long) i12) * AFInAppEventType)) ^ ((long) c10));
                        AFg1iSDK.values = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    @NonNull
    public final AFf1rSDK AFKeystoreWrapper(@NonNull AFf1vSDK aFf1vSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        int i10 = valueOf;
        int i11 = i10 + 87;
        AFInAppEventParameterName = i11 % 128;
        int i12 = i11 % 2;
        if (aFf1vSDK != null) {
            int i13 = i10 + 53;
            AFInAppEventParameterName = i13 % 128;
            int i14 = i13 % 2;
            if (str2 != null) {
                int i15 = i10 + 111;
                int i16 = i15 % 128;
                AFInAppEventParameterName = i16;
                int i17 = i15 % 2;
                if (str3 != null) {
                    int i18 = i16 + 61;
                    valueOf = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = i16 + 1;
                    valueOf = i20 % 128;
                    int i21 = i20 % 2;
                    AFf1rSDK aFf1rSDKAFInAppEventType = AFInAppEventType(aFf1vSDK, str, str2, str3);
                    int i22 = AFInAppEventParameterName + 95;
                    valueOf = i22 % 128;
                    int i23 = i22 % 2;
                    return aFf1rSDKAFInAppEventType;
                }
            }
        }
        int i24 = i10 + 23;
        AFInAppEventParameterName = i24 % 128;
        int i25 = i24 % 2;
        return new AFf1rSDK(false, AFf1sSDK.INTERNAL_ERROR);
    }

    @VisibleForTesting
    private static String AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5) {
        String strAFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.values(str2, str3, str4, str5, ""), str);
        if (strAFKeystoreWrapper.length() >= 12) {
            return strAFKeystoreWrapper.substring(0, 12);
        }
        int i10 = valueOf + 33;
        int i11 = i10 % 128;
        AFInAppEventParameterName = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 101;
        valueOf = i13 % 128;
        if (i13 % 2 != 0) {
            return strAFKeystoreWrapper;
        }
        throw null;
    }
}
