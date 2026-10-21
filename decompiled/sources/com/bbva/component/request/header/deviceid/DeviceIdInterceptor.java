package com.bbva.component.request.header.deviceid;

import bk.q;
import com.bbva.component.request.behavior.HandlePublicZoneHeadersBehavior;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceIdInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptorConfig;", "deviceIdInterceptorConfig", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "dataSource", "Lcom/bbva/component/request/header/deviceid/HeadersProvider;", "headersProvider", "Lcom/bbva/component/request/behavior/HandlePublicZoneHeadersBehavior;", "handlePublicZoneHeadersBehavior", "<init>", "(Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptorConfig;Lcom/bbva/glomo/localstorage/DeviceIdDataSource;Lcom/bbva/component/request/header/deviceid/HeadersProvider;Lcom/bbva/component/request/behavior/HandlePublicZoneHeadersBehavior;)V", "request-header-deviceid_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeviceIdInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceIdInterceptor.kt\ncom/bbva/component/request/header/deviceid/DeviceIdInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1747#2,3:57\n*S KotlinDebug\n*F\n+ 1 DeviceIdInterceptor.kt\ncom/bbva/component/request/header/deviceid/DeviceIdInterceptor\n*L\n40#1:57,3\n*E\n"})
public final class DeviceIdInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceIdInterceptorConfig f28203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceIdDataSource f28204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HeadersProvider f28205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final HandlePublicZoneHeadersBehavior f28206d;

    public DeviceIdInterceptor(@NotNull DeviceIdInterceptorConfig deviceIdInterceptorConfig, @NotNull DeviceIdDataSource dataSource, @NotNull HeadersProvider headersProvider, @Nullable HandlePublicZoneHeadersBehavior handlePublicZoneHeadersBehavior) {
        Intrinsics.checkNotNullParameter(deviceIdInterceptorConfig, "deviceIdInterceptorConfig");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        this.f28203a = deviceIdInterceptorConfig;
        this.f28204b = dataSource;
        this.f28205c = headersProvider;
        this.f28206d = handlePublicZoneHeadersBehavior;
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
        String deviceId;
        Map<String, String> mapProvideHeaders;
        Intrinsics.checkNotNullParameter(request, "request");
        DeviceIdInterceptorConfig deviceIdInterceptorConfig = this.f28203a;
        if (a(request.getUrl(), deviceIdInterceptorConfig.getWhiteList())) {
            if (a(request.getUrl(), deviceIdInterceptorConfig.getDenyList()) || (deviceId = this.f28204b.getDeviceId()) == null || deviceId.length() == 0) {
                return;
            }
            String url = request.getUrl();
            HandlePublicZoneHeadersBehavior handlePublicZoneHeadersBehavior = this.f28206d;
            if (handlePublicZoneHeadersBehavior == null || (mapProvideHeaders = handlePublicZoneHeadersBehavior.handle(url, deviceIdInterceptorConfig, deviceId)) == null) {
                mapProvideHeaders = this.f28205c.provideHeaders(deviceIdInterceptorConfig, deviceId);
            }
            request.setHeaders(q.plus(request.getHeaders(), mapProvideHeaders));
            if (handlePublicZoneHeadersBehavior != null) {
                request.setHeaders(q.plus(request.getHeaders(), handlePublicZoneHeadersBehavior.handleCustomerHeaders(request, deviceIdInterceptorConfig, deviceId)));
            }
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
