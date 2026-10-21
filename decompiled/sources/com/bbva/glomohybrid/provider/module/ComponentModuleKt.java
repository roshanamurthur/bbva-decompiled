package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.headers.EtagDataManager;
import com.bbva.glomoconfig.login.configurator.CustomerDataManagerPropertiesDefault;
import java.util.Map;
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

/* JADX INFO: compiled from: ComponentModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getComponentModule", "()Lorg/koin/core/module/Module;", "componentModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class ComponentModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33955a = ModuleDSLKt.module$default(false, a.f33956p0, 1, null);

    /* JADX INFO: compiled from: ComponentModule.kt */
    @SourceDebugExtension({"SMAP\nComponentModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,42:1\n147#2,14:43\n161#2,2:73\n147#2,14:75\n161#2,2:105\n147#2,14:107\n161#2,2:137\n151#2,10:139\n161#2,2:165\n216#3:57\n217#3:72\n216#3:89\n217#3:104\n216#3:121\n217#3:136\n216#3:149\n217#3:164\n105#4,14:58\n105#4,14:90\n105#4,14:122\n105#4,14:150\n*S KotlinDebug\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1\n*L\n14#1:43,14\n14#1:73,2\n21#1:75,14\n21#1:105,2\n25#1:107,14\n25#1:137,2\n32#1:139,10\n32#1:165,2\n14#1:57\n14#1:72\n21#1:89\n21#1:104\n25#1:121\n25#1:136\n32#1:149\n32#1:164\n14#1:58,14\n21#1:90,14\n25#1:122,14\n32#1:150,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33956p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            d2 d2Var = d2.f34030p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(CustomerDataManager.class), null, d2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            e2 e2Var = e2.f34039p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomerDataManagerPropertiesDefault.class), null, e2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            f2 f2Var = f2.f34048p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(EtagDataManager.class), null, f2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed = QualifierKt.named(EtagDataManager.ID);
            g2 g2Var = g2.f34057p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), stringQualifierNamed, g2Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getComponentModule() {
        return f33955a;
    }
}
