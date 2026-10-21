package com.bbva.semaas.token.datasource;

import com.bbva.semaas.model.AccessToken;
import com.bbva.semaas.token.model.AccessTokenResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AccessTokenDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/semaas/token/datasource/AccessTokenDataSource;", "", "get", "Lcom/bbva/semaas/token/model/AccessTokenResult;", "save", "", "accessToken", "Lcom/bbva/semaas/model/AccessToken;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AccessTokenDataSource {

    /* JADX INFO: compiled from: AccessTokenDataSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void save(@NotNull AccessTokenDataSource accessTokenDataSource, @NotNull AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        }
    }

    @NotNull
    AccessTokenResult get();

    void save(@NotNull AccessToken accessToken);
}
