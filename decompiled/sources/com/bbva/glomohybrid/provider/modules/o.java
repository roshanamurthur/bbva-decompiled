package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.provider.CountryNotificationChannelsProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryNotificationChannelCreatorModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends Lambda implements Function2<Scope, ParametersHolder, CountryNotificationChannelsProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o f34320p0 = new o(2);

    @Override // kotlin.jvm.functions.Function2
    public final CountryNotificationChannelsProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryNotificationChannelsProvider(ModuleExtKt.androidApplication(single));
    }
}
