package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ConfigModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nConfigModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,33:1\n129#2,5:34\n*S KotlinDebug\n*F\n+ 1 ConfigModule.kt\ncom/bbva/glomohybrid/provider/module/ConfigModuleKt$configModule$1$5\n*L\n25#1:34,5\n*E\n"})
public final class n2 extends Lambda implements Function2<Scope, ParametersHolder, Pair<? extends String, ? extends String>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n2 f34120p0 = new n2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Pair<? extends String, ? extends String> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        return ((GlobalConfig) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", GlobalConfig.class), null, null)).getOnboarding();
    }
}
