package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.datasource.NetworkSettingsDataSource;
import com.bbva.component.dm.settings.repository.datasource.StorageDataSource;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$repository$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n129#2,5:304\n129#2,5:309\n129#2,5:314\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$repository$1$1\n*L\n152#1:299,5\n153#1:304,5\n154#1:309,5\n155#1:314,5\n*E\n"})
public final class t0 extends Lambda implements Function2<Scope, ParametersHolder, AppSettingsRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t0 f34167p0 = new t0(2);

    @Override // kotlin.jvm.functions.Function2
    public final AppSettingsRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        return new AppSettingsRepository(new NetworkSettingsDataSource((NetworkWorker) scope2.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), ((GlobalConfig) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", GlobalConfig.class), null, null)).settings("settings"), null, 4, null), (StorageDataSource) scope2.get(Reflection.getOrCreateKotlinClass(StorageDataSource.class), null, null), (MainStorage) scope2.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null), ((AppVersionDataSource) scope2.get(Reflection.getOrCreateKotlinClass(AppVersionDataSource.class), null, null)).isUpdated());
    }
}
