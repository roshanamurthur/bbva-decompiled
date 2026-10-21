package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.services.GoogleCrashlytics;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r4 extends Lambda implements Function2<Scope, ParametersHolder, Crashlytics> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r4 f34154p0 = new r4(2);

    @Override // kotlin.jvm.functions.Function2
    public final Crashlytics invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GoogleCrashlytics();
    }
}
