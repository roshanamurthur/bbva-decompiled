package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.cells.constants.KeyConstants;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.slidemenuview.presentation.MenuDelegate;
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
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$8\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,251:1\n36#2:252\n37#2,2:269\n36#2:271\n37#2,2:288\n226#3:253\n227#3:268\n226#3:272\n227#3:287\n105#4,14:254\n105#4,14:273\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$8\n*L\n203#1:252\n203#1:269,2\n211#1:271\n211#1:288,2\n203#1:253\n203#1:268\n211#1:272\n211#1:287\n203#1:254,14\n211#1:273,14\n*E\n"})
public final class t5 extends Lambda implements Function1<ScopeDSL, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t5 f34172p0 = new t5(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScopeDSL scopeDSL) {
        ScopeDSL scope = scopeDSL;
        Intrinsics.checkNotNullParameter(scope, "$this$scope");
        KeyConstants keyConstants = KeyConstants.INSTANCE;
        StringQualifier stringQualifierNamed = QualifierKt.named(keyConstants.getCELLS_ROUTER_KEY());
        q5 q5Var = q5.f34147p0;
        Qualifier scopeQualifier = scope.getScopeQualifier();
        Kind kind = Kind.Scoped;
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(ActivityRouter.class), stringQualifierNamed, q5Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory);
        new KoinDefinition(scope.getModule(), scopedInstanceFactory);
        StringQualifier stringQualifierNamed2 = QualifierKt.named(keyConstants.getCELLS_MENU_DELEGATE_KEY());
        s5 s5Var = s5.f34164p0;
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(MenuDelegate.class), stringQualifierNamed2, s5Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory2);
        new KoinDefinition(scope.getModule(), scopedInstanceFactory2);
        return Unit.INSTANCE;
    }
}
