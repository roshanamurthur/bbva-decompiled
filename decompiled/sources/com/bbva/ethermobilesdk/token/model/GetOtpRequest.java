package com.bbva.ethermobilesdk.token.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivateTokenRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/GetOtpRequest;", "", ActivateTokenCommand.TOKEN_ID, "", "timeDrift", "", "(Ljava/lang/String;I)V", "getTimeDrift", "()I", "getTokenId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GetOtpRequest {
    private final int timeDrift;

    @NotNull
    private final String tokenId;

    public GetOtpRequest(@NotNull String tokenId, int i10) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        this.tokenId = tokenId;
        this.timeDrift = i10;
    }

    public static /* synthetic */ GetOtpRequest copy$default(GetOtpRequest getOtpRequest, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getOtpRequest.tokenId;
        }
        if ((i11 & 2) != 0) {
            i10 = getOtpRequest.timeDrift;
        }
        return getOtpRequest.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeDrift() {
        return this.timeDrift;
    }

    @NotNull
    public final GetOtpRequest copy(@NotNull String tokenId, int timeDrift) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        return new GetOtpRequest(tokenId, timeDrift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetOtpRequest)) {
            return false;
        }
        GetOtpRequest getOtpRequest = (GetOtpRequest) other;
        return Intrinsics.areEqual(this.tokenId, getOtpRequest.tokenId) && this.timeDrift == getOtpRequest.timeDrift;
    }

    public final int getTimeDrift() {
        return this.timeDrift;
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        return (this.tokenId.hashCode() * 31) + this.timeDrift;
    }

    @NotNull
    public String toString() {
        return "GetOtpRequest(tokenId=" + this.tokenId + ", timeDrift=" + this.timeDrift + ")";
    }
}
