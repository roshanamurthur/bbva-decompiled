package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import com.bbva.glomohybrid.landing.data.repository.DeviceInfoRepository;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r3 extends Lambda implements Function2<Scope, ParametersHolder, DeviceInfoRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r3 f34153p0 = new r3(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeviceInfoRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DeviceInfoRepository(new Sys(ModuleExtKt.androidContext(single)));
    }
}
