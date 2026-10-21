package com.bbva.cellscore.web.model.to_web.skip;

import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SkipNavigationDTO extends PayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("navigations")
    private final List<SkipTransitionDTO> f27177a;

    public SkipNavigationDTO(List<SkipTransitionDTO> list) {
        this.f27177a = list;
    }
}
