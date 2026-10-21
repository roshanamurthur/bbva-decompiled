package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.cellsweb.presentation.view.ModalsView;
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

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nUserTypeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$11\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,66:1\n32#2,5:67\n37#2,2:88\n226#3:72\n227#3:87\n105#4,14:73\n*S KotlinDebug\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$11\n*L\n57#1:67,5\n57#1:88,2\n57#1:72\n57#1:87\n57#1:73,14\n*E\n"})
public final class l2 extends Lambda implements Function1<ScopeDSL, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l2 f34311p0 = new l2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScopeDSL scopeDSL) {
        ScopeDSL scope = scopeDSL;
        Intrinsics.checkNotNullParameter(scope, "$this$scope");
        k2 k2Var = k2.f34307p0;
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ModalsView.class), null, k2Var, Kind.Scoped, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory);
        new KoinDefinition(scope.getModule(), scopedInstanceFactory);
        return Unit.INSTANCE;
    }
}
