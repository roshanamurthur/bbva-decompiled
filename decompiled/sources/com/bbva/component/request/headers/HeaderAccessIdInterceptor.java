package com.bbva.component.request.headers;

import bk.q;
import com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import g5.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeaderAccessIdInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/request/headers/HeaderAccessIdInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lcom/bbva/component/request/headers/HeaderAccessIdInterceptorConfig;", "config", "Lcom/bbva/component_devicemanager/domain/model/DeviceManagerDataSource;", "deviceManager", "<init>", "(Lcom/bbva/component/request/headers/HeaderAccessIdInterceptorConfig;Lcom/bbva/component_devicemanager/domain/model/DeviceManagerDataSource;)V", "Companion", "header-access-id_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHeaderAccessIdInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderAccessIdInterceptor.kt\ncom/bbva/component/request/headers/HeaderAccessIdInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1747#2,3:47\n*S KotlinDebug\n*F\n+ 1 HeaderAccessIdInterceptor.kt\ncom/bbva/component/request/headers/HeaderAccessIdInterceptor\n*L\n41#1:47,3\n*E\n"})
public final class HeaderAccessIdInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HeaderAccessIdInterceptorConfig f28219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceManagerDataSource f28220b;

    public HeaderAccessIdInterceptor(@NotNull HeaderAccessIdInterceptorConfig config, @NotNull DeviceManagerDataSource deviceManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        this.f28219a = config;
        this.f28220b = deviceManager;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        List<String> allowList = this.f28219a.getAllowList();
        String url = request.getUrl();
        List<String> list = allowList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next(), RegexOption.IGNORE_CASE).matches(url)) {
                request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to("BCS-Device-accessId", (String) BuildersKt__BuildersKt.runBlocking$default(null, new a(this, null), 1, null))));
                return;
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
