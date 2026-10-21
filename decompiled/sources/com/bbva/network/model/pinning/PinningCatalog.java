package com.bbva.network.model.pinning;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningGlobalEnvironment;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinningCatalog.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\nR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\r¨\u0006-"}, d2 = {"Lcom/bbva/network/model/pinning/PinningCatalog;", "", "", "component1", "", "component2", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;", "component3", "", "component4", "()Ljava/lang/Long;", "", "component5", "()Ljava/lang/Boolean;", "resCatalog", "assetCatalog", "mode", "updateInterval", "resetData", "copy", "(ILjava/lang/String;Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/bbva/network/model/pinning/PinningCatalog;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getResCatalog", "()I", "b", "Ljava/lang/String;", "getAssetCatalog", "()Ljava/lang/String;", "c", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;", "getMode", "()Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;", "d", "Ljava/lang/Long;", "getUpdateInterval", "e", "Ljava/lang/Boolean;", "getResetData", "<init>", "(ILjava/lang/String;Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;Ljava/lang/Long;Ljava/lang/Boolean;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PinningCatalog {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int resCatalog;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String assetCatalog;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinningGlobalEnvironment mode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long updateInterval;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean resetData;

    public PinningCatalog(int i10, @NotNull String assetCatalog, @NotNull PinningGlobalEnvironment mode, @Nullable Long l6, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(assetCatalog, "assetCatalog");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.resCatalog = i10;
        this.assetCatalog = assetCatalog;
        this.mode = mode;
        this.updateInterval = l6;
        this.resetData = bool;
    }

    public static /* synthetic */ PinningCatalog copy$default(PinningCatalog pinningCatalog, int i10, String str, PinningGlobalEnvironment pinningGlobalEnvironment, Long l6, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = pinningCatalog.resCatalog;
        }
        if ((i11 & 2) != 0) {
            str = pinningCatalog.assetCatalog;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            pinningGlobalEnvironment = pinningCatalog.mode;
        }
        PinningGlobalEnvironment pinningGlobalEnvironment2 = pinningGlobalEnvironment;
        if ((i11 & 8) != 0) {
            l6 = pinningCatalog.updateInterval;
        }
        Long l7 = l6;
        if ((i11 & 16) != 0) {
            bool = pinningCatalog.resetData;
        }
        return pinningCatalog.copy(i10, str2, pinningGlobalEnvironment2, l7, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResCatalog() {
        return this.resCatalog;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAssetCatalog() {
        return this.assetCatalog;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PinningGlobalEnvironment getMode() {
        return this.mode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getUpdateInterval() {
        return this.updateInterval;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getResetData() {
        return this.resetData;
    }

    @NotNull
    public final PinningCatalog copy(int resCatalog, @NotNull String assetCatalog, @NotNull PinningGlobalEnvironment mode, @Nullable Long updateInterval, @Nullable Boolean resetData) {
        Intrinsics.checkNotNullParameter(assetCatalog, "assetCatalog");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new PinningCatalog(resCatalog, assetCatalog, mode, updateInterval, resetData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinningCatalog)) {
            return false;
        }
        PinningCatalog pinningCatalog = (PinningCatalog) other;
        return this.resCatalog == pinningCatalog.resCatalog && Intrinsics.areEqual(this.assetCatalog, pinningCatalog.assetCatalog) && this.mode == pinningCatalog.mode && Intrinsics.areEqual(this.updateInterval, pinningCatalog.updateInterval) && Intrinsics.areEqual(this.resetData, pinningCatalog.resetData);
    }

    @NotNull
    public final String getAssetCatalog() {
        return this.assetCatalog;
    }

    @NotNull
    public final PinningGlobalEnvironment getMode() {
        return this.mode;
    }

    public final int getResCatalog() {
        return this.resCatalog;
    }

    @Nullable
    public final Boolean getResetData() {
        return this.resetData;
    }

    @Nullable
    public final Long getUpdateInterval() {
        return this.updateInterval;
    }

    public int hashCode() {
        int iHashCode = (this.mode.hashCode() + n1.c(this.assetCatalog, this.resCatalog * 31, 31)) * 31;
        Long l6 = this.updateInterval;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool = this.resetData;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PinningCatalog(resCatalog=" + this.resCatalog + ", assetCatalog=" + this.assetCatalog + ", mode=" + this.mode + ", updateInterval=" + this.updateInterval + ", resetData=" + this.resetData + ")";
    }

    public /* synthetic */ PinningCatalog(int i10, String str, PinningGlobalEnvironment pinningGlobalEnvironment, Long l6, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, pinningGlobalEnvironment, (i11 & 8) != 0 ? null : l6, (i11 & 16) != 0 ? null : bool);
    }
}
