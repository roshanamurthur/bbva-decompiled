package com.bbva.library.digipassmanager.models;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponseModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/library/digipassmanager/models/CreateTokenResponse;", "", "", "component1", "component2", DigipassManagerConstants.TOKEN_AUTH_CODE, DigipassManagerConstants.TOKEN_CHALLENGE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTokenAuthCode", "()Ljava/lang/String;", "b", "getTokenChallenge", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CreateTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenAuthCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenChallenge;

    public CreateTokenResponse(@NotNull String tokenAuthCode, @NotNull String tokenChallenge) {
        Intrinsics.checkNotNullParameter(tokenAuthCode, "tokenAuthCode");
        Intrinsics.checkNotNullParameter(tokenChallenge, "tokenChallenge");
        this.tokenAuthCode = tokenAuthCode;
        this.tokenChallenge = tokenChallenge;
    }

    public static /* synthetic */ CreateTokenResponse copy$default(CreateTokenResponse createTokenResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createTokenResponse.tokenAuthCode;
        }
        if ((i10 & 2) != 0) {
            str2 = createTokenResponse.tokenChallenge;
        }
        return createTokenResponse.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenAuthCode() {
        return this.tokenAuthCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenChallenge() {
        return this.tokenChallenge;
    }

    @NotNull
    public final CreateTokenResponse copy(@NotNull String tokenAuthCode, @NotNull String tokenChallenge) {
        Intrinsics.checkNotNullParameter(tokenAuthCode, "tokenAuthCode");
        Intrinsics.checkNotNullParameter(tokenChallenge, "tokenChallenge");
        return new CreateTokenResponse(tokenAuthCode, tokenChallenge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTokenResponse)) {
            return false;
        }
        CreateTokenResponse createTokenResponse = (CreateTokenResponse) other;
        return Intrinsics.areEqual(this.tokenAuthCode, createTokenResponse.tokenAuthCode) && Intrinsics.areEqual(this.tokenChallenge, createTokenResponse.tokenChallenge);
    }

    @NotNull
    public final String getTokenAuthCode() {
        return this.tokenAuthCode;
    }

    @NotNull
    public final String getTokenChallenge() {
        return this.tokenChallenge;
    }

    public int hashCode() {
        return this.tokenChallenge.hashCode() + (this.tokenAuthCode.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CreateTokenResponse(tokenAuthCode=");
        sb2.append(this.tokenAuthCode);
        sb2.append(", tokenChallenge=");
        return y2.b(sb2, this.tokenChallenge, RootService.CLOSE_BRACKET);
    }
}
