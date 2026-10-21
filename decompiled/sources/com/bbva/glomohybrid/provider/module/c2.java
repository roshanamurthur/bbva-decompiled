package com.bbva.glomohybrid.provider.module;

import android.app.Application;
import com.bbva.bridge.core.WebProfileLoader;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.glomohybrid.App;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$webHelperModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$webHelperModule$1$1\n*L\n295#1:299,5\n*E\n"})
public final class c2 extends Lambda implements Function2<Scope, ParametersHolder, WebProfileLoader> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c2 f34021p0 = new c2(2);

    @Override // kotlin.jvm.functions.Function2
    public final WebProfileLoader invoke(Scope scope, ParametersHolder parametersHolder) throws MissingAndroidContextException {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Application applicationAndroidApplication = ModuleExtKt.androidApplication(single);
        Intrinsics.checkNotNull(applicationAndroidApplication, "null cannot be cast to non-null type com.bbva.glomohybrid.App");
        return new WebProfileLoader((WebViewBuilder) single.get(Reflection.getOrCreateKotlinClass(WebViewBuilder.class), null, null), ((App) applicationAndroidApplication).getAppLifecycle());
    }
}
