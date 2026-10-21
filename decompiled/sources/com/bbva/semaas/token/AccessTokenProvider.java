package com.bbva.semaas.token;

import com.bbva.semaas.token.model.AccessTokenResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AccessTokenProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bbva/semaas/token/AccessTokenProvider;", "", "provide", "Lcom/bbva/semaas/token/model/AccessTokenResult;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AccessTokenProvider {
    @NotNull
    AccessTokenResult provide();
}
