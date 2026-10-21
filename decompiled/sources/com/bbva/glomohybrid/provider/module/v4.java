package com.bbva.glomohybrid.provider.module;

import android.content.Context;
import com.bbva.plugin.geolocation.manager.GmsLocator;
import com.bbva.plugin.geolocation.manager.Locator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nMobileServicesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,33:1\n129#2,5:34\n*S KotlinDebug\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$5\n*L\n25#1:34,5\n*E\n"})
public final class v4 extends Lambda implements Function2<Scope, ParametersHolder, Locator> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v4 f34187p0 = new v4(2);

    @Override // kotlin.jvm.functions.Function2
    public final Locator invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GmsLocator((Context) factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
    }
}
