package com.bbva.component.dm.customer.data.repository.datasource;

import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory;
import com.bbva.component.dm.customer.data.repository.request.RequestBuilder;
import com.bbva.component.dm.customer.data.repository.request.customer.CustomerRequestFactory;
import com.bbva.component.dm.customer.data.repository.response.Parser;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerParserFactory;
import com.bbva.component.dm.customer.data.repository.response.exception.CustomerException;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkCustomerDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/datasource/NetworkCustomerDataSource;", "", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "customerServiceType", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "Lcom/bbva/component/dm/customer/domain/model/Customer;", "getCustomer", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;", "requestBuilder", "Lcom/bbva/component/dm/customer/CustomerConfig;", "config", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;Lcom/bbva/component/dm/customer/CustomerConfig;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkCustomerDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RequestBuilder f27559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CustomerConfig f27560c;

    public NetworkCustomerDataSource(@NotNull NetworkWorker networkWorker, @NotNull RequestBuilder requestBuilder, @NotNull CustomerConfig config) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f27558a = networkWorker;
        this.f27559b = requestBuilder;
        this.f27560c = config;
    }

    public static /* synthetic */ Customer getCustomer$default(NetworkCustomerDataSource networkCustomerDataSource, CustomerServiceType customerServiceType, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return networkCustomerDataSource.getCustomer(customerServiceType, str);
    }

    @NotNull
    public final Customer getCustomer(@NotNull CustomerServiceType customerServiceType, @Nullable String customerId) throws CustomerException, IOException {
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        NetworkRequestFactory networkRequestFactoryCreateRequest = CustomerRequestFactory.INSTANCE.createRequest(customerServiceType, this.f27559b, this.f27560c, customerId);
        Parser<Customer> parserCreateParser = CustomerParserFactory.INSTANCE.createParser(customerServiceType);
        try {
            String strString = this.f27558a.execute(networkRequestFactoryCreateRequest.getRequest()).getBody().string();
            if (strString == null) {
                strString = "";
            }
            return parserCreateParser.parseResponse(strString);
        } catch (ConnectionException e5) {
            NetworkResponse networkResponse = e5.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
            if (networkResponse != null) {
                throw CustomerExceptionHandlerKt.toHandleCustomerException(networkResponse, e5);
            }
            throw new CustomerException(null, null, null, null, e5, 15, null);
        }
    }
}
