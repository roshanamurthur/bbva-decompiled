package com.bbva.component.dm.login.domain.usecase;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.domain.boundary.LoginBoundary;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DoAnonymousLoginUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/login/domain/usecase/DoAnonymousLoginUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "", "params", NotificationCompat.CATEGORY_CALL, "(Lkotlin/Unit;)Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;", "loginRepository", "<init>", "(Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final class DoAnonymousLoginUseCase extends UseCase<LoginResponse, Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LoginBoundary f27745d;

    public DoAnonymousLoginUseCase(@NotNull LoginBoundary loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f27745d = loginRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public LoginResponse call(@Nullable Unit params) {
        return this.f27745d.anonymousLogin();
    }
}
