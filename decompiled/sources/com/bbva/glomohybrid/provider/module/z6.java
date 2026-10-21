package com.bbva.glomohybrid.provider.module;

import com.bbva.notifications.GloMoNotificationCreator;
import com.bbva.notifications.handlers.GlomoPushHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PushesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPushesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushesModule.kt\ncom/bbva/glomohybrid/provider/module/PushesModuleKt$pushesModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,25:1\n129#2,5:26\n*S KotlinDebug\n*F\n+ 1 PushesModule.kt\ncom/bbva/glomohybrid/provider/module/PushesModuleKt$pushesModule$1$1\n*L\n14#1:26,5\n*E\n"})
public final class z6 extends Lambda implements Function2<Scope, ParametersHolder, GlomoPushHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z6 f34221p0 = new z6(2);

    @Override // kotlin.jvm.functions.Function2
    public final GlomoPushHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GlomoPushHandler((GloMoNotificationCreator) single.get(Reflection.getOrCreateKotlinClass(GloMoNotificationCreator.class), null, null));
    }
}
