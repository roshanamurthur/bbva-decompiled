package com.bbva.semaas.token;

import com.bbva.semaas.token.datasource.LocalAccessTokenDataSource;
import com.bbva.semaas.token.datasource.RemoteAccessTokenDataSource;
import com.bbva.semaas.token.model.AccessTokenResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AccessTokenProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bbva/semaas/token/AccessTokenProviderImpl;", "Lcom/bbva/semaas/token/AccessTokenProvider;", "remoteDataSource", "Lcom/bbva/semaas/token/datasource/RemoteAccessTokenDataSource;", "localDataSource", "Lcom/bbva/semaas/token/datasource/LocalAccessTokenDataSource;", "(Lcom/bbva/semaas/token/datasource/RemoteAccessTokenDataSource;Lcom/bbva/semaas/token/datasource/LocalAccessTokenDataSource;)V", "provide", "Lcom/bbva/semaas/token/model/AccessTokenResult;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccessTokenProviderImpl implements AccessTokenProvider {

    @NotNull
    private final LocalAccessTokenDataSource localDataSource;

    @NotNull
    private final RemoteAccessTokenDataSource remoteDataSource;

    public AccessTokenProviderImpl(@NotNull RemoteAccessTokenDataSource remoteDataSource, @NotNull LocalAccessTokenDataSource localDataSource) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
    }

    @Override // com.bbva.semaas.token.AccessTokenProvider
    @NotNull
    public synchronized AccessTokenResult provide() {
        try {
            AccessTokenResult accessTokenResult = this.localDataSource.get();
            if (!(accessTokenResult instanceof AccessTokenResult.Error)) {
                return accessTokenResult;
            }
            AccessTokenResult accessTokenResult2 = this.remoteDataSource.get();
            if (accessTokenResult2 instanceof AccessTokenResult.Success) {
                this.localDataSource.save(((AccessTokenResult.Success) accessTokenResult2).getValue());
            } else if (!(accessTokenResult2 instanceof AccessTokenResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            return accessTokenResult2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
