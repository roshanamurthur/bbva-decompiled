package com.bbva.ethermobilesdk.token.model;

import androidx.annotation.Keep;
import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivateTokenRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/GetChallengeRequest;", "", ActivateTokenCommand.TOKEN_ID, "", "challengeName", "timeDrift", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getChallengeName", "()Ljava/lang/String;", "getTimeDrift", "()I", "getTokenId", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GetChallengeRequest {

    @NotNull
    private final String challengeName;
    private final int timeDrift;

    @NotNull
    private final String tokenId;

    public GetChallengeRequest(@NotNull String tokenId, @NotNull String challengeName, int i10) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(challengeName, "challengeName");
        this.tokenId = tokenId;
        this.challengeName = challengeName;
        this.timeDrift = i10;
    }

    public static /* synthetic */ GetChallengeRequest copy$default(GetChallengeRequest getChallengeRequest, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getChallengeRequest.tokenId;
        }
        if ((i11 & 2) != 0) {
            str2 = getChallengeRequest.challengeName;
        }
        if ((i11 & 4) != 0) {
            i10 = getChallengeRequest.timeDrift;
        }
        return getChallengeRequest.copy(str, str2, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChallengeName() {
        return this.challengeName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimeDrift() {
        return this.timeDrift;
    }

    @NotNull
    public final GetChallengeRequest copy(@NotNull String tokenId, @NotNull String challengeName, int timeDrift) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(challengeName, "challengeName");
        return new GetChallengeRequest(tokenId, challengeName, timeDrift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetChallengeRequest)) {
            return false;
        }
        GetChallengeRequest getChallengeRequest = (GetChallengeRequest) other;
        return Intrinsics.areEqual(this.tokenId, getChallengeRequest.tokenId) && Intrinsics.areEqual(this.challengeName, getChallengeRequest.challengeName) && this.timeDrift == getChallengeRequest.timeDrift;
    }

    @NotNull
    public final String getChallengeName() {
        return this.challengeName;
    }

    public final int getTimeDrift() {
        return this.timeDrift;
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        return n1.c(this.challengeName, this.tokenId.hashCode() * 31, 31) + this.timeDrift;
    }

    @NotNull
    public String toString() {
        String str = this.tokenId;
        String str2 = this.challengeName;
        return a.c(androidx.constraintlayout.core.parser.a.c("GetChallengeRequest(tokenId=", str, ", challengeName=", str2, ", timeDrift="), this.timeDrift, ")");
    }
}
