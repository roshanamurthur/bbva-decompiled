package com.bbva.notifications.provider;

import com.bbva.notifications.mapper.SalesforceDeeplinkInfoMapper;
import com.bbva.push.salesforce.SalesforcePushHandler;
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

/* JADX INFO: compiled from: SalesforcePushModule.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getSalesforcePushModule", "()Lorg/koin/core/module/Module;", "salesforcePushModule", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class SalesforcePushModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f35443a = ModuleDSLKt.module$default(false, a.f35444p0, 1, null);

    /* JADX INFO: compiled from: SalesforcePushModule.kt */
    @SourceDebugExtension({"SMAP\nSalesforcePushModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesforcePushModule.kt\ncom/bbva/notifications/provider/SalesforcePushModuleKt$salesforcePushModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,18:1\n103#2,6:19\n109#2,5:46\n103#2,6:51\n109#2,5:78\n201#3,6:25\n207#3:45\n201#3,6:57\n207#3:77\n105#4,14:31\n105#4,14:63\n*S KotlinDebug\n*F\n+ 1 SalesforcePushModule.kt\ncom/bbva/notifications/provider/SalesforcePushModuleKt$salesforcePushModule$1\n*L\n12#1:19,6\n12#1:46,5\n14#1:51,6\n14#1:78,5\n12#1:25,6\n12#1:45\n14#1:57,6\n14#1:77\n12#1:31,14\n14#1:63,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35444p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.notifications.provider.a aVar = com.bbva.notifications.provider.a.f35445p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SalesforceDeeplinkInfoMapper.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            b bVar = b.f35446p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SalesforcePushHandler.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(SalesforcePushHandler.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getSalesforcePushModule() {
        return f35443a;
    }
}
