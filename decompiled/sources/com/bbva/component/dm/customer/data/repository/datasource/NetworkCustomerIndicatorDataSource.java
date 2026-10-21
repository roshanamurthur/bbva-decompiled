package com.bbva.component.dm.customer.data.repository.datasource;

import com.bbva.component.dm.customer.CustomerConfig;
import com.bbva.component.dm.customer.data.repository.request.NetworkRequestFactory;
import com.bbva.component.dm.customer.data.repository.request.RequestBuilder;
import com.bbva.component.dm.customer.data.repository.request.indicators.IndicatorsRequestFactory;
import com.bbva.component.dm.customer.data.repository.response.Parser;
import com.bbva.component.dm.customer.data.repository.response.exception.CustomerException;
import com.bbva.component.dm.customer.data.repository.response.indicators.IndicatorsParserFactory;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkCustomerIndicatorDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/datasource/NetworkCustomerIndicatorDataSource;", "", "Lcom/bbva/component/dm/customer/domain/model/CustomerServiceType;", "customerServiceType", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "getIndicators", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;", "requestBuilder", "Lcom/bbva/component/dm/customer/CustomerConfig;", "config", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;Lcom/bbva/component/dm/customer/CustomerConfig;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkCustomerIndicatorDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RequestBuilder f27562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CustomerConfig f27563c;

    public NetworkCustomerIndicatorDataSource(@NotNull NetworkWorker networkWorker, @NotNull RequestBuilder requestBuilder, @NotNull CustomerConfig config) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f27561a = networkWorker;
        this.f27562b = requestBuilder;
        this.f27563c = config;
    }

    @NotNull
    public final IndicatorResponse getIndicators(@NotNull CustomerServiceType customerServiceType, @Nullable String customerId) throws CustomerException, IOException {
        Intrinsics.checkNotNullParameter(customerServiceType, "customerServiceType");
        IndicatorsRequestFactory indicatorsRequestFactory = IndicatorsRequestFactory.INSTANCE;
        String str = "";
        if (customerId == null) {
            customerId = "";
        }
        NetworkRequestFactory networkRequestFactoryCreateRequest = indicatorsRequestFactory.createRequest(customerServiceType, this.f27562b, this.f27563c, customerId);
        Parser<IndicatorResponse> parserCreateParser = IndicatorsParserFactory.INSTANCE.createParser(customerServiceType);
        try {
            String strString = this.f27561a.execute(networkRequestFactoryCreateRequest.getRequest()).getBody().string();
            if (strString != null) {
                str = strString;
            }
            return parserCreateParser.parseResponse(str);
        } catch (ConnectionException e5) {
            NetworkResponse networkResponse = e5.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
            if (networkResponse == null) {
                throw new CustomerException(null, null, null, null, e5, 15, null);
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) networkRequestFactoryCreateRequest.getRequest().getUrl(), (CharSequence) "customer-logins/v0/indicators", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) networkRequestFactoryCreateRequest.getRequest().getUrl(), (CharSequence) "customer-logins/v1/logins", false, 2, (Object) null)) {
                throw CustomerExceptionHandlerKt.toHandleCustomerIndicatorsException(networkResponse, e5);
            }
            throw CustomerExceptionHandlerKt.toHandleCustomerException(networkResponse, e5);
        }
    }
}
