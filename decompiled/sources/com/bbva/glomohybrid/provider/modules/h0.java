package com.bbva.glomohybrid.provider.modules;

import com.bbva.ethermobilesdk.deviceuid.DeviceUID;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomohybrid.ether.ShortedExternalDeviceIdProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nEtherModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherModule.kt\ncom/bbva/glomohybrid/provider/modules/EtherModuleKt$etherModule$1$2$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,32:1\n129#2,5:33\n*S KotlinDebug\n*F\n+ 1 EtherModule.kt\ncom/bbva/glomohybrid/provider/modules/EtherModuleKt$etherModule$1$2$1\n*L\n20#1:33,5\n*E\n"})
public final class h0 extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Scope f34293p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Scope scope) {
        super(0);
        this.f34293p0 = scope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class);
        Scope scope = this.f34293p0;
        return new ShortedExternalDeviceIdProvider((DeviceIdDataSource) scope.get(orCreateKotlinClass, null, null), (DeviceUID) scope.get(Reflection.getOrCreateKotlinClass(DeviceUID.class), null, null)).obtain();
    }
}
