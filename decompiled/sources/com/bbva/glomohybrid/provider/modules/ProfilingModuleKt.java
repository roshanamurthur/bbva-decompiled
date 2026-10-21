package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.profiling.domain.usecase.SyncProfilingUseCase;
import com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler;
import com.bbva.glomohybrid.profiling.repository.ProfilingRepository;
import com.bbva.glomohybrid.profiling.repository.datasource.NetworkProfilingDataSource;
import com.bbva.glomohybrid.profiling.repository.datasource.ProfilingLocalDataSource;
import com.bbva.glomohybrid.profiling.repository.datasource.ProfilingMemoryDataSource;
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

/* JADX INFO: compiled from: ProfilingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getProfilingModule", "()Lorg/koin/core/module/Module;", "profilingModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class ProfilingModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34248a = ModuleDSLKt.module$default(false, a.f34249p0, 1, null);

    /* JADX INFO: compiled from: ProfilingModule.kt */
    @SourceDebugExtension({"SMAP\nProfilingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,30:1\n103#2,6:31\n109#2,5:58\n103#2,6:63\n109#2,5:90\n103#2,6:95\n109#2,5:122\n103#2,6:127\n109#2,5:154\n103#2,6:159\n109#2,5:186\n103#2,6:191\n109#2,5:218\n201#3,6:37\n207#3:57\n201#3,6:69\n207#3:89\n201#3,6:101\n207#3:121\n201#3,6:133\n207#3:153\n201#3,6:165\n207#3:185\n201#3,6:197\n207#3:217\n105#4,14:43\n105#4,14:75\n105#4,14:107\n105#4,14:139\n105#4,14:171\n105#4,14:203\n*S KotlinDebug\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1\n*L\n14#1:31,6\n14#1:58,5\n15#1:63,6\n15#1:90,5\n16#1:95,6\n16#1:122,5\n17#1:127,6\n17#1:154,5\n18#1:159,6\n18#1:186,5\n20#1:191,6\n20#1:218,5\n14#1:37,6\n14#1:57\n15#1:69,6\n15#1:89\n16#1:101,6\n16#1:121\n17#1:133,6\n17#1:153\n18#1:165,6\n18#1:185\n20#1:197,6\n20#1:217\n14#1:43,14\n15#1:75,14\n16#1:107,14\n17#1:139,14\n18#1:171,14\n20#1:203,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34249p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            q1 q1Var = q1.f34330p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(ProfilingMemoryDataSource.class), null, q1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            r1 r1Var = r1.f34335p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ProfilingLocalDataSource.class), null, r1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            s1 s1Var = s1.f34339p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NetworkProfilingDataSource.class), null, s1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            t1 t1Var = t1.f34343p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ProfilingRepository.class), null, t1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            u1 u1Var = u1.f34347p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SyncProfilingUseCase.class), null, u1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            v1 v1Var = v1.f34351p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ProfilingFeatureFlagsHandler.class), null, v1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getProfilingModule() {
        return f34248a;
    }
}
