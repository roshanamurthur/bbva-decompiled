package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetRememberedUserUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/GetRememberedUserUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "execute", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class GetRememberedUserUseCase implements UseCase<RememberedUser> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30810a;

    public GetRememberedUserUseCase(@NotNull RememberedUserDataSource rememberedUserDataSource) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        this.f30810a = rememberedUserDataSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @Nullable
    public RememberedUser execute() {
        return this.f30810a.get();
    }
}
