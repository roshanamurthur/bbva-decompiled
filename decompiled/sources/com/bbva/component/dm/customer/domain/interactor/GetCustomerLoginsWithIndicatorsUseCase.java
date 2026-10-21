package com.bbva.component.dm.customer.domain.interactor;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.customer.data.repository.CustomerRepository;
import com.bbva.component.dm.customer.data.repository.IndicatorsRepository;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity;
import com.bbva.component.dm.customer.extensions.CustomerExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCustomerLoginsWithIndicatorsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/customer/domain/interactor/GetCustomerLoginsWithIndicatorsUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "", "params", NotificationCompat.CATEGORY_CALL, "(Lkotlin/Unit;)Lcom/bbva/component/dm/customer/domain/model/Customer;", "Lcom/bbva/component/dm/customer/data/repository/CustomerRepository;", "customerRepository", "Lcom/bbva/component/dm/customer/data/repository/IndicatorsRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/customer/data/repository/CustomerRepository;Lcom/bbva/component/dm/customer/data/repository/IndicatorsRepository;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class GetCustomerLoginsWithIndicatorsUseCase extends UseCase<Customer, Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CustomerRepository f27580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IndicatorsRepository f27581e;

    public GetCustomerLoginsWithIndicatorsUseCase(@NotNull CustomerRepository customerRepository, @NotNull IndicatorsRepository repository) {
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f27580d = customerRepository;
        this.f27581e = repository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public Customer call(@Nullable Unit params) {
        Customer customer$default = CustomerRepository.getCustomer$default(this.f27580d, null, 1, null);
        IndicatorResponse indicators$default = IndicatorsRepository.getIndicators$default(this.f27581e, null, 1, null);
        Intrinsics.checkNotNull(indicators$default, "null cannot be cast to non-null type com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity");
        return CustomerExtensionsKt.mergeIndicators(customer$default, (IndicatorsLoginsEntity) indicators$default);
    }
}
