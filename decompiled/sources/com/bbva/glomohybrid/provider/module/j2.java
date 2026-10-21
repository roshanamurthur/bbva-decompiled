package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomohybrid.provider.environment.EnvironmentReader;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ConfigModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j2 extends Lambda implements Function2<Scope, ParametersHolder, GlobalConfig> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j2 f34084p0 = new j2(2);

    @Override // kotlin.jvm.functions.Function2
    public final GlobalConfig invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new EnvironmentReader(ModuleExtKt.androidContext(single)).getEnvironment();
    }
}
