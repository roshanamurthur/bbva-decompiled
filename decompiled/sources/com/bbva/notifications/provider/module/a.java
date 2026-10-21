package com.bbva.notifications.provider.module;

import android.content.Context;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.notifications.R;
import com.bbva.notifications.delegate.LogEventDelegate;
import com.bbva.notifications.handlers.BanxicoPushHandler;
import com.bbva.notifications.provider.BanxicoNotificationProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: BanxicoPushModule.kt */
/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nBanxicoPushModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BanxicoPushModule.kt\ncom/bbva/notifications/provider/module/BanxicoPushModuleKt$banxicoPushModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,34:1\n129#2,5:35\n129#2,5:40\n129#2,5:45\n129#2,5:50\n129#2,5:55\n*S KotlinDebug\n*F\n+ 1 BanxicoPushModule.kt\ncom/bbva/notifications/provider/module/BanxicoPushModuleKt$banxicoPushModule$1$1\n*L\n17#1:35,5\n20#1:40,5\n21#1:45,5\n24#1:50,5\n25#1:55,5\n*E\n"})
public final class a extends Lambda implements Function2<Scope, ParametersHolder, BanxicoPushHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f35453p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final BanxicoPushHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = (Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        String string = ModuleExtKt.androidContext(single).getString(R.string.notification_codi_handler_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        MainStorage mainStorage = (MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null);
        LogEventDelegate logEventDelegate = (LogEventDelegate) single.get(Reflection.getOrCreateKotlinClass(LogEventDelegate.class), null, null);
        String string2 = ModuleExtKt.androidContext(single).getString(R.string.notification_codi_channel_id);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new BanxicoPushHandler(context, string, null, mainStorage, logEventDelegate, new BanxicoNotificationProvider(string2, (MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null), (LogEventDelegate) single.get(Reflection.getOrCreateKotlinClass(LogEventDelegate.class), null, null)));
    }
}
