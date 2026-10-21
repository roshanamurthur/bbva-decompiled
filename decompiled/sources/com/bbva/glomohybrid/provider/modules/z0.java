package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class z0 extends Lambda implements Function2<Scope, ParametersHolder, Map<String, List<? extends Map<String, Object>>>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z0 f34362p0 = new z0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, List<? extends Map<String, Object>>> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return bk.q.mutableMapOf(TuplesKt.to("endpointsSecurity", CollectionsKt__CollectionsKt.listOf((Object[]) new Map[]{bk.q.mutableMapOf(TuplesKt.to("id", AuthTokenInterceptorsIds.GLOMO.toString()), TuplesKt.to("type", "tsec"), TuplesKt.to("endpointsWhitelist", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{".*/customers/.*/customers$", ".*/customer-logins/v1/logins", ".*/customer-logins/.*/indicators", ".*/documents/.*/documents/.*", ".*/device-biometrics/.*/enrollments.*", ".*/device-biometrics/.*/authentications.*", ".*/cards/.*/cards/.*", ".*/business-documents/.*/business-documents", ".*/accounts/.*/accounts/.*", ".*/single-sign-on/.*/single-sign-on", ".*/business-documents/.*/insurance-documents/generate"})), TuplesKt.to("domainsWhitelist", bk.d.listOf(".*")), TuplesKt.to("domainsBlacklist", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"aso-dev-global.work-01.platform.bbva.com", "aso-int-global.work-01.platform.bbva.com", "aso-customers-global.live-01.platform.bbva.com"}))), bk.q.mutableMapOf(TuplesKt.to("id", AuthTokenInterceptorsIds.TENANT.toString()), TuplesKt.to("type", "tsec"), TuplesKt.to("endpointsWhitelist", bk.d.listOf(".*")), TuplesKt.to("domainsWhitelist", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"aso-dev-global.work-01.platform.bbva.com", "aso-int-global.work-01.platform.bbva.com", "aso-customers-global.live-01.platform.bbva.com"})))})));
    }
}
