package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nUserTypeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$10\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,66:1\n36#2:67\n37#2,2:84\n226#3:68\n227#3:83\n105#4,14:69\n*S KotlinDebug\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$10\n*L\n49#1:67\n49#1:84,2\n49#1:68\n49#1:83\n49#1:69,14\n*E\n"})
public final class j2 extends Lambda implements Function1<ScopeDSL, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j2 f34303p0 = new j2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScopeDSL scopeDSL) {
        ScopeDSL scope = scopeDSL;
        Intrinsics.checkNotNullParameter(scope, "$this$scope");
        StringQualifier stringQualifierNamed = QualifierKt.named(CellsWebActivity.USERTYPE_ID);
        i2 i2Var = i2.f34299p0;
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UserTypeActivityDelegate.class), stringQualifierNamed, i2Var, Kind.Scoped, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory);
        new KoinDefinition(scope.getModule(), scopedInstanceFactory);
        return Unit.INSTANCE;
    }
}
