package com.bbva.component.request.headers;

import android.net.Uri;
import bk.p;
import bk.q;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeaderInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/request/headers/HeaderInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "", "", "headerList", "addHeader", "key", "removeHeader", "Lcom/bbva/component/request/headers/InterceptorConfig;", "config", "<init>", "(Lcom/bbva/component/request/headers/InterceptorConfig;)V", "request-headers_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderInterceptor.kt\ncom/bbva/component/request/headers/HeaderInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,37:1\n1747#2,3:38\n1747#2,3:41\n1238#2,4:46\n468#3:44\n414#3:45\n*S KotlinDebug\n*F\n+ 1 HeaderInterceptor.kt\ncom/bbva/component/request/headers/HeaderInterceptor\n*L\n14#1:38,3\n15#1:41,3\n17#1:46,4\n17#1:44\n17#1:45\n*E\n"})
public final class HeaderInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterceptorConfig f28222a;

    public HeaderInterceptor(@NotNull InterceptorConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f28222a = config;
    }

    public final void addHeader(@NotNull Map<String, String> headerList) {
        Intrinsics.checkNotNullParameter(headerList, "headerList");
        this.f28222a.getHeadersMap().putAll(headerList);
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Uri uri = Uri.parse(request.getUrl());
        InterceptorConfig interceptorConfig = this.f28222a;
        List<Regex> allowList = interceptorConfig.getAllowList();
        if ((allowList instanceof Collection) && allowList.isEmpty()) {
            return;
        }
        for (Regex regex : allowList) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (regex.matches(string)) {
                List<Regex> denyList = interceptorConfig.getDenyList();
                if (!(denyList instanceof Collection) || !denyList.isEmpty()) {
                    for (Regex regex2 : denyList) {
                        String string2 = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        if (regex2.matches(string2)) {
                            return;
                        }
                    }
                }
                Map<String, String> headersMap = interceptorConfig.getHeadersMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(headersMap.size()));
                Iterator<T> it = headersMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to(entry.getKey(), entry.getValue())));
                    linkedHashMap.put(Unit.INSTANCE, entry.getValue());
                }
                return;
            }
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public final void removeHeader(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f28222a.getHeadersMap().remove(key);
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
