package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenViewModel;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkViewModel;
import com.bbva.glomohybrid.infoscreen.root.RootViewModel;
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

/* JADX INFO: compiled from: InfoViewModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getInfoViewModule", "()Lorg/koin/core/module/Module;", "infoViewModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class InfoViewModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33968a = ModuleDSLKt.module$default(false, a.f33969p0, 1, null);

    /* JADX INFO: compiled from: InfoViewModule.kt */
    @SourceDebugExtension({"SMAP\nInfoViewModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoViewModule.kt\ncom/bbva/glomohybrid/provider/module/InfoViewModuleKt$infoViewModule$1\n+ 2 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt\n+ 3 Module.kt\norg/koin/core/module/Module\n+ 4 Module.kt\norg/koin/core/module/ModuleKt\n+ 5 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,37:1\n39#2:38\n39#2:67\n39#2:96\n39#2:125\n39#2:154\n39#2:183\n151#3,10:39\n161#3,2:65\n151#3,10:68\n161#3,2:94\n151#3,10:97\n161#3,2:123\n151#3,10:126\n161#3,2:152\n151#3,10:155\n161#3,2:181\n151#3,10:184\n161#3,2:210\n216#4:49\n217#4:64\n216#4:78\n217#4:93\n216#4:107\n217#4:122\n216#4:136\n217#4:151\n216#4:165\n217#4:180\n216#4:194\n217#4:209\n105#5,14:50\n105#5,14:79\n105#5,14:108\n105#5,14:137\n105#5,14:166\n105#5,14:195\n*S KotlinDebug\n*F\n+ 1 InfoViewModule.kt\ncom/bbva/glomohybrid/provider/module/InfoViewModuleKt$infoViewModule$1\n*L\n13#1:38\n17#1:67\n21#1:96\n25#1:125\n29#1:154\n33#1:183\n13#1:39,10\n13#1:65,2\n17#1:68,10\n17#1:94,2\n21#1:97,10\n21#1:123,2\n25#1:126,10\n25#1:152,2\n29#1:155,10\n29#1:181,2\n33#1:184,10\n33#1:210,2\n13#1:49\n13#1:64\n17#1:78\n17#1:93\n21#1:107\n21#1:122\n25#1:136\n25#1:151\n29#1:165\n29#1:180\n33#1:194\n33#1:209\n13#1:50,14\n17#1:79,14\n21#1:108,14\n25#1:137,14\n29#1:166,14\n33#1:195,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33969p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            StringQualifier stringQualifierNamed = QualifierKt.named(InfoScreenType.NetworkInfoScreen.INSTANCE.getId());
            i3 i3Var = i3.f34076p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(NetworkViewModel.class), stringQualifierNamed, i3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed2 = QualifierKt.named(InfoScreenType.RootRestrictedScreen.INSTANCE.getId());
            j3 j3Var = j3.f34085p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RootViewModel.class), stringQualifierNamed2, j3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed3 = QualifierKt.named(InfoScreenType.RootNotRestrictedScreen.INSTANCE.getId());
            k3 k3Var = k3.f34094p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RootViewModel.class), stringQualifierNamed3, k3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed4 = QualifierKt.named(InfoScreenType.NotificationErrorInfoScreen.INSTANCE.getId());
            l3 l3Var = l3.f34103p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InfoScreenViewModel.class), stringQualifierNamed4, l3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed5 = QualifierKt.named(InfoScreenType.DeviceActivationInfoScreen.INSTANCE.getId());
            m3 m3Var = m3.f34112p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InfoScreenViewModel.class), stringQualifierNamed5, m3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed6 = QualifierKt.named(InfoScreenType.TimerExpiredRunningStateErrorInfoScreen.INSTANCE.getId());
            n3 n3Var = n3.f34121p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InfoScreenViewModel.class), stringQualifierNamed6, n3Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getInfoViewModule() {
        return f33968a;
    }
}
