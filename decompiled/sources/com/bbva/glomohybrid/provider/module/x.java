package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.user.repository.datasource.UserVolatileDataSource;
import com.bbva.localstorage.LocalStorage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class x extends Lambda implements Function2<Scope, ParametersHolder, UserVolatileDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x f34198p0 = new x(2);

    @Override // kotlin.jvm.functions.Function2
    public final UserVolatileDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new UserVolatileDataSource(LocalStorage.INSTANCE.getStorageVolatile());
    }
}
