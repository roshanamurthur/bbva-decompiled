package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.services.GoogleMobileServices;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class t4 extends Lambda implements Function2<Scope, ParametersHolder, MobileServices> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t4 f34171p0 = new t4(2);

    @Override // kotlin.jvm.functions.Function2
    public final MobileServices invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GoogleMobileServices();
    }
}
