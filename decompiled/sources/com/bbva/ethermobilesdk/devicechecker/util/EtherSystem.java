package com.bbva.ethermobilesdk.devicechecker.util;

import com.bbva.ethermobile.help.kit.result.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/util/EtherSystem;", "", "()V", "loadLibrary", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "name", "", "loadLibrary$devicechecker_release", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EtherSystem {

    @NotNull
    public static final EtherSystem INSTANCE = new EtherSystem();

    @NotNull
    public final Result<Unit> loadLibrary$devicechecker_release(@NotNull String name) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            System.loadLibrary(name);
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Unit.INSTANCE));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }
}
