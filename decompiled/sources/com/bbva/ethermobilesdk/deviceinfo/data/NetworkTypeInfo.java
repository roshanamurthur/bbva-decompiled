package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/NetworkTypeInfo;", "", "networkConnection", "Lcom/bbva/ethermobilesdk/deviceinfo/data/NetworkConnection;", "ipAddressV4", "", "ipAddressV6", "isConnected", "", "isCaptivePortal", "(Lcom/bbva/ethermobilesdk/deviceinfo/data/NetworkConnection;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getIpAddressV4", "()Ljava/lang/String;", "getIpAddressV6", "()Z", "getNetworkConnection", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/NetworkConnection;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NetworkTypeInfo {

    @SerializedName("ipAddressV4")
    @NotNull
    private final String ipAddressV4;

    @SerializedName("ipAddressV6")
    @NotNull
    private final String ipAddressV6;
    private final boolean isCaptivePortal;
    private final boolean isConnected;

    @NotNull
    private final NetworkConnection networkConnection;

    public NetworkTypeInfo(@NotNull NetworkConnection networkConnection, @NotNull String ipAddressV4, @NotNull String ipAddressV6, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(networkConnection, "networkConnection");
        Intrinsics.checkNotNullParameter(ipAddressV4, "ipAddressV4");
        Intrinsics.checkNotNullParameter(ipAddressV6, "ipAddressV6");
        this.networkConnection = networkConnection;
        this.ipAddressV4 = ipAddressV4;
        this.ipAddressV6 = ipAddressV6;
        this.isConnected = z10;
        this.isCaptivePortal = z11;
    }

    public static /* synthetic */ NetworkTypeInfo copy$default(NetworkTypeInfo networkTypeInfo, NetworkConnection networkConnection, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkConnection = networkTypeInfo.networkConnection;
        }
        if ((i10 & 2) != 0) {
            str = networkTypeInfo.ipAddressV4;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = networkTypeInfo.ipAddressV6;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            z10 = networkTypeInfo.isConnected;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = networkTypeInfo.isCaptivePortal;
        }
        return networkTypeInfo.copy(networkConnection, str3, str4, z12, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkConnection getNetworkConnection() {
        return this.networkConnection;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIpAddressV4() {
        return this.ipAddressV4;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIpAddressV6() {
        return this.ipAddressV6;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsCaptivePortal() {
        return this.isCaptivePortal;
    }

    @NotNull
    public final NetworkTypeInfo copy(@NotNull NetworkConnection networkConnection, @NotNull String ipAddressV4, @NotNull String ipAddressV6, boolean isConnected, boolean isCaptivePortal) {
        Intrinsics.checkNotNullParameter(networkConnection, "networkConnection");
        Intrinsics.checkNotNullParameter(ipAddressV4, "ipAddressV4");
        Intrinsics.checkNotNullParameter(ipAddressV6, "ipAddressV6");
        return new NetworkTypeInfo(networkConnection, ipAddressV4, ipAddressV6, isConnected, isCaptivePortal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkTypeInfo)) {
            return false;
        }
        NetworkTypeInfo networkTypeInfo = (NetworkTypeInfo) other;
        return Intrinsics.areEqual(this.networkConnection, networkTypeInfo.networkConnection) && Intrinsics.areEqual(this.ipAddressV4, networkTypeInfo.ipAddressV4) && Intrinsics.areEqual(this.ipAddressV6, networkTypeInfo.ipAddressV6) && this.isConnected == networkTypeInfo.isConnected && this.isCaptivePortal == networkTypeInfo.isCaptivePortal;
    }

    @NotNull
    public final String getIpAddressV4() {
        return this.ipAddressV4;
    }

    @NotNull
    public final String getIpAddressV6() {
        return this.ipAddressV6;
    }

    @NotNull
    public final NetworkConnection getNetworkConnection() {
        return this.networkConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iC = n1.c(this.ipAddressV6, n1.c(this.ipAddressV4, this.networkConnection.hashCode() * 31, 31), 31);
        boolean z10 = this.isConnected;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iC + r3) * 31;
        boolean z11 = this.isCaptivePortal;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isCaptivePortal() {
        return this.isCaptivePortal;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    @NotNull
    public String toString() {
        NetworkConnection networkConnection = this.networkConnection;
        String str = this.ipAddressV4;
        String str2 = this.ipAddressV6;
        boolean z10 = this.isConnected;
        boolean z11 = this.isCaptivePortal;
        StringBuilder sb2 = new StringBuilder("NetworkTypeInfo(networkConnection=");
        sb2.append(networkConnection);
        sb2.append(", ipAddressV4=");
        sb2.append(str);
        sb2.append(", ipAddressV6=");
        sb2.append(str2);
        sb2.append(", isConnected=");
        sb2.append(z10);
        sb2.append(", isCaptivePortal=");
        return i.c(sb2, z11, ")");
    }

    public /* synthetic */ NetworkTypeInfo(NetworkConnection networkConnection, String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkConnection, str, str2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
