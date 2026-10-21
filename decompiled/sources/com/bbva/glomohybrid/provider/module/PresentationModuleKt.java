package com.bbva.glomohybrid.provider.module;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal;
import com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.cellsweb.provider.CellsDependenciesProvider;
import com.bbva.glomohybrid.infoscreen.InfoScreenViewModel;
import com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationViewModel;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardViewModel;
import com.bbva.glomohybrid.infoscreen.webView.force.viewmodel.WebViewForceUpdateViewModel;
import com.bbva.glomohybrid.interceptors.MenuItemClickInterceptor;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.login.presentation.LoginAnimationObserver;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import com.bbva.glomohybrid.splash.presentation.viewmodel.SplashViewModel;
import com.bbva.glomohybrid.ui.modals.changeuser.ChangeUserFullScreenModalFactory;
import com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeViewModel;
import com.bbva.notifications.viewmodel.NotificationDetailViewModel;
import com.bbva.slidemenuview.cells.components.dm.MenuDataManager;
import com.bbva.slidemenuview.domain.usecase.GetFeaturedMenuUseCase;
import com.bbva.slidemenuview.domain.usecase.MarkItemAsVisitedUseCase;
import com.bbva.slidemenuview.domain.usecase.SyncMenuItemsUseCase;
import com.bbva.slidemenuview.presentation.SlideMenuViewContract;
import com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor;
import com.bbva.slidemenuview.repository.MenuRepository;
import java.util.List;
import java.util.Map;
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
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000\u001a\u0018\u0010\b\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000\"\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"", "", "", "", "activityHashCode", "Landroid/content/Context;", "activityContext", "Landroidx/appcompat/app/AppCompatActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getPresentationBehaviorsModule", "()Lorg/koin/core/module/Module;", "presentationBehaviorsModule", "b", "getLifecycleObserverModule", "lifecycleObserverModule", "c", "getPresentationModule", "presentationModule", "d", "getMenuModule", "menuModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class PresentationModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33983a = ModuleDSLKt.module$default(false, c.f33989p0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Module f33984b = ModuleDSLKt.module$default(false, a.f33987p0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Module f33985c = ModuleDSLKt.module$default(false, d.f33990p0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Module f33986d = ModuleDSLKt.module$default(false, b.f33988p0, 1, null);

    /* JADX INFO: compiled from: PresentationModule.kt */
    @SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$lifecycleObserverModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,251:1\n147#2,14:252\n161#2,2:282\n216#3:266\n217#3:281\n105#4,14:267\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$lifecycleObserverModule$1\n*L\n71#1:252,14\n71#1:282,2\n71#1:266\n71#1:281\n71#1:267,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33987p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            i5 i5Var = i5.f34078p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LoginAnimationObserver.class), null, i5Var, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PresentationModule.kt */
    @SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Qualifier.kt\norg/koin/core/qualifier/QualifierKt\n*L\n1#1,251:1\n103#2,6:252\n109#2,5:279\n103#2,6:284\n109#2,5:311\n147#2,14:316\n161#2,2:346\n147#2,14:348\n161#2,2:378\n147#2,14:380\n161#2,2:410\n147#2,14:412\n161#2,2:442\n151#2,10:444\n161#2,2:470\n201#3,6:258\n207#3:278\n201#3,6:290\n207#3:310\n216#3:330\n217#3:345\n216#3:362\n217#3:377\n216#3:394\n217#3:409\n216#3:426\n217#3:441\n216#3:454\n217#3:469\n105#4,14:264\n105#4,14:296\n105#4,14:331\n105#4,14:363\n105#4,14:395\n105#4,14:427\n105#4,14:455\n43#5:472\n43#5:473\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1\n*L\n174#1:252,6\n174#1:279,5\n178#1:284,6\n178#1:311,5\n180#1:316,14\n180#1:346,2\n184#1:348,14\n184#1:378,2\n188#1:380,14\n188#1:410,2\n192#1:412,14\n192#1:442,2\n195#1:444,10\n195#1:470,2\n174#1:258,6\n174#1:278\n178#1:290,6\n178#1:310\n180#1:330\n180#1:345\n184#1:362\n184#1:377\n188#1:394\n188#1:409\n192#1:426\n192#1:441\n195#1:454\n195#1:469\n174#1:264,14\n178#1:296,14\n180#1:331,14\n184#1:363,14\n188#1:395,14\n192#1:427,14\n195#1:455,14\n202#1:472\n224#1:473\n*E\n"})
    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f33988p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            j5 j5Var = j5.f34087p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(MenuRepository.class), null, j5Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            k5 k5Var = k5.f34096p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MenuDataManager.class), null, k5Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            l5 l5Var = l5.f34105p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(GetFeaturedMenuUseCase.class), null, l5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            m5 m5Var = m5.f34114p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SyncMenuItemsUseCase.class), null, m5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            n5 n5Var = n5.f34123p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MarkItemAsVisitedUseCase.class), null, n5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            o5 o5Var = o5.f34131p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SlideMenuViewContract.class), null, o5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed = QualifierKt.named(UserType.PERSONAL.getValue());
            p5 p5Var = p5.f34139p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(List.class), stringQualifierNamed, p5Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            module2.scope(new TypeQualifier(Reflection.getOrCreateKotlinClass(CellsWebActivity.class)), t5.f34172p0);
            module2.scope(new TypeQualifier(Reflection.getOrCreateKotlinClass(LoginActivity.class)), x5.f34204p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PresentationModule.kt */
    @SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationBehaviorsModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,251:1\n103#2,6:252\n109#2,5:279\n201#3,6:258\n207#3:278\n105#4,14:264\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationBehaviorsModule$1\n*L\n67#1:252,6\n67#1:279,5\n67#1:258,6\n67#1:278\n67#1:264,14\n*E\n"})
    public static final class c extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f33989p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            y5 y5Var = y5.f34212p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ChangeUserBehavior.class), null, y5Var, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PresentationModule.kt */
    @SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 6 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt\n*L\n1#1,251:1\n147#2,14:252\n161#2,2:282\n92#2,2:284\n94#2,2:305\n151#2,10:312\n161#2,2:338\n151#2,10:345\n161#2,2:371\n151#2,10:378\n161#2,2:404\n151#2,10:411\n161#2,2:437\n151#2,10:444\n161#2,2:470\n151#2,10:477\n161#2,2:503\n151#2,10:510\n161#2,2:536\n151#2,10:543\n161#2,2:569\n151#2,10:576\n161#2,2:602\n103#2,6:604\n109#2,5:631\n147#2,14:636\n161#2,2:666\n147#2,14:668\n161#2,2:698\n151#2,10:705\n161#2,2:731\n147#2,14:733\n161#2,2:763\n103#2,6:765\n109#2,5:792\n216#3:266\n217#3:281\n226#3:287\n227#3:302\n216#3:322\n217#3:337\n216#3:355\n217#3:370\n216#3:388\n217#3:403\n216#3:421\n217#3:436\n216#3:454\n217#3:469\n216#3:487\n217#3:502\n216#3:520\n217#3:535\n216#3:553\n217#3:568\n216#3:586\n217#3:601\n201#3,6:610\n207#3:630\n216#3:650\n217#3:665\n216#3:682\n217#3:697\n216#3:715\n217#3:730\n216#3:747\n217#3:762\n201#3,6:771\n207#3:791\n105#4,14:267\n105#4,14:288\n105#4,14:323\n105#4,14:356\n105#4,14:389\n105#4,14:422\n105#4,14:455\n105#4,14:488\n105#4,14:521\n105#4,14:554\n105#4,14:587\n105#4,14:616\n105#4,14:651\n105#4,14:683\n105#4,14:716\n105#4,14:748\n105#4,14:777\n36#5:286\n37#5,2:303\n35#6,5:307\n35#6,5:340\n35#6,5:373\n35#6,5:406\n35#6,5:439\n35#6,5:472\n35#6,5:505\n35#6,5:538\n35#6,5:571\n35#6,5:700\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1\n*L\n77#1:252,14\n77#1:282,2\n81#1:284,2\n81#1:305,2\n87#1:312,10\n87#1:338,2\n91#1:345,10\n91#1:371,2\n95#1:378,10\n95#1:404,2\n99#1:411,10\n99#1:437,2\n110#1:444,10\n110#1:470,2\n114#1:477,10\n114#1:503,2\n119#1:510,10\n119#1:536,2\n123#1:543,10\n123#1:569,2\n127#1:576,10\n127#1:602,2\n131#1:604,6\n131#1:631,5\n135#1:636,14\n135#1:666,2\n139#1:668,14\n139#1:698,2\n151#1:705,10\n151#1:731,2\n156#1:733,14\n156#1:763,2\n169#1:765,6\n169#1:792,5\n77#1:266\n77#1:281\n82#1:287\n82#1:302\n87#1:322\n87#1:337\n91#1:355\n91#1:370\n95#1:388\n95#1:403\n99#1:421\n99#1:436\n110#1:454\n110#1:469\n114#1:487\n114#1:502\n119#1:520\n119#1:535\n123#1:553\n123#1:568\n127#1:586\n127#1:601\n131#1:610,6\n131#1:630\n135#1:650\n135#1:665\n139#1:682\n139#1:697\n151#1:715\n151#1:730\n156#1:747\n156#1:762\n169#1:771,6\n169#1:791\n77#1:267,14\n82#1:288,14\n87#1:323,14\n91#1:356,14\n95#1:389,14\n99#1:422,14\n110#1:455,14\n114#1:488,14\n119#1:521,14\n123#1:554,14\n127#1:587,14\n131#1:616,14\n135#1:651,14\n139#1:683,14\n151#1:716,14\n156#1:748,14\n169#1:777,14\n82#1:286\n82#1:303,2\n87#1:307,5\n91#1:340,5\n95#1:373,5\n99#1:406,5\n110#1:439,5\n114#1:472,5\n119#1:505,5\n123#1:538,5\n127#1:571,5\n151#1:700,5\n*E\n"})
    public static final class d extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f33990p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            j6 j6Var = j6.f34088p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class), null, j6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(CellsWebActivity.class));
            ScopeDSL scopeDSL = new ScopeDSL(typeQualifier, module2);
            StringQualifier stringQualifierNamed = QualifierKt.named(CellsDependenciesProvider.ID);
            k6 k6Var = k6.f34097p0;
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ActivityDependenciesProvider.class), stringQualifierNamed, k6Var, Kind.Scoped, CollectionsKt__CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
            new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory);
            module2.getScopes().add(typeQualifier);
            m6 m6Var = m6.f34115p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SplashViewModel.class), null, m6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            o6 o6Var = o6.f34132p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LoginViewModel.class), null, o6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            q6 q6Var = q6.f34148p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WelcomeViewModel.class), null, q6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            t6 t6Var = t6.f34173p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CellsWebViewModel.class), null, t6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            v6 v6Var = v6.f34189p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LandingViewModel.class), null, v6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            x6 x6Var = x6.f34205p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InfoScreenViewModel.class), null, x6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            y6 y6Var = y6.f34213p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ScratchcardViewModel.class), null, y6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            z5 z5Var = z5.f34220p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WebViewForceUpdateViewModel.class), null, z5Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            b6 b6Var = b6.f34016p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NotificationDetailViewModel.class), null, b6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            c6 c6Var = c6.f34025p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(ChangeUserFullScreenModalFactory.class), null, c6Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            d6 d6Var = d6.f34034p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MenuItemClickInterceptor.class), null, d6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(ClickInterceptor.class));
            e6 e6Var = e6.f34043p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InAppUpdateModal.class), null, e6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            g6 g6Var = g6.f34061p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PaymentsInfoNotificationViewModel.class), null, g6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            h6 h6Var = h6.f34070p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Unit.class), null, h6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            i6 i6Var = i6.f34079p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HalfModalComponent.class), null, i6Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final AppCompatActivity activity(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (AppCompatActivity) obj;
    }

    @NotNull
    public static final Context activityContext(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
        return (Context) obj;
    }

    public static final int activityHashCode(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return activityContext(map).hashCode();
    }

    @NotNull
    public static final Module getLifecycleObserverModule() {
        return f33984b;
    }

    @NotNull
    public static final Module getMenuModule() {
        return f33986d;
    }

    @NotNull
    public static final Module getPresentationBehaviorsModule() {
        return f33983a;
    }

    @NotNull
    public static final Module getPresentationModule() {
        return f33985c;
    }
}
