package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$4\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,85:1\n32#2,5:86\n37#2,2:107\n226#3:91\n227#3:106\n105#4,14:92\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$4\n*L\n51#1:86,5\n51#1:107,2\n51#1:91\n51#1:106\n51#1:92,14\n*E\n"})
public final class i extends Lambda implements Function1<ScopeDSL, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i f34296p0 = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScopeDSL scopeDSL) {
        ScopeDSL scope = scopeDSL;
        Intrinsics.checkNotNullParameter(scope, "$this$scope");
        h hVar = h.f34292p0;
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ConfigureWebPrivateProfileUseCase.class), null, hVar, Kind.Scoped, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory);
        new KoinDefinition(scope.getModule(), scopedInstanceFactory);
        return Unit.INSTANCE;
    }
}
