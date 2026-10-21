package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobile.elogger.DefaultLoggerHandler;
import com.bbva.ethermobile.elogger.p000default.LocalTracer;
import com.bbva.ethermobile.elogger.p000default.LocalTracerConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LogModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a4 extends Lambda implements Function2<Scope, ParametersHolder, DefaultLoggerHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a4 f34005p0 = new a4(2);

    @Override // kotlin.jvm.functions.Function2
    public final DefaultLoggerHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DefaultLoggerHandler(new LocalTracer(new LocalTracerConfig("default", true)));
    }
}
