package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nUserTypeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,66:1\n129#2,5:67\n*S KotlinDebug\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$4\n*L\n40#1:67,5\n*E\n"})
public final class p2 extends Lambda implements Function2<Scope, ParametersHolder, GetUserTypeUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p2 f34327p0 = new p2(2);

    @Override // kotlin.jvm.functions.Function2
    public final GetUserTypeUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GetUserTypeUseCase((UserTypeDataSource) single.get(Reflection.getOrCreateKotlinClass(UserTypeDataSource.class), null, null), null, 2, null);
    }
}
