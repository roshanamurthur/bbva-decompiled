package com.bbva.component.ic.security.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecondFactorResponseModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/ic/security/model/ResponseData;", "", "token", "", "tokenType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getTokenType", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResponseData {

    @NotNull
    private final String token;

    @SerializedName("token_type")
    @NotNull
    private final String tokenType;

    public ResponseData(@NotNull String token, @NotNull String tokenType) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        this.token = token;
        this.tokenType = tokenType;
    }

    public static /* synthetic */ ResponseData copy$default(ResponseData responseData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responseData.token;
        }
        if ((i10 & 2) != 0) {
            str2 = responseData.tokenType;
        }
        return responseData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    @NotNull
    public final ResponseData copy(@NotNull String token, @NotNull String tokenType) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return new ResponseData(token, tokenType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseData)) {
            return false;
        }
        ResponseData responseData = (ResponseData) other;
        return Intrinsics.areEqual(this.token, responseData.token) && Intrinsics.areEqual(this.tokenType, responseData.tokenType);
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        return this.tokenType.hashCode() + (this.token.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("ResponseData(token=", this.token, ", tokenType=", this.tokenType, ")");
    }
}
