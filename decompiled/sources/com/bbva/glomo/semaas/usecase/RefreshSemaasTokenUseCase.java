package com.bbva.glomo.semaas.usecase;

import com.bbva.glomo.semaas.SemaasRefreshTokenProvider;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RefreshSemaasTokenUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/semaas/usecase/RefreshSemaasTokenUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomo/semaas/usecase/RefreshSemaasParams;", "", "params", "execute", "Lcom/bbva/glomo/semaas/SemaasRefreshTokenProvider;", "gloMoRefreshTokenProvider", "<init>", "(Lcom/bbva/glomo/semaas/SemaasRefreshTokenProvider;)V", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class RefreshSemaasTokenUseCase implements UseCaseWithParams<RefreshSemaasParams, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SemaasRefreshTokenProvider f30767a;

    public RefreshSemaasTokenUseCase(@NotNull SemaasRefreshTokenProvider gloMoRefreshTokenProvider) {
        Intrinsics.checkNotNullParameter(gloMoRefreshTokenProvider, "gloMoRefreshTokenProvider");
        this.f30767a = gloMoRefreshTokenProvider;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(RefreshSemaasParams refreshSemaasParams) {
        execute2(refreshSemaasParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull RefreshSemaasParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f30767a.setToken(params.getToken());
    }
}
