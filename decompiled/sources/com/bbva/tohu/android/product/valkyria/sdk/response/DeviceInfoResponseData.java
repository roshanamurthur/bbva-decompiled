package com.bbva.tohu.android.product.valkyria.sdk.response;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.TokenResponseData;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoResponseData {
    private String deviceCode;
    private String deviceName;
    private List<TokenResponseData> tokens;

    public String getDeviceCode() {
        return this.deviceCode;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public List<TokenResponseData> getTokens() {
        return this.tokens;
    }

    public void setDeviceCode(String str) {
        this.deviceCode = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setTokens(List<TokenResponseData> list) {
        this.tokens = list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfoResponseData{deviceCode='");
        sb2.append(this.deviceCode);
        sb2.append("', deviceName='");
        sb2.append(this.deviceName);
        sb2.append("', tokens=");
        return a.c(sb2, this.tokens, AbstractJsonLexerKt.END_OBJ);
    }
}
