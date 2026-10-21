package com.huawei.hms.feature.utils;

import android.text.TextUtils;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.notifications.constants.PushConstants;
import com.huawei.secure.android.common.util.SafeString;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50591a = "fwui_utils";

    private static String a() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getCountry() : "";
    }

    private static String b() {
        int iLastIndexOf;
        String strA = a("ro.product.locale.region", "");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a("ro.product.locale", "");
        if (!TextUtils.isEmpty(strA2) && (iLastIndexOf = strA2.lastIndexOf(PushConstants.GE_PARAMS_SEPARATOR)) != -1) {
            return SafeString.substring(strA2, iLastIndexOf + 1);
        }
        String strA3 = a();
        return !TextUtils.isEmpty(strA3) ? strA3 : "";
    }

    public static boolean c() {
        return LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS.equalsIgnoreCase(b());
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, str2);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e5) {
            Logger.e(f50591a, String.format(Locale.ROOT, "An exception occurred while reading SystemProperties:%s ", str), e5);
        }
        return str2;
    }
}
