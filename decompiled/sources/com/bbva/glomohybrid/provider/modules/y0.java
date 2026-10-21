package com.bbva.glomohybrid.provider.modules;

import android.app.Application;
import android.content.Context;
import com.bbva.component.dm.akamai.interceptor.AkamaiInterceptorDataManager;
import com.bbva.network.NetworkWorker;
import java.util.Map;
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

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n129#2,5:300\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$3\n*L\n52#1:295,5\n54#1:300,5\n*E\n"})
public final class y0 extends Lambda implements Function2<Scope, ParametersHolder, AkamaiInterceptorDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y0 f34359p0 = new y0(2);

    @Override // kotlin.jvm.functions.Function2
    public final AkamaiInterceptorDataManager invoke(Scope scope, ParametersHolder parametersHolder) throws MissingAndroidContextException {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        NetworkWorker networkWorker = (NetworkWorker) single.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null);
        Context contextAndroidContext = ModuleExtKt.androidContext(single);
        Intrinsics.checkNotNull(contextAndroidContext, "null cannot be cast to non-null type android.app.Application");
        AkamaiInterceptorDataManager akamaiInterceptorDataManager = new AkamaiInterceptorDataManager(networkWorker, (Application) contextAndroidContext);
        akamaiInterceptorDataManager.setProperties((Map) single.get(Reflection.getOrCreateKotlinClass(Map.class), QualifierKt.named(akamaiInterceptorDataManager.getF28076q0()), null));
        return akamaiInterceptorDataManager;
    }
}
