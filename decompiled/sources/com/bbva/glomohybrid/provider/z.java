package com.bbva.glomohybrid.provider;

import android.content.Context;
import com.bbva.notifications.provider.NotificationBuilderProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class z extends Lambda implements Function2<Scope, ParametersHolder, NotificationBuilderProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z f34379p0 = new z(2);

    @Override // kotlin.jvm.functions.Function2
    public final NotificationBuilderProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Context applicationContext = ModuleExtKt.androidApplication(factory).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new NotificationBuilderProvider(applicationContext);
    }
}
