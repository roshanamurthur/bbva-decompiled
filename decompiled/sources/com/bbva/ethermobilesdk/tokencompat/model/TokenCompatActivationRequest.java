package com.bbva.ethermobilesdk.tokencompat.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatRX.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationRequest;", "", "authenticationCode", "", "salt", "deviceIdentifier", "applicationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationCode", "()Ljava/lang/String;", "getAuthenticationCode", "getDeviceIdentifier", "getSalt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenCompatActivationRequest {

    @NotNull
    private final String applicationCode;

    @NotNull
    private final String authenticationCode;

    @NotNull
    private final String deviceIdentifier;

    @NotNull
    private final String salt;

    public TokenCompatActivationRequest(@NotNull String authenticationCode, @NotNull String salt, @NotNull String deviceIdentifier, @NotNull String applicationCode) {
        Intrinsics.checkNotNullParameter(authenticationCode, "authenticationCode");
        Intrinsics.checkNotNullParameter(salt, "salt");
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
        this.authenticationCode = authenticationCode;
        this.salt = salt;
        this.deviceIdentifier = deviceIdentifier;
        this.applicationCode = applicationCode;
    }

    public static /* synthetic */ TokenCompatActivationRequest copy$default(TokenCompatActivationRequest tokenCompatActivationRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenCompatActivationRequest.authenticationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenCompatActivationRequest.salt;
        }
        if ((i10 & 4) != 0) {
            str3 = tokenCompatActivationRequest.deviceIdentifier;
        }
        if ((i10 & 8) != 0) {
            str4 = tokenCompatActivationRequest.applicationCode;
        }
        return tokenCompatActivationRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthenticationCode() {
        return this.authenticationCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSalt() {
        return this.salt;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplicationCode() {
        return this.applicationCode;
    }

    @NotNull
    public final TokenCompatActivationRequest copy(@NotNull String authenticationCode, @NotNull String salt, @NotNull String deviceIdentifier, @NotNull String applicationCode) {
        Intrinsics.checkNotNullParameter(authenticationCode, "authenticationCode");
        Intrinsics.checkNotNullParameter(salt, "salt");
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
        return new TokenCompatActivationRequest(authenticationCode, salt, deviceIdentifier, applicationCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenCompatActivationRequest)) {
            return false;
        }
        TokenCompatActivationRequest tokenCompatActivationRequest = (TokenCompatActivationRequest) other;
        return Intrinsics.areEqual(this.authenticationCode, tokenCompatActivationRequest.authenticationCode) && Intrinsics.areEqual(this.salt, tokenCompatActivationRequest.salt) && Intrinsics.areEqual(this.deviceIdentifier, tokenCompatActivationRequest.deviceIdentifier) && Intrinsics.areEqual(this.applicationCode, tokenCompatActivationRequest.applicationCode);
    }

    @NotNull
    public final String getApplicationCode() {
        return this.applicationCode;
    }

    @NotNull
    public final String getAuthenticationCode() {
        return this.authenticationCode;
    }

    @NotNull
    public final String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    @NotNull
    public final String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return this.applicationCode.hashCode() + n1.c(this.deviceIdentifier, n1.c(this.salt, this.authenticationCode.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.authenticationCode;
        String str2 = this.salt;
        return c.b(a.c("TokenCompatActivationRequest(authenticationCode=", str, ", salt=", str2, ", deviceIdentifier="), this.deviceIdentifier, ", applicationCode=", this.applicationCode, ")");
    }
}
