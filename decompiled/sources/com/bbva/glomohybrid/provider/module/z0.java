package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.user.domain.usecase.DeleteUserDataUseCase;
import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.glomo.user.repository.datasource.UserSharedPrefDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$10\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n44#2:299\n129#3,5:300\n352#3:305\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$10\n*L\n200#1:299\n202#1:300,5\n203#1:305\n*E\n"})
public final class z0 extends Lambda implements Function2<Scope, ParametersHolder, DeleteUserDataUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z0 f34215p0 = new z0(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeleteUserDataUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new DeleteUserDataUseCase(((Boolean) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", Boolean.class))).booleanValue() ? bk.d.listOf(scope2.get(Reflection.getOrCreateKotlinClass(UserSharedPrefDataSource.class), null, null)) : scope2.getAll(Reflection.getOrCreateKotlinClass(UserDataStore.class)), null, 2, null);
    }
}
