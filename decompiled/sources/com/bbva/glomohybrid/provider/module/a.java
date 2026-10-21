package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.file.constants.FileConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ActionLauncherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f34000p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return androidx.camera.camera2.internal.compat.u.f(ModuleExtKt.androidContext(single).getPackageName(), FileConstants.FILE_PROVIDER_SUFFIX);
    }
}
