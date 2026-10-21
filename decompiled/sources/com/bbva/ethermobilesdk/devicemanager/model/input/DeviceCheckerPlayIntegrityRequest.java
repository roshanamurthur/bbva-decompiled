package com.bbva.ethermobilesdk.devicemanager.model.input;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceCheckerPlayIntegrityRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;", "", "", "component1", "", "component2", IAppSDKPlus.EXTRA_KEY_NONCE, "cloudProjectNumber", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getNonce", "()Ljava/lang/String;", "b", "J", "getCloudProjectNumber", "()J", "<init>", "(Ljava/lang/String;J)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class DeviceCheckerPlayIntegrityRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String nonce;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long cloudProjectNumber;

    public DeviceCheckerPlayIntegrityRequest(@NotNull String nonce, long j10) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        this.nonce = nonce;
        this.cloudProjectNumber = j10;
    }

    public static /* synthetic */ DeviceCheckerPlayIntegrityRequest copy$default(DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceCheckerPlayIntegrityRequest.nonce;
        }
        if ((i10 & 2) != 0) {
            j10 = deviceCheckerPlayIntegrityRequest.cloudProjectNumber;
        }
        return deviceCheckerPlayIntegrityRequest.copy(str, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCloudProjectNumber() {
        return this.cloudProjectNumber;
    }

    @NotNull
    public final DeviceCheckerPlayIntegrityRequest copy(@NotNull String nonce, long cloudProjectNumber) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        return new DeviceCheckerPlayIntegrityRequest(nonce, cloudProjectNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCheckerPlayIntegrityRequest)) {
            return false;
        }
        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest = (DeviceCheckerPlayIntegrityRequest) other;
        return Intrinsics.areEqual(this.nonce, deviceCheckerPlayIntegrityRequest.nonce) && this.cloudProjectNumber == deviceCheckerPlayIntegrityRequest.cloudProjectNumber;
    }

    public final long getCloudProjectNumber() {
        return this.cloudProjectNumber;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        int iHashCode = this.nonce.hashCode() * 31;
        long j10 = this.cloudProjectNumber;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "DeviceCheckerPlayIntegrityRequest(nonce=" + this.nonce + ", cloudProjectNumber=" + this.cloudProjectNumber + ")";
    }
}
