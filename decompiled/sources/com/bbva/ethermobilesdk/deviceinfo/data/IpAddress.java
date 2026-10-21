package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddress;", "", "address", "", "version", "Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddressVersion;", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddressVersion;)V", "getAddress", "()Ljava/lang/String;", "getVersion", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddressVersion;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IpAddress {

    @NotNull
    private final String address;

    @NotNull
    private final IpAddressVersion version;

    public IpAddress(@NotNull String address, @NotNull IpAddressVersion version) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(version, "version");
        this.address = address;
        this.version = version;
    }

    public static /* synthetic */ IpAddress copy$default(IpAddress ipAddress, String str, IpAddressVersion ipAddressVersion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ipAddress.address;
        }
        if ((i10 & 2) != 0) {
            ipAddressVersion = ipAddress.version;
        }
        return ipAddress.copy(str, ipAddressVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IpAddressVersion getVersion() {
        return this.version;
    }

    @NotNull
    public final IpAddress copy(@NotNull String address, @NotNull IpAddressVersion version) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(version, "version");
        return new IpAddress(address, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IpAddress)) {
            return false;
        }
        IpAddress ipAddress = (IpAddress) other;
        return Intrinsics.areEqual(this.address, ipAddress.address) && this.version == ipAddress.version;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final IpAddressVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.address.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "IpAddress(address=" + this.address + ", version=" + this.version + ")";
    }
}
