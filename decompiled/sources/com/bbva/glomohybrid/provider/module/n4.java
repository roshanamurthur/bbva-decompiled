package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator;
import com.bbva.glomohybrid.login.domain.model.CredentialsViewState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$6\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n129#2,5:59\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$6\n*L\n35#1:59,5\n*E\n"})
public final class n4 extends Lambda implements Function2<Scope, ParametersHolder, CredentialsViewState> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n4 f34122p0 = new n4(2);

    @Override // kotlin.jvm.functions.Function2
    public final CredentialsViewState invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CredentialsViewState(ModuleExtKt.androidContext(single), (FormLoginConfigurator) single.get(Reflection.getOrCreateKotlinClass(FormLoginConfigurator.class), null, null));
    }
}
