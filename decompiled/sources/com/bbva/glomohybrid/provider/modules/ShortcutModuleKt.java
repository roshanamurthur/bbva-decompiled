package com.bbva.glomohybrid.provider.modules;

import com.bbva.appsflyer.AppsFlyerController;
import com.bbva.glomohybrid.base.behaviors.AppShortcutsCreator;
import com.bbva.glomohybrid.base.behaviors.HandlerShortcutBehaviour;
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
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: ShortcutModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getShortcutModule", "()Lorg/koin/core/module/Module;", "shortcutModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShortcutModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,36:1\n129#2,5:37\n*S KotlinDebug\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt\n*L\n34#1:37,5\n*E\n"})
public final class ShortcutModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34254a = ModuleDSLKt.module$default(false, a.f34255p0, 1, null);

    /* JADX INFO: compiled from: ShortcutModule.kt */
    @SourceDebugExtension({"SMAP\nShortcutModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt$shortcutModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,36:1\n147#2,14:37\n161#2,2:67\n147#2,14:69\n161#2,2:99\n147#2,14:101\n161#2,2:131\n216#3:51\n217#3:66\n216#3:83\n217#3:98\n216#3:115\n217#3:130\n105#4,14:52\n105#4,14:84\n105#4,14:116\n*S KotlinDebug\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt$shortcutModule$1\n*L\n18#1:37,14\n18#1:67,2\n26#1:69,14\n26#1:99,2\n28#1:101,14\n28#1:131,2\n18#1:51\n18#1:66\n26#1:83\n26#1:98\n28#1:115\n28#1:130\n18#1:52,14\n26#1:84,14\n28#1:116,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34255p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            a2 a2Var = a2.f34265p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(AppShortcutsCreator.class), null, a2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            b2 b2Var = b2.f34269p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HandlerShortcutBehaviour.class), null, b2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            c2 c2Var = c2.f34273p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AppsFlyerController.class), null, c2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getShortcutModule() {
        return f34254a;
    }
}
