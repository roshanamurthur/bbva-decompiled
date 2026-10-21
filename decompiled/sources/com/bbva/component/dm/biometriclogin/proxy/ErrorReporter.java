package com.bbva.component.dm.biometriclogin.proxy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ErrorReporter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/proxy/ErrorReporter;", "", "recordError", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ErrorReporter {
    void recordError(@NotNull Exception exception);
}
