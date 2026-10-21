package com.bbva.sl.ar.android.secsdk.fido.model;

import com.google.android.gms.common.util.ArrayUtils;

/* JADX INFO: loaded from: classes8.dex */
public class FidoAuthenticatorTypeValue {
    final String[] biometrics;
    public final String[] biometricsAndroid;
    private final String[] biometricsIos;
    final String[] transparent;
    public final String[] transparentAndroid;
    private final String[] transparentIos;

    public FidoAuthenticatorTypeValue() {
        String[] strArr = {"4e4e#4010", "4e4e#4011", "4e4e#4012", "4e4e#4013", "4e4e#4018", "4e4e#4038", "4e4e#4039", "4e4e#403a", "4e4e#40a1", "4e4e#40aa", "4e4e#40ab", "4e4e#40ac", "4e4e#40ad", "4e4e#40ae", "4e4e#40af"};
        this.biometricsAndroid = strArr;
        String[] strArr2 = {"4e4e#400a", "4e4e#400b", "4e4e#4093", "4e4e#4094"};
        this.biometricsIos = strArr2;
        String[] strArr3 = {"4e4e#403f", "4e4e#4040", "4e4e#4090", "4e4e#4091", "4e4e#4092", "4e4e#40a5"};
        this.transparentAndroid = strArr3;
        String[] strArr4 = {"4e4e#4025", "4e4e#4098"};
        this.transparentIos = strArr4;
        this.biometrics = (String[]) ArrayUtils.concat(strArr, strArr2);
        this.transparent = (String[]) ArrayUtils.concat(strArr3, strArr4);
    }
}
