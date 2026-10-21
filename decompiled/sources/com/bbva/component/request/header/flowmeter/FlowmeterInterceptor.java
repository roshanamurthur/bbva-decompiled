package com.bbva.component.request.header.flowmeter;

import bk.q;
import com.bbva.glomo.user.repository.datasource.FlowmeterDataSource;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FlowmeterInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/request/header/flowmeter/FlowmeterInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lcom/bbva/component/request/header/flowmeter/FlowmeterInterceptorConfig;", "flowmeterInterceptorConfig", "Lcom/bbva/glomo/user/repository/datasource/FlowmeterDataSource;", "flowmeterDataSource", "<init>", "(Lcom/bbva/component/request/header/flowmeter/FlowmeterInterceptorConfig;Lcom/bbva/glomo/user/repository/datasource/FlowmeterDataSource;)V", "Companion", "request-header-flowmeter_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFlowmeterInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowmeterInterceptor.kt\ncom/bbva/component/request/header/flowmeter/FlowmeterInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1747#2,3:42\n*S KotlinDebug\n*F\n+ 1 FlowmeterInterceptor.kt\ncom/bbva/component/request/header/flowmeter/FlowmeterInterceptor\n*L\n32#1:42,3\n*E\n"})
public final class FlowmeterInterceptor implements NetworkInterceptor {

    @NotNull
    public static final String CAU_TERM_FLAG = "cau-term-flag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FlowmeterInterceptorConfig f28211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FlowmeterDataSource f28212b;

    public FlowmeterInterceptor(@NotNull FlowmeterInterceptorConfig flowmeterInterceptorConfig, @NotNull FlowmeterDataSource flowmeterDataSource) {
        Intrinsics.checkNotNullParameter(flowmeterInterceptorConfig, "flowmeterInterceptorConfig");
        Intrinsics.checkNotNullParameter(flowmeterDataSource, "flowmeterDataSource");
        this.f28211a = flowmeterInterceptorConfig;
        this.f28212b = flowmeterDataSource;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String lastNumber = this.f28212b.getLastNumber();
        if (lastNumber == null) {
            lastNumber = "";
        }
        List<String> whiteList = this.f28211a.getWhiteList();
        String url = request.getUrl();
        List<String> list = whiteList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next(), RegexOption.IGNORE_CASE).matches(url)) {
                if (lastNumber.length() > 0) {
                    request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to(CAU_TERM_FLAG, lastNumber)));
                    return;
                }
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
