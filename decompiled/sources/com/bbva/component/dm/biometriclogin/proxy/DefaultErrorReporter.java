package com.bbva.component.dm.biometriclogin.proxy;

import com.bbva.glomohybrid.logs.LoggerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ErrorReporter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/proxy/DefaultErrorReporter;", "Lcom/bbva/component/dm/biometriclogin/proxy/ErrorReporter;", "()V", "recordError", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultErrorReporter implements ErrorReporter {
    @Override // com.bbva.component.dm.biometriclogin.proxy.ErrorReporter
    public void recordError(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        LoggerKt.logError$default("fido-exception", exception, null, 4, null);
    }
}
