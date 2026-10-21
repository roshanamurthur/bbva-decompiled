package com.bbva.glomohybrid.provider.module;

import com.bbva.component_devicemanager.data.GlobalDeviceManagerData;
import com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceCheckerPlayIntegrityRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUIdRequest;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: DeviceManagerModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDeviceManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerModule.kt\ncom/bbva/glomohybrid/provider/module/DeviceManagerModuleKt$deviceManagerModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,35:1\n129#2,5:36\n129#2,5:41\n129#2,5:46\n129#2,5:51\n*S KotlinDebug\n*F\n+ 1 DeviceManagerModule.kt\ncom/bbva/glomohybrid/provider/module/DeviceManagerModuleKt$deviceManagerModule$1$2\n*L\n18#1:36,5\n19#1:41,5\n20#1:46,5\n21#1:51,5\n*E\n"})
public final class t2 extends Lambda implements Function2<Scope, ParametersHolder, GlobalDeviceManagerData> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t2 f34169p0 = new t2(2);

    @Override // kotlin.jvm.functions.Function2
    public final GlobalDeviceManagerData invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GlobalDeviceManagerData((DeviceManagerGmsApi) single.get(Reflection.getOrCreateKotlinClass(DeviceManagerGmsApi.class), null, null), (RememberedUserDataSource) single.get(Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, null), (DeviceCheckerPlayIntegrityRequest) single.get(Reflection.getOrCreateKotlinClass(DeviceCheckerPlayIntegrityRequest.class), null, null), (DeviceUIdRequest) single.get(Reflection.getOrCreateKotlinClass(DeviceUIdRequest.class), null, null));
    }
}
