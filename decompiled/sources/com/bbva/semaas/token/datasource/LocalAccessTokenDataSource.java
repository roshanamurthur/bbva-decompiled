package com.bbva.semaas.token.datasource;

import com.bbva.semaas.model.AccessToken;
import com.bbva.semaas.token.model.AccessTokenError;
import com.bbva.semaas.token.model.AccessTokenResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalAccessTokenDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/semaas/token/datasource/LocalAccessTokenDataSource;", "Lcom/bbva/semaas/token/datasource/AccessTokenDataSource;", "()V", "token", "Lcom/bbva/semaas/model/AccessToken;", "get", "Lcom/bbva/semaas/token/model/AccessTokenResult;", "isTokenValid", "", "save", "", "accessToken", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalAccessTokenDataSource implements AccessTokenDataSource {

    @Nullable
    private AccessToken token;

    private final boolean isTokenValid(AccessToken token) {
        if (token == null) {
            return false;
        }
        return (token.getAccessToken() == null || (((System.currentTimeMillis() / ((long) 1000)) > token.getExpiresAt() ? 1 : ((System.currentTimeMillis() / ((long) 1000)) == token.getExpiresAt() ? 0 : -1)) > 0)) ? false : true;
    }

    @Override // com.bbva.semaas.token.datasource.AccessTokenDataSource
    @NotNull
    public AccessTokenResult get() {
        if (!isTokenValid(this.token)) {
            return new AccessTokenResult.Error(AccessTokenError.NOT_CACHED_TOKEN);
        }
        AccessToken accessToken = this.token;
        Intrinsics.checkNotNull(accessToken);
        return new AccessTokenResult.Success(accessToken);
    }

    @Override // com.bbva.semaas.token.datasource.AccessTokenDataSource
    public void save(@NotNull AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.token = accessToken;
    }
}
