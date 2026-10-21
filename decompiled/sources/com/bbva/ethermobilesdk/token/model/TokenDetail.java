package com.bbva.ethermobilesdk.token.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GetActivatedTokensDetailCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/TokenDetail;", "", "id", "", GetActivatedTokensDetailCommand.ACTIVATION_TIMESTAMP, "", "(Ljava/lang/String;J)V", "getActivationTimestamp", "()J", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenDetail {
    private final long activationTimestamp;

    @NotNull
    private final String id;

    public TokenDetail(@NotNull String id, long j10) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.activationTimestamp = j10;
    }

    public static /* synthetic */ TokenDetail copy$default(TokenDetail tokenDetail, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenDetail.id;
        }
        if ((i10 & 2) != 0) {
            j10 = tokenDetail.activationTimestamp;
        }
        return tokenDetail.copy(str, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getActivationTimestamp() {
        return this.activationTimestamp;
    }

    @NotNull
    public final TokenDetail copy(@NotNull String id, long activationTimestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new TokenDetail(id, activationTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenDetail)) {
            return false;
        }
        TokenDetail tokenDetail = (TokenDetail) other;
        return Intrinsics.areEqual(this.id, tokenDetail.id) && this.activationTimestamp == tokenDetail.activationTimestamp;
    }

    public final long getActivationTimestamp() {
        return this.activationTimestamp;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long j10 = this.activationTimestamp;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "TokenDetail(id=" + this.id + ", activationTimestamp=" + this.activationTimestamp + ")";
    }
}
