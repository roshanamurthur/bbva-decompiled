package com.bbva.firebase.analytics.module;

import com.bbva.firebase.analytics.DefaultFirebaseAnalyticsManager;
import com.bbva.firebase.analytics.FirebaseAnalyticsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FirebaseAnalyticsModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, FirebaseAnalyticsManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f30673p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final FirebaseAnalyticsManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(ModuleExtKt.androidContext(single));
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        return new DefaultFirebaseAnalyticsManager(firebaseAnalytics);
    }
}
