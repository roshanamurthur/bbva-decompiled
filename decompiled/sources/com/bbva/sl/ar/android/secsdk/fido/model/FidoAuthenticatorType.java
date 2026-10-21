package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public enum FidoAuthenticatorType {
    FINGERPRINT("Fingerprint", new FidoAuthenticatorTypeValue().biometrics),
    SILENT("Silent", new FidoAuthenticatorTypeValue().transparent),
    BIOMETRICS("Biometrics", new FidoAuthenticatorTypeValue().biometrics),
    TRANSPARENT("Transparent", new FidoAuthenticatorTypeValue().transparent);

    private final String[] aaids;
    private final String name;

    FidoAuthenticatorType(String str, String[] strArr) {
        this.name = str;
        this.aaids = strArr;
    }

    @Nullable
    public static FidoAuthenticatorType authenticatorTypeFromAaid(String str) {
        try {
            FidoAuthenticatorTypeValue fidoAuthenticatorTypeValue = new FidoAuthenticatorTypeValue();
            if (Arrays.asList(fidoAuthenticatorTypeValue.biometricsAndroid).contains(str)) {
                return BIOMETRICS;
            }
            if (Arrays.asList(fidoAuthenticatorTypeValue.transparentAndroid).contains(str)) {
                return TRANSPARENT;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static FidoAuthenticatorType[] getValues() {
        return (FidoAuthenticatorType[]) FidoAuthenticatorType.class.getEnumConstants();
    }

    public String getName() {
        return this.name;
    }

    public boolean matchesAaid(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : this.aaids) {
                if (str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
