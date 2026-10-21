package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.router.RouterOutdated;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$routerModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$routerModule$1$3\n*L\n232#1:299,5\n*E\n"})
public final class y0 extends Lambda implements Function2<Scope, ParametersHolder, RouterOutdated> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y0 f34207p0 = new y0(2);

    @Override // kotlin.jvm.functions.Function2
    public final RouterOutdated invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new RouterOutdated((SuspendGetRememberedUserUseCase) single.get(Reflection.getOrCreateKotlinClass(SuspendGetRememberedUserUseCase.class), null, null));
    }
}
