package com.bbva.component.dm.customer.data.repository.request.indicators;

import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory;
import com.bbva.component.dm.customer.data.repository.request.RequestBuilder;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IndicatorsNetworkRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/request/indicators/IndicatorsNetworkRequest;", "Lcom/bbva/component/dm/customer/data/repository/request/NetworkRequestFactory;", "Lcom/bbva/network/model/NetworkRequest;", "a", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "request", "Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;", "requestBuilder", "Lcom/bbva/component/dm/customer/CustomerConfig;", "config", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "<init>", "(Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;Lcom/bbva/component/dm/customer/CustomerConfig;Ljava/lang/String;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class IndicatorsNetworkRequest implements NetworkRequestFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    public IndicatorsNetworkRequest(@NotNull RequestBuilder requestBuilder, @NotNull CustomerConfig config, @NotNull String customerId) {
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        this.request = RequestBuilder.createRequest$default(requestBuilder, config.getHost() + "/customers/" + config.getVersion() + "/customers/" + customerId + "/indicators", null, null, null, Method.GET, 14, null);
    }

    @Override // com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory
    @NotNull
    public NetworkRequest getRequest() {
        return this.request;
    }
}
