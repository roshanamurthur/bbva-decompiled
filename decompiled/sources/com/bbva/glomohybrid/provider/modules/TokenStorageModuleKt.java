package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.observers.SessionStorageTokenObserver;
import com.bbva.session.domain.observers.SessionTokenObserver;
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
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: TokenStorageModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getTokenStorageModule", "()Lorg/koin/core/module/Module;", "tokenStorageModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class TokenStorageModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34258a = ModuleDSLKt.module$default(false, a.f34259p0, 1, null);

    /* JADX INFO: compiled from: TokenStorageModule.kt */
    @SourceDebugExtension({"SMAP\nTokenStorageModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenStorageModule.kt\ncom/bbva/glomohybrid/provider/modules/TokenStorageModuleKt$tokenStorageModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,13:1\n147#2,14:14\n161#2,2:44\n216#3:28\n217#3:43\n105#4,14:29\n*S KotlinDebug\n*F\n+ 1 TokenStorageModule.kt\ncom/bbva/glomohybrid/provider/modules/TokenStorageModuleKt$tokenStorageModule$1\n*L\n9#1:14,14\n9#1:44,2\n9#1:28\n9#1:43\n9#1:29,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34259p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            h2 h2Var = h2.f34295p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SessionStorageTokenObserver.class), null, h2Var, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(SessionTokenObserver.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getTokenStorageModule() {
        return f34258a;
    }
}
