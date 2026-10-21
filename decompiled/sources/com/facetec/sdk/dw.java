package com.facetec.sdk;

import com.bbva.notifications.constants.PushConstants;
import java.lang.reflect.Field;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public enum dw implements dz {
    IDENTITY { // from class: com.facetec.sdk.dw.4
        @Override // com.facetec.sdk.dz
        public final String b(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.facetec.sdk.dw.5
        @Override // com.facetec.sdk.dz
        public final String b(Field field) {
            return dw.d(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.facetec.sdk.dw.3
        @Override // com.facetec.sdk.dz
        public final String b(Field field) {
            return dw.d(dw.e(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.facetec.sdk.dw.1
        @Override // com.facetec.sdk.dz
        public final String b(Field field) {
            return dw.e(field.getName(), PushConstants.GE_PARAMS_SEPARATOR).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.facetec.sdk.dw.2
        @Override // com.facetec.sdk.dz
        public final String b(Field field) {
            return dw.e(field.getName(), Constant.DASH_STRING).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.facetec.sdk.dw.9
        @Override // com.facetec.sdk.dz
        public final String b(Field field) {
            return dw.e(field.getName(), Constant.DOT_STRING).toLowerCase(Locale.ENGLISH);
        }
    };

    public static String d(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length) {
            i10++;
        }
        char cCharAt = str.charAt(i10);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(upperCase);
            sb2.append(str.substring(1));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.substring(0, i10));
        sb3.append(upperCase);
        sb3.append(str.substring(i10 + 1));
        return sb3.toString();
    }

    public static String e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* synthetic */ dw(byte b10) {
        this();
    }
}
