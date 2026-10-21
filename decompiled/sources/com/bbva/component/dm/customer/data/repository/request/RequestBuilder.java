package com.bbva.component.dm.customer.data.repository.request;

import android.net.Uri;
import bk.q;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\\\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/request/RequestBuilder;", "", "", "url", "", "queryParams", "body", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headers", "Lcom/bbva/network/constant/Method;", "method", "Lcom/bbva/network/model/NetworkRequest;", "createRequest", "<init>", "()V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRequestBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBuilder.kt\ncom/bbva/component/dm/customer/data/repository/request/RequestBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,35:1\n1#2:36\n215#3,2:37\n*S KotlinDebug\n*F\n+ 1 RequestBuilder.kt\ncom/bbva/component/dm/customer/data/repository/request/RequestBuilder\n*L\n30#1:37,2\n*E\n"})
public final class RequestBuilder {

    /* JADX INFO: compiled from: RequestBuilder.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f27565q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f27566r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f27567s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Method f27568t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f27569u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Map<String, String> map, String str2, Method method, HashMap<String, String> map2) {
            super(1);
            this.f27565q0 = str;
            this.f27566r0 = map;
            this.f27567s0 = str2;
            this.f27568t0 = method;
            this.f27569u0 = map2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setUrl(RequestBuilder.access$withParams(RequestBuilder.this, this.f27565q0, this.f27566r0));
            byte[] bytes = this.f27567s0.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            request.setBody(new NetworkRequestBody.RequestBody(bytes, "application/json"));
            request.setMethod(this.f27568t0);
            request.setHeaders(this.f27569u0);
            return Unit.INSTANCE;
        }
    }

    public static final String access$withParams(RequestBuilder requestBuilder, String str, Map map) {
        requestBuilder.getClass();
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRequest createRequest$default(RequestBuilder requestBuilder, String str, Map map, String str2, HashMap map2, Method method, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = q.emptyMap();
        }
        Map map3 = map;
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            map2 = new HashMap();
        }
        return requestBuilder.createRequest(str, map3, str3, map2, method);
    }

    @NotNull
    public final NetworkRequest createRequest(@NotNull String url, @NotNull Map<String, String> queryParams, @NotNull String body, @NotNull HashMap<String, String> headers, @NotNull Method method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        return MutableNetworkRequestKt.request(new a(url, queryParams, body, method, headers));
    }
}
