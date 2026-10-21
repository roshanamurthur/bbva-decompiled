package com.bbva.glomohybrid.provider.module;

import android.content.SharedPreferences;
import com.bbva.bridge.core.WebProfileLoader;
import com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher;
import com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.datasource.StorageDataSource;
import com.bbva.ethermobilesdk.passchecker.PassChecker;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomo.localstorage.LocalDeviceIdDataSource;
import com.bbva.glomo.router.RouterOutdated;
import com.bbva.glomo.router.RouterSplash;
import com.bbva.glomo.router.RouterWelcome;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.usecase.DeleteUserDataUseCase;
import com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase;
import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomo.user.domain.usecase.MigrateRememberedUserUseCase;
import com.bbva.glomo.user.domain.usecase.PersistMobileServicesUseCase;
import com.bbva.glomo.user.domain.usecase.RemoveRememberedUserUseCase;
import com.bbva.glomo.user.domain.usecase.StoreLoginDataUseCase;
import com.bbva.glomo.user.domain.usecase.StoreNeedCleanTermsUseCase;
import com.bbva.glomo.user.domain.usecase.StoreRememberedDataFromCustomerUseCase;
import com.bbva.glomo.user.domain.usecase.StoreRememberedUserDocumentUseCase;
import com.bbva.glomo.user.domain.usecase.StoreRememberedUserUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendStoreRememberedUserUseCase;
import com.bbva.glomo.user.repository.datasource.FlowmeterDataSource;
import com.bbva.glomo.user.repository.datasource.LocalFlowmeterDataSource;
import com.bbva.glomo.user.repository.datasource.LocalResetTermsDataSource;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomo.user.repository.datasource.ResetTermsDataSource;
import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.glomo.user.repository.datasource.UserLoginDataSource;
import com.bbva.glomo.user.repository.datasource.UserSharedPrefDataSource;
import com.bbva.glomo.user.repository.datasource.UserVolatileDataSource;
import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.glomohybrid.base.datasource.InAppUpdatesScheduleDataSource;
import com.bbva.glomohybrid.base.fetcher.UserAvatarFetcher;
import com.bbva.glomohybrid.base.usecase.user.MigrateWebPreferencesToLocalStorageUseCase;
import com.bbva.glomohybrid.base.usecase.version.GetAppVersionCodeUseCase;
import com.bbva.glomohybrid.base.usecase.version.GetAppVersionNameUseCase;
import com.bbva.glomohybrid.base.usecase.version.GetRememberedVersionCodeUseCase;
import com.bbva.glomohybrid.base.usecase.version.GetRememberedVersionNameUseCase;
import com.bbva.glomohybrid.base.usecase.version.IsWebViewVersionValidUseCase;
import com.bbva.glomohybrid.base.usecase.version.LastVersionCheckerUseCase;
import com.bbva.glomohybrid.base.usecase.version.SetRememberedVersionCodeUseCase;
import com.bbva.glomohybrid.documents.common.FetchDocumentUseCase;
import com.bbva.glomohybrid.documents.common.FetchFileUseCase;
import com.bbva.glomohybrid.documents.common.FetchTermsByNameUseCase;
import com.bbva.glomohybrid.documents.common.FileUseCaseFactory;
import com.bbva.glomohybrid.documents.common.OpenFileUseCase;
import com.bbva.glomohybrid.documents.common.repository.DocumentsRepository;
import com.bbva.glomohybrid.documents.common.repository.TermsRepository;
import com.bbva.glomohybrid.documents.common.repository.dataSource.DiskFileDataSource;
import com.bbva.glomohybrid.documents.common.repository.dataSource.RemoteFileDataSource;
import com.bbva.glomohybrid.documents.common.repository.dataSource.TermsDataSource;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import com.bbva.glomohybrid.infoscreen.webView.force.domain.usecase.GetWebViewStoreUrlUseCase;
import com.bbva.glomohybrid.login.data.repository.CountrySecSdkDataSource;
import com.bbva.glomohybrid.login.domain.usecase.CheckConnectionUseCase;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginHeaderUseCase;
import com.bbva.localstorage.storage.Storage;
import com.bbva.notifications.domain.GetNotificationDetailUseCase;
import com.bbva.notifications.domain.NotificationsDataSource;
import com.bbva.notifications.usecase.CreateNotificationNonCommercialUseCase;
import com.bbva.notifications.usecase.GetNotificationOperativesNonCommercialUseCase;
import com.bbva.softtokenbase.usecase.IsSoftTokenBiometricActiveUseCase;
import java.io.File;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\"\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007\"\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007\"\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001b"}, d2 = {"", "FILES_PATH", "Ljava/lang/String;", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getDataSource", "()Lorg/koin/core/module/Module;", "dataSource", "b", "getRepository", "repository", "c", "getUseCase", "useCase", "d", "getRouterModule", "routerModule", "e", "getFilesModule", "filesModule", "f", "getFetchersModule", "fetchersModule", "g", "getWebHelperModule", "webHelperModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class ArchitectureModuleKt {

    @NotNull
    public static final String FILES_PATH = "files_path";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33941a = ModuleDSLKt.module$default(false, a.f33948p0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Module f33942b = ModuleDSLKt.module$default(false, d.f33951p0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Module f33943c = ModuleDSLKt.module$default(false, f.f33953p0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Module f33944d = ModuleDSLKt.module$default(false, e.f33952p0, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Module f33945e = ModuleDSLKt.module$default(false, c.f33950p0, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Module f33946f = ModuleDSLKt.module$default(false, b.f33949p0, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Module f33947g = ModuleDSLKt.module$default(false, g.f33954p0, 1, null);

    /* JADX INFO: compiled from: ArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$dataSource$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,298:1\n103#2,6:299\n109#2,5:326\n103#2,6:331\n109#2,5:358\n103#2,6:363\n109#2,5:390\n103#2,6:395\n109#2,5:422\n147#2,14:427\n161#2,2:457\n103#2,6:459\n109#2,5:486\n103#2,6:491\n109#2,5:518\n103#2,6:523\n109#2,5:550\n103#2,6:555\n109#2,5:582\n103#2,6:587\n109#2,5:614\n103#2,6:619\n109#2,5:646\n103#2,6:651\n109#2,5:678\n103#2,6:683\n109#2,5:710\n103#2,6:715\n109#2,5:742\n103#2,6:747\n109#2,5:774\n201#3,6:305\n207#3:325\n201#3,6:337\n207#3:357\n201#3,6:369\n207#3:389\n201#3,6:401\n207#3:421\n216#3:441\n217#3:456\n201#3,6:465\n207#3:485\n201#3,6:497\n207#3:517\n201#3,6:529\n207#3:549\n201#3,6:561\n207#3:581\n201#3,6:593\n207#3:613\n201#3,6:625\n207#3:645\n201#3,6:657\n207#3:677\n201#3,6:689\n207#3:709\n201#3,6:721\n207#3:741\n201#3,6:753\n207#3:773\n105#4,14:311\n105#4,14:343\n105#4,14:375\n105#4,14:407\n105#4,14:442\n105#4,14:471\n105#4,14:503\n105#4,14:535\n105#4,14:567\n105#4,14:599\n105#4,14:631\n105#4,14:663\n105#4,14:695\n105#4,14:727\n105#4,14:759\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$dataSource$1\n*L\n102#1:299,6\n102#1:326,5\n103#1:331,6\n103#1:358,5\n104#1:363,6\n104#1:390,5\n107#1:395,6\n107#1:422,5\n110#1:427,14\n110#1:457,2\n114#1:459,6\n114#1:486,5\n118#1:491,6\n118#1:518,5\n122#1:523,6\n122#1:550,5\n135#1:555,6\n135#1:582,5\n136#1:587,6\n136#1:614,5\n142#1:619,6\n142#1:646,5\n143#1:651,6\n143#1:678,5\n144#1:683,6\n144#1:710,5\n145#1:715,6\n145#1:742,5\n146#1:747,6\n146#1:774,5\n102#1:305,6\n102#1:325\n103#1:337,6\n103#1:357\n104#1:369,6\n104#1:389\n107#1:401,6\n107#1:421\n110#1:441\n110#1:456\n114#1:465,6\n114#1:485\n118#1:497,6\n118#1:517\n122#1:529,6\n122#1:549\n135#1:561,6\n135#1:581\n136#1:593,6\n136#1:613\n142#1:625,6\n142#1:645\n143#1:657,6\n143#1:677\n144#1:689,6\n144#1:709\n145#1:721,6\n145#1:741\n146#1:753,6\n146#1:773\n102#1:311,14\n103#1:343,14\n104#1:375,14\n107#1:407,14\n110#1:442,14\n114#1:471,14\n118#1:503,14\n122#1:535,14\n135#1:567,14\n136#1:599,14\n142#1:631,14\n143#1:663,14\n144#1:695,14\n145#1:727,14\n146#1:759,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33948p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            s sVar = s.f34158p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(AppVersionDataSource.class), null, sVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StorageDataSource.class), null, t.f34166p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, u.f34174p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF3), new KClass[]{Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), Reflection.getOrCreateKotlinClass(UserDataStore.class)});
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserSharedPrefDataSource.class), null, v.f34182p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF4), new KClass[]{Reflection.getOrCreateKotlinClass(UserSharedPrefDataSource.class), Reflection.getOrCreateKotlinClass(UserDataStore.class)});
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountrySecSdkDataSource.class), null, w.f34190p0, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(UserDataStore.class));
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserVolatileDataSource.class), null, x.f34198p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF5), new KClass[]{Reflection.getOrCreateKotlinClass(UserVolatileDataSource.class), Reflection.getOrCreateKotlinClass(UserDataStore.class)});
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SharedPreferences.class), null, y.f34206p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SecureSharing.class), null, z.f34214p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            new KoinDefinition(module2, singleInstanceFactoryF7);
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserLoginDataSource.class), null, a0.f34001p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            new KoinDefinition(module2, singleInstanceFactoryF8);
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NotificationsDataSource.class), null, m.f34108p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            new KoinDefinition(module2, singleInstanceFactoryF9);
            SingleInstanceFactory<?> singleInstanceFactoryF10 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalDeviceIdDataSource.class), null, n.f34117p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF10);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF10), Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactoryF11 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalFlowmeterDataSource.class), null, o.f34125p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF11);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF11), Reflection.getOrCreateKotlinClass(FlowmeterDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactoryF12 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalResetTermsDataSource.class), null, p.f34133p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF12);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF12), Reflection.getOrCreateKotlinClass(ResetTermsDataSource.class));
            SingleInstanceFactory<?> singleInstanceFactoryF13 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InAppUpdatesScheduleDataSource.class), null, q.f34141p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF13);
            }
            new KoinDefinition(module2, singleInstanceFactoryF13);
            SingleInstanceFactory<?> singleInstanceFactoryF14 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PassChecker.class), null, r.f34149p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF14);
            }
            new KoinDefinition(module2, singleInstanceFactoryF14);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$fetchersModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,298:1\n103#2,6:299\n109#2,5:326\n103#2,6:331\n109#2,5:358\n201#3,6:305\n207#3:325\n201#3,6:337\n207#3:357\n105#4,14:311\n105#4,14:343\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$fetchersModule$1\n*L\n288#1:299,6\n288#1:326,5\n289#1:331,6\n289#1:358,5\n288#1:305,6\n288#1:325\n289#1:337,6\n289#1:357\n288#1:311,14\n289#1:343,14\n*E\n"})
    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f33949p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            b0 b0Var = b0.f34010p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(LandingConfigurationFetcher.class), null, b0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            c0 c0Var = c0.f34019p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserAvatarFetcher.class), null, c0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,298:1\n103#2,6:299\n109#2,5:326\n103#2,6:331\n109#2,5:358\n103#2,6:363\n109#2,5:390\n103#2,6:395\n109#2,5:422\n103#2,6:427\n109#2,5:454\n103#2,6:459\n109#2,5:486\n103#2,6:491\n109#2,5:518\n103#2,6:523\n109#2,5:550\n103#2,6:555\n109#2,5:582\n103#2,6:587\n109#2,5:614\n147#2,14:619\n161#2,2:649\n147#2,14:651\n161#2,2:681\n201#3,6:305\n207#3:325\n201#3,6:337\n207#3:357\n201#3,6:369\n207#3:389\n201#3,6:401\n207#3:421\n201#3,6:433\n207#3:453\n201#3,6:465\n207#3:485\n201#3,6:497\n207#3:517\n201#3,6:529\n207#3:549\n201#3,6:561\n207#3:581\n201#3,6:593\n207#3:613\n216#3:633\n217#3:648\n216#3:665\n217#3:680\n105#4,14:311\n105#4,14:343\n105#4,14:375\n105#4,14:407\n105#4,14:439\n105#4,14:471\n105#4,14:503\n105#4,14:535\n105#4,14:567\n105#4,14:599\n105#4,14:634\n105#4,14:666\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1\n*L\n237#1:299,6\n237#1:326,5\n241#1:331,6\n241#1:358,5\n242#1:363,6\n242#1:390,5\n244#1:395,6\n244#1:422,5\n247#1:427,6\n247#1:454,5\n248#1:459,6\n248#1:486,5\n258#1:491,6\n258#1:518,5\n262#1:523,6\n262#1:550,5\n266#1:555,6\n266#1:582,5\n272#1:587,6\n272#1:614,5\n274#1:619,14\n274#1:649,2\n284#1:651,14\n284#1:681,2\n237#1:305,6\n237#1:325\n241#1:337,6\n241#1:357\n242#1:369,6\n242#1:389\n244#1:401,6\n244#1:421\n247#1:433,6\n247#1:453\n248#1:465,6\n248#1:485\n258#1:497,6\n258#1:517\n262#1:529,6\n262#1:549\n266#1:561,6\n266#1:581\n272#1:593,6\n272#1:613\n274#1:633\n274#1:648\n284#1:665\n284#1:680\n237#1:311,14\n241#1:343,14\n242#1:375,14\n244#1:407,14\n247#1:439,14\n248#1:471,14\n258#1:503,14\n262#1:535,14\n266#1:567,14\n272#1:599,14\n274#1:634,14\n284#1:666,14\n*E\n"})
    public static final class c extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f33950p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            StringQualifier stringQualifierNamed = QualifierKt.named(ArchitectureModuleKt.FILES_PATH);
            g0 g0Var = g0.f34055p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(File.class), stringQualifierNamed, g0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            h0 h0Var = h0.f34064p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TermsDataSource.class), null, h0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            i0 i0Var = i0.f34073p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TermsRepository.class), null, i0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            j0 j0Var = j0.f34082p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RemoteFileDataSource.class), null, j0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            k0 k0Var = k0.f34091p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DiskFileDataSource.class), null, k0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            m0 m0Var = m0.f34109p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DocumentsRepository.class), null, m0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            o0 o0Var = o0.f34126p0;
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchFileUseCase.class), null, o0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            new KoinDefinition(module2, singleInstanceFactoryF7);
            q0 q0Var = q0.f34142p0;
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchTermsByNameUseCase.class), null, q0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            new KoinDefinition(module2, singleInstanceFactoryF8);
            s0 s0Var = s0.f34159p0;
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchDocumentUseCase.class), null, s0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            new KoinDefinition(module2, singleInstanceFactoryF9);
            d0 d0Var = d0.f34028p0;
            SingleInstanceFactory<?> singleInstanceFactoryF10 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(OpenFileUseCase.class), null, d0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF10);
            }
            new KoinDefinition(module2, singleInstanceFactoryF10);
            e0 e0Var = e0.f34037p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(TermsDataManager.class), null, e0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            f0 f0Var = f0.f34046p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FileUseCaseFactory.class), null, f0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$repository$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,298:1\n103#2,6:299\n109#2,5:326\n103#2,6:331\n109#2,5:358\n103#2,6:363\n109#2,5:390\n201#3,6:305\n207#3:325\n201#3,6:337\n207#3:357\n201#3,6:369\n207#3:389\n105#4,14:311\n105#4,14:343\n105#4,14:375\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$repository$1\n*L\n151#1:299,6\n151#1:326,5\n162#1:331,6\n162#1:358,5\n180#1:363,6\n180#1:390,5\n151#1:305,6\n151#1:325\n162#1:337,6\n162#1:357\n180#1:369,6\n180#1:389\n151#1:311,14\n162#1:343,14\n180#1:375,14\n*E\n"})
    public static final class d extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f33951p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            t0 t0Var = t0.f34167p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, t0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            u0 u0Var = u0.f34175p0;
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Storage.class), null, u0Var, kind, CollectionsKt__CollectionsKt.emptyList()));
            module2.indexPrimaryType(singleInstanceFactory);
            module2.prepareForCreationAtStart(singleInstanceFactory);
            new KoinDefinition(module2, singleInstanceFactory);
            v0 v0Var = v0.f34183p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MainStorage.class), null, v0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$routerModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,298:1\n103#2,6:299\n109#2,5:326\n103#2,6:331\n109#2,5:358\n103#2,6:363\n109#2,5:390\n201#3,6:305\n207#3:325\n201#3,6:337\n207#3:357\n201#3,6:369\n207#3:389\n105#4,14:311\n105#4,14:343\n105#4,14:375\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$routerModule$1\n*L\n230#1:299,6\n230#1:326,5\n231#1:331,6\n231#1:358,5\n232#1:363,6\n232#1:390,5\n230#1:305,6\n230#1:325\n231#1:337,6\n231#1:357\n232#1:369,6\n232#1:389\n230#1:311,14\n231#1:343,14\n232#1:375,14\n*E\n"})
    public static final class e extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f33952p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            w0 w0Var = w0.f34191p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(RouterSplash.class), null, w0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            x0 x0Var = x0.f34199p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RouterWelcome.class), null, x0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            y0 y0Var = y0.f34207p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RouterOutdated.class), null, y0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,298:1\n147#2,14:299\n161#2,2:329\n147#2,14:331\n161#2,2:361\n103#2,6:363\n109#2,5:390\n103#2,6:395\n109#2,5:422\n103#2,6:427\n109#2,5:454\n103#2,6:459\n109#2,5:486\n103#2,6:491\n109#2,5:518\n103#2,6:523\n109#2,5:550\n103#2,6:555\n109#2,5:582\n147#2,14:587\n161#2,2:617\n103#2,6:619\n109#2,5:646\n103#2,6:651\n109#2,5:678\n103#2,6:683\n109#2,5:710\n103#2,6:715\n109#2,5:742\n103#2,6:747\n109#2,5:774\n103#2,6:779\n109#2,5:806\n103#2,6:811\n109#2,5:838\n103#2,6:843\n109#2,5:870\n103#2,6:875\n109#2,5:902\n103#2,6:907\n109#2,5:934\n103#2,6:939\n109#2,5:966\n147#2,14:971\n161#2,2:1001\n147#2,14:1003\n161#2,2:1033\n147#2,14:1035\n161#2,2:1065\n103#2,6:1067\n109#2,5:1094\n103#2,6:1099\n109#2,5:1126\n103#2,6:1131\n109#2,5:1158\n103#2,6:1163\n109#2,5:1190\n103#2,6:1195\n109#2,5:1222\n216#3:313\n217#3:328\n216#3:345\n217#3:360\n201#3,6:369\n207#3:389\n201#3,6:401\n207#3:421\n201#3,6:433\n207#3:453\n201#3,6:465\n207#3:485\n201#3,6:497\n207#3:517\n201#3,6:529\n207#3:549\n201#3,6:561\n207#3:581\n216#3:601\n217#3:616\n201#3,6:625\n207#3:645\n201#3,6:657\n207#3:677\n201#3,6:689\n207#3:709\n201#3,6:721\n207#3:741\n201#3,6:753\n207#3:773\n201#3,6:785\n207#3:805\n201#3,6:817\n207#3:837\n201#3,6:849\n207#3:869\n201#3,6:881\n207#3:901\n201#3,6:913\n207#3:933\n201#3,6:945\n207#3:965\n216#3:985\n217#3:1000\n216#3:1017\n217#3:1032\n216#3:1049\n217#3:1064\n201#3,6:1073\n207#3:1093\n201#3,6:1105\n207#3:1125\n201#3,6:1137\n207#3:1157\n201#3,6:1169\n207#3:1189\n201#3,6:1201\n207#3:1221\n105#4,14:314\n105#4,14:346\n105#4,14:375\n105#4,14:407\n105#4,14:439\n105#4,14:471\n105#4,14:503\n105#4,14:535\n105#4,14:567\n105#4,14:602\n105#4,14:631\n105#4,14:663\n105#4,14:695\n105#4,14:727\n105#4,14:759\n105#4,14:791\n105#4,14:823\n105#4,14:855\n105#4,14:887\n105#4,14:919\n105#4,14:951\n105#4,14:986\n105#4,14:1018\n105#4,14:1050\n105#4,14:1079\n105#4,14:1111\n105#4,14:1143\n105#4,14:1175\n105#4,14:1207\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1\n*L\n184#1:299,14\n184#1:329,2\n185#1:331,14\n185#1:361,2\n186#1:363,6\n186#1:390,5\n187#1:395,6\n187#1:422,5\n188#1:427,6\n188#1:454,5\n189#1:459,6\n189#1:486,5\n190#1:491,6\n190#1:518,5\n191#1:523,6\n191#1:550,5\n192#1:555,6\n192#1:582,5\n200#1:587,14\n200#1:617,2\n208#1:619,6\n208#1:646,5\n209#1:651,6\n209#1:678,5\n210#1:683,6\n210#1:710,5\n211#1:715,6\n211#1:742,5\n212#1:747,6\n212#1:774,5\n213#1:779,6\n213#1:806,5\n214#1:811,6\n214#1:838,5\n215#1:843,6\n215#1:870,5\n216#1:875,6\n216#1:902,5\n217#1:907,6\n217#1:934,5\n218#1:939,6\n218#1:966,5\n219#1:971,14\n219#1:1001,2\n220#1:1003,14\n220#1:1033,2\n221#1:1035,14\n221#1:1065,2\n222#1:1067,6\n222#1:1094,5\n223#1:1099,6\n223#1:1126,5\n224#1:1131,6\n224#1:1158,5\n225#1:1163,6\n225#1:1190,5\n226#1:1195,6\n226#1:1222,5\n184#1:313\n184#1:328\n185#1:345\n185#1:360\n186#1:369,6\n186#1:389\n187#1:401,6\n187#1:421\n188#1:433,6\n188#1:453\n189#1:465,6\n189#1:485\n190#1:497,6\n190#1:517\n191#1:529,6\n191#1:549\n192#1:561,6\n192#1:581\n200#1:601\n200#1:616\n208#1:625,6\n208#1:645\n209#1:657,6\n209#1:677\n210#1:689,6\n210#1:709\n211#1:721,6\n211#1:741\n212#1:753,6\n212#1:773\n213#1:785,6\n213#1:805\n214#1:817,6\n214#1:837\n215#1:849,6\n215#1:869\n216#1:881,6\n216#1:901\n217#1:913,6\n217#1:933\n218#1:945,6\n218#1:965\n219#1:985\n219#1:1000\n220#1:1017\n220#1:1032\n221#1:1049\n221#1:1064\n222#1:1073,6\n222#1:1093\n223#1:1105,6\n223#1:1125\n224#1:1137,6\n224#1:1157\n225#1:1169,6\n225#1:1189\n226#1:1201,6\n226#1:1221\n184#1:314,14\n185#1:346,14\n186#1:375,14\n187#1:407,14\n188#1:439,14\n189#1:471,14\n190#1:503,14\n191#1:535,14\n192#1:567,14\n200#1:602,14\n208#1:631,14\n209#1:663,14\n210#1:695,14\n211#1:727,14\n212#1:759,14\n213#1:791,14\n214#1:823,14\n215#1:855,14\n216#1:887,14\n217#1:919,14\n218#1:951,14\n219#1:986,14\n220#1:1018,14\n221#1:1050,14\n222#1:1079,14\n223#1:1111,14\n224#1:1143,14\n225#1:1175,14\n226#1:1207,14\n*E\n"})
    public static final class f extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f33953p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            j1 j1Var = j1.f34083p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(GetWebViewStoreUrlUseCase.class), null, j1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            u1 u1Var = u1.f34176p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IsWebViewVersionValidUseCase.class), null, u1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            v1 v1Var = v1.f34184p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(StoreRememberedDataFromCustomerUseCase.class), null, v1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            w1 w1Var = w1.f34192p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreRememberedUserDocumentUseCase.class), null, w1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            x1 x1Var = x1.f34200p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreRememberedUserUseCase.class), null, x1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            y1 y1Var = y1.f34208p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetRememberedUserUseCase.class), null, y1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            z1 z1Var = z1.f34216p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreNeedCleanTermsUseCase.class), null, z1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            a2 a2Var = a2.f34003p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RemoveRememberedUserUseCase.class), null, a2Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            b2 b2Var = b2.f34012p0;
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MigrateRememberedUserUseCase.class), null, b2Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            new KoinDefinition(module2, singleInstanceFactoryF7);
            z0 z0Var = z0.f34215p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeleteUserDataUseCase.class), null, z0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            a1 a1Var = a1.f34002p0;
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MigrateWebPreferencesToLocalStorageUseCase.class), null, a1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            new KoinDefinition(module2, singleInstanceFactoryF8);
            b1 b1Var = b1.f34011p0;
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetRememberedVersionNameUseCase.class), null, b1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            new KoinDefinition(module2, singleInstanceFactoryF9);
            c1 c1Var = c1.f34020p0;
            SingleInstanceFactory<?> singleInstanceFactoryF10 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetRememberedVersionCodeUseCase.class), null, c1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF10);
            }
            new KoinDefinition(module2, singleInstanceFactoryF10);
            d1 d1Var = d1.f34029p0;
            SingleInstanceFactory<?> singleInstanceFactoryF11 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAppVersionCodeUseCase.class), null, d1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF11);
            }
            new KoinDefinition(module2, singleInstanceFactoryF11);
            e1 e1Var = e1.f34038p0;
            SingleInstanceFactory<?> singleInstanceFactoryF12 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAppVersionNameUseCase.class), null, e1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF12);
            }
            new KoinDefinition(module2, singleInstanceFactoryF12);
            f1 f1Var = f1.f34047p0;
            SingleInstanceFactory<?> singleInstanceFactoryF13 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SetRememberedVersionCodeUseCase.class), null, f1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF13);
            }
            new KoinDefinition(module2, singleInstanceFactoryF13);
            g1 g1Var = g1.f34056p0;
            SingleInstanceFactory<?> singleInstanceFactoryF14 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LastVersionCheckerUseCase.class), null, g1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF14);
            }
            new KoinDefinition(module2, singleInstanceFactoryF14);
            h1 h1Var = h1.f34065p0;
            SingleInstanceFactory<?> singleInstanceFactoryF15 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IsSoftTokenBiometricActiveUseCase.class), null, h1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF15);
            }
            new KoinDefinition(module2, singleInstanceFactoryF15);
            i1 i1Var = i1.f34074p0;
            SingleInstanceFactory<?> singleInstanceFactoryF16 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SuspendStoreRememberedUserUseCase.class), null, i1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF16);
            }
            new KoinDefinition(module2, singleInstanceFactoryF16);
            k1 k1Var = k1.f34092p0;
            SingleInstanceFactory<?> singleInstanceFactoryF17 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SuspendGetRememberedUserUseCase.class), null, k1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF17);
            }
            new KoinDefinition(module2, singleInstanceFactoryF17);
            l1 l1Var = l1.f34101p0;
            SingleInstanceFactory<?> singleInstanceFactoryF18 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PersistMobileServicesUseCase.class), null, l1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF18);
            }
            new KoinDefinition(module2, singleInstanceFactoryF18);
            m1 m1Var = m1.f34110p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetUserConfigurationUseCase.class), null, m1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            n1 n1Var = n1.f34119p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchSettingsUseCase.class), null, n1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            o1 o1Var = o1.f34127p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FetchLoginHeaderUseCase.class), null, o1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            p1 p1Var = p1.f34135p0;
            SingleInstanceFactory<?> singleInstanceFactoryF19 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreLoginDataUseCase.class), null, p1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF19);
            }
            new KoinDefinition(module2, singleInstanceFactoryF19);
            q1 q1Var = q1.f34143p0;
            SingleInstanceFactory<?> singleInstanceFactoryF20 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetNotificationDetailUseCase.class), null, q1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF20);
            }
            new KoinDefinition(module2, singleInstanceFactoryF20);
            r1 r1Var = r1.f34151p0;
            SingleInstanceFactory<?> singleInstanceFactoryF21 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CreateNotificationNonCommercialUseCase.class), null, r1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF21);
            }
            new KoinDefinition(module2, singleInstanceFactoryF21);
            s1 s1Var = s1.f34160p0;
            SingleInstanceFactory<?> singleInstanceFactoryF22 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetNotificationOperativesNonCommercialUseCase.class), null, s1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF22);
            }
            new KoinDefinition(module2, singleInstanceFactoryF22);
            t1 t1Var = t1.f34168p0;
            SingleInstanceFactory<?> singleInstanceFactoryF23 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CheckConnectionUseCase.class), null, t1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF23);
            }
            new KoinDefinition(module2, singleInstanceFactoryF23);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$webHelperModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,298:1\n103#2,6:299\n109#2,5:326\n201#3,6:305\n207#3:325\n105#4,14:311\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$webHelperModule$1\n*L\n293#1:299,6\n293#1:326,5\n293#1:305,6\n293#1:325\n293#1:311,14\n*E\n"})
    public static final class g extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f33954p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            c2 c2Var = c2.f34021p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WebProfileLoader.class), null, c2Var, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getDataSource() {
        return f33941a;
    }

    @NotNull
    public static final Module getFetchersModule() {
        return f33946f;
    }

    @NotNull
    public static final Module getFilesModule() {
        return f33945e;
    }

    @NotNull
    public static final Module getRepository() {
        return f33942b;
    }

    @NotNull
    public static final Module getRouterModule() {
        return f33944d;
    }

    @NotNull
    public static final Module getUseCase() {
        return f33943c;
    }

    @NotNull
    public static final Module getWebHelperModule() {
        return f33947g;
    }
}
