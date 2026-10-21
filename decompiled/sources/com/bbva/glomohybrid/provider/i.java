package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.process.ProcessScreenTracker;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAppDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$18\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,238:1\n129#2,5:239\n*S KotlinDebug\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$18\n*L\n169#1:239,5\n*E\n"})
public final class i extends Lambda implements Function2<Scope, ParametersHolder, ProcessScreenTracker> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i f33925p0 = new i(2);

    @Override // kotlin.jvm.functions.Function2
    public final ProcessScreenTracker invoke(Scope scope, ParametersHolder parametersHolder) throws MissingAndroidContextException {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ProcessScreenTracker(ModuleExtKt.androidApplication(single), (List) single.get(Reflection.getOrCreateKotlinClass(List.class), QualifierKt.named(ProcessScreenTracker.LAUNCHER_SCREEN_LIST), null));
    }
}
