package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.request.header.standin.StandInHeaderInterceptor;
import com.bbva.component.request.headers.HeaderInterceptor;
import com.bbva.component.request.headers.InterceptorConfig;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c1 extends Lambda implements Function2<Scope, ParametersHolder, HeaderInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c1 f34272p0 = new c1(2);

    @Override // kotlin.jvm.functions.Function2
    public final HeaderInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new HeaderInterceptor(new InterceptorConfig(bk.q.mutableMapOf(TuplesKt.to("authenticationtype", StandInHeaderInterceptor.AUTHTYPE58)), CollectionsKt__CollectionsKt.listOf((Object[]) new Regex[]{new Regex(".*/customers/.*/customers\\?.*"), new Regex(".*/customer-logins/.*/indicators")}), CollectionsKt__CollectionsKt.listOf((Object[]) new Regex[]{new Regex(".*/int.bbvaempresas.mx/.*"), new Regex(".*/pr-gema-mx.bbvaempresas.mx/qsrv_gemapr_mx_v2/.*"), new Regex(".*/lo-gema-mx.bbvaempresas.mx/qsrv_gemalo_v2_mx/.*"), new Regex(".*/financial-overview/.*/financial-overview.*")})));
    }
}
