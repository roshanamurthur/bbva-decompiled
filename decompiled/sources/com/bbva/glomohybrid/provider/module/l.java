package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.settings.NetworkSpeedAppSettingsObserver;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppSettingsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAppSettingsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsModule.kt\ncom/bbva/glomohybrid/provider/module/AppSettingsModuleKt$appSettingsModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,26:1\n129#2,5:27\n*S KotlinDebug\n*F\n+ 1 AppSettingsModule.kt\ncom/bbva/glomohybrid/provider/module/AppSettingsModuleKt$appSettingsModule$1$3\n*L\n23#1:27,5\n*E\n"})
public final class l extends Lambda implements Function2<Scope, ParametersHolder, NetworkSpeedAppSettingsObserver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l f34099p0 = new l(2);

    @Override // kotlin.jvm.functions.Function2
    public final NetworkSpeedAppSettingsObserver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NetworkSpeedAppSettingsObserver((NetworkWorker) factory.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
    }
}
