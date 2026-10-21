package com.bbva.cellscore.web.model.to_web;

import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PubSubBulkDTO extends PayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(NavigationOperations.UPDATE)
    private List<ChannelMessageDTO> f27168a;

    public PubSubBulkDTO(List<ChannelMessageDTO> list) {
        this.f27168a = list;
    }
}
