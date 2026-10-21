package com.bbva.component.dm.customer.domain.interactor;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.customer.data.repository.IndicatorsRepository;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCustomerIndicatorsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/customer/domain/interactor/GetCustomerIndicatorsUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "", "params", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/customer/data/repository/IndicatorsRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/customer/data/repository/IndicatorsRepository;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class GetCustomerIndicatorsUseCase extends UseCase<IndicatorResponse, String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IndicatorsRepository f27579d;

    public GetCustomerIndicatorsUseCase(@NotNull IndicatorsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f27579d = repository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public IndicatorResponse call(@Nullable String params) {
        return this.f27579d.getIndicators(params);
    }
}
