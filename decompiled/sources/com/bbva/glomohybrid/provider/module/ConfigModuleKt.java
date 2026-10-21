package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomoconfig.softtoken.SoftTokenConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
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

/* JADX INFO: compiled from: ConfigModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0014\u0010\n\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "HOST", "Ljava/lang/String;", "GEMA_HOST", "GEMA_PATH", "SINGLE_SIGN_ON_HOST", "SINGLE_SIGN_ON_PATH", "PATHS", "HOST_AEM", "HOST_ONBOARDING", "SOFT_TOKEN_CONFIG", "HOST_VERISHOW", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getConfigModule", "()Lorg/koin/core/module/Module;", "configModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class ConfigModuleKt {

    @NotNull
    public static final String GEMA_HOST = "gema_host";

    @NotNull
    public static final String GEMA_PATH = "gema_path";

    @NotNull
    public static final String HOST = "config_host";

    @NotNull
    public static final String HOST_AEM = "aem_host";

    @NotNull
    public static final String HOST_ONBOARDING = "onboarding_host";

    @NotNull
    public static final String HOST_VERISHOW = "verishow_host";

    @NotNull
    public static final String PATHS = "config_paths";

    @NotNull
    public static final String SINGLE_SIGN_ON_HOST = "single_host";

    @NotNull
    public static final String SINGLE_SIGN_ON_PATH = "single_path";

    @NotNull
    public static final String SOFT_TOKEN_CONFIG = "soft_token_config";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33957a = ModuleDSLKt.module$default(false, a.f33958p0, 1, null);

    /* JADX INFO: compiled from: ConfigModule.kt */
    @SourceDebugExtension({"SMAP\nConfigModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,33:1\n103#2,6:34\n109#2,5:61\n103#2,6:66\n109#2,5:93\n103#2,6:98\n109#2,5:125\n103#2,6:130\n109#2,5:157\n103#2,6:162\n109#2,5:189\n103#2,6:194\n109#2,5:221\n103#2,6:226\n109#2,5:253\n103#2,6:258\n109#2,5:285\n103#2,6:290\n109#2,5:317\n103#2,6:322\n109#2,5:349\n103#2,6:354\n109#2,5:381\n201#3,6:40\n207#3:60\n201#3,6:72\n207#3:92\n201#3,6:104\n207#3:124\n201#3,6:136\n207#3:156\n201#3,6:168\n207#3:188\n201#3,6:200\n207#3:220\n201#3,6:232\n207#3:252\n201#3,6:264\n207#3:284\n201#3,6:296\n207#3:316\n201#3,6:328\n207#3:348\n201#3,6:360\n207#3:380\n105#4,14:46\n105#4,14:78\n105#4,14:110\n105#4,14:142\n105#4,14:174\n105#4,14:206\n105#4,14:238\n105#4,14:270\n105#4,14:302\n105#4,14:334\n105#4,14:366\n*S KotlinDebug\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1\n*L\n21#1:34,6\n21#1:61,5\n22#1:66,6\n22#1:93,5\n23#1:98,6\n23#1:125,5\n24#1:130,6\n24#1:157,5\n25#1:162,6\n25#1:189,5\n26#1:194,6\n26#1:221,5\n27#1:226,6\n27#1:253,5\n28#1:258,6\n28#1:285,5\n29#1:290,6\n29#1:317,5\n30#1:322,6\n30#1:349,5\n31#1:354,6\n31#1:381,5\n21#1:40,6\n21#1:60\n22#1:72,6\n22#1:92\n23#1:104,6\n23#1:124\n24#1:136,6\n24#1:156\n25#1:168,6\n25#1:188\n26#1:200,6\n26#1:220\n27#1:232,6\n27#1:252\n28#1:264,6\n28#1:284\n29#1:296,6\n29#1:316\n30#1:328,6\n30#1:348\n31#1:360,6\n31#1:380\n21#1:46,14\n22#1:78,14\n23#1:110,14\n24#1:142,14\n25#1:174,14\n26#1:206,14\n27#1:238,14\n28#1:270,14\n29#1:302,14\n30#1:334,14\n31#1:366,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33958p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            j2 j2Var = j2.f34084p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(GlobalConfig.class), null, j2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            StringQualifier stringQualifierE = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF, ConfigModuleKt.HOST);
            k2 k2Var = k2.f34093p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierE, k2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            StringQualifier stringQualifierE2 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF2, ConfigModuleKt.PATHS);
            l2 l2Var = l2.f34102p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), stringQualifierE2, l2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            StringQualifier stringQualifierE3 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF3, ConfigModuleKt.HOST_AEM);
            m2 m2Var = m2.f34111p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierE3, m2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            StringQualifier stringQualifierE4 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF4, ConfigModuleKt.HOST_ONBOARDING);
            n2 n2Var = n2.f34120p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Pair.class), stringQualifierE4, n2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            StringQualifier stringQualifierE5 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF5, ConfigModuleKt.SOFT_TOKEN_CONFIG);
            o2 o2Var = o2.f34128p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SoftTokenConfig.class), stringQualifierE5, o2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            StringQualifier stringQualifierE6 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF6, ConfigModuleKt.GEMA_HOST);
            p2 p2Var = p2.f34136p0;
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierE6, p2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            StringQualifier stringQualifierE7 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF7, ConfigModuleKt.GEMA_PATH);
            q2 q2Var = q2.f34144p0;
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierE7, q2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            StringQualifier stringQualifierE8 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF8, ConfigModuleKt.SINGLE_SIGN_ON_HOST);
            r2 r2Var = r2.f34152p0;
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierE8, r2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            StringQualifier stringQualifierE9 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF9, ConfigModuleKt.SINGLE_SIGN_ON_PATH);
            h2 h2Var = h2.f34066p0;
            SingleInstanceFactory<?> singleInstanceFactoryF10 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierE9, h2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF10);
            }
            StringQualifier stringQualifierE10 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF10, ConfigModuleKt.HOST_VERISHOW);
            i2 i2Var = i2.f34075p0;
            SingleInstanceFactory<?> singleInstanceFactoryF11 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierE10, i2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF11);
            }
            new KoinDefinition(module2, singleInstanceFactoryF11);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getConfigModule() {
        return f33957a;
    }
}
