package com.bbva.biometrics.authenticator.data;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricType.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/BiometricType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FACE", "FINGERPRINT", ExpectedUserActionOnPoiTypes.NONE, "biometrics_release"}, k = 1, mv = {1, 5, 1})
public enum BiometricType {
    FACE("face"),
    FINGERPRINT("fingerprint"),
    NONE("none");


    @NotNull
    private final String value;

    BiometricType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
