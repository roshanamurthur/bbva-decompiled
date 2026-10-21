package com.bbva.glomohybrid.provider;

import com.bbva.notifications.GloMoLocalNotificationCreator;
import com.bbva.notifications.provider.NotificationBuilderProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$12\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,355:1\n129#2,5:356\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$12\n*L\n221#1:356,5\n*E\n"})
public final class a0 extends Lambda implements Function2<Scope, ParametersHolder, GloMoLocalNotificationCreator> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a0 f33907p0 = new a0(2);

    @Override // kotlin.jvm.functions.Function2
    public final GloMoLocalNotificationCreator invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GloMoLocalNotificationCreator(ModuleExtKt.androidContext(factory), (NotificationBuilderProvider) factory.get(Reflection.getOrCreateKotlinClass(NotificationBuilderProvider.class), null, null));
    }
}
