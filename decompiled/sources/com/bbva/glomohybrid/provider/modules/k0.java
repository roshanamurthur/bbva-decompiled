package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.base.delegates.glomo.features.ActiveUserFeaturesDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: GlomoFeaturesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class k0 extends Lambda implements Function2<Scope, ParametersHolder, ActiveUserFeaturesDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k0 f34305p0 = new k0(2);

    @Override // kotlin.jvm.functions.Function2
    public final ActiveUserFeaturesDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return GlomoFeaturesModuleKt.access$createActiveUserFeaturesDelegate(factory);
    }
}
