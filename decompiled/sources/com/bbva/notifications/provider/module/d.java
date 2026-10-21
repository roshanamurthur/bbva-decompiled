package com.bbva.notifications.provider.module;

import android.content.Context;
import com.bbva.notifications.GloMoNotificationBodyCreator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationCreatorsModule.kt */
/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nNotificationCreatorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCreatorsModule.kt\ncom/bbva/notifications/provider/module/NotificationCreatorsModuleKt$notificationCreatorsModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,18:1\n129#2,5:19\n*S KotlinDebug\n*F\n+ 1 NotificationCreatorsModule.kt\ncom/bbva/notifications/provider/module/NotificationCreatorsModuleKt$notificationCreatorsModule$1$1\n*L\n11#1:19,5\n*E\n"})
public final class d extends Lambda implements Function2<Scope, ParametersHolder, GloMoNotificationBodyCreator> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f35456p0 = new d(2);

    @Override // kotlin.jvm.functions.Function2
    public final GloMoNotificationBodyCreator invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GloMoNotificationBodyCreator((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
    }
}
