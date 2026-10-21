package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class IccCrtPrivateKeyContainer {
    private IccCrtPrivateKey iccCRTPrivateKey;

    public IccCrtPrivateKey getIccCRTPrivateKey() {
        return this.iccCRTPrivateKey;
    }

    public void setIccCRTPrivateKey(IccCrtPrivateKey iccCrtPrivateKey) {
        this.iccCRTPrivateKey = iccCrtPrivateKey;
    }

    public String toString() {
        return "IccCrtPrivateKeyContainer{iccCRTPrivateKey=" + this.iccCRTPrivateKey + AbstractJsonLexerKt.END_OBJ;
    }
}
