package com.bbva.glomohybrid.provider.module;

import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.glomohybrid.featureflags.FeatureFlagsMenuObserver;
import com.bbva.glomohybrid.featureflags.FeatureFlagsWebObserver;
import com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsNativeObserver;
import com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver;
import com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.featureflags.repository.datasource.LocalDataSource;
import com.bbva.glomohybrid.featureflags.repository.datasource.MemoryDatasource;
import com.bbva.glomohybrid.featureflags.repository.datasource.NetworkDataSource;
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

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getFeatureFlagsModule", "()Lorg/koin/core/module/Module;", "featureFlagsModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class FeatureFlagsModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33964a = ModuleDSLKt.module$default(false, a.f33965p0, 1, null);

    /* JADX INFO: compiled from: FeatureFlagsModule.kt */
    @SourceDebugExtension({"SMAP\nFeatureFlagsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,48:1\n103#2,6:49\n109#2,5:76\n103#2,6:81\n109#2,5:108\n103#2,6:113\n109#2,5:140\n103#2,6:145\n109#2,5:172\n103#2,6:177\n109#2,5:204\n147#2,14:209\n161#2,2:239\n147#2,14:241\n161#2,2:271\n103#2,6:273\n109#2,5:300\n147#2,14:305\n161#2,2:335\n201#3,6:55\n207#3:75\n201#3,6:87\n207#3:107\n201#3,6:119\n207#3:139\n201#3,6:151\n207#3:171\n201#3,6:183\n207#3:203\n216#3:223\n217#3:238\n216#3:255\n217#3:270\n201#3,6:279\n207#3:299\n216#3:319\n217#3:334\n105#4,14:61\n105#4,14:93\n105#4,14:125\n105#4,14:157\n105#4,14:189\n105#4,14:224\n105#4,14:256\n105#4,14:285\n105#4,14:320\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1\n*L\n22#1:49,6\n22#1:76,5\n23#1:81,6\n23#1:108,5\n24#1:113,6\n24#1:140,5\n25#1:145,6\n25#1:172,5\n30#1:177,6\n30#1:204,5\n32#1:209,14\n32#1:239,2\n36#1:241,14\n36#1:271,2\n40#1:273,6\n40#1:300,5\n44#1:305,14\n44#1:335,2\n22#1:55,6\n22#1:75\n23#1:87,6\n23#1:107\n24#1:119,6\n24#1:139\n25#1:151,6\n25#1:171\n30#1:183,6\n30#1:203\n32#1:223\n32#1:238\n36#1:255\n36#1:270\n40#1:279,6\n40#1:299\n44#1:319\n44#1:334\n22#1:61,14\n23#1:93,14\n24#1:125,14\n25#1:157,14\n30#1:189,14\n32#1:224,14\n36#1:256,14\n40#1:285,14\n44#1:320,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33965p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            w2 w2Var = w2.f34193p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(MemoryDatasource.class), null, w2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            x2 x2Var = x2.f34201p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LocalDataSource.class), null, x2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            y2 y2Var = y2.f34209p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NetworkDataSource.class), null, y2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            z2 z2Var = z2.f34217p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, z2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            a3 a3Var = a3.f34004p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SyncFeatureFlagsUseCase.class), null, a3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            b3 b3Var = b3.f34013p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(FeatureFlagsMenuObserver.class), null, b3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(FeatureFlagsObserver.class));
            c3 c3Var = c3.f34022p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FeatureFlagsWebObserver.class), null, c3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(FeatureFlagsObserver.class));
            d3 d3Var = d3.f34031p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FeatureFlagManager.class), null, d3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF6), Reflection.getOrCreateKotlinClass(FeatureFlagManager.class));
            e3 e3Var = e3.f34040p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FeatureFlagsNativeObserver.class), null, e3Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(FeatureFlagsObserver.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getFeatureFlagsModule() {
        return f33964a;
    }
}
