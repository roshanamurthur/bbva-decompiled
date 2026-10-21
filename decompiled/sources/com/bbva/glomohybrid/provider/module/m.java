package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.network.NetworkWorker;
import com.bbva.notifications.activity.NotificationActivity;
import com.bbva.notifications.domain.NotificationsDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$dataSource$1$10\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n129#2,5:304\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$dataSource$1$10\n*L\n137#1:299,5\n139#1:304,5\n*E\n"})
public final class m extends Lambda implements Function2<Scope, ParametersHolder, NotificationsDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m f34108p0 = new m(2);

    @Override // kotlin.jvm.functions.Function2
    public final NotificationsDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        GlobalConfig globalConfig = (GlobalConfig) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", GlobalConfig.class), null, null);
        return new NotificationsDataSource((NetworkWorker) scope2.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), androidx.camera.camera2.internal.compat.u.f(globalConfig.getHost(), globalConfig.namedPath(NotificationActivity.ID)), null, 4, null);
    }
}
