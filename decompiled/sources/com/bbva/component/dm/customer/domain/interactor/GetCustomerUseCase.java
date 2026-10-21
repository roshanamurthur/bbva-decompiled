package com.bbva.component.dm.customer.domain.interactor;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.customer.data.repository.CustomerRepository;
import com.bbva.component.dm.customer.domain.model.Customer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCustomerUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/customer/domain/interactor/GetCustomerUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "", "params", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/customer/data/repository/CustomerRepository;", "customerRepository", "<init>", "(Lcom/bbva/component/dm/customer/data/repository/CustomerRepository;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public class GetCustomerUseCase extends UseCase<Customer, String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CustomerRepository f27582d;

    public GetCustomerUseCase(@NotNull CustomerRepository customerRepository) {
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        this.f27582d = customerRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public Customer call(@Nullable String params) {
        return this.f27582d.getCustomer(params);
    }
}
