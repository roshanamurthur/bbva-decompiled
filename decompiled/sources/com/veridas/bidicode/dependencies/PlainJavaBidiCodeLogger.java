package com.veridas.bidicode.dependencies;

import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlainJavaBidiCodeLogger.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/bidicode/dependencies/PlainJavaBidiCodeLogger;", "Lcom/veridas/bidicode/dependencies/BidiCodeLogger;", "()V", LogKeysKt.LOG, "", "message", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlainJavaBidiCodeLogger implements BidiCodeLogger {
    @Override // com.veridas.bidicode.dependencies.BidiCodeLogger
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println((Object) message);
    }
}
