package com.bbva.component.dm.customer.data.repository.response.customer;

import bk.q;
import com.bbva.component.dm.customer.data.repository.response.Parser;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.mx.Avatars;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerParser.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/response/customer/CustomerParser;", "Lcom/bbva/component/dm/customer/data/repository/response/Parser;", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "()V", "parseResponse", "result", "", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomerParser implements Parser<Customer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.component.dm.customer.data.repository.response.Parser
    @NotNull
    public Customer parseResponse(@Nullable String result) {
        Gson gson = new Gson();
        Object obj = ((Map) gson.fromJson(result, new TypeToken<Map<String, ? extends Object>>() { // from class: com.bbva.component.dm.customer.data.repository.response.customer.CustomerParser$parseResponse$map$1
        }.getType())).get("data");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object obj2 = ((List) obj).get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map mutableMap = q.toMutableMap((Map) obj2);
        mutableMap.put(CustomerLoginsParser.AVATARS, gson.fromJson(gson.toJson(mutableMap.get(CustomerLoginsParser.AVATARS)), Avatars.class));
        return new Customer((Map<String, ? extends Object>) mutableMap);
    }
}
