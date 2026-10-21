package com.bbva.glomohybrid.provider.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.bbva.glomohybrid.login.data.repository.LegacyDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LegacyDataModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f1 extends Lambda implements Function2<Scope, ParametersHolder, LegacyDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f1 f34286p0 = new f1(2);

    @Override // kotlin.jvm.functions.Function2
    public final LegacyDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(ModuleExtKt.androidContext(single));
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        return new LegacyDataSource(defaultSharedPreferences);
    }
}
