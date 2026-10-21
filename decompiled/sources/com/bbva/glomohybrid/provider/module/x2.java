package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.featureflags.repository.datasource.LocalDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nFeatureFlagsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n129#2,5:49\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$2\n*L\n23#1:49,5\n*E\n"})
public final class x2 extends Lambda implements Function2<Scope, ParametersHolder, LocalDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x2 f34201p0 = new x2(2);

    @Override // kotlin.jvm.functions.Function2
    public final LocalDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new LocalDataSource((MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
    }
}
