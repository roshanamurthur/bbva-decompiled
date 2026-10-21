package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.glomohybrid.login.data.repository.LegacyDataSource;
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
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: LegacyDataModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getLegacyDataModule", "()Lorg/koin/core/module/Module;", "legacyDataModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class LegacyDataModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34241a = ModuleDSLKt.module$default(false, a.f34242p0, 1, null);

    /* JADX INFO: compiled from: LegacyDataModule.kt */
    @SourceDebugExtension({"SMAP\nLegacyDataModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyDataModule.kt\ncom/bbva/glomohybrid/provider/modules/LegacyDataModuleKt$legacyDataModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,15:1\n103#2,6:16\n109#2,5:43\n201#3,6:22\n207#3:42\n105#4,14:28\n*S KotlinDebug\n*F\n+ 1 LegacyDataModule.kt\ncom/bbva/glomohybrid/provider/modules/LegacyDataModuleKt$legacyDataModule$1\n*L\n11#1:16,6\n11#1:43,5\n11#1:22,6\n11#1:42\n11#1:28,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34242p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            f1 f1Var = f1.f34286p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LegacyDataSource.class), null, f1Var, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(UserDataStore.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getLegacyDataModule() {
        return f34241a;
    }
}
