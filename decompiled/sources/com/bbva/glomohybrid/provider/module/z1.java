package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.user.domain.usecase.StoreNeedCleanTermsUseCase;
import com.bbva.glomo.user.repository.datasource.ResetTermsDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$7\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$7\n*L\n190#1:299,5\n*E\n"})
public final class z1 extends Lambda implements Function2<Scope, ParametersHolder, StoreNeedCleanTermsUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z1 f34216p0 = new z1(2);

    @Override // kotlin.jvm.functions.Function2
    public final StoreNeedCleanTermsUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new StoreNeedCleanTermsUseCase((ResetTermsDataSource) single.get(Reflection.getOrCreateKotlinClass(ResetTermsDataSource.class), null, null));
    }
}
