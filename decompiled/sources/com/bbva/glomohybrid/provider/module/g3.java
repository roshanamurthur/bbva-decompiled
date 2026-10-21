package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.inappupdate.usecase.InstallFlexibleUpdateUseCase;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InAppUpdateModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInAppUpdateModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppUpdateModule.kt\ncom/bbva/glomohybrid/provider/module/InAppUpdateModuleKt$inAppUpdateModule$1$2\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,25:1\n44#2:26\n*S KotlinDebug\n*F\n+ 1 InAppUpdateModule.kt\ncom/bbva/glomohybrid/provider/module/InAppUpdateModuleKt$inAppUpdateModule$1$2\n*L\n17#1:26\n*E\n"})
public final class g3 extends Lambda implements Function2<Scope, ParametersHolder, InstallFlexibleUpdateUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g3 f34058p0 = new g3(2);

    @Override // kotlin.jvm.functions.Function2
    public final InstallFlexibleUpdateUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new InstallFlexibleUpdateUseCase((ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)), null, 2, null);
    }
}
