package com.bbva.glomohybrid.provider.module;

import com.bancomer.mbanking.R;
import com.bbva.notifications.model.NotificationsProviderConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g5 extends Lambda implements Function2<Scope, ParametersHolder, NotificationsProviderConfig> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g5 f34060p0 = new g5(2);

    @Override // kotlin.jvm.functions.Function2
    public final NotificationsProviderConfig invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        String string = ModuleExtKt.androidContext(single).getString(R.string.salesforce_app_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = ModuleExtKt.androidContext(single).getString(R.string.salesforce_access_token);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = ModuleExtKt.androidContext(single).getString(R.string.salesforce_server_url);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = ModuleExtKt.androidContext(single).getString(R.string.salesforce_mid);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return new NotificationsProviderConfig(string, string2, string3, string4);
    }
}
