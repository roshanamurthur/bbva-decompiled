package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.base.behaviors.HandlerShortcutBehaviour;
import com.bbva.glomohybrid.shortcuts.CountryShortcutHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ShortcutModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b2 extends Lambda implements Function2<Scope, ParametersHolder, HandlerShortcutBehaviour> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b2 f34269p0 = new b2(2);

    @Override // kotlin.jvm.functions.Function2
    public final HandlerShortcutBehaviour invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryShortcutHandler();
    }
}
