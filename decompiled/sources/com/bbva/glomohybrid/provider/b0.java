package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends Lambda implements Function2<Scope, ParametersHolder, PaymentsNotificationHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b0 f33909p0 = new b0(2);

    @Override // kotlin.jvm.functions.Function2
    public final PaymentsNotificationHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new PaymentsNotificationHandler(ModuleExtKt.androidContext(factory));
    }
}
