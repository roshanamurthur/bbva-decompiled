package com.bbva.glomohybrid.provider.modules;

import android.content.SharedPreferences;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.notifications.GloMoNotificationCreator;
import com.bbva.notifications.handlers.CountryGlomoPushHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryPushModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,85:1\n129#2,5:86\n129#2,5:91\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryPushModule$1$1\n*L\n78#1:86,5\n80#1:91,5\n*E\n"})
public final class a extends Lambda implements Function2<Scope, ParametersHolder, CountryGlomoPushHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f34262p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final CountryGlomoPushHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryGlomoPushHandler((GloMoNotificationCreator) single.get(Reflection.getOrCreateKotlinClass(GloMoNotificationCreator.class), null, null), new UserStoredDatasource((SharedPreferences) single.get(Reflection.getOrCreateKotlinClass(SharedPreferences.class), QualifierKt.named(PrefsStorageDataManager.ID), null)));
    }
}
