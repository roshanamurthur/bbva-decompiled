package com.bbva.component.dm.akamai.interceptor;

import bk.w;
import com.bbva.component.dm.akamai.interceptor.models.EndpointsSecurity;
import com.bbva.network.constant.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EndPointChecker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/akamai/interceptor/EndPointChecker;", "", "", "url", "Lcom/bbva/network/constant/Method;", "method", "", "check", "", "", "securityEndpointsSecurity", "<init>", "(Ljava/util/List;)V", "component-ic-akamai_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEndPointChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndPointChecker.kt\ncom/bbva/component/dm/akamai/interceptor/EndPointChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n1743#2,2:28\n1722#2,3:30\n1745#2:33\n*S KotlinDebug\n*F\n+ 1 EndPointChecker.kt\ncom/bbva/component/dm/akamai/interceptor/EndPointChecker\n*L\n16#1:24\n16#1:25,3\n17#1:28,2\n19#1:30,3\n17#1:33\n*E\n"})
public final class EndPointChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Map<String, Object>> f27395a;

    /* JADX WARN: Multi-variable type inference failed */
    public EndPointChecker(@NotNull List<? extends Map<String, ? extends Object>> securityEndpointsSecurity) {
        Intrinsics.checkNotNullParameter(securityEndpointsSecurity, "securityEndpointsSecurity");
        this.f27395a = securityEndpointsSecurity;
    }

    public final boolean check(@NotNull String url, @NotNull Method method) {
        Set<String> setEmptySet;
        URL url2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(url);
        String path = (httpUrl == null || (url2 = httpUrl.url()) == null) ? null : url2.getPath();
        if (path == null) {
            path = "";
        }
        if (httpUrl == null || (setEmptySet = httpUrl.queryParameterNames()) == null) {
            setEmptySet = w.emptySet();
        }
        List<Map<String, Object>> list = this.f27395a;
        ArrayList<EndpointsSecurity> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new EndpointsSecurity((Map) it.next()));
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (EndpointsSecurity endpointsSecurity : arrayList) {
            if (new Regex(endpointsSecurity.getEndpoint()).matches(path) && Intrinsics.areEqual(method.name(), endpointsSecurity.getMethod())) {
                List<String> queryParams = endpointsSecurity.getQueryParams();
                if (!(queryParams instanceof Collection) || !queryParams.isEmpty()) {
                    Iterator<T> it2 = queryParams.iterator();
                    while (it2.hasNext()) {
                        if (!setEmptySet.contains((String) it2.next())) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
