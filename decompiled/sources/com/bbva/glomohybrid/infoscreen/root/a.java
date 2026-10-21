package com.bbva.glomohybrid.infoscreen.root;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: RootModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, RootFragment> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f32460p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final RootFragment invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NonRestrictiveRootFragment();
    }
}
