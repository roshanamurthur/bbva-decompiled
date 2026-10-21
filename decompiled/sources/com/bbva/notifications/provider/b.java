package com.bbva.notifications.provider;

import android.content.Context;
import com.bbva.notifications.handlers.SalesforcePushHandlerProvider;
import com.bbva.notifications.mapper.SalesforceDeeplinkInfoMapper;
import com.bbva.notifications.model.NotificationsProviderConfig;
import com.bbva.push.salesforce.SalesforcePushHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SalesforcePushModule.kt */
/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nSalesforcePushModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesforcePushModule.kt\ncom/bbva/notifications/provider/SalesforcePushModuleKt$salesforcePushModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,18:1\n129#2,5:19\n*S KotlinDebug\n*F\n+ 1 SalesforcePushModule.kt\ncom/bbva/notifications/provider/SalesforcePushModuleKt$salesforcePushModule$1$2\n*L\n15#1:19,5\n*E\n"})
public final class b extends Lambda implements Function2<Scope, ParametersHolder, SalesforcePushHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f35446p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final SalesforcePushHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SalesforcePushHandlerProvider((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (NotificationsProviderConfig) single.get(Reflection.getOrCreateKotlinClass(NotificationsProviderConfig.class), null, null), (SalesforceDeeplinkInfoMapper) single.get(Reflection.getOrCreateKotlinClass(SalesforceDeeplinkInfoMapper.class), null, null)).provideSalesforceHandler();
    }
}
