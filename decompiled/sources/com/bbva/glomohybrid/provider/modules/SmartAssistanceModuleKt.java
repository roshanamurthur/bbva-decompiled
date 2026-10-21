package com.bbva.glomohybrid.provider.modules;

import com.bbva.smartassistance.SmartAssistanceController;
import com.bbva.smartassistance.listeners.CustomBaseConversation;
import com.bbva.smartassistance.listeners.CustomBaseConversationListener;
import com.bbva.smartassistance.listeners.CustomBaseSessionListener;
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

/* JADX INFO: compiled from: SmartAssistanceModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getSmartAssistanceModule", "()Lorg/koin/core/module/Module;", "smartAssistanceModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class SmartAssistanceModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34256a = ModuleDSLKt.module$default(false, a.f34257p0, 1, null);

    /* JADX INFO: compiled from: SmartAssistanceModule.kt */
    @SourceDebugExtension({"SMAP\nSmartAssistanceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartAssistanceModule.kt\ncom/bbva/glomohybrid/provider/modules/SmartAssistanceModuleKt$smartAssistanceModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,16:1\n103#2,6:17\n109#2,5:44\n103#2,6:49\n109#2,5:76\n103#2,6:81\n109#2,5:108\n103#2,6:113\n109#2,5:140\n201#3,6:23\n207#3:43\n201#3,6:55\n207#3:75\n201#3,6:87\n207#3:107\n201#3,6:119\n207#3:139\n105#4,14:29\n105#4,14:61\n105#4,14:93\n105#4,14:125\n*S KotlinDebug\n*F\n+ 1 SmartAssistanceModule.kt\ncom/bbva/glomohybrid/provider/modules/SmartAssistanceModuleKt$smartAssistanceModule$1\n*L\n11#1:17,6\n11#1:44,5\n12#1:49,6\n12#1:76,5\n13#1:81,6\n13#1:108,5\n14#1:113,6\n14#1:140,5\n11#1:23,6\n11#1:43\n12#1:55,6\n12#1:75\n13#1:87,6\n13#1:107\n14#1:119,6\n14#1:139\n11#1:29,14\n12#1:61,14\n13#1:93,14\n14#1:125,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34257p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            d2 d2Var = d2.f34277p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(CustomBaseConversation.class), null, d2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            e2 e2Var = e2.f34281p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomBaseConversationListener.class), null, e2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            f2 f2Var = f2.f34287p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomBaseSessionListener.class), null, f2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            g2 g2Var = g2.f34291p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SmartAssistanceController.class), null, g2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getSmartAssistanceModule() {
        return f34256a;
    }
}
