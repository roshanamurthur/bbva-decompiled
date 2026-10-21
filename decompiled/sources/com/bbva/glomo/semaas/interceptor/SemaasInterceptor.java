package com.bbva.glomo.semaas.interceptor;

import bk.q;
import com.bbva.glomo.semaas.data.SemaasInterceptorDataProvider;
import com.bbva.glomo.semaas.interceptor.model.LoggableRequest;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B5\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomo/semaas/interceptor/SemaasInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "", "", "whiteList", "Lkotlin/Function1;", "Lcom/bbva/glomo/semaas/interceptor/model/LoggableRequest;", "Lcom/bbva/glomo/semaas/interceptor/OnFinishedRequest;", "finishedRequest", "Lcom/bbva/glomo/semaas/data/SemaasInterceptorDataProvider;", "dataProvider", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/bbva/glomo/semaas/data/SemaasInterceptorDataProvider;)V", "Companion", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSemaasInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemaasInterceptor.kt\ncom/bbva/glomo/semaas/interceptor/SemaasInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n1747#2,3:56\n*S KotlinDebug\n*F\n+ 1 SemaasInterceptor.kt\ncom/bbva/glomo/semaas/interceptor/SemaasInterceptor\n*L\n18#1:52\n18#1:53,3\n36#1:56,3\n*E\n"})
public final class SemaasInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<LoggableRequest, Unit> f30755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SemaasInterceptorDataProvider f30756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList f30757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f30758d;

    /* JADX WARN: Multi-variable type inference failed */
    public SemaasInterceptor(@NotNull List<String> whiteList, @NotNull Function1<? super LoggableRequest, Unit> finishedRequest, @NotNull SemaasInterceptorDataProvider dataProvider) {
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(finishedRequest, "finishedRequest");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        this.f30755a = finishedRequest;
        this.f30756b = dataProvider;
        List<String> list = whiteList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Regex((String) it.next()));
        }
        this.f30757c = arrayList;
        this.f30758d = new LinkedHashMap();
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f30757c;
        String url = request.getUrl();
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).containsMatchIn(url)) {
                Map<String, String> headers = request.getHeaders();
                SemaasInterceptorDataProvider semaasInterceptorDataProvider = this.f30756b;
                request.setHeaders(q.plus(headers, q.mapOf(TuplesKt.to("x-rho-traceid", semaasInterceptorDataProvider.getTraceId()), TuplesKt.to("x-rho-parentspanid", semaasInterceptorDataProvider.getSpanId()))));
                this.f30758d.put(request, Long.valueOf(semaasInterceptorDataProvider.getClock().getNanoTime()));
                return;
            }
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Long l6 = (Long) this.f30758d.remove(response.getRequest());
        if (l6 != null) {
            this.f30755a.invoke(new LoggableRequest(response, l6.longValue(), this.f30756b.getClock().getNanoTime()));
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
