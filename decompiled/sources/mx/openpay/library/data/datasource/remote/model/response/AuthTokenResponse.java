package mx.openpay.library.data.datasource.remote.model.response;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthTokenResponse.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/AuthTokenResponse;", "", "accessToken", "", "expiresIn", "tokenType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "getTokenType", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AuthTokenResponse {

    @SerializedName("accessToken")
    @NotNull
    private final String accessToken;

    @SerializedName("expiresIn")
    @NotNull
    private final String expiresIn;

    @SerializedName("tokenType")
    @NotNull
    private final String tokenType;

    public AuthTokenResponse(@NotNull String accessToken, @NotNull String expiresIn, @NotNull String tokenType) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(expiresIn, "expiresIn");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.tokenType = tokenType;
    }

    public static /* synthetic */ AuthTokenResponse copy$default(AuthTokenResponse authTokenResponse, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authTokenResponse.accessToken;
        }
        if ((i10 & 2) != 0) {
            str2 = authTokenResponse.expiresIn;
        }
        if ((i10 & 4) != 0) {
            str3 = authTokenResponse.tokenType;
        }
        return authTokenResponse.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    @NotNull
    public final AuthTokenResponse copy(@NotNull String accessToken, @NotNull String expiresIn, @NotNull String tokenType) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(expiresIn, "expiresIn");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return new AuthTokenResponse(accessToken, expiresIn, tokenType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthTokenResponse)) {
            return false;
        }
        AuthTokenResponse authTokenResponse = (AuthTokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, authTokenResponse.accessToken) && Intrinsics.areEqual(this.expiresIn, authTokenResponse.expiresIn) && Intrinsics.areEqual(this.tokenType, authTokenResponse.tokenType);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return this.tokenType.hashCode() + n1.c(this.expiresIn, this.accessToken.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.expiresIn;
        return d.f(a.c("AuthTokenResponse(accessToken=", str, ", expiresIn=", str2, ", tokenType="), this.tokenType, ")");
    }
}
