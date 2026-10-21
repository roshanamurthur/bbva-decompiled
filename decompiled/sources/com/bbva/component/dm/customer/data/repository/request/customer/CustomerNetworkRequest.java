package com.bbva.component.dm.customer.data.repository.request.customer;

import bk.p;
import bk.q;
import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory;
import com.bbva.component.dm.customer.data.repository.request.RequestBuilder;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerNetworkRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/request/customer/CustomerNetworkRequest;", "Lcom/bbva/component/dm/customer/data/repository/request/NetworkRequestFactory;", "Lcom/bbva/network/model/NetworkRequest;", "c", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "request", "Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;", "requestBuilder", "Lcom/bbva/component/dm/customer/CustomerConfig;", "config", "<init>", "(Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;Lcom/bbva/component/dm/customer/CustomerConfig;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class CustomerNetworkRequest implements NetworkRequestFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f27571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f27572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    public CustomerNetworkRequest(@NotNull RequestBuilder requestBuilder, @NotNull CustomerConfig config) {
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(config, "config");
        List<String> listEmptyList = config.getExpand().get("customer");
        listEmptyList = listEmptyList == null ? CollectionsKt__CollectionsKt.emptyList() : listEmptyList;
        this.f27571a = listEmptyList;
        Map<String, String> mapEmptyMap = listEmptyList.isEmpty() ? q.emptyMap() : p.mapOf(TuplesKt.to("expand", CollectionsKt___CollectionsKt.joinToString$default(listEmptyList, ",", null, null, 0, null, null, 62, null)));
        this.f27572b = mapEmptyMap;
        this.request = RequestBuilder.createRequest$default(requestBuilder, config.getHost() + "/customers/" + config.getVersion() + "/customers", mapEmptyMap, null, null, Method.GET, 12, null);
    }

    @Override // com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory
    @NotNull
    public NetworkRequest getRequest() {
        return this.request;
    }
}
