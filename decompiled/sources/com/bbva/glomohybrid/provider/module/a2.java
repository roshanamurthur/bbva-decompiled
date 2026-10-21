package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.user.domain.usecase.RemoveRememberedUserUseCase;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$8\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$8\n*L\n191#1:299,5\n*E\n"})
public final class a2 extends Lambda implements Function2<Scope, ParametersHolder, RemoveRememberedUserUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a2 f34003p0 = new a2(2);

    @Override // kotlin.jvm.functions.Function2
    public final RemoveRememberedUserUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new RemoveRememberedUserUseCase((RememberedUserDataSource) single.get(Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, null));
    }
}
