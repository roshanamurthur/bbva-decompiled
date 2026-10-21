package com.bbva.component.dm.customer.di;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/customer/di/Factory;", "", "getCustomerUseCase", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "", "networkWorker", "Lcom/bbva/network/NetworkWorker;", "config", "Lcom/bbva/component/dm/customer/CustomerConfig;", "customerServiceType", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "getCustomerWithIndicatorsUseCase", "", "getIndicatorsUseCase", "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Factory {
    @NotNull
    UseCase<Customer, String> getCustomerUseCase(@NotNull NetworkWorker networkWorker, @NotNull CustomerConfig config, @NotNull CustomerServiceType customerServiceType);

    @NotNull
    UseCase<Customer, Unit> getCustomerWithIndicatorsUseCase(@NotNull NetworkWorker networkWorker, @NotNull CustomerConfig config, @NotNull CustomerServiceType customerServiceType);

    @NotNull
    UseCase<IndicatorResponse, String> getIndicatorsUseCase(@NotNull NetworkWorker networkWorker, @NotNull CustomerConfig config, @NotNull CustomerServiceType customerServiceType);
}
