package com.bbva.glomohybrid.provider.module;

import com.bbva.notifications.handlers.GlomoPushHandler;
import com.bbva.push.executor.PushExecutor;
import com.bbva.push.firebase.FirebasePushExecutor;
import com.bbva.push.firebase.FirebasePushSource;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.source.PushSource;
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

/* JADX INFO: compiled from: PushesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getPushesModule", "()Lorg/koin/core/module/Module;", "pushesModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class PushesModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33991a = ModuleDSLKt.module$default(false, a.f33992p0, 1, null);

    /* JADX INFO: compiled from: PushesModule.kt */
    @SourceDebugExtension({"SMAP\nPushesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushesModule.kt\ncom/bbva/glomohybrid/provider/module/PushesModuleKt$pushesModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,25:1\n103#2,6:26\n109#2,5:53\n103#2,6:58\n109#2,5:85\n103#2,6:90\n109#2,5:117\n201#3,6:32\n207#3:52\n201#3,6:64\n207#3:84\n201#3,6:96\n207#3:116\n105#4,14:38\n105#4,14:70\n105#4,14:102\n*S KotlinDebug\n*F\n+ 1 PushesModule.kt\ncom/bbva/glomohybrid/provider/module/PushesModuleKt$pushesModule$1\n*L\n13#1:26,6\n13#1:53,5\n17#1:58,6\n17#1:85,5\n21#1:90,6\n21#1:117,5\n13#1:32,6\n13#1:52\n17#1:64,6\n17#1:84\n21#1:96,6\n21#1:116\n13#1:38,14\n17#1:70,14\n21#1:102,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33992p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            z6 z6Var = z6.f34221p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(GlomoPushHandler.class), null, z6Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(PushHandler.class));
            a7 a7Var = a7.f34008p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FirebasePushExecutor.class), null, a7Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(PushExecutor.class));
            b7 b7Var = b7.f34017p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FirebasePushSource.class), null, b7Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF3), Reflection.getOrCreateKotlinClass(PushSource.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getPushesModule() {
        return f33991a;
    }
}
