package com.bbva.glomohybrid.provider.modules;

import android.app.Application;
import android.content.Context;
import com.bbva.appsflyer.AppsFlyerController;
import com.bbva.glomohybrid.BuildConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ShortcutModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nShortcutModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt$shortcutModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,36:1\n129#2,5:37\n*S KotlinDebug\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt$shortcutModule$1$3\n*L\n29#1:37,5\n*E\n"})
public final class c2 extends Lambda implements Function2<Scope, ParametersHolder, AppsFlyerController> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c2 f34273p0 = new c2(2);

    @Override // kotlin.jvm.functions.Function2
    public final AppsFlyerController invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Application");
        return new AppsFlyerController((Application) obj, BuildConfig.APPSFLYER_KEY);
    }
}
