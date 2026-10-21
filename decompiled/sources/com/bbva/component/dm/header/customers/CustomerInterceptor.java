package com.bbva.component.dm.header.customers;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/header/customers/CustomerInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lcom/bbva/component/dm/header/customers/CustomerInterceptorConfig;", "configuration", "Lkotlin/Function1;", "", "onTsecCustomer", "<init>", "(Lcom/bbva/component/dm/header/customers/CustomerInterceptorConfig;Lkotlin/jvm/functions/Function1;)V", "component-dm-header-customers_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomerInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerInterceptor.kt\ncom/bbva/component/dm/header/customers/CustomerInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1747#2,3:45\n*S KotlinDebug\n*F\n+ 1 CustomerInterceptor.kt\ncom/bbva/component/dm/header/customers/CustomerInterceptor\n*L\n39#1:45,3\n*E\n"})
public final class CustomerInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CustomerInterceptorConfig f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<String, Unit> f27644b;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInterceptor(@NotNull CustomerInterceptorConfig configuration, @NotNull Function1<? super String, Unit> onTsecCustomer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(onTsecCustomer, "onTsecCustomer");
        this.f27643a = configuration;
        this.f27644b = onTsecCustomer;
    }

    public static boolean a(String str, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next(), RegexOption.IGNORE_CASE).matches(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String url = response.getUrl();
        CustomerInterceptorConfig customerInterceptorConfig = this.f27643a;
        boolean zA = a(url, customerInterceptorConfig.getWhiteList());
        Function1<String, Unit> function1 = this.f27644b;
        if (zA && response.getHeaders().containsKey(customerInterceptorConfig.getAuthHeaderName())) {
            function1.invoke(String.valueOf(response.getHeaders().get(customerInterceptorConfig.getAuthHeaderName())));
        } else if (a(response.getUrl(), customerInterceptorConfig.getCleanList()) && Intrinsics.areEqual(response.getRequest().getMethod().name(), "DELETE")) {
            function1.invoke("");
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
