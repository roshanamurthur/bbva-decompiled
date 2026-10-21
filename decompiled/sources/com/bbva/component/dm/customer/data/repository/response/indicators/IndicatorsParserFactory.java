package com.bbva.component.dm.customer.data.repository.response.indicators;

import com.bbva.component.dm.customer.data.repository.response.Parser;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IndicatorsParserFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/response/indicators/IndicatorsParserFactory;", "", "()V", "createParser", "Lcom/bbva/component/dm/customer/data/repository/response/Parser;", "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "customerServiceType", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IndicatorsParserFactory {

    @NotNull
    public static final IndicatorsParserFactory INSTANCE = new IndicatorsParserFactory();

    @NotNull
    public final Parser<IndicatorResponse> createParser(@NotNull CustomerServiceType customerServiceType) {
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        if (Intrinsics.areEqual(customerServiceType, CustomerServiceType.Default.INSTANCE)) {
            return new IndicatorsParser();
        }
        if (Intrinsics.areEqual(customerServiceType, CustomerServiceType.Logins.INSTANCE)) {
            return new IndicatorsLoginsParser();
        }
        throw new NoWhenBranchMatchedException();
    }
}
