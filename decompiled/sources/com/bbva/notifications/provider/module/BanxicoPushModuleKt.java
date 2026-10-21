package com.bbva.notifications.provider.module;

import com.bbva.notifications.delegate.BanxicoUnifiedLogEventDelegate;
import com.bbva.notifications.delegate.LogEventDelegate;
import com.bbva.notifications.handlers.BanxicoPushHandler;
import com.bbva.push.firebase.ManualFirebasePushHandler;
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

/* JADX INFO: compiled from: BanxicoPushModule.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getBanxicoPushModule", "()Lorg/koin/core/module/Module;", "banxicoPushModule", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class BanxicoPushModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f35447a = ModuleDSLKt.module$default(false, a.f35448p0, 1, null);

    /* JADX INFO: compiled from: BanxicoPushModule.kt */
    @SourceDebugExtension({"SMAP\nBanxicoPushModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BanxicoPushModule.kt\ncom/bbva/notifications/provider/module/BanxicoPushModuleKt$banxicoPushModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,34:1\n103#2,6:35\n109#2,5:62\n103#2,6:67\n109#2,5:94\n201#3,6:41\n207#3:61\n201#3,6:73\n207#3:93\n105#4,14:47\n105#4,14:79\n*S KotlinDebug\n*F\n+ 1 BanxicoPushModule.kt\ncom/bbva/notifications/provider/module/BanxicoPushModuleKt$banxicoPushModule$1\n*L\n15#1:35,6\n15#1:62,5\n30#1:67,6\n30#1:94,5\n15#1:41,6\n15#1:61\n30#1:73,6\n30#1:93\n15#1:47,14\n30#1:79,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35448p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.notifications.provider.module.a aVar = com.bbva.notifications.provider.module.a.f35453p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(BanxicoPushHandler.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(ManualFirebasePushHandler.class));
            b bVar = b.f35454p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BanxicoUnifiedLogEventDelegate.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(LogEventDelegate.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getBanxicoPushModule() {
        return f35447a;
    }
}
