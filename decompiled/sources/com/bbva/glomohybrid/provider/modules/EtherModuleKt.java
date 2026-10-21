package com.bbva.glomohybrid.provider.modules;

import com.bbva.ethermobilesdk.deviceuid.DeviceUID;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import kotlin.Lazy;
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

/* JADX INFO: compiled from: EtherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "a", "Lorg/koin/core/qualifier/StringQualifier;", "getKOIN_EXTERNAL_DEVICE_ID_NAME", "()Lorg/koin/core/qualifier/StringQualifier;", "KOIN_EXTERNAL_DEVICE_ID_NAME", "", "ETHER_SHARED_STORAGE_GROUP", "Ljava/lang/String;", "Lorg/koin/core/module/Module;", "b", "Lorg/koin/core/module/Module;", "getEtherModule", "()Lorg/koin/core/module/Module;", "etherModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class EtherModuleKt {

    @NotNull
    public static final String ETHER_SHARED_STORAGE_GROUP = "com.bbva.mx.storage.shared";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StringQualifier f34234a = QualifierKt.named("externalDeviceId");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Module f34235b = ModuleDSLKt.module$default(false, a.f34236p0, 1, null);

    /* JADX INFO: compiled from: EtherModule.kt */
    @SourceDebugExtension({"SMAP\nEtherModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherModule.kt\ncom/bbva/glomohybrid/provider/modules/EtherModuleKt$etherModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,32:1\n103#2,6:33\n109#2,5:60\n151#2,10:65\n161#2,2:91\n103#2,6:93\n109#2,5:120\n201#3,6:39\n207#3:59\n216#3:75\n217#3:90\n201#3,6:99\n207#3:119\n105#4,14:45\n105#4,14:76\n105#4,14:105\n*S KotlinDebug\n*F\n+ 1 EtherModule.kt\ncom/bbva/glomohybrid/provider/modules/EtherModuleKt$etherModule$1\n*L\n15#1:33,6\n15#1:60,5\n19#1:65,10\n19#1:91,2\n23#1:93,6\n23#1:120,5\n15#1:39,6\n15#1:59\n19#1:75\n19#1:90\n23#1:99,6\n23#1:119\n15#1:45,14\n19#1:76,14\n23#1:105,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34236p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            g0 g0Var = g0.f34289p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DeviceUID.class), null, g0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            StringQualifier koin_external_device_id_name = EtherModuleKt.getKOIN_EXTERNAL_DEVICE_ID_NAME();
            i0 i0Var = i0.f34297p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Lazy.class), koin_external_device_id_name, i0Var, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2));
            j0 j0Var = j0.f34301p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NaturalAuthentication.class), null, j0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getEtherModule() {
        return f34235b;
    }

    @NotNull
    public static final StringQualifier getKOIN_EXTERNAL_DEVICE_ID_NAME() {
        return f34234a;
    }
}
