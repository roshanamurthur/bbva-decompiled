package com.bbva.glomohybrid.provider.module;

import com.bbva.actionlauncher.model.PlatformType;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class u4 extends Lambda implements Function2<Scope, ParametersHolder, PlatformType> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u4 f34179p0 = new u4(2);

    @Override // kotlin.jvm.functions.Function2
    public final PlatformType invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return PlatformType.GMS;
    }
}
