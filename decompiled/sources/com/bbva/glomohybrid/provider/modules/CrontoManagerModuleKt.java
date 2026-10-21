package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.glomohybrid.crontoToken.CrontoTokenDataStore;
import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
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

/* JADX INFO: compiled from: CrontoManagerModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getCrontoManagerModule", "()Lorg/koin/core/module/Module;", "crontoManagerModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class CrontoManagerModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34232a = ModuleDSLKt.module$default(false, a.f34233p0, 1, null);

    /* JADX INFO: compiled from: CrontoManagerModule.kt */
    @SourceDebugExtension({"SMAP\nCrontoManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrontoManagerModule.kt\ncom/bbva/glomohybrid/provider/modules/CrontoManagerModuleKt$crontoManagerModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,14:1\n103#2,6:15\n109#2,5:42\n103#2,6:47\n109#2,5:74\n201#3,6:21\n207#3:41\n201#3,6:53\n207#3:73\n105#4,14:27\n105#4,14:59\n*S KotlinDebug\n*F\n+ 1 CrontoManagerModule.kt\ncom/bbva/glomohybrid/provider/modules/CrontoManagerModuleKt$crontoManagerModule$1\n*L\n11#1:15,6\n11#1:42,5\n12#1:47,6\n12#1:74,5\n11#1:21,6\n11#1:41\n12#1:53,6\n12#1:73\n11#1:27,14\n12#1:59,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34233p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            e0 e0Var = e0.f34279p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DigipassManagerHelper.class), null, e0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            f0 f0Var = f0.f34285p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CrontoTokenDataStore.class), null, f0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(UserDataStore.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getCrontoManagerModule() {
        return f34232a;
    }
}
