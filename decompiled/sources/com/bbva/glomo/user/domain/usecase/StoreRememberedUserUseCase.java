package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreRememberedUserUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/StoreRememberedUserUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomo/user/domain/usecase/RememberedUserParams;", "", "params", "execute", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class StoreRememberedUserUseCase implements UseCaseWithParams<RememberedUserParams, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30858a;

    public StoreRememberedUserUseCase(@NotNull RememberedUserDataSource rememberedUserDataSource) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        this.f30858a = rememberedUserDataSource;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(RememberedUserParams rememberedUserParams) {
        execute2(rememberedUserParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull RememberedUserParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f30858a.storeRememberedUser(params.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME java.lang.String(), params.getDocument(), params.getCom.bbva.glomo.localstorage.LocalStorageConstantsKt.IS_BUSINESS_USER_KEY java.lang.String());
    }
}
