package com.bbva.component.dm.headers.interceptor;

import android.net.Uri;
import bk.q;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.nativesettings.common.Constants;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TsecInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/TsecInterceptor;", "Lcom/bbva/component/dm/headers/interceptor/TokenInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lkotlin/Function1;", "Lcom/bbva/component/dm/headers/interceptor/AccessToken;", "Lcom/bbva/component/dm/headers/interceptor/AccessTokenChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/bbva/component/dm/headers/interceptor/EndpointsSecurity;", Constants.SECURITY, "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/bbva/component/dm/headers/interceptor/EndpointsSecurity;)V", "Companion", "component-ic-token_release"}, k = 1, mv = {1, 8, 0})
public final class TsecInterceptor extends TokenInterceptor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final EndpointsSecurity f27668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TsecInterceptor(@NotNull Function1<? super AccessToken, Unit> listener, @NotNull EndpointsSecurity security) {
        super(security.getId$component_ic_token_release(), "tsec", listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(security, "security");
        this.f27668e = security;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = Uri.parse(request.getUrl());
        Intrinsics.checkNotNullExpressionValue(url, "url");
        if (this.f27668e.isAllowedSetupToken(url)) {
            request.getHeaders();
            String f27667d = getF27667d();
            if (f27667d != null) {
                request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to("tsec", f27667d)));
            }
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Uri uri = Uri.parse(response.getUrl());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(response.url)");
        if (this.f27668e.isAllowedUpdateToken(uri)) {
            Object ignoreCase = ExtensionsKt.getIgnoreCase(response.getHeaders(), "tsec");
            String str = (String) ignoreCase;
            if (!(!(str == null || str.length() == 0))) {
                ignoreCase = null;
            }
            String str2 = (String) ignoreCase;
            if (str2 != null) {
                setToken(str2, Uri.parse(response.getUrl()).getHost());
            }
        }
    }
}
