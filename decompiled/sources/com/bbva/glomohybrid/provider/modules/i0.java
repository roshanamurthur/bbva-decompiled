package com.bbva.glomohybrid.provider.modules;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 extends Lambda implements Function2<Scope, ParametersHolder, Lazy<? extends String>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i0 f34297p0 = new i0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Lazy<? extends String> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return LazyKt__LazyJVMKt.lazy(new h0(factory));
    }
}
