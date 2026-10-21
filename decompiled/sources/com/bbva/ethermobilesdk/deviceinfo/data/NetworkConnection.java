package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/NetworkConnection;", "", "networkName", "", "networkCode", "", "dataNetworkType", "networkSignalStrength", "proxy", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Proxy;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lcom/bbva/ethermobilesdk/deviceinfo/data/Proxy;)V", "getDataNetworkType", "()Ljava/lang/String;", "getNetworkCode", "()I", "getNetworkName", "getNetworkSignalStrength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProxy", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/Proxy;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lcom/bbva/ethermobilesdk/deviceinfo/data/Proxy;)Lcom/bbva/ethermobilesdk/deviceinfo/data/NetworkConnection;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NetworkConnection {

    @Nullable
    private final String dataNetworkType;
    private final int networkCode;

    @NotNull
    private final String networkName;

    @Nullable
    private final Integer networkSignalStrength;

    @Nullable
    private final Proxy proxy;

    public NetworkConnection(@NotNull String networkName, int i10, @Nullable String str, @Nullable Integer num, @Nullable Proxy proxy) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        this.networkName = networkName;
        this.networkCode = i10;
        this.dataNetworkType = str;
        this.networkSignalStrength = num;
        this.proxy = proxy;
    }

    public static /* synthetic */ NetworkConnection copy$default(NetworkConnection networkConnection, String str, int i10, String str2, Integer num, Proxy proxy, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = networkConnection.networkName;
        }
        if ((i11 & 2) != 0) {
            i10 = networkConnection.networkCode;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = networkConnection.dataNetworkType;
        }
        String str3 = str2;
        if ((i11 & 8) != 0) {
            num = networkConnection.networkSignalStrength;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            proxy = networkConnection.proxy;
        }
        return networkConnection.copy(str, i12, str3, num2, proxy);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNetworkCode() {
        return this.networkCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataNetworkType() {
        return this.dataNetworkType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getNetworkSignalStrength() {
        return this.networkSignalStrength;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @NotNull
    public final NetworkConnection copy(@NotNull String networkName, int networkCode, @Nullable String dataNetworkType, @Nullable Integer networkSignalStrength, @Nullable Proxy proxy) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        return new NetworkConnection(networkName, networkCode, dataNetworkType, networkSignalStrength, proxy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkConnection)) {
            return false;
        }
        NetworkConnection networkConnection = (NetworkConnection) other;
        return Intrinsics.areEqual(this.networkName, networkConnection.networkName) && this.networkCode == networkConnection.networkCode && Intrinsics.areEqual(this.dataNetworkType, networkConnection.dataNetworkType) && Intrinsics.areEqual(this.networkSignalStrength, networkConnection.networkSignalStrength) && Intrinsics.areEqual(this.proxy, networkConnection.proxy);
    }

    @Nullable
    public final String getDataNetworkType() {
        return this.dataNetworkType;
    }

    public final int getNetworkCode() {
        return this.networkCode;
    }

    @NotNull
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final Integer getNetworkSignalStrength() {
        return this.networkSignalStrength;
    }

    @Nullable
    public final Proxy getProxy() {
        return this.proxy;
    }

    public int hashCode() {
        int iHashCode = ((this.networkName.hashCode() * 31) + this.networkCode) * 31;
        String str = this.dataNetworkType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.networkSignalStrength;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Proxy proxy = this.proxy;
        return iHashCode3 + (proxy != null ? proxy.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NetworkConnection(networkName=" + this.networkName + ", networkCode=" + this.networkCode + ", dataNetworkType=" + this.dataNetworkType + ", networkSignalStrength=" + this.networkSignalStrength + ", proxy=" + this.proxy + ")";
    }

    public /* synthetic */ NetworkConnection(String str, int i10, String str2, Integer num, Proxy proxy, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : proxy);
    }
}
