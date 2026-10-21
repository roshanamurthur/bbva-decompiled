package com.bbva.ethermobilesdk.deviceinfo.data;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddressSet;", "", "Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddress;", "component1", "component2", "ipV4", "ipV6", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddress;", "getIpV4", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddress;", "b", "getIpV6", "<init>", "(Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddress;Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddress;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class IpAddressSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IpAddress ipV4;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IpAddress ipV6;

    public IpAddressSet(@NotNull IpAddress ipV4, @NotNull IpAddress ipV6) {
        Intrinsics.checkNotNullParameter(ipV4, "ipV4");
        Intrinsics.checkNotNullParameter(ipV6, "ipV6");
        this.ipV4 = ipV4;
        this.ipV6 = ipV6;
    }

    public static /* synthetic */ IpAddressSet copy$default(IpAddressSet ipAddressSet, IpAddress ipAddress, IpAddress ipAddress2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ipAddress = ipAddressSet.ipV4;
        }
        if ((i10 & 2) != 0) {
            ipAddress2 = ipAddressSet.ipV6;
        }
        return ipAddressSet.copy(ipAddress, ipAddress2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IpAddress getIpV4() {
        return this.ipV4;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IpAddress getIpV6() {
        return this.ipV6;
    }

    @NotNull
    public final IpAddressSet copy(@NotNull IpAddress ipV4, @NotNull IpAddress ipV6) {
        Intrinsics.checkNotNullParameter(ipV4, "ipV4");
        Intrinsics.checkNotNullParameter(ipV6, "ipV6");
        return new IpAddressSet(ipV4, ipV6);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IpAddressSet)) {
            return false;
        }
        IpAddressSet ipAddressSet = (IpAddressSet) other;
        return Intrinsics.areEqual(this.ipV4, ipAddressSet.ipV4) && Intrinsics.areEqual(this.ipV6, ipAddressSet.ipV6);
    }

    @NotNull
    public final IpAddress getIpV4() {
        return this.ipV4;
    }

    @NotNull
    public final IpAddress getIpV6() {
        return this.ipV6;
    }

    public int hashCode() {
        return this.ipV6.hashCode() + (this.ipV4.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "IpAddressSet(ipV4=" + this.ipV4 + ", ipV6=" + this.ipV6 + ")";
    }
}
