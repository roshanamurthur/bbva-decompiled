package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.inappupdate.GoogleInAppUpdatesHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InAppUpdateModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f3 extends Lambda implements Function2<Scope, ParametersHolder, InAppUpdatesHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f3 f34049p0 = new f3(2);

    @Override // kotlin.jvm.functions.Function2
    public final InAppUpdatesHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GoogleInAppUpdatesHandler(ModuleExtKt.androidContext(single));
    }
}
