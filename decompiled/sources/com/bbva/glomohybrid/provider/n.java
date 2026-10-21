package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends Lambda implements Function2<Scope, ParametersHolder, ZipActionsFlow> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n f34364p0 = new n(2);

    @Override // kotlin.jvm.functions.Function2
    public final ZipActionsFlow invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ZipActionsFlow();
    }
}
