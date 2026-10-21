package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.login.data.MemoryFailureCounter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h4 extends Lambda implements Function2<Scope, ParametersHolder, MemoryFailureCounter> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h4 f34068p0 = new h4(2);

    @Override // kotlin.jvm.functions.Function2
    public final MemoryFailureCounter invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MemoryFailureCounter();
    }
}
