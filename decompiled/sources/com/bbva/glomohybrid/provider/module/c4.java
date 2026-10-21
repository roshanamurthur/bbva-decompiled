package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.glomohybrid.logs.LoggerHandlerGroup;
import com.bbva.glomohybrid.logs.LoggerKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LogModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLogModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogModule.kt\ncom/bbva/glomohybrid/provider/module/LogModuleKt$logModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,27:1\n352#2:28\n*S KotlinDebug\n*F\n+ 1 LogModule.kt\ncom/bbva/glomohybrid/provider/module/LogModuleKt$logModule$1$3\n*L\n24#1:28\n*E\n"})
public final class c4 extends Lambda implements Function2<Scope, ParametersHolder, LoggerHandlerGroup> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c4 f34023p0 = new c4(2);

    @Override // kotlin.jvm.functions.Function2
    public final LoggerHandlerGroup invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new LoggerHandlerGroup(LoggerKt.glomoOrigin, single.getAll(Reflection.getOrCreateKotlinClass(LoggerHandler.class)));
    }
}
