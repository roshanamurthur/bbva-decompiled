package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.request.headers.usecase.AddHeaderUseCase;
import com.bbva.glomo.router.RouterSplash;
import com.bbva.glomo.user.domain.usecase.StoreIsPnnUseCase;
import com.bbva.glomohybrid.base.usecase.CiscoWebexInstantiatePluginUseCase;
import com.bbva.glomohybrid.base.usecase.UseCaseConstants;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.glomohybrid.usecase.CountryCiscoWebexInstantiatePluginUseCase;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.notifications.domain.CountryIsActionAvailableInPublicZoneUseCase;
import com.bbva.notifications.domain.CountryTrackShortcutEventUseCase;
import com.bbva.notifications.domain.IsActionAvailableInPublicZoneUseCase;
import com.bbva.notifications.domain.TrackShortcutEventUseCase;
import com.bbva.notifications.handlers.CountryGlomoPushHandler;
import com.bbva.push.handler.PushHandler;
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
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\f\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getCountryUseCaseModule", "()Lorg/koin/core/module/Module;", "countryUseCaseModule", "b", "getCountryRouterModule", "countryRouterModule", "c", "getCountryPushModule", "countryPushModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class CountryArchitectureModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34222a = ModuleDSLKt.module$default(false, c.f34227p0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Module f34223b = ModuleDSLKt.module$default(false, b.f34226p0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Module f34224c = ModuleDSLKt.module$default(false, a.f34225p0, 1, null);

    /* JADX INFO: compiled from: CountryArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryPushModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,85:1\n103#2,6:86\n109#2,5:113\n201#3,6:92\n207#3:112\n105#4,14:98\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryPushModule$1\n*L\n77#1:86,6\n77#1:113,5\n77#1:92,6\n77#1:112\n77#1:98,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34225p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.glomohybrid.provider.modules.a aVar = com.bbva.glomohybrid.provider.modules.a.f34262p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryGlomoPushHandler.class), null, aVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(PushHandler.class));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountryArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryRouterModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,85:1\n103#2,6:86\n109#2,5:113\n201#3,6:92\n207#3:112\n105#4,14:98\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryRouterModule$1\n*L\n74#1:86,6\n74#1:113,5\n74#1:92,6\n74#1:112\n74#1:98,14\n*E\n"})
    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f34226p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.glomohybrid.provider.modules.b bVar = com.bbva.glomohybrid.provider.modules.b.f34266p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RouterSplash.class), null, bVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountryArchitectureModule.kt */
    @SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Qualifier.kt\norg/koin/core/qualifier/QualifierKt\n*L\n1#1,85:1\n103#2,6:86\n109#2,5:113\n151#2,10:118\n161#2,2:144\n103#2,6:146\n109#2,5:173\n103#2,6:179\n109#2,5:206\n103#2,6:211\n109#2,5:238\n103#2,6:243\n109#2,5:270\n103#2,6:275\n109#2,5:302\n103#2,6:307\n109#2,5:334\n201#3,6:92\n207#3:112\n216#3:128\n217#3:143\n201#3,6:152\n207#3:172\n201#3,6:185\n207#3:205\n201#3,6:217\n207#3:237\n201#3,6:249\n207#3:269\n201#3,6:281\n207#3:301\n201#3,6:313\n207#3:333\n105#4,14:98\n105#4,14:129\n105#4,14:158\n105#4,14:191\n105#4,14:223\n105#4,14:255\n105#4,14:287\n105#4,14:319\n43#5:178\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1\n*L\n35#1:86,6\n35#1:113,5\n37#1:118,10\n37#1:144,2\n46#1:146,6\n46#1:173,5\n55#1:179,6\n55#1:206,5\n58#1:211,6\n58#1:238,5\n61#1:243,6\n61#1:270,5\n65#1:275,6\n65#1:302,5\n68#1:307,6\n68#1:334,5\n35#1:92,6\n35#1:112\n37#1:128\n37#1:143\n46#1:152,6\n46#1:172\n55#1:185,6\n55#1:205\n58#1:217,6\n58#1:237\n61#1:249,6\n61#1:269\n65#1:281,6\n65#1:301\n68#1:313,6\n68#1:333\n35#1:98,14\n37#1:129,14\n46#1:158,14\n55#1:191,14\n58#1:223,14\n61#1:255,14\n65#1:287,14\n68#1:319,14\n50#1:178\n*E\n"})
    public static final class c extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f34227p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.glomohybrid.provider.modules.c cVar = com.bbva.glomohybrid.provider.modules.c.f34270p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(AddHeaderUseCase.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            StringQualifier stringQualifierE = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF, UseCaseConstants.isTokenActiveUseCase);
            f fVar = f.f34284p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SuspendUseCase.class), stringQualifierE, fVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2));
            g gVar = g.f34288p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ValidatePasswordQualityUseCase.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            module2.scope(new TypeQualifier(Reflection.getOrCreateKotlinClass(CellsWebActivity.class)), i.f34296p0);
            j jVar = j.f34300p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StoreIsPnnUseCase.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            k kVar = k.f34304p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryIsActionAvailableInPublicZoneUseCase.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF4), Reflection.getOrCreateKotlinClass(IsActionAvailableInPublicZoneUseCase.class));
            l lVar = l.f34308p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryTrackShortcutEventUseCase.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF5), Reflection.getOrCreateKotlinClass(TrackShortcutEventUseCase.class));
            m mVar = m.f34312p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(GetCustomerLoginsUseCase.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            n nVar = n.f34316p0;
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CountryCiscoWebexInstantiatePluginUseCase.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF7), Reflection.getOrCreateKotlinClass(CiscoWebexInstantiatePluginUseCase.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getCountryPushModule() {
        return f34224c;
    }

    @NotNull
    public static final Module getCountryRouterModule() {
        return f34223b;
    }

    @NotNull
    public static final Module getCountryUseCaseModule() {
        return f34222a;
    }
}
