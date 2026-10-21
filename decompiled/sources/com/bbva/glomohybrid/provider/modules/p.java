package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.provider.CountryNotificationChannelsProvider;
import com.bbva.notifications.NotificationChannelCreator;
import com.bbva.notifications.interfaces.ChannelCreator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryNotificationChannelCreatorModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryNotificationChannelCreatorModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryNotificationChannelCreatorModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryNotificationChannelCreatorModuleKt$notificationChannelCreatorModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,18:1\n129#2,5:19\n*S KotlinDebug\n*F\n+ 1 CountryNotificationChannelCreatorModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryNotificationChannelCreatorModuleKt$notificationChannelCreatorModule$1$2\n*L\n14#1:19,5\n*E\n"})
public final class p extends Lambda implements Function2<Scope, ParametersHolder, ChannelCreator> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p f34324p0 = new p(2);

    @Override // kotlin.jvm.functions.Function2
    public final ChannelCreator invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NotificationChannelCreator(ModuleExtKt.androidApplication(single), ((CountryNotificationChannelsProvider) single.get(Reflection.getOrCreateKotlinClass(CountryNotificationChannelsProvider.class), null, null)).getChannels());
    }
}
