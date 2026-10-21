package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver;
import com.bbva.glomohybrid.settings.NetworkSpeedAppSettingsObserver;
import com.bbva.glomohybrid.settings.TermsAppSettingsObserver;
import com.bbva.glomohybrid.settings.WebAppSettingsObserver;
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
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: AppSettingsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getAppSettingsModule", "()Lorg/koin/core/module/Module;", "appSettingsModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class AppSettingsModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33939a = ModuleDSLKt.module$default(false, a.f33940p0, 1, null);

    /* JADX INFO: compiled from: AppSettingsModule.kt */
    @SourceDebugExtension({"SMAP\nAppSettingsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsModule.kt\ncom/bbva/glomohybrid/provider/module/AppSettingsModuleKt$appSettingsModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,26:1\n147#2,14:27\n161#2,2:57\n147#2,14:59\n161#2,2:89\n147#2,14:91\n161#2,2:121\n216#3:41\n217#3:56\n216#3:73\n217#3:88\n216#3:105\n217#3:120\n105#4,14:42\n105#4,14:74\n105#4,14:106\n*S KotlinDebug\n*F\n+ 1 AppSettingsModule.kt\ncom/bbva/glomohybrid/provider/module/AppSettingsModuleKt$appSettingsModule$1\n*L\n14#1:27,14\n14#1:57,2\n18#1:59,14\n18#1:89,2\n22#1:91,14\n22#1:121,2\n14#1:41\n14#1:56\n18#1:73\n18#1:88\n22#1:105\n22#1:120\n14#1:42,14\n18#1:74,14\n22#1:106,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33940p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            j jVar = j.f34081p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(TermsAppSettingsObserver.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(AppSettingsObserver.class));
            k kVar = k.f34090p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WebAppSettingsObserver.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(AppSettingsObserver.class));
            l lVar = l.f34099p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NetworkSpeedAppSettingsObserver.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(AppSettingsObserver.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getAppSettingsModule() {
        return f33939a;
    }
}
