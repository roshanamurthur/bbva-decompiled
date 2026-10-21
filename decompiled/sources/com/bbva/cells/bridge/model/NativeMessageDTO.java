package com.bbva.cells.bridge.model;

import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class NativeMessageDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("op")
    private String f26668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BanxicoConstants.KEY_HISTORICAL_PAYLOAD)
    private PayloadDTO f26669b;

    public NativeMessageDTO(String str, PayloadDTO payloadDTO) {
        this.f26668a = str;
        this.f26669b = payloadDTO;
    }
}
