package com.bbva.plugin.showinfo.data;

import com.bbva.showinfo.model.TooltipArrowPosition;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TooltipDTO.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010!\u001a\u00020\u001a\u0012\b\b\u0002\u0010%\u001a\u00020\u001a\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b-\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R$\u0010,\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/bbva/plugin/showinfo/data/TooltipDTO;", "", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "b", "getSupportingText", "setSupportingText", "supportingText", "c", "getPositiveButtonText", "setPositiveButtonText", "positiveButtonText", "Lcom/bbva/showinfo/model/TooltipArrowPosition;", "d", "Lcom/bbva/showinfo/model/TooltipArrowPosition;", "getPosition", "()Lcom/bbva/showinfo/model/TooltipArrowPosition;", "setPosition", "(Lcom/bbva/showinfo/model/TooltipArrowPosition;)V", "position", "", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getX", "()I", "setX", "(I)V", "x", "f", "getY", "setY", "y", "g", "Ljava/lang/Integer;", "getThemeId", "()Ljava/lang/Integer;", "setThemeId", "(Ljava/lang/Integer;)V", "themeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/showinfo/model/TooltipArrowPosition;IILjava/lang/Integer;)V", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class TooltipDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String supportingText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String positiveButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TooltipArrowPosition position;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int x;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int y;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer themeId;

    public TooltipDTO(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull TooltipArrowPosition position, int i10, int i11, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.title = str;
        this.supportingText = str2;
        this.positiveButtonText = str3;
        this.position = position;
        this.x = i10;
        this.y = i11;
        this.themeId = num;
    }

    @NotNull
    public final TooltipArrowPosition getPosition() {
        return this.position;
    }

    @Nullable
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    @Nullable
    public final String getSupportingText() {
        return this.supportingText;
    }

    @Nullable
    public final Integer getThemeId() {
        return this.themeId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final void setPosition(@NotNull TooltipArrowPosition tooltipArrowPosition) {
        Intrinsics.checkNotNullParameter(tooltipArrowPosition, "<set-?>");
        this.position = tooltipArrowPosition;
    }

    public final void setPositiveButtonText(@Nullable String str) {
        this.positiveButtonText = str;
    }

    public final void setSupportingText(@Nullable String str) {
        this.supportingText = str;
    }

    public final void setThemeId(@Nullable Integer num) {
        this.themeId = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setX(int i10) {
        this.x = i10;
    }

    public final void setY(int i10) {
        this.y = i10;
    }

    public /* synthetic */ TooltipDTO(String str, String str2, String str3, TooltipArrowPosition tooltipArrowPosition, int i10, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, tooltipArrowPosition, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? null : num);
    }
}
