package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomoconfig.softtoken.SoftTokenConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ConfigModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nConfigModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1$6\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,33:1\n129#2,5:34\n*S KotlinDebug\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1$6\n*L\n26#1:34,5\n*E\n"})
public final class o2 extends Lambda implements Function2<Scope, ParametersHolder, SoftTokenConfig> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o2 f34128p0 = new o2(2);

    @Override // kotlin.jvm.functions.Function2
    public final SoftTokenConfig invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        return ((GlobalConfig) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", GlobalConfig.class), null, null)).getSoftTokenConfig();
    }
}
