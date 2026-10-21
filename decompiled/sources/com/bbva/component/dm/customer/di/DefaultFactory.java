package com.bbva.component.dm.customer.di;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.data.repository.CustomerRepository;
import com.bbva.component.dm.customer.data.repository.IndicatorsRepository;
import com.bbva.component.dm.customer.data.repository.datasource.NetworkCustomerDataSource;
import com.bbva.component.dm.customer.data.repository.datasource.NetworkCustomerIndicatorDataSource;
import com.bbva.component.dm.customer.data.repository.request.RequestBuilder;
import com.bbva.component.dm.customer.domain.interactor.GetCustomerIndicatorsUseCase;
import com.bbva.component.dm.customer.domain.interactor.GetCustomerLoginsWithIndicatorsUseCase;
import com.bbva.component.dm.customer.domain.interactor.GetCustomerUseCase;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/customer/di/DefaultFactory;", "Lcom/bbva/component/dm/customer/di/Factory;", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/customer/CustomerConfig;", "config", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "customerServiceType", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "", "getCustomerUseCase", "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "getIndicatorsUseCase", "", "getCustomerWithIndicatorsUseCase", "<init>", "()V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultFactory implements Factory {
    @Override // com.bbva.component.dm.customer.di.Factory
    @NotNull
    public UseCase<Customer, String> getCustomerUseCase(@NotNull NetworkWorker networkWorker, @NotNull CustomerConfig config, @NotNull CustomerServiceType customerServiceType) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        return new GetCustomerUseCase(new CustomerRepository(new NetworkCustomerDataSource(networkWorker, new RequestBuilder(), config), customerServiceType));
    }

    @Override // com.bbva.component.dm.customer.di.Factory
    @NotNull
    public UseCase<Customer, Unit> getCustomerWithIndicatorsUseCase(@NotNull NetworkWorker networkWorker, @NotNull CustomerConfig config, @NotNull CustomerServiceType customerServiceType) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        return new GetCustomerLoginsWithIndicatorsUseCase(new CustomerRepository(new NetworkCustomerDataSource(networkWorker, new RequestBuilder(), config), customerServiceType), new IndicatorsRepository(new NetworkCustomerIndicatorDataSource(networkWorker, new RequestBuilder(), config), customerServiceType));
    }

    @Override // com.bbva.component.dm.customer.di.Factory
    @NotNull
    public UseCase<IndicatorResponse, String> getIndicatorsUseCase(@NotNull NetworkWorker networkWorker, @NotNull CustomerConfig config, @NotNull CustomerServiceType customerServiceType) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        return new GetCustomerIndicatorsUseCase(new IndicatorsRepository(new NetworkCustomerIndicatorDataSource(networkWorker, new RequestBuilder(), config), customerServiceType));
    }
}
