package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ConfigModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nConfigModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1$7\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,33:1\n129#2,5:34\n*S KotlinDebug\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1$7\n*L\n27#1:34,5\n*E\n"})
public final class p2 extends Lambda implements Function2<Scope, ParametersHolder, String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p2 f34136p0 = new p2(2);

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        String gemaHost = ((GlobalConfig) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", GlobalConfig.class), null, null)).getGemaHost();
        return gemaHost == null ? "" : gemaHost;
    }
}
