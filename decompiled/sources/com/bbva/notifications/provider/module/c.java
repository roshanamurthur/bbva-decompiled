package com.bbva.notifications.provider.module;

import com.bbva.notifications.delegate.MenuVisualPushDataProcessorDelegate;
import com.bbva.notifications.delegate.PushDataProcessorDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NonPreProcessedNotificationModule.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends Lambda implements Function2<Scope, ParametersHolder, PushDataProcessorDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f35455p0 = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final PushDataProcessorDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MenuVisualPushDataProcessorDelegate();
    }
}
