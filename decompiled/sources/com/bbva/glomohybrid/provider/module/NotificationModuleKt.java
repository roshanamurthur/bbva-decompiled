package com.bbva.glomohybrid.provider.module;

import com.bbva.notifications.model.NotificationsProviderConfig;
import com.bbva.notifications.provider.NotificationsProvider;
import com.bbva.notifications.viewmodel.NotificationViewModel;
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

/* JADX INFO: compiled from: NotificationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getNotificationModule", "()Lorg/koin/core/module/Module;", "notificationModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class NotificationModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33981a = ModuleDSLKt.module$default(false, a.f33982p0, 1, null);

    /* JADX INFO: compiled from: NotificationModule.kt */
    @SourceDebugExtension({"SMAP\nNotificationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationModule.kt\ncom/bbva/glomohybrid/provider/module/NotificationModuleKt$notificationModule$1\n+ 2 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt\n+ 3 Module.kt\norg/koin/core/module/Module\n+ 4 Module.kt\norg/koin/core/module/ModuleKt\n+ 5 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,32:1\n35#2,5:33\n151#3,10:38\n161#3,2:64\n103#3,6:66\n109#3,5:93\n103#3,6:98\n109#3,5:125\n216#4:48\n217#4:63\n201#4,6:72\n207#4:92\n201#4,6:104\n207#4:124\n105#5,14:49\n105#5,14:78\n105#5,14:110\n*S KotlinDebug\n*F\n+ 1 NotificationModule.kt\ncom/bbva/glomohybrid/provider/module/NotificationModuleKt$notificationModule$1\n*L\n14#1:33,5\n14#1:38,10\n14#1:64,2\n19#1:66,6\n19#1:93,5\n28#1:98,6\n28#1:125,5\n14#1:48\n14#1:63\n19#1:72,6\n19#1:92\n28#1:104,6\n28#1:124\n14#1:49,14\n19#1:78,14\n28#1:110,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33982p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            f5 f5Var = f5.f34051p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NotificationViewModel.class), null, f5Var, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2));
            g5 g5Var = g5.f34060p0;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(NotificationsProviderConfig.class), null, g5Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            h5 h5Var = h5.f34069p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NotificationsProvider.class), null, h5Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getNotificationModule() {
        return f33981a;
    }
}
