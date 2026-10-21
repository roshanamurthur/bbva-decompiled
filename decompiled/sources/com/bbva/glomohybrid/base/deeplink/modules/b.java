package com.bbva.glomohybrid.base.deeplink.modules;

import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.firebase.analytics.FirebaseAnalyticsManager;
import com.bbva.glomohybrid.base.deeplink.model.DeeplinkConfig;
import com.bbva.glomohybrid.base.deeplink.usecase.DynamicLinkUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: DynamicLinkModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDynamicLinkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicLinkModule.kt\ncom/bbva/glomohybrid/base/deeplink/modules/DynamicLinkModuleKt$loadDynamicLinks$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,42:1\n129#2,5:43\n129#2,5:48\n*S KotlinDebug\n*F\n+ 1 DynamicLinkModule.kt\ncom/bbva/glomohybrid/base/deeplink/modules/DynamicLinkModuleKt$loadDynamicLinks$1$1\n*L\n15#1:43,5\n16#1:48,5\n*E\n"})
public final class b extends Lambda implements Function2<Scope, ParametersHolder, DynamicLinkUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f31281p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final DynamicLinkUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DynamicLinkUseCase(((DeeplinkConfig) factory.get(Reflection.getOrCreateKotlinClass(DeeplinkConfig.class), DynamicLinkModuleKt.getDeeplinkConfig(), null)).getQrConfig().getUrl(), (AppSettingsRepository) factory.get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, null), (FirebaseAnalyticsManager) factory.get(Reflection.getOrCreateKotlinClass(FirebaseAnalyticsManager.class), null, null), null, null, 24, null);
    }
}
