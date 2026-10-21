package com.bbva.network.interceptor;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkInterceptor.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/network/interceptor/NetworkInterceptor;", "", "onRequest", "", "request", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "onResponse", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/network/model/response/MutableNetworkResponse;", "verifyConnection", "", "host", "", "sslSession", "Ljavax/net/ssl/SSLSession;", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkInterceptor {

    /* JADX INFO: compiled from: NetworkInterceptor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean verifyConnection(@NotNull NetworkInterceptor networkInterceptor, @NotNull String host, @NotNull SSLSession sslSession) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(sslSession, "sslSession");
            return true;
        }
    }

    void onRequest(@NotNull MutableNetworkRequest request);

    void onResponse(@NotNull MutableNetworkResponse response);

    boolean verifyConnection(@NotNull String host, @NotNull SSLSession sslSession);
}
