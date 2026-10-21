package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.biometriclogin.domain.usecase.GetIsBiometricAccessEnabledUseCase;
import com.bbva.component_devicemanager.data.datasource.ActiveServicesDataSource;
import com.bbva.component_devicemanager.data.datasource.BlackBoxDataSource;
import com.bbva.component_devicemanager.data.datasource.RegisterDeviceManagerDataSource;
import com.bbva.component_devicemanager.data.datasource.request.NetworkRequestBuilder;
import com.bbva.component_devicemanager.data.repository.DeviceManagerDataRepository;
import com.bbva.glomohybrid.login.data.LoginFailureCounterDataStore;
import com.bbva.glomohybrid.login.data.LoginFailureCounterRepository;
import com.bbva.glomohybrid.login.data.MemoryFailureCounter;
import com.bbva.glomohybrid.login.domain.formconfigurator.CountryFormLoginConfigurator;
import com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator;
import com.bbva.glomohybrid.login.domain.model.CredentialsViewState;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginAccessStateUseCase;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginFeatureFlagsModelUseCase;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerUseCase;
import com.bbva.glomohybrid.login.domain.usecase.UpdateCredentialsFormStateUseCase;
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
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getLoginModule", "()Lorg/koin/core/module/Module;", "loginModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class LoginModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33975a = ModuleDSLKt.module$default(false, a.f33976p0, 1, null);

    /* JADX INFO: compiled from: LoginModule.kt */
    @SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,58:1\n103#2,6:59\n109#2,5:86\n147#2,14:91\n161#2,2:121\n147#2,14:123\n161#2,2:153\n147#2,14:155\n161#2,2:185\n147#2,14:187\n161#2,2:217\n103#2,6:219\n109#2,5:246\n103#2,6:251\n109#2,5:278\n103#2,6:283\n109#2,5:310\n103#2,6:315\n109#2,5:342\n147#2,14:347\n161#2,2:377\n147#2,14:379\n161#2,2:409\n147#2,14:411\n161#2,2:441\n147#2,14:443\n161#2,2:473\n103#2,6:475\n109#2,5:502\n201#3,6:65\n207#3:85\n216#3:105\n217#3:120\n216#3:137\n217#3:152\n216#3:169\n217#3:184\n216#3:201\n217#3:216\n201#3,6:225\n207#3:245\n201#3,6:257\n207#3:277\n201#3,6:289\n207#3:309\n201#3,6:321\n207#3:341\n216#3:361\n217#3:376\n216#3:393\n217#3:408\n216#3:425\n217#3:440\n216#3:457\n217#3:472\n201#3,6:481\n207#3:501\n105#4,14:71\n105#4,14:106\n105#4,14:138\n105#4,14:170\n105#4,14:202\n105#4,14:231\n105#4,14:263\n105#4,14:295\n105#4,14:327\n105#4,14:362\n105#4,14:394\n105#4,14:426\n105#4,14:458\n105#4,14:487\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1\n*L\n25#1:59,6\n25#1:86,5\n31#1:91,14\n31#1:121,2\n32#1:123,14\n32#1:153,2\n33#1:155,14\n33#1:185,2\n34#1:187,14\n34#1:217,2\n35#1:219,6\n35#1:246,5\n37#1:251,6\n37#1:278,5\n38#1:283,6\n38#1:310,5\n39#1:315,6\n39#1:342,5\n40#1:347,14\n40#1:377,2\n42#1:379,14\n42#1:409,2\n51#1:411,14\n51#1:441,2\n55#1:443,14\n55#1:473,2\n56#1:475,6\n56#1:502,5\n25#1:65,6\n25#1:85\n31#1:105\n31#1:120\n32#1:137\n32#1:152\n33#1:169\n33#1:184\n34#1:201\n34#1:216\n35#1:225,6\n35#1:245\n37#1:257,6\n37#1:277\n38#1:289,6\n38#1:309\n39#1:321,6\n39#1:341\n40#1:361\n40#1:376\n42#1:393\n42#1:408\n51#1:425\n51#1:440\n55#1:457\n55#1:472\n56#1:481,6\n56#1:501\n25#1:71,14\n31#1:106,14\n32#1:138,14\n33#1:170,14\n34#1:202,14\n35#1:231,14\n37#1:263,14\n38#1:295,14\n39#1:327,14\n40#1:362,14\n42#1:394,14\n51#1:426,14\n55#1:458,14\n56#1:487,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33976p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            i4 i4Var = i4.f34077p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(CountryFormLoginConfigurator.class), null, i4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(FormLoginConfigurator.class));
            j4 j4Var = j4.f34086p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(FetchLoginFeatureFlagsModelUseCase.class), null, j4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            k4 k4Var = k4.f34095p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetIsBiometricAccessEnabledUseCase.class), null, k4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            l4 l4Var = l4.f34104p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchLoginAccessStateUseCase.class), null, l4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            m4 m4Var = m4.f34113p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UpdateCredentialsFormStateUseCase.class), null, m4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            n4 n4Var = n4.f34122p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CredentialsViewState.class), null, n4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            o4 o4Var = o4.f34130p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ActiveServicesDataSource.class), null, o4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            p4 p4Var = p4.f34138p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NetworkRequestBuilder.class), null, p4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            q4 q4Var = q4.f34146p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BlackBoxDataSource.class), null, q4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            d4 d4Var = d4.f34032p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RegisterDeviceManagerDataSource.class), null, d4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            e4 e4Var = e4.f34041p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceManagerDataRepository.class), null, e4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            f4 f4Var = f4.f34050p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetCustomerUseCase.class), null, f4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            g4 g4Var = g4.f34059p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LoginFailureCounterRepository.class), null, g4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(LoginFailureCounterDataStore.class));
            h4 h4Var = h4.f34068p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MemoryFailureCounter.class), null, h4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getLoginModule() {
        return f33975a;
    }
}
