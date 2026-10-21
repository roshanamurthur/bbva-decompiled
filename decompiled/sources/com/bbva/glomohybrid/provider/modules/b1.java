package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.ic.security.factory.InterceptorsFactory;
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
public final class b1 extends Lambda implements Function2<Scope, ParametersHolder, Map<String, Object>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b1 f34268p0 = new b1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, Object> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return bk.q.mutableMapOf(TuplesKt.to("type", InterceptorsFactory.otpType), TuplesKt.to("whitelist", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/device-biometrics/.*/enrollments/finalize", ".*/business-documents/.*/business-documents"})), TuplesKt.to("config", bk.p.mapOf(TuplesKt.to("unauthorizedCode", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{403, 401})))));
    }
}
