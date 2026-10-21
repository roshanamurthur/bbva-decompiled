package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.observers.SessionStorageTokenObserver;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: TokenStorageModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nTokenStorageModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenStorageModule.kt\ncom/bbva/glomohybrid/provider/modules/TokenStorageModuleKt$tokenStorageModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,13:1\n129#2,5:14\n*S KotlinDebug\n*F\n+ 1 TokenStorageModule.kt\ncom/bbva/glomohybrid/provider/modules/TokenStorageModuleKt$tokenStorageModule$1$1\n*L\n10#1:14,5\n*E\n"})
public final class h2 extends Lambda implements Function2<Scope, ParametersHolder, SessionStorageTokenObserver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h2 f34295p0 = new h2(2);

    @Override // kotlin.jvm.functions.Function2
    public final SessionStorageTokenObserver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SessionStorageTokenObserver((MainStorage) factory.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null), null, 2, null);
    }
}
