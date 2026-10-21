package com.bbva.glomohybrid.provider.modules;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class m1 extends Lambda implements Function2<Scope, ParametersHolder, String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m1 f34314p0 = new m1(2);

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return "https://fido-lc.live.usa.blueshellcloud.com/uaf/facets.uaf";
    }
}
