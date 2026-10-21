package com.bbva.network.impl;

import android.content.Context;
import com.bbva.image.transform.MonochromeImageTransformer;
import com.bbva.network.AndroidConnectionChecker;
import com.bbva.network.ConnectionChecker;
import com.bbva.network.NetworkWebSocketListener;
import com.bbva.network.NetworkWorker;
import com.bbva.network.RequestCallback;
import com.bbva.network.WebSocketWorker;
import com.bbva.network.event.NetworkEventListener;
import com.bbva.network.event.impl.OkhttpEventListener;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import com.bbva.network.exceptions.SslConnectionException;
import com.bbva.network.extension.OkHttpKt;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.ConnectionStatusEvent;
import com.bbva.network.model.ConnectionThreshold;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.SpeedEvent;
import com.bbva.network.model.pinning.PinningCatalog;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.model.response.body.impl.OkHttpBody;
import com.bbva.network.security.OkHttpHandshakeInterceptor;
import com.bbva.network.state.NetworkStateEmitter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pa.a;

/* JADX INFO: compiled from: OkHttpNetworkWorker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019BG\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00103\u001a\u000202\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u00106\u001a\u00020!¢\u0006\u0004\b7\u00108J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\n\u001a\u00020\t2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0017H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006:"}, d2 = {"Lcom/bbva/network/impl/OkHttpNetworkWorker;", "Lcom/bbva/network/NetworkWorker;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/network/event/NetworkEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addEventListener", "Lcom/bbva/network/model/NetworkRequest;", "networkRequest", "Lcom/bbva/network/model/response/NetworkResponse;", "execute", "Lkotlin/Function1;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "Lkotlin/ExtensionFunctionType;", "requestBlock", "Lcom/bbva/network/RequestCallback;", "callback", "enqueue", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "interceptor", "addInterceptor", "", "cleanAllCookies", "Lcom/bbva/network/NetworkWebSocketListener;", "Lcom/bbva/network/WebSocketWorker;", "newWebSocket", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/network/model/SpeedEvent;", "speedEvents", "", "delay", "Lcom/bbva/network/model/ConnectionStatusEvent;", "connectionStatus", "Lcom/bbva/network/model/ConnectionThreshold;", MonochromeImageTransformer.THRESHOLD, "updateConnectionThreshold", "Lokhttp3/OkHttpClient;", "s0", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Lcom/bbva/network/model/pinning/PinningCatalog;", "pinningCatalog", "Ljava/net/CookieManager;", "cookieManager", "Lcom/bbva/network/ConnectionChecker;", "connectionChecker", "connectionThreshold", "<init>", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Lcom/bbva/network/model/pinning/PinningCatalog;Ljava/net/CookieManager;Lcom/bbva/network/ConnectionChecker;Lcom/bbva/network/model/ConnectionThreshold;)V", "Companion", "network_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkHttpNetworkWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpNetworkWorker.kt\ncom/bbva/network/impl/OkHttpNetworkWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n1855#2,2:216\n1855#2,2:218\n*S KotlinDebug\n*F\n+ 1 OkHttpNetworkWorker.kt\ncom/bbva/network/impl/OkHttpNetworkWorker\n*L\n90#1:216,2\n99#1:218,2\n*E\n"})
public final class OkHttpNetworkWorker implements NetworkWorker, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CookieManager f35094p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ConnectionChecker f35095q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35096r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OkHttpClient client;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final ArrayList f35098t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final OkhttpEventListener f35099u0;

    @NotNull
    public final Channel<SpeedEvent> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final NetworkStateEmitter f35100w0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OkHttpNetworkWorker(@NotNull Context context) {
        this(context, null, null, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Request a(NetworkRequest networkRequest) {
        Request.Builder builder = new Request.Builder();
        builder.url(networkRequest.getUrl());
        OkHttpKt.addMethodWithBody(builder, networkRequest.getMethod(), networkRequest.getBody());
        OkHttpKt.addHeaders(builder, networkRequest.getHeaders());
        return builder.build();
    }

    @Override // com.bbva.network.NetworkWorker
    public void addEventListener(@NotNull NetworkEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35099u0.addListener(listener);
    }

    @Override // com.bbva.network.NetworkWorker
    public void addInterceptor(@NotNull NetworkInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f35098t0.add(interceptor);
    }

    public final NetworkResponse b(NetworkRequest networkRequest) throws NotConnectionAvailable, ConnectionException {
        Response responseExecute;
        if (!this.f35095q0.isNetworkAvailable()) {
            throw new NotConnectionAvailable();
        }
        try {
            Request requestA = a(networkRequest);
            Integer timeout = networkRequest.getTimeout();
            OkHttpClient okHttpClient = this.client;
            if (timeout == null || (responseExecute = OkHttpKt.networkClientFromTimeout(timeout.intValue(), okHttpClient).newCall(requestA).execute()) == null) {
                responseExecute = okHttpClient.newCall(requestA).execute();
            }
            return c(responseExecute, networkRequest);
        } catch (SSLException e5) {
            e5.getMessage();
            String url = networkRequest.getUrl();
            String message = e5.getMessage();
            if (message == null) {
                message = "";
            }
            throw new SslConnectionException(url, message);
        } catch (IOException e7) {
            e7.getMessage();
            throw new ConnectionException(null, null, e7, 3, null);
        }
    }

    public final NetworkResponse c(Response response, NetworkRequest networkRequest) throws NotConnectionAvailable, ConnectionException {
        MutableNetworkResponse mutableNetworkResponse = new MutableNetworkResponse(new OkHttpBody(response.body()), OkHttpKt.mapHeaders(response), response.code(), networkRequest, response.message(), OkHttpKt.mapMultimapHeaders(response), response.request().url().getF85562i());
        mutableNetworkResponse.setHandshake(OkHttpKt.extractHandshake(response));
        Iterator it = this.f35098t0.iterator();
        while (it.hasNext()) {
            ((NetworkInterceptor) it.next()).onResponse(mutableNetworkResponse);
            if (mutableNetworkResponse.getIsDiscarded()) {
                return b(mutableNetworkResponse.getRequest());
            }
        }
        if (!response.isSuccessful()) {
            throw new ConnectionException(response.message(), mutableNetworkResponse, null, 4, null);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, response, mutableNetworkResponse, null), 3, null);
        return mutableNetworkResponse;
    }

    @Override // com.bbva.network.NetworkWorker
    public boolean cleanAllCookies() {
        CookieStore cookieStore = this.f35094p0.getCookieStore();
        if (cookieStore == null) {
            return false;
        }
        cookieStore.removeAll();
        return true;
    }

    @Override // com.bbva.network.NetworkWorker
    @NotNull
    public Flow<ConnectionStatusEvent> connectionStatus(long delay) {
        return this.f35100w0.events(delay);
    }

    @Override // com.bbva.network.NetworkWorker
    public void enqueue(@NotNull final NetworkRequest networkRequest, @NotNull final RequestCallback callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Iterator it = this.f35098t0.iterator();
        while (it.hasNext()) {
            ((NetworkInterceptor) it.next()).onRequest((MutableNetworkRequest) networkRequest);
        }
        Request requestA = a(networkRequest);
        Callback callback2 = new Callback() { // from class: com.bbva.network.impl.OkHttpNetworkWorker$executeAsync$requestCallbackObject$1
            @Override // okhttp3.Callback
            public void onFailure(@NotNull Call call, @NotNull IOException e5) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e5, "e");
                boolean z10 = e5 instanceof SSLException;
                RequestCallback requestCallback = callback;
                if (z10) {
                    requestCallback.onError(new SslConnectionException(networkRequest.getUrl(), e5.getMessage()));
                } else {
                    requestCallback.onError(new ConnectionException(null, null, e5, 3, null));
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                RequestCallback requestCallback = callback;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    requestCallback.onComplete(this.c(response, networkRequest));
                } catch (ConnectionException e5) {
                    requestCallback.onError(e5);
                } catch (NotConnectionAvailable e7) {
                    requestCallback.onError(new ConnectionException(e7.getMessage(), null, null, 4, null));
                }
            }
        };
        Integer timeout = networkRequest.getTimeout();
        OkHttpClient okHttpClient = this.client;
        if (timeout != null) {
            OkHttpKt.networkClientFromTimeout(timeout.intValue(), okHttpClient).newCall(requestA).enqueue(callback2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            okHttpClient.newCall(requestA).enqueue(callback2);
        }
    }

    @Override // com.bbva.network.NetworkWorker
    @NotNull
    public NetworkResponse execute(@NotNull NetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Iterator it = this.f35098t0.iterator();
        while (it.hasNext()) {
            ((NetworkInterceptor) it.next()).onRequest((MutableNetworkRequest) networkRequest);
        }
        return b(networkRequest);
    }

    @NotNull
    public final OkHttpClient getClient() {
        return this.client;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35096r0.getCoroutineContext();
    }

    @Override // com.bbva.network.NetworkWorker
    @NotNull
    public WebSocketWorker newWebSocket(@NotNull NetworkRequest networkRequest, @NotNull NetworkWebSocketListener listener) {
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Request requestA = a(networkRequest);
        OkHttpWebSocketListener okHttpWebSocketListener = new OkHttpWebSocketListener(networkRequest, listener);
        OkHttpWebSocketWorker okHttpWebSocketWorker = new OkHttpWebSocketWorker(this.client.newWebSocket(requestA, okHttpWebSocketListener));
        okHttpWebSocketListener.setSocket$network_release(okHttpWebSocketWorker);
        return okHttpWebSocketWorker;
    }

    @Override // com.bbva.network.NetworkWorker
    @NotNull
    public Flow<SpeedEvent> speedEvents() {
        return FlowKt.consumeAsFlow(this.v0);
    }

    @Override // com.bbva.network.NetworkWorker
    public void updateConnectionThreshold(@NotNull ConnectionThreshold threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f35100w0.setThreshold(threshold);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OkHttpNetworkWorker(@NotNull Context context, @Nullable OkHttpClient okHttpClient) {
        this(context, okHttpClient, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OkHttpNetworkWorker(@NotNull Context context, @Nullable OkHttpClient okHttpClient, @Nullable PinningCatalog pinningCatalog) {
        this(context, okHttpClient, pinningCatalog, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OkHttpNetworkWorker(@NotNull Context context, @Nullable OkHttpClient okHttpClient, @Nullable PinningCatalog pinningCatalog, @NotNull CookieManager cookieManager) {
        this(context, okHttpClient, pinningCatalog, cookieManager, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OkHttpNetworkWorker(@NotNull Context context, @Nullable OkHttpClient okHttpClient, @Nullable PinningCatalog pinningCatalog, @NotNull CookieManager cookieManager, @NotNull ConnectionChecker connectionChecker) {
        this(context, okHttpClient, pinningCatalog, cookieManager, connectionChecker, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        Intrinsics.checkNotNullParameter(connectionChecker, "connectionChecker");
    }

    @Override // com.bbva.network.NetworkWorker
    @NotNull
    public NetworkResponse execute(@NotNull Function1<? super MutableNetworkRequest, Unit> requestBlock) {
        Intrinsics.checkNotNullParameter(requestBlock, "requestBlock");
        MutableNetworkRequest mutableNetworkRequest = new MutableNetworkRequest();
        requestBlock.invoke(mutableNetworkRequest);
        return execute(mutableNetworkRequest);
    }

    @JvmOverloads
    public OkHttpNetworkWorker(@NotNull Context context, @Nullable OkHttpClient okHttpClient, @Nullable PinningCatalog pinningCatalog, @NotNull CookieManager cookieManager, @NotNull ConnectionChecker connectionChecker, @NotNull ConnectionThreshold connectionThreshold) {
        OkHttpClient.Builder builder;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        Intrinsics.checkNotNullParameter(connectionChecker, "connectionChecker");
        Intrinsics.checkNotNullParameter(connectionThreshold, "connectionThreshold");
        this.f35094p0 = cookieManager;
        this.f35095q0 = connectionChecker;
        this.f35096r0 = CoroutineScopeKt.MainScope();
        ArrayList arrayList = new ArrayList();
        this.f35098t0 = arrayList;
        OkhttpEventListener okhttpEventListener = new OkhttpEventListener();
        this.f35099u0 = okhttpEventListener;
        this.v0 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f35100w0 = new NetworkStateEmitter(connectionChecker, connectionThreshold);
        if (okHttpClient == null || (builder = okHttpClient.newBuilder()) == null) {
            builder = new OkHttpClient.Builder();
            builder.cookieJar(new JavaNetCookieJar(cookieManager));
        }
        builder.addNetworkInterceptor(new OkHttpHandshakeInterceptor(context, pinningCatalog, arrayList));
        builder.eventListener(okhttpEventListener);
        this.client = builder.build();
    }

    public /* synthetic */ OkHttpNetworkWorker(Context context, OkHttpClient okHttpClient, PinningCatalog pinningCatalog, CookieManager cookieManager, ConnectionChecker connectionChecker, ConnectionThreshold connectionThreshold, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : okHttpClient, (i10 & 4) != 0 ? null : pinningCatalog, (i10 & 8) != 0 ? new CookieManager(null, CookiePolicy.ACCEPT_ALL) : cookieManager, (i10 & 16) != 0 ? new AndroidConnectionChecker(context) : connectionChecker, (i10 & 32) != 0 ? new ConnectionThreshold(null, null, 3, null) : connectionThreshold);
    }
}
