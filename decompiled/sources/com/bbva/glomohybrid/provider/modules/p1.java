package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.naturalauth.domain.model.Endpoint;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.glomoconfig.GlobalConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1$4\n*L\n51#1:99,5\n*E\n"})
public final class p1 extends Lambda implements Function2<Scope, ParametersHolder, NaturalAuthEndpoints> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p1 f34326p0 = new p1(2);

    @Override // kotlin.jvm.functions.Function2
    public final NaturalAuthEndpoints invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        GlobalConfig globalConfig = (GlobalConfig) scope2.get(androidx.activity.a.f(scope2, "$this$factory", parametersHolder, "it", GlobalConfig.class), null, null);
        String host = globalConfig.getHost();
        String strNamedPath = globalConfig.namedPath("customerSubPath");
        String strNamedPath2 = globalConfig.namedPath("login");
        String strF = androidx.camera.camera2.internal.compat.u.f(strNamedPath, "/device-biometrics/v1");
        return new NaturalAuthEndpoints(new Endpoint.Post(host, androidx.camera.camera2.internal.compat.u.f(strF, "/enrollments")), new Endpoint.Post(host, androidx.camera.camera2.internal.compat.u.f(strF, "/enrollments/finalize")), new Endpoint.Get(host, androidx.camera.camera2.internal.compat.u.f(strF, "/enrollments")), new Endpoint.Delete(host, androidx.camera.camera2.internal.compat.u.f(strF, "/enrollments")), new Endpoint.Post(host, strNamedPath2), new Endpoint.Post(host, strNamedPath2));
    }
}
