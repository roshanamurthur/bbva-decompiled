package com.bbva.gp2.android.libs.networking.http.ether;

import android.content.Context;
import com.bbva.gp2.android.libs.networking.http.Gp2HttpClient;
import com.bbva.gp2.android.libs.networking.http.requests.HttpRequest;
import com.bbva.gp2.android.libs.networking.http.responses.HttpMultipartResponse;
import com.bbva.gp2.android.libs.networking.http.responses.HttpResponse;
import com.bbva.network.AndroidConnectionChecker;
import com.bbva.network.ConnectionChecker;
import com.bbva.network.NetworkWorker;
import com.bbva.network.impl.OkHttpNetworkWorker;
import java.net.CookieManager;
import java.net.CookiePolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherGp2HttpClient.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/ether/EtherGp2HttpClient;", "Lcom/bbva/gp2/android/libs/networking/http/Gp2HttpClient;", "context", "Landroid/content/Context;", "client", "Lokhttp3/OkHttpClient;", "cookieManager", "Ljava/net/CookieManager;", "connectionChecker", "Lcom/bbva/network/ConnectionChecker;", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/net/CookieManager;Lcom/bbva/network/ConnectionChecker;)V", "worker", "Lcom/bbva/network/NetworkWorker;", "(Lcom/bbva/network/NetworkWorker;)V", "logic", "Lcom/bbva/gp2/android/libs/networking/http/ether/EtherGp2HttpClientLogic;", "execute", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpResponse;", "request", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequest;", "executeMultipartMixed", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpMultipartResponse;", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EtherGp2HttpClient implements Gp2HttpClient {

    @NotNull
    private final EtherGp2HttpClientLogic logic;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EtherGp2HttpClient(@NotNull Context context) {
        this(context, null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.bbva.gp2.android.libs.networking.http.Gp2HttpClient
    @NotNull
    public HttpResponse execute(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.logic.execute(request);
    }

    @Override // com.bbva.gp2.android.libs.networking.http.Gp2HttpClient
    @NotNull
    public HttpMultipartResponse executeMultipartMixed(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.logic.executeMultipartMixed(request);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EtherGp2HttpClient(@NotNull Context context, @Nullable OkHttpClient okHttpClient) {
        this(context, okHttpClient, null, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EtherGp2HttpClient(@NotNull Context context, @Nullable OkHttpClient okHttpClient, @NotNull CookieManager cookieManager) {
        this(context, okHttpClient, cookieManager, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
    }

    public /* synthetic */ EtherGp2HttpClient(Context context, OkHttpClient okHttpClient, CookieManager cookieManager, ConnectionChecker connectionChecker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : okHttpClient, (i10 & 4) != 0 ? new CookieManager(null, CookiePolicy.ACCEPT_ALL) : cookieManager, (i10 & 8) != 0 ? new AndroidConnectionChecker(context) : connectionChecker);
    }

    @JvmOverloads
    public EtherGp2HttpClient(@NotNull Context context, @Nullable OkHttpClient okHttpClient, @NotNull CookieManager cookieManager, @NotNull ConnectionChecker connectionChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        Intrinsics.checkNotNullParameter(connectionChecker, "connectionChecker");
        this.logic = new EtherGp2HttpClientLogic(new OkHttpNetworkWorker(context, okHttpClient, null, cookieManager, connectionChecker));
    }

    public EtherGp2HttpClient(@NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.logic = new EtherGp2HttpClientLogic(worker);
    }
}
