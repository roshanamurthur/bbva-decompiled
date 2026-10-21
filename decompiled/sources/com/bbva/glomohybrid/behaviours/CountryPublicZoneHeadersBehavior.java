package com.bbva.glomohybrid.behaviours;

import bk.q;
import com.bbva.component.request.behavior.HandlePublicZoneHeadersBehavior;
import com.bbva.component.request.header.deviceid.DeviceIdInterceptorConfig;
import com.bbva.component.request.header.deviceid.HeadersProvider;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.network.model.request.MutableNetworkRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryPublicZoneHeadersBehavior.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/behaviours/CountryPublicZoneHeadersBehavior;", "Lcom/bbva/component/request/behavior/HandlePublicZoneHeadersBehavior;", "", "url", "Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptorConfig;", "deviceIdInterceptorConfig", "deviceId", "", "handle", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "handleCustomerHeaders", "Lcom/bbva/component/request/header/deviceid/HeadersProvider;", "headersProvider", "Lkotlin/Function0;", "Lcom/bbva/glomohybrid/base/datasource/UserStoredDatasource;", "factoryUserStoredDataSource", "<init>", "(Lcom/bbva/component/request/header/deviceid/HeadersProvider;Lkotlin/jvm/functions/Function0;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryPublicZoneHeadersBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPublicZoneHeadersBehavior.kt\ncom/bbva/glomohybrid/behaviours/CountryPublicZoneHeadersBehavior\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1747#2,3:55\n*S KotlinDebug\n*F\n+ 1 CountryPublicZoneHeadersBehavior.kt\ncom/bbva/glomohybrid/behaviours/CountryPublicZoneHeadersBehavior\n*L\n49#1:55,3\n*E\n"})
public final class CountryPublicZoneHeadersBehavior implements HandlePublicZoneHeadersBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HeadersProvider f31625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f31626b;

    /* JADX INFO: compiled from: CountryPublicZoneHeadersBehavior.kt */
    public static final class a extends Lambda implements Function0<UserStoredDatasource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<UserStoredDatasource> f31627p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<UserStoredDatasource> function0) {
            super(0);
            this.f31627p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserStoredDatasource invoke() {
            return this.f31627p0.invoke();
        }
    }

    public CountryPublicZoneHeadersBehavior(@NotNull HeadersProvider headersProvider, @NotNull Function0<UserStoredDatasource> factoryUserStoredDataSource) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(factoryUserStoredDataSource, "factoryUserStoredDataSource");
        this.f31625a = headersProvider;
        this.f31626b = LazyKt__LazyJVMKt.lazy(new a(factoryUserStoredDataSource));
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

    @Override // com.bbva.component.request.behavior.HandlePublicZoneHeadersBehavior
    @NotNull
    public Map<String, String> handle(@NotNull String url, @NotNull DeviceIdInterceptorConfig deviceIdInterceptorConfig, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(deviceIdInterceptorConfig, "deviceIdInterceptorConfig");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        boolean zA = a(url, deviceIdInterceptorConfig.getPublicZoneList());
        HeadersProvider headersProvider = this.f31625a;
        if (!zA) {
            return headersProvider.provideHeaders(deviceIdInterceptorConfig, deviceId);
        }
        boolean zIsLogged = ((UserStoredDatasource) this.f31626b.getValue()).isLogged();
        if (zIsLogged) {
            return headersProvider.provideHeaders(deviceIdInterceptorConfig, deviceId);
        }
        if (zIsLogged) {
            throw new NoWhenBranchMatchedException();
        }
        return q.emptyMap();
    }

    @Override // com.bbva.component.request.behavior.HandlePublicZoneHeadersBehavior
    @NotNull
    public Map<String, String> handleCustomerHeaders(@NotNull MutableNetworkRequest request, @NotNull DeviceIdInterceptorConfig deviceIdInterceptorConfig, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(deviceIdInterceptorConfig, "deviceIdInterceptorConfig");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        if (!request.getHeaders().containsKey("authenticationtype") && !request.getHeaders().containsKey("authenticationdata")) {
            if (a(request.getUrl(), deviceIdInterceptorConfig.getWhiteList())) {
                return this.f31625a.provideHeaders(deviceIdInterceptorConfig, deviceId);
            }
        }
        return q.emptyMap();
    }
}
