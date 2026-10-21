package com.bbva.glomo.semaas.usecase;

import com.bbva.glomoutils.usecase.UseCaseParams;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RefreshSemaasTokenUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/semaas/usecase/RefreshSemaasParams;", "Lcom/bbva/glomoutils/usecase/UseCaseParams;", "", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "<init>", "(Ljava/lang/String;)V", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class RefreshSemaasParams implements UseCaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String token;

    public RefreshSemaasParams(@Nullable String str) {
        this.token = str;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }
}
