package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.glomohybrid.base.delegates.glomo.features.ActiveUserFeaturesDelegate;
import com.bbva.glomohybrid.base.delegates.glomo.features.DefaultActiveUserFeatureDelegate;
import com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature;
import com.bbva.glomohybrid.glomo.features.FidoFeature;
import com.bbva.glomohybrid.glomo.features.MobilePaymentFeature;
import com.bbva.glomohybrid.glomo.features.SofttokenFeature;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: GlomoFeaturesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getGlomoFeaturesModule", "()Lorg/koin/core/module/Module;", "glomoFeaturesModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlomoFeaturesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlomoFeaturesModule.kt\ncom/bbva/glomohybrid/provider/modules/GlomoFeaturesModuleKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,26:1\n129#2,5:27\n*S KotlinDebug\n*F\n+ 1 GlomoFeaturesModule.kt\ncom/bbva/glomohybrid/provider/modules/GlomoFeaturesModuleKt\n*L\n18#1:27,5\n*E\n"})
public final class GlomoFeaturesModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34237a = ModuleDSLKt.module$default(false, a.f34238p0, 1, null);

    /* JADX INFO: compiled from: GlomoFeaturesModule.kt */
    @SourceDebugExtension({"SMAP\nGlomoFeaturesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlomoFeaturesModule.kt\ncom/bbva/glomohybrid/provider/modules/GlomoFeaturesModuleKt$glomoFeaturesModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,26:1\n147#2,14:27\n161#2,2:57\n216#3:41\n217#3:56\n105#4,14:42\n*S KotlinDebug\n*F\n+ 1 GlomoFeaturesModule.kt\ncom/bbva/glomohybrid/provider/modules/GlomoFeaturesModuleKt$glomoFeaturesModule$1\n*L\n13#1:27,14\n13#1:57,2\n13#1:41\n13#1:56\n13#1:42,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34238p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            k0 k0Var = k0.f34305p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ActiveUserFeaturesDelegate.class), null, k0Var, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    public static final ActiveUserFeaturesDelegate access$createActiveUserFeaturesDelegate(Scope scope) {
        return new DefaultActiveUserFeatureDelegate(CollectionsKt__CollectionsKt.listOf((Object[]) new GlomoFeature[]{new SofttokenFeature(ModuleExtKt.androidContext(scope)), new FidoFeature(ModuleExtKt.androidContext(scope), (BiometricDatasource) scope.get(Reflection.getOrCreateKotlinClass(BiometricDatasource.class), null, null)), new MobilePaymentFeature(ModuleExtKt.androidContext(scope))}));
    }

    @NotNull
    public static final Module getGlomoFeaturesModule() {
        return f34237a;
    }
}
