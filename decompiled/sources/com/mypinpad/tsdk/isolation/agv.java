package com.mypinpad.tsdk.isolation;

import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class agv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52631a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52632b = 1;
    public static Locale setDividerPadding;

    static {
        new HashMap();
        setDividerPadding = (Locale) setOnFocusChangeListener(new Object[0], -1728249780, 1728249780, (int) System.currentTimeMillis());
        int i10 = f52631a;
        int i11 = ((((i10 ^ 53) | (i10 & 53)) << 1) - (~(-(((~i10) & 53) | (i10 & (-54)))))) - 1;
        f52632b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Locale locale;
        int i13 = f52631a;
        int i14 = i13 & 59;
        int i15 = ((i13 ^ 59) | i14) << 1;
        int i16 = -((i13 | 59) & (~i14));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f52632b = i17 % 128;
        int i18 = i17 % 2;
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            int i19 = f52632b;
            int i20 = (i19 & 102) + (i19 | 102);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f52631a = i21 % 128;
            if (i21 % 2 != 0) {
                Locale.getDefault();
                throw null;
            }
            Locale locale2 = Locale.getDefault();
            int i22 = f52631a;
            int i23 = i22 & 75;
            int i24 = (((i22 | 75) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
            f52632b = i24 % 128;
            if (i24 % 2 != 0) {
                return locale2;
            }
            int i25 = 15 / 0;
            return locale2;
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        int i26 = f52632b;
        int i27 = i26 & 39;
        int i28 = i27 + ((i26 ^ 39) | i27);
        f52631a = i28 % 128;
        int i29 = i28 % 2;
        int i30 = 0;
        while (i30 != availableLocales.length) {
            int i31 = f52631a;
            int i32 = ((i31 & (-76)) | ((~i31) & 75)) + ((i31 & 75) << 1);
            f52632b = i32 % 128;
            int i33 = i32 % 2;
            if ("en".equalsIgnoreCase(availableLocales[i30].getLanguage())) {
                int i34 = f52631a;
                int i35 = (i34 ^ 7) + ((i34 & 7) << 1);
                f52632b = i35 % 128;
                if (i35 % 2 == 0) {
                    locale = availableLocales[i30];
                    int i36 = 90 / 0;
                } else {
                    locale = availableLocales[i30];
                }
                int i37 = ((i34 ^ 10) + ((i34 & 10) << 1)) - 1;
                f52632b = i37 % 128;
                if (i37 % 2 != 0) {
                    return locale;
                }
                throw null;
            }
            int i38 = (((i30 | (-56)) << 1) - (i30 ^ (-56))) - 1;
            int i39 = (i38 & (-59)) | ((~i38) & 58);
            int i40 = (i38 & 58) << 1;
            i30 = (i39 | i40) + (i39 & i40);
            int i41 = f52631a;
            int i42 = (-2) - ((((i41 | 86) << 1) - (i41 ^ 86)) ^ (-1));
            f52632b = i42 % 128;
            int i43 = i42 % 2;
        }
        Locale locale3 = Locale.getDefault();
        int i44 = f52632b;
        int i45 = ((i44 ^ 97) - (~(-(-((i44 & 97) << 1))))) - 1;
        f52631a = i45 % 128;
        int i46 = i45 % 2;
        return locale3;
    }
}
