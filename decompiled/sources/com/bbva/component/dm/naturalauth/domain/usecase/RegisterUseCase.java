package com.bbva.component.dm.naturalauth.domain.usecase;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams;
import com.bbva.component.dm.naturalauth.persistence.NaturalAuthRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegisterUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/usecase/RegisterUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "params", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/naturalauth/persistence/NaturalAuthRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/naturalauth/persistence/NaturalAuthRepository;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class RegisterUseCase extends UseCase<String, RegisterParams> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NaturalAuthRepository f27893d;

    public RegisterUseCase(@NotNull NaturalAuthRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f27893d = repository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public String call(@NotNull RegisterParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f27893d.register(params);
    }
}
