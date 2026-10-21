package com.bbva.glomohybrid.provider.module;

import android.os.Build;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.component.dm.aem.AEMDataManager;
import com.bbva.component.dm.aem.model.AEMConfiguration;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.BuildConfig;
import com.bbva.glomohybrid.base.fetcher.UserAvatarFetcher;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.landing.data.MessageCardDataManagerProvider;
import com.bbva.glomohybrid.landing.data.datasource.LandingEcommerceCardsDataSource;
import com.bbva.glomohybrid.landing.data.datasource.LandingSettingsDataSource;
import com.bbva.glomohybrid.landing.data.mapper.LandingShortcutsAEMMapper;
import com.bbva.glomohybrid.landing.data.repository.DeviceInfoRepository;
import com.bbva.glomohybrid.landing.data.repository.LandingECommerceCardsRepository;
import com.bbva.glomohybrid.landing.data.repository.LandingSectionsDeletedRepository;
import com.bbva.glomohybrid.landing.domain.aem.filters.BaseLandingConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingAndroidAppUpdateAdviceFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingAndroidAppUpdateNoAdviceFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingECommerceEnabledConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingECommerceNotAvailableConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingECommerceNotEnabledConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingHasNotProductConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingHasProductConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIOSAppUpdateAdviceFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsBiometricsAccessEnrolledConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsBiometricsAccessNotAvailableConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsBiometricsAccessNotEnrolledConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsBirthdayConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsCashZoneUserFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsGoogleConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsNotBirthdayConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsNotCashZoneUserFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsNotGoogleConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxAndroidSdkConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxDateConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxIOSSdkConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxVersionConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinAndroidSdkConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinDateConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinIOSSdkConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinVersionConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingNotificationsConditionFilter;
import com.bbva.glomohybrid.landing.domain.mapper.LandingHeaderMessageMapper;
import com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker;
import com.bbva.glomohybrid.landing.domain.sections.LandingECommerceCardsPicker;
import com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher;
import com.bbva.glomohybrid.landing.domain.sections.LandingSectionsPicker;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingEcommerceSectionFeatureFlagFilter;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsFeatureFlagsFilter;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsItemsNoDeletedFilter;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsTargetProfileFilter;
import com.bbva.glomohybrid.landing.domain.shortcuts.LandingAvailableShortcutsPicker;
import com.bbva.glomohybrid.landing.domain.shortcuts.LandingShortcutsFetcher;
import com.bbva.glomohybrid.landing.domain.shortcuts.filters.LandingShortcutsFeatureFlagsFilter;
import com.bbva.glomohybrid.landing.domain.shortcuts.filters.LandingShortcutsTargetProfileFilter;
import com.bbva.glomohybrid.landing.domain.usecase.CheckIsDeviceSecureUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.CheckMobilePaymentEnabledUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingAccessStateUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingSectionsDataUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.LightAccessUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.MarkLandingSectionAsDeletedUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase;
import com.bbva.glomohybrid.landing.presentation.behaviours.LandingBackgroundBehaviour;
import com.bbva.glomohybrid.provider.modules.extensions.LandingModuleExtensionsKt;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.network.NetworkWorker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
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
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getLandingModule", "()Lorg/koin/core/module/Module;", "landingModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,214:1\n129#2,5:215\n129#2,5:220\n129#2,5:225\n129#2,5:230\n129#2,5:235\n129#2,5:240\n129#2,5:245\n129#2,5:250\n129#2,5:255\n129#2,5:260\n129#2,5:265\n129#2,5:270\n129#2,5:275\n129#2,5:280\n129#2,5:285\n154#2,5:290\n154#2,5:295\n154#2,5:300\n129#2,5:305\n129#2,5:310\n129#2,5:315\n129#2,5:320\n129#2,5:325\n129#2,5:330\n129#2,5:335\n129#2,5:340\n129#2,5:345\n129#2,5:350\n129#2,5:355\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt\n*L\n114#1:215,5\n115#1:220,5\n116#1:225,5\n117#1:230,5\n124#1:235,5\n129#1:240,5\n133#1:245,5\n135#1:250,5\n144#1:255,5\n150#1:260,5\n153#1:265,5\n162#1:270,5\n167#1:275,5\n169#1:280,5\n172#1:285,5\n182#1:290,5\n183#1:295,5\n184#1:300,5\n185#1:305,5\n186#1:310,5\n187#1:315,5\n188#1:320,5\n190#1:325,5\n191#1:330,5\n196#1:335,5\n197#1:340,5\n198#1:345,5\n199#1:350,5\n200#1:355,5\n*E\n"})
public final class LandingModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33970a = ModuleDSLKt.module$default(false, a.f33971p0, 1, null);

    /* JADX INFO: compiled from: LandingModule.kt */
    @SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,214:1\n103#2,6:215\n109#2,5:242\n103#2,6:247\n109#2,5:274\n147#2,14:279\n161#2,2:309\n147#2,14:311\n161#2,2:341\n147#2,14:343\n161#2,2:373\n147#2,14:375\n161#2,2:405\n147#2,14:407\n161#2,2:437\n147#2,14:439\n161#2,2:469\n147#2,14:471\n161#2,2:501\n147#2,14:503\n161#2,2:533\n147#2,14:535\n161#2,2:565\n147#2,14:567\n161#2,2:597\n201#3,6:221\n207#3:241\n201#3,6:253\n207#3:273\n216#3:293\n217#3:308\n216#3:325\n217#3:340\n216#3:357\n217#3:372\n216#3:389\n217#3:404\n216#3:421\n217#3:436\n216#3:453\n217#3:468\n216#3:485\n217#3:500\n216#3:517\n217#3:532\n216#3:549\n217#3:564\n216#3:581\n217#3:596\n105#4,14:227\n105#4,14:259\n105#4,14:294\n105#4,14:326\n105#4,14:358\n105#4,14:390\n105#4,14:422\n105#4,14:454\n105#4,14:486\n105#4,14:518\n105#4,14:550\n105#4,14:582\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1\n*L\n81#1:215,6\n81#1:242,5\n82#1:247,6\n82#1:274,5\n83#1:279,14\n83#1:309,2\n84#1:311,14\n84#1:341,2\n90#1:343,14\n90#1:373,2\n91#1:375,14\n91#1:405,2\n92#1:407,14\n92#1:437,2\n93#1:439,14\n93#1:469,2\n96#1:471,14\n96#1:501,2\n104#1:503,14\n104#1:533,2\n105#1:535,14\n105#1:565,2\n106#1:567,14\n106#1:597,2\n81#1:221,6\n81#1:241\n82#1:253,6\n82#1:273\n83#1:293\n83#1:308\n84#1:325\n84#1:340\n90#1:357\n90#1:372\n91#1:389\n91#1:404\n92#1:421\n92#1:436\n93#1:453\n93#1:468\n96#1:485\n96#1:500\n104#1:517\n104#1:532\n105#1:549\n105#1:564\n106#1:581\n106#1:596\n81#1:227,14\n82#1:259,14\n83#1:294,14\n84#1:326,14\n90#1:358,14\n91#1:390,14\n92#1:422,14\n93#1:454,14\n96#1:486,14\n104#1:518,14\n105#1:550,14\n106#1:582,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33971p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            r3 r3Var = r3.f34153p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, r3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            s3 s3Var = s3.f34162p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LandingSectionsDeletedRepository.class), null, s3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            t3 t3Var = t3.f34170p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(List.class), null, t3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            u3 u3Var = u3.f34178p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ConfigureWebViewProfileUseCase.class), null, u3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            v3 v3Var = v3.f34186p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RemoveUserDataUseCase.class), null, v3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            w3 w3Var = w3.f34194p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CheckIsDeviceSecureUseCase.class), null, w3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            x3 x3Var = x3.f34202p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LightAccessUseCase.class), null, x3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            y3 y3Var = y3.f34210p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CheckMobilePaymentEnabledUseCase.class), null, y3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            z3 z3Var = z3.f34218p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchLandingAccessStateUseCase.class), null, z3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            o3 o3Var = o3.f34129p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchLandingHeaderDataUseCase.class), null, o3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            p3 p3Var = p3.f34137p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchLandingSectionsDataUseCase.class), null, p3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            q3 q3Var = q3.f34145p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MarkLandingSectionAsDeletedUseCase.class), null, q3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    public static final List<LandingAEMConditionFilter> a(Scope scope) {
        int i10 = Build.VERSION.SDK_INT;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new BaseLandingConditionFilter[]{new LandingMinVersionConditionFilter(BuildConfig.VERSION_NAME), new LandingMaxVersionConditionFilter(BuildConfig.VERSION_NAME), new LandingMinDateConditionFilter(), new LandingMaxDateConditionFilter(), new LandingIsBiometricsAccessNotEnrolledConditionFilter((BiometricDatasource) scope.getOrNull(Reflection.getOrCreateKotlinClass(BiometricDatasource.class), null, null)), new LandingIsBiometricsAccessEnrolledConditionFilter((BiometricDatasource) scope.getOrNull(Reflection.getOrCreateKotlinClass(BiometricDatasource.class), null, null)), new LandingIsBiometricsAccessNotAvailableConditionFilter((BiometricDatasource) scope.getOrNull(Reflection.getOrCreateKotlinClass(BiometricDatasource.class), null, null)), new LandingIsBirthdayConditionFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingIsNotBirthdayConditionFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingHasProductConditionFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingHasNotProductConditionFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingIOSAppUpdateAdviceFilter(), new LandingAndroidAppUpdateAdviceFilter(BuildConfig.VERSION_CODE, (AppSettingsRepository) scope.get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, null)), new LandingAndroidAppUpdateNoAdviceFilter(BuildConfig.VERSION_CODE, (AppSettingsRepository) scope.get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, null)), new LandingMinAndroidSdkConditionFilter(i10), new LandingMaxAndroidSdkConditionFilter(i10), new LandingMinIOSSdkConditionFilter(), new LandingMaxIOSSdkConditionFilter(), new LandingNotificationsConditionFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingIsCashZoneUserFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingIsNotCashZoneUserFilter((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new LandingIsGoogleConditionFilter((MobileServices) scope.get(Reflection.getOrCreateKotlinClass(MobileServices.class), null, null)), new LandingIsNotGoogleConditionFilter((MobileServices) scope.get(Reflection.getOrCreateKotlinClass(MobileServices.class), null, null))});
    }

    public static final FetchLandingHeaderDataUseCase access$createFetchLandingHeaderUseCase(Scope scope, RememberedUser rememberedUser) {
        String str = (String) scope.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.HOST_AEM), null);
        LandingShortcutsAEMMapper landingShortcutsAEMMapper = new LandingShortcutsAEMMapper(str);
        LandingBackgroundBehaviour landingBackgroundBehaviour = new LandingBackgroundBehaviour(str);
        AEMDataManager aEMDataManager = new AEMDataManager((NetworkWorker) scope.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), landingShortcutsAEMMapper);
        aEMDataManager.updateModel(new AEMConfiguration(str));
        return new FetchLandingHeaderDataUseCase((LandingConfigurationFetcher) scope.get(Reflection.getOrCreateKotlinClass(LandingConfigurationFetcher.class), null, null), new LandingShortcutsFetcher(aEMDataManager, new LandingAvailableShortcutsPicker(CollectionsKt__IterablesKt.flatten(CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{a(scope), LandingModuleExtensionsKt.getCountryConditionFilters(scope, rememberedUser)})), new LandingShortcutsFeatureFlagsFilter((FeatureFlagsRepository) scope.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null)), new LandingShortcutsTargetProfileFilter())), (UserAvatarFetcher) scope.get(Reflection.getOrCreateKotlinClass(UserAvatarFetcher.class), null, null), landingBackgroundBehaviour, new LandingHeaderMessageMapper(str), (FeatureFlagManager) scope.get(Reflection.getOrCreateKotlinClass(FeatureFlagManager.class), null, null), null, 64, null);
    }

    public static final FetchLandingSectionsDataUseCase access$createFetchLandingSectionsUseCase(Scope scope, RememberedUser rememberedUser) {
        MessageCardDataManagerProvider messageCardDataManagerProvider = new MessageCardDataManagerProvider((NetworkWorker) scope.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), (String) scope.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.HOST_AEM), null));
        LandingSectionsDeletedRepository landingSectionsDeletedRepository = (LandingSectionsDeletedRepository) scope.get(Reflection.getOrCreateKotlinClass(LandingSectionsDeletedRepository.class), null, null);
        LandingEcommerceCardsDataSource landingEcommerceCardsDataSource = new LandingEcommerceCardsDataSource((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
        LandingSettingsDataSource landingSettingsDataSource = new LandingSettingsDataSource((MainStorage) scope.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
        return new FetchLandingSectionsDataUseCase(landingSectionsDeletedRepository, (LandingConfigurationFetcher) scope.get(Reflection.getOrCreateKotlinClass(LandingConfigurationFetcher.class), null, null), new LandingSectionsFetcher(new LandingECommerceCardsRepository(landingEcommerceCardsDataSource, landingSettingsDataSource), messageCardDataManagerProvider, new LandingSectionsPicker(new LandingECommerceCardsPicker((DeviceInfoRepository) scope.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null), landingSettingsDataSource, new LandingEcommerceSectionFeatureFlagFilter((FeatureFlagManager) scope.get(Reflection.getOrCreateKotlinClass(FeatureFlagManager.class), null, null))), new LandingAvailableMessagesPicker(CollectionsKt__IterablesKt.flatten(CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{a(scope), CollectionsKt__CollectionsKt.listOf((Object[]) new BaseLandingConditionFilter[]{new LandingECommerceEnabledConditionFilter(landingSettingsDataSource), new LandingECommerceNotEnabledConditionFilter(landingSettingsDataSource), new LandingECommerceNotAvailableConditionFilter((DeviceInfoRepository) scope.get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), null, null))}), LandingModuleExtensionsKt.getCountryConditionFilters(scope, rememberedUser)})), new LandingSectionsFeatureFlagsFilter((FeatureFlagsRepository) scope.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null)), new LandingSectionsTargetProfileFilter(), new LandingSectionsItemsNoDeletedFilter(landingSectionsDeletedRepository)))), null, 8, null);
    }

    @NotNull
    public static final Module getLandingModule() {
        return f33970a;
    }
}
