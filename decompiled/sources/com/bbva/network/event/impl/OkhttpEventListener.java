package com.bbva.network.event.impl;

import androidx.core.app.NotificationCompat;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.event.CacheListener;
import com.bbva.network.event.CallListener;
import com.bbva.network.event.ConnectionListener;
import com.bbva.network.event.DnsListener;
import com.bbva.network.event.NetworkEventListener;
import com.bbva.network.event.ProxyListener;
import com.bbva.network.event.RequestListener;
import com.bbva.network.event.ResponseListener;
import com.bbva.network.extension.OkHttpKt;
import com.bbva.network.model.NetworkRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OkhttpEventListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b@\u0010AJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J2\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010?\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010>\u001a\u000201H\u0016¨\u0006B"}, d2 = {"Lcom/bbva/network/event/impl/OkhttpEventListener;", "Lokhttp3/EventListener;", "Lcom/bbva/network/event/NetworkEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionReleased", "connectionAcquired", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", DigipassManagerConstants.KEY_RESPONSE, "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callStart", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "<init>", "()V", "network_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkhttpEventListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkhttpEventListener.kt\ncom/bbva/network/event/impl/OkhttpEventListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1855#2,2:197\n1855#2,2:199\n1855#2,2:201\n1855#2,2:203\n1855#2,2:205\n1855#2,2:207\n1855#2,2:209\n1855#2,2:211\n1855#2,2:213\n1855#2,2:215\n1855#2,2:217\n1855#2,2:219\n1855#2,2:221\n1855#2,2:223\n1855#2,2:225\n1855#2,2:227\n1855#2,2:229\n1855#2,2:231\n1855#2,2:233\n1855#2,2:235\n1855#2,2:237\n1855#2,2:239\n1855#2,2:241\n1855#2,2:243\n1855#2,2:245\n1855#2,2:247\n1855#2,2:249\n1855#2,2:251\n1855#2,2:253\n*S KotlinDebug\n*F\n+ 1 OkhttpEventListener.kt\ncom/bbva/network/event/impl/OkhttpEventListener\n*L\n52#1:197,2\n56#1:199,2\n60#1:201,2\n64#1:203,2\n68#1:205,2\n72#1:207,2\n76#1:209,2\n83#1:211,2\n95#1:213,2\n101#1:215,2\n107#1:217,2\n113#1:219,2\n117#1:221,2\n121#1:223,2\n125#1:225,2\n129#1:227,2\n133#1:229,2\n137#1:231,2\n144#1:233,2\n148#1:235,2\n152#1:237,2\n156#1:239,2\n160#1:241,2\n164#1:243,2\n168#1:245,2\n172#1:247,2\n179#1:249,2\n186#1:251,2\n190#1:253,2\n*E\n"})
public final class OkhttpEventListener extends EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f35066a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f35067b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList f35068c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList f35069d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f35070e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f35071f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList f35072g = new ArrayList();

    public final void addListener(@NotNull NetworkEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (listener instanceof ProxyListener) {
            this.f35066a.add(listener);
            return;
        }
        if (listener instanceof DnsListener) {
            this.f35067b.add(listener);
            return;
        }
        if (listener instanceof ConnectionListener) {
            this.f35068c.add(listener);
            return;
        }
        if (listener instanceof RequestListener) {
            this.f35069d.add(listener);
            return;
        }
        if (listener instanceof ResponseListener) {
            this.f35070e.add(listener);
        } else if (listener instanceof CallListener) {
            this.f35071f.add(listener);
        } else if (listener instanceof CacheListener) {
            this.f35072g.add(listener);
        }
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@NotNull Call call, @NotNull Response cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        Iterator it = this.f35072g.iterator();
        while (it.hasNext()) {
            ((CacheListener) it.next()).conditionalHit(OkHttpKt.networkRequest(call), OkHttpKt.toNetworkResponse(cachedResponse, OkHttpKt.networkRequest(call)));
        }
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f35072g.iterator();
        while (it.hasNext()) {
            ((CacheListener) it.next()).hit(OkHttpKt.networkRequest(call), OkHttpKt.toNetworkResponse(response, OkHttpKt.networkRequest(call)));
        }
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35072g.iterator();
        while (it.hasNext()) {
            ((CacheListener) it.next()).miss(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35071f.iterator();
        while (it.hasNext()) {
            ((CallListener) it.next()).end(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f35071f.iterator();
        while (it.hasNext()) {
            ((CallListener) it.next()).onFail(OkHttpKt.networkRequest(call), ioe);
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35071f.iterator();
        while (it.hasNext()) {
            ((CallListener) it.next()).start(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void canceled(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35071f.iterator();
        while (it.hasNext()) {
            ((CallListener) it.next()).canceled(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Iterator it = this.f35068c.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).end(OkHttpKt.networkRequest(call), inetSocketAddress, proxy, protocol != null ? OkHttpKt.toNetworkProtocol(protocol) : null);
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f35068c.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).failed(OkHttpKt.networkRequest(call), inetSocketAddress, proxy, protocol != null ? OkHttpKt.toNetworkProtocol(protocol) : null, ioe);
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Iterator it = this.f35068c.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).start(OkHttpKt.networkRequest(call), inetSocketAddress, proxy);
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Iterator it = this.f35068c.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).acquired(OkHttpKt.networkRequest(call), OkHttpKt.toNetWorkConnection(connection));
        }
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Iterator it = this.f35068c.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).released(OkHttpKt.networkRequest(call), OkHttpKt.toNetWorkConnection(connection));
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        Iterator it = this.f35067b.iterator();
        while (it.hasNext()) {
            ((DnsListener) it.next()).end(OkHttpKt.networkRequest(call), domainName, inetAddressList);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Iterator it = this.f35067b.iterator();
        while (it.hasNext()) {
            ((DnsListener) it.next()).start(OkHttpKt.networkRequest(call), domainName);
        }
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl url, @NotNull List<? extends Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        Iterator it = this.f35066a.iterator();
        while (it.hasNext()) {
            ((ProxyListener) it.next()).selectEnd(OkHttpKt.networkRequest(call), url.url(), proxies);
        }
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator it = this.f35066a.iterator();
        while (it.hasNext()) {
            ((ProxyListener) it.next()).selectStart(OkHttpKt.networkRequest(call), url.url());
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35069d.iterator();
        while (it.hasNext()) {
            ((RequestListener) it.next()).bodyEnd(OkHttpKt.networkRequest(call), byteCount);
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35069d.iterator();
        while (it.hasNext()) {
            ((RequestListener) it.next()).bodyStart(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f35069d.iterator();
        while (it.hasNext()) {
            ((RequestListener) it.next()).onFail(OkHttpKt.networkRequest(call), ioe);
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator it = this.f35069d.iterator();
        while (it.hasNext()) {
            ((RequestListener) it.next()).headersEnd(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35069d.iterator();
        while (it.hasNext()) {
            ((RequestListener) it.next()).headersStart(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35070e.iterator();
        while (it.hasNext()) {
            ((ResponseListener) it.next()).bodyEnd(OkHttpKt.networkRequest(call), byteCount);
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35070e.iterator();
        while (it.hasNext()) {
            ((ResponseListener) it.next()).bodyStart(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f35070e.iterator();
        while (it.hasNext()) {
            ((ResponseListener) it.next()).onFail(OkHttpKt.networkRequest(call), ioe);
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        for (ResponseListener responseListener : this.f35070e) {
            NetworkRequest networkRequest = OkHttpKt.networkRequest(call);
            responseListener.headersEnd(networkRequest, OkHttpKt.toNetworkResponse(response, networkRequest));
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35070e.iterator();
        while (it.hasNext()) {
            ((ResponseListener) it.next()).headersStart(OkHttpKt.networkRequest(call));
        }
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f35071f.iterator();
        while (it.hasNext()) {
            ((CallListener) it.next()).satisfactionFailure(OkHttpKt.networkRequest(call), OkHttpKt.toNetworkResponse(response, OkHttpKt.networkRequest(call)));
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35068c.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).secureConnectEnd(OkHttpKt.networkRequest(call), handshake != null ? OkHttpKt.toNetworkHandshake(handshake, call.request().url().url()) : null);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f35068c.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).secureConnectStart(OkHttpKt.networkRequest(call));
        }
    }
}
