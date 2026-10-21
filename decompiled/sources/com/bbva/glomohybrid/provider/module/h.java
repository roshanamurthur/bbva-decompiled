package com.bbva.glomohybrid.provider.module;

import android.content.Context;
import com.bancomer.mbanking.R;
import com.bbva.plugin.analyticsdata.AnalyticsDataPlugin;
import com.bbva.plugin.analyticsdata.AnalyticsSourceConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AnalyticsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,64:1\n129#2,5:65\n*S KotlinDebug\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$4\n*L\n55#1:65,5\n*E\n"})
public final class h extends Lambda implements Function2<Scope, ParametersHolder, AnalyticsDataPlugin> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h f34063p0 = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final AnalyticsDataPlugin invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = (Context) factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        String string = ModuleExtKt.androidContext(factory).getString(R.string.adobe_marketing_key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AnalyticsDataPlugin(context, new AnalyticsSourceConfig.Identifier(string));
    }
}
