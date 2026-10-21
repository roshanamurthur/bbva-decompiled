package com.bbva.glomohybrid.login.extensions;

import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/Customer;", "", "serviceVersion", "getCustomerIdBy", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class CustomerExtensionsKt {
    @Nullable
    public static final String getCustomerIdBy(@NotNull Customer customer, @NotNull String serviceVersion) {
        String str;
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Intrinsics.checkNotNullParameter(serviceVersion, "serviceVersion");
        Map<String, Object> map = customer.getMap();
        if (Intrinsics.areEqual(serviceVersion, "v0")) {
            str = CustomerIdInterceptor.FAKE_CUSTOMER_ID;
        } else {
            str = Intrinsics.areEqual(serviceVersion, ConfigConstantsKt.CUSTOMERS_API_VERSION) ? "id" : null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
