package com.bbva.component.request.header.standin;

import bk.q;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: StandInHeaderInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/request/header/standin/StandInHeaderInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lcom/bbva/component/request/header/standin/StandInInterceptorConfig;", "config", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "dataSource", "<init>", "(Lcom/bbva/component/request/header/standin/StandInInterceptorConfig;Lcom/bbva/glomo/localstorage/DeviceIdDataSource;)V", "Companion", "request-header-standin_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStandInHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandInHeaderInterceptor.kt\ncom/bbva/component/request/header/standin/StandInHeaderInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1747#2,3:46\n*S KotlinDebug\n*F\n+ 1 StandInHeaderInterceptor.kt\ncom/bbva/component/request/header/standin/StandInHeaderInterceptor\n*L\n21#1:46,3\n*E\n"})
public final class StandInHeaderInterceptor implements NetworkInterceptor {

    @NotNull
    public static final String AUTHENTICATION_DATA = "authenticationdata";

    @NotNull
    public static final String AUTHENTICATION_TYPE = "authenticationtype";

    @NotNull
    public static final String AUTHTYPE58 = "58";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StandInInterceptorConfig f28215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceIdDataSource f28216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f28217c;

    public StandInHeaderInterceptor(@NotNull StandInInterceptorConfig config, @NotNull DeviceIdDataSource dataSource) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f28215a = config;
        this.f28216b = dataSource;
        this.f28217c = KoinJavaComponent.inject$default(FeatureFlagsRepository.class, null, null, 6, null);
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        String deviceId;
        Intrinsics.checkNotNullParameter(request, "request");
        List<Regex> allowList = this.f28215a.getAllowList();
        if ((allowList instanceof Collection) && allowList.isEmpty()) {
            return;
        }
        Iterator<T> it = allowList.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).matches(request.getUrl())) {
                if (!FeatureFlagRepositoryExtensionKt.isStandInEnabled((FeatureFlagsRepository) this.f28217c.getValue()) || (deviceId = this.f28216b.getDeviceId()) == null || deviceId.length() == 0) {
                    return;
                }
                request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to("authenticationtype", AUTHTYPE58)));
                request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to("authenticationdata", "deviceId=".concat(deviceId))));
                return;
            }
        }
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
