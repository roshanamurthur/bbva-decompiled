package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate;
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
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nMobileServicesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$6\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,33:1\n32#2,5:34\n37#2,2:55\n226#3:39\n227#3:54\n105#4,14:40\n*S KotlinDebug\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$6\n*L\n28#1:34,5\n28#1:55,2\n28#1:39\n28#1:54\n28#1:40,14\n*E\n"})
public final class x4 extends Lambda implements Function1<ScopeDSL, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x4 f34203p0 = new x4(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScopeDSL scopeDSL) {
        ScopeDSL scope = scopeDSL;
        Intrinsics.checkNotNullParameter(scope, "$this$scope");
        w4 w4Var = w4.f34195p0;
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(DynamicModulesDelegate.class), null, w4Var, Kind.Scoped, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory);
        DefinitionBindingKt.bind(new KoinDefinition(scope.getModule(), scopedInstanceFactory), Reflection.getOrCreateKotlinClass(DynamicModulesDelegate.class));
        return Unit.INSTANCE;
    }
}
