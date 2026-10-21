package com.bbva.glomohybrid.interceptors;

import bk.q;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserAgentInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/interceptors/UserAgentInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "", "userAgent", "<init>", "(Ljava/lang/String;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class UserAgentInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32517a;

    public UserAgentInterceptor(@NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f32517a = userAgent;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to("User-Agent", this.f32517a)));
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
