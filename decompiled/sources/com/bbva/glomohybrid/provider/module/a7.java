package com.bbva.glomohybrid.provider.module;

import com.bbva.push.firebase.FirebasePushExecutor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PushesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a7 extends Lambda implements Function2<Scope, ParametersHolder, FirebasePushExecutor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a7 f34008p0 = new a7(2);

    @Override // kotlin.jvm.functions.Function2
    public final FirebasePushExecutor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FirebasePushExecutor();
    }
}
