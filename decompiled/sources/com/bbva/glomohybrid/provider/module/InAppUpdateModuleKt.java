package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase;
import com.bbva.glomohybrid.base.inappupdate.usecase.InstallFlexibleUpdateUseCase;
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

/* JADX INFO: compiled from: InAppUpdateModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getInAppUpdateModule", "()Lorg/koin/core/module/Module;", "inAppUpdateModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class InAppUpdateModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33966a = ModuleDSLKt.module$default(false, a.f33967p0, 1, null);

    /* JADX INFO: compiled from: InAppUpdateModule.kt */
    @SourceDebugExtension({"SMAP\nInAppUpdateModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppUpdateModule.kt\ncom/bbva/glomohybrid/provider/module/InAppUpdateModuleKt$inAppUpdateModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,25:1\n103#2,6:26\n109#2,5:53\n147#2,14:58\n161#2,2:88\n147#2,14:90\n161#2,2:120\n201#3,6:32\n207#3:52\n216#3:72\n217#3:87\n216#3:104\n217#3:119\n105#4,14:38\n105#4,14:73\n105#4,14:105\n*S KotlinDebug\n*F\n+ 1 InAppUpdateModule.kt\ncom/bbva/glomohybrid/provider/module/InAppUpdateModuleKt$inAppUpdateModule$1\n*L\n13#1:26,6\n13#1:53,5\n17#1:58,14\n17#1:88,2\n21#1:90,14\n21#1:120,2\n13#1:32,6\n13#1:52\n17#1:72\n17#1:87\n21#1:104\n21#1:119\n13#1:38,14\n17#1:73,14\n21#1:105,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33967p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            f3 f3Var = f3.f34049p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InAppUpdatesHandler.class), null, f3Var, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            g3 g3Var = g3.f34058p0;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(InstallFlexibleUpdateUseCase.class), null, g3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            h3 h3Var = h3.f34067p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CheckForFlexibleUpdateUseCase.class), null, h3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getInAppUpdateModule() {
        return f33966a;
    }
}
