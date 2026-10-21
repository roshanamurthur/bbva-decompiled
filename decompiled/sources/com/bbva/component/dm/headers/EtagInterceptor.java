package com.bbva.component.dm.headers;

import bk.q;
import bk.s;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtagInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/headers/EtagInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "", "Lcom/bbva/component/dm/headers/WhitelistedUrl;", "whitelistedUrl", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Ljava/util/List;Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "component-dm-cacheheaders_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEtagInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtagInterceptor.kt\ncom/bbva/component/dm/headers/EtagInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n288#2,2:45\n288#2,2:47\n1#3:49\n*S KotlinDebug\n*F\n+ 1 EtagInterceptor.kt\ncom/bbva/component/dm/headers/EtagInterceptor\n*L\n14#1:45,2\n21#1:47,2\n*E\n"})
public final class EtagInterceptor implements NetworkInterceptor {

    @NotNull
    public static final String HEADER_ETAG = "etag";

    @NotNull
    public static final String HEADER_IF_NONE_MATCH = "If-None-Match";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<WhitelistedUrl> f27653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f27654b;

    public EtagInterceptor(@NotNull List<WhitelistedUrl> whitelistedUrl, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(whitelistedUrl, "whitelistedUrl");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f27653a = whitelistedUrl;
        this.f27654b = storage;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Object next;
        String string$default;
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator<T> it = this.f27653a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((WhitelistedUrl) next).getRegex().matches(request.getUrl()));
        WhitelistedUrl whitelistedUrl = (WhitelistedUrl) next;
        if (whitelistedUrl == null || (string$default = MainStorage.getString$default(this.f27654b, whitelistedUrl.getKey(), null, false, null, 14, null)) == null) {
            return;
        }
        request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to(HEADER_IF_NONE_MATCH, string$default)));
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator<T> it = this.f27653a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((WhitelistedUrl) next).getRegex().matches(response.getRequest().getUrl()));
        WhitelistedUrl whitelistedUrl = (WhitelistedUrl) next;
        if (whitelistedUrl != null) {
            MainStorage mainStorage = this.f27654b;
            String key = whitelistedUrl.getKey();
            Iterator it2 = s.toList(response.getHeaders()).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!l.equals((String) ((Pair) next2).getFirst(), HEADER_ETAG, true));
            Pair pair = (Pair) next2;
            MainStorage.put$default(mainStorage, key, pair != null ? (String) pair.getSecond() : null, false, null, 12, null);
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
