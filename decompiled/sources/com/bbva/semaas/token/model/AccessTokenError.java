package com.bbva.semaas.token.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AccessTokenResult.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/semaas/token/model/AccessTokenError;", "", "message", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NOT_CACHED_TOKEN", "REFRESH_TOKEN_UNAVAILABLE", "CONNECTION_ERROR", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum AccessTokenError {
    NOT_CACHED_TOKEN("Not cached token"),
    REFRESH_TOKEN_UNAVAILABLE("A refresh token isn't available"),
    CONNECTION_ERROR("A error happened while sending a request");


    @NotNull
    private final String message;

    AccessTokenError(String str) {
        this.message = str;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
