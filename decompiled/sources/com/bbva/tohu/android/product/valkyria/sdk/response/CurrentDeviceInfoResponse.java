package com.bbva.tohu.android.product.valkyria.sdk.response;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class CurrentDeviceInfoResponse {
    List<CurrentDeviceInfo> currentDeviceInfoList;

    public List<CurrentDeviceInfo> getCurrentDeviceInfoList() {
        return this.currentDeviceInfoList;
    }

    public void setCurrentDeviceInfoList(List<CurrentDeviceInfo> list) {
        this.currentDeviceInfoList = list;
    }

    public String toString() {
        return a.c(new StringBuilder("CurrentDeviceInfoResponse{currentDeviceInfoList="), this.currentDeviceInfoList, AbstractJsonLexerKt.END_OBJ);
    }
}
