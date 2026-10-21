package com.veridas.detect;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DetectorException.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/veridas/detect/FinishDetectorException;", "Lcom/veridas/detect/DetectorException;", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/Throwable;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinishDetectorException extends DetectorException {
    public FinishDetectorException(@Nullable String str) {
        super(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishDetectorException(@NotNull Throwable cause) {
        super(cause.getMessage(), cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
