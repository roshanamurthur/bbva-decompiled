package com.bbva.component.dm.anonymous;

import bk.q;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnonymousLoginInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010$\u001a\u00020#\u0012\u0010\u0010'\u001a\f\u0012\u0004\u0012\u00020\u00040%j\u0002`&\u0012\u0010\u0010(\u001a\f\u0012\u0004\u0012\u00020\u00040%j\u0002`&¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0004R\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R.\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/bbva/component/dm/anonymous/AnonymousLoginInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "", "token", "continueWith", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "Ljava/util/concurrent/Semaphore;", "d", "Ljava/util/concurrent/Semaphore;", "getSemaphore$component_dm_anonymous_release", "()Ljava/util/concurrent/Semaphore;", "setSemaphore$component_dm_anonymous_release", "(Ljava/util/concurrent/Semaphore;)V", "semaphore", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getWaitingForAuthentication$component_dm_anonymous_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "waitingForAuthentication", "", "f", "Ljava/util/Map;", "getRequestQueue$component_dm_anonymous_release", "()Ljava/util/Map;", "setRequestQueue$component_dm_anonymous_release", "(Ljava/util/Map;)V", "requestQueue", "Lcom/bbva/component/dm/anonymous/InterceptorConfiguration;", "configuration", "Lkotlin/Function0;", "Lcom/bbva/component/dm/anonymous/EventTrigger;", "onTokenRequest", "onConsumed", "<init>", "(Lcom/bbva/component/dm/anonymous/InterceptorConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component-dm-anonymous_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnonymousLoginInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnonymousLoginInterceptor.kt\ncom/bbva/component/dm/anonymous/AnonymousLoginInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1747#2,3:83\n1855#2,2:87\n1#3:86\n*S KotlinDebug\n*F\n+ 1 AnonymousLoginInterceptor.kt\ncom/bbva/component/dm/anonymous/AnonymousLoginInterceptor\n*L\n59#1:83,3\n67#1:87,2\n*E\n"})
public final class AnonymousLoginInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterceptorConfiguration f27426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f27427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f27428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Semaphore semaphore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean waitingForAuthentication;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, MutableNetworkRequest> requestQueue;

    public AnonymousLoginInterceptor(@NotNull InterceptorConfiguration configuration, @NotNull Function0<Unit> onTokenRequest, @NotNull Function0<Unit> onConsumed) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(onTokenRequest, "onTokenRequest");
        Intrinsics.checkNotNullParameter(onConsumed, "onConsumed");
        this.f27426a = configuration;
        this.f27427b = onTokenRequest;
        this.f27428c = onConsumed;
        this.semaphore = new Semaphore(0);
        this.waitingForAuthentication = new AtomicBoolean(false);
        this.requestQueue = new LinkedHashMap();
    }

    public final boolean a(String str) {
        List<Regex> whiteList = this.f27426a.getWhiteList();
        if ((whiteList instanceof Collection) && whiteList.isEmpty()) {
            return false;
        }
        Iterator<T> it = whiteList.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).matches(str)) {
                return true;
            }
        }
        return false;
    }

    public final void cancel() {
        if (this.waitingForAuthentication.getAndSet(false)) {
            int size = this.requestQueue.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.semaphore.release();
            }
            this.requestQueue.clear();
        }
    }

    public final void continueWith(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (this.waitingForAuthentication.getAndSet(false) && (!l.isBlank(token))) {
            for (MutableNetworkRequest mutableNetworkRequest : this.requestQueue.values()) {
                mutableNetworkRequest.setHeaders(q.plus(mutableNetworkRequest.getHeaders(), TuplesKt.to(this.f27426a.getAuthHeaderName(), token)));
            }
            int size = this.requestQueue.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.semaphore.release();
            }
        }
    }

    @NotNull
    public final Map<String, MutableNetworkRequest> getRequestQueue$component_dm_anonymous_release() {
        return this.requestQueue;
    }

    @NotNull
    /* JADX INFO: renamed from: getSemaphore$component_dm_anonymous_release, reason: from getter */
    public final Semaphore getSemaphore() {
        return this.semaphore;
    }

    @NotNull
    /* JADX INFO: renamed from: getWaitingForAuthentication$component_dm_anonymous_release, reason: from getter */
    public final AtomicBoolean getWaitingForAuthentication() {
        return this.waitingForAuthentication;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) throws InterruptedException {
        Intrinsics.checkNotNullParameter(request, "request");
        String str = request.getHeaders().get(this.f27426a.getAuthHeaderName());
        if (str == null) {
            str = "";
        }
        if ((!l.isBlank(str)) || !a(request.getUrl())) {
            return;
        }
        if (!this.waitingForAuthentication.getAndSet(true)) {
            this.f27427b.invoke();
        }
        this.requestQueue.put(request.getUrl(), request);
        this.semaphore.acquire();
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (a(response.getRequest().getUrl()) && this.requestQueue.remove(response.getRequest().getUrl()) != null && this.requestQueue.isEmpty()) {
            this.f27428c.invoke();
        }
    }

    public final void setRequestQueue$component_dm_anonymous_release(@NotNull Map<String, MutableNetworkRequest> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.requestQueue = map;
    }

    public final void setSemaphore$component_dm_anonymous_release(@NotNull Semaphore semaphore) {
        Intrinsics.checkNotNullParameter(semaphore, "<set-?>");
        this.semaphore = semaphore;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
