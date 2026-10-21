package com.bbva.component.dm.naturalauth.domain.usecase;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.naturalauth.domain.model.params.ListAuthenticatorsParams;
import com.bbva.component.dm.naturalauth.persistence.NaturalAuthRepository;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListAuthenticatorsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/usecase/ListAuthenticatorsUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDevice;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/ListAuthenticatorsParams;", "params", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/naturalauth/persistence/NaturalAuthRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/naturalauth/persistence/NaturalAuthRepository;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class ListAuthenticatorsUseCase extends UseCase<List<? extends FidoDevice>, ListAuthenticatorsParams> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NaturalAuthRepository f27892d;

    public ListAuthenticatorsUseCase(@NotNull NaturalAuthRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f27892d = repository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public List<FidoDevice> call(@NotNull ListAuthenticatorsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f27892d.listAuthenticators(params);
    }
}
