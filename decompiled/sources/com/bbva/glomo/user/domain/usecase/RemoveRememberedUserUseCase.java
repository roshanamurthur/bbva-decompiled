package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RemoveRememberedUserUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/RemoveRememberedUserUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class RemoveRememberedUserUseCase implements UseCase<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30847a;

    public RemoveRememberedUserUseCase(@NotNull RememberedUserDataSource rememberedUserDataSource) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        this.f30847a = rememberedUserDataSource;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit execute() {
        execute2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2() {
        this.f30847a.remove();
    }
}
