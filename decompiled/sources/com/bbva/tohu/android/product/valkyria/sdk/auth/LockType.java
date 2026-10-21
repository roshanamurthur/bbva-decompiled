package com.bbva.tohu.android.product.valkyria.sdk.auth;

import android.content.ContentResolver;
import android.provider.Settings;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;

/* JADX INFO: loaded from: classes6.dex */
public class LockType {
    public static final int BIOMETRIC = 2;
    public static final int FACE_WITH_PATTERN = 3;
    public static final int FACE_WITH_PIN = 4;
    public static final int FACE_WITH_SOMETHING_ELSE = 9;
    public static final int NONE_OR_SLIDER = 1;
    public static final int PASSWORD_ALPHABETIC = 12;
    public static final int PASSWORD_ALPHANUMERIC = 13;
    private static final String PASSWORD_TYPE_KEY = "lockscreen.password_type";
    public static final int PATTERN = 10;
    public static final int PIN = 11;
    public static final int SOMETHING_ELSE = 0;

    public static int getCurrent(ContentResolver contentResolver) {
        long j10 = Settings.Secure.getLong(contentResolver, PASSWORD_TYPE_KEY, SvgConstantsKt.SPECIFIED_FONT_STYLE);
        if (j10 == SvgConstantsKt.SPECIFIED_FONT_STYLE) {
            return Settings.Secure.getInt(contentResolver, "lock_pattern_autolock", 0) == 1 ? 10 : 1;
        }
        if (j10 == SvgConstantsKt.SPECIFIED_FONT_WEIGHT) {
            return 2;
        }
        if (j10 == 327680) {
            return 13;
        }
        if (j10 == SvgConstantsKt.SPECIFIED_TEXT_ANCHOR) {
            return 12;
        }
        return j10 == SvgConstantsKt.SPECIFIED_TEXT_DECORATION ? 11 : 0;
    }
}
