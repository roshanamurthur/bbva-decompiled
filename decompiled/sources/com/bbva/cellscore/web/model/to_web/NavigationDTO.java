package com.bbva.cellscore.web.model.to_web;

import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationDTO extends PayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("page")
    private String f27163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("params")
    private Object f27164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("options")
    private NavigationOptions f27165c;

    public NavigationDTO(String str, Object obj, NavigationOptions navigationOptions) {
        this.f27163a = str;
        this.f27164b = obj;
        this.f27165c = navigationOptions;
    }
}
