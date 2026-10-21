package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.login.domain.model.CredentialsViewState;
import com.bbva.glomohybrid.login.domain.usecase.UpdateCredentialsFormStateUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n129#2,5:59\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$5\n*L\n34#1:59,5\n*E\n"})
public final class m4 extends Lambda implements Function2<Scope, ParametersHolder, UpdateCredentialsFormStateUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m4 f34113p0 = new m4(2);

    @Override // kotlin.jvm.functions.Function2
    public final UpdateCredentialsFormStateUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new UpdateCredentialsFormStateUseCase((CredentialsViewState) factory.get(Reflection.getOrCreateKotlinClass(CredentialsViewState.class), null, null));
    }
}
