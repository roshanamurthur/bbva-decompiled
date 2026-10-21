package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUidPolicy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: DeviceManagerModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class v2 extends Lambda implements Function2<Scope, ParametersHolder, DeviceUIdRequest> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v2 f34185p0 = new v2(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeviceUIdRequest invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DeviceUIdRequest(DeviceUidPolicy.Default.INSTANCE);
    }
}
