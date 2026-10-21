package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.analytics.AnalyticsAppLifecycle;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.usecase.CleanCookiesUseCase;
import com.bbva.plugin.analyticsdata.AnalyticsDataPlugin;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
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
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: AnalyticsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getAnalyticsModule", "()Lorg/koin/core/module/Module;", "analyticsModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class AnalyticsModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33937a = ModuleDSLKt.module$default(false, a.f33938p0, 1, null);

    /* JADX INFO: compiled from: AnalyticsModule.kt */
    @SourceDebugExtension({"SMAP\nAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,64:1\n147#2,14:65\n161#2,2:95\n147#2,14:97\n161#2,2:127\n103#2,6:129\n109#2,5:156\n147#2,14:161\n161#2,2:191\n147#2,14:193\n161#2,2:223\n216#3:79\n217#3:94\n216#3:111\n217#3:126\n201#3,6:135\n207#3:155\n216#3:175\n217#3:190\n216#3:207\n217#3:222\n105#4,14:80\n105#4,14:112\n105#4,14:141\n105#4,14:176\n105#4,14:208\n*S KotlinDebug\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1\n*L\n24#1:65,14\n24#1:95,2\n35#1:97,14\n35#1:127,2\n46#1:129,6\n46#1:156,5\n53#1:161,14\n53#1:191,2\n62#1:193,14\n62#1:223,2\n24#1:79\n24#1:94\n35#1:111\n35#1:126\n46#1:135,6\n46#1:155\n53#1:175\n53#1:190\n62#1:207\n62#1:222\n24#1:80,14\n35#1:112,14\n46#1:141,14\n53#1:176,14\n62#1:208,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33938p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            e eVar = e.f34036p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(CleanCookiesUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            f fVar = f.f34045p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AnalyticsAppLifecycle.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            g gVar = g.f34054p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AnalyticsManager.class), null, gVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            h hVar = h.f34063p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AnalyticsDataPlugin.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            i iVar = i.f34072p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MenuIdentifierMapper.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getAnalyticsModule() {
        return f33937a;
    }
}
