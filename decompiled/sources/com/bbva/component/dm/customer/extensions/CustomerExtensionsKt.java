package com.bbva.component.dm.customer.extensions;

import bk.q;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.IndicatorLoginsEntity;
import com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"mergeIndicators", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "indicatorsLoginsEntity", "Lcom/bbva/component/dm/customer/domain/model/IndicatorsLoginsEntity;", "component-dm-customer_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerExtensions.kt\ncom/bbva/component/dm/customer/extensions/CustomerExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1549#2:14\n1620#2,3:15\n*S KotlinDebug\n*F\n+ 1 CustomerExtensions.kt\ncom/bbva/component/dm/customer/extensions/CustomerExtensionsKt\n*L\n10#1:14\n10#1:15,3\n*E\n"})
public final class CustomerExtensionsKt {
    @NotNull
    public static final Customer mergeIndicators(@NotNull Customer customer, @NotNull IndicatorsLoginsEntity indicatorsLoginsEntity) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Intrinsics.checkNotNullParameter(indicatorsLoginsEntity, "indicatorsLoginsEntity");
        Map<String, ? extends Object> mutableMap = q.toMutableMap(customer.getMap());
        mutableMap.put(CustomerIdInterceptor.FAKE_CUSTOMER_ID, indicatorsLoginsEntity.getData().getCustomerId());
        List<IndicatorLoginsEntity> indicators = indicatorsLoginsEntity.getData().getIndicators();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(indicators, 10));
        Iterator<T> it = indicators.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndicatorLoginsEntity) it.next()).toMap());
        }
        mutableMap.put("indicators", arrayList);
        return customer.copy(mutableMap);
    }
}
