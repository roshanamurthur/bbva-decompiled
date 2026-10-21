package com.bbva.glomohybrid.provider.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends Lambda implements Function2<Scope, ParametersHolder, SharedPreferences> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y f34206p0 = new y(2);

    @Override // kotlin.jvm.functions.Function2
    public final SharedPreferences invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferenceManager.getDefaultSharedPreferences(ModuleExtKt.androidContext(single));
    }
}
