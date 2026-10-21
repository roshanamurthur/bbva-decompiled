package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.initializers.HttpClientFactory;
import java.net.CookieHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNetworkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt$networkModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n*S KotlinDebug\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt$networkModule$1$2\n*L\n40#1:111,5\n*E\n"})
public final class z4 extends Lambda implements Function2<Scope, ParametersHolder, OkHttpClient> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z4 f34219p0 = new z4(2);

    @Override // kotlin.jvm.functions.Function2
    public final OkHttpClient invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return HttpClientFactory.INSTANCE.create((CookieHandler) factory.get(Reflection.getOrCreateKotlinClass(CookieHandler.class), null, null));
    }
}
