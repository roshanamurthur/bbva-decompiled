package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.featureflags.repository.datasource.LocalDataSource;
import com.bbva.glomohybrid.featureflags.repository.datasource.MemoryDatasource;
import com.bbva.glomohybrid.featureflags.repository.datasource.NetworkDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nFeatureFlagsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n129#2,5:49\n129#2,5:54\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$4\n*L\n26#1:49,5\n27#1:54,5\n*E\n"})
public final class z2 extends Lambda implements Function2<Scope, ParametersHolder, FeatureFlagsRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z2 f34217p0 = new z2(2);

    @Override // kotlin.jvm.functions.Function2
    public final FeatureFlagsRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        return new FeatureFlagsRepository((MemoryDatasource) scope2.get(Reflection.getOrCreateKotlinClass(MemoryDatasource.class), null, null), (LocalDataSource) scope2.get(Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, null), (NetworkDataSource) scope2.get(Reflection.getOrCreateKotlinClass(NetworkDataSource.class), null, null), (MainStorage) scope2.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null), ((AppVersionDataSource) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", AppVersionDataSource.class), null, null)).isUpdated());
    }
}
