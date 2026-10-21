package com.bbva.glomohybrid.provider.module;

import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.glomohybrid.BuildConfig;
import com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsNativeObserver;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nFeatureFlagsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$9\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n129#2,5:49\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$9\n*L\n45#1:49,5\n*E\n"})
public final class e3 extends Lambda implements Function2<Scope, ParametersHolder, FeatureFlagsNativeObserver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e3 f34040p0 = new e3(2);

    @Override // kotlin.jvm.functions.Function2
    public final FeatureFlagsNativeObserver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FeatureFlagsNativeObserver(BuildConfig.VERSION_NAME, (FeatureFlagManager) factory.get(Reflection.getOrCreateKotlinClass(FeatureFlagManager.class), null, null));
    }
}
