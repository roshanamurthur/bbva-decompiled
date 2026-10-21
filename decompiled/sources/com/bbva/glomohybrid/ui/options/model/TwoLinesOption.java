package com.bbva.glomohybrid.ui.options.model;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Option.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J3\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\f\u0010 ¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/model/TwoLinesOption;", "Lcom/bbva/glomohybrid/ui/options/model/Option;", "", "component1", "component2", "Lcom/bbva/glomohybrid/ui/options/model/Asset;", "component3", "", "component4", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "iconAsset", "isSelected", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getSubtitle", "c", "Lcom/bbva/glomohybrid/ui/options/model/Asset;", "getIconAsset", "()Lcom/bbva/glomohybrid/ui/options/model/Asset;", "d", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomohybrid/ui/options/model/Asset;Z)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class TwoLinesOption implements Option {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Asset iconAsset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isSelected;

    public TwoLinesOption(@NotNull String title, @NotNull String subtitle, @Nullable Asset asset, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.iconAsset = asset;
        this.isSelected = z10;
    }

    public static /* synthetic */ TwoLinesOption copy$default(TwoLinesOption twoLinesOption, String str, String str2, Asset asset, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = twoLinesOption.title;
        }
        if ((i10 & 2) != 0) {
            str2 = twoLinesOption.subtitle;
        }
        if ((i10 & 4) != 0) {
            asset = twoLinesOption.iconAsset;
        }
        if ((i10 & 8) != 0) {
            z10 = twoLinesOption.isSelected;
        }
        return twoLinesOption.copy(str, str2, asset, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Asset getIconAsset() {
        return this.iconAsset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final TwoLinesOption copy(@NotNull String title, @NotNull String subtitle, @Nullable Asset iconAsset, boolean isSelected) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new TwoLinesOption(title, subtitle, iconAsset, isSelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwoLinesOption)) {
            return false;
        }
        TwoLinesOption twoLinesOption = (TwoLinesOption) other;
        return Intrinsics.areEqual(this.title, twoLinesOption.title) && Intrinsics.areEqual(this.subtitle, twoLinesOption.subtitle) && Intrinsics.areEqual(this.iconAsset, twoLinesOption.iconAsset) && this.isSelected == twoLinesOption.isSelected;
    }

    @Nullable
    public final Asset getIconAsset() {
        return this.iconAsset;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // com.bbva.glomohybrid.ui.options.model.Option
    @NotNull
    public String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.subtitle, this.title.hashCode() * 31, 31);
        Asset asset = this.iconAsset;
        int iHashCode = (iC + (asset == null ? 0 : asset.hashCode())) * 31;
        boolean z10 = this.isSelected;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @Override // com.bbva.glomohybrid.ui.options.model.Option
    public boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TwoLinesOption(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", iconAsset=");
        sb2.append(this.iconAsset);
        sb2.append(", isSelected=");
        return i.c(sb2, this.isSelected, ")");
    }

    @Override // com.bbva.glomohybrid.ui.options.model.Option
    public int type() {
        return Option.DefaultImpls.type(this);
    }

    public /* synthetic */ TwoLinesOption(String str, String str2, Asset asset, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : asset, (i10 & 8) != 0 ? false : z10);
    }
}
