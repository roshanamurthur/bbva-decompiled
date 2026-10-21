package com.bbva.component.dm.customer.data.repository.request.customer;

import androidx.camera.camera2.internal.compat.u;
import bk.p;
import bk.q;
import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory;
import com.bbva.component.dm.customer.data.repository.request.RequestBuilder;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerLoginsNetworkRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/request/customer/CustomerLoginsNetworkRequest;", "Lcom/bbva/component/dm/customer/data/repository/request/NetworkRequestFactory;", "Lcom/bbva/network/model/NetworkRequest;", "a", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "request", "Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;", "requestBuilder", "Lcom/bbva/component/dm/customer/CustomerConfig;", "config", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "<init>", "(Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;Lcom/bbva/component/dm/customer/CustomerConfig;Ljava/lang/String;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomerLoginsNetworkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerLoginsNetworkRequest.kt\ncom/bbva/component/dm/customer/data/repository/request/customer/CustomerLoginsNetworkRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
public final class CustomerLoginsNetworkRequest implements NetworkRequestFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    public CustomerLoginsNetworkRequest(@NotNull RequestBuilder requestBuilder, @NotNull CustomerConfig config, @Nullable String str) {
        Map mapMapOf;
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(config, "config");
        this.request = RequestBuilder.createRequest$default(requestBuilder, u.f(config.getHost(), "/customer-logins/v1/logins"), (str == null || (mapMapOf = p.mapOf(TuplesKt.to(CustomerIdInterceptor.FAKE_CUSTOMER_ID, str))) == null) ? q.emptyMap() : mapMapOf, null, null, Method.GET, 12, null);
    }

    @Override // com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory
    @NotNull
    public NetworkRequest getRequest() {
        return this.request;
    }
}
