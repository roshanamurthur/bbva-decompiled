package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.router.RouterWelcome;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class x0 extends Lambda implements Function2<Scope, ParametersHolder, RouterWelcome> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x0 f34199p0 = new x0(2);

    @Override // kotlin.jvm.functions.Function2
    public final RouterWelcome invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new RouterWelcome();
    }
}
