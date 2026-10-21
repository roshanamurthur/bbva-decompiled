package com.bbva.glomohybrid.provider;

import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.bridge.WebAwareComponent;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.cellscore.app.AppLifecycle;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.cellscore.web.plugin.PluginFactory;
import com.bbva.component.dm.actionlauncher.ActionLauncherComponent;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.component.root.checker.RootCheckerComponent;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.glomo.resource.ResourceProvider;
import com.bbva.glomohybrid.WebChromeClient;
import com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler;
import com.bbva.glomohybrid.base.datasource.RootDataSource;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcher;
import com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider;
import com.bbva.glomohybrid.base.file.common.FileExporter;
import com.bbva.glomohybrid.base.file.constants.FileConstants;
import com.bbva.glomohybrid.base.file.infrastructure.FileRemovalLifecycle;
import com.bbva.glomohybrid.base.file.receipts.ReceiptsStore;
import com.bbva.glomohybrid.base.session.SessionModuleKt;
import com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.infoscreen.root.RootModuleKt;
import com.bbva.glomohybrid.process.ProcessScreenTracker;
import com.bbva.glomohybrid.provider.module.ActionLauncherModuleKt;
import com.bbva.glomohybrid.provider.module.AnalyticsModuleKt;
import com.bbva.glomohybrid.provider.module.AppSettingsModuleKt;
import com.bbva.glomohybrid.provider.module.ArchitectureModuleKt;
import com.bbva.glomohybrid.provider.module.ComponentModuleKt;
import com.bbva.glomohybrid.provider.module.ConfigModuleKt;
import com.bbva.glomohybrid.provider.module.DeviceManagerModuleKt;
import com.bbva.glomohybrid.provider.module.EnvironmentModuleKt;
import com.bbva.glomohybrid.provider.module.FeatureFlagsModuleKt;
import com.bbva.glomohybrid.provider.module.InAppUpdateModuleKt;
import com.bbva.glomohybrid.provider.module.InfoViewModuleKt;
import com.bbva.glomohybrid.provider.module.LandingModuleKt;
import com.bbva.glomohybrid.provider.module.LogModuleKt;
import com.bbva.glomohybrid.provider.module.LoginModuleKt;
import com.bbva.glomohybrid.provider.module.MobileServicesModuleKt;
import com.bbva.glomohybrid.provider.module.NetworkModuleKt;
import com.bbva.glomohybrid.provider.module.PresentationModuleKt;
import com.bbva.glomohybrid.provider.module.PushesModuleKt;
import com.bbva.glomohybrid.provider.modules.CountryNotificationChannelCreatorModuleKt;
import com.bbva.glomohybrid.usecase.GetUrlUseCase;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.notifications.provider.module.NotificationCreatorsModuleKt;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/provider/AppDependenciesProvider;", "", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getAppModule", "()Lorg/koin/core/module/Module;", "appModule", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class AppDependenciesProvider {

    @NotNull
    public static final AppDependenciesProvider INSTANCE = new AppDependenciesProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Module appModule;

    /* JADX INFO: compiled from: AppDependenciesProvider.kt */
    @SourceDebugExtension({"SMAP\nAppDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,238:1\n103#2,6:239\n109#2,5:266\n147#2,14:271\n161#2,2:301\n103#2,6:303\n109#2,5:330\n103#2,6:335\n109#2,5:362\n103#2,6:367\n109#2,5:394\n103#2,6:399\n109#2,5:426\n103#2,6:431\n109#2,5:458\n103#2,6:463\n109#2,5:490\n103#2,6:495\n109#2,5:522\n103#2,6:527\n109#2,5:554\n103#2,6:559\n109#2,5:586\n103#2,6:591\n109#2,5:618\n103#2,6:623\n109#2,5:650\n103#2,6:655\n109#2,5:682\n103#2,6:687\n109#2,5:714\n103#2,6:719\n109#2,5:746\n103#2,6:751\n109#2,5:778\n103#2,6:783\n109#2,5:810\n147#2,14:815\n161#2,2:845\n147#2,14:847\n161#2,2:877\n147#2,14:879\n161#2,2:909\n147#2,14:911\n161#2,2:941\n103#2,6:943\n109#2,5:970\n103#2,6:975\n109#2,5:1002\n201#3,6:245\n207#3:265\n216#3:285\n217#3:300\n201#3,6:309\n207#3:329\n201#3,6:341\n207#3:361\n201#3,6:373\n207#3:393\n201#3,6:405\n207#3:425\n201#3,6:437\n207#3:457\n201#3,6:469\n207#3:489\n201#3,6:501\n207#3:521\n201#3,6:533\n207#3:553\n201#3,6:565\n207#3:585\n201#3,6:597\n207#3:617\n201#3,6:629\n207#3:649\n201#3,6:661\n207#3:681\n201#3,6:693\n207#3:713\n201#3,6:725\n207#3:745\n201#3,6:757\n207#3:777\n201#3,6:789\n207#3:809\n216#3:829\n217#3:844\n216#3:861\n217#3:876\n216#3:893\n217#3:908\n216#3:925\n217#3:940\n201#3,6:949\n207#3:969\n201#3,6:981\n207#3:1001\n105#4,14:251\n105#4,14:286\n105#4,14:315\n105#4,14:347\n105#4,14:379\n105#4,14:411\n105#4,14:443\n105#4,14:475\n105#4,14:507\n105#4,14:539\n105#4,14:571\n105#4,14:603\n105#4,14:635\n105#4,14:667\n105#4,14:699\n105#4,14:731\n105#4,14:763\n105#4,14:795\n105#4,14:830\n105#4,14:862\n105#4,14:894\n105#4,14:926\n105#4,14:955\n105#4,14:987\n*S KotlinDebug\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1\n*L\n126#1:239,6\n126#1:266,5\n127#1:271,14\n127#1:301,2\n128#1:303,6\n128#1:330,5\n134#1:335,6\n134#1:362,5\n135#1:367,6\n135#1:394,5\n136#1:399,6\n136#1:426,5\n137#1:431,6\n137#1:458,5\n138#1:463,6\n138#1:490,5\n139#1:495,6\n139#1:522,5\n140#1:527,6\n140#1:554,5\n141#1:559,6\n141#1:586,5\n142#1:591,6\n142#1:618,5\n148#1:623,6\n148#1:650,5\n154#1:655,6\n154#1:682,5\n156#1:687,6\n156#1:714,5\n160#1:719,6\n160#1:746,5\n164#1:751,6\n164#1:778,5\n166#1:783,6\n166#1:810,5\n173#1:815,14\n173#1:845,2\n175#1:847,14\n175#1:877,2\n179#1:879,14\n179#1:909,2\n181#1:911,14\n181#1:941,2\n183#1:943,6\n183#1:970,5\n185#1:975,6\n185#1:1002,5\n126#1:245,6\n126#1:265\n127#1:285\n127#1:300\n128#1:309,6\n128#1:329\n134#1:341,6\n134#1:361\n135#1:373,6\n135#1:393\n136#1:405,6\n136#1:425\n137#1:437,6\n137#1:457\n138#1:469,6\n138#1:489\n139#1:501,6\n139#1:521\n140#1:533,6\n140#1:553\n141#1:565,6\n141#1:585\n142#1:597,6\n142#1:617\n148#1:629,6\n148#1:649\n154#1:661,6\n154#1:681\n156#1:693,6\n156#1:713\n160#1:725,6\n160#1:745\n164#1:757,6\n164#1:777\n166#1:789,6\n166#1:809\n173#1:829\n173#1:844\n175#1:861\n175#1:876\n179#1:893\n179#1:908\n181#1:925\n181#1:940\n183#1:949,6\n183#1:969\n185#1:981,6\n185#1:1001\n126#1:251,14\n127#1:286,14\n128#1:315,14\n134#1:347,14\n135#1:379,14\n136#1:411,14\n137#1:443,14\n138#1:475,14\n139#1:507,14\n140#1:539,14\n141#1:571,14\n142#1:603,14\n148#1:635,14\n154#1:667,14\n156#1:699,14\n160#1:731,14\n164#1:763,14\n166#1:795,14\n173#1:830,14\n175#1:862,14\n179#1:894,14\n181#1:926,14\n183#1:955,14\n185#1:987,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33850p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            k kVar = k.f33929p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(InternalWebView.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            q qVar = q.f34370p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(WebChromeClient.class), null, qVar, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(android.webkit.WebChromeClient.class));
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RootCheckerComponent.class), null, r.f34371p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WebViewBuilder.class), null, s.f34372p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AppLifeCycleCreationJobHandler.class), null, t.f34373p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AppLifecycle.Builder.class), null, u.f34374p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DependenciesProvider.class), null, v.f34375p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FileExporter.class), null, w.f34376p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            new KoinDefinition(module2, singleInstanceFactoryF7);
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ReceiptsStore.class), null, x.f34377p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Boolean.class), com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF8, RootDataSource.KEY_CHECK), com.bbva.glomohybrid.provider.a.f33906p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            new KoinDefinition(module2, singleInstanceFactoryF9);
            SingleInstanceFactory<?> singleInstanceFactoryF10 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, b.f33908p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF10);
            }
            new KoinDefinition(module2, singleInstanceFactoryF10);
            SingleInstanceFactory<?> singleInstanceFactoryF11 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, c.f33910p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF11);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF11), new KClass[]{Reflection.getOrCreateKotlinClass(WebAwareComponent.class), Reflection.getOrCreateKotlinClass(MessageDispatcher.class)});
            SingleInstanceFactory<?> singleInstanceFactoryF12 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), null, d.f33912p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF12);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF12), new KClass[]{Reflection.getOrCreateKotlinClass(WebAwareComponent.class), Reflection.getOrCreateKotlinClass(NavigateDispatcher.class)});
            SingleInstanceFactory<?> singleInstanceFactoryF13 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ActionLauncherComponent.class), null, e.f33914p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF13);
            }
            SingleInstanceFactory<?> singleInstanceFactoryF14 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SharedPreferences.class), com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF13, PrefsStorageDataManager.ID), f.f33919p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF14);
            }
            new KoinDefinition(module2, singleInstanceFactoryF14);
            SingleInstanceFactory<?> singleInstanceFactoryF15 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserStoredDatasource.class), null, g.f33921p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF15);
            }
            new KoinDefinition(module2, singleInstanceFactoryF15);
            SingleInstanceFactory<?> singleInstanceFactoryF16 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ResourceProvider.class), null, h.f33923p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF16);
            }
            new KoinDefinition(module2, singleInstanceFactoryF16);
            SingleInstanceFactory<?> singleInstanceFactoryF17 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ProcessScreenTracker.class), null, i.f33925p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF17);
            }
            new KoinDefinition(module2, singleInstanceFactoryF17);
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FileRemovalLifecycle.class), null, j.f33927p0, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeeplinkDispatcher.class), null, l.f33931p0, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(DeeplinkDispatcherProvider.class));
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceInfo.class), null, m.f33933p0, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ZipActionsFlow.class), null, n.f34364p0, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            SingleInstanceFactory<?> singleInstanceFactoryF18 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetUrlUseCase.class), null, o.f34366p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF18);
            }
            new KoinDefinition(module2, singleInstanceFactoryF18);
            SingleInstanceFactory<?> singleInstanceFactoryF19 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PluginFactory.class), null, p.f34368p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF19);
            }
            new KoinDefinition(module2, singleInstanceFactoryF19);
            return Unit.INSTANCE;
        }
    }

    static {
        DefaultContextExtKt.loadKoinModules((List<Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) CollectionsKt___CollectionsKt.plus((Collection<? extends Module>) MobileServicesModuleKt.getMobileServices().plus(ArchitectureModuleKt.getDataSource()), ArchitectureModuleKt.getUseCase()), PresentationModuleKt.getPresentationModule()), ArchitectureModuleKt.getFilesModule()), ActionLauncherModuleKt.getActionLauncherModule()), ConfigModuleKt.getConfigModule()), PresentationModuleKt.getPresentationBehaviorsModule()), FeatureFlagsModuleKt.getFeatureFlagsModule()), AnalyticsModuleKt.getAnalyticsModule()), PresentationModuleKt.getLifecycleObserverModule()), PresentationModuleKt.getMenuModule()), ComponentModuleKt.getComponentModule()), NetworkModuleKt.getNetworkModule()), EnvironmentModuleKt.getEnvironmentModule()), AppSettingsModuleKt.getAppSettingsModule()), SessionModuleKt.getSessionModule()), InfoViewModuleKt.getInfoViewModule()), ArchitectureModuleKt.getRouterModule()), ArchitectureModuleKt.getWebHelperModule()), com.bbva.glomohybrid.provider.module.SessionModuleKt.getSessionTracingModule()), ArchitectureModuleKt.getRepository()), LogModuleKt.getLogModule()), RootModuleKt.getRootModule()), NotificationCreatorsModuleKt.getNotificationCreatorsModule()), PushesModuleKt.getPushesModule()), ArchitectureModuleKt.getFetchersModule()), LandingModuleKt.getLandingModule()), InAppUpdateModuleKt.getInAppUpdateModule()), LoginModuleKt.getLoginModule()), DeviceManagerModuleKt.getDeviceManagerModule()), CountryNotificationChannelCreatorModuleKt.getNotificationChannelCreatorModule()));
        appModule = ModuleDSLKt.module$default(false, a.f33850p0, 1, null);
    }

    public static final AppLifecycle.Builder access$configureAppLifecycle(AppDependenciesProvider appDependenciesProvider) {
        appDependenciesProvider.getClass();
        return new AppLifecycle.Builder();
    }

    public static final File access$getFile(AppDependenciesProvider appDependenciesProvider, Context context) {
        appDependenciesProvider.getClass();
        return new File(context.getFilesDir(), FileConstants.FILE_PROVIDER_SHARED_FOLDER_NAME);
    }

    public static final FileExporter access$provideFileExporter(AppDependenciesProvider appDependenciesProvider, Context context) {
        appDependenciesProvider.getClass();
        return new FileExporter(context);
    }

    public static final SharedPreferences access$provideGloMoPreferences(AppDependenciesProvider appDependenciesProvider, Context context) {
        appDependenciesProvider.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PrefsStorageDataManager.ID, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static final ReceiptsStore access$provideReceiptsStore(AppDependenciesProvider appDependenciesProvider, Context context) {
        appDependenciesProvider.getClass();
        return new ReceiptsStore(LazyKt__LazyJVMKt.lazy(new z9.a(context)), null, 2, null);
    }

    public static final InternalWebView access$provideWebView(AppDependenciesProvider appDependenciesProvider) {
        appDependenciesProvider.getClass();
        InternalWebView webView = ((WebController) ComponentManager.get(WebActions.ID)).getWebView();
        Intrinsics.checkNotNullExpressionValue(webView, "getWebView(...)");
        return webView;
    }

    @NotNull
    public final Module getAppModule() {
        return appModule;
    }
}
