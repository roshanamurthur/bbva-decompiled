package com.bbva.glomohybrid.infoscreen.root;

import androidx.appcompat.app.i;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: RootModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getRootModule", "()Lorg/koin/core/module/Module;", "rootModule", "info-modal_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class RootModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f32458a = ModuleDSLKt.module$default(false, a.f32459p0, 1, null);

    /* JADX INFO: compiled from: RootModule.kt */
    @SourceDebugExtension({"SMAP\nRootModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootModule.kt\ncom/bbva/glomohybrid/infoscreen/root/RootModuleKt$rootModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,15:1\n151#2,10:16\n161#2,2:42\n151#2,10:44\n161#2,2:70\n216#3:26\n217#3:41\n216#3:54\n217#3:69\n105#4,14:27\n105#4,14:55\n*S KotlinDebug\n*F\n+ 1 RootModule.kt\ncom/bbva/glomohybrid/infoscreen/root/RootModuleKt$rootModule$1\n*L\n8#1:16,10\n8#1:42,2\n11#1:44,10\n11#1:70,2\n8#1:26\n8#1:41\n11#1:54\n11#1:69\n8#1:27,14\n11#1:55,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32459p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            String name = InfoScreenType.RootNotRestrictedScreen.INSTANCE.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            StringQualifier stringQualifierNamed = QualifierKt.named(name);
            com.bbva.glomohybrid.infoscreen.root.a aVar = com.bbva.glomohybrid.infoscreen.root.a.f32460p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(RootFragment.class), stringQualifierNamed, aVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            String name2 = InfoScreenType.RootRestrictedScreen.INSTANCE.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            StringQualifier stringQualifierNamed2 = QualifierKt.named(name2);
            b bVar = b.f32461p0;
            new KoinDefinition(module2, i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RootFragment.class), stringQualifierNamed2, bVar, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getRootModule() {
        return f32458a;
    }
}
