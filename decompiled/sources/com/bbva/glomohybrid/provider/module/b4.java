package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LogModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLogModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogModule.kt\ncom/bbva/glomohybrid/provider/module/LogModuleKt$logModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,27:1\n129#2,5:28\n*S KotlinDebug\n*F\n+ 1 LogModule.kt\ncom/bbva/glomohybrid/provider/module/LogModuleKt$logModule$1$2\n*L\n21#1:28,5\n*E\n"})
public final class b4 extends Lambda implements Function2<Scope, ParametersHolder, CrashlyticsHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b4 f34014p0 = new b4(2);

    @Override // kotlin.jvm.functions.Function2
    public final CrashlyticsHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CrashlyticsHandler((Crashlytics) single.get(Reflection.getOrCreateKotlinClass(Crashlytics.class), null, null));
    }
}
