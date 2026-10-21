package com.bbva.notifications.provider;

import com.bbva.notifications.mapper.GlobalSalesforceDeeplinkInfoMapper;
import com.bbva.notifications.mapper.SalesforceDeeplinkInfoMapper;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SalesforcePushModule.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, SalesforceDeeplinkInfoMapper> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f35445p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final SalesforceDeeplinkInfoMapper invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GlobalSalesforceDeeplinkInfoMapper();
    }
}
