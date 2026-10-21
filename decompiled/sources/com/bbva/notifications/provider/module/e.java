package com.bbva.notifications.provider.module;

import com.bbva.notifications.GloMoNotificationBodyCreator;
import com.bbva.notifications.GloMoNotificationCreator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationCreatorsModule.kt */
/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nNotificationCreatorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCreatorsModule.kt\ncom/bbva/notifications/provider/module/NotificationCreatorsModuleKt$notificationCreatorsModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,18:1\n129#2,5:19\n*S KotlinDebug\n*F\n+ 1 NotificationCreatorsModule.kt\ncom/bbva/notifications/provider/module/NotificationCreatorsModuleKt$notificationCreatorsModule$1$2\n*L\n15#1:19,5\n*E\n"})
public final class e extends Lambda implements Function2<Scope, ParametersHolder, GloMoNotificationCreator> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e f35457p0 = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final GloMoNotificationCreator invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GloMoNotificationCreator((GloMoNotificationBodyCreator) single.get(Reflection.getOrCreateKotlinClass(GloMoNotificationBodyCreator.class), null, null));
    }
}
