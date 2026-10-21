package com.bbva.glomohybrid.provider.module;

import com.bbva.notifications.provider.NotificationsProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h5 extends Lambda implements Function2<Scope, ParametersHolder, NotificationsProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h5 f34069p0 = new h5(2);

    @Override // kotlin.jvm.functions.Function2
    public final NotificationsProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NotificationsProvider();
    }
}
