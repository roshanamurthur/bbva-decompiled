package com.bbva.glomohybrid.provider.module;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.plugin.params.FileSystemConfig;
import com.bbva.glomohybrid.documents.plugin.UriExporter;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: ActionLauncherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "FILE_AUTHORITIES", "Ljava/lang/String;", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getActionLauncherModule", "()Lorg/koin/core/module/Module;", "actionLauncherModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class ActionLauncherModuleKt {

    @NotNull
    public static final String FILE_AUTHORITIES = "file_authorities";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33935a = ModuleDSLKt.module$default(false, a.f33936p0, 1, null);

    /* JADX INFO: compiled from: ActionLauncherModule.kt */
    @SourceDebugExtension({"SMAP\nActionLauncherModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionLauncherModule.kt\ncom/bbva/glomohybrid/provider/module/ActionLauncherModuleKt$actionLauncherModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,48:1\n103#2,6:49\n109#2,5:76\n103#2,6:81\n109#2,5:108\n147#2,14:113\n161#2,2:143\n147#2,14:145\n161#2,2:175\n201#3,6:55\n207#3:75\n201#3,6:87\n207#3:107\n216#3:127\n217#3:142\n216#3:159\n217#3:174\n105#4,14:61\n105#4,14:93\n105#4,14:128\n105#4,14:160\n*S KotlinDebug\n*F\n+ 1 ActionLauncherModule.kt\ncom/bbva/glomohybrid/provider/module/ActionLauncherModuleKt$actionLauncherModule$1\n*L\n17#1:49,6\n17#1:76,5\n19#1:81,6\n19#1:108,5\n29#1:113,14\n29#1:143,2\n36#1:145,14\n36#1:175,2\n17#1:55,6\n17#1:75\n19#1:87,6\n19#1:107\n29#1:127\n29#1:142\n36#1:159\n36#1:174\n17#1:61,14\n19#1:93,14\n29#1:128,14\n36#1:160,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33936p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            StringQualifier stringQualifierNamed = QualifierKt.named(ActionLauncherModuleKt.FILE_AUTHORITIES);
            com.bbva.glomohybrid.provider.module.a aVar = com.bbva.glomohybrid.provider.module.a.f34000p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, aVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            b bVar = b.f34009p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ActionLauncher.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            c cVar = c.f34018p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(FileSystemConfig.class), null, cVar, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            d dVar = d.f34027p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UriExporter.class), null, dVar, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getActionLauncherModule() {
        return f33935a;
    }
}
