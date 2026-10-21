package com.bbva.glomohybrid.provider;

import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class m extends Lambda implements Function2<Scope, ParametersHolder, DeviceInfo> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m f33933p0 = new m(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeviceInfo invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DeviceInfo(ModuleExtKt.androidContext(factory));
    }
}
