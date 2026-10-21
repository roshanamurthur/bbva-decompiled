package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.repository.datasource.PnnUserDataSource;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreIsPnnUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/StoreIsPnnUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "", "", "params", "execute", "Lcom/bbva/glomo/user/repository/datasource/PnnUserDataSource;", "dataSource", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/PnnUserDataSource;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class StoreIsPnnUseCase implements UseCaseWithParams<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PnnUserDataSource f30852a;

    public StoreIsPnnUseCase(@NotNull PnnUserDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f30852a = dataSource;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(Boolean bool) {
        execute(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public void execute(boolean params) {
        this.f30852a.storeIsPnn(params);
    }
}
