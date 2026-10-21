package com.bbva.actionlauncher.plugin.params;

import androidx.annotation.Keep;
import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/actionlauncher/plugin/params/MarketParams;", "", "packageId", "", "platformType", "Lcom/bbva/actionlauncher/model/PlatformType;", "(Ljava/lang/String;Lcom/bbva/actionlauncher/model/PlatformType;)V", "getPackageId", "()Ljava/lang/String;", "getPlatformType", "()Lcom/bbva/actionlauncher/model/PlatformType;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MarketParams {

    @Nullable
    private final String packageId;

    @Nullable
    private final PlatformType platformType;

    public MarketParams(@Nullable String str, @Nullable PlatformType platformType) {
        this.packageId = str;
        this.platformType = platformType;
    }

    public static /* synthetic */ MarketParams copy$default(MarketParams marketParams, String str, PlatformType platformType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = marketParams.packageId;
        }
        if ((i10 & 2) != 0) {
            platformType = marketParams.platformType;
        }
        return marketParams.copy(str, platformType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PlatformType getPlatformType() {
        return this.platformType;
    }

    @NotNull
    public final MarketParams copy(@Nullable String packageId, @Nullable PlatformType platformType) {
        return new MarketParams(packageId, platformType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketParams)) {
            return false;
        }
        MarketParams marketParams = (MarketParams) other;
        return Intrinsics.areEqual(this.packageId, marketParams.packageId) && this.platformType == marketParams.platformType;
    }

    @Nullable
    public final String getPackageId() {
        return this.packageId;
    }

    @Nullable
    public final PlatformType getPlatformType() {
        return this.platformType;
    }

    public int hashCode() {
        String str = this.packageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PlatformType platformType = this.platformType;
        return iHashCode + (platformType != null ? platformType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketParams(packageId=" + this.packageId + ", platformType=" + this.platformType + ")";
    }
}
