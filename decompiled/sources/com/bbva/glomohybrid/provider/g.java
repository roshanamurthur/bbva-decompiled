package com.bbva.glomohybrid.provider;

import android.content.SharedPreferences;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAppDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$16\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,238:1\n129#2,5:239\n*S KotlinDebug\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$16\n*L\n161#1:239,5\n*E\n"})
public final class g extends Lambda implements Function2<Scope, ParametersHolder, UserStoredDatasource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g f33921p0 = new g(2);

    @Override // kotlin.jvm.functions.Function2
    public final UserStoredDatasource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new UserStoredDatasource((SharedPreferences) single.get(Reflection.getOrCreateKotlinClass(SharedPreferences.class), QualifierKt.named(PrefsStorageDataManager.ID), null));
    }
}
