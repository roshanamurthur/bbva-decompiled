package com.bbva.plugin.showinfo.manager;

import com.bbva.plugin.showinfo.data.TooltipDTO;
import com.bbva.showinfo.model.InfoTooltip;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: InfoManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends Lambda implements Function1<InfoTooltip, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TooltipDTO f36031p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TooltipDTO tooltipDTO) {
        super(1);
        this.f36031p0 = tooltipDTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InfoTooltip infoTooltip) {
        InfoTooltip tooltip = infoTooltip;
        Intrinsics.checkNotNullParameter(tooltip, "$this$tooltip");
        TooltipDTO tooltipDTO = this.f36031p0;
        tooltip.setTitle(tooltipDTO.getTitle());
        tooltip.setSupportingText(tooltipDTO.getSupportingText());
        tooltip.setPositiveButtonText(tooltipDTO.getPositiveButtonText());
        tooltip.setPosition(tooltipDTO.getPosition());
        tooltip.setX(tooltipDTO.getX());
        tooltip.setY(tooltipDTO.getY());
        tooltip.setThemeId(tooltipDTO.getThemeId());
        return Unit.INSTANCE;
    }
}
