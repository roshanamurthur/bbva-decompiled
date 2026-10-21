package com.bbva.component.dm.settings.repository.datasource;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import bk.q;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.infraestructure.AppSettingsMapper;
import com.bbva.component.dm.settings.infraestructure.AppSettingsMapperProvider;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.network.model.response.NetworkResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkSettingsDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J`\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042$\b\u0002\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/settings/repository/datasource/NetworkSettingsDataSource;", "", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "getSettings", "", "url", "", "queryParams", "body", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headers", "Lcom/bbva/network/constant/Method;", "method", "Lcom/bbva/network/model/NetworkRequest;", "createRequest", "Lcom/bbva/network/NetworkWorker;", "networkWorker", com.salesforce.marketingcloud.config.a.f64109t, "Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapper;", "appSettingsMapper", "<init>", "(Lcom/bbva/network/NetworkWorker;Ljava/lang/String;Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapper;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkSettingsDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkSettingsDataSource.kt\ncom/bbva/component/dm/settings/repository/datasource/NetworkSettingsDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,68:1\n1#2:69\n215#3,2:70\n*S KotlinDebug\n*F\n+ 1 NetworkSettingsDataSource.kt\ncom/bbva/component/dm/settings/repository/datasource/NetworkSettingsDataSource\n*L\n63#1:70,2\n*E\n"})
public final class NetworkSettingsDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f28039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f28040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AppSettingsMapper f28041c;

    /* JADX INFO: compiled from: NetworkSettingsDataSource.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f28043q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f28044r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f28045s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Method f28046t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f28047u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Map<String, String> map, HashMap<String, String> map2, Method method, String str2) {
            super(1);
            this.f28043q0 = str;
            this.f28044r0 = map;
            this.f28045s0 = map2;
            this.f28046t0 = method;
            this.f28047u0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setUrl(NetworkSettingsDataSource.access$withParams(NetworkSettingsDataSource.this, this.f28043q0, this.f28044r0));
            request.setHeaders(this.f28045s0);
            request.setMethod(this.f28046t0);
            byte[] bytes = this.f28047u0.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            request.setBody(new NetworkRequestBody.RequestBody(bytes, "application/json"));
            return Unit.INSTANCE;
        }
    }

    public NetworkSettingsDataSource(@NotNull NetworkWorker networkWorker, @NotNull String endpoint, @NotNull AppSettingsMapper appSettingsMapper) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(appSettingsMapper, "appSettingsMapper");
        this.f28039a = networkWorker;
        this.f28040b = endpoint;
        this.f28041c = appSettingsMapper;
    }

    public static final String access$withParams(NetworkSettingsDataSource networkSettingsDataSource, String str, Map map) {
        networkSettingsDataSource.getClass();
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
    public static /* synthetic */ NetworkRequest createRequest$default(NetworkSettingsDataSource networkSettingsDataSource, String str, Map map, String str2, HashMap map2, Method method, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = q.emptyMap();
        }
        Map map3 = map;
        if ((i10 & 4) != 0) {
            str2 = new String();
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            map2 = new HashMap();
        }
        HashMap map4 = map2;
        if ((i10 & 16) != 0) {
            method = Method.GET;
        }
        return networkSettingsDataSource.createRequest(str, map3, str3, map4, method);
    }

    @VisibleForTesting
    @NotNull
    public final NetworkRequest createRequest(@NotNull String url, @NotNull Map<String, String> queryParams, @NotNull String body, @NotNull HashMap<String, String> headers, @NotNull Method method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        return MutableNetworkRequestKt.request(new a(url, queryParams, headers, method, body));
    }

    @Nullable
    public final AppSettingsResult getSettings() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        NetworkResponse networkResponse;
        NetworkRequest networkRequestCreateRequest$default = createRequest$default(this, this.f28040b, null, null, null, null, 30, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f28039a.execute(networkRequestCreateRequest$default));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                NetworkResponse networkResponse2 = (NetworkResponse) objM5535constructorimpl;
                AppSettings map = this.f28041c.map(networkResponse2.getBody().inputStream());
                if (map == null) {
                    map = new AppSettings(q.emptyMap());
                }
                objM5535constructorimpl2 = Result.m5535constructorimpl(new AppSettingsResult.FreshResult(map, networkResponse2.getCode()));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl != null && (thM5538exceptionOrNullimpl instanceof ConnectionException) && ((networkResponse = ((ConnectionException) thM5538exceptionOrNullimpl).getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String()) == null || networkResponse.getCode() != 304)) {
            LoggerKt.logCritical$default("appsettings-error", thM5538exceptionOrNullimpl, null, 4, null);
        }
        Throwable thM5538exceptionOrNullimpl2 = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl2 != null) {
            Intrinsics.checkNotNull(thM5538exceptionOrNullimpl2, "null cannot be cast to non-null type com.bbva.network.exceptions.ConnectionException");
            NetworkResponse networkResponse3 = ((ConnectionException) thM5538exceptionOrNullimpl2).getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
            objM5535constructorimpl2 = new AppSettingsResult.ErrorResult((Exception) thM5538exceptionOrNullimpl2, networkResponse3 != null ? networkResponse3.getCode() : 0);
        }
        return (AppSettingsResult) objM5535constructorimpl2;
    }

    public /* synthetic */ NetworkSettingsDataSource(NetworkWorker networkWorker, String str, AppSettingsMapper appSettingsMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkWorker, str, (i10 & 4) != 0 ? new AppSettingsMapperProvider().getMapper() : appSettingsMapper);
    }
}
