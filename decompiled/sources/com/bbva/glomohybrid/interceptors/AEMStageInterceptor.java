package com.bbva.glomohybrid.interceptors;

import bk.q;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AEMStageInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/interceptors/AEMStageInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAEMStageInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AEMStageInterceptor.kt\ncom/bbva/glomohybrid/interceptors/AEMStageInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1747#2,3:37\n*S KotlinDebug\n*F\n+ 1 AEMStageInterceptor.kt\ncom/bbva/glomohybrid/interceptors/AEMStageInterceptor\n*L\n33#1:37,3\n*E\n"})
public final class AEMStageInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f32512a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https://assets-stage.caasbbva.com/.*", "https://cardcovers-stage.caasbbva.com/.*"});

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String url = request.getUrl();
        List<String> list = this.f32512a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next(), RegexOption.IGNORE_CASE).matches(url)) {
                request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to("bvpass_stg", "f09c2ec22b48e4.07a74dbf9c8c0abd7c")));
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
