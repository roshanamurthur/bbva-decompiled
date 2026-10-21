package com.bbva.cells.bridge;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
public class CellsHtmlChannel extends WebMessagePort.WebMessageCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSBridge f26659a;

    public CellsHtmlChannel(JSBridge jSBridge) {
        this.f26659a = jSBridge;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        this.f26659a.postMessage(webMessage.getData());
    }
}
