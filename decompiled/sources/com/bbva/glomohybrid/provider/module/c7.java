package com.bbva.glomohybrid.provider.module;

import com.bbva.session.component.SessionTracingInterceptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SessionModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSessionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,35:1\n154#2,5:36\n*S KotlinDebug\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1$1\n*L\n18#1:36,5\n*E\n"})
public final class c7 extends Lambda implements Function2<Scope, ParametersHolder, SessionTracingInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c7 f34026p0 = new c7(2);

    @Override // kotlin.jvm.functions.Function2
    public final SessionTracingInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        String str = (String) single.getOrNull(Reflection.getOrCreateKotlinClass(String.class), SessionModuleKt.getMonitoredSessionHost(), null);
        if (str == null) {
            str = "";
        }
        return new SessionTracingInterceptor(str, null, null, 6, null);
    }
}
