package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.session.observers.CrashlyticsTokenObserver;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SessionModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSessionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,35:1\n129#2,5:36\n*S KotlinDebug\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1$2\n*L\n22#1:36,5\n*E\n"})
public final class d7 extends Lambda implements Function2<Scope, ParametersHolder, CrashlyticsTokenObserver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d7 f34035p0 = new d7(2);

    @Override // kotlin.jvm.functions.Function2
    public final CrashlyticsTokenObserver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CrashlyticsTokenObserver((Crashlytics) factory.get(Reflection.getOrCreateKotlinClass(Crashlytics.class), null, null));
    }
}
