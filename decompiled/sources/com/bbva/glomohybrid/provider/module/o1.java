package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher;
import com.bbva.glomohybrid.base.fetcher.UserAvatarFetcher;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginHeaderUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$24\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$24\n*L\n221#1:299,5\n*E\n"})
public final class o1 extends Lambda implements Function2<Scope, ParametersHolder, FetchLoginHeaderUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o1 f34127p0 = new o1(2);

    @Override // kotlin.jvm.functions.Function2
    public final FetchLoginHeaderUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FetchLoginHeaderUseCase((String) factory.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.HOST_AEM), null), (LandingConfigurationFetcher) factory.get(Reflection.getOrCreateKotlinClass(LandingConfigurationFetcher.class), null, null), (UserAvatarFetcher) factory.get(Reflection.getOrCreateKotlinClass(UserAvatarFetcher.class), null, null));
    }
}
