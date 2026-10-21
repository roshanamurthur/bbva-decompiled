package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.glomohybrid.logs.LoggerKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class z extends Lambda implements Function2<Scope, ParametersHolder, SecureSharing> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z f34214p0 = new z(2);

    @Override // kotlin.jvm.functions.Function2
    public final SecureSharing invoke(Scope scope, ParametersHolder parametersHolder) {
        Object objM5535constructorimpl;
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(new SecureSharing(ModuleExtKt.androidContext(single)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            LoggerKt.logError$default("Failed to initialize SecureSharing. Attempting to reset", thM5538exceptionOrNullimpl, null, 4, null);
            try {
                SecureSharing.INSTANCE.reset(ModuleExtKt.androidContext(single));
            } catch (Exception unused) {
                LoggerKt.logError$default("The shared storage could not be reset", thM5538exceptionOrNullimpl, null, 4, null);
            }
            objM5535constructorimpl = new SecureSharing(ModuleExtKt.androidContext(single));
        }
        return (SecureSharing) objM5535constructorimpl;
    }
}
