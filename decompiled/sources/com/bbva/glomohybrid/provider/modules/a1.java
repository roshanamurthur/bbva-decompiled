package com.bbva.glomohybrid.provider.modules;

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
public final class a1 extends Lambda implements Function2<Scope, ParametersHolder, Map<String, ? extends List<? extends Map<String, ? extends String>>>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a1 f34264p0 = new a1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, ? extends List<? extends Map<String, ? extends String>>> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return bk.p.mapOf(TuplesKt.to("endpointsAkamai", CollectionsKt__CollectionsKt.listOf((Object[]) new Map[]{bk.q.mapOf(TuplesKt.to(com.salesforce.marketingcloud.config.a.f64109t, ".*/receivers/.*/receivers.*"), TuplesKt.to("method", "GET")), bk.q.mapOf(TuplesKt.to(com.salesforce.marketingcloud.config.a.f64109t, ".*/TechArchitecture/.*/grantingTicket/.*"), TuplesKt.to("method", "POST"))})));
    }
}
