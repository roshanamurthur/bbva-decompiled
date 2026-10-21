package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.analytics.AnalyticsClickInterceptor;
import com.bbva.glomohybrid.base.HearingDisabilitiesComponent;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.login.data.repository.CountryFidoFeatureFlagDataSource;
import com.bbva.glomohybrid.login.domain.mapper.CountryUserCredentialsMapper;
import com.bbva.glomohybrid.login.domain.mapper.UserCredentialsMapper;
import com.bbva.glomohybrid.login.domain.model.CountryPasswordQuality;
import com.bbva.glomohybrid.login.domain.model.CountryRememberedUserBiometricsViewState;
import com.bbva.glomohybrid.login.domain.model.CountryRememberedUserViewState;
import com.bbva.glomohybrid.login.domain.model.RememberedUserBiometricsViewDataState;
import com.bbva.glomohybrid.login.domain.model.RememberedUserViewDataState;
import com.bbva.glomohybrid.login.domain.usecase.PasswordQualityConfigurator;
import com.bbva.glomohybrid.ui.modals.changeuser.ChangeUserFullScreenModalFactory;
import com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getCountryPresentationModule", "()Lorg/koin/core/module/Module;", "countryPresentationModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class CountryPresentationModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34230a = ModuleDSLKt.module$default(false, a.f34231p0, 1, null);

    /* JADX INFO: compiled from: CountryPresentationModule.kt */
    @SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt\n*L\n1#1,110:1\n147#2,14:111\n161#2,2:141\n103#2,6:143\n109#2,5:170\n151#2,10:175\n161#2,2:201\n147#2,14:203\n161#2,2:233\n147#2,14:235\n161#2,2:265\n103#2,6:267\n109#2,5:294\n147#2,14:299\n161#2,2:329\n147#2,14:331\n161#2,2:361\n103#2,6:363\n109#2,5:390\n147#2,14:395\n161#2,2:425\n151#2,10:432\n161#2,2:458\n216#3:125\n217#3:140\n201#3,6:149\n207#3:169\n216#3:185\n217#3:200\n216#3:217\n217#3:232\n216#3:249\n217#3:264\n201#3,6:273\n207#3:293\n216#3:313\n217#3:328\n216#3:345\n217#3:360\n201#3,6:369\n207#3:389\n216#3:409\n217#3:424\n216#3:442\n217#3:457\n105#4,14:126\n105#4,14:155\n105#4,14:186\n105#4,14:218\n105#4,14:250\n105#4,14:279\n105#4,14:314\n105#4,14:346\n105#4,14:375\n105#4,14:410\n105#4,14:443\n35#5,5:427\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1\n*L\n46#1:111,14\n46#1:141,2\n48#1:143,6\n48#1:170,5\n52#1:175,10\n52#1:201,2\n65#1:203,14\n65#1:233,2\n74#1:235,14\n74#1:265,2\n81#1:267,6\n81#1:294,5\n85#1:299,14\n85#1:329,2\n87#1:331,14\n87#1:361,2\n94#1:363,6\n94#1:390,5\n96#1:395,14\n96#1:425,2\n98#1:432,10\n98#1:458,2\n46#1:125\n46#1:140\n48#1:149,6\n48#1:169\n52#1:185\n52#1:200\n65#1:217\n65#1:232\n74#1:249\n74#1:264\n81#1:273,6\n81#1:293\n85#1:313\n85#1:328\n87#1:345\n87#1:360\n94#1:369,6\n94#1:389\n96#1:409\n96#1:424\n98#1:442\n98#1:457\n46#1:126,14\n48#1:155,14\n52#1:186,14\n65#1:218,14\n74#1:250,14\n81#1:279,14\n85#1:314,14\n87#1:346,14\n94#1:375,14\n96#1:410,14\n98#1:443,14\n98#1:427,5\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34231p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            v vVar = v.f34349p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(ChangeUserBehavior.class), null, vVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            w wVar = w.f34352p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(ChangeUserFullScreenModalFactory.class), null, wVar, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            StringQualifier stringQualifierNamed = QualifierKt.named(UserType.PERSONAL.getValue());
            x xVar = x.f34355p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(List.class), stringQualifierNamed, xVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            y yVar = y.f34358p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AnalyticsClickInterceptor.class), null, yVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(ClickInterceptor.class));
            z zVar = z.f34361p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HearingDisabilitiesComponent.class), null, zVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            a0 a0Var = a0.f34263p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryPasswordQuality.class), null, a0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(PasswordQualityConfigurator.class));
            b0 b0Var = b0.f34267p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryRememberedUserViewState.class), null, b0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(RememberedUserViewDataState.class));
            c0 c0Var = c0.f34271p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryRememberedUserBiometricsViewState.class), null, c0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(RememberedUserBiometricsViewDataState.class));
            d0 d0Var = d0.f34275p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryUserCredentialsMapper.class), null, d0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF3), Reflection.getOrCreateKotlinClass(UserCredentialsMapper.class));
            q qVar = q.f34328p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryFidoFeatureFlagDataSource.class), null, qVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(FidoFeatureFlagDataSource.class));
            u uVar = u.f34345p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CellsWebViewModel.class), null, uVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getCountryPresentationModule() {
        return f34230a;
    }
}
