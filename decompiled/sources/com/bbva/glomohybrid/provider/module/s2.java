package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: DeviceManagerModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class s2 extends Lambda implements Function2<Scope, ParametersHolder, DeviceManagerGmsApi> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s2 f34161p0 = new s2(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeviceManagerGmsApi invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DeviceManagerGmsApi(ModuleExtKt.androidApplication(single));
    }
}
