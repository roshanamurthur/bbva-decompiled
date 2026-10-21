package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$22\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n154#2,5:304\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$22\n*L\n219#1:299,5\n219#1:304,5\n*E\n"})
public final class m1 extends Lambda implements Function2<Scope, ParametersHolder, GetUserConfigurationUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m1 f34110p0 = new m1(2);

    @Override // kotlin.jvm.functions.Function2
    public final GetUserConfigurationUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GetUserConfigurationUseCase((RememberedUserDataSource) factory.get(Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, null), (UserTypeDataSource) factory.getOrNull(Reflection.getOrCreateKotlinClass(UserTypeDataSource.class), null, null), null, 4, null);
    }
}
