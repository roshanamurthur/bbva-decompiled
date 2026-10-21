package com.bbva.glomohybrid.provider.modules;

import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CrontoManagerModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends Lambda implements Function2<Scope, ParametersHolder, DigipassManagerHelper> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e0 f34279p0 = new e0(2);

    @Override // kotlin.jvm.functions.Function2
    public final DigipassManagerHelper invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return DigipassManagerHelper.INSTANCE.getInstance();
    }
}
