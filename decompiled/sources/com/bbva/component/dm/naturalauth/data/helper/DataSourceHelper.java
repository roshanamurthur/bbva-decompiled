package com.bbva.component.dm.naturalauth.data.helper;

import bk.q;
import com.bbva.component.dm.naturalauth.domain.model.Endpoint;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DataSourceHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004JF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u000b2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/helper/DataSourceHelper;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", com.salesforce.marketingcloud.config.a.f64109t, "", "", "queryParams", "getHttpUrl", "url", "body", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headers", "Lcom/bbva/network/constant/Method;", "method", "Lcom/bbva/network/model/NetworkRequest;", "createRequest", "<init>", "()V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDataSourceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSourceHelper.kt\ncom/bbva/component/dm/naturalauth/data/helper/DataSourceHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1855#3,2:38\n*S KotlinDebug\n*F\n+ 1 DataSourceHelper.kt\ncom/bbva/component/dm/naturalauth/data/helper/DataSourceHelper\n*L\n34#1:38,2\n*E\n"})
public final class DataSourceHelper {

    @NotNull
    public static final DataSourceHelper INSTANCE = new DataSourceHelper();

    /* JADX INFO: compiled from: DataSourceHelper.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f27814p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f27815q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Method f27816r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f27817s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, HashMap map, Method method) {
            super(1);
            this.f27814p0 = str;
            this.f27815q0 = map;
            this.f27816r0 = method;
            this.f27817s0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setUrl(this.f27814p0);
            request.setHeaders(this.f27815q0);
            request.setMethod(this.f27816r0);
            byte[] bytes = this.f27817s0.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            request.setBody(new NetworkRequestBody.RequestBody(bytes, "application/json"));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRequest createRequest$default(DataSourceHelper dataSourceHelper, String str, String str2, HashMap map, Method method, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = new String();
        }
        if ((i10 & 4) != 0) {
            map = new HashMap();
        }
        return dataSourceHelper.createRequest(str, str2, map, method);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getHttpUrl$default(DataSourceHelper dataSourceHelper, Endpoint endpoint, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = q.emptyMap();
        }
        return dataSourceHelper.getHttpUrl(endpoint, map);
    }

    @NotNull
    public final NetworkRequest createRequest(@NotNull String url, @NotNull String body, @NotNull HashMap<String, String> headers, @NotNull Method method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        return MutableNetworkRequestKt.request(new a(url, body, headers, method));
    }

    @NotNull
    public final String getHttpUrl(@NotNull Endpoint endpoint, @NotNull Map<String, String> queryParams) {
        HttpUrl httpUrlBuild;
        HttpUrl.Builder builderNewBuilder;
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(endpoint.getUrl());
        if (httpUrl == null || (builderNewBuilder = httpUrl.newBuilder()) == null) {
            httpUrlBuild = null;
        } else {
            Iterator<T> it = queryParams.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                builderNewBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            httpUrlBuild = builderNewBuilder.build();
        }
        return String.valueOf(httpUrlBuild);
    }
}
