package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.domain.model.UserTypeKt;
import com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.StoreUserTypeUseCase;
import com.bbva.glomo.user.repository.datasource.PnnUserDataSource;
import com.bbva.glomo.user.repository.datasource.SingleAppFlagDataSource;
import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.ui.options.ListOptionFactory;
import com.bbva.glomohybrid.ui.options.profileselector.helper.ProfileSelectorHelper;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getUserTypeModule", "()Lorg/koin/core/module/Module;", "userTypeModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class UserTypeModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34260a = ModuleDSLKt.module$default(false, a.f34261p0, 1, null);

    /* JADX INFO: compiled from: UserTypeModule.kt */
    @SourceDebugExtension({"SMAP\nUserTypeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Qualifier.kt\norg/koin/core/qualifier/QualifierKt\n*L\n1#1,66:1\n103#2,6:67\n109#2,5:94\n103#2,6:99\n109#2,5:126\n103#2,6:131\n109#2,5:158\n103#2,6:163\n109#2,5:190\n103#2,6:195\n109#2,5:222\n103#2,6:227\n109#2,5:254\n103#2,6:259\n109#2,5:286\n103#2,6:291\n109#2,5:318\n103#2,6:323\n109#2,5:350\n201#3,6:73\n207#3:93\n201#3,6:105\n207#3:125\n201#3,6:137\n207#3:157\n201#3,6:169\n207#3:189\n201#3,6:201\n207#3:221\n201#3,6:233\n207#3:253\n201#3,6:265\n207#3:285\n201#3,6:297\n207#3:317\n201#3,6:329\n207#3:349\n105#4,14:79\n105#4,14:111\n105#4,14:143\n105#4,14:175\n105#4,14:207\n105#4,14:239\n105#4,14:271\n105#4,14:303\n105#4,14:335\n43#5:355\n43#5:356\n*S KotlinDebug\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1\n*L\n31#1:67,6\n31#1:94,5\n34#1:99,6\n34#1:126,5\n37#1:131,6\n37#1:158,5\n40#1:163,6\n40#1:190,5\n41#1:195,6\n41#1:222,5\n42#1:227,6\n42#1:254,5\n43#1:259,6\n43#1:286,5\n44#1:291,6\n44#1:318,5\n47#1:323,6\n47#1:350,5\n31#1:73,6\n31#1:93\n34#1:105,6\n34#1:125\n37#1:137,6\n37#1:157\n40#1:169,6\n40#1:189\n41#1:201,6\n41#1:221\n42#1:233,6\n42#1:253\n43#1:265,6\n43#1:285\n44#1:297,6\n44#1:317\n47#1:329,6\n47#1:349\n31#1:79,14\n34#1:111,14\n37#1:143,14\n40#1:175,14\n41#1:207,14\n42#1:239,14\n43#1:271,14\n44#1:303,14\n47#1:335,14\n48#1:355\n56#1:356\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34261p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            m2 m2Var = m2.f34315p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(UserTypeDataSource.class), null, m2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF), new KClass[]{Reflection.getOrCreateKotlinClass(UserTypeDataSource.class), Reflection.getOrCreateKotlinClass(UserDataStore.class)});
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PnnUserDataSource.class), null, n2.f34319p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SingleAppFlagDataSource.class), null, o2.f34323p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetUserTypeUseCase.class), null, p2.f34327p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreUserTypeUseCase.class), null, q2.f34331p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ProfileSelectorHelper.class), null, r2.f34336p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ListOptionFactory.class), com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF6, ListOptionFactory.ID), s2.f34340p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SuspendUseCase.class), com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF7, UserTypeKt.SHOW_USERTYPE_SELECTOR_USECASE_NAME), t2.f34344p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            new KoinDefinition(module2, singleInstanceFactoryF8);
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UseCaseWithParams.class), null, u2.f34348p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            new KoinDefinition(module2, singleInstanceFactoryF9);
            module2.scope(new TypeQualifier(Reflection.getOrCreateKotlinClass(CellsWebActivity.class)), j2.f34303p0);
            module2.scope(new TypeQualifier(Reflection.getOrCreateKotlinClass(CellsWebActivity.class)), l2.f34311p0);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getUserTypeModule() {
        return f34260a;
    }
}
