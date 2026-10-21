package com.bbva.glomohybrid.provider.modules;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class t0 extends Lambda implements Function2<Scope, ParametersHolder, Map<String, ? extends Object>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t0 f34342p0 = new t0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, ? extends Object> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return bk.q.mapOf(TuplesKt.to("authHeaderName", "tsec"), TuplesKt.to("whiteList", bk.d.listOf(".*/customers/.*/customers.*")), TuplesKt.to("cleanList", bk.d.listOf(".*/TechArchitecture/mx/grantingTicket/.*")));
    }
}
