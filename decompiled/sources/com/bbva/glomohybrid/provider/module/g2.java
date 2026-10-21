package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ComponentModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g2 extends Lambda implements Function2<Scope, ParametersHolder, Map<String, ? extends Map<String, ? extends String>>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g2 f34057p0 = new g2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, ? extends Map<String, ? extends String>> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return bk.p.mapOf(TuplesKt.to("whitelist", bk.q.mapOf(TuplesKt.to(LocalStorageConstantsKt.ETAG_APPSETTINGS, ".*/public.app-setting.json$"), TuplesKt.to(LocalStorageConstantsKt.ETAG_FEATUREFLAGS, ".*/feature-flags.json$"), TuplesKt.to(LocalStorageConstantsKt.ETAG_PROFILING, ".*/profiling.json$"))));
    }
}
