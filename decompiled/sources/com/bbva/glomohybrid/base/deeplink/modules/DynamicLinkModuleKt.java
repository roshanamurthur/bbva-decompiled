package com.bbva.glomohybrid.base.deeplink.modules;

import androidx.appcompat.app.i;
import com.bbva.glomohybrid.base.deeplink.model.DeeplinkConfig;
import com.bbva.glomohybrid.base.deeplink.usecase.DynamicLinkUseCase;
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

/* JADX INFO: compiled from: DynamicLinkModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a>\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004\"\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lorg/koin/core/module/Module;", "loadDynamicLinks", "", "schemeResId", "", "path", "url", "googleAssistantSchemeResId", "googleAssistantPath", "modoHostResId", "notificationDeepLinkId", "loadDeeplinks", "Lorg/koin/core/qualifier/StringQualifier;", "a", "Lorg/koin/core/qualifier/StringQualifier;", "getDeeplinkConfig", "()Lorg/koin/core/qualifier/StringQualifier;", "DeeplinkConfig", "Base_release"}, k = 2, mv = {1, 9, 0})
public final class DynamicLinkModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StringQualifier f31267a = QualifierKt.named("deeplinkConfig");

    /* JADX INFO: compiled from: DynamicLinkModule.kt */
    @SourceDebugExtension({"SMAP\nDynamicLinkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicLinkModule.kt\ncom/bbva/glomohybrid/base/deeplink/modules/DynamicLinkModuleKt$loadDeeplinks$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,42:1\n103#2,6:43\n109#2,5:70\n201#3,6:49\n207#3:69\n105#4,14:55\n*S KotlinDebug\n*F\n+ 1 DynamicLinkModule.kt\ncom/bbva/glomohybrid/base/deeplink/modules/DynamicLinkModuleKt$loadDeeplinks$1\n*L\n29#1:43,6\n29#1:70,5\n29#1:49,6\n29#1:69\n29#1:55,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f31268p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f31269q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f31270r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f31271s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f31272t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f31273u0;
        public final /* synthetic */ String v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, String str2, int i11, String str3, int i12, String str4) {
            super(1);
            this.f31268p0 = i10;
            this.f31269q0 = str;
            this.f31270r0 = str2;
            this.f31271s0 = i11;
            this.f31272t0 = str3;
            this.f31273u0 = i12;
            this.v0 = str4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            StringQualifier deeplinkConfig = DynamicLinkModuleKt.getDeeplinkConfig();
            com.bbva.glomohybrid.base.deeplink.modules.a aVar = new com.bbva.glomohybrid.base.deeplink.modules.a(this.f31268p0, this.f31269q0, this.f31270r0, this.f31271s0, this.f31272t0, this.f31273u0, this.v0);
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeeplinkConfig.class), deeplinkConfig, aVar, Kind.Singleton, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DynamicLinkModule.kt */
    @SourceDebugExtension({"SMAP\nDynamicLinkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicLinkModule.kt\ncom/bbva/glomohybrid/base/deeplink/modules/DynamicLinkModuleKt$loadDynamicLinks$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,42:1\n147#2,14:43\n161#2,2:73\n216#3:57\n217#3:72\n105#4,14:58\n*S KotlinDebug\n*F\n+ 1 DynamicLinkModule.kt\ncom/bbva/glomohybrid/base/deeplink/modules/DynamicLinkModuleKt$loadDynamicLinks$1\n*L\n14#1:43,14\n14#1:73,2\n14#1:57\n14#1:72\n14#1:58,14\n*E\n"})
    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31274p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            com.bbva.glomohybrid.base.deeplink.modules.b bVar = com.bbva.glomohybrid.base.deeplink.modules.b.f31281p0;
            new KoinDefinition(module2, i.e(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DynamicLinkUseCase.class), null, bVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final StringQualifier getDeeplinkConfig() {
        return f31267a;
    }

    @NotNull
    public static final Module loadDeeplinks(int i10, @NotNull String path, @NotNull String url, int i11, @NotNull String googleAssistantPath, int i12, @NotNull String notificationDeepLinkId) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(googleAssistantPath, "googleAssistantPath");
        Intrinsics.checkNotNullParameter(notificationDeepLinkId, "notificationDeepLinkId");
        return ModuleDSLKt.module$default(false, new a(i10, url, path, i11, googleAssistantPath, i12, notificationDeepLinkId), 1, null);
    }

    @NotNull
    public static final Module loadDynamicLinks() {
        return ModuleDSLKt.module$default(false, b.f31274p0, 1, null);
    }
}
