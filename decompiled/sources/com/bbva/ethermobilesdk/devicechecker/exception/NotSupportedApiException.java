package com.bbva.ethermobilesdk.devicechecker.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotSupportedApiException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/exception/NotSupportedApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NotSupportedApiException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public NotSupportedApiException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NotSupportedApiException(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "API not available for current Android version" : str);
    }

    public NotSupportedApiException(@Nullable String str) {
        super(str);
    }
}
