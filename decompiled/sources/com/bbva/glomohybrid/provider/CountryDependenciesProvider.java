package com.bbva.glomohybrid.provider;

import android.app.Application;
import android.content.Context;
import com.bancomer.mbanking.R;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.appsflyer.AppsFlyerController;
import com.bbva.bridge.WebAwareComponent;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.web.plugin.PluginFactory;
import com.bbva.component.dm.akamai.interceptor.AkamaiInterceptorDataManager;
import com.bbva.component.dm.anonymous.AnonymousInterceptorDataManager;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.header.customers.CustomerInterceptorDataManager;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.component.dm.naturalauth.NaturalAuthDataManager;
import com.bbva.component.dm.singlesignon.SingleSignOnDataManager;
import com.bbva.component.ic.security.SecurityDataManager;
import com.bbva.dcaptureplugin.DocumentCapturePlugin;
import com.bbva.discreetmode.models.DiscreetModeConfiguration;
import com.bbva.discreetmode.plugin.DiscreetModePlugin;
import com.bbva.document.scanner.DefaultDocumentScanner;
import com.bbva.document.scanner.plugin.DocumentScannerPlugin;
import com.bbva.encryptionplugin.EncryptionPlugin;
import com.bbva.ethermobilesdk.plugin.CipherPlugin;
import com.bbva.firebase.analytics.module.FirebaseAnalyticsModuleKt;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.AuthConfiguration;
import com.bbva.glomoconfig.login.configurator.CountryEnterpriseAuthConfiguration;
import com.bbva.glomoconfig.login.configurator.CountryPersonalAuthConfiguration;
import com.bbva.glomoconfig.modules.PersonalModuleKt;
import com.bbva.glomoconfig.softtoken.SoftTokenConfig;
import com.bbva.glomohybrid.BuildConfig;
import com.bbva.glomohybrid.base.deeplink.modules.DynamicLinkModuleKt;
import com.bbva.glomohybrid.base.file.infrastructure.FileActions;
import com.bbva.glomohybrid.base.file.infrastructure.resolver.DefaultFileNameResolver;
import com.bbva.glomohybrid.base.file.infrastructure.resolver.FileNameResolver;
import com.bbva.glomohybrid.cellsweb.presentation.observers.BanxicoAppLifecycleObserver;
import com.bbva.glomohybrid.infoscreen.maintenanceflowmeter.MaintenanceFlowmeterReaction;
import com.bbva.glomohybrid.landing.domain.usecase.ScheduledShutdownCheckerUseCase;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentUnrollHandler;
import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentAuthenticationHandler;
import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler;
import com.bbva.glomohybrid.process.ProcessScreenTracker;
import com.bbva.glomohybrid.provider.module.ConfigModuleKt;
import com.bbva.glomohybrid.provider.module.NotificationModuleKt;
import com.bbva.glomohybrid.provider.modules.CountryArchitectureModuleKt;
import com.bbva.glomohybrid.provider.modules.CountryPresentationModuleKt;
import com.bbva.glomohybrid.provider.modules.CrontoManagerModuleKt;
import com.bbva.glomohybrid.provider.modules.EtherModuleKt;
import com.bbva.glomohybrid.provider.modules.GlomoFeaturesModuleKt;
import com.bbva.glomohybrid.provider.modules.InterceptorsModuleKt;
import com.bbva.glomohybrid.provider.modules.LegacyDataModuleKt;
import com.bbva.glomohybrid.provider.modules.NaturalAuthModuleKt;
import com.bbva.glomohybrid.provider.modules.ProfilingModuleKt;
import com.bbva.glomohybrid.provider.modules.QrModuleKt;
import com.bbva.glomohybrid.provider.modules.SalesforceDeeplinkInfoMapperModuleKt;
import com.bbva.glomohybrid.provider.modules.ShortcutModuleKt;
import com.bbva.glomohybrid.provider.modules.SmartAssistanceModuleKt;
import com.bbva.glomohybrid.provider.modules.TokenStorageModuleKt;
import com.bbva.glomohybrid.provider.modules.UserTypeModuleKt;
import com.bbva.glomohybrid.userAgent.UserAgentWebDispatcher;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentPlugin;
import com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePlugin;
import com.bbva.network.model.pinning.PinningCatalog;
import com.bbva.notifications.DeepLinkConstants;
import com.bbva.notifications.GloMoLocalNotificationCreator;
import com.bbva.notifications.provider.NotificationBuilderProvider;
import com.bbva.notifications.provider.NotificationsProvider;
import com.bbva.notifications.provider.SalesforcePushModuleKt;
import com.bbva.notifications.provider.module.BanxicoPushModuleKt;
import com.bbva.notifications.provider.module.NonPreProcessedNotificationModuleKt;
import com.bbva.ocrcardplugin.OcrCardPlugin;
import com.bbva.plugin.appsflyer.AppsFlyerPlugin;
import com.bbva.plugin.biometrics.BiometricsPlugin;
import com.bbva.plugin.decode.DecodePlugin;
import com.bbva.plugin.digipassmanager.DigipassManagerPlugin;
import com.bbva.plugin.filefetcher.FileFetcherPlugin;
import com.bbva.plugin.google.pay.GooglePayPlugin;
import com.bbva.plugin.media.capture.MediaCapturePlugin;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationPlugin;
import com.bbva.plugin.signaturepad.SignaturePadPlugin;
import com.bbva.plugin.zoomauthp.ZoomAuthPlugin;
import com.bbva.qrcreatorplugin.QRCreatorPlugin;
import com.bbva.qrplugin.QRPlugin;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayPlugin;
import com.bbva.selfiecapture.plugin.SelfieCapturePlugin;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import com.bbva.softtokenbase.PluginProvider;
import com.bbva.softtokenbase.ethertoken.module.EtherTokenModuleKt;
import com.bbva.softtokenbase.model.PluginData;
import com.bbva.speech.plugin.SpeechPlugin;
import com.bbva.videocapture.VideoCapturePlugin;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.DefaultContextExtKt;
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

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/provider/CountryDependenciesProvider;", "Lcom/bbva/glomohybrid/provider/DependenciesProvider;", "Lcom/bbva/cellscore/web/plugin/PluginFactory;", "pluginsFactory", "", "", "Lkotlin/Function0;", "Lcom/bbva/cellscore/reactor/PageReaction;", "pageReactions", "", "components", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProviderKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,355:1\n41#2,6:356\n47#2:363\n41#2,6:365\n47#2:372\n41#2,6:384\n47#2:391\n41#2,7:393\n41#2,6:400\n47#2:407\n41#2,6:409\n47#2:416\n41#2,6:423\n47#2:430\n41#2,6:432\n47#2:439\n41#2,6:441\n47#2:448\n41#2,6:450\n47#2:457\n41#2,6:459\n47#2:466\n41#2,6:468\n47#2:475\n133#3:362\n133#3:371\n133#3:380\n133#3:390\n133#3:406\n133#3:415\n352#3:420\n133#3:429\n133#3:438\n133#3:447\n133#3:456\n133#3:465\n133#3:474\n107#4:364\n107#4:373\n107#4:379\n107#4:392\n107#4:408\n107#4:417\n176#4:419\n107#4:431\n107#4:440\n107#4:449\n107#4:458\n107#4:467\n107#4:476\n188#5,5:374\n193#5,3:381\n198#5:418\n2634#6:421\n1#7:422\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider\n*L\n246#1:356,6\n246#1:363\n247#1:365,6\n247#1:372\n279#1:384,6\n279#1:391\n279#1:393,7\n283#1:400,6\n283#1:407\n288#1:409,6\n288#1:416\n345#1:423,6\n345#1:430\n346#1:432,6\n346#1:439\n347#1:441,6\n347#1:448\n348#1:450,6\n348#1:457\n349#1:459,6\n349#1:466\n350#1:468,6\n350#1:475\n246#1:362\n247#1:371\n248#1:380\n279#1:390\n283#1:406\n288#1:415\n299#1:420\n345#1:429\n346#1:438\n347#1:447\n348#1:456\n349#1:465\n350#1:474\n246#1:364\n247#1:373\n248#1:379\n279#1:392\n283#1:408\n288#1:417\n299#1:419\n345#1:431\n346#1:440\n347#1:449\n348#1:458\n349#1:467\n350#1:476\n248#1:374,5\n248#1:381,3\n299#1:418\n299#1:421\n299#1:422\n*E\n"})
public final class CountryDependenciesProvider implements DependenciesProvider {

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    @SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,355:1\n103#2,6:356\n109#2,5:383\n103#2,6:388\n109#2,5:415\n103#2,6:420\n109#2,5:447\n103#2,6:452\n109#2,5:479\n103#2,6:484\n109#2,5:511\n103#2,6:516\n109#2,5:543\n103#2,6:548\n109#2,5:575\n103#2,6:580\n109#2,5:607\n103#2,6:612\n109#2,5:639\n103#2,6:644\n109#2,5:671\n147#2,14:676\n161#2,2:706\n147#2,14:708\n161#2,2:738\n147#2,14:740\n161#2,2:770\n103#2,6:772\n109#2,5:799\n103#2,6:804\n109#2,5:831\n103#2,6:836\n109#2,5:863\n201#3,6:362\n207#3:382\n201#3,6:394\n207#3:414\n201#3,6:426\n207#3:446\n201#3,6:458\n207#3:478\n201#3,6:490\n207#3:510\n201#3,6:522\n207#3:542\n201#3,6:554\n207#3:574\n201#3,6:586\n207#3:606\n201#3,6:618\n207#3:638\n201#3,6:650\n207#3:670\n216#3:690\n217#3:705\n216#3:722\n217#3:737\n216#3:754\n217#3:769\n201#3,6:778\n207#3:798\n201#3,6:810\n207#3:830\n201#3,6:842\n207#3:862\n105#4,14:368\n105#4,14:400\n105#4,14:432\n105#4,14:464\n105#4,14:496\n105#4,14:528\n105#4,14:560\n105#4,14:592\n105#4,14:624\n105#4,14:656\n105#4,14:691\n105#4,14:723\n105#4,14:755\n105#4,14:784\n105#4,14:816\n105#4,14:848\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1\n*L\n134#1:356,6\n134#1:383,5\n136#1:388,6\n136#1:415,5\n153#1:420,6\n153#1:447,5\n157#1:452,6\n157#1:479,5\n168#1:484,6\n168#1:511,5\n176#1:516,6\n176#1:543,5\n180#1:548,6\n180#1:575,5\n191#1:580,6\n191#1:607,5\n203#1:612,6\n203#1:639,5\n214#1:644,6\n214#1:671,5\n219#1:676,14\n219#1:706,2\n221#1:708,14\n221#1:738,2\n223#1:740,14\n223#1:770,2\n225#1:772,6\n225#1:799,5\n227#1:804,6\n227#1:831,5\n231#1:836,6\n231#1:863,5\n134#1:362,6\n134#1:382\n136#1:394,6\n136#1:414\n153#1:426,6\n153#1:446\n157#1:458,6\n157#1:478\n168#1:490,6\n168#1:510\n176#1:522,6\n176#1:542\n180#1:554,6\n180#1:574\n191#1:586,6\n191#1:606\n203#1:618,6\n203#1:638\n214#1:650,6\n214#1:670\n219#1:690\n219#1:705\n221#1:722\n221#1:737\n223#1:754\n223#1:769\n225#1:778,6\n225#1:798\n227#1:810,6\n227#1:830\n231#1:842,6\n231#1:862\n134#1:368,14\n136#1:400,14\n153#1:432,14\n157#1:464,14\n168#1:496,14\n176#1:528,14\n180#1:560,14\n191#1:592,14\n203#1:624,14\n214#1:656,14\n219#1:691,14\n221#1:723,14\n223#1:755,14\n225#1:784,14\n227#1:816,14\n231#1:848,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            CountryDependenciesProvider countryDependenciesProvider = CountryDependenciesProvider.this;
            f0 f0Var = new f0(countryDependenciesProvider);
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(FileNameResolver.class), null, f0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LoginDataManager.class), null, g0.f33922p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(List.class), com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF2, ProcessScreenTracker.LAUNCHER_SCREEN_LIST), new h0(countryDependenciesProvider), kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DiscreetModeConfiguration.class), null, i0.f33926p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryPersonalAuthConfiguration.class), QualifierKt.named(UserType.PERSONAL.name()), j0.f33928p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF5), Reflection.getOrCreateKotlinClass(AuthConfiguration.class));
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryEnterpriseAuthConfiguration.class), QualifierKt.named(UserType.ENTERPRISE.name()), k0.f33930p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF6), Reflection.getOrCreateKotlinClass(AuthConfiguration.class));
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), QualifierKt.named(ConfigConstantsKt.GEMA_CONFIGURATORS), l0.f33932p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF7, ConfigConstantsKt.GLOBAL_CONFIGURATORS), m0.f33934p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            new KoinDefinition(module2, singleInstanceFactoryF8);
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SingleSignOnDataManager.class), null, n0.f34365p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            new KoinDefinition(module2, singleInstanceFactoryF9);
            SingleInstanceFactory<?> singleInstanceFactoryF10 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PaymentAuthenticationHandler.class), null, com.bbva.glomohybrid.provider.y.f34378p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF10);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF10), new KClass[]{Reflection.getOrCreateKotlinClass(PaymentUnrollHandler.class), Reflection.getOrCreateKotlinClass(PaymentEnrollHandler.class)});
            com.bbva.glomohybrid.provider.z zVar = com.bbva.glomohybrid.provider.z.f34379p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(NotificationBuilderProvider.class), null, zVar, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GloMoLocalNotificationCreator.class), null, com.bbva.glomohybrid.provider.a0.f33907p0, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PaymentsNotificationHandler.class), null, b0.f33909p0, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            SingleInstanceFactory<?> singleInstanceFactoryF11 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BanxicoAppLifecycleObserver.class), null, c0.f33911p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF11);
            }
            new KoinDefinition(module2, singleInstanceFactoryF11);
            SingleInstanceFactory<?> singleInstanceFactoryF12 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserAgentWebDispatcher.class), null, d0.f33913p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF12);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF12), Reflection.getOrCreateKotlinClass(WebAwareComponent.class));
            SingleInstanceFactory<?> singleInstanceFactoryF13 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ScheduledShutdownCheckerUseCase.class), null, e0.f33915p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF13);
            }
            new KoinDefinition(module2, singleInstanceFactoryF13);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class a0 extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a0 f33852p0 = new a0(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new CipherPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class b extends Lambda implements Function0<MaintenanceFlowmeterReaction> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f33853p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final MaintenanceFlowmeterReaction invoke() {
            return new MaintenanceFlowmeterReaction();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class c extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PluginData f33854p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PluginData pluginData) {
            super(0);
            this.f33854p0 = pluginData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return this.f33854p0.getInstance();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class d extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f33855p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new EncryptionPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    @SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$11\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,355:1\n41#2,6:356\n47#2:363\n133#3:362\n107#4:364\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$11\n*L\n313#1:356,6\n313#1:363\n313#1:362\n313#1:364\n*E\n"})
    public static final class e extends Lambda implements Function0<Plugin> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            DependenciesProvider dependenciesProvider = CountryDependenciesProvider.this;
            Object obj = (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : dependenciesProvider.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Application");
            return new DocumentScannerPlugin(new DefaultDocumentScanner((Application) obj));
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    @SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$12\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,355:1\n41#2,6:356\n47#2:363\n133#3:362\n107#4:364\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$12\n*L\n315#1:356,6\n315#1:363\n315#1:362\n315#1:364\n*E\n"})
    public static final class f extends Lambda implements Function0<Plugin> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            DependenciesProvider dependenciesProvider = CountryDependenciesProvider.this;
            return (Plugin) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : dependenciesProvider.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(NaturalAuthenticationPlugin.class), null, null);
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class g extends Lambda implements Function0<Plugin> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return CountryDependenciesProvider.access$appsFlyerPlugin(CountryDependenciesProvider.this);
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    @SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$14\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,355:1\n41#2,6:356\n47#2:363\n133#3:362\n107#4:364\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$14\n*L\n318#1:356,6\n318#1:363\n318#1:362\n318#1:364\n*E\n"})
    public static final class h extends Lambda implements Function0<Plugin> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            DependenciesProvider dependenciesProvider = CountryDependenciesProvider.this;
            return new DiscreetModePlugin((DiscreetModeConfiguration) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : dependenciesProvider.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DiscreetModeConfiguration.class), null, null), null, 2, null);
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class i extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f33860p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new OcrCardPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class j extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f33861p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new BiometricsPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class k extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f33862p0 = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new SignaturePadPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class l extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f33863p0 = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new SpeechPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class m extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f33864p0 = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new TrustDevicePlugin(null, 1, null);
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class n extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f33865p0 = new n(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new MobilePaymentPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class o extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f33866p0 = new o(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new QRCreatorPlugin(null, 1, null);
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    @SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$22\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,355:1\n41#2,6:356\n47#2:363\n133#3:362\n107#4:364\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$22\n*L\n327#1:356,6\n327#1:363\n327#1:362\n327#1:364\n*E\n"})
    public static final class p extends Lambda implements Function0<Plugin> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            DependenciesProvider dependenciesProvider = CountryDependenciesProvider.this;
            return new GooglePayPlugin((Context) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : dependenciesProvider.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class q extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f33868p0 = new q(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new ZoomAuthPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    @SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$24\n+ 2 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProviderKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,355:1\n188#2,5:356\n193#2,3:363\n107#3:361\n133#4:362\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$pluginsFactory$1$24\n*L\n329#1:356,5\n329#1:363,3\n329#1:361\n329#1:362\n*E\n"})
    public static final class r extends Lambda implements Function0<Plugin> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            Object obj = null;
            try {
                obj = CountryDependenciesProvider.this.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(PinningCatalog.class), null, null);
            } catch (Exception unused) {
            }
            return new DigipassManagerPlugin((PinningCatalog) obj);
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class s extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final s f33870p0 = new s(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new DecodePlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class t extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final t f33871p0 = new t(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new DocumentCapturePlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class u extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final u f33872p0 = new u(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new SelfieCapturePlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class v extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final v f33873p0 = new v(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new VideoCapturePlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class w extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final w f33874p0 = new w(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new MediaCapturePlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class x extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final x f33875p0 = new x(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new QRPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class y extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final y f33876p0 = new y(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new FileFetcherPlugin();
        }
    }

    /* JADX INFO: compiled from: CountryDependenciesProvider.kt */
    public static final class z extends Lambda implements Function0<Plugin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final z f33877p0 = new z(0);

        @Override // kotlin.jvm.functions.Function0
        public final Plugin invoke() {
            return new OpenPayPlugin();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountryDependenciesProvider() {
        Object obj;
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) EtherModuleKt.getEtherModule().plus(ModuleDSLKt.module$default(false, new a(), 1, null)), NotificationModuleKt.getNotificationModule()), InterceptorsModuleKt.getInterceptorsConfigurationModule()), UserTypeModuleKt.getUserTypeModule()), CountryArchitectureModuleKt.getCountryUseCaseModule()), CountryPresentationModuleKt.getCountryPresentationModule()), EtherTokenModuleKt.getEtherTokenModule(EtherModuleKt.ETHER_SHARED_STORAGE_GROUP)), CountryArchitectureModuleKt.getCountryRouterModule());
        boolean z10 = this instanceof KoinScopeComponent;
        String appId = ((SoftTokenConfig) (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SoftTokenConfig.class), QualifierKt.named(ConfigModuleKt.SOFT_TOKEN_CONFIG), null)).getAppId();
        String url = ((SoftTokenConfig) (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SoftTokenConfig.class), QualifierKt.named(ConfigModuleKt.SOFT_TOKEN_CONFIG), null)).getUrl();
        try {
            obj = getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(PinningCatalog.class), null, null);
        } catch (Exception unused) {
            obj = null;
        }
        DefaultContextExtKt.loadKoinModules((List<Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) listPlus, EtherTokenModuleKt.getEtherTokenCompatModule(appId, url, (PinningCatalog) obj, 30L)), NaturalAuthModuleKt.getNaturalAuthModule()), NaturalAuthModuleKt.getBiometricAuthenticationModule()), GlomoFeaturesModuleKt.getGlomoFeaturesModule()), FirebaseAnalyticsModuleKt.getFirebaseAnalyticsModule()), ShortcutModuleKt.getShortcutModule()), SmartAssistanceModuleKt.getSmartAssistanceModule()), QrModuleKt.getQrModule()), SalesforcePushModuleKt.getSalesforcePushModule()), BanxicoPushModuleKt.getBanxicoPushModule()), DynamicLinkModuleKt.loadDeeplinks(R.string.deeplink_scheme, "qr-cards", "https://bbva.mx", R.string.google_assistant_scheme, "bbva-actions.bbva.mx", R.string.modo_host, DeepLinkConstants.INSTANCE.getDEEPLINK_NOTIFICATION())), DynamicLinkModuleKt.loadDynamicLinks()), PersonalModuleKt.getPersonalModule(UserType.PERSONAL.name())), CountryArchitectureModuleKt.getCountryPushModule()), TokenStorageModuleKt.getTokenStorageModule()), ProfilingModuleKt.getProfilingModule()), LegacyDataModuleKt.getLegacyDataModule()), SalesforceDeeplinkInfoMapperModuleKt.getSalesforceDeeplinkInfoMapperModule()), CrontoManagerModuleKt.getCrontoManagerModule()), NonPreProcessedNotificationModuleKt.getNonPreProcessedNotificationModule()));
        ((NotificationsProvider) (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(NotificationsProvider.class), null, null)).initialize((Context) (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AppsFlyerPlugin access$appsFlyerPlugin(CountryDependenciesProvider countryDependenciesProvider) {
        countryDependenciesProvider.getClass();
        return new AppsFlyerPlugin(new AppsFlyerController((Application) (countryDependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) countryDependenciesProvider).getScope() : countryDependenciesProvider.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Application.class), null, null), BuildConfig.APPSFLYER_KEY));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FileNameResolver access$provideFileNameResolver(CountryDependenciesProvider countryDependenciesProvider) {
        countryDependenciesProvider.getClass();
        return new DefaultFileNameResolver((Context) (countryDependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) countryDependenciesProvider).getScope() : countryDependenciesProvider.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), null, null), bk.q.mapOf(TuplesKt.to(FileActions.Monthly, Integer.valueOf(R.string.pdf_name_monthly)), TuplesKt.to(FileActions.Terms, Integer.valueOf(R.string.pdf_name_terms_and_conditions)), TuplesKt.to(FileActions.PdfDocument, Integer.valueOf(R.string.pdf_name_document))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.provider.DependenciesProvider
    @NotNull
    public Map<String, Object> components() {
        Map<String, Object> mapComponents = DependenciesProvider.DefaultImpls.components(this);
        Pair[] pairArr = new Pair[6];
        boolean z10 = this instanceof KoinScopeComponent;
        pairArr[0] = TuplesKt.to(AkamaiInterceptorDataManager.ID, (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AkamaiInterceptorDataManager.class), null, null));
        pairArr[1] = TuplesKt.to(AnonymousInterceptorDataManager.ID, (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AnonymousInterceptorDataManager.class), null, null));
        pairArr[2] = TuplesKt.to(CustomerInterceptorDataManager.ID, (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CustomerInterceptorDataManager.class), null, null));
        pairArr[3] = TuplesKt.to(SecurityDataManager.ID, (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SecurityDataManager.class), null, null));
        pairArr[4] = TuplesKt.to(NaturalAuthDataManager.ID, (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FidoNetworkManager.class), null, null));
        pairArr[5] = TuplesKt.to(BiometricAuthenticationDataManager.ID, (z10 ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BiometricAuthenticationDataManager.class), null, null));
        return bk.q.plus(mapComponents, bk.q.mapOf(pairArr));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return DependenciesProvider.DefaultImpls.getKoin(this);
    }

    @Override // com.bbva.glomohybrid.provider.DependenciesProvider
    @NotNull
    public Map<String, Function0<GlobalReaction>> globalReactions() {
        return DependenciesProvider.DefaultImpls.globalReactions(this);
    }

    @Override // com.bbva.glomohybrid.provider.DependenciesProvider
    @NotNull
    public List<String> launcherScreens() {
        return DependenciesProvider.DefaultImpls.launcherScreens(this);
    }

    @Override // com.bbva.glomohybrid.provider.DependenciesProvider
    @NotNull
    public Map<String, Function0<PageReaction>> pageReactions() {
        return bk.q.plus(DependenciesProvider.DefaultImpls.pageReactions(this), bk.p.mapOf(TuplesKt.to("maintenance-flowmeter", b.f33853p0)));
    }

    @Override // com.bbva.glomohybrid.provider.DependenciesProvider
    @NotNull
    public PluginFactory pluginsFactory() {
        PluginFactory pluginFactoryPluginsFactory = DependenciesProvider.DefaultImpls.pluginsFactory(this);
        Iterator it = getKoin().getScopeRegistry().getRootScope().getAll(Reflection.getOrCreateKotlinClass(PluginProvider.class)).iterator();
        while (it.hasNext()) {
            PluginData pluginDataProvide = ((PluginProvider) it.next()).provide();
            pluginFactoryPluginsFactory.add(pluginDataProvide.getId(), new c(pluginDataProvide));
        }
        pluginFactoryPluginsFactory.add(DocumentCapturePlugin.ID, t.f33871p0);
        pluginFactoryPluginsFactory.add(SelfieCapturePlugin.ID, u.f33872p0);
        pluginFactoryPluginsFactory.add(VideoCapturePlugin.ID, v.f33873p0);
        pluginFactoryPluginsFactory.add("MediaCapturePlugin", w.f33874p0);
        pluginFactoryPluginsFactory.add("QrPlugin", x.f33875p0);
        pluginFactoryPluginsFactory.add("FileFetcherPlugin", y.f33876p0);
        pluginFactoryPluginsFactory.add("OpenPay", z.f33877p0);
        pluginFactoryPluginsFactory.add("Cipher", a0.f33852p0);
        pluginFactoryPluginsFactory.add(EncryptionPlugin.ID, d.f33855p0);
        pluginFactoryPluginsFactory.add(DocumentScannerPlugin.ID, new e());
        pluginFactoryPluginsFactory.add(NaturalAuthenticationPlugin.ID, new f());
        pluginFactoryPluginsFactory.add("AppsFlyerPlugin", new g());
        pluginFactoryPluginsFactory.add(DiscreetModePlugin.ID, new h());
        pluginFactoryPluginsFactory.add("OcrCard", i.f33860p0);
        pluginFactoryPluginsFactory.add("Biometrics", j.f33861p0);
        pluginFactoryPluginsFactory.add(SignaturePadPlugin.ID, k.f33862p0);
        pluginFactoryPluginsFactory.add("SpeechPlugin", l.f33863p0);
        pluginFactoryPluginsFactory.add(TrustDevicePlugin.ID, m.f33864p0);
        pluginFactoryPluginsFactory.add(MobilePaymentPlugin.ID, n.f33865p0);
        pluginFactoryPluginsFactory.add(QRCreatorPlugin.ID, o.f33866p0);
        pluginFactoryPluginsFactory.add(GooglePayPlugin.ID, new p());
        pluginFactoryPluginsFactory.add(ZoomAuthPlugin.ID, q.f33868p0);
        pluginFactoryPluginsFactory.add(DigipassManagerPlugin.ID, new r());
        pluginFactoryPluginsFactory.add(DecodePlugin.ID, s.f33870p0);
        return pluginFactoryPluginsFactory;
    }

    @Override // com.bbva.glomohybrid.provider.DependenciesProvider
    @NotNull
    public List<Plugin> requiredPlugins() {
        return DependenciesProvider.DefaultImpls.requiredPlugins(this);
    }
}
