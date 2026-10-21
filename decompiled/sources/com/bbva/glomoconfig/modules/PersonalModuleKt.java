package com.bbva.glomoconfig.modules;

import androidx.appcompat.view.menu.b;
import com.bbva.glomoconfig.consumerid.ConsumerIdSelector;
import com.bbva.glomoconfig.consumerid.ConsumerIdSelectorKt;
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

/* JADX INFO: compiled from: PersonalModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getPersonalModule", "Lorg/koin/core/module/Module;", "personalSuffix", "", "gl-config_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PersonalModuleKt {

    /* JADX INFO: compiled from: PersonalModule.kt */
    @SourceDebugExtension({"SMAP\nPersonalModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalModule.kt\ncom/bbva/glomoconfig/modules/PersonalModuleKt$getPersonalModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,13:1\n103#2,6:14\n109#2,5:41\n201#3,6:20\n207#3:40\n105#4,14:26\n*S KotlinDebug\n*F\n+ 1 PersonalModule.kt\ncom/bbva/glomoconfig/modules/PersonalModuleKt$getPersonalModule$1\n*L\n9#1:14,6\n9#1:41,5\n9#1:20,6\n9#1:40\n9#1:26,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f30955p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f30955p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            StringQualifier stringQualifierConsumerIdNamed = ConsumerIdSelectorKt.consumerIdNamed(this.f30955p0);
            com.bbva.glomoconfig.modules.a aVar = com.bbva.glomoconfig.modules.a.f30956p0;
            SingleInstanceFactory<?> singleInstanceFactoryF = b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ConsumerIdSelector.class), stringQualifierConsumerIdNamed, aVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getPersonalModule(@NotNull String personalSuffix) {
        Intrinsics.checkNotNullParameter(personalSuffix, "personalSuffix");
        return ModuleDSLKt.module$default(false, new a(personalSuffix), 1, null);
    }
}
