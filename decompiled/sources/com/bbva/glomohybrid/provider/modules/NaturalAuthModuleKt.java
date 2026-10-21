package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.component.dm.biometriclogin.domain.handler.BiometricMigratorHandler;
import com.bbva.component.dm.biometriclogin.domain.provider.BiometricsAdapter;
import com.bbva.component.dm.biometriclogin.proxy.NaturalAuthenticationClientProxy;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationPlugin;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000e\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "a", "Lorg/koin/core/qualifier/StringQualifier;", "getFACETS_URL", "()Lorg/koin/core/qualifier/StringQualifier;", "FACETS_URL", "Lorg/koin/core/module/Module;", "b", "Lorg/koin/core/module/Module;", "getNaturalAuthModule", "()Lorg/koin/core/module/Module;", "naturalAuthModule", "c", "getBiometricAuthenticationModule", "biometricAuthenticationModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class NaturalAuthModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StringQualifier f34243a = QualifierKt.named("facetsUrl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Module f34244b = ModuleDSLKt.module$default(false, b.f34247p0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Module f34245c = ModuleDSLKt.module$default(false, a.f34246p0, 1, null);

    /* JADX INFO: compiled from: NaturalAuthModule.kt */
    @SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,98:1\n103#2,6:99\n109#2,5:126\n103#2,6:131\n109#2,5:158\n103#2,6:163\n109#2,5:190\n103#2,6:195\n109#2,5:222\n103#2,6:227\n109#2,5:254\n103#2,6:259\n109#2,5:286\n201#3,6:105\n207#3:125\n201#3,6:137\n207#3:157\n201#3,6:169\n207#3:189\n201#3,6:201\n207#3:221\n201#3,6:233\n207#3:253\n201#3,6:265\n207#3:285\n105#4,14:111\n105#4,14:143\n105#4,14:175\n105#4,14:207\n105#4,14:239\n105#4,14:271\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1\n*L\n68#1:99,6\n68#1:126,5\n79#1:131,6\n79#1:158,5\n84#1:163,6\n84#1:190,5\n88#1:195,6\n88#1:222,5\n92#1:227,6\n92#1:254,5\n94#1:259,6\n94#1:286,5\n68#1:105,6\n68#1:125\n79#1:137,6\n79#1:157\n84#1:169,6\n84#1:189\n88#1:201,6\n88#1:221\n92#1:233,6\n92#1:253\n94#1:265,6\n94#1:285\n68#1:111,14\n79#1:143,14\n84#1:175,14\n88#1:207,14\n92#1:239,14\n94#1:271,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34246p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            g1 g1Var = g1.f34290p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(NaturalAuthenticationClientProxy.class), null, g1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            h1 h1Var = h1.f34294p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FidoSettingsAdapter.class), null, h1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            i1 i1Var = i1.f34298p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BiometricMigratorHandler.class), null, i1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            j1 j1Var = j1.f34302p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BiometricDatasource.class), null, j1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            new KoinDefinition(module2, singleInstanceFactoryF4);
            k1 k1Var = k1.f34306p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BiometricsAdapter.class), null, k1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            new KoinDefinition(module2, singleInstanceFactoryF5);
            l1 l1Var = l1.f34310p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BiometricAuthenticationDataManager.class), null, l1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            new KoinDefinition(module2, singleInstanceFactoryF6);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NaturalAuthModule.kt */
    @SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,98:1\n151#2,10:99\n161#2,2:125\n103#2,6:127\n109#2,5:154\n103#2,6:159\n109#2,5:186\n147#2,14:191\n161#2,2:221\n216#3:109\n217#3:124\n201#3,6:133\n207#3:153\n201#3,6:165\n207#3:185\n216#3:205\n217#3:220\n105#4,14:110\n105#4,14:139\n105#4,14:171\n105#4,14:206\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1\n*L\n33#1:99,10\n33#1:125,2\n40#1:127,6\n40#1:154,5\n46#1:159,6\n46#1:186,5\n50#1:191,14\n50#1:221,2\n33#1:109\n33#1:124\n40#1:133,6\n40#1:153\n46#1:165,6\n46#1:185\n50#1:205\n50#1:220\n33#1:110,14\n40#1:139,14\n46#1:171,14\n50#1:206,14\n*E\n"})
    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f34247p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            StringQualifier facets_url = NaturalAuthModuleKt.getFACETS_URL();
            m1 m1Var = m1.f34314p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(String.class), facets_url, m1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            n1 n1Var = n1.f34318p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(FidoNetworkManager.class), null, n1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            o1 o1Var = o1.f34322p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NaturalAuthenticationPlugin.class), null, o1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            p1 p1Var = p1.f34326p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NaturalAuthEndpoints.class), null, p1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getBiometricAuthenticationModule() {
        return f34245c;
    }

    @NotNull
    public static final StringQualifier getFACETS_URL() {
        return f34243a;
    }

    @NotNull
    public static final Module getNaturalAuthModule() {
        return f34244b;
    }
}
