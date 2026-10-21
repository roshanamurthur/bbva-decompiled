package com.bbva.glomohybrid.provider.module;

import com.bbva.cellscore.featureflag.FeatureFlagManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d3 extends Lambda implements Function2<Scope, ParametersHolder, FeatureFlagManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d3 f34031p0 = new d3(2);

    @Override // kotlin.jvm.functions.Function2
    public final FeatureFlagManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FeatureFlagManager();
    }
}
