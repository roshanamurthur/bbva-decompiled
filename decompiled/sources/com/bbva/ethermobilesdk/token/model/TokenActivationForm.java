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

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0005\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/TokenActivationForm;", "", ActivateTokenCommand.TOKEN_ID, "", "data", GenerateActivationFormCommand.HASH_CODE, "salt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getHashCode", "getSalt", "getTokenId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenActivationForm {

    @NotNull
    private final String data;

    @NotNull
    private final String hashCode;

    @NotNull
    private final String salt;

    @NotNull
    private final String tokenId;

    public TokenActivationForm(@NotNull String tokenId, @NotNull String data, @NotNull String hashCode, @NotNull String salt) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(hashCode, "hashCode");
        Intrinsics.checkNotNullParameter(salt, "salt");
        this.tokenId = tokenId;
        this.data = data;
        this.hashCode = hashCode;
        this.salt = salt;
    }

    public static /* synthetic */ TokenActivationForm copy$default(TokenActivationForm tokenActivationForm, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenActivationForm.tokenId;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenActivationForm.data;
        }
        if ((i10 & 4) != 0) {
            str3 = tokenActivationForm.hashCode;
        }
        if ((i10 & 8) != 0) {
            str4 = tokenActivationForm.salt;
        }
        return tokenActivationForm.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHashCode() {
        return this.hashCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSalt() {
        return this.salt;
    }

    @NotNull
    public final TokenActivationForm copy(@NotNull String tokenId, @NotNull String data, @NotNull String hashCode, @NotNull String salt) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(hashCode, "hashCode");
        Intrinsics.checkNotNullParameter(salt, "salt");
        return new TokenActivationForm(tokenId, data, hashCode, salt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenActivationForm)) {
            return false;
        }
        TokenActivationForm tokenActivationForm = (TokenActivationForm) other;
        return Intrinsics.areEqual(this.tokenId, tokenActivationForm.tokenId) && Intrinsics.areEqual(this.data, tokenActivationForm.data) && Intrinsics.areEqual(this.hashCode, tokenActivationForm.hashCode) && Intrinsics.areEqual(this.salt, tokenActivationForm.salt);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getHashCode() {
        return this.hashCode;
    }

    @NotNull
    public final String getSalt() {
        return this.salt;
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        return this.salt.hashCode() + n1.c(this.hashCode, n1.c(this.data, this.tokenId.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.tokenId;
        String str2 = this.data;
        return c.b(a.c("TokenActivationForm(tokenId=", str, ", data=", str2, ", hashCode="), this.hashCode, ", salt=", this.salt, ")");
    }
}
