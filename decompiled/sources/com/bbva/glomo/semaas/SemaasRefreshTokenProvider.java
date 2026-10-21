package com.bbva.glomo.semaas;

import com.bbva.semaas.token.RefreshTokenProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemaasRefreshTokenProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomo/semaas/SemaasRefreshTokenProvider;", "Lcom/bbva/semaas/token/RefreshTokenProvider;", "", "provide", "newToken", "", "setToken", "<init>", "()V", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class SemaasRefreshTokenProvider implements RefreshTokenProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f30742a;

    @Override // com.bbva.semaas.token.RefreshTokenProvider
    @Nullable
    /* JADX INFO: renamed from: provide, reason: from getter */
    public String getF30742a() {
        return this.f30742a;
    }

    public final void setToken(@Nullable String newToken) {
        this.f30742a = newToken;
    }
}
