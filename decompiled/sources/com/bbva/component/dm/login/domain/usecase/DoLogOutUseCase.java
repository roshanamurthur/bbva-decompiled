package com.bbva.component.dm.login.domain.usecase;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.login.domain.boundary.LoginBoundary;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DoLogOutUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/login/domain/usecase/DoLogOutUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "params", NotificationCompat.CATEGORY_CALL, "(Lkotlin/Unit;)V", "Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;", "loginRepository", "<init>", "(Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final class DoLogOutUseCase extends UseCase<Unit, Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LoginBoundary f27746d;

    public DoLogOutUseCase(@NotNull LoginBoundary loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f27746d = loginRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit call(Unit unit) {
        call2(unit);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public void call2(@Nullable Unit params) {
        this.f27746d.logout();
    }
}
