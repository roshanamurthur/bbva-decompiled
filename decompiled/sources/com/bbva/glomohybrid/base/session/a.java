package com.bbva.glomohybrid.base.session;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SessionModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, Session> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f31543p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final Session invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new Session();
    }
}
