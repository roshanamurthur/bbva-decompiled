package com.bbva.ethermobilesdk.token.storage.data;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenRSA;", "", "privateKey", "", "authCode", "deviceId", "protocolVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getDeviceId", "getPrivateKey", "getProtocolVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StorageTokenRSA {

    @SerializedName("authCode")
    @NotNull
    private final String authCode;

    @SerializedName("deviceId")
    @NotNull
    private final String deviceId;

    @SerializedName("privateKey")
    @NotNull
    private final String privateKey;

    @SerializedName("protocolVersion")
    @NotNull
    private final String protocolVersion;

    public StorageTokenRSA(@NotNull String privateKey, @NotNull String authCode, @NotNull String deviceId, @NotNull String protocolVersion) {
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        this.privateKey = privateKey;
        this.authCode = authCode;
        this.deviceId = deviceId;
        this.protocolVersion = protocolVersion;
    }

    public static /* synthetic */ StorageTokenRSA copy$default(StorageTokenRSA storageTokenRSA, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storageTokenRSA.privateKey;
        }
        if ((i10 & 2) != 0) {
            str2 = storageTokenRSA.authCode;
        }
        if ((i10 & 4) != 0) {
            str3 = storageTokenRSA.deviceId;
        }
        if ((i10 & 8) != 0) {
            str4 = storageTokenRSA.protocolVersion;
        }
        return storageTokenRSA.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final StorageTokenRSA copy(@NotNull String privateKey, @NotNull String authCode, @NotNull String deviceId, @NotNull String protocolVersion) {
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        return new StorageTokenRSA(privateKey, authCode, deviceId, protocolVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageTokenRSA)) {
            return false;
        }
        StorageTokenRSA storageTokenRSA = (StorageTokenRSA) other;
        return Intrinsics.areEqual(this.privateKey, storageTokenRSA.privateKey) && Intrinsics.areEqual(this.authCode, storageTokenRSA.authCode) && Intrinsics.areEqual(this.deviceId, storageTokenRSA.deviceId) && Intrinsics.areEqual(this.protocolVersion, storageTokenRSA.protocolVersion);
    }

    @NotNull
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getPrivateKey() {
        return this.privateKey;
    }

    @NotNull
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    public int hashCode() {
        return this.protocolVersion.hashCode() + n1.c(this.deviceId, n1.c(this.authCode, this.privateKey.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.privateKey;
        String str2 = this.authCode;
        return c.b(a.c("StorageTokenRSA(privateKey=", str, ", authCode=", str2, ", deviceId="), this.deviceId, ", protocolVersion=", this.protocolVersion, ")");
    }
}
