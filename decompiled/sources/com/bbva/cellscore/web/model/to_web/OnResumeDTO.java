package com.bbva.cellscore.web.model.to_web;

import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class OnResumeDTO extends PayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("willAppear")
    private boolean f27167a;

    public OnResumeDTO(boolean z10) {
        this.f27167a = z10;
    }
}
