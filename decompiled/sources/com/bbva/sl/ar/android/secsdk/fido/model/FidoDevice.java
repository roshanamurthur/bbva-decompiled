package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.Nullable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public class FidoDevice {

    @Nullable
    private AppInfo appInfo;
    private List<FidoAuthenticator> fidoAuthenticators;
    private FidoDeviceInfo fidoDeviceInfo;

    public FidoDevice(FidoDeviceInfo fidoDeviceInfo, @Nullable AppInfo appInfo, List<FidoAuthenticator> list) {
        this.fidoDeviceInfo = fidoDeviceInfo;
        this.appInfo = appInfo;
        this.fidoAuthenticators = list;
    }

    @Nullable
    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    public List<FidoAuthenticator> getFidoAuthenticators() {
        return this.fidoAuthenticators;
    }

    public FidoDeviceInfo getFidoDeviceInfo() {
        return this.fidoDeviceInfo;
    }

    public String toString() {
        if (this.appInfo == null) {
            return "FidoDevice{" + this.fidoDeviceInfo.toString() + Constant.DASH_STRING + this.fidoAuthenticators.toString() + AbstractJsonLexerKt.END_OBJ;
        }
        return "FidoDevice{" + this.fidoDeviceInfo.toString() + Constant.DASH_STRING + this.appInfo.toString() + Constant.DASH_STRING + this.fidoAuthenticators.toString() + AbstractJsonLexerKt.END_OBJ;
    }
}
