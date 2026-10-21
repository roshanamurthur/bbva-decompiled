package com.bbva.ethermobilesdk.token.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivateTokenRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/CreateActivationRequest;", "", ActivateTokenCommand.TOKEN_ID, "", "deviceId", "authCode", "protocolVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getDeviceId", "getProtocolVersion", "getTokenId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreateActivationRequest {

    @NotNull
    private final String authCode;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String protocolVersion;

    @NotNull
    private final String tokenId;

    public CreateActivationRequest(@NotNull String tokenId, @NotNull String deviceId, @NotNull String authCode, @NotNull String protocolVersion) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        this.tokenId = tokenId;
        this.deviceId = deviceId;
        this.authCode = authCode;
        this.protocolVersion = protocolVersion;
    }

    public static /* synthetic */ CreateActivationRequest copy$default(CreateActivationRequest createActivationRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createActivationRequest.tokenId;
        }
        if ((i10 & 2) != 0) {
            str2 = createActivationRequest.deviceId;
        }
        if ((i10 & 4) != 0) {
            str3 = createActivationRequest.authCode;
        }
        if ((i10 & 8) != 0) {
            str4 = createActivationRequest.protocolVersion;
        }
        return createActivationRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final CreateActivationRequest copy(@NotNull String tokenId, @NotNull String deviceId, @NotNull String authCode, @NotNull String protocolVersion) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        return new CreateActivationRequest(tokenId, deviceId, authCode, protocolVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateActivationRequest)) {
            return false;
        }
        CreateActivationRequest createActivationRequest = (CreateActivationRequest) other;
        return Intrinsics.areEqual(this.tokenId, createActivationRequest.tokenId) && Intrinsics.areEqual(this.deviceId, createActivationRequest.deviceId) && Intrinsics.areEqual(this.authCode, createActivationRequest.authCode) && Intrinsics.areEqual(this.protocolVersion, createActivationRequest.protocolVersion);
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
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        return this.protocolVersion.hashCode() + n1.c(this.authCode, n1.c(this.deviceId, this.tokenId.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.tokenId;
        String str2 = this.deviceId;
        return c.b(a.c("CreateActivationRequest(tokenId=", str, ", deviceId=", str2, ", authCode="), this.authCode, ", protocolVersion=", this.protocolVersion, ")");
    }
}
