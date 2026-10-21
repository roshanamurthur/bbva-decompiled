package com.bbva.ethermobilesdk.token.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.h;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.token.time.TimeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/TokenActivation;", "", ActivateTokenCommand.TOKEN_ID, "", "data", "configuration", "seed", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getConfiguration", "()Ljava/lang/String;", "getData", "getSeed", "getTimestamp", "()J", "getTokenId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenActivation {

    @NotNull
    private final String configuration;

    @NotNull
    private final String data;

    @NotNull
    private final String seed;
    private final long timestamp;

    @NotNull
    private final String tokenId;

    public TokenActivation(@NotNull String tokenId, @NotNull String data, @NotNull String configuration, @NotNull String seed, long j10) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(seed, "seed");
        this.tokenId = tokenId;
        this.data = data;
        this.configuration = configuration;
        this.seed = seed;
        this.timestamp = j10;
    }

    public static /* synthetic */ TokenActivation copy$default(TokenActivation tokenActivation, String str, String str2, String str3, String str4, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenActivation.tokenId;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenActivation.data;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = tokenActivation.configuration;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = tokenActivation.seed;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            j10 = tokenActivation.timestamp;
        }
        return tokenActivation.copy(str, str5, str6, str7, j10);
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
    public final String getConfiguration() {
        return this.configuration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSeed() {
        return this.seed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final TokenActivation copy(@NotNull String tokenId, @NotNull String data, @NotNull String configuration, @NotNull String seed, long timestamp) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(seed, "seed");
        return new TokenActivation(tokenId, data, configuration, seed, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenActivation)) {
            return false;
        }
        TokenActivation tokenActivation = (TokenActivation) other;
        return Intrinsics.areEqual(this.tokenId, tokenActivation.tokenId) && Intrinsics.areEqual(this.data, tokenActivation.data) && Intrinsics.areEqual(this.configuration, tokenActivation.configuration) && Intrinsics.areEqual(this.seed, tokenActivation.seed) && this.timestamp == tokenActivation.timestamp;
    }

    @NotNull
    public final String getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getSeed() {
        return this.seed;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        int iC = n1.c(this.seed, n1.c(this.configuration, n1.c(this.data, this.tokenId.hashCode() * 31, 31), 31), 31);
        long j10 = this.timestamp;
        return iC + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public String toString() {
        String str = this.tokenId;
        String str2 = this.data;
        String str3 = this.configuration;
        String str4 = this.seed;
        long j10 = this.timestamp;
        StringBuilder sbC = a.c("TokenActivation(tokenId=", str, ", data=", str2, ", configuration=");
        k.e(sbC, str3, ", seed=", str4, ", timestamp=");
        return h.d(sbC, j10, ")");
    }

    public /* synthetic */ TokenActivation(String str, String str2, String str3, String str4, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? new TimeProvider().now() : j10);
    }
}
