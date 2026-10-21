package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoutils.mobileservices.craslytics.CrashReporter;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nMobileServicesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,33:1\n129#2,5:34\n*S KotlinDebug\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$2\n*L\n22#1:34,5\n*E\n"})
public final class s4 extends Lambda implements Function2<Scope, ParametersHolder, CrashReporter> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s4 f34163p0 = new s4(2);

    @Override // kotlin.jvm.functions.Function2
    public final CrashReporter invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CrashReporter(ModuleExtKt.androidContext(factory), (Crashlytics) factory.get(Reflection.getOrCreateKotlinClass(Crashlytics.class), null, null));
    }
}
