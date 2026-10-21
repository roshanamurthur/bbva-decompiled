package com.bbva.component.dm.customer.data.repository;

import com.bbva.component.dm.customer.data.repository.datasource.NetworkCustomerIndicatorDataSource;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndicatorsRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/IndicatorsRepository;", "", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "getIndicators", "Lcom/bbva/component/dm/customer/data/repository/datasource/NetworkCustomerIndicatorDataSource;", "dataSource", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "customerServiceType", "<init>", "(Lcom/bbva/component/dm/customer/data/repository/datasource/NetworkCustomerIndicatorDataSource;Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class IndicatorsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkCustomerIndicatorDataSource f27556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CustomerServiceType f27557b;

    public IndicatorsRepository(@NotNull NetworkCustomerIndicatorDataSource dataSource, @NotNull CustomerServiceType customerServiceType) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        this.f27556a = dataSource;
        this.f27557b = customerServiceType;
    }

    public static /* synthetic */ IndicatorResponse getIndicators$default(IndicatorsRepository indicatorsRepository, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return indicatorsRepository.getIndicators(str);
    }

    @NotNull
    public final IndicatorResponse getIndicators(@Nullable String customerId) {
        return this.f27556a.getIndicators(this.f27557b, customerId);
    }
}
