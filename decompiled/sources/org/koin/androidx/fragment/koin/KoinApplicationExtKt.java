package org.koin.androidx.fragment.koin;

import androidx.appcompat.view.menu.b;
import androidx.fragment.app.FragmentFactory;
import bk.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: KoinApplicationExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "fragmentFactory", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class KoinApplicationExtKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f92130a = ModuleDSLKt.module$default(false, a.f92131p0, 1, null);

    /* JADX INFO: compiled from: KoinApplicationExt.kt */
    @SourceDebugExtension({"SMAP\nKoinApplicationExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinApplicationExt.kt\norg/koin/androidx/fragment/koin/KoinApplicationExtKt$fragmentFactoryModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,34:1\n103#2,6:35\n109#2,5:62\n201#3,6:41\n207#3:61\n105#4,14:47\n*S KotlinDebug\n*F\n+ 1 KoinApplicationExt.kt\norg/koin/androidx/fragment/koin/KoinApplicationExtKt$fragmentFactoryModule$1\n*L\n25#1:35,6\n25#1:62,5\n25#1:41,6\n25#1:61\n25#1:47,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f92131p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            org.koin.androidx.fragment.koin.a aVar = org.koin.androidx.fragment.koin.a.f92132p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FragmentFactory.class), null, aVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    public static final void fragmentFactory(@NotNull KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Koin.loadModules$default(koinApplication.getKoin(), d.listOf(f92130a), false, 2, null);
    }
}
