package com.bbva.showinfo.model;

import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b<\u0010=J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ^\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R$\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/bbva/showinfo/model/InfoTooltip;", "Lcom/bbva/showinfo/model/InfoElement;", "", "component1", "component2", "component3", "Lcom/bbva/showinfo/model/TooltipArrowPosition;", "component4", "", "component5", "component6", "component7", "()Ljava/lang/Integer;", "title", "supportingText", "positiveButtonText", "position", "x", "y", "themeId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/showinfo/model/TooltipArrowPosition;IILjava/lang/Integer;)Lcom/bbva/showinfo/model/InfoTooltip;", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "b", "getSupportingText", "setSupportingText", "c", "getPositiveButtonText", "setPositiveButtonText", "d", "Lcom/bbva/showinfo/model/TooltipArrowPosition;", "getPosition", "()Lcom/bbva/showinfo/model/TooltipArrowPosition;", "setPosition", "(Lcom/bbva/showinfo/model/TooltipArrowPosition;)V", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getX", "()I", "setX", "(I)V", "f", "getY", "setY", "g", "Ljava/lang/Integer;", "getThemeId", "setThemeId", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/showinfo/model/TooltipArrowPosition;IILjava/lang/Integer;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InfoTooltip extends InfoElement {

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

    public InfoTooltip() {
        this(null, null, null, null, 0, 0, null, 127, null);
    }

    public static /* synthetic */ InfoTooltip copy$default(InfoTooltip infoTooltip, String str, String str2, String str3, TooltipArrowPosition tooltipArrowPosition, int i10, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = infoTooltip.title;
        }
        if ((i12 & 2) != 0) {
            str2 = infoTooltip.supportingText;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = infoTooltip.positiveButtonText;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            tooltipArrowPosition = infoTooltip.position;
        }
        TooltipArrowPosition tooltipArrowPosition2 = tooltipArrowPosition;
        if ((i12 & 16) != 0) {
            i10 = infoTooltip.x;
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = infoTooltip.y;
        }
        int i14 = i11;
        if ((i12 & 64) != 0) {
            num = infoTooltip.themeId;
        }
        return infoTooltip.copy(str, str4, str5, tooltipArrowPosition2, i13, i14, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSupportingText() {
        return this.supportingText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TooltipArrowPosition getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getY() {
        return this.y;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getThemeId() {
        return this.themeId;
    }

    @NotNull
    public final InfoTooltip copy(@Nullable String title, @Nullable String supportingText, @Nullable String positiveButtonText, @NotNull TooltipArrowPosition position, int x4, int y7, @Nullable Integer themeId) {
        Intrinsics.checkNotNullParameter(position, "position");
        return new InfoTooltip(title, supportingText, positiveButtonText, position, x4, y7, themeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoTooltip)) {
            return false;
        }
        InfoTooltip infoTooltip = (InfoTooltip) other;
        return Intrinsics.areEqual(this.title, infoTooltip.title) && Intrinsics.areEqual(this.supportingText, infoTooltip.supportingText) && Intrinsics.areEqual(this.positiveButtonText, infoTooltip.positiveButtonText) && this.position == infoTooltip.position && this.x == infoTooltip.x && this.y == infoTooltip.y && Intrinsics.areEqual(this.themeId, infoTooltip.themeId);
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

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.supportingText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.positiveButtonText;
        int iHashCode3 = (((((this.position.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31) + this.x) * 31) + this.y) * 31;
        Integer num = this.themeId;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
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

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.supportingText;
        String str3 = this.positiveButtonText;
        TooltipArrowPosition tooltipArrowPosition = this.position;
        int i10 = this.x;
        int i11 = this.y;
        Integer num = this.themeId;
        StringBuilder sbC = a.c("InfoTooltip(title=", str, ", supportingText=", str2, ", positiveButtonText=");
        sbC.append(str3);
        sbC.append(", position=");
        sbC.append(tooltipArrowPosition);
        sbC.append(", x=");
        sbC.append(i10);
        sbC.append(", y=");
        sbC.append(i11);
        sbC.append(", themeId=");
        sbC.append(num);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ InfoTooltip(String str, String str2, String str3, TooltipArrowPosition tooltipArrowPosition, int i10, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? TooltipArrowPosition.NONE : tooltipArrowPosition, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoTooltip(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull TooltipArrowPosition position, int i10, int i11, @Nullable Integer num) {
        super(null);
        Intrinsics.checkNotNullParameter(position, "position");
        this.title = str;
        this.supportingText = str2;
        this.positiveButtonText = str3;
        this.position = position;
        this.x = i10;
        this.y = i11;
        this.themeId = num;
    }
}
