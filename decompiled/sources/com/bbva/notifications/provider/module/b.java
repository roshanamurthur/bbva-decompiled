package com.bbva.notifications.provider.module;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.notifications.delegate.BanxicoUnifiedLogEventDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: BanxicoPushModule.kt */
/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nBanxicoPushModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BanxicoPushModule.kt\ncom/bbva/notifications/provider/module/BanxicoPushModuleKt$banxicoPushModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,34:1\n129#2,5:35\n*S KotlinDebug\n*F\n+ 1 BanxicoPushModule.kt\ncom/bbva/notifications/provider/module/BanxicoPushModuleKt$banxicoPushModule$1$2\n*L\n31#1:35,5\n*E\n"})
public final class b extends Lambda implements Function2<Scope, ParametersHolder, BanxicoUnifiedLogEventDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f35454p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final BanxicoUnifiedLogEventDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new BanxicoUnifiedLogEventDelegate((MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null), null, 2, null);
    }
}
