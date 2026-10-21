package com.bbva.glomohybrid.provider.module;

import com.bbva.push.firebase.FirebasePushSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PushesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b7 extends Lambda implements Function2<Scope, ParametersHolder, FirebasePushSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b7 f34017p0 = new b7(2);

    @Override // kotlin.jvm.functions.Function2
    public final FirebasePushSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return FirebasePushSource.INSTANCE;
    }
}
