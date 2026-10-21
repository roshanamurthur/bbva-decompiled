package com.bbva.firebase.analytics.module;

import androidx.appcompat.view.menu.b;
import com.bbva.firebase.analytics.FirebaseAnalyticsManager;
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
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: FirebaseAnalyticsModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getFirebaseAnalyticsModule", "()Lorg/koin/core/module/Module;", "firebaseAnalyticsModule", "component-dm-firebase-analytics_release"}, k = 2, mv = {1, 9, 0})
public final class FirebaseAnalyticsModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f30671a = ModuleDSLKt.module$default(false, a.f30672p0, 1, null);

    /* JADX INFO: compiled from: FirebaseAnalyticsModule.kt */
    @SourceDebugExtension({"SMAP\nFirebaseAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseAnalyticsModule.kt\ncom/bbva/firebase/analytics/module/FirebaseAnalyticsModuleKt$firebaseAnalyticsModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,14:1\n103#2,6:15\n109#2,5:42\n201#3,6:21\n207#3:41\n105#4,14:27\n*S KotlinDebug\n*F\n+ 1 FirebaseAnalyticsModule.kt\ncom/bbva/firebase/analytics/module/FirebaseAnalyticsModuleKt$firebaseAnalyticsModule$1\n*L\n10#1:15,6\n10#1:42,5\n10#1:21,6\n10#1:41\n10#1:27,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f30672p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.firebase.analytics.module.a aVar = com.bbva.firebase.analytics.module.a.f30673p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FirebaseAnalyticsManager.class), null, aVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getFirebaseAnalyticsModule() {
        return f30671a;
    }
}
