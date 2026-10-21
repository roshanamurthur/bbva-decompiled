package com.bbva.glomohybrid.provider;

import com.bbva.glomo.resource.ResourceProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends Lambda implements Function2<Scope, ParametersHolder, ResourceProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h f33923p0 = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final ResourceProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ResourceProvider(ModuleExtKt.androidApplication(single));
    }
}
