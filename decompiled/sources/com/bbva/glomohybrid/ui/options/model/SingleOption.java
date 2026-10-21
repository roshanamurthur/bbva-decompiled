package com.bbva.glomohybrid.ui.options.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Option.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\n\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/model/SingleOption;", "Lcom/bbva/glomohybrid/ui/options/model/Option;", "", "component1", "Lcom/bbva/glomohybrid/ui/options/model/Asset;", "component2", "", "component3", "title", "iconAsset", "isSelected", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/ui/options/model/Asset;", "getIconAsset", "()Lcom/bbva/glomohybrid/ui/options/model/Asset;", "c", "Z", "()Z", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/ui/options/model/Asset;Z)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SingleOption implements Option {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Asset iconAsset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isSelected;

    public SingleOption(@NotNull String title, @Nullable Asset asset, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.iconAsset = asset;
        this.isSelected = z10;
    }

    public static /* synthetic */ SingleOption copy$default(SingleOption singleOption, String str, Asset asset, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = singleOption.title;
        }
        if ((i10 & 2) != 0) {
            asset = singleOption.iconAsset;
        }
        if ((i10 & 4) != 0) {
            z10 = singleOption.isSelected;
        }
        return singleOption.copy(str, asset, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Asset getIconAsset() {
        return this.iconAsset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final SingleOption copy(@NotNull String title, @Nullable Asset iconAsset, boolean isSelected) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new SingleOption(title, iconAsset, isSelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleOption)) {
            return false;
        }
        SingleOption singleOption = (SingleOption) other;
        return Intrinsics.areEqual(this.title, singleOption.title) && Intrinsics.areEqual(this.iconAsset, singleOption.iconAsset) && this.isSelected == singleOption.isSelected;
    }

    @Nullable
    public final Asset getIconAsset() {
        return this.iconAsset;
    }

    @Override // com.bbva.glomohybrid.ui.options.model.Option
    @NotNull
    public String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Asset asset = this.iconAsset;
        int iHashCode2 = (iHashCode + (asset == null ? 0 : asset.hashCode())) * 31;
        boolean z10 = this.isSelected;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    @Override // com.bbva.glomohybrid.ui.options.model.Option
    public boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SingleOption(title=");
        sb2.append(this.title);
        sb2.append(", iconAsset=");
        sb2.append(this.iconAsset);
        sb2.append(", isSelected=");
        return i.c(sb2, this.isSelected, ")");
    }

    @Override // com.bbva.glomohybrid.ui.options.model.Option
    public int type() {
        return Option.DefaultImpls.type(this);
    }

    public /* synthetic */ SingleOption(String str, Asset asset, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : asset, (i10 & 4) != 0 ? false : z10);
    }
}
