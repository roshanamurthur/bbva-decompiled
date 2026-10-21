package com.bbva.component.dm.customer.data.repository.request.indicators;

import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory;
import com.bbva.component.dm.customer.data.repository.request.RequestBuilder;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IndicatorsRequestFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/request/indicators/IndicatorsRequestFactory;", "", "()V", "createRequest", "Lcom/bbva/component/dm/customer/data/repository/request/NetworkRequestFactory;", "customerServiceType", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "requestBuilder", "Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;", "config", "Lcom/bbva/component/dm/customer/CustomerConfig;", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IndicatorsRequestFactory {

    @NotNull
    public static final IndicatorsRequestFactory INSTANCE = new IndicatorsRequestFactory();

    @NotNull
    public final NetworkRequestFactory createRequest(@NotNull CustomerServiceType customerServiceType, @NotNull RequestBuilder requestBuilder, @NotNull CustomerConfig config, @NotNull String customerId) {
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        if (Intrinsics.areEqual(customerServiceType, CustomerServiceType.Default.INSTANCE)) {
            return new IndicatorsNetworkRequest(requestBuilder, config, customerId);
        }
        if (Intrinsics.areEqual(customerServiceType, CustomerServiceType.Logins.INSTANCE)) {
            return new IndicatorsLoginsNetworkRequest(requestBuilder, config);
        }
        throw new NoWhenBranchMatchedException();
    }
}
